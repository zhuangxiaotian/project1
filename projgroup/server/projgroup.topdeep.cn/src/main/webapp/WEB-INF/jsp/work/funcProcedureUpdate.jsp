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
	    <table width=780 border=1>
	  	    <tr><td colspan="2">更新函数</td></tr>
			<tr>
				<td>函数Id</td>
				<td><s:textfield name="funcProcedure.funcProcedureId" readonly="true" /></td>
			</tr>
			<tr>
				<td>项目标识</td>
				<td>
				<s:select name="funcProcedure.funcProjectId" list="funcProjectList" listKey="funcProjectId"
							listValue="funcProjectId">
				</s:select>
				</td>
			</tr>
			<tr>
				<td>函数代码</td>
				<td><s:textfield name="funcProcedure.procCode" /></td>
			</tr>
			<tr>
				<td>函数名称</td>
				<td><s:textfield name="funcProcedure.procName" /></td>
			</tr>
			<tr>
				<td>函数描述</td>
				<td><s:textfield name="funcProcedure.procComment" /></td>
			</tr>
			<tr>
				<td>函数版本</td>
				<td><s:textfield name="funcProcedure.procVersion" /></td>
			</tr>
			<tr>
				<td>函数代码</td>
				<td><s:textfield name="funcProcedure.funcCode" /></td>
			</tr>
			<tr>
				<td>缓存时间</td>
				<td><s:textfield name="funcProcedure.cacheTime" /></td>
			</tr>
			<tr>
				<td></td>
				<td><s:submit value="确定" action="funcproceupdate"></s:submit></td>
			</tr>
		</table>
	</s:form>
</body>
</html>