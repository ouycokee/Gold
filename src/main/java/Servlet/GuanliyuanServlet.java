package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;
@WebServlet(urlPatterns = "/jsp/GuanliyuanServlet")
public class GuanliyuanServlet extends HttpServlet {
	houtaiDAO htdao = new houtaiDAO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		List l = htdao.InformationQuery("select * from Information");
		req.setAttribute("information", l);
		req.getRequestDispatcher("/jsp/Guanliyuan.jsp").forward(req, resp);
	}
}
