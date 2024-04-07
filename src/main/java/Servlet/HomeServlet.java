package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.HomeDAO;
import entity.Image;
import entity.ProductMessage;

@WebServlet("/jsp/home")
public class HomeServlet extends HttpServlet{
	HomeDAO dao = new HomeDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		List<ProductMessage> listprox = dao.selectProx();
		List<ProductMessage> listpror = dao.selectPror();
		List<Image> listimgx = dao.selectxin();
		List<Image> listimgr = dao.selectre();
		req.setAttribute("listpror", listpror);
		req.setAttribute("listprox", listprox);
		req.setAttribute("listimgx", listimgx);
		req.setAttribute("listimgr", listimgr);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}
}
