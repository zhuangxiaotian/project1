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
	
	function add(obj){
		if(obj=="添加"){
			$("#codeBuidAdd").toggle();
			$("#new").val("取消添加");
		}else{
			$("#codeBuidAdd").toggle();
			$("#new").val("添加");
		}
	} 
	
	
	function update(obj,value){
		if(obj=="更新"){
			$('#codeBuidUpdate'+value).toggle();
			$('#codeBuidData'+value).toggle();
		}else{
			$('#codeBuidData'+value).toggle();
			$('#codeBuidUpdate'+value).toggle();
		}
	}
</script>
</head>
<body>

	<div class="top">
       <a href="#">构建列表</a>  
    </div>
	<table width=560 border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
	<s:form enctype="multipart/form-data"  method="post">
	  	    <tr><th colspan="7">
	  	    	<input id="new" type="button" style="float:right;color:blue;" onclick="add(this.value)" cssClass="btn2" value="添加" />
	  	   		<s:submit style="float:right;color:blue;margin-right:10px;" value="返回项目管理" action="work/ProjList"></s:submit>
	  	    </th></tr>
	 </s:form>
			<tr>
				<th>构建标识</th>
				<th>项目标识</th>
				<th>构建名称</th>
				<th>构建说明</th>
				<th>父构建标识</th>
				<th colspan="2">操作</th>
			</tr>
			
			<s:iterator value="codeBuildListView" status="rowStatus">
			<s:form enctype="multipart/form-data"  method="post">
			<s:hidden name="funcProjectId" value="%{funcProjectId}"/>
			<s:hidden name="buildId" value="%{buildId}"/>
			<tr id='codeBuidData<s:property value="buildId"/>' class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
				<td><s:property value="buildId"/></td>
				<td><s:property value="funcProjectId"/></td>
				<td><s:property value="buildName"/></td>
				<td><s:property value="buildDesc"/></td>
				<td><s:property value="parentBuildId"/></td>
				<td colspan="2">
					<input type="button" style="color:blue;" onclick='update(this.value,<s:property value="buildId"/>)'  value="更新" />
					<s:submit style="color:blue;" value="删除" action="work/CodeBuildEdit!delete"></s:submit>
					<s:submit style="color:blue;" value="构建函数" action="work/CodeBuildProcedureList!list"></s:submit>
					<s:submit style="color:blue;" value="构建属性" action="work/CodeBuildPropertyEdit!list"></s:submit>
				</td>
			</tr>
			</s:form>
			 <tr style="display:none;" id='codeBuidUpdate<s:property value="buildId"/>' >
			 <s:form enctype="multipart/form-data"  method="post">
			 	<s:hidden name="funcProjectId" value="%{funcProjectId}"/>
			  	<td ><s:textfield name="codeBuild.buildId" value="%{buildId}" readonly="true"/></td>
				<td><s:textfield name="codeBuild.funcProjectId" value="%{funcProjectId}" readonly="true"/></td>
				<td><s:textfield name="codeBuild.buildName" value="%{buildName}"/></td>
				<td><s:textfield  name="codeBuild.buildDesc" value="%{buildDesc}"/></td>
				<td><s:textfield name="codeBuild.parentBuildId" value="%{parentBuildId}"/></td>
				<td>
				<s:submit style="color:blue;" value="保存" action="work/CodeBuildEdit!update"></s:submit>
				<input type="button" style="color:blue;"  onclick='update(this.value,<s:property value="buildId"/>)'   value="取消更新" />
			</td>
			</s:form>
			</tr>
			</s:iterator>
			  <tr style="display:none;" id="codeBuidAdd" >
			  <s:form enctype="multipart/form-data"  method="post">
			 	<s:hidden name="funcProjectId" value="%{funcProjectId}"/>
			  	<td ></td>
				<td><s:textfield name="codeBuild.funcProjectId" value="%{funcProjectId}" readonly="true"/></td>
				<td><s:textfield name="codeBuild.buildName" /></td>
				<td><s:textfield name="codeBuild.buildDesc" /></td>
				<td><s:textfield name="codeBuild.parentBuildId" /></td>
				<td>
				<s:submit style="color:blue;" value="确定" action="work/CodeBuildEdit!save"></s:submit>
				</td>
				</s:form>
			</tr>
	</table>
	<s:form enctype="multipart/form-data" method="post" >
		<s:hidden name="funcProjectId" value="%{funcProjectId}"/>
		<s:include value="/WEB-INF/jsp/include/pagefoot.jsp"></s:include>
	</s:form>
</body>
</html>