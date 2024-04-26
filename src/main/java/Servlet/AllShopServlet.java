package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SelectShopDAO;
import entity.ProductMessage;

@WebServlet("/jsp/all")
public class AllShopServlet extends HttpServlet{
	SelectShopDAO dao = new SelectShopDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String seleval = req.getParameter("seleval");
		String seleor = req.getParameter("seleor");
		List<ProductMessage> prolist = null;

		if (seleval != null && !seleval.isEmpty()) {
		    if (seleval.equals("所有商品")) {
		        prolist = dao.seleAll();
		    } else {
		        prolist = dao.seleType(seleval);
		    }
		} else {
		    prolist = dao.seleAll();
		}

		if (seleor != null && !seleor.isEmpty()) {
		    if (seleor.equals("默认排序")) {
		    } else if(seleor.equals("价格由高到低")){
		        prolist = dao.seleGao();
		    } else if(seleor.equals("价格由低到高")){
		        prolist = dao.seleDi();
		    } else if(seleor.equals("最新上架")){
		        prolist = dao.seleNew();
		    }
		}




	    List<String> imgUrls = new ArrayList<>();
	    List<String> proNames = new ArrayList<>();
	    List<String> prices = new ArrayList<>();
	    for(ProductMessage p : prolist) {
	           // 将每个产品的图像 URL、产品名称和价格添加到对应的列表中
	           imgUrls.add(p.getImageUrl());
	           proNames.add(p.getProName());
	           prices.add(p.getPrice().toString());
	    }
	        
	    // 将列表设置为请求属性
	    req.setAttribute("imgUrls", imgUrls);
	    req.setAttribute("proNames", proNames);
	    req.setAttribute("prices", prices);
	    req.setAttribute("prolist", prolist);
	    req.setAttribute("seleval", seleval);
	    req.setAttribute("seleor", seleor);
	    req.getRequestDispatcher("AllShop.jsp").forward(req, resp);
	}
}
