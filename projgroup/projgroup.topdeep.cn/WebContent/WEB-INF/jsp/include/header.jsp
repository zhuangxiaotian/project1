<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!--header start-->
    <div id="header">
    	<dl>
        	<dt><p class="companyName">后台管理系统</p><dt>
        </dl>
        <p class="logo"><img src="images/style1/logo.gif" /></p>
        <p class="headerNav">
    <!--corner start-->
    	<!--<span class="cornerL"></span>
        
        <span class="cornerR"></span>-->
    <!--corner end-->
        <!--<a href="index.asp?num=1" class="one" >第一种样式</a>
        <a href="index.asp?num=2" class="two">第二种样式</a>
        <a href="index.asp?num=3" class="three">第三种样式</a>-->
		欢迎您:<s:property value="userid"/>[ <a href='<s:url value="Logout.action"></s:url>'>退出登录</a> ]
      </p>
    </div>
    
    <!--header end-->