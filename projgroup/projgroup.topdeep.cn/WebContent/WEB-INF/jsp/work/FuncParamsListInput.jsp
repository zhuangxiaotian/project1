<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
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
	
	<s:form enctype="multipart/form-data" method="post">
	<div class="mainContent">
            <div class="top">
                <a href="#">修改参数</a>  
            </div>
	    <table width=780 border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
			<tr style="display:none;" >
				<td>参数标识</td>
				<td><s:textfield name="funcParams.paramId" readonly="true" /></td>
			</tr>
			<tr style="display:none;" >
				<td>函数标识</td>
				<td><s:textfield name="funcParams.funcProcedureId" readonly="true" />
				</td>
			</tr>
			<tr>
				<td>参数代码</td>
				<td><s:textfield name="funcParams.paramCode"  /></td>
			</tr>
			<tr>
				<td>参数名称</td>
				<td><s:textfield name="funcParams.paramName"  /></td>
			</tr>
			
			<tr>
				<td>参数方向</td>
				<td>
				<s:select name="funcParams.paramDirection" list="{0,1}" style="width:180px;" />
				</td>
			</tr>
			<tr>
				<td>参数类型</td>
				<td>
				<s:select name="funcParams.paramCategory" list="{0,1}" style="width:180px;" />
				</td>
			</tr>
			<tr>
				<td>参数说明</td>
				<td><s:textfield name="funcParams.paramComment"  /></td>
			</tr>
			<tr>
				<td>父参数标识</td>
				<td><s:textfield name="funcParams.parentParamId"  /></td>
			</tr>
			<tr>
				<td>数据类型</td>
				<td><s:textfield name="funcParams.paramDataType"  /></td>
			</tr>
			<tr>
				<td>数据类型长度</td>
				<td><s:textfield name="funcParams.paramDataLength"  /></td>
			</tr>
			<tr>
				<td>数据类型小数长度</td>
				<td><s:textfield name="funcParams.paramDataDecimal"  /></td>
			</tr>
			<tr>
				<td>数据非空</td>
				<td>
				<s:select name="funcParams.paramDataNotNull" list="{0,1}" style="width:180px;" />
				</td>
			</tr>
			<tr>
				<td>参数默认值</td>
				<td><s:textfield name="funcParams.paramDataDefaultValue"  /></td>
			</tr>
			<tr>
				<td>参数允许修改</td>
				<td>
				<s:select name="funcParams.paramAllowModify" list="{0,1}" style="width:180px;" />
				</td>
			</tr>
			<tr>
				<td></td>
				<td><s:submit value="确定" action="work/FuncProcedureList!updateParams"></s:submit></td>
			</tr>
		</table>
		</div>
	</s:form>
</body>
</html>