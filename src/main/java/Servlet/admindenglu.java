package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.houtaiDAO;
import entity.admin;

/**
 * Servlet implementation class admindenglu
 */
@WebServlet("/jsp/admindenglu")
public class admindenglu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String name = request.getParameter("name");
		session.setAttribute("name", name);
		String pwd = request.getParameter("pwd");
		List<admin> ad = hdao.selectAdmin(name, pwd);
		System.out.println(ad);
		if(ad != null) {
		    request.getRequestDispatcher("GuanliyuanServlet").forward(request, response);
		} else {
		    request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}
