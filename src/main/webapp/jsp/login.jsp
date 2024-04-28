<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
<title>登录注册</title>
<link rel="icon" href="../img/clown1.png" type="image/png">
    <link rel="stylesheet" href="../login.css">
    <style>
    </style>

</head>
<body>
<%@include file="head.jsp" %>
<div class="login_box">
    <div class="login_left_box"><img src="../img/denglu.jpg"></div>
    <div class="login_body">
        <div class="login_title">欢迎来到周大福官方商城</div>
        <div>
            <ul class="login_tab_list">
                <li id="tab_phone" class="login_tab_item login_tab_item_select" onclick="showTab('phone')">注册</li>
                <li id="tab_account" class="login_tab_item" onclick="showTab('account')">账号登录</li>
                   <li id="tab_employee" class="login_tab_item" onclick="showTab('employee')">员工登录</li>
            </ul>
        </div>


        <div id="phone_login" style="display: block;">
    <form class="el-form login_form_box" id="register_form" action="RegisterServlet" method="post">
        <div class="el-form-item">
            <div class="login_form_item_title">用户名</div>
            <input type="text" placeholder="请输入用户名" required="" class="el-input__inner" name="username">
        </div>
        <div class="el-form-item">
            <div class="login_form_item_title">电话号码</div>
            <input type="tel" placeholder="请输入电话号码" required="" class="el-input__inner" name="phone">
        </div>
        <div class="el-form-item">
            <div class="login_form_item_title">密码</div>
            <input type="password" placeholder="请输入密码" required="" class="el-input__inner" name="password">
        </div>
        <div class="el-form-item">
            <div class="login_form_item_title">邮箱</div>
            <input type="email" placeholder="请输入邮箱" required="" class="el-input__inner" name="email">
        </div>
        <div class="el-form-item">
            <div class="login_form_item_title">性别</div>
            <select name="gender" class="el-input__inner">
                <option value="男">男</option>
                <option value="女">女</option>
            
            </select>
        </div>
	        <div class="el-form-item">
	            <div class="login_form_item_title">出生日期</div>
	            <input type="date" placeholder="请选择出生日期" required="" class="el-input__inner" name="birthday">
	        </div>
	        <button type="submit">立即注册</button>
	    	</form>
		</div>

        <div id="account_login" style="display: none;">
        <span style="color:red">${shibai}</span>
            <form action="login-ok.jsp" method="post" class="el-form login_form_box">
                <div class="el-form-item">
                   <div class="login_form_item_title">账号</div>
                    <input type="text" name="phone" placeholder="请输入账号" required class="el-input__inner">
                </div>
                <div class="el-form-item">
                   <div class="login_form_item_title">密码</div>
                    <input type="password" name="password" placeholder="请输入密码" required class="el-input__inner">
                </div>
                <button type="submit">账号登录</button>
            </form>
        </div>
        
         <div id="employee_login" style="display: none;">
	            <form data-v-8f8a0e38="" class="el-form login_form_box" action="admindenglu" method="get">
	                <div class="el-form-item">
	                  <div class="login_form_item_title">员工编号</div>
	                    <input type="text" placeholder="请输入员工编号" required class="el-input__inner" name="name">
	                </div>
	                <div class="el-form-item">
	                   <div class="login_form_item_title">工作密码</div>
	                    <input type="password" placeholder="请输入工作密码" required class="el-input__inner" name="pwd">
	                </div>
	                <button type="submit" >员工登录</button>
	            </form>
	        </div>
        
    </div>
</div>
	
	
<script>
  function showTab(tabId) {
      var tabs = document.getElementsByClassName('login_tab_item');
      for (var i = 0; i < tabs.length; i++) {
          tabs[i].classList.remove('login_tab_item_select');
      }
      
      var selectedTab = document.getElementById('tab_' + tabId);
      selectedTab.classList.add('login_tab_item_select');
  
      document.getElementById('phone_login').style.display = 'none';
      document.getElementById('account_login').style.display = 'none';
      document.getElementById('employee_login').style.display = 'none';
  
      if (tabId === 'phone') {
          document.getElementById('phone_login').style.display = 'block';
      } else if (tabId === 'account') {
          document.getElementById('account_login').style.display = 'block';
      }else if (tabId === 'employee') {
          document.getElementById('employee_login').style.display = 'block';
  }
  }
</script>


</body>
</html>
