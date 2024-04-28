<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 
<link rel="icon" href="../img/clown1.png" type="image/png">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>黄金珠宝商品详情</title>
    <style>
        .shop_detail {
            width: 100%;
		    height: 690px;
		    margin: 0 auto;
		    padding: 0;
		    display: flex;
		    justify-content: center;
        }
        .shop_left {
            width: 738px;
            display: flex;
        }
		.shop_right {
			margin-top: 70px;
			display: flex;
			width: 412px;
			justify-content: flex-start;
			flex-direction: column;
		}

        .shop_left_imglist {
            width: 88px;
            height: 100%;
            display: flex;
            flex-direction: column;
            justify-content: space-evenly;
        }
        .imglist {
            width:95%;
            cursor: pointer;
        }
        .imglist img {
            width: 100%;
        }
        .shop_left_imgbig {
            width: 80%;
            margin-left:20px;
            height: 100%;
            background-color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
        }
		.shop_right_title{
			width: 360px;
			font-size: 24px;
			font-weight: 400;
			color: #333;
			line-height: 33px;
		}
		.shop_right_price{
			font-size: 24px;
			color: #862633;
			margin-top: 20px;
		}
		.shop_right_seleprice_center{
			float: left;
		}
		.shop_right_seleprice_center_price{
			margin-top: 10px;
			height: 34px;
			margin-right: 10px;
			margin-bottom: 10px;
			padding: 0 12px;
			background: #f8f8f8;
			border: 1px solid #f8f8f8;
			color: #333;
			font-size: 14px;
			text-align: center;
			line-height: 36px;
			cursor: pointer;
		}
		.shop_right_seleprice_top,.shop_right_count_left,.shop_right_count_right_kucun{
			color: #999;
		}
		.shop_right_seleprice{
			margin-top: 20px;
		}
		.selected {
			background-color: #faf6f1;
		    border: 1px solid #862633;
		}
		.shop_right_count_div{
			display: flex;
			justify-content: space-between;
			margin-top: 35px;
			align-items: center;
		}
		.shop_right_count_right{
			display: flex;
			align-items: center;
		}
		.shop_right_count_right_shuliang {
			display: flex;
			align-items: center;
		}
	
		.shop_right_count_right_shuliang button {
			width: 40px;
			height: 44px;
			background-color: #f8f8f8;
			border: 1px solid #ccc;
			display: flex;
			justify-content: center;
			align-items: center;
			cursor: pointer;
			font-size: 18px;
		}
	
		.shop_right_count_right_shuliang input {
			width: 65px;
			height: 40px;
			text-align: center;
			border: 1px solid #ccc;
			font-size: 16px;
		}
		.shop_right_count_right_kucun{
			margin-right: 10px;
		}
		.shop_right_btn{
			display: flex;
			margin-top: 25%;
		}
		.shop_right_btn_left,.shop_right_btn_right{
			width: 207px;
			height: 46px;
			cursor: pointer;
		}
		.shop_right_btn_left{
			border: 1px solid #862633;
			color: #862633;
			background-color: white;
		}
		.shop_right_btn_right{
			background-color: #862633;
			border: none;
			color:white;
		}
	    .shop_right_select_detail{
	    	display:flex;
	    	background-color:red;
	    }
	    .empty-row {
		    clear: both;
		    height:10px;
		}
    </style>
    <script type="text/javascript" src = '../jquery.min.js'></script>
</head>
<body>

<%@include file="head.jsp" %>
<div class="shop_detail">
    <div class="shop_left">
        <div class="shop_left_imglist">
		    <c:forEach var="image" items="${listimgx}">
		        <div class="imglist"><img src="../img/${image.imageUrl}" image="${image.imageUrl}" onclick="selectImage(this)"/></div>
		    </c:forEach>
		</div>
        <div class="shop_left_imgbig" id="selectedImage"></div>
    </div>
    <div class="shop_right">
		<div class="shop_right_title">
			<c:forEach var="name" items="${listnamex}">
				${name.detail}
			</c:forEach>
		</div>
		<span class="shop_right_price"></span>
		<div class="shop_right_seleprice">
			<div class="shop_right_seleprice_div">
			<c:forEach var="specs" items="${listspeid}" varStatus="va">
			    <div class="shop_right_seleprice_top" spename = "${specs.speName}">${specs.speName}</div>
			    <c:forEach var="detail" items="${listdetail[va.index]}" varStatus="vb">
				        <div class="shop_right_seleprice_center">
						    <div class="shop_right_seleprice_center_price ${va.first ? 'first' : 'second'}" data-proid="${proid}" data-detail="${detail.detail}">
						        ${detail.detail}
						    </div>
						</div>
			    </c:forEach>
			    <div class="empty-row"></div>
			</c:forEach>

			</div>
		</div>		     
		<div class="shop_right_btn">
			<a href="shopcartzj"></a><button class="shop_right_btn_left">加入购物车</button>
			<a><button class="shop_right_btn_right">立即购买</button></a>
		</div>
	</div>
