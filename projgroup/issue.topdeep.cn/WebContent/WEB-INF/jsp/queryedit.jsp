<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>增加查询语句</title>
</head>
<body>
<div class=align>
<table border=0>
<tr><td>
<a href=queries.aspx>返回查询语句列表</a>
	<s:form name="ctl00" method="post"  id="ctl00" cssClass="frm">
	<s:hidden name="issueQueryId"></s:hidden>
	
		<table border=0>
	
		<tr>
			<td width="15%">查询名称</td>
			<td width="35%"><s:textfield name="issueQuery.issueQueryName" required="true"></s:textfield></td>
			<td class="errorMessage"><s:fielderror><s:param>issueQuery.issueQueryName</s:param></s:fielderror></td>
		</tr>
	
		<tr>
			<td width="15%">是否公开</td>
			<td width="35%"><s:radio name="issueQuery.isPublic"   list='#{"true":"public", "false":"private"}' value="false"></s:radio></td>
		</tr>
	
		<tr>
			<td class=lbl>SQL:</td>
			<td colspan=2><s:textarea name="issueQuerySql" id="sql_text" rows="16" cols="85"></s:textarea></td>
		</tr>
		
		<tr>
		<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 12, 2)}">
			<td align="center">	 
	           <div class="controlBtn">
	           <s:submit cssClass="btnStyle1" type="button" value="保存" method="save"></s:submit>
		    </td>
		 </s:if>
		</tr>
	
		</table>
	<s:fielderror></s:fielderror>
	</s:form>
</td></tr></table>
</body>
</html>
