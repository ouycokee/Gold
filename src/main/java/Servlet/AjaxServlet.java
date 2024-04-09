package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;
import entity.Information;

/**
 * Servlet implementation class InformationServlet
 */
@WebServlet("/jsp/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		if(action.equals("getData1")) {
			String html = hdao.InfoQueryToHTML("select * from Information order by id desc");
			response.setContentType("text/html");
			response.getWriter().write(html);
		}else if(action.equals("getData2")) {
			String html = hdao.OrQueryToHTML("SELECT * FROM dd_Order o INNER JOIN information i ON o.`dd_UserID`=i.`id` ORDER BY dd_OrderID DESC");
			response.setContentType("text/html");
			response.getWriter().write(html);
		}else if(action.equals("getData3")) {
			String html = hdao.adQueryToHTML("select * from Admin order by Admin_role desc");
			response.setContentType("text/html");
			response.getWriter().write(html);
		}
	}
}
