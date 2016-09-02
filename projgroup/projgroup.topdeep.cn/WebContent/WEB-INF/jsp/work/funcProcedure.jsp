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
<script language="javascript" type="text/javascript">
	
	function add(){
		document.getElementById('froms').style.display="inline";
	} 
</script>
</head>
<body>
	
	<table width=780 border=1>
	  	    <tr><td colspan="10">函数列表</td></tr>
			<tr>
				<td>函数Id</td>
				<td>项目标识</td>
				<td>函数代码</td>
				<td>函数名称</td>
				<td>函数描述</td>
				<td>函数版本</td>
				<td>函数代码</td>
				<td>缓存时间</td>
				<td colspan="2"></td>
			</tr>
			<s:iterator value="funcprocedureList">
			<tr>
				<td><s:property value="funcProcedureId"/></td>
				<td><s:property value="funcProjectId"/></td>
				<td><s:property value="procCode"/></td>
				<td><s:property value="procName"/></td>
				<td><s:property value="procComment"/></td>
				<td><s:property value="procVersion"/></td>
				<td><s:property value="funcCode"/></td>
				<td><s:property value="cacheTime"/></td>
				<td colspan="2">
					<s:a action="funcproceget?AFuncProcedureId=%{funcProcedureId}" >更新</s:a>
					<s:a action="funcprocdelete?AFuncProcedureId=%{funcProcedureId}" >删除</s:a>
					<s:submit type="input" onclick="add()" cssClass="btn2" value="添加"></s:submit>
					<s:submit type="input" action="paramsList!list" cssClass="btn2" value="参数"></s:submit>
				</td>
			</tr>
			</s:iterator>
	</table>
	<br/>

	<div id="froms" style="display:none;float:top;">
	<s:form enctype="multipart/form-data" id="myform" method="post" action="procesave" >
	    <table width=780 border=1>
	  	    <tr><td colspan="2">添加函数</td></tr>
			<tr>
				<td>函数Id</td>
				<td><s:textfield name="funcProcedure.funcProcedureId"  /></td>
			</tr>
			<tr>
				<td>项目标识</td>
				<td><s:textfield name="funcProcedure.funcProjectId" />
				
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
				<td><s:submit value="确定" method=""></s:submit></td>
			</tr>
		</table>
	</s:form>
	</div>
	
	
</body>
</html>