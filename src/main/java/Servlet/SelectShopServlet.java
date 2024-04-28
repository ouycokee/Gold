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

@WebServlet("/jsp/select")
public class SelectShopServlet extends HttpServlet{
    SelectShopDAO dao = new SelectShopDAO();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pname = req.getParameter("pname");
        List<ProductMessage> count = dao.seleCount(pname);
        List<ProductMessage> prolist = dao.seleNr(pname);
        
        // 创建列表来保存产品信息
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
        req.setAttribute("count", count);
        req.getRequestDispatcher("SelectShop.jsp").forward(req, resp);
    }
}
