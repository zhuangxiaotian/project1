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
	<div class="mainContent">
            <div class="top">
                <a href="#">更新函数</a>  
            </div>
	    <table width=780 border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
			<tr style="display:none;">
				<td>函数Id</td>
				<td><s:textfield name="funcProcedure.funcProcedureId" readonly="true" /></td>
			</tr>
			<tr style="display:none;">
				<td>项目名称</td>
				<td>
				<s:select name="funcProcedure.funcProjectId" style="width:187px;" list="funcProjectList" listKey="funcProjectId"
							listValue="funcProjectName">
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
				<td><s:submit value="确定" action="work/FuncProcedureList!update"></s:submit></td>
			</tr>
		</table>
		</div>
	</s:form>
	
	
</body>
</html>