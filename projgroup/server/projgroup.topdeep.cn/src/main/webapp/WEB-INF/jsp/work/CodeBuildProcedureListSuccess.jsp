<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>构建过程选择</title>
<script type="text/javascript">
	$(function(){
		
		$('#selectedAllFunc').click(function(){
			$('input[name=selectedFuncIds]').attr('checked',$(this).attr('checked'));
		});
	});
</script>
	<style type="text/css">
	</style>
</head>
<body>
        <div class="top">
            <a href="#">构建函数选择</a>
        </div>
        <a href="<s:property value='%{urlManage.getCodeBuildProcedureListUrl(buildId)}' />">构建函数选择</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildEditUrl(buildId)}' />">构建修改</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildPropertyEditUrl(buildId)}' />">构建属性</a> |  
        <a href="<s:property value='%{urlManage.getCodeBuildExecuteUrl(buildId)}' />">构建执行</a> |
          <a href="<s:property value='%{urlManage.getFuncTestListUrl(buildId)}' />">参数设置</a>|
        <a href="<s:property value='%{urlManage.getCodeBuildExecuteUrl(buildId)}' />">返回构建列表</a>
		  		
			<s:form method="post"  >
				<s:hidden name="buildId"></s:hidden> 
		<table width=1024  border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
			<thead>
			<tr>
				<th>选择</th>
				<th>函数版本</th>
				<th>函数代码</th>
				<th>函数名称</th>
			</tr>
			</thead>
			<tbody>
			<s:iterator value="procList">
      			<s:hidden name="buildProcedureId" value="%{buildProcedureId}"></s:hidden>
				<tr>
					<td><s:if test='pub5 == "1"'><input type="checkbox" checked="checked" name="selectedFuncIds" value="<s:property value='funcProcedureId' />" /></s:if>
					<s:else><input type="checkbox" name="selectedFuncIds" value="<s:property value='funcProcedureId' />" /></s:else></td>
					<td style="text-align: left;"><s:property value="procVersion"/></td>
					<td style="text-align: left;"><s:property value="procCode"/></td>
					<td style="text-align: left;"><s:property value="procName"/></td>
				</tr>
			</s:iterator>
			</tbody>
			<tfoot>
				<tr>
					<td><input type="checkbox" id="selectedAllFunc" />全选</td>
					<td colspan="3"><s:submit value="确定"  method="save"></s:submit></td>
				</tr>
				<tr>
					<td style="text-align: left" colspan="4">
					要导入的Build标识<s:textfield name="srcBuildId"></s:textfield>
					是否反向导入<input type="checkbox" name="invertImport" value="1"/>
					<s:submit value="导入"  method="importFrom"></s:submit></td>
				</tr>
			</tfoot>
	</table>
		   	</s:form>

</body>
</html>