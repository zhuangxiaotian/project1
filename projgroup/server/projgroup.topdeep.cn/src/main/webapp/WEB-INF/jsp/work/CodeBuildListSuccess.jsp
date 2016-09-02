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
<title>Build列表</title>
<script language="javascript" type="text/javascript">
	$(function(){
		$('.expand').live('click',function(){
			$('.collect').val("+");
			$('tr.expandTr').remove();
			var $currTr = $(this).parent().parent();
			$(this).val("-");
			$(this).addClass('collect').removeClass('expand');
			var buildId = $(this).attr("buildId");
			$.ajax({
	            url: '<s:property value="urlManage.getAjaxQueryCodeBuildListServiceUrl()" />?parentBuildId='+buildId, 
	            //data: {},  // 从表单中获取数据
	            type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
	            dataType:'json',
	            success:function(jsonObj){
	            	var data = jsonObj.data;
	            	for(var i=data.length-1; i >= 0; i--){
	            		//<td>" +((data[i].pub0 != null)?data[i].pub0:'') + "</td>            <td>" +((data[i].pub1 != null)?data[i].pub1:'') + "</td>            <td>" +((data[i].pub2 != null)?data[i].pub2:'') + "</td>            <td>" +((data[i].pub3 != null)?data[i].pub3:'') + "</td>            <td>" +((data[i].pub4 != null)?data[i].pub4:'') + "</td>            <td>" +((data[i].pub5 != null)?data[i].pub5:'') + "</td>
	            		$currTr.after("<tr class='expandTr'><td>&nbsp;</td>			<td>" +((data[i].buildId != null)?data[i].buildId:'') + "</td>			<td>" +((data[i].buildName != null)?data[i].buildName:'') + "</td>            <td>" +((data[i].parentBuildId != null)?data[i].parentBuildId:'') + "</td>            <td>" +((data[i].funcProjects != null)?data[i].funcProjects:'') + "</td>            			<td>				<a href=\"work/CodeBuildExecute.action?buildId=" +((data[i].buildId != null)?data[i].buildId:'') + "\">构建</a>				<a href=\"work/CodeBuildEdit.action?buildId=" +((data[i].buildId != null)?data[i].buildId:'') + "\">修改</a>				<a href=\"work/CodeBuildPropertyEdit.action?buildId=" +((data[i].buildId != null)?data[i].buildId:'') + "\">属性</a>		<a href=\"func/codeBuildPropertyEditManage.do?buildId=" +((data[i].buildId != null)?data[i].buildId:'') + "\">属性(新)</a>		<a href=\"work/CodeBuildProcedureList.action?buildId=" +((data[i].buildId != null)?data[i].buildId:'') + "\">函数选择</a>	<a href=\"func/codeBuildProcedureListManage.do?buildId=" +((data[i].buildId != null)?data[i].buildId:'') + "\">函数选择(新)</a>			<a href=\"work/FuncTestEdit.action?buildId=" +((data[i].buildId != null)?data[i].buildId:'') + "\">参数设置</a>  <a href=\"func/downloadConfigFile.do?buildId=" +((data[i].buildId != null)?data[i].buildId:'') + "\">下载</a>	</td>	</tr>");
	            	}	
	            },
	            error:function(){
	           		alert("失败");
	           	}
	        });
		});
		
		
		$('.collect').live('click',function(){
			$(this).val("+");
			$(this).addClass('expand').removeClass('collect');
			$('tr.expandTr').remove();
		});

		
	});
</script>
</head>
<body>
	<div class="top">
       <a href="#">构建列表</a>  
    </div>
    <s:form method="post" >
    <%--
	    <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle1">
	         <tr>
	             <th width="auto" nowrap="nowrap">构建名称：<s:textfield name="condition" />
		             <s:text name="%{message}" ></s:text>
		             <s:submit type="input" cssClass="btnStyle1" method="search" value="搜索"/>
	         	 </th>
	        </tr>
	    </table>
	    --%>
	 	<table width=560 border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
			<thead>
			<tr>
				<th>&nbsp;</th>
				<th>构建标识</th>
				<th>构建名称</th>
				<th>父构建标识</th>
				<th>相关项目</th>
				<!-- 
				<th>公共0</th>
				<th>公共1</th>
				<th>公共2</th>
				<th>公共3</th>
				<th>公共4</th>
				<th>公共5</th>
							            <td><s:property value="pub0" /></td>
			            <td><s:property value="pub1" /></td>
			            <td><s:property value="pub2" /></td>
			            <td><s:property value="pub3" /></td>
			            <td><s:property value="pub4" /></td>
			            <td><s:property value="pub5" /></td>
				
				 -->
				<th>操作</th>
			</tr>
			</thead>
			<tbody >
				<s:iterator value="codeBuild" status="rowStatus" >
	                <tr>
						<td><input type="button" buildId="<s:property value='buildId'/>" style="display:block;width:20px;height:20px;" class="btn2 expand" value="+" /></td>
						<td><s:property value="buildId"/></td>
						<td><s:property value="buildName" /></td>
			            <td><s:property value="parentBuildId" /></td>
			            <td><s:property value="funcProjects" /></td>
						<td>
							<a href="<s:property value='%{urlManage.getCodeBuildExecuteUrl()}' />?buildId=<s:property value='buildId'/>">构建</a>
							<a href="<s:property value='%{urlManage.getCodeBuildEditUrl()}' />?buildId=<s:property value='buildId'/>">修改</a>
							<a href="<s:property value='%{urlManage.getCodeBuildPropertyEditUrl()}' />?buildId=<s:property value='buildId'/>">属性</a>
							<a href="<s:property value='%{urlManage.getCodeBuildPropertyEditNewUrl()}' />?buildId=<s:property value='buildId'/>">属性(新)</a>
							<a href="<s:property value='%{urlManage.getCodeBuildProcedureListUrl()}' />?buildId=<s:property value='buildId'/>">函数选择</a>
							<a href="<s:property value='%{urlManage.getCodeBuildProcedureListNewUrl()}' />?buildId=<s:property value='buildId'/>">函数选择(新)</a>
							<a href="<s:property value='%{urlManage.getFuncTestListUrl()}' />?buildId=<s:property value='buildId'/>">参数设置</a>
							<a href="<s:property value='%{urlManage.getDownFuncProcedurePrivilegeUrl()}' />?buildId=<s:property value='buildId'/>">下载</a>
						</td>
					</tr>
	           </s:iterator>    
			</tbody>
			<tfoot id="footData"></tfoot>
		</table>
		<s:hidden  name="searchTag"></s:hidden>
		<s:include value="/WEB-INF/jsp/include/pagefoot.jsp"></s:include>
		<a href="<s:property value='%{urlManage.getCodeBuildEditUrl()}' />">添加</a>
	</s:form> 
</body>
</html>