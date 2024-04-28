package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.houtaiDAO;

/**
 * Servlet implementation class adminInsertServlet
 */
@WebServlet("/jsp/adminInsertServlet")
public class adminInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	houtaiDAO hdao = new houtaiDAO();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String yanzheng = request.getParameter("yanzheng");
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		int role = Integer.parseInt(gender);
		if(yanzheng.equals("1")) {
			System.out.println(2);
			hdao.AdminInser("insert into admin(admin_name,admin_password,admin_contact,admin_Role,admin_createTime)values(?,?,?,?,Now())",name,pwd,email,role);
		}else if(yanzheng.equals("2")) {
			String id = request.getParameter("userId");
			int admin_id=Integer.parseInt(id);
			hdao.AdminUpdate("update admin set admin_name=?,admin_password=?,admin_contact=?,admin_role=? where admin_id=? ", name, pwd, email, role,admin_id);
		}
		
		request.getRequestDispatcher("/jsp/GuanliyuanxqServlet").forward(request, response);
	}

}
