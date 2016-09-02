<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<s:form enctype="multipart/form-data" method="post" >
	    <table width=480 border=1>
	  	    <tr><td colspan="2">更新项目</td></tr>
			<tr>
				<td style="width:200">项目Id</td>
				<td><s:textfield name="fproj.funcProjectId" readonly="true" /></td>
			</tr>
			<tr>
				<td style="width:200">项目名称</td>
				<td><s:textfield name="fproj.funcProjectName" /></td>
			</tr>
			<tr>
				<td style="width:200">项目描述</td>
				<td><s:textfield name="fproj.funcProjectDesc" /></td>
			</tr>
			<tr>
				<td style="width:200"></td>
				<td>
				<s:submit value="确定" action="update"></s:submit>
				</td>
			</tr>
		</table>
	</s:form>

</body>
</html>