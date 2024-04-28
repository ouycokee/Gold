package Servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;

/**
 * Servlet implementation class deleteOrderServlet
 */
@WebServlet("/jsp/deleteOrderServlet")
public class deleteOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String[] selectedIds = request.getParameterValues("selectedIds");
		System.out.println(Arrays.toString(selectedIds));
		for(String ids:selectedIds) {
			String[] numbers = ids.split(",");
			for(String number:numbers) {
				int num = Integer.parseInt(number);
				hdao.deleteOrder(num);
			}
		}
		request.getRequestDispatcher("/jsp/orderServlet").forward(request, response);
	}

}
