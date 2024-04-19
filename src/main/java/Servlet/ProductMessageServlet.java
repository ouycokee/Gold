package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PriceDAO;
import DAO.ProductMessageDAO;
import entity.Image;
import entity.Price;
import entity.ProductMessage;
import entity.SpecDetail;
import entity.Specs;

/**
 * Servlet implementation class ProductMessageServlet
 */
@WebServlet("/jsp/promessage")
public class ProductMessageServlet extends HttpServlet {
	ProductMessageDAO prodao = new ProductMessageDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String proid = req.getParameter("id");
		req.setAttribute("proid", proid);
		List<Image> listimgx = prodao.selectShopImage(Integer.parseInt(proid));
		List<ProductMessage> listnamex = prodao.selectShopName(Integer.parseInt(proid));
		req.setAttribute("listnamex", listnamex);
		req.setAttribute("listimgx", listimgx);
		
		//获取规格id
		List<Specs> listspeid = prodao.selectSpecs(Integer.parseInt(proid));
		//根据规格id循环查详情
		List<List<SpecDetail>> listdetail = new ArrayList<List<SpecDetail>>();
		listspeid.forEach(e->{
			listdetail.add(prodao.selectDetail(e.getSpeId()));
		});
		req.setAttribute("listspeid", listspeid);
		req.setAttribute("listdetail", listdetail);
		
		
		req.getRequestDispatcher("shop_detail.jsp").forward(req, resp);
	}
}
