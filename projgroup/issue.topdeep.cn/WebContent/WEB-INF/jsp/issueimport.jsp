<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <title>问题导入</title>
</head>
  <body>
    <s:form method="post">
		<tr>
			 <td><s:submit cssClass="btnStyle1" type="input" value="导入" method="imports"></s:submit></td>
			 <td class="errorMessage"><s:fielderror><s:param>issue.issueShortDesc</s:param></s:fielderror></td>
		</tr>
	</s:form>
  </body>
</html>
