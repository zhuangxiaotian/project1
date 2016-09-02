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
<script language="javascript" type="text/javascript">
	
	function add(){
		document.getElementById('froms').style.display="inline";
	} 
</script>
</head>
<body>
<s:form enctype="multipart/form-data"  >
	<table width=480 border=1>
	  	    <tr><td colspan="5">项目列表</td></tr>
			<tr>
				<td>项目Id</td>
				<td>项目名称</td>
				<td>项目描述</td>
				<td colspan="2"></td>
			</tr>
			
			<s:iterator value="funcProjectlist">
			<tr>
				<td><s:property value="funcProjectId"/></td>
				<td><s:property value="funcProjectName"/></td>
				<td><s:property value="funcProjectDesc"/></td>
				<td colspan="2">
					<s:a action="get?funcProjectId=%{funcProjectId}" >更新</s:a>
					<s:a action="delete?funcProjectId=%{funcProjectId}" >删除</s:a>
					<input type="button"  onclick="add()" cssClass="btn2" value="添加" />
					<s:submit type="input" action="funcproceList!list" cssClass="btn2" value="程序"></s:submit>
				</td>
			</tr>
			</s:iterator>
	</table>
	</s:form>
	<br/>
	<div id="froms" style="display:none;position:absolute;">
	<s:form enctype="multipart/form-data" id="myform" method="post" action="save" >
	    <table width=480 border=1>
	  	    <tr><td colspan="2">添加项目</td></tr>
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
				<s:submit value="确定" method=""></s:submit>
				
				</td>
			</tr>
		</table>
	</s:form>
	</div>
</body>
</html>