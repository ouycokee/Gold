package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;

/**
 * Servlet implementation class orderUpdateServlet
 */
@WebServlet("/jsp/orderUpdateServlet")
public class orderUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String dizhi = request.getParameter("dizhi");
		String dianhua = request.getParameter("dianhua");
		String beizhu = request.getParameter("beizhu");
		int ddid = Integer.parseInt(id);
		hdao.orderUpdate("update dd_order set dd_Address=?,dd_Phone=?,dd_Note=? where dd_orderID=?", dizhi, dianhua, beizhu,ddid);
		request.getRequestDispatcher("/jsp/orderServlet").forward(request, response);
	}

}
