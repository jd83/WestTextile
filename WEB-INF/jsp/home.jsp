<%@ page contentType="text/html;charset=gb2312" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Home</title>
<link href="../resource/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
						<s:if test="''==''">
							<li><a href="Register_Forward">注册</a></li>
							<li class="active"><a href="login.html">登录</a></li>
						</s:if>
						<s:else>
							<li class="active"><a href="login.html">用户名</a></li>
							<li><a href="#">退出</a></li>
						</s:else>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div> 				

<!-- header -->
			<div class="header-bottom"  style="background-color:#7CCD7C">
				<div class="container">
					<div class="head-nav" style="font-size:12px;font-family:微软雅黑">
						<span class="menu"> </span>
							<ul>
								<li><a href="HelloWorld">主页</li>
								<li><a href="about.html">维权历程</a></li>
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
	<div class="main-1" style="background-color:#7CCD7C">
		<div class="container" style="min-height:270px">
		</div>
	</div>
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