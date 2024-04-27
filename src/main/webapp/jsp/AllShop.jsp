<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<script src="../jquery.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>全部商品</title>
<link rel="icon" href="../img/clown1.png" type="image/png">
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
			margin-top:30px;
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
		.seach_text{
			text-align:center;
			margin-bottom:50px;
			font-size:25px;
		}
		.shop_type, .shop_detail {
		    width: 122px;
		    height: 25px;
		    font-size: 12px;
		    border: 1px solid rgb(134, 38, 51);
		}
		.select_shop{
		    width: 400px;
		    height: 30px;
		    display: flex;
		    flex-direction: row;
		    margin-left:270px;
		    justify-content: space-between;
		}
		.paixu {
		    font-size: 14px;
		    width: 200px;
		    color: gray;
		    display: flex;
		    align-items: center;
		}
		.shop_type{
			width:100px;
		}
	</style>
</head>
<body>

<%@include file="head.jsp" %>
	<main style="background-color:rgb(248,248,248);padding-top:50px;">
	<div class = "select_shop">
		<div class="paixu">
			所有类别：<select class="shop_type">
				<option>所有商品</option>
				<option>戒指</option>
				<option>手环、手链</option>
				<option>元宝</option>
				<option>项链</option>
			</select>
		</div>
		<div class="paixu">
			排序方式：<select class="shop_detail">
				<option>默认排序</option>
				<option>价格由高到低</option>
				<option>价格由低到高</option>
				<option>最新上架</option>
			</select>
		</div>
		
	</div>
        <ul class="main_ul">
			<c:forEach var="product" items="${prolist}">
			    <li class="main_li">
			        <img src="../img/${product.imageUrl}"/>
			        <div>${product.proName}</div>
			        <div class="main_price">￥${product.price}</div>
			    </li>
			</c:forEach>
        </ul>
</main>
<%@include file="footer.jsp" %>
</body>
<script>
	//选择类型
	var stype = document.querySelector('.shop_type');
	//选择排序方式
	var sorder = document.querySelector('.shop_detail');
	stype.addEventListener('change', function() {
	    var seleval = stype.options[stype.selectedIndex].text;
	    var url = 'all?seleval=' + seleval;
	    location.href = url;
	});
	sorder.addEventListener('change', function(){
	    var seleor = sorder.options[sorder.selectedIndex].text;
	    var url = 'all?seleor=' + seleor;
	    location.href = url;
	})
	var seleval = "${seleval}"; // 获取选项的值
	var seleor = "${seleor}"; // 获取选项的值

	// 遍历每个选项
	for (var i = 0; i < stype.options.length; i++) {
	    if (stype.options[i].text === seleval) { // 如果选项的文本内容与 seleval 匹配
	        stype.options[i].selected = true; // 将该选项设置为选中状态
	        break; // 停止循环
	    }
	}
	// 遍历每个选项
	for (var i = 0; i < sorder.options.length; i++) {
	    if (sorder.options[i].text === seleor) {
	        sorder.options[i].selected = true;
	        break;
	    }
	}

</script>
</html>