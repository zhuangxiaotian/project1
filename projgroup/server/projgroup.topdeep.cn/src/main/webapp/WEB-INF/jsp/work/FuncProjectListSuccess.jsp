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
<title>函数项目列表</title>
<script language="javascript" type="text/javascript">
	
	function add(obj){
		if(obj=="添加"){
			$("#adds").toggle();
			$("#proadd").val("取消添加");
		}else{
			$("#adds").toggle();
			$("#proadd").val("添加");
		}
	} 
	 
	 
	function saveProj(){  
		$.ajax({
            url: "work/FuncProjectList!ajaxSave.action",  
            data: $("#saveProjectId").serialize(), 
            type: "POST",               
            dataType:"json",
            success: function(jsonObj){   
            	$("#adds").toggle();
    			$("#proadd").val("添加"); 
            	if(jsonObj.funcProjectId!=null){ 
           			var $ProjectBody = $('#ProjectBody');  
           			$ProjectBody.append("<tr id='projects"+jsonObj.funcProjectId+"'><td>"+jsonObj.funcProjectId+"</td><td>"+jsonObj.funcProjectName+"</td><td>"+jsonObj.funcProjectDesc+"</td><td colspan='2'><a style='color: blue;text-decoration: underline;cursor:pointer;' class='toUpdate' >更新</a>"+
        			"&nbsp;<a href='javascript:void(0);' class='deleteProj'>删除</a>&nbsp;<a href='work/FuncProcedureList?funcProjectId="+jsonObj.funcProjectId+"'>函数</a>&nbsp;<a href='work/FuncImport.action?funcProjectId="+jsonObj.funcProjectId+"'>数据上传</a></td></tr><tr id='update"+jsonObj.funcProjectId+"' style='display:none;' >"+
        			"<td><input type='text' style='width:80px;' id='fproj_funcProjectId"+jsonObj.funcProjectId+"' readonly='readonly' value='"+jsonObj.funcProjectId+"' name='fproj.funcProjectId'></td>"+
        			"<td><input type='text' style='width:80px;' id='fproj_funcProjectName"+jsonObj.funcProjectId+"' value='"+jsonObj.funcProjectName+"' name='fproj.funcProjectName'/></td>"+
        			"<td><input type='text' style='width:80px;' id='fproj_funcProjectDesc"+jsonObj.funcProjectId+"' value='"+jsonObj.funcProjectDesc+"' name='fproj.funcProjectDesc'/></td><td colspan='2'><input type='button' value='更新' cssClass='btn2' onclick='updateAddProj("+jsonObj.funcProjectId+");' />&nbsp;&nbsp;&nbsp;&nbsp;"+
        			"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>");
           	   }
            }
		});
	}
	function updateAddProj(ProjectId){
		var fproj_funcProjectId = $("#fproj_funcProjectId"+ProjectId).val();
		var fproj_funcProjectName = $("#fproj_funcProjectName"+ProjectId).val();
		var fproj_funcProjectDesc = $("#fproj_funcProjectDesc"+ProjectId).val();
		$.ajax({
            url: "work/FuncProjectList!ajaxUpdate.action",  
            data: {"fproj.funcProjectId":fproj_funcProjectId,"fproj.funcProjectName":fproj_funcProjectName,"fproj.funcProjectDesc":fproj_funcProjectDesc}, 
            type: "POST",               
            dataType:"json",
            success: function(jsonObj){   
            	$("#update"+ProjectId).hide();
            	$("#projects"+ProjectId).show();
            	if(jsonObj.funcProjectId != null){
            		$("#projects"+ProjectId).children("td").eq(0).text(jsonObj.funcProjectId);
            		$("#projects"+ProjectId).children("td").eq(1).text(jsonObj.funcProjectName);
            		$("#projects"+ProjectId).children("td").eq(2).text(jsonObj.funcProjectDesc); 
            	}
            }
		});
	} 
