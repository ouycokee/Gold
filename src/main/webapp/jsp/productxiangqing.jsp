
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
		.cxtable {
		      border-collapse: collapse;
			  margin-left: 75px;
			  width: 90%;
			  background-color: #f2f2f2;
			  box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
		}
		
		.cxtable th, .cxtable td {
		  padding: 8px;
		  text-align: left;
		  border-bottom: 1px solid #ddd;
		}
		
		.cxtable th {
		  background-color: #f5f5f5;
		}
		
		.cxtable tr:hover {
		  background-color: #f9f9f9;
		  transform: scale(1.05);
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
				<form action="deleteServlet" method="get" class="shanc">
					<input type="hidden" name="selectedIds" id="selected-ids" value="">
					<table id="table1">
						<tr>
							<th></th>
							<th>Id</th>
							<th>商品名称</th>
							<th>商品状态</th>
							<th>分类Id</th>
							<th>分类名称</th>
						</tr>
						<c:forEach items="${product}" var="i">
			                <tr>
			                	<td><input type="checkbox" name="fuxuan"></td>
			                    <td><c:out value="${i.getProId()}"/></td>
			                    <td><c:out value="${i.getProName()}"/></td>
			                    <td><c:out value="${i.getProStatus()==1?'上架':'下架'}"/></td>
			                    <td><c:out value="${i.getCate_id()}"/></td>
			                    <td><c:out value="${i.getCate_name()}"/></td>
			                </tr>
			            </c:forEach>
					</table>
				  </form>
				<f:page controller="productServlet" pagesize="${pagesize}" total="${total}" curpage="${param.curpage}" where=""></f:page>
				<div class="tianjia">
					<h2 class="form-title">添加新商品</h2>
					
					<form class="form-container" action="productInsertServlet" method="get">
						<input type="hidden" value="1" name="yanzheng"/>
					    <label for="username" class="form-label">商品名:</label>
					    <input type="text" name="name" class="form-input">

					    <label for="email" class="form-label">商品分类:</label>
					    <select name="fenlei" class="form-input">
					        <option value="1">戒指</option>
					        <option value="2">手环</option>
					        <option value="3">元宝</option>
					    </select>
					
					    <label for="gender" class="form-label">商品状态:</label>
					    <select name="zhuangtai" class="form-input">
					        <option value="1">上架</option>
					        <option value="2">不上架</option>
					    </select>

					    <input type="submit" value="提交" class="form-submit">
					</form>
										
				</div>
				<div class="genggai">
					<h2 class="form-title">更改商品信息</h2>
				    <form class="form-container" action="productInsertServlet" method="get">
				    	<input type="hidden" value="2" name="yanzheng"/>
				    	<select name="id" class="form-input">
					        <c:forEach items="${proid}" var="d">
					        	<option value="${d.proId}">${d.getProId()}</option>
					        </c:forEach>
					    </select>
				    	
				        <label for="username" class="form-label">商品名:</label>
					    <input type="text" name="name" class="form-input">

					    <label for="email" class="form-label">商品分类:</label>
					    <select name="fenlei" class="form-input">
					        <option value="1">戒指</option>
					        <option value="2">手环</option>
					        <option value="3">元宝</option>
					    </select>
					
					    <label for="gender" class="form-label">商品状态:</label>
					    <select name="zhuangtai" class="form-input">
					        <option value="1">上架</option>
					        <option value="2">不上架</option>
					    </select>

					    <input type="submit" value="提交" class="form-submit">
				    </form>
				</div>
				<div class="chaxun">
					<h2 class="form-title">添加新用户</h2>
					<form class="form-container">
						<input type="hidden" value="1" name="yanzheng"/>
					    <label for="tiaojiao" class="tiaojian">条件</label>
					    <input type="text" name="tiaojian" id="tj" class="form-input">
					    <input type="button" id="cha" value="查询" class="form-submit">
					</form>
					<table class="cxtable">
						
					</table>
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
        $('.form-submit').click(function(){
        	var tj=$('#tj').val();
        	$.ajax({
        		TYPE:'GET',
        		url:'chaxunServlet',
        		data:{
        			tiaojian:tj,
        			panduan:"product"
        			},
        		success:function(response){
        			$('.cxtable').html(response);
        		}
        	});
        });
        $('.shan').click(function(){
        	$('.shanc').submit();
        });
    </script>
     <script>
    	var checkboxes = document.querySelectorAll('.fuxuan');
    	var selectedIdsInput = document.getElementById('selected-ids');
    	checkboxes.forEach(function(checkbox){
    		checkbox.addEventListener('click',function(){
    			var row  = this.parentNode.parentNode;
    			var idElement = row.querySelector('td:nth-child(2)');
    			var id = idElement.textContent.trim();
    			if(this.checked){
    				addSelectedId(id);
    			}else{
    				removeSelectedId(id);
    			}
    		})
    	});
    	function addSelectedId(id){
    		var selectedIds = selectedIdsInput.value;
            selectedIds += id+",";
            selectedIdsInput.value = selectedIds;
    	}
    	function removeSelectedId(id){
    		var selectedIds = selectedIdsInput.value;
            selectedIds = selectedIds.replace(id + ",", "");
            selectedIdsInput.value = selectedIds;
    	}
    </script>
</body>
</html>