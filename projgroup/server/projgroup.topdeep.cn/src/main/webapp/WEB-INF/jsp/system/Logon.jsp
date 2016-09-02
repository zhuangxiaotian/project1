<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
if(path.equals("/")){
	path = "";
}
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://sw.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>操作员登录</title>
  <base href="<%=basePath%>" />
<style type="text/css">
table.table{
	position:absolute;
	left:35%;
	top:25%;
}
</style>
  <s:head/>
  <s:include value="/WEB-INF/jsp/include/head.jsp"></s:include>
</head>
<body>

<s:form name="login" action="Logon" method="post"> 
	<div class="wraper">
	  <table class="table" width="30%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
		  <tr>
			  <td>登录名称:</td><td><s:textfield  name="username" value=""/></td>
			  <td style="color:red"><s:fielderror><s:param>username</s:param></s:fielderror></td>
		  </tr>
		  <tr>
		  	<td>登录密码:</td><td><s:password  name="password" value=""/> </td>
		  	<td style="color:red"><s:fielderror><s:param>password</s:param></s:fielderror></td>
		  </tr>
		  <tr><td></td><td><s:submit value="登录" cssClass="btnStyle1"/></td><td></td></tr>
	  </table>
	</div>
</s:form>
</body>
</html>

