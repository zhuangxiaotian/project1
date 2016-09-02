<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://sw.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>选择登录项目</title>
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
</head>
<body class="body">

<s:form name="SelectLoginProject"  method="post"> 
	
	<div class="wraper" >
	  <table class="table" style="border-style:groove;" width="30%" border="0" cellspacing="0" cellpadding="0" class="tableForm" align="center">
	  	  <tr>
			  <td style="color: red;">请选择登录项目</td>
			  <td><s:select name="issueProjectId" list="projuserlistview" listKey="issueProjectId" listValue="issueProjectName" ></s:select></td>
			  <td style="color:red"><s:fielderror><s:param>issueProjectId</s:param></s:fielderror></td>
			  <td><s:submit cssClass="btnStyle1" type="button" value="确认" method="selectloginproject"></s:submit></td>
		  </tr>
	  </table>
	</div>
</s:form>
</body>
</html>

