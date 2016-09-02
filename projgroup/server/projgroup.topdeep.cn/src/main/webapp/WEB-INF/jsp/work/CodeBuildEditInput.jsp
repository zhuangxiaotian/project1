<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/topdeep-web-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<base href="<%=basePath%>">
<title>Build编辑</title>
<s:clientFeature featureName="jquery-validate" />
<script language="javascript" type="text/javascript">
	
</script>
</head>
<body>
        <div class="top">
            <a href="#">构建修改</a>
        </div>
        <a href="<s:property value='%{urlManage.getCodeBuildProcedureListUrl(buildId)}' />">构建函数选择</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildEditUrl(buildId)}' />">构建修改</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildPropertyEditUrl(buildId)}' />">构建属性</a> |  
        <a href="<s:property value='%{urlManage.getCodeBuildExecuteUrl(buildId)}' />">构建执行</a> | 
        <a href="<s:property value='%{urlManage.getFuncTestListUrl(buildId)}' />">参数设置</a>|
        <a href="<s:property value='%{urlManage.getCodeBuildListUrl()}' />">返回构建列表</a>
    	<s:form method="post" enctype="multipart/form-data" >
    	<s:hidden name="buildId"></s:hidden>
    	<s:hidden name="codeBuild.buildId"></s:hidden>
        <div class="mainContent">
            <div class="title">构建信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td style="width:200px;">构建名称</td>
                    <td><s:textfield name="codeBuild.buildName"></s:textfield></td>
                </tr>
            	 <tr >
                    <td>父构建标识</td>
                    <td><s:textfield name="codeBuild.parentBuildId"></s:textfield></td>
                </tr>
            	 <tr >
                    <td>相关构建项目标识</td>
                    <td><s:textfield name="codeBuild.funcProjects"></s:textfield></td>
                </tr>
            	 <tr >
                    <td>构建说明</td>
                    <td><s:textfield name="codeBuild.buildDesc"></s:textfield></td>
                </tr>
            </table>
            
            <div class="controlBtn">
            		<s:submit cssClass="btnStyle1"  value="保存" method="save"></s:submit>
            		<a href="<s:property value="%{urlManage.getCodeBuildListUrl()}" />">返回构建管理</a>
            </div>
        </div>
        </s:form>
	
</body>
</html>