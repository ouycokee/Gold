<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.trkj.com/Gold/page" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<link href="//cdn.staticfile.org/layui/2.9.7/css/layui.css" rel="stylesheet">
	<link rel="stylesheet" href="../css/Guanliyuan.css" type="text/css" />
	<script src="//cdn.staticfile.org/layui/2.9.7/layui.js"></script>
	<style>
		.layui-nav.layui-nav-tree{
			margin-top:108px;
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
				      <!-- <dd><a href="javascript:;" data-target="content5">评论详情</a></dd>
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
				<div class="h_user">当前用户：<a class="yonghuming">null</a> , 身份：系统管理员</div>
				<div class="geren">
					<form>
						 <button>个人信息</button>
						 <button>修改密码</button>
						 <button>退出登录</button>
					</form>
				</div>
				<div class="h_out">
					<a href="#">
						<span>退出</span>
						<i></i>
					</a>
				</div>
			</div>
		</div>
		<div class="t_right">
			<div class="r_location">
				<i></i>
				<p>您当前所在位置：<a class="sy" href="" data-target="shouye">后台首页</a> > <a class="tianchong"></a></p>
			</div>
			<div>
				<div class="cz">
					<div class="zeng">
						<i class="z"></i>
						<a>增加</a>
					</div>
					<div class="shan">
						<i class="s"></i>
						<a>删除</a>
					</div>
					<div class="gai">
						<i class="g"></i>
						<a>更改</a>
					</div>
					<div class="cha">
						<i class="c"></i>
						<a>查询</a>
					</div>
				</div>
				<table id="table1">
					<tr>
						<th></th>
						<th>Id</th>
						<th>商品名称</th>
						<th>分类Id</th>
						<th>邮箱</th>
						<th>商品状态</th>
						<th>出生日期</th>
					</tr>
					<c:forEach items="${order}" var="i">
		                <tr>
		                	<td><input type="checkbox" name="fuxuan"></td>
		                    <td><c:out value="${i.getOrderId()}"/></td>
		                    <td><c:out value="${i.getUserId()}"/></td>
		                    <td><c:out value="${i.getTotalPrice()}"/></td>
		                    <td><c:out value="${i.getStatus()}"/></td>
		                    <td><c:out value="${i.getCreateTime()}"/></td>
		                    <td><c:out value="${i.getAddress()}"/></td>
		                    <td><c:out value="${i.getPhone()}"/></td>
		                    <td><c:out value="${i.getDeliveryTime()}"/></td>
		                    <td><c:out value="${i.getNote()}"/></td>
		                    <td><c:out value="${i.getUsername()}"/></td>
		                    <td><c:out value="${i.getPassword()}"/></td>
		                    <td><c:out value="${i.getEmail()}"/></td>
		                    <td><c:out value="${i.getGender()}"/></td>
		                    <td><c:out value="${i.getBirthday()}"/></td>
		                </tr>
		            </c:forEach>
				</table>
				<f:page controller="orderServlet" pagesize="${pagesize}" total="${total}" curpage="${param.curpage}" where=""></f:page>
				<div class="tianjia">
					<h2 class="form-title">添加新用户</h2>
					
					<form class="form-container" id="userDataForm1" action="InformationInsertServlet" method="get">
						<input type="hidden" value="1" name="yanzheng"/>
					    <label for="username" class="form-label">用户名:</label>
					    <input type="text" id="username1" name="username" class="form-input">
					
					    <label for="password" class="form-label">密码:</label>
					    <input type="password" id="password1" name="password" class="form-input">
					
					    <label for="email" class="form-label">邮箱:</label>
					    <input type="email" id="email1" name="email" class="form-input">
					
					    <label for="gender" class="form-label">性别:</label>
					    <select id="gender1" name="gender" class="form-input">
					        <option value="male">男</option>
					        <option value="female">女</option>
					    </select>
					
					    <label for="birthdate" class="form-label">出生日期:</label>
					    <input type="date" id="birthdate1" name="birthdate" class="form-input">
					
					    <input type="submit" value="提交" class="form-submit">
					</form>
										
				</div>
				<div class="genggai">
					<h2 class="form-title">更改用户信息</h2>
				    <form class="form-container" id="userDataForm2" action="InformationInsertServlet" method="get">
				    	<input type="hidden" value="2" name="yanzheng"/>
				        <label for="userId" class="form-label">Id:</label>
				        <input type="text" id="userId2" name="userId" class="form-input">
				
				        <label for="username" class="form-label">用户名:</label>
				        <input type="text" id="username2" name="username" class="form-input">
				
				        <label for="password" class="form-label">密码:</label>
				        <input type="password" id="password2" name="password" class="form-input">
				
				        <label for="email" class="form-label">邮箱:</label>
				        <input type="email" id="email2" name="email" class="form-input">
				
				        <label for="gender" class="form-label">性别:</label>
				        <select id="gender2" name="gender" class="form-input">
				            <option value="male">男</option>
				            <option value="female">女</option>
				        </select>
				
				        <label for="birthdate" class="form-label">出生日期:</label>
				        <input type="date" id="birthdate2" name="birthdate" class="form-input">
				
				        <input type="submit" value="更改" class="form-submit">
				    </form>
				</div>
			</div>
		</div>
	</div>
	<script>
        $(document).ready(function(){
            $('.layui-nav-item .liebiao').trigger('click');
            var tianjiaVisible = false;
            var genggaiVisible = false;
            var chaxunVisible = false;
	         // 点击事件处理函数
	         $('.zeng').click(function() {
	             // 如果元素当前是隐藏的，则显示它
	             if (!tianjiaVisible) {
	            	 $('.genggai').hide();
	            	 $('.chaxun').hide();
	            	 $('.tianjia input[type="text"]').val('');
	                 $('.tianjia input[type="password"]').val('');
	                 $('.tianjia input[type="email"]').val('');
	                 $('.tianjia select').val('male');
	                 $('.tianjia input[type="date"]').val('');
	                 
	                 $('.tianjia').show();
	                 // 更新显示状态为 true
	                 tianjiaVisible = true;
	             } else {
	                 // 如果元素当前是显示的，则隐藏它
	                 $('.tianjia').hide();
	                 // 更新显示状态为 false
	                 tianjiaVisible = false;
	             }
	         });
	         $('.gai').click(function(){
	        	 if(!genggaiVisible){
	        		 $('.tianjia').hide();
	        		 $('.chaxun').hide();
	        		 $('.genggai input[type="text"]').val('');
	        		 $('.genggai input[type="text"]').val('');
	                 $('.genggai input[type="password"]').val('');
	                 $('.genggai input[type="email"]').val('');
	                 $('.genggai select').val('male');
	                 $('.genggai input[type="date"]').val('');
	        		 $('.genggai').show();
	        		 genggaiVisible = true;
	        	 }else{
	        		 $('.genggai').hide();
	        		 genggaiVisible = false;
	        	 }
	         });
	         $('.cha').click(function(){
	        	 if(!genggaiVisible){
	        		 $('.tianjia').hide();
	        		 $('.genggai').hide();
	        		 $('.charxun input[type="text"]').val('');
	        		 $('.chaxun').show();
	        		 genggaiVisible = true;
	        	 }else{
	        		 $('.chaxun').hide();
	        		 genggaiVisible = false;
	        	 }
	         });
        });
        $('.r_location p a').on('click',function(){
			var target = $(this).data('target');
			if(target==="shouye"){
				$('.sy').attr('href','/gold/jsp/GuanliyuanServlet');
				window.location.href = $('.h_sel').attr('href');
			}
		});
        
    </script>
</body>
</html>