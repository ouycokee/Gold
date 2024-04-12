package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ShopCartDAO;
import entity.Image;
import entity.ProductMessage;
import entity.Specs;

@WebServlet("/jsp/shopcart")
public class ShopCartServlet extends HttpServlet{
	ShopCartDAO shopdao = new ShopCartDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String detail1 = req.getParameter("detail1");
		String detail2 = req.getParameter("detail2");
		String id = req.getParameter("proid");
		req.setAttribute("detail1", detail1);
		req.setAttribute("detail2", detail2);
		List<Image> listimg = shopdao.seleimg(Integer.parseInt(id));
		req.setAttribute("listimg", listimg);
		List<ProductMessage> listshopname = shopdao.selectShopName(Integer.parseInt(id));
		req.setAttribute("listshopname", listshopname);
		List<Specs> listspename = shopdao.selectSpeName(Integer.parseInt(id));
		req.setAttribute("listspename", listspename);
		req.getRequestDispatcher("shopcart.jsp").forward(req, resp);
	}
}
