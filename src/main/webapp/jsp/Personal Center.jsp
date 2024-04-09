<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <style>
           body {
               font-family: Arial, sans-serif;
               margin: 0;
               padding: 0;
           }
           .sidebar {
			   display: inline-block;
               width: 250px;
               background-color: #f4f4f4;
               padding: 20px;
           }
           .sidebar ul {
               list-style-type: none;
               padding: 24px;
               margin: 0;
           }
           .sidebar li {
               margin-bottom: 10px;
			   font-size: 14px;
           }
           .sidebar li div {
               cursor: pointer;
               padding: 5px 10px;
               background-color: #ddd;
               border-radius: 5px;
           }
		    .content-wrapper {
					width: 100%;
		               flex: 1;
					   height: 740PX;
						margin-top: -595PX;
		               padding: 20px;
		               display: flex;
		               justify-content: center;
		           }
           .content-section {
                display: none;
				padding: 20px;
                background-color: #fff;
                border: 1px solid #ddd;
                border-radius: 5px;
                margin-top: -207px;
				margin-right: -584px;
				height: 100%;
                width: 100%; /* 控制内容区域宽度 */
                max-width: 100%; /* 设置最大宽度以防止内容过长 */
           }
		  .kuang {
		      width: 1100px;
		      display: inline-block;
		      vertical-align: middle; /* 可选，使图片和文字垂直居中 */
		  }
		  
		  .xbt {
		      display: inline-block;
		      vertical-align: middle; /* 可选，使图片和文字垂直居中 */
		      margin-left: -4px;
		      font-size: 16px;
			  font-weight: bold;
		      font-weight: 500;
		      color: #6d584f;
		      line-height: 25px;
		  }
		  
		  .kuai > img {
		      width: 15%;
		      /* 修改下面的属性值 */
		      vertical-align: middle; /* 让图片和文字垂直居中 */
		      margin-top: 0; /* 将图片顶部边距设为0，与文字对齐 */
		      margin-bottom: 0; /* 将图片底部边距设为0 */
		      background-size: contain;
		      background-repeat: no-repeat;
		  }
		    /* 悬浮效果样式 */
		       ul li:hover {
		           background-color: #f0f0f0; /* 鼠标悬浮时的背景色 */
		           cursor: pointer; /* 鼠标变为手型 */
		       }
			    /* 点击后的样式 */
			       .selected {
			           background-color: #f0f0f0; /* 点击后的背景色 */
			       }
       </style>
</head>
<body>
    <div class="kuang">
       <div class="sidebar">
            <ul>
                <li>
					<div class="kuai">
						<img src="../img/个人中心.png"/>
						<div class="xbt">个人中心</div>
					</div>
                    <ul class="divider">
                        <li onclick="showSection('overview')">
							<span>账号概览</span>
						</li>
                        <li onclick="showSection('account-info')">
							<span>账号信息</span>
						</li>
                        <li onclick="showSection('address')">
							<span>地址管理</span>
						</li>
                        <li onclick="showSection('footprint')">
							<span>我的足迹</span>
						</li>
                        <li onclick="showSection('membership')">
							<span>会籍资料</span>
						</li>
                    </ul>
                </li>
                <li>
					<div class="kuai">
						<img src="../img/查询服务.png"/>
						<div class="xbt">订单中心</div>
					</div>
                    <ul class="divider">
                        <li onclick="showSection('my-orders')">
							<span>我的订单</span>
							</li>
                        <li onclick="showSection('refund')">
							<span>退款/售后</span>
						</li>
                    </ul>
                </li>
                <li>
					<div class="kuai">
						<img src="../img/订单中心.png"/>
						<div class="xbt">查询服务</div>
					</div>
                    <ul class="divider">
                        <li onclick="showSection('invoice')">
							<span>发票管理</span>
							</li>
                        <li onclick="showSection('product-review')">
							<span>商品审核</span>  
							</li>
                        <li onclick="showSection('e-receipt')">
							<span>电子保证单</span>
							</li>
                    </ul>
                </li>
                <li>
					<div class="kuai">
						<img src="../img/帮助及反馈.png"/>
						<div class="xbt">帮助及反馈</div>
					</div>
                    <ul class="divider">
                        <li onclick="showSection('help')">
							<span>帮助中心</span>
							</li>
                        <li onclick="showSection('feedback')">
							<span>意见反馈</span>
							</li>
                        <li onclick="showSection('appeal')">
							<span>会员卡申诉</span>
							</li>
                    </ul>
                </li>
            </ul>
        </div>
		<div class="content-wrapper">
			<div id="overview" class="content-section">账号概览内容</div>
			<div id="account-info" class="content-section">账号信息内容</div>
			<div id="address" class="content-section">地址管理内容</div>
			<div id="footprint" class="content-section">我的足迹内容</div>
			<div id="membership" class="content-section">会籍资料内容</div>
			<div id="my-orders" class="content-section">我的订单内容</div>
			<div id="refund" class="content-section">退款/售后内容</div>
			<div id="invoice" class="content-section">发票管理内容</div>
			<div id="product-review" class="content-section">商品审核内容</div>
			<div id="e-receipt" class="content-section">电子保证单内容</div>
			<div id="help" class="content-section">帮助中心内容</div>
			<div id="feedback" class="content-section">意见反馈内容</div>
			<div id="appeal" class="content-section">会员卡申诉内容</div>
		</div>
    </div>
	<script>
		 // JavaScript 代码
		    function changeColor(element, section) {
		        // 获取所有的 <li> 元素
		        var listItems = document.querySelectorAll('ul li');
		        
		        // 移除所有元素的选中状态
		        listItems.forEach(function(li) {
		            li.classList.remove('selected');
		        });
		        
		        // 将当前点击的元素设为选中状态
		        element.classList.add('selected');
		        
		        // 调用showSection函数
		        showSection(section);
		    }
		    
		    function showSection(section) {
		        // 这里可以添加显示相应内容的代码，例如：
		        console.log('显示' + section + '的内容');
		    }
					
	</script>

    <script>
		 
			
        function showSection(sectionId) {
            // Hide all sections
            var sections = document.getElementsByClassName('content-section');
            for (var i = 0; i < sections.length; i++) {
                sections[i].style.display = 'none';
            }

            // Show the selected section
            document.getElementById(sectionId).style.display = 'block';
        }
    </script>
</html>