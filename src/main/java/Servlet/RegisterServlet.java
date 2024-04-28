package Servlet;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/jsp/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");

        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gold", "root", "123456");
            String sql = "INSERT INTO Information (username, phone, Ipassword, email, gender, birthday) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, phone);
            statement.setString(3, password);
            statement.setString(4, email);
            statement.setString(5, gender);
            statement.setString(6, birthday);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response.sendRedirect("home.jsp"); // 重定向到登录页面
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); // 可以在这里添加注册失败的提示或其他处理逻辑
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
