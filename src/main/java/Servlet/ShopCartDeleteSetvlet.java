package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ShopCartDAO;

@WebServlet("/jsp/shopdele")
public class ShopCartDeleteSetvlet extends HttpServlet{
	ShopCartDAO dao = new ShopCartDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cidd = req.getParameter("cid");
		cidd = cidd.trim();
		int cid = Integer.parseInt(cidd);
		dao.deleteCart(cid);
	}
}
