package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProductMessageDAO;
import entity.Image;
import entity.ProductMessage;

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
		List<Image> listimg = prodao.selectShopImage(Integer.parseInt(proid));
		req.setAttribute("listimg", listimg);
		req.getRequestDispatcher("shop_detail.jsp").forward(req, resp);
	}
}
