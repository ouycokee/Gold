<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<style>
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
				background-image: url(img/主页钻石.png);
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
		

	</style>
<body>
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
                <img src="../img/全国联保.png"/>
                <div class="zunxiang_div1">全国联保</div>
                <div class="zunxiang_div2">凭产品及保证单在全国任何
                    周大福分店均可享受联保服务</div>
            </li>
            <li>
                <img src="../img/刻字服务.png"/>
                <div class="zunxiang_div1">刻字服务</div>
                <div class="zunxiang_div2">提供免费刻字服务
                    为您呈现不一样的服务</div>
            </li>
            <li>
                <img src="../img/线下服务.png"/>
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
</body>

	
	<script>
		const huidaodingduan = document.querySelector('.huidaodingduan');
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
	</script>
</html>