<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="//cdn.staticfile.org/layui/2.9.7/css/layui.css" rel="stylesheet">
<title>Insert title here</title>
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
				  <li class="layui-nav-item layui-nav-itemed">
				    <a href="javascript:;">默认展开</a>
				    <dl class="layui-nav-child">
				      <dd><a href="javascript:;">选项1</a></dd>
				      <dd><a href="javascript:;">选项2</a></dd>
				      <dd><a href="javascript:;">选项3</a></dd>
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
						<a href="#" class="h_sel">
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
				<p>您当前所在位置：首页 > 后台中心</p>
			</div>
			<div class="r_message">
				<div class="m_list m_1">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
					</div>
				</div>
				<div class="m_list m_2">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
					</div>
				</div>
				<div class="m_list m_3">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
					</div>
				</div>
				<div class="m_list m_4">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
						<p>所有用户数</p>
					</div>
				</div>
				<div class="m_list m_5">
					<div class="m_pic"></div>
					<div class="m_desc">
						<span>2450</span>
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
		</div>
	</div>
	<script>
		layui.use(function(){
		  var element = layui.element;
		  element.render('nav');
		});
		</script>
</body>
</html>