package Servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ietf.jgss.Oid;

import DAO.houtaiDAO;

/**
 * Servlet implementation class deleteServlet
 */
@WebServlet("/jsp/deleteServlet")
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String[] selectedIds = request.getParameterValues("selectedIds");
		for (String ids : selectedIds) {
		    String[] numbers = ids.split(",");
		    for (String number : numbers) {
		    	int num = Integer.parseInt(number);
		        hdao.deleteInformation(num);
		    }
		}
		request.getRequestDispatcher("/jsp/yonghuServlet").forward(request, response);
	}

}
