<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style>
			#main{
				display: flex;
				align-items: center;
				flex-direction: column;
			}
			.main_title{
				color: #862633;
				text-align: center;
			}
			.main_title_img{
				width: 30px;
				margin-top: 10px;
				margin-bottom: 20px;
			}
			.main_ul{
				display: grid;
				justify-content: space-between;
				grid-template-columns: repeat(auto-fill, 413px);
				grid-gap: 20px;
				width: 1280px;
				margin: 0 auto;
				margin-bottom: 20px;
			}
			.main_li{
				position: relative;
				display: flex;
				flex-direction: column;
				align-items: center;
				width: 413px;
				height: 563px;
				background-color: #fff;
				cursor: pointer;
				justify-content: space-evenly;
			}
			.main_li img{
				width: 313px;
				margin-bottom: 20px;
			}
			.main_price{
				color: #862633;
				font-size: 18px;
			}
			.main_genduo{
				display: flex;
				color: dimgray;
				cursor: pointer;
				align-items: center;
			}
			.main_genduo img{
				width: 7px;
				height: 12px;
				margin-left: 3px;
			}
			.main_li:hover{
				box-shadow: 0 10px 24px 0 rgba(0,0,0,.12);
			}
		</style>
	</head>
<%@include file="head.jsp" %>
	<body>
		<main id = "main">
			<h2 class="main_title">搜索结果</h2>
			<img class="main_title_img" src="img/主页钻石.png"/>
			<ul class="main_ul">
				<li class="main_li">
					<img src="img/新品上市1.jpg"/>
					<div>周大福 龙年生肖系列 行运一条龙黄金金章</div>
					<div class="main_price">￥360.00起</div>
				</li>
				<li class="main_li">
					<img src="img/新品上市1.jpg"/>
					<div>周大福 龙年生肖系列 行运一条龙黄金金章</div>
					<div class="main_price">￥360.00起</div>
				</li>
				<li class="main_li">
					<img src="img/新品上市1.jpg"/>
					<div>周大福 龙年生肖系列 行运一条龙黄金金章</div>
					<div class="main_price">￥360.00起</div>
				</li>
				<li class="main_li">
					<img src="img/新品上市1.jpg"/>
					<div>周大福 龙年生肖系列 行运一条龙黄金金章</div>
					<div class="main_price">￥360.00起</div>
				</li>
				<li class="main_li">
					<img src="img/新品上市1.jpg"/>
					<div>周大福 龙年生肖系列 行运一条龙黄金金章</div>
					<div class="main_price">￥360.00起</div>
				</li>
				<li class="main_li">
					<img src="img/新品上市1.jpg"/>
					<div>周大福 龙年生肖系列 行运一条龙黄金金章</div>
					<div class="main_price">￥360.00起</div>
				</li>
			</ul>
		</main>
<%@include file="footer.jsp" %>
	</body>
</html>