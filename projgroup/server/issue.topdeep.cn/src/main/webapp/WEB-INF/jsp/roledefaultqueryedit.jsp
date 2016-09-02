<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
if(path.equals("/")){
	path = "";
}
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<title id="title">角色默认查询编辑</title>
</head>
<body>
<div class=align>
<s:form validate="true">
<s:hidden name="issueProjectId"></s:hidden>
<s:hidden name="roleId"></s:hidden>
<table border=0>
	<tr>
		<td>角色名称</td>
		<td>
			<s:if test="%{(roleId <= 0)}"><s:select name="defaultQuery.roleId" list="roleList" listKey="roleId" listValue="roleName"></s:select></s:if>
			<s:else><s:property value="roleName"/></s:else>
		</td>
	</tr>
	<tr>
		<td>默认查询</td>
		<td><s:select name="defaultQuery.issueQueryId" list="queryList" listKey="issueQueryId" listValue="issueQueryName"></s:select></td>
		<td style="color:red"><s:fielderror><s:param>defaultQuery.issueQueryId</s:param></s:fielderror></td>
	</tr>
	<tr>
	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 15, 2)}">
	<td><s:submit name="test" cssClass="btnStyle1" type="button" value="提交" method="save"></s:submit></td>
	</s:if>
	</tr>
	
</table>
</s:form>
	
</div>
</body>
</html>