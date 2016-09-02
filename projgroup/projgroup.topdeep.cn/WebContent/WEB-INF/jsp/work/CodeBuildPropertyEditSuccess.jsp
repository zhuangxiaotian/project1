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
$(function(){
	
	$('.addProperty').live('click',function(){
		var $editTr = $('#codeBuidPropertyUpdate');
		if($editTr.is(":visible")){
			alert("当前已处于编辑状态");
		}else{
			$editTr.show();
			var $currTargetTd = $('#codeBuidPropertyUpdate td:first');
			var $target = $($currTargetTd.children()[0]);
			$target.val(0);
		}
		return false;
	});
	
	$('.editProperty').live('click',function(){
		var $editTr = $('#codeBuidPropertyUpdate');
		$editTr.remove();
		$(this).parent().parent().after($editTr);
		$editTr.show();
		
		var $currTd = $($(this).parent().parent().children()[0]);
		var $currTargetTd = $('#codeBuidPropertyUpdate td:first');
		var count = $(this).parent().parent().children().size() - 1;
		for(var i=0;i<count ;i++){
			var value = $.trim($currTd.html());
			var $target = $($currTargetTd.children()[0]);
			$target.val(value);
			$target.width($currTargetTd.width());
			$currTd = $currTd.next();
			$currTargetTd = $currTargetTd.next();
		}

		return false;
	});
	
	$('.cancelEditProperty').live('click', function(){
		var $editTr = $('#codeBuidPropertyUpdate');
		$editTr.hide();
		$editTr.remove();
		$('#propertyListFoot').append($editTr);
		return false;
	});
	
	});
</script>
</head>
<body>
        <div class="top">
            <a href="#">构建属性</a>
        </div>
        <a href="<s:property value='%{urlManage.getCodeBuildProcedureListUrl(buildId)}' />">构建函数选择</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildEditUrl(buildId)}' />">构建修改</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildPropertyEditUrl(buildId)}' />">构建属性</a> |  
        <a href="<s:property value='%{urlManage.getCodeBuildExecuteUrl(buildId)}' />">构建执行</a> | 
        <a href="<s:property value='%{urlManage.getFuncTestListUrl(buildId)}' />">参数设置</a>|
        <a href="<s:property value='%{urlManage.getCodeBuildListUrl()}' />">返回构建列表</a>
	<table width=560 border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
		<s:form  method="post">	
			<thead>
		  	    <tr><th colspan="6">
		  	    	<input id="new" type="button" style="float:right;color:blue;" cssClass="btn2" class="addProperty" value="添加" />
		  	    	<a href="<s:property value='%{urlManage.getCodeBuildListUrl()}' />">返回构建列表</a>
		  	    </th></tr>
	  	   </s:form>
			<tr>
				<th>属性标识</th>
				<th>构建标识</th>
				<th>属性名称</th>
				<th>属性值</th>
				<th>属性描述</th>
				<th style="width: 80px;">操作</th>
			</tr>
				</thead>
			<tbody id="paramBody">
						
			<s:iterator value="codeBuildPropertyListView" status="rowStatus">
			<s:form enctype="multipart/form-data"  method="post">
			<s:hidden name="buildPropertyId" value="%{buildPropertyId}"/>
			<s:hidden name="buildId" value="%{buildId}"/>
			<tr  id='codeBuidPropertyData<s:property value="buildPropertyId"/>' class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
				<td><s:property value="buildPropertyId"/></td>
				<td><s:property value="buildId"/></td>
				<td style="text-align: left;"><s:property value="buildPropertyName"/></td>
				<td style="text-align: left;"><s:property value="buildPropertyValue"/></td>
				<td style="text-align: left;"><s:property value="buildPropertyDesc"/></td>
				<td>
				<input type="button" style="color:blue;" onclick='update(this.value,<s:property value="buildPropertyId"/>)' class='editProperty' cssClass="btn2" value="更新" />
					<s:submit style="color:blue;" value="删除" action="work/CodeBuildPropertyEdit!delete"></s:submit>
				</td>
			</tr>
			</s:form>
		</s:iterator>
		</tbody>
	<tfoot id="propertyListFoot">
			 <tr style="display:none;" id='codeBuidPropertyUpdate' >
			 <s:form id="editPropertyForm"  method="post">
			 	<s:hidden name="buildId" value="%{buildId}"/>
			  	<td ><s:textfield name="codeBuildProperty.buildPropertyId" value="%{buildPropertyId}" readonly="true"/></td>
				<td><s:textfield name="codeBuildProperty.buildId" value="%{buildId}" readonly="true"/></td>
				<td style="text-align: left;"><s:textfield name="codeBuildProperty.buildPropertyName" value="%{buildPropertyName}"/></td>
				<td style="text-align: left;"><s:textfield  name="codeBuildProperty.buildPropertyValue" value="%{buildPropertyValue}"/></td>
				<td style="text-align: left;"><s:textfield name="codeBuildProperty.buildPropertyDesc" value="%{buildPropertyDesc}"/></td>
				<td>
				
				<input style="color:blue;" type="button" class="cancelEditProperty" value="取消"/>
				<s:submit style="color:blue;" value="保存" action="work/CodeBuildPropertyEdit!ajaxSaveProperty"></s:submit>
			</td>
			</s:form>
			</tr>
   </tfoot>
	</table>
	<s:form method="post" >
		<s:hidden name="buildId" value="%{buildId}"/>
		<s:include value="/WEB-INF/jsp/include/pagefoot.jsp"></s:include>
	</s:form>
	<br/>
	
	<s:form method="post">
		<s:hidden name="buildId"></s:hidden>
		要导入的build标识<s:textfield name="srcBuildId"></s:textfield>
		<s:submit style="color:blue;" value="导入" method="copyPropFrom"></s:submit>
	</s:form>
	
	
</body>
</html>