<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
if(path.equals("/")){
	path = "";
}
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  	<title>首页</title>
  	<base href="<%=basePath%>" />
	<link rel="stylesheet" type="text/css" href="skin/style1/css/index.css">
	<script type="text/javascript" src="topdeep/js/jquery/jquery-1.3.2/jquery-1.3.2.js"></script>
	<script type="text/javascript" src="skin/style1/js/menu.js"></script>
  	<s:property escape="false" value="scriptManage.getScriptOutput()"/>
  	<script type="text/javascript">
  	
  	</script>
</head>
<body onload="resizecontrol()" onresize="resizecontrol()">
<div id="wrapper">
   <div id="header">
	   <div id="headerLogo">
			<div id="headerLogoMiddle">
				<div id="headerLogoTop">
					<div id="logo">
						<p class="system_title">后台管理系统</p>
					</div>
				</div>
			</div>
	   </div>
        <div id="headerNav">
        	<p id="headerNavMenu" style="float:left;"><a href="work/WorkLogEdit.action" target="mainframe">添加工作日志</a><a href="work/WorkLogList.action" target="mainframe">工作日志管理</a></p>
        	<p style="float:right;" id="welcome">
			欢迎您:<s:property value="loginUser.loginUser.loginName"/>[ <a href='<s:url value="Logout.action"></s:url>'>退出登录</a> ]
			</p>
     	</div>
    </div>
  
  <div id="main">
		<div id="main_menu">
		<div id="bottomUp"><img src="skin/style1/images/bottomUp.jpg" class="imgDown"/></div>
		<div class="main_nav">
		<div id="topbg"></div>
			<div class="midbg">
			<ul class="listexpander" id="listexpander">
				<s:iterator value="menuList" id="currentUrl">
					<s:if test="menu">
						<li>
							<s:if test='url == ""'>
								<a class="level1menu" href="#"><s:property value="name"/></a>
							</s:if>
							<s:else>
								<a class="level1menu" href="<s:property value='url' />" target="mainframe"><s:property value="name"/></a>
							</s:else>
							<s:if test="hasChildMenu">
							<ul>
								<s:iterator value="#currentUrl.getChildUrlList()">
									<s:if test="menu">
										<li>
										<s:if test='url == ""'>
											<s:property value="name"/>
										</s:if>
										<s:else>
											<a href="<s:property value='url' />" target="mainframe" class="childmenu"><s:property value="name"/></a>
										</s:else>
										</li>
									</s:if>
								</s:iterator>
							</ul>	
							</s:if>
						</li>
					</s:if>
				</s:iterator>
			</ul>
				<div id="bottomDown"><img src="skin/style1/images/bottomDown.jpg" class="imgDown" /></div>
			</div>
			<div id="bottombg"></div> 
		</div>
		</div>
		<div id="main_content">
		  <iframe name="mainframe" scrolling="no" src="work/ProjList.action" frameborder="0" width="100%" height="400" allowtransparency="true" id="mainframe"></iframe>
		</div>
		<!--<div style="clear:both"></div>-->
  </div>
  <div style="clear:both"></div>
  <div id="footer">
  推荐使用FireFox浏览器，1024*768以上分辨率浏览。
  </div>
<!--  <div>&nbsp;</div>-->
</div>
</body>
</html>