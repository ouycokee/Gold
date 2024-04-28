package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;

/**
 * Servlet implementation class InformationInsertServlet
 */
@WebServlet("/jsp/InformationInsertServlet")
public class InformationInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String yanzheng = request.getParameter("yanzheng");
		System.out.println(yanzheng);
		String name = request.getParameter("username");
		String dianhua = request.getParameter("dianhua");
		String pwd = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		if(yanzheng.equals("1")) {
			System.out.println(2);
			hdao.InformationInsert("insert into Information(username,phone,ipassword,email,gender,birthday) values(?,?,?,?,?,Now())", name, dianhua,pwd, email, gender);
		}else if(yanzheng.equals("2")) {
			String id = request.getParameter("userId");
			hdao.InformationUpdate("update Information set username=?,phone=?,ipassword=?,email=?,gender=? where id=? ", name,dianhua, pwd, email, gender,id);
		}
		
		request.getRequestDispatcher("/jsp/yonghuServlet").forward(request, response);
	}

}