<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>函数功能导入</title>
</head>
<body>
	<div>
	<s:form method="post"   enctype="multipart/form-data">
		<s:hidden name="funcProjectId" />
		<span style="margin-left:130px;">选择Excel文件路径： </span><s:file name="upload" /><br/>
		<br/>
        <span style="margin-left:70px;">请输入Excel文件中的Sheet名:  </span></br><s:textarea name="sheetName" wrap="virtual" style="height:100px;width:300px;margin-left:250px;"></s:textarea>(格式：sheet1,sheet2,sheet3,......)<br/>
        <br/>
		<span style="margin-left:100px;">是否删除数据库原有数据:  </span><s:radio name="deleteOldData" list="%{#{'0':'不删除','1':'删除'}}" theme="simple"></s:radio><br/>
		<br/>
		<span style="margin-left:126px;">请选择上传文件类型：</span><s:select name="importType" list="{'Topdeep','Sihuan','Huaan'}"></s:select><br/>
		是否导入标志：<s:textfield name="importDataFlag" value="0" />
		<s:submit style="float:right;color:blue;margin-right:700px;" value="提交" method="upload" ></s:submit>
	</s:form>
		<font color="#FF0000" size="+1"><STRONG><s:property value="#request.message"/></STRONG></font>
	</div>
	
</body>
</html>