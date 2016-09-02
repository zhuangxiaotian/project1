<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%><%@taglib prefix="s" uri="/topdeep-web-tags"%><%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <s:form enctype="multipart/form-data">
	    	<input type="file" name="uploadFile">
	    	<s:submit value="发布" method="deployProcessDefinitionByFile"></s:submit>
	    	<input type="submit" value="发布">
	</s:form>
    <s:form>
    	<s:textarea cols="80" rows="8" name="processDefinitionContent"></s:textarea>
    	<s:submit value="发布" method="deployProcessDefinition"></s:submit>
    </s:form>
    <table width=480 border=1>
	  	    <tr><td colspan="5">流程定义</td></tr>
			<tr>
				<td>ID</td>
				<td>Key</td>
				<td>名称</td>
				<td>版本</td>
				<td>操作</td>
			</tr>
			<s:iterator value="processDefinitionList">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="key"/></td>
				<td><s:property value="name"/></td>
				<td><s:property value="version"/></td>
				<td><s:a href="%{urlManage.getCreateNewProcessUrl(key)}">启动</s:a>
				<s:a href="%{urlManage.getProcessInstanceViewUrl(id)}">查看</s:a>
				<a>删除</a></td>
			</tr>
			</s:iterator>
		</table>
		<br>
		<table width=480 border=1>
	  	    <tr><td colspan="5">流程实例</td></tr>
			<tr>
				<td>ID</td>
				<td>Key</td>
				<td>名称</td>
				<td>状态</td>
				<td>操作</td>
			</tr>
	  	    <s:iterator value="processInstanceList">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="key"/>&nbsp;</td>
				<td><s:property value="name"/>&nbsp;</td>
				<td><s:property value="state"/></td>
				<td><s:a href="%{urlManage.getSignalProcessInstanceUrl(id)}">执行</s:a></td>
			</tr>
	  	    </s:iterator>
		</table>
		<br />
		<s:form>
		<s:textfield name="userId"></s:textfield>
		<s:submit value="查询"></s:submit>
		</s:form>
		<table width=480 border=1>
		<tr><td colspan="5">流程实例</td></tr>
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>ActivityName</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<s:iterator value="personerTaskList">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="name"/>&nbsp;</td>
				<td><s:property value="activityName"/>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			</s:iterator>
		</table>
  </body>
</html>
