<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 
<link rel="icon" href="../img/clown.png" type="image/png">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>商品详情</title>
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
            width: 100%;
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
			display: flex;
			flex-wrap: wrap;
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
		    border: 2px solid #862633;
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
			margin-top: 30px;
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
    </style>
</head>
<body>

<%@include file="head.jsp" %>
<div class="shop_detail">
    <div class="shop_left">
        <div class="shop_left_imglist">
            <div class="imglist"><img src="../img/long2.jpg" onclick="selectImage(this)"/></div>
            <div class="imglist"><img src="../img/long.jpg" onclick="selectImage(this)"/></div>
            <div class="imglist"><img src="../img/long1.jpg" onclick="selectImage(this)"/></div>
            <div class="imglist"><img src="../img/long3.jpg" onclick="selectImage(this)"/></div>
        </div>
        <div class="shop_left_imgbig" id="selectedImage"></div>
    </div>
    <div class="shop_right">
		<div class="shop_right_title">
			周大福 龙年生肖系列 行运一条龙黄金金章
		</div>
		<div class="shop_right_price">
			￥100.00
		</div>
		<div class="shop_right_seleprice">
			<div class="shop_right_seleprice_div">
				<div class="shop_right_seleprice_top">价格</div>
				<div class="shop_right_seleprice_center">
					<div class="shop_right_seleprice_center_price">
						100.00
					</div>
					<div class="shop_right_seleprice_center_price">
						200.00
					</div>
					<div class="shop_right_seleprice_center_price">
						300.00
					</div>
					<div class="shop_right_seleprice_center_price">
						400.00
					</div>
					<div class="shop_right_seleprice_center_price">
						500.00
					</div>
					<div class="shop_right_seleprice_center_price">
						600.00
					</div>
					<div class="shop_right_seleprice_center_price">
						700.00
					</div>
					<div class="shop_right_seleprice_center_price">
						800.00
					</div>
				</div>
			</div>
		</div>
		<div class="shop_right_count_div">
			<div class="shop_right_count_left">购买数量</div>
			<div class="shop_right_count_right">
				<div class="shop_right_count_right_kucun">1024库存</div>
				<div class="shop_right_count_right_shuliang">
				    <button onclick="decreaseQuantity()">-</button>
				    <input type="number" value="1" min="1" max="1024" onchange="updateQuantity(this.value)">
				    <button onclick="increaseQuantity()">+</button>
				</div> 
			</div>
		</div>
		<div class="shop_right_btn">
			<button class="shop_right_btn_left">加入购物车</button>
			<button class="shop_right_btn_right">立即购买</button>
		</div>
	</div>
</div>
<hr>
<%@include file="footer.jsp" %>
<script>
	document.addEventListener("DOMContentLoaded", function() {
	    var firstImage = document.querySelector('.imglist img');
	    firstImage.classList.add('selected');
	    document.getElementById('selectedImage').innerHTML = '<img src="' + firstImage.src + '" style="max-width:100%; max-height:100%;">';
	});
	
	var shop_price_div = document.querySelectorAll('.shop_right_seleprice_center_price');
	
	shop_price_div.forEach(function(element) {
	    element.addEventListener("click", function() {
	        // 移除所有价格元素的选中状态
	        shop_price_div.forEach(function(el) {
	            el.classList.remove('selected');
	        });
	        // 添加当前点击的价格元素的选中状态
	        element.classList.add('selected');
	
	        // 获取选中价格的值
	        var price = element.innerText.trim();
	        // 设置选中价格到shop_right_price中
	        document.querySelector('.shop_right_price').innerText = "￥"+price;
	    });
	});
	
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
	    let maxStock = 1024; // 库存数量，根据实际情况修改
	    if (currentValue < maxStock) {
	        input.value = currentValue + 1;
	    }
	}
	
	function updateQuantity(value) {
	    let input = document.querySelector('.shop_right_count_right_shuliang input');
	    let newValue = parseInt(value);
	    let maxStock = 1024; // 库存数量，根据实际情况修改
	    if (newValue < 1) {
	        input.value = 1;
	    } else if (newValue > maxStock) {
	        input.value = maxStock;
	    }
	}

</script>

</body>
</html>
