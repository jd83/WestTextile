<%@ page contentType="text/html;charset=gb2312" %>
	<div class="header">
  	    <div class="container">
			<div class="header-top">
				<div class="header-right">
					<img src="../resource/images/logo.jpg" class="img-responsive" alt="" />
				</div>
				<div class="header-left" style="font-size:12px;font-family:微软雅黑">
					<ul>
						<s:if test="null==#session.userWithBLOBs||#session.userWithBLOBs.username.isEmpty()">
							<li><a href="Register_Forward">注册</a></li>
							<li class="active"><a href="Login_Forward">登录</a></li>
						</s:if>
						<s:else>
							<li class="active"><a href="#">#<s:property value="#session.userWithBLOBs.username"/>#</a></li>
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