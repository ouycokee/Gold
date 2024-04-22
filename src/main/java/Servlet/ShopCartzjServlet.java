package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ShopCartDAO;
import entity.Cart;

@WebServlet("/jsp/shopcartzj")
public class ShopCartzjServlet extends HttpServlet{
	ShopCartDAO dao = new ShopCartDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Integer uid = 1;
		List<Cart> listcart = dao.seleCartAll(uid);
		int zcount = dao.selecount(uid);
		session.setAttribute("listcart", listcart);
		session.setAttribute("zcount", zcount);
		req.getRequestDispatcher("shopcart.jsp").forward(req, resp);
	}
}
