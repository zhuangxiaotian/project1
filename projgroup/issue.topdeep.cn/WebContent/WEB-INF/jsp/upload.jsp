<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>上传文件</head>
  <s:hidden name="issueId"></s:hidden>
  <body>
  	<form method="post" enctype="multipart/form-data">
  		 <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
			 <tr>
			  		文件注释:
			  		<s:textfield name="title"></s:textfield><br /><br />
			 </tr>
			 <tr>
			  		选择文件:
			  		<s:file name="upLoad"></s:file>
			  		<s:submit cssClass="btnStyle1" type="input" value="上传" method="save"></s:submit>
			  		<td style="color:red"><s:fielderror><s:param>upLoad</s:param></s:fielderror></td>
			  </tr>
			  	
		 </table>
			  	
	</form>
  </body>
</html>
