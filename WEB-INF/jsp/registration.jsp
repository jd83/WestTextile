<%@ page pageEncoding="gb2312" contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>注册帐号</title>
<link href="../resource/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<meta name="keywords" content="Hiking Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,300,700,800' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="../resource/css/flexslider.css" type="text/css" media="screen" />
<script src="../resource/js/jquery.min.js"></script>
<link href="../resource/css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
<script src="../resource/js/jquery.magnific-popup.js" type="text/javascript"></script>
<script>
		$(document).ready(function() {
		$('.popup-with-zoom-anim').magnificPopup({
		type: 'inline',
		fixedContentPos: false,
		fixedBgPos: true,
		overflowY: 'auto',
		closeBtnInside: true,
		preloader: false,
		midClick: true,
		removalDelay: 300,
		mainClass: 'my-mfp-zoom-in'
		});
		});

		function showChkInfo(obj,disDiv){
			chkShopInfo=document.getElementById(obj.id);
			if (chkShopInfo.checked)
			{
				document.getElementById(disDiv).setAttribute("style","display: block;");
				if((obj.id).indexOf("ShopInfo")>-1){
					document.getElementById("divShopInfo").setAttribute("style","display: block;");
				}				
			}else{
				document.getElementById(disDiv).setAttribute("style","display: none;");
			}
		}

		function addShopInfo(){
			var divShopInfo=document.getElementById("divShopInfo").cloneNode(true);
			var top=document.getElementById("divShopInfoAuto");
			var divShopInfoCnt=top.childNodes.length;
			divShopInfo.id="divShopInfo-"+(divShopInfoCnt-2);
			top.appendChild(divShopInfo);
		}

		function removeShopInfo(obj){
			var top=document.getElementById("divShopInfoAuto");
			if(obj.id!="divShopInfo"){
				top.removeChild(obj);
			}			
		}
	</script>
</head>
<body style="background-color:#E6E6FA" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- header -->
<table width="90%" border="0" cellpadding="0" cellspacing="0" align="center">
	<tr><td>
	<div class="header">
  	    <div class="container">
			<div class="header-top">
				<div class="header-right">
					<img src="../resource/images/logo.jpg" class="img-responsive" alt="" />
				</div>
				<div class="header-left" style="font-size:12px;font-family:微软雅黑">
					<ul>
						<li><a href="Register_Forward">注册</a></li>
						<li class="active"><a href="login.html">登录</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div> 				

<!-- header -->
			<div class="header-bottom"  style="background-color:#7CCD7C">
				<div class="container">
					<div class="head-nav" style="font-size:11px;font-family:微软雅黑">
						<span class="menu"> </span>
							<ul>
								<li><a href="HelloWorld.action">主页</li>
								<li><a href="about.html">商铺查询</a></li>
								<li><a href="about.html">费用管理</a></li>
								<li><a href="news.html">资料馆</a></li>
								<li><a href="news.html">问题建议</a></li>
								<li><a href="events.html">联系我们</a></li>
								<div class="clearfix"> </div>
							</ul>
					</div>
					<div class="clearfix"> </div>
					<!-- script-for-nav -->
					<script>
						$( "span.menu" ).click(function() {
						  $( ".head-nav ul" ).slideToggle(300, function() {
							// Animation complete.
						  });
						});
					</script>
					<!-- script-for-nav -->
				</div>

			</div>
<!-- content -->

<!-- registration -->
	<div class="main-1" style="background-color:#7CCD7C">
		<div class="container">
			<div class="register">
		  	  <form action="Register"> 
				 <div class="register-top-grid">
					<h3>个人信息</h3>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>手机/邮箱<label>*</label></span>
						<input type="text" name="userWithBLOBs.username"/> 
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>QQ名<label>*</label></span>
						<input type="text"  name="userWithBLOBs.displayname"> 
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>密码<label>*</label></span>
						<input type="text" name="userWithBLOBs.password">
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>确认密码<label>*</label></span>
						<input type="text">
					 </div>

					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" id="chkShopInfo" onclick="showChkInfo(this,'divShopInfoAuto');"><i> </i>验证商铺信息（验证该信息后，才能使用查询管理功能）</label>
					   </a>
				</div>
				 <div class="register-bottom-grid" id="divShopInfoAuto" style="display: none">	
				
					 <div class="register-bottom-grid" id="divShopInfo" style="display: none">
						 <span>增加商铺<input type="button" value="+" onclick="addShopInfo();"/>&nbsp&nbsp删除商铺<input type="button" value="-" onclick="removeShopInfo(this.parentNode.parentNode);"/></span>
							 <div class="wow fadeInLeft" data-wow-delay="0.4s">
								<span>商铺号<label>*</label></span>
								<input type="text" name="shopname"  value="格式：x-x-x。如1-1-1" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '格式：x-x-x';}"> 
							 </div>
							 <div class="wow fadeInRight" data-wow-delay="0.4s">
								<span>商铺类型<label>*</label></span>
								<div>
									<table>
										<tr>
											<td>经营权<input type="radio" name="shoptype" value="经营权"/></td>
											<td>产权<input type="radio" name="shoptype" value="产权"/></td>
										</tr>
									</table>							
								</div>
							 </div>
							 <div class="wow fadeInLeft" data-wow-delay="0.4s">
								<span>商铺面积<label>*</label></span>
								<input type="text" name="shopsquare"> 
							 </div>
							 <div class="wow fadeInRight" data-wow-delay="0.4s">
								<span>商铺总价<label>*</label></span>
								<input type="text" name="shopamount">
							 </div>
					 </div>
				  </div>
				 <div class="register-top-grid">
					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" id="chkAdditionInfo" onclick="showChkInfo(this,'divAdditionInfo');"><i> </i>补充个人信息</label>
					   </a>
				</div>
				 <div class="register-bottom-grid" id="divAdditionInfo" style="display: none">
						 <div class="wow fadeInLeft" data-wow-delay="0.4s">
							<span>身份证号码</span>
							<input type="text" name="userWithBLOBs.identityid"> 
						 </div>
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>QQ号码</span>
							<input type="text"  name="userWithBLOBs.qqnumber">
						 </div>
						 <div class="wow fadeInLeft" data-wow-delay="0.4s">
							<span>职业</span>
							<input type="text" name="userWithBLOBs.career"> 
						 </div>
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>年龄</span>
							<input type="text" name="userWithBLOBs.age">
						 </div>		
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>备注</span>
							<input type="text" name="userWithBLOBs.note">
						 </div>							 
				 </div>

				<div class="clearfix"> </div>
				<div class="register-but">
				   <input type="submit" value="注册">
				   <div class="clearfix"> </div>
				</div>
			</form>
		   </div>
		 </div>
	</div>
<!-- registration -->
<!-- content -->
<!-- footer -->
	<div class="footer" style="background-color:#7CCD7C">
		<div class="container">
			<div class="bottom">
				<p>Copyright &copy; 2015.West Textile Member All rights reserved.</p>
			</div>
		</div>
	</div>
<!-- footer -->


	</td></tr>
</table>
</body>
</html>