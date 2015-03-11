<%@ page pageEncoding="gb2312" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>注册帐号</title>
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
		String.prototype.trim=function(){
		　　    return this.replace(/(^\s*)|(\s*$)/g, "");
		}

		function isUniqueArr(arr) {
			var isUnique=true;
			var  hash = {};
			for (var i = 0, elem; (elem = arr[i]) != null; i++) {
				elem=arr[i].value;
				if (!hash[elem]) {
					hash[elem] = true;
				}else{
					isUnique=false;
				}
			}
			return isUnique;
		}

		function isUniqueStrInArr(arr,str) {
			var isUnique=true;
			for(var i=0;i<arr.length;i++){
				if(arr[i]==str){
					isUnique=false;
				}
			}
			return isUnique;
		}

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

		function addUploadFile(){
			var parentTr=document.getElementById("tbUploadFile");
			var trFile=document.getElementById("trUploadFile").cloneNode(true);
			parentTr.appendChild(trFile);
		}

		function removeUploadFile(obj){
			var parentTr=document.getElementById("tbUploadFile");
			var trFile=document.getElementsByName("trUploadFile");
			if(trFile.length>1){
				if(obj.parentNode.tagName=="TBODY"){
					obj=obj.parentNode;
				}
				parentTr.removeChild(obj);
			}			
		}


		function uploadfile(){           
			var ff = document.getElementsByName("upload");
			var isUnique=isUniqueArr(ff);
			if(ff[0].value==''|| ff[0].value==null){                 
				alert('请至少选择文件！');             
			}else if (!isUnique)
			{
				alert('上传文件不能重复，请删除重复文件！');
			}else{
				
				document.fileupload.submit();             
			}         
		} 
		function showUploadFiles(){
			var msg = '<s:property value="#message"/>'; 
			var err = '<s:property value="#error"/>'; 
			var file = '<s:property value="#request.uploadFileName"/>';
			file=file.substr(1,file.length-2);
			//parent.document.getElementById("divAddAttach").innerHTML = file; 

			parent.document.getElementById("msg").innerHTML = msg; 
			parent.document.getElementById("error").innerHTML = err; 
			if(err!=null&&err!=""){
				return;
			}
			var arrfile=file.split(",");
			for (var i=0;i<arrfile.length;i++ )
			{
				if(arrfile[i]==null||arrfile[i]==""){
					continue;
				}
				var createdFiles=parent.document.getElementsByName("filename")
				if(createdFiles==null)
					continue;
				var arrCreatedFiles=new Array();
				for(var j=0;j<createdFiles.length;j++){
					arrCreatedFiles.push(createdFiles[j].value);
				}
				var curFile=arrfile[i].trim();
				if(!isUniqueStrInArr(arrCreatedFiles,curFile)){
					continue;
				}

				var spanUploadedFile=document.createElement("input");
				var attValue=document.createAttribute("value");
				var attName=document.createAttribute("name");
				attValue.value=curFile;
				attName.value="filename"
				spanUploadedFile.setAttributeNode(attValue);
				spanUploadedFile.setAttributeNode(attName);
				parent.document.getElementById("divAddAttach").appendChild(spanUploadedFile);
			}
			parent.document.getElementById("uploadfilehtml").value=parent.document.getElementById("divAddAttach").innerHTML;

		}
		function show(){         
			var mask = document.getElementById("mask");                       
			var h_c = document.documentElement.clientHeight/3;         
			var w_c = document.documentElement.clientWidth/3;                  
			var h_b = document.body.clientHeight/3;         
			var w_b = document.body.clientWidth/3;                            
			mask.style.width = w_c > w_b ? w_c+"px" : w_b+"px";        
			mask.style.height = h_c > h_b ? h_c+"px" : h_b+"px";                  
			mask.style.left = mask.style.width;
			mask.style.top = mask.style.height;
			mask.style.display = "block";     
		}           
		function hidden(){
			var mask = document.getElementById("mask");             
			mask.style.display = "none";    
		}

		function popUpload(){         
			var mask = document.getElementById("mask");
			if(mask.style.display =="none"){
				show();
			}else{
				hidden();
			}
		}
		function closeUpload(){
			document.getElementById('mask').style.display='none';
		}

	</script>