</script>
<script language="javascript" type="text/javascript">
	$(function(){
		$('.deleteProj').live('click',function(){
			var $currTr = $(this).parent().parent();
			var objTrId = $(this).parent().parent().attr("id");
			var funcProjectId = objTrId.substr(8,objTrId.length-1);
			$.ajax({
	            url: "work/FuncProjectList!ajaxDelete.action",  
	            data: {funcProjectId:funcProjectId},
	            type: "POST",                  
	            dataType:"json",
	            success: function(jsonObj){ 
	            	if(jsonObj=="ok"){
	            		$currTr.remove();
	            	}else if(jsonObj!=null&&jsonObj!="ok"){
	            		alert(jsonObj);
	            	}
	            }
			});
		});
		$('.toUpdate').live('click',function(){
			var obj = $(this).val();
			var objTrId = $(this).parent().parent().attr("id");
			var value = objTrId.substr(8,objTrId.length-1); 
			if(obj=="更新"){
				$("#update"+value).toggle();
				$("#projects"+value).toggle();
				$("#proupdate").val("确定");
			}else{
				$("#update"+value).toggle();
				$("#projects"+value).toggle();
				$("#proupdate").val("更新");
			}
		});
		$('.updateProj').live('click',function(){
			var id= $(this).parent().parent().attr("id");
			$.ajax({
	            url: "work/FuncProjectList!ajaxUpdate.action",  
	            data: $("#updateProjectForm").serialize(), 
	            type: "POST",               
	            dataType:"json",
	            success: function(jsonObj){  
	            	var num="#projects"+id.substr(6,id.length-1);
	            	$("#"+id).hide();
	            	$(num).show();
	            	if(jsonObj.funcProjectId != null){
	            		$(num).children("td").eq(0).text(jsonObj.funcProjectId);
	            		$(num).children("td").eq(1).text(jsonObj.funcProjectName);
	            		$(num).children("td").eq(2).text(jsonObj.funcProjectDesc); 
	            	}
	            }
			});
		});
	});
</script>
</head>
<body>

	<div class="mainContent">
            <div class="top">
                <a href="#">项目列表</a>  
            </div>
	<table width="100%" border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
	  	    <tr><th colspan="5"><input type="button" class="btn2" style="float:right;" id="proadd" onclick="add(this.value)" cssClass="btn2" value="添加" /></th></tr>
			<tr>
				<th>项目标识</th>
				<th>项目名称</th>
				<th>项目描述</th>
				<th colspan="2">操作</th>
			</tr>
			<tbody id="ProjectBody">
			<s:iterator value="funcProjectlist">
			<s:form method="post"  id="updateProjectForm" >
			<tr id='projects<s:property value="funcProjectId"/>'>
				<td><s:property value="funcProjectId"/></td>
				<td><s:property value="funcProjectName"/></td>
				<td><s:property value="funcProjectDesc"/></td>
				<td colspan="2">
					<a style="color: blue;text-decoration: underline;cursor:pointer;" class='toUpdate' >更新</a>
					<a href="javascript:void(0);" class="deleteProj">删除</a>
					<s:a action="work/FuncProcedureList?funcProjectId=%{funcProjectId}">函数</s:a>
					<a href="<s:property value="urlManage.getFuncImportUrl(funcProjectId)" />">数据上传</a>						
				</td>
			</tr>
			
			 <tr id='update<s:property value="funcProjectId" />' style="display:none;" >
				<td><s:textfield name="fproj.funcProjectId" value="%{funcProjectId}" readonly="true" style="width:80px;"/></td>
				<td><s:textfield name="fproj.funcProjectName" value="%{funcProjectName}" style="width:80px;"/></td>
				<td><s:textfield name="fproj.funcProjectDesc" value="%{funcProjectDesc}" style="width:80px;"/></td>
				<td colspan="2">
				<input type="button" value="更新" cssClass="btn2" class="updateProj" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				</td>
			</tr> 
			</s:form>
			</s:iterator>
			</tbody>
			<s:form enctype="multipart/form-data" method="post"  id="saveProjectId"  >
			<s:hidden name="funcProjectId" value="%{funcProjectId}"></s:hidden>
			<tr id="adds" style="display:none;">
				<td></td>
				<td><s:textfield name="fproj.funcProjectName" style="width:80px;"/></td>
				<td><s:textfield name="fproj.funcProjectDesc" style="width:80px;"/></td>
				<td colspan="2">
				<input type="button" value="添加" cssClass="btn2" onclick="saveProj();"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				</td>
			</tr>
			</s:form>
	</table>
	</div>
</body>
</html>