<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
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
	<s:form   enctype="multipart/form-data" method="post"  >
        <div class="top">
            <a href="#">函数列表</a>  
        </div>
        <s:hidden name="buildId" value="%{buildId}"></s:hidden>
        <s:hidden name="funcProjectId" value="%{funcProjectId}"></s:hidden>
		<table width=1024  border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
			<tr>
				<th>操作</th>
				<th>函数标识</th>
				<th>项目标识</th>
				<th>函数代码</th>
				<th>函数名称</th>
				<th>函数描述</th>
				<th>函数版本</th>
				<th>工程编号</th>
				<th>缓存时间</th>
			</tr>
			<s:iterator value="funcprocedureList">
			<tr>
				<td>
					<s:checkbox  name="selectedProcedure" fieldValue="%{funcProcedureId}" />
				</td>
				<td><s:property value="funcProcedureId"/></td>
				<td><s:property value="funcProjectId"/></td>
				<td><s:property value="procCode"/></td>
				<td><s:property value="procName"/></td>
				<td><s:property value="procComment"/></td>
				<td><s:property value="procVersion"/></td>
				<td><s:property value="funcCode"/></td>
				<td><s:property value="cacheTime"/></td>
			</tr>
		</s:iterator>
	</table>
				<s:submit style="float:right;color:blue;margin-right:10px;" value="返回项目管理" action="work/ProjList"></s:submit>
				<s:submit style="float:right;color:blue;margin-right:10px;" value="确定"  action="work/CodeBuildProcedureList!save"></s:submit>
	</s:form>
</body>
</html>