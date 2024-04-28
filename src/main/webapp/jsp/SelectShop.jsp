<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<script src="../jquery.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>搜索</title>
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
	</style>
</head>
<%@include file="head.jsp" %>
	<body> 
<main style="background-color:rgb(248,248,248);padding-top:50px;">
    <c:choose>
        <c:when test="${empty prolist}">
            <p class="seach_text">搜索结果为空，试着找一下别的吧~</p>
        </c:when>
        <c:otherwise>
            <p class="seach_text">搜索结果</p>
            <ul class="main_ul">
                <c:forEach var="i" begin="0" end="${fn:length(prolist) - 1}">
                    <li class="main_li">
                        <img src="../img/${imgUrls[i]}"/>
                        <div>${proNames[i]}</div>
                        <div class="main_price">￥${prices[i]}</div>
                    </li>
                </c:forEach>
            </ul>
        </c:otherwise>
    </c:choose>
</main>

<%@include file="footer.jsp" %>
	</body>
</html>