</div>
<hr>
<%@include file="footer.jsp" %>
<script>
	function ajax(proid,detils){
		$.getJSON('shopdetail',{
			proid : proid,
			detils : detils
		},function(result){
			var formatterResult = result.listpri[0].price;
			$(".shop_right_price").text("￥"+formatterResult);
		})
	}
	
	
	document.addEventListener("DOMContentLoaded", function() {
	    var firstImage = document.querySelector('.imglist img');
	    firstImage.classList.add('selected');
	    document.getElementById('selectedImage').innerHTML = '<img src="' + firstImage.src + '" style="max-width:100%; max-height:100%;">';
	});

	
	//加入购物车
	var shop_cart = document.querySelectorAll('.shop_right_btn_left');
	
	shop_cart.forEach(function(element) {
	    element.addEventListener("click", function(e) {
	      	//获取规格和名字
			var shopname = $('.shop_right_title').text();
			var detail1 = $('.shop_right_seleprice_center_price.first.selected').attr('data-detail');
	        var detail2 = $('.shop_right_seleprice_center_price.second.selected').attr('data-detail');
	        var spenames = [];
	        $('.shop_right_seleprice_top').each(function() {
	            var spename = $(this).attr('spename'); // 获取当前元素的 spename 属性值
	            spenames.push(spename); // 将该值添加到数组中
	        });
	        //商品id
	        var proid = ${proid};
	        //图片路径
	        var image = $('.imglist img').attr('image');
	        //商品名字加规格
	        var cname = null;
	        if(detail2 == null){
	        	cname = shopname + "," + detail1;
	        }else{
	        	cname = shopname + "," + detail1 + "," + detail2;
	        }

			// 如果spenames不为空，则拼接到cname中
	        //价格
	        var priceText = $('.shop_right_price').text();
	        var cprice = priceText.substring(priceText.indexOf('￥') + 1);
	        var url = 'shopcart?proid=' + proid + "&image=" + image +"&cname=" + cname + "&cprice=" + cprice + "&spenames=" + spenames;
	        
	        // 执行跳转
	        location.href = url;
	    });
	});


	
	var shop_price_first = document.querySelectorAll('.shop_right_seleprice_center_price.first');
	var shop_price_second = document.querySelectorAll('.shop_right_seleprice_center_price.second');

	shop_price_first.forEach(function(element) {
	    element.addEventListener("click", function(e) {
	        // 移除所有价格元素的选中状态
	        document.querySelectorAll('.shop_right_seleprice_center_price.first').forEach(function(el) {
	            el.classList.remove('selected');
	        });
	        // 添加当前点击的价格元素的选中状态
	        element.classList.add('selected');

	        // 更新当前选中的价格元素
	        selectedPriceElement = element;
	        //alert($('.shop_right_seleprice_center_price.second').eq(0).attr('data-detail'));	
			//location.href = 'promessage?detail='+$('.shop_right_seleprice_center_price').eq(0).attr('detail')+"&id=1";
	        // 获取选中价格的值
	        var price = element.innerText.trim();
	        
	        e.preventDefault();
	        var proid = $(this).data("proid");
	        var detail = $(this).data("detail");
	        ajax(proid, detail);
	    });
	});


	// 为第二类价格元素添加点击事件监听器
	shop_price_second.forEach(function(element) {
	    element.addEventListener("click", function(e) {
	        // 移除所有价格元素的选中状态
	        document.querySelectorAll('.shop_right_seleprice_center_price.second').forEach(function(el) {
	            el.classList.remove('selected');
	        });
	        // 添加当前点击的价格元素的选中状态
	        element.classList.add('selected');

	        // 更新当前选中的价格元素
	        selectedPriceElement = element;

	        // 获取选中价格的值
	        var price = element.innerText.trim();
	        
	        e.preventDefault();
	        var proid = $(this).attr("data-proid");
	        var detail = $(this).attr("data-detail");
	        ajax(proid,detail);
	    });
	});


	//选择h
	function selectImage(image) {
	    let selectedImg = document.querySelector('.imglist img.selected');
	    if (selectedImg) {
	        selectedImg.classList.remove('selected');
	    }
	    image.classList.add('selected');
	    document.getElementById('selectedImage').innerHTML = '<img src="' + image.src + '" style="max-width:100%; max-height:100%;">';
	}
	
	
	function decreaseQuantity() {
	    let input = document.querySelector('.shop_right_count_right_shuliang input');
	    let currentValue = parseInt(input.value);
	    if (currentValue > 1) {
	        input.value = currentValue - 1;
	    }
	}
	
	function increaseQuantity() {
	    let input = document.querySelector('.shop_right_count_right_shuliang input');
	    let currentValue = parseInt(input.value);
	    let maxStock = 3; // 库存数量，根据实际情况修改
	    if (currentValue < maxStock) {
	        input.value = currentValue + 1;
	    }
	}
	
	function updateQuantity(value) {
	    let input = document.querySelector('.shop_right_count_right_shuliang input');
	    let newValue = parseInt(value);
	    let maxStock = 3; // 库存数量，根据实际情况修改
	    if (newValue < 1) {
	        input.value = 1;
	    } else if (newValue > maxStock) {
	        input.value = maxStock;
	    }
	}
	document.addEventListener("DOMContentLoaded", function() {
	    // 默认选中第一个价格元素
	    var default1 = document.querySelector('.shop_right_seleprice_center_price.first');
	    default1.classList.add('selected');

	    // 触发默认选中价格元素的点击事件
	    default1.click();
	});
	document.addEventListener("DOMContentLoaded", function() {
	    var default2 = document.querySelector('.shop_right_seleprice_center_price.second');
	    default2.classList.add('selected');

	    // 触发默认选中价格元素的点击事件
	    default2.click();
	});

</script>

</body>
</html>
