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
                <a href="#">更新项目</a>  
            </div>
	    <table width=480 border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
			<tr>
				<td style="width:200">项目标识</td>
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
				<s:submit value="确定" action="work/FuncProjectList!update"></s:submit>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				</td>
			</tr>
		</table>
		</div>
	</s:form>

</body>
</html>