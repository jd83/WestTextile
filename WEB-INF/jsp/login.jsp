<%@page import="org.apache.struts2.components.Include"%>
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
<%@include file="top.jsp" %>
<!-- content -->
	<div class="main-1" style="background-color:#7CCD7C">
		<div class="container" style="min-height:270px" align="center">
		  	  <form action="Login" method="POST"> 

				  	  <table name="logintb" style="width:50%">
				  	  <tr><td>
					  	  <div class="login-top-grid">
					  	  	<table style="width:80%"  align="center">
						  	  	<tr><td align="center">
									<h3>��¼</h3>			  	  	
						  	  	</td></tr>
						  	  	<tr><td>
									 <div class="wow fadeInLeft" data-wow-delay="0.4s" >
										<s:fielderror></s:fielderror>
										<span>�ֻ�/����<label>*</label></span>
										<input type="text" name="userWithBLOBs.username" value="<s:property value='#request.userWithBLOBs.username'/>" size="50%"/> 
									 </div>					  	  	
						  	  	</td></tr>
						  	  	<tr><td>
									 <div class="wow fadeInLeft" data-wow-delay="0.4s">
										<span>����<label>*</label></span>
										<input type="text" name="userWithBLOBs.password" value="<s:property value='#request.userWithBLOBs.password'/>" size="50%"/>
									 </div>				  	  	
						  	  	</td></tr>				  	  	
					  	  	</table>
					  	  </div>
				  	  </td></tr>
				  	  <tr><td align="center">
						<div class="clearfix"> </div>
						<div class="register-but">
						   <input type="submit" value="��¼">
						   <div class="clearfix"> </div>
						</div>					  	  
				  	  </td></tr>
				  	  <tr><td>
						<div class="login-top-grid" align="center">
						<table style="width:80%">
							<tr align="center"><td>
								<span><a href="#">�������룿</a></span>
							</td><td>
								<span><a href="Register_Forward">ע���ʺ�</a></span>
							</td></tr>
						</table>
						</div>
				  	  </td></tr>				  	  
				  	  	
				  	  </table>				 

			
			</form>	
		</div>
	</div>
<!-- content -->
<!-- footer -->
<%@include file="footer.jsp" %>
<!-- footer -->
	</td></tr>
</table>
</body>
</html>