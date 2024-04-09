<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="false"%>
 <%@ page isELIgnored="false" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="//cdn.staticfile.org/layui/2.9.7/css/layui.css" rel="stylesheet">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Guanliyuan.css" type="text/css" />
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
				  <li class="layui-nav-item layui-nav-itemed">
				    <a href="javascript:;">默认展开</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;" data-target="content1">管理员详情</a></dd>
				      <dd><a href="javascript:;" data-target="content2">用户详情</a></dd>
				      <dd><a href="javascript:;" data-target="content3">订单详情</a></dd>
				    </dl>
				  </li>
				  <li class="layui-nav-item">
				    <a href="javascript:;">默认收缩</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;">选项1</a></dd>
				      <dd><a href="javascript:;">选项2</a></dd>
				      <dd><a href="javascript:;">选项3</a></dd>
				    </dl>
				  </li>
				  <li class="layui-nav-item"><a href="javascript:;">菜单1</a></li>
				  <li class="layui-nav-item"><a href="javascript:;">菜单2</a></li>
				  <li class="layui-nav-item"><a href="javascript:;">菜单3</a></li>
				</ul>
			</div>
		</div>
		<div class="t_header">
			<div class="h_nav">
				<ul>
					<li>
						<a href="javascript:;" data-target="shouye" class="h_sel">
							<i class="h_icon1"></i>
							<span>首页</span>
						</a>
					</li>
					<li>
						<a href="#">
							<i class="h_icon2"></i>
							<span>订单管理</span>
						</a>
					</li>
					<li>
						<a href="#">
							<i class="h_icon3"></i>
							<span>商品管理</span>
						</a>
					</li>
					<li>
						<a href="#">
							<i class="h_icon4"></i>
							<span>评论管理</span>
						</a>
					</li>
					<li>
						<a href="#">
							<i class="h_icon5"></i>
							<span>用户管理</span>
						</a>
					</li>
				</ul>
			</div>
			<div class="h_info">
				<div class="h_user">当前用户：Arry , 身份：系统管理员</div>
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
				<p>您当前所在位置：<a href="javascript:;" data-target="shouye">后台首页</a> > <a class="tianchong"></a></p>
			</div>
			<div class="r_message" id="content1">
				<div class="m_list m_1">
					<table class="biaoge">
					用户信息
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
						<p>所有用户数</p>
					</div>
				</div>
				<div class="m_list m_6">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
					</div>
				</div>
				<div class="m_list m_7">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
					</div>
				</div>
				<div class="m_list m_8">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
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
			<div class="content" id="content2">
				<table id="table1"></table>
			</div>
			<div class="content" id="content3">
				<table id="table2"></table>
			</div>
			<div class="content" id="content4">
				<table id="table3"></table>
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
		$('.layui-nav-child a').on('click', function() {
		    var target = $(this).data('target');
		    if (target === "content1") {
		        $('.content').hide();
		        $('.r_message').hide();
		        $('#content4').show();
		        $.ajax({
		        	type:'GET',
		        	url:'jsp/AjaxServlet',
		        	data:{action:'getData3'},
		        	success:function(response){
		        		$('#table3').html(response);
		        		$('.tianchong').html("管理员详情");
		        	}
		        });
		    }else {
		        $('.content').hide();
		        $('.r_message').hide();
		        $('#' + target).show();
		        var target2 = $(this).data('target');
		        if(target2 === "content2"){
		        	$.ajax({
			        	type:'GET',
			        	url:'jsp/AjaxServlet',
			        	data:{action:'getData1'},
			        	success:function(response){
			        		$('#table1').html(response);
			        		$('.tianchong').html("用户详情");
			        	}
			        });
		        }else{
		        	var target3 = $(this).data('target');
		        	if(target3 === "content3"){
			        	$.ajax({
			        		type:'GET',
			        		url:'jsp/AjaxServlet',
			        		data:{action:'getData2'},
			        		success:function(response){
			        			$('#table2').html(response);
			        			$('.tianchong').html("订单详情");
			        		}
			        	});
			        }
		        }
		    }
		});
		$('.h_nav ul li a').on('click',function(){
			var target = $(this).data('target');
			if(target==="shouye"){
				$('.r_message').show();
				$('.content').hide();
			}
		});
		$('.r_location p a').on('click',function(){
			var target = $(this).data('target');
			if(target==="shouye"){
				$('.r_message').show();
				$('.content').hide();
			}
		});
	</script>
</body>
</html>