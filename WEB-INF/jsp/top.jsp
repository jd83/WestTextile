<%@ page pageEncoding="gb2312" contentType="text/html;charset=utf-8" %>
	<div class="header">
  	    <div class="container">
			<div class="header-top">
				<div class="header-right">
					<img src="../resource/images/logo.jpg" class="img-responsive" alt="" />
				</div>
				<div class="header-left" style="font-size:12px;font-family:΢���ź�">
					<ul>
						<s:if test="null==#session.username||#session.username.isEmpty()">
							<li><a href="Register_Forward">ע��</a></li>
							<li class="active"><a href="Login_Forward">��¼</a></li>
						</s:if>
						<s:else>
							<li class="active"><a href="Register_Forward"><s:property value="#session.username"/></a></li>
							<li><a href="Logout">�˳�</a></li>
						</s:else>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div> 				

<!-- header -->
			<div class="header-bottom"  style="background-color:#7CCD7C">
				<div class="container">
					<div class="head-nav" style="font-size:12px;font-family:΢���ź�">
						<span class="menu"> </span>
							<ul>
								<li><a href="HelloWorld">��ҳ</li>
								<li><a href="about.html">��ѯ</a></li>
								<li><a href="news.html">���Ϲ�</a></li>
								<li><a href="news.html">���⽨��</a></li>
								<li><a href="events.html">��ϵ����</a></li>
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