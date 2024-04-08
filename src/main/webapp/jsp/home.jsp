<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 
<link rel="icon" href="../img/clown.png" type="image/png">
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>周大福官方商场</title>
<link href="//unpkg.com/layui@2.9.7/dist/css/layui.css" rel="stylesheet">
<script src="../jquery-3.5.1.min.js"></script>
<script src="//unpkg.com/layui@2.9.7/dist/layui.js"></script>
<style>
	body {
		font-family: Arial, sans-serif;
		margin: 0;
		padding: 0;
	}
	header {
		padding: 0 0 0 0;
		background-color: rgb(248,248,248);
		text-align: center;
		position: sticky;
		top: 0;
		z-index: 999;
	}
	.xian{
		height:3px;
		background-color:#862633;
	}
	.yemei{
		height: 80px;
		margin-bottom:12px;
		padding-top:1px;
	}
	.yemei_body{
		margin:0 auto;
		padding: 0;
		width: 1280px;
		height:56px;
		margin-top:19px;
		display:flex;
	}
	.body_left{
		 display: flex;
		 justify-content: flex-start;
		 align-items: center;
		 width: 591px;
		 flex-direction: row;
	}
	.body_left div {
		height: 56px;
		line-height: 56px;
		font-size: 13px;
		color: black;
		cursor: pointer;
		margin-right: 40px;
	}
	.service {
		width: 52px; /* 默认宽度 */
		transition: width 0.5s; /* 添加过渡效果 */
	}
	.service:hover {
		width: 52px; /* 悬停时的宽度 */
	}
	.service:hover .head_hover{
		display: block;
	}
	.head_hover{
		width: 130px;
		height: 140px !important; 
		position: relative;
		left: -38px;
		top: -10px;
		background-color: white;
		box-shadow: 4px 5px 16px lightgray;
	}
	.head_hover_ul{
		width: 100%;
		padding: 0px;
	}
	.head_hover_ul li{
		margin:10px 0px 5px 0px;
		list-style: none;
		height: 40px;
		line-height: 40px;
		font-size: 14px;
		text-align: center;
	}
	.head_hover_ul li:hover{
		color: #862633;
		background-color: lightgray;
	}
	.body_center{
		width: 98px;
		 height: 56px;
		 cursor: pointer;
		 background-image: url(img/clown.png);
		 background-repeat: no-repeat;
		 background-size: cover;
	}
	.body_right{
		display: flex;
		 justify-content: flex-end;
		 align-items: center;
		 width: 591px;

	}
	.body_right div {
		height: 56px;
		margin-left: 20px;
		cursor: pointer;
	    display: flex;
	    align-items: center;
	}
	
	.body_right div a {
	    font-size:14px;
	    line-height: 56px;
	    color: black;
		margin-left:4px;
	}
	.body_right div:nth-child(1) i{
		background-image: url(img/金价.png);
		background-size: cover;
	}
	.body_right div:nth-child(2) i{
		background-image: url(img/登录注册.png);
		background-size: cover;
	}
	.head_login {
		display: none;
		flex-direction: column;
		justify-content: center;
		align-items: center;
		background-color: white;
		width: 285px;
		position: absolute;
		top: 80px;
		right: 280px;
		box-shadow: 4px 5px 16px lightgray;
	}	
	.head_login_body{
		width: 100%;
		height: 140px;
	}
	.head_login_body_ul{
		padding-left: 28px;
	}
	.head_login_body_ul li{
		font-size: 14px;
		line-height: 30px;
		list-style: none;
	}
	.head_login_but{
		width: 238px;
		height: 116px;
	}
	.head_login_but_dl{
		width: 100%;
		height: 45px;
		background-color: #862633;
		border: none;
		color: white;
		cursor: pointer;
		margin-top: 5px;
	}
	.head_login_but_zc{
		width: 100%;
		height: 45px;
		color: #862633;
		border: 1px solid #862633;
		cursor: pointer;
		background-color: white;
		margin-top: 15px;
	}
	.head_login_but_dl:hover{
		color: #862633;
		border: 1px solid #862633;
		background-color: white;
	}
	.head_login_but_zc:hover{
		background-color: #862633;
		border: none;
		color: white;
	}

	.body_right div:nth-child(3) i{
		background-image: url(../img/购物车.png);
		background-size: cover;
	}
	.body_right div i {
	    width: 20px;
	    height: 20px;
	}
	nav ul {
	    display: flex;
	    justify-content: center; /* 或者justify-content: space-evenly; */
	}
	header nav ul li:first-child{
		border-bottom:2px solid red;
	}
	nav ul li {
	    display: inline-block;
	    margin: 0 10px;
	    padding: 0 7px 14px;
	    padding-bottom: 16px;
	    vertical-align: top; /* 垂直对齐方式改为顶部对齐 */
	}
	header nav ul li a {
		color:black;
		text-decoration: none;
	}
	.hover_box	 {
	    display: none;
	    position: absolute;
	    top: 100%;
	    left: 0;
	    width: 100%;
		height:525px;
	    background-color: white;
	    color: #fff;
	    padding: 10px;
		box-shadow: 4px 5px 16px lightgray;
	}
	.hover_box div ul li:first-child{
		border-bottom: none;
	}
	.layui-tab-bar{
		display: none;
	}
	
	.layui-tab .layui-tab-title {
	    text-align: center; /* 设置文本居中 */
	}
	
	.layui-tab .layui-tab-title ul {
	    display: inline-block;
	    padding: 0; /* 去除默认内边距 */
	}
	
	.layui-tab .layui-tab-title li {
	    display: inline-block;
	    margin: 0 10px; /* 设置间距 */
	}
	.layui-this:after{
		border: none; 
		border-radius: 0; 
		border-bottom: 2px solid #862633 !important;
	}
	.layui-tab-title li {
		color: black;
	}
	
	.layui-tab-title .layui-this {
		color: #862633 !important; 
	}
	.container {
		display: flex;
		justify-content: space-evenly;
		align-items: center;
		flex-wrap: wrap;
		flex-direction: row;
		padding-top: 135px;
		align-content: flex-start;
	}
	
	.hover_box_div {
	  display: flex;
	  flex-direction: column;
	  justify-content: center; /* 垂直居中 */
	  align-items: center; /* 水平居中 */
	  text-align: center;
	}
	.hover_box_div span{
		display: block;
		color: black;
		padding-left: 8px;
	}
	.hover_box_div img{
		width: 128px;
		height: 128px;
	}
	#bb{
		padding-left: 11px;
	}
	.ss {
	    display: flex;
	    align-items: center;
	}
	.ss a {
	    float: none; /* 取消浮动 */
	    margin-right: 5px; /* 可根据需要调整间距 */
	}
	.sousuo {
	    border: none; /* 去除边线 */
	    border-bottom: 1px solid #000; /* 初始状态下隐藏底线 */
	    transition: width 0.5s, border-bottom-color 0.5s; /* 添加过渡效果 */
		float: left;
		background-color: rgb(248,248,248);
		background-image: url(../img/放大镜.png);
		background-repeat: no-repeat;
		background-position-x: right;
	}
	.sousuo:focus {
	    width: 150px; /* 调整输入框宽度 */
	    border-bottom: 1px solid #000; /* 焦点状态下显示底线 */
	}
	nav ul li .hover_box:hover .hover_box {
	    display: block;
	}
	nav ul li:hover .hover_box {
	    display: block;
	}
	
	
	
	
	
	.lunbo{
		height:808px;
	}
	#ID-carousel-demo-image{
		margin: 0 auto;
		padding: 0;
	}
	main {
		padding: 20px;
	}
	#main{
		background-color:rgb(248,248,248);
	}
	#main section h2{
		text-align:center;
	}
	.product-list {
	  display: flex;
	  flex-wrap: wrap;
	  justify-content: center; /* 水平居中 */
	  align-items: center; /* 垂直居中 */
	}
	.product {
		border: 1px solid #ddd;
		border-radius: 5px;
		padding: 10px;
		margin: 10px;
		width: 200px;
	}
	.product h3,p{
		text-align:center;
	}
	.zunxiang_ul{
		 display: flex;
		 justify-content: space-between;
		 align-items: flex-start;
		 padding:0;
		 margin:0 auto;
		 width: 1175px;
	}
	.zunxiang_ul li{
		display: flex;
		 flex-direction: column;
		 align-items: center;
		 width: 200px;
		 height:144px;
	}
	.zunxiang_div1{
		width: 64px;
		height: 22px;
		font-size: 15px;
		margin: 10px 0px 10px 1px;
	}
	.zunxiang_div2{
		font-size: 13px;
		text-align: center;
		line-height: 25px;
	}
	.zunxiang_ul li img{
		width: 50px;
		height: 50px;
	}
	.zunxiangtiyan {
	  display: flex;
	  align-items: center;
	  height: 280px;
	  flex-direction: column;
	  justify-content: space-evenly;
	}
	.zunxiangtiyan i {
		background-image: url(../img/主页钻石.png);
		background-size: cover;
		width: 30px;
		height: 30px;
	}
	#zunxiang{
			font-size:24px;
			font-weight:500;
			color:#6d584f;
			text-align:center;
	}
	footer {
		text-align: center;
		padding: 10px 0;
		width: 100%;
		height:100px;
	}
	.huidaodingduan {
		position: fixed;
		right: 48px;
		bottom: 150px;
		display: none;
		justify-content: center;
		align-items: center;
		width: 54px;
		height: 54px;
		background-image: url(../img/箭头.png);
		background-repeat: no-repeat;
		background-size: 36px;
		background-position: center;
		border: 2px solid #862633;
		border-radius: 50%;
		cursor: pointer;
	}
	.buttom_box{
		height:257px;
		padding-top:50px;
	}
	.buttom_box_body{
		display: flex;
		 justify-content: space-between;
		 align-items: flex-start;
		 width: calc(100% - 736px);
		 min-width: 1184px;
		 padding: 30px 0;
		 margin: 0 auto;
		
	}
	.buttom_box_left{
		width:760px;
		height:144px;
		display:flex;
		background-color:white;
	}
	.buttom_box_left div {
	    display: flex;
		flex-direction: column;
		justify-content: flex-start;
		align-items: flex-start;
		width: 190px;
		height: 144px;
	}
	
	.buttom_box_left div ul li {
	    display: flex;
	    font-size: 14px;
	    list-style: none;
	    align-items: center; /* 垂直居中对齐 */
	}
	
	.buttom_box_left div h5 {
	    display: flex;
	    flex-direction: column;
	    align-items: center;
	    margin-bottom: 10px; /* 调整标题与列表之间的间距 */
	}
	.buttom_box_left div:nth-child(1) h5{
		margin-right: 11px;
	}
	.buttom_box_left div:nth-child(2) h5{
		margin-right: 133px;
	}
	.p{
		font-size: 14px;
	}
	.buttom_box_left div:nth-child(3) .p:nth-child(3) {
		margin-top: -40px;
	}
	
	.buttom_box_left div:nth-child(3) h5{
		margin-right: 28px;
	}
	.buttom_box_right{
		width:309px;
		height:144px;
	}
	.buttom_box_right div,p{
		text-align:center;
	}
	.buttom_box_right div{
		font-size: 15px;
		font-weight: 400;
		color: #333;
		line-height: 27px;
	}
	.buttom_box_right p{
		font-size: 30px;
		font-weight: 500;
		color: #862633;
		line-height: 33px;
		margin:5px 0 20px 0;
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
	    text-align: center;
	    position: relative;
	    top: 40px;
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
	.price_span{
		font-size:14px;
	}
</style>
</head>
<body>
	<div class="xian" id="xian"></div>
	<header>
		<div class="xian"></div>
		<div class="yemei">
			<div class="yemei_body">
				<div class="body_left">
					<div>分店网络</div>
					<div>手机版</div>
					<div>中国香港及海外入口</div>
					<div class="service">
						<span>查询服务</span>
						<div class="head_hover" style="display: none;">
							<ul class="head_hover_ul">
								<li>发票管理</li>
								<li>商品核验</li>
								<li>电子保证单</li>
							</ul>	
						</div>
					</div>
					
				</div>
				<div class="body_center"></div>
				<div class="body_right">
					<div><i></i><a>今日金价</a></div>
					<div class="denglu"><i></i><a>name</a>
					<div><i></i><a>购物袋</a></div>
				</div>
			</div>
		</div>
		<div class="head_login">
				<div class="head_login_body">
					<ul class="head_login_body_ul">
						<li>注册周大福官方商城账号，您将享受：</li>
						<li>管理您的个人信息</li>
						<li>保存您的收货地址</li>
						<li>查看您的订单信息</li>
					</ul>
				</div>
				<div class="head_login_but">
					<button class="head_login_but_dl">登录</button>
					<button class="head_login_but_zc">注册</button>
				</div>
			</div>
		</div>
		<nav>
		    <ul>
		        <li><a href="#">首页</a></li>
		        <li>
		            <a href="home">全部商品</a>
		            <div class="hover_box">
						<div class="layui-tab layui-tab-brief">
						  <ul class="layui-tab-title">
						    <li class="layui-this">精彩呈现</li>
						    <li>材质</li>
						    <li>款式</li>
						    <li>转运珠</li>
						    <li>十二生肖</li>
						  </ul>
						  <div class="layui-tab-content">
						    <div class="layui-tab-item layui-show">
								<div class="container">
									<div class="hover_box_div">
										<img src="../img/经典必备.jpg"/>
										<span id="bb">经典必备</span>
									</div>
								</div>
								
							</div>
						    <div class="layui-tab-item">
								<div class="container">
									<div class="hover_box_div">
										<img src="../img/黄金.png"/>
										<span>黄金</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/钻石.png"/>
										<span>钻石</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/k金.png"/>
										<span>k金</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/铂金.png"/>
										<span>铂金</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/银饰.png"/>
										<span>银饰</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/珍珠.jpg"/>
										<span>珍珠</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/和田玉.jpg"/>
										<span>和田玉</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/翡翠.jpg"/>
										<span>翡翠</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/玉髓.jpg"/>
										<span>玉髓</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/宝石.jpg"/>
										<span>宝石</span>
									</div>
								</div>
							</div>
						    <div class="layui-tab-item">
								<div class="container">
									<div class="hover_box_div">
										<img src="../img/戒指.png"/>
										<span>戒指</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/吊坠.png"/>
										<span>吊坠</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/项链.png"/>
										<span>项链</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/耳饰.png"/>
										<span>耳饰</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/手链脚链.png"/>
										<span>手链脚链</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/手镯.png"/>
										<span>手镯</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/摆件.png"/>
										<span>摆件</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/金条金章.png"/>
										<span>金条金章</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/生肖.png"/>
										<span>生肖</span>
									</div>
								</div>
							</div>
						    <div class="layui-tab-item">
								<div class="container">
									<div class="hover_box_div">
										<img src="../img/ip联名.jpg"/>
										<span>ip联名</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/FUNNY趣玩.jpg"/>
										<span>FUNNY趣玩</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/男士寻潮.jpg"/>
										<span>男士寻潮</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/甜美童话.jpg"/>
										<span>甜美童话</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/文化祝福.jpg"/>
										<span>文化祝福</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/字母.jpg"/>
										<span>字母</span>
									</div>
								</div>
							</div>
						    <div class="layui-tab-item">
								<div class="container">
									<div class="hover_box_div">
										<img src="../img/鼠.png"/>
										<span>鼠</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/牛.png"/>
										<span>牛</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/虎.png"/>
										<span>虎</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/兔.png"/>
										<span>兔</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/龙.png"/>
										<span>龙</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/蛇.png"/>
										<span>蛇</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/马.png"/>
										<span>马</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/羊.png"/>
										<span>羊</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/猴.png"/>
										<span>猴</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/鸡.png"/>
										<span>鸡</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/狗.png"/>
										<span>狗</span>
									</div>
									<div class="hover_box_div">
										<img src="../img/猪.png"/>
										<span>猪</span>
									</div>
								</div>
							</div>
						  </div>
						</div>
					</div>
		        </li>
		        <li><a href="#">钻石</a></li>
				<li><a href="#">婚嫁</a></li>
				<li><a href="#">周大福定制</a></li>
				<li class="ss">
					<a style="cursor: pointer;" class="sous">搜索</a>
					<input class="sousuo" style="display:none;"placeholder="按回车键搜索" />
				</li>
		    </ul>
		</nav>
	</header>

	
	

	
	<div class="lunbo">
		<div class="layui-carousel" id="ID-carousel-demo-image">
		  <div carousel-item>
		    <div><img src="../img/轮播.jpg" style="display: block;-webkit-user-select: none;margin: auto;cursor: zoom-in;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;"></div>
		    <div><img src="../img/轮播1.jpg" style="display: block;-webkit-user-select: none;margin: auto;cursor: zoom-in;background-color: hsl(0, 0%, 90%);transition: background-color 300ms;"></div>
		  </div>	
		</div>
	</div>
	
<main id="main">
    <h2 class="main_title">新品上市</h2>
    <img class="main_title_img" src="../img/主页钻石.png" />
    <ul class="main_ul">
        <c:forEach var="image" items="${listimgx}" varStatus="loop">
            <li class="main_li">
                <a href="promessage?id=${listprox[loop.index].proId}">
                    <img src="../img/${image.imageUrl}" />
                    <div style="text-align:center">${listprox[loop.index].proName}</div>
                    <div class="main_price">￥${listminpri[loop.index].price} <span class="price_span">起</span></div>
                </a>
            </li>
        </c:forEach>
    </ul>
    <div class="main_genduo">查看更多<img src="../img/右箭头.png" /></div>

    <h2 class="main_title" style="margin-top: 60px;">热销商品</h2>
    <img class="main_title_img" src="../img/主页钻石.png" />
    <ul class="main_ul">
        <c:forEach var="image" items="${listimgr}" varStatus="loop">
            <li class="main_li">
                <a href="promessage?id=${listprox[loop.index].proId}">
                    <img src="../img/${image.imageUrl}" />
                    <div style="text-align:center">${listpror[loop.index].proName}</div>
                    <div class="main_price">￥360.00 <span class="price_span">起</span></div>
                </a>
            </li>
        </c:forEach>
    </ul>
    <div class="main_genduo">查看更多<img src="../img/右箭头.png" /></div>
</main>


<div class="huidaodingduan"></div>
<div class="zunxiangtiyan">
    <h4 id="zunxiang">Gold尊享体验</h4>
    <i></i>
    <ul class="zunxiang_ul">
        <li>
            <img src="../img/包邮保价.png">
            <div class="zunxiang_div1">包邮保价</div>
            <div class="zunxiang_div2">顺丰、EMS为您提供快递服务
周大福已为产品购买保险</div>
        </li>
        <li>
            <img src="../img/全国联保.png" />
            <div class="zunxiang_div1">全国联保</div>
            <div class="zunxiang_div2">凭产品及保证单在全国任何
周大福分店均可享受联保服务</div>
        </li>
        <li>
            <img src="../img/刻字服务.png" />
            <div class="zunxiang_div1">刻字服务</div>
            <div class="zunxiang_div2">提供免费刻字服务
为您呈现不一样的服务</div>
        </li>
        <li>
            <img src="../img/线下服务.png" />
            <div class="zunxiang_div1">线下服务</div>
            <div class="zunxiang_div2">全国免费保养
详情请咨询客服</div>
        </li>
    </ul>
</div>
<div class="xian"></div>
<div class="buttom_box">
    <div class="buttom_box_body">
        <div class="buttom_box_left">
            <div>
                <h5>新手指南</h5>
                <div class="p">购物入门</div>
            </div>
            <div>
                <h5>会员中心</h5>
                <div class="p">周大福会员xK分赏积分计划的条款及细则</div>
            </div>
            <div>
                <h5>帮助中心</h5>
                <div class="p">配送方式</div>
                <div class="p">验货与签收</div>
            </div>
            <div>
                <h5>关于公司</h5>
                <div class="p">Gold珠宝简洁</div>
                <div class="p">用户协议</div>
                <div class="p">Gold平台个人信息声明</div>
                <div class="p">公司声明</div>
            </div>
        </div>
        <div class="buttom_box_right">
            <p>400-166-9999 转 8</p>
            <div>服务热线：周一至周五9:30-17:30</div>
            <div>每日8:15-23:45</div>
            <div>※以上服务时间法定节假日除外</div>
        </div>
    </div>
</div>

	<footer>
		<p>Gold珠宝（股份代号：9999）· 香港主板上市公司Copyright © 2016深圳市绍福电子商务有限公司版权所有   粤B2-20110210   粤ICP备11010408号广东省深圳市盐田区深盐路2011号周大福集团大厦15楼</p>
	</footer>
	<script>
		$(document).ready(function() {
		  $('.sousuo').on('input', function() {
			$(this).attr('placeholder', '请输入关键词，按回车键搜索');
		  });
		
		  $('.sousuo').keypress(function(e) {
			if (e.which == 13) {
			  let keyword = $(this).val();
			  if (keyword.trim() !== '') {
				// 执行搜索并提交的逻辑
				alert('您输入的关键词是：' + keyword);
			  } else {
				alert('请输入关键词后再按回车键进行搜索');
			  }
			}
		  });
		});
		$(document).ready(function() {
		    $('.denglu').on('mouseover', function() {
		        $('.head_login').css('display', 'flex');
		    });
		
		    $('.denglu').on('mouseout', function() {
		        $('.head_login').css('display', 'none');
		    });
		});
		$(document).ready(function(){
			$('.head_login').on('mouseover',function(){
				$('.head_login').css('display', 'flex');
			})
			$('.head_login').on('mouseout', function() {
			    $('.head_login').css('display', 'none');
			});
		})
	</script>
	<script>
		let scrollCount = 0;
		const huidaodingduan = document.querySelector('.huidaodingduan');
		const hoverBoxes = document.querySelectorAll('.hover_box');
		const sousuo = document.querySelectorAll('.sousuo');
		const hoverDives =document.querySelectorAll('.head_hover')
		hoverBoxes.forEach(hoverBox => {
		    const parentLi = hoverBox.parentElement;
		
		    parentLi.addEventListener('mouseover', function() {
		        hoverBox.style.display = 'block';
		    });
		
		    parentLi.addEventListener('mouseout', function() {
		        hoverBox.style.display = 'none';
		    });
		});
		sousuo.forEach(sousuo =>{
			const ss = document.querySelector('.sous');
			let num = 1;
			ss.addEventListener('click',function(){
				num+=1;
				if(num%2==0){
					sousuo.style.display = 'block';
				}else{
					sousuo.style.display = 'none';
				}
			})
		});
		hoverDives.forEach(hoverDiv=>{
			const pdiv = hoverDiv.parentElement;
			pdiv.addEventListener('mouseover', function() {
			    hoverDiv.style.display = 'block';
			});
					
			pdiv.addEventListener('mouseout', function() {
			    hoverDiv.style.display = 'none';
			});
		});
		huidaodingduan.addEventListener('click', function() {
		    // 平滑滚动到页面顶部
		    window.scrollTo({
		        top: 0,
		        behavior: 'smooth'
		    });
		});
		if (huidaodingduan) {
			window.addEventListener('scroll', function() {
				scrollCount++;
				if (scrollCount >= 2) {
					huidaodingduan.style.display = 'block';
				}
				
				// 检查用户是否滚动到页面顶部
				if (window.scrollY === 0) {
					huidaodingduan.style.display = 'none';
				}
			});
			
			// 监听鼠标滚轮事件
			window.addEventListener('wheel', function() {
				// 如果用户滚回到页面顶部，隐藏按钮
				if (window.scrollY === 0) {
					huidaodingduan.style.display = 'none';
				}
			});
		}
		
		//轮播图
		layui.use(function(){
		  var carousel = layui.carousel;
		  // 渲染 - 图片轮播
		  carousel.render({
		    elem: '#ID-carousel-demo-image',
		    width: '1912px',
		    height: '808px',
		    interval: 3000
		  });
		});
	</script>
<script src="//unpkg.com/layui@2.9.7/dist/layui.js"></script>
</body>
</html>