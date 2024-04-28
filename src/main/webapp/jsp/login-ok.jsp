<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录验证</title>
</head>
<body>
    <%
        // 获取请求参数
        request.setCharacterEncoding("utf-8");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        
        // 定义登录SQL
        String sql ="SELECT id FROM Information WHERE phone=? AND Ipassword=?";
        
        // 使用JDBC执行SQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gold?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8","root","123456");
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, phone);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()){
	        int uid = rs.getInt("id");
	        session.setAttribute("uid", uid);
            response.sendRedirect("home");
        } else {
        	request.setAttribute("shibai", "登录失败，请检查电话号码和密码是否正确");
        	request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        rs.close();
        stmt.close();
        conn.close();
    %>
</body>
</html>
