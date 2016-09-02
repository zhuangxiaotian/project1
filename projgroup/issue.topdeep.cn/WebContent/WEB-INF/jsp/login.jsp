<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://sw.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>用户登录</title>
<style type="text/css">
table.table{
position:absolute;
left:35%;
top:25%;
}

body.body{ 
background-color:#ff9999;
}

</style>
<script type="text/javascript">
	function recordUrl() {
		var v = document.getElementById('Login_issueId');
		v.value = document.referrer;
		alert(v.value);
	}

</script>
</head>
<body class="body">

<s:form name="login" action="Login" method="post"> 
<s:hidden name="issueId" value=""></s:hidden>
	<div class="wraper">
	  <table class="table" style="border-style:groove;"  width="30%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
<!--	  	  <tr>-->
<!--			  <td>项目名称</td><td><s:select name="issueProjectId" list="projList" listKey="issueProjectId" listValue="issueProjectName" ></s:select></td>-->
<!--			  <td style="color:red"><s:fielderror><s:param>issueProjectId</s:param></s:fielderror></td>-->
<!--		  </tr>-->
		  <tr>
			  <td style="font: " nowrap="nowrap">用户名称:</td><td><s:textfield  name="loginName"/></td>
			  <td style="color:red"><s:fielderror><s:param>loginName</s:param></s:fielderror></td>
		  </tr>
		  <tr>
		  	<td nowrap="nowrap">用户密码:</td><td><s:password  name="loginPassWord" value=""/> </td>
		  	<td style="color:red"><s:fielderror><s:param>loginPassWord</s:param></s:fielderror></td>
		  </tr>
		  <tr>
		  	<td></td>
		  	<td><s:submit cssClass="btnStyle1" type="button" value="登录" method="login"></s:submit></td>
<!--		   	<td><input type="reset" value="重置" /></td>-->
		   	<td></td>
		  </tr>
	  </table>
	</div>
</s:form>
</body>
</html>

