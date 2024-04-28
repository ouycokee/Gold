<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false"%>
 <%@ page isELIgnored="false" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.trkj.com/Gold/page" %>
<link rel="icon" href="../img/clown1.png" type="image/png">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="//cdn.staticfile.org/layui/2.9.7/css/layui.css" rel="stylesheet">
<title>管理员</title>
<script src="//cdn.staticfile.org/layui/2.9.7/layui.js"></script>
<style>
	.layui-nav.layui-nav-tree{
		margin-top:108px;
	}
	@charset "UTF-8";
		* {
			margin: 0;
			padding: 0;
		}

		body {
			font-size: 12px;
			font-family: "微软雅黑";
			color: #666;
		}

		a {
			text-decoration: none;
		}

		ul li {
			list-style: none;
		}

		.tz_content {
			width: 100%;
			background: #282828;
		}

		/*t_left start*/
		.tz_content .t_left {
			width: 200px;
			height: 800px;
			background: #282828;
			position: fixed;
			left: 0;
			top: 0;
			z-index: 2;
		}

		.tz_content .t_left .l_logo {
			width: 100%;
			height: 108px;
			border-bottom: 1px solid #000000;
			background: url("../img/clown.png") no-repeat center;
		}
		/*t_header start*/
		.tz_content .t_header {
			width: 100%;
			height: 56px;
			background: #f1d2e2;
			position: relative;
			z-index: 1;
		}

		/*h_nav start*/
		.tz_content .t_header .h_nav {
			height: 56px;
			margin-left: 200px;
			float: left;
		}

		.tz_content .t_header .h_nav ul li {
			float: left;
			width: 110px;
			height: 56px;
			border-left: 1px solid #414141;
			border-right: 1px solid #000;
			margin-left:3px;
		}

		.tz_content .t_header .h_nav ul li a {
			display: block;
			color: #838383;
			text-align: center;
			padding-top: 8px;
		}

		.tz_content .t_header .h_nav ul li a:hover {
			color: #fff;
		}

		.tz_content .t_header .h_nav ul li a i {
			display: block;
			width: 18px;
			height: 17px;
			margin: 3px auto;
		}
		.h_nav ul li a .h_icon1{
			background: url(../img/首页图标.png);
		}
		.h_nav ul li a .h_icon2{
			background: url(../img/订单管理.png);
		}
		.h_nav ul li a .h_icon3{
			background: url(../img/商品管理.png);
		}
		.h_nav ul li a .h_icon4{
			background: url(../img/评论管理.png);
		}
		.h_nav ul li a .h_icon5{
			background: url(../img/用户管理.png);
		}
		.tz_content .t_header .h_nav ul li .h_sel {
			color: #fff;
		}

		/*end h_nav*/

		/*h_info start*/
		.tz_content .t_header .h_info {
			height: 56px;
			position: absolute;
			top: 0;
			right: 10px;
		}
		.h_info .h_user{
			cursor:pointer;
			padding:0 10px 0 10px;
		}
		.h_info .geren{
			display:none;
		    width: 185px;
		    height: 123px;
		    position: absolute;
		    top: 55px;
		    left: 0px;
		    background-color: #fff;
		    border: 1px solid #ccc;
		    padding: 10px;
		    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
		}
		.geren button {
		    display: block;
		    width: 100%;
		    padding: 8px 12px;
		    margin-bottom: 5px;
		    border: none;
		    background-color: #f0f0f0;
		    color: #333;
		    cursor: pointer;
		    transition: background-color 0.3s ease;
		}
		
		.geren button:hover {
		    background-color: #e0e0e0;
		}
		.tz_content .t_header .h_info .h_user {
			line-height: 56px;
			color: #fff;
			float: left;
		}

		.tz_content .t_header .h_info .h_out {
			width: 65px;
			height: 30px;
			background: #28b779;
			margin: 13px 5px 0 10px;
			float: right;
		}

		.tz_content .t_header .h_info .h_out a {
			display: block;
			line-height: 30px;
			color: #fff;
			padding-left: 10px;
		}

		.tz_content .t_header .h_info .h_out a span {
			float: left;
		}

		.tz_content .t_header .h_info .h_out a i {
			width: 14px;
			height: 14px;
			display: block;
			float: left;
			margin: 6px 8px;
		}

		/*end h_info*/

		/*end header*/

		.tz_content .t_right {
			background: #f3f4f5;
			margin-left: 200px;
		}

		/*r_location start*/
		.tz_content .t_right .r_location {
			height: 51px;
			background: #e5e5e5;
			border-bottom: 1px solid #ccc;
			line-height: 51px;
		}

		.tz_content .t_right .r_location i {
			width: 14px;
			height: 18px;
			display: block;
			background-position: -16px -51px;
			float: left;
			margin: 16px 20px 0 20px;
		}

		/*end r_location*/

		/*r_message start*/
		
		.content{
			width:99%;
		}
		.content table{
			margin-left:5px;
			margin-top:4px;
		}
		.tz_content .t_right .r_message .m_list {
			height: 99px;
			float: left;
			margin-left: 1%;
			margin-top: 20px;
		}

		.tz_content .t_right .r_message .m_1 {
			width: 57%;
			height:453px;
		}
		.cz{
			width:100%;
			background-color:red;
			height:50px;
			display:flex;
       	 	justify-content: center;
		}
		.z{
			background-image:url("../img/加.png");
		}
		.s{
			background-image:url("../img/删除.png");
		}
		.g{
			background-image:url("../img/更改.png");
		}
		.zeng {
	       display: flex;
	       flex-direction: column;
	       align-items: center;
	       margin: 10px 20px 0; /* 调整每个项目之间的间距 */
	   }
	   .shan {
	       display: flex;
	       flex-direction: column;
	       align-items: center;
	       margin: 10px 20px 0; /* 调整每个项目之间的间距 */
	   }
	   .gai {
	       display: flex;
	       flex-direction: column;
	       align-items: center;
	       margin: 10px 20px 0; /* 调整每个项目之间的间距 */
	   }
	   .cha{
	   		display: flex;
	       	flex-direction: column;
	       	align-items: center;
	       	margin: 10px 20px 0;
	   }
		.cz div i{
			display:block;
			width:17px;
			height:16px;
			margin-bottom:4px;
		}
		.biaoge,#table1,#table2,#table3,#table4,#table5{
			width:99%;
			height:400px;
			border-collapse: collapse;
			border:2px solid black;
			font-family: Arial,sans-serif;
			margin: 3px 0 0 10px;
		}
		.biaoge th, .biaoge td,#table1 th,#table1 td ,#table2 th,#table2 td,#table3 th,#table3 td,#table4 th,#table4 td,#table5 th,#table5 td{
		    border: 1px solid black; /* 单元格边框 */
		    padding: 8px; /* 内边距 */
		    text-align: center; /* 文字居中 */
		}
		
		.biaoge th:hover,#table1 th:hover,#table2 th:hover,#table3 th:hover,#table4 th:hover,#table5 th:hover{
		    background-color: #f2f2f2; /* 表头背景色 */
		}
		
		.biaoge tr:hover,#table1 tr:hover,#table2 tr:hover,#table3 tr:hover,#table4 tr:hover ,#table5 tr:hover{
		    background-color: #ddd; /* 鼠标悬停时的背景色 */
		}
		.pagination-container {
		  	text-align: center; /* 让分页居中显示 */
		}
		
		.tianjia{
			display:none;
			width: 1704px;
		    height: 700px;
		    background-color: pink;
		    position: absolute;
		    top: 160px;
		    left: 209px;
		    z-index: 9999;
		}
		.genggai{
			display:none;
			width: 1704px;
		    height: 700px;
		    background-color: pink;
		    position: absolute;
		    top: 160px;
		    left: 209px;
		    z-index: 9999;
		}
		.chaxun{
			display:none;
			width: 1704px;
		    height: 700px;
		    background-color: pink;
		    position: absolute;
		    top: 160px;
		    left: 209px;
		    z-index: 9999;
		}
		.form-group {
            margin-bottom: 10px;
        }
        .form-input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
        .form-button {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
        }
        .form-button:hover {
            background-color: #0056b3;
        }
		.form-container {
	        max-width: 400px;
	        margin: 20px auto;
	        background: #fff;
	        padding: 20px;
	        border-radius: 8px;
	        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	   }
	
	   .form-title {
	       text-align: center;
	       color: #333;
	   }
	
	   .form-label {
	       display: block;
	       font-weight: bold;
	       margin-bottom: 5px;
	       color: #333;
	   }
	
	   .form-input {
	       width: 100%;
	       padding: 8px;
	       margin-bottom: 15px;
	       border: 1px solid #ccc;
	       border-radius: 4px;
	       box-sizing: border-box;
	   }
	
	   .form-submit {
	       background-color: #4CAF50;
	       color: white;
	       padding: 10px 20px;
	       border: none;
	       border-radius: 4px;
	       cursor: pointer;
	       font-size: 16px;
	       margin-left:165px;
	   }
	
	   .form-submit:hover {
	       background-color: #45a049;
	   }
		.tz_content .t_right .r_message .m_2 {
			width: 22%;
			background: #28b779;
		}

		.tz_content .t_right .r_message .m_3 {
			width: 17%;
			background: #ffb848;
		}

		.tz_content .t_right .r_message .m_4 {
			width: 21%;
			background: #cc6a6a;
		}

		.tz_content .t_right .r_message .m_5 {
			width: 18%;
			background: #2255a4;
		}

		.tz_content .t_right .r_message .m_6 {
			width: 17%;
			background: #da542e;
		}

		.tz_content .t_right .r_message .m_7 {
			width: 22%;
			background: #2255a4;
		}

		.tz_content .t_right .r_message .m_8 {
			width: 40%;
			background: #6297bc;
		}

		.tz_content .t_right .r_message .m_9 {
			width: 59%;
			background: #27a9e3;
		}

		.tz_content .t_right .r_message .m_10 {
			width: 38%;
			background: #28b779;
		}

		.tz_content .t_right .r_message .m_list .m_pic {
			width: 44px;
			height: 46px;
			float: left;
			margin: 25px 10px 0 20px;
		}


		.tz_content .t_right .r_message .m_list .m_desc {
			color: #fff;
			margin-top: 25px;
		}

		.tz_content .t_right .r_message .m_list .m_desc span {
			font-size: 24px;
		}
		.r_location p a:hover{
			cursor:pointer;
			color:red;
		}
	
		/*end r_message*/


		/*清除浮动*/
		.clear {
			clear: both;
		}

		/*r_table start*/
		.tz_content .t_right .r_table {
			border: 1px solid #ccc;
			margin: 0 1% 0 1%;
			background: #fff;
			margin-top: 20px;
			padding-bottom: 10px;
		}

		.tz_content .t_right .r_table .r_title {
			width: 100%;
			height: 40px;
			background: #eee;
			border-bottom: 1px solid #ccc;
		}

		.tz_content .t_right .r_table .r_title i {
			width: 16px;
			height: 14px;
			display: block;
			float: left;
			margin: 12px;
		}

		.tz_content .t_right .r_table .r_title p {
			height: 40px;
			line-height: 40px;
			border-left: 1px solid #ccc;
			float: left;
			padding-left: 5px;
			color: #000;
		}

		.tz_content .t_right .r_table .r_label {
			width: 80%;
			height: 100px;
			float: left;
		}

		.tz_content .t_right .r_table .r_label ul li {
			list-style: none;
			float: left;
			background: #999;
			margin: 10px 10px 0 10px;
		}

		.tz_content .t_right .r_table .r_label ul li a {
			display: block;
			padding: 8px 20px;
			color: #fff;
		}

		.tz_content .t_right .r_table .r_label ul li a:hover {
			background: #28b779;
		}

		.tz_content .t_right .r_table .r_label ul .select a {
			background: #28b779;
		}

		.tz_content .t_right .r_table .r_label ul li a i {
			width: 15px;
			height: 14px;
			display: block;
			float: left;
			margin-right: 10px;
		}

		
		.tz_content .t_right .r_table .r_search {
			width: 19%;
			height: 30px;
			float: left;
			padding-top: 10px;
		}

		.tz_content .t_right .r_table .r_search .r_text {
			width: 60%;
			height: 28px;
			line-height: 28px;
			border: 1px solid #ddd;
			float: right;
		}

		.tz_content .t_right .r_table .r_search .r_btn {
			width: 20%;
			height: 29px;
			background: #999;
			color: #fff;
			cursor: pointer;
			border: 0;
			float: right;
		}

		/*end r_table*/

		/*r_table_list start*/
		.tz_content .t_right .r_table .r_table_list {
			width: 100%;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab {
			border-collapse: collapse;
			width: 98%;
			text-align: center;
			margin: 0 1%;
		}

		.tz_content .t_right .r_table .r_table_list tr th {
			line-height: 40px;
			background: #eee;
		}

		.tz_content .t_right .r_table .r_table_list tr td {
			border: 1px solid #ddd;
			line-height: 40px;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab thead {
			border: 1px solid #ddd;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr:hover {
			background: #EAEAEA;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr:hover .t_action {
			display: block;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr td .t_action {
			width: 108px;
			height: 24px;
			margin: 0 auto;
			display: none;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr .t_td {
			width: 120px;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr td .t_action a {
			width: 24px;
			height: 24px;
			display: block;
			float: left;
			margin-right: 2px;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr td .t_action a:hover {
			background-color: #2f3437;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr td .t_action .a_see {
			background-position: -359px -45px;
			background-color: #6297bc;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr td .t_action .a_edit {
			background-position: -379px -47px;
			background-color: #27a9e3;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr td .t_action .a_save {
			background-position: -398px -47px;
			background-color: #28b779;
		}

		.tz_content .t_right .r_table .r_table_list .t_tab tbody tr td .t_action .a_del {
			background-position: -417px -48px;
			background-color: #ff912f;
		}

		/*end r_table_list*/



		/*头部导航和消息提示小于1360的时候 用下边的样式*/
		@media screen and (max-width:1360px) {

			/*h_nav start*/
			.tz_content .t_header .h_nav {
				margin-left: 200px;
			}

			.tz_content .t_header .h_nav ul li {
				width: 80px;
			}

			/*end h_nav*/

			.tz_content .t_right .r_message .m_list .m_pic {
				display: none;
			}

			.tz_content .t_right .r_message .m_list .m_desc {
				text-align: center;
			}
		}

		/*头部导航和左侧导航小于1024的时候 用下边的样式*/
		@media screen and (max-width:1024px) {

			/*t_left start*/
			.tz_content .t_left {
				width: 50px;
			}

			.tz_content .t_left .l_logo {
				height: 54px;
				background: url("picture/logo1.png") no-repeat center;
			}

			
			/*end t_left*/

			/*h_nav start*/
			.tz_content .t_header .h_nav {
				margin-left: 50px;
			}

			.tz_content .t_header .h_nav ul li {
				width: 60px;
			}

			.tz_content .t_header .h_nav ul li a span {
				display: none;
			}

			.tz_content .t_header .h_nav ul li a i {
				margin: 14px auto;
			}

			/*end h_nav*/

			.tz_content .t_header .h_info .h_user {
				display: none;
			}

			.tz_content .t_right {
				margin-left: 0;
			}

			.tz_content .t_right .r_location {
				margin-left: 50px;
			}

			.tz_content .t_right .r_message {
				margin-left: 50px;
			}

			.tz_content .t_right .r_table {
				margin-left: 60px;
			}
			::-webkit-scrollbar {
				width: 8px;
				background: #fff;
				border-radius: 4px
			}
			
			::-webkit-scrollbar-thumb {
				border-radius: 4px;
				background: #eee;
				height: 120px
			}
			
			::-webkit-scrollbar-track {
				display: none
			}
			
		}
</style>
</head>
<body>
	<div class="tz_content">
		<div class="t_left">
			<div class="l_logo"></div>
			<div class="l_n2av">
				<ul class="layui-nav layui-nav-tree layui-nav-side">
				  <li class="layui-nav-item">
				    <a href="javascript:;" class="liebiao">浏览列表</a>
				    <dl class="layui-nav-child">
				      <dd><a href="/gold/jsp/GuanliyuanxqServlet" data-target="content1">管理员详情</a></dd>
				      <dd><a href="/gold/jsp/yonghuServlet" data-target="content2">用户详情</a></dd>
				      <dd><a href="/gold/jsp/orderServlet" data-target="content3">订单详情</a></dd>
				      <dd><a href="/gold/jsp/productServlet" data-target="content4">商品详情</a></dd>
				     <!--  <dd><a href="javascript:;" data-target="content5">评论详情</a></dd>
				      <dd><a href="javascript:;" data-target="content6">退款详情</a></dd> -->
				    </dl>
				  </li>
				 
				</ul>
			</div>
		</div>
		<div class="t_header">
			<div class="h_nav">
				<ul>
					<li>
						<a href="/gold/jsp/GuanliyuanServlet" data-target="shouye" class="h_sel">
							<i class="h_icon1"></i>
							<span>首页</span>
						</a>
					</li>
				</ul>
			</div>
			<div class="h_info">
				<div class="h_user">当前用户：<a class="yonghuming">${name}</a> , 身份：系统管理员</div>
				<div class="geren">
					<form>
						 <button>个人信息</button>
						 <button>修改密码</button>
						 <button>退出登录</button>
					</form>
				</div>
				<div class="h_out">
					<a href="home">
						<span>退出</span>
						<i></i>
					</a>
				</div>
			</div>
		</div>
		<div class="t_right">
			<div class="r_location">
				<i></i>
				<p>您当前所在位置：<a href="javascript:;" data-target="shouye">后台首页</a> > <a class="tianchong"></a></p>
			</div>
			<div class="r_message" id="content1">
				<div class="m_list m_1">
				<input type="hidden" value="${param.curpage}" name="curpage" />
				<input type="hidden" value="4" name="pagesize" />
					<table class="biaoge">
						<tr>
							<th>编号</th>
							<th>姓名</th>
							<th>性别</th>
							
						</tr>
						
						<c:forEach items="${information}" var="i">
			                <tr>
			                    <td><c:out value="${i.getId()}"/></td>
			                    <td><c:out value="${i.getUsername()}"/></td>
			                    <td><c:out value="${i.getGender()}"/></td>
			                </tr>
			            </c:forEach>
					</table>
					<f:page controller="GuanliyuanServlet" pagesize="${pagesize}" total="${total}" curpage="${param.curpage}" where=""></f:page>
				</div>
				<div class="m_list m_2">
					<div class="m_pic"></div>
					<div class="m_desc">
						<p>订单详情</p>
					</div>
				</div>
				<div class="m_list m_3">
					<div class="m_pic"></div>
					<div class="m_desc">
						<p>管理员详情</p>
					</div>
				</div>
				<div class="m_list m_4">
					<div class="m_pic"></div>
					<div class="m_desc">
						<p>评论详情</p>
					</div>
				</div>
				<div class="m_list m_5">
					<div class="m_pic"></div>
					<div class="m_desc">
						<p></p>
					</div>
				</div>
				<div class="m_list m_6">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p></p>
					</div>
				</div>
				<div class="m_list m_7">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p></p>
					</div>
				</div>
				<div class="m_list m_8">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p></p>
					</div>
				</div>
				<div class="m_list m_9">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
					</div>
				</div>
				<div class="m_list m_10">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
					</div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	<script>
		layui.use(function(){
		  var element = layui.element;
		  element.render('nav');
		});
	</script>
	<script>
        $(document).ready(function(){
            $('.layui-nav-item .liebiao').trigger('click');
        });
    </script>
	<script>
	//个人面板
	$('.h_info .h_user, .h_info .geren').on('mouseenter', function(){
	    $('.h_info .geren').show();
	});

	$('.h_info .h_user, .h_info .geren').on('mouseleave', function(){
	    $('.h_info .geren').hide();
	});
		//回到首页
		$('.h_nav ul li a').on('click',function(){
			var target = $(this).data('target');
			if(target==="shouye"){
				$('.r_message').show();
				$('.content').hide();
				$('.tianchong').html(" ");
			}
		});
		$('.r_location p a').on('click',function(){
			var target = $(this).data('target');
			if(target==="shouye"){
				$('.r_message').show();
				$('.content').hide();
				$('.tianchong').html(" ");
			}
		});
	</script>
</body>
</html>