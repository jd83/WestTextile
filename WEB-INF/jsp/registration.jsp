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
			//divShopInfo.id="divShopInfo-"+divShopInfoCnt;

			top.appendChild(divShopInfo);			
			divShopInfos=document.getElementsByName("divShopInfo");
			divShopInfoCnt=divShopInfos.length;

			for (var k=0;k<divShopInfoCnt;k++)
			{
				var shopInfoNode=divShopInfos.item(k);
				var topNodeList=shopInfoNode.childNodes
				if(k>0){
					shopInfoNode.id="divShopInfo-"+k;
				}
				for(var i=0;i<topNodeList.length;i++){
					
					if(topNodeList.item(i).tagName!=undefined && topNodeList.item(i).tagName=="DIV"){
						var divNodeList=topNodeList.item(i).getElementsByTagName("INPUT");
						//var divNodeList=topNodeList.item(i).childNodes;
						for(var j=0;j<divNodeList.length;j++){
							
							var elementName="shops["+k+"]."+divNodeList.item(j).id;
							divNodeList.item(j).name=elementName;
						}
					}
				}
			}


		}

		function removeShopInfo(obj){
			var top=document.getElementById("divShopInfoAuto");
			var div=document.getElementsByName("divShopInfo");
			if(div.length>1){
				top.removeChild(obj);
			}			
		}
	</script>
</head>
<body style="background-color:#E6E6FA" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- header -->
<table width="90%" border="0" cellpadding="0" cellspacing="0" align="center">
	<tr><td>
<%@include file="top.jsp" %>
<!-- content -->

<!-- registration -->
	<div class="main-1" style="background-color:#7CCD7C">
		<div class="container">
			<div class="register">
		  	  <form action="<s:if test='#session.username==null||#session.username.isEmpty()'>Register</s:if><s:else>Register_Update</s:else>" method="POST"> 
				 <div class="register-top-grid">
					<font color="red" size="3"><s:fielderror></s:fielderror></font>
					<h3>个人信息</h3>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>手机/邮箱<label>*</label></span>
						<input type="text" name="userWithBLOBs.username" value="<s:property value='#request.userWithBLOBs.username'/>"/> 
						<s:hidden theme="simple" name="userWithBLOBs.userid"></s:hidden>
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>QQ名<label>*</label></span>
						<input type="text"  name="userWithBLOBs.displayname" value="<s:property value='#request.userWithBLOBs.displayname'/>"/> 
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>密码<label>*</label></span>
						<input type="text" name="userWithBLOBs.password" value="<s:property value='#request.userWithBLOBs.password'/>"/>
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>确认密码<label>*</label></span>
						<input type="text" name="repassword"/>
					 </div>

					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" id="chkShopInfo" onclick="showChkInfo(this,'divShopInfoAuto');"><i> </i>验证商铺信息（验证该信息后，才能使用查询管理功能）</label>
					   </a>
				</div>
				 <div class="register-bottom-grid" id="divShopInfoAuto" style="display: none">	
					<s:iterator value="shops" id="sp" status="u"> 
						 <div class="register-bottom-grid" id="divShopInfo" name="divShopInfo">
							 <span>增加商铺<input type="button" value="+" onclick="addShopInfo();"/>&nbsp&nbsp删除商铺<input type="button" value="-" onclick="removeShopInfo(this.parentNode.parentNode);"/></span>
								 <div class="wow fadeInLeft" name="divShopName" data-wow-delay="0.4s">
									<span>商铺号<label>*</label></span>
									<input type="text" name="shops[<s:property value='#u.index'/>].shopname" id="shopname" value="<s:property value='#sp.shopname'/>" onblur="if (this.value == '') {this.value = '格式：x-x-x';}"> 
								 </div>
								 <div class="wow fadeInRight" name="divShopType" data-wow-delay="0.4s">
									<span>商铺类型<label>*</label></span>
									<input type="text" name="shops[<s:property value='#u.index'/>].shoptype" id="shoptype" value="<s:property value='#sp.shoptype'/>" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '经营权或产权';}"> 
								 </div>
								 <div class="wow fadeInLeft" name="divShopSquare" data-wow-delay="0.4s">
									<span>商铺面积<label>*</label></span>
									<input type="text" name="shops[<s:property value='#u.index'/>].shopsquare" id="shopsquare" value="<s:property value='#sp.shopsquare'/>"/> 
								 </div>
								 <div class="wow fadeInRight" name="divShopAmount" data-wow-delay="0.4s">
									<span>商铺总价<label>*</label></span>
									<input type="text" name="shops[<s:property value='#u.index'/>].shopamount" id="shopamount" value="<s:property value='#sp.shopamount'/>"/>
								 </div>
						 </div>
					</s:iterator> 
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
							<input type="text" name="userWithBLOBs.identityid" value="<s:property value='#request.userWithBLOBs.identityid'/>"/> 
						 </div>
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>QQ号码</span>
							<input type="text"  name="userWithBLOBs.qqnumber" value="<s:property value='#request.userWithBLOBs.qqnumber'/>"/>
						 </div>
						 <div class="wow fadeInLeft" data-wow-delay="0.4s">
							<span>职业</span>
							<input type="text" name="userWithBLOBs.career" value="<s:property value='#request.userWithBLOBs.career'/>"/> 
						 </div>
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>年龄</span>
							<input type="text" name="userWithBLOBs.age" value="<s:property value='#request.userWithBLOBs.age'/>"/>
						 </div>		
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>备注</span>
							<input type="text" name="userWithBLOBs.note" value="<s:property value='#request.userWithBLOBs.note'/>"/>
						 </div>							 
				 </div>

				<div class="clearfix"> </div>
				<div class="register-but">
				   <input type="submit" value="<s:if test='#session.username==null||#session.username.isEmpty()'>注册</s:if><s:else>修改</s:else>">
				   <div class="clearfix"> </div>
				</div>
			</form>
		   </div>
		 </div>
	</div>
<!-- registration -->
<!-- content -->

<%@include file="footer.jsp" %>

	</td></tr>
</table>
</body>
</html>