<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
<title>Insert title here</title>
</head>
<body>

	<div class="mainContent">
            <div class="top">
                <a href="#">项目列表</a>  
            </div>
	<table width=500 border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
			<tr>
				<th>项目标识</th>
				<th>项目名称</th>
				<th>项目描述</th>
				<th colspan="2">操作</th>
			</tr>
			
			<s:iterator value="funcProjectListView" status="rowStatus">
			<s:form enctype="multipart/form-data" method="post"  >
			<s:hidden name="funcProjectId" value="%{funcProjectId}"></s:hidden>
			<tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
				<td><s:property value="funcProjectId"/></td>
				<td><s:property value="funcProjectName"/></td>
				<td><s:property value="funcProjectDesc"/></td>
				<td colspan="2">
					<s:submit style="color:blue;" value="构建管理" action="work/CodeBuildEdit!list"></s:submit>
				</td>
			</tr>
			</s:form>
			</s:iterator>
	</table>
	<s:form enctype="multipart/form-data" method="post" >
		<s:include value="/WEB-INF/jsp/include/pagefoot.jsp"></s:include>
	</s:form>
</body>
</html>