</head>
<body onload="showUploadFiles()" style="background-color:#E6E6FA" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
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
					<font color="red" size="3"><s:fielderror/></font>
					<h3>个人信息</h3>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>手机/邮箱<label>*</label></span>
						<input type="text" name="user.username" value="<s:property value='#request.user.username'/>"/> 
						<s:hidden theme="simple" name="user.userid"></s:hidden>
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>QQ名<label>*</label></span>
						<input type="text"  name="user.displayname" value="<s:property value='#request.user.displayname'/>"/> 
					 </div>
					 <div class="wow fadeInLeft" data-wow-delay="0.4s">
						<span>密码<label>*</label></span>
						<input type="password" name="user.password" value="<s:property value='#request.user.password'/>"/>
					 </div>
					 <div class="wow fadeInRight" data-wow-delay="0.4s">
						<span>确认密码<label>*</label></span>
						<input type="password" name="repassword"  value="<s:property value='#request.repassword'/>"/>
					 </div>

					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" id="chkShopInfo" onclick="showChkInfo(this,'divShopInfoAuto');" <s:property value="#request.hasshopinfo"/>><i> </i>管理员验证商铺信息（验证后，才能使用查询管理功能）</label>
					   </a>
				</div>
				<s:if test="#request.hasshopinfo!=''&& #request.hasshopinfo!=null">
					<div class="register-bottom-grid" id="divShopInfoAuto" style="display: block">	
				</s:if>
				<s:else>
					<div class="register-bottom-grid" id="divShopInfoAuto" style="display: none">	
				</s:else>
				 <!--<div class="register-bottom-grid" id="divShopInfoAuto" style="display: none">	-->
					<s:iterator value="shops" id="sp" status="u"> 
						 <div class="register-bottom-grid" id="divShopInfo" name="divShopInfo">
							 <span>增加商铺<input type="button" value="+" onclick="addShopInfo();"/>&nbsp&nbsp删除商铺<input type="button" value="-" onclick="removeShopInfo(this.parentNode.parentNode);"/></span>
								 <div class="wow fadeInLeft" name="divShopName" data-wow-delay="0.4s">
									<span>商铺号<label>*</label></span>
									<input type="text" name="shops[<s:property value='#u.index'/>].shopname" id="shopname" value="<s:property value='#sp.shopname'/>" onblur="if (this.value == '') {this.value = '格式：x-x-x';}"> 
								 </div>
								 <div class="wow fadeInRight" name="divShopType" data-wow-delay="0.4s">
									<span>商铺类型<label>*</label></span>
									<input type="text" name="shops[<s:property value='#u.index'/>].shoptype" id="shoptype" value="<s:if test='#sp.shoptype!=null'><s:property value='#sp.shoptype'/></s:if><s:else>经营权或产权</s:else>" onblur="if (this.value == '') {this.value = '经营权或产权';}"> 
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
						 <label class="checkbox"><input type="checkbox" id="chkAddAttach" onclick="popUpload()" ><i> </i>上传商铺文件图片</label>
					   </a>
					   <input type="hidden" id="uploadfilehtml" name="uploadfilehtml"/>
				</div>
			   <div class="register-bottom-grid" id="divAddAttach">
				<s:property value="#request.uploadfilehtml" escape="false"/>
			   </div>
				 <div class="register-top-grid">
					 <div class="clearfix"> </div>
					   <a class="news-letter" href="#">
						 <label class="checkbox"><input type="checkbox" id="chkAdditionInfo" onclick="showChkInfo(this,'divAdditionInfo');"  <s:property value="#request.hasadditioninfo"/>><i> </i>补充个人信息</label>
					   </a>
				</div>
				<s:if test="#request.hasadditioninfo!='' && #request.hasadditioninfo!=null">
					<div class="register-bottom-grid" id="divAdditionInfo" style="display: block">
				</s:if>
				<s:else>
					<div class="register-bottom-grid" id="divAdditionInfo" style="display: none">
				</s:else>
				<!-- <div class="register-bottom-grid" id="divAdditionInfo" style="display: none">-->
						 <div class="wow fadeInLeft" data-wow-delay="0.4s">
							<span>姓名</span>
							<input type="text" name="user.name" value="<s:property value='#request.user.name'/>"/> 
						 </div>
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>性别</span>
							<input type="text"  name="user.sex" value="<s:property value='#request.user.sex'/>"/>
						 </div>
						 <div class="wow fadeInLeft" data-wow-delay="0.4s">
							<span>身份证号码</span>
							<input type="text" name="user.identityid" value="<s:property value='#request.user.identityid'/>"/> 
						 </div>
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>QQ号码</span>
							<input type="text"  name="user.qqnumber" value="<s:property value='#request.user.qqnumber'/>"/>
						 </div>
						 <div class="wow fadeInLeft" data-wow-delay="0.4s">
							<span>职业</span>
							<input type="text" name="user.career" value="<s:property value='#request.user.career'/>"/> 
						 </div>
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>年龄</span>
							<input type="text" name="user.age" value="<s:property value='#request.user.age'/>"/>
						 </div>		
						 <div class="wow fadeInRight" data-wow-delay="0.4s">
							<span>备注</span>
							<input type="text" name="user.note" value="<s:property value='#request.user.note'/>"/>
						 </div>							 
				 </div>

				<!--
				<div class="register-but">
					<input type="button" onclick="popUpload()" value="点击上传文件"/>
				</div>-->
				<div class="clearfix"> </div>
				<div class="register-but">
				   <input type="submit" value="<s:if test='#session.username==null||#session.username.isEmpty()'>注册</s:if><s:else>修改</s:else>">
				   <div class="clearfix"> </div>
				</div>
			</form>
			<!--上传文件-->
			<div id="mask" class="mask" style="display:none">
			 <form action="Upload" name="fileupload" method="POST" enctype="multipart/form-data" target="hidden_frame">
				 <div class="upload-content">

					<table id="tbUploadFile" border=0 width="95%" align="center">
						<caption>上传附件</caption>
						<tr id="trUploadFile" name="trUploadFile" Valign="top"><td Valign="top">
							<input type="button" value="+" onclick="addUploadFile()"/>
							<input type="button" value="-" onclick="removeUploadFile(this.parentNode.parentNode)"/>
						</td><td>
							商铺号
							<input type="text" name="shopname" id="shopname" value="<s:property value='#request.shopname'/>" onblur="if (this.value == '') {this.value = '格式：x-x-x';}"> 
						</td>
						</td><td>
							<input type="file" name="upload"><br/>
						</td></tr>
					</table>
					<table border=0 width="95%" align="center">
						<tr align="center"><td>
							<input type="button" value="上传" onclick="uploadfile()"/>

							<input type="button" value="关闭" onclick="closeUpload()"/>
						</td></tr>
						<tr><td colspan=2>
							<span id="error"></span><br/>
							<span id="msg"></span><br/>
						</td></tr>
					</table>
				</div>
				<iframe name='hidden_frame' id="hidden_frame" style='display:none'></iframe>
			</form>
			</div>

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