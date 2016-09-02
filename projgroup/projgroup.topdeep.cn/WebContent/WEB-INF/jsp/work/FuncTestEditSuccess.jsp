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
	$('.collect').live('click',function(){
		$('#paramTr').hide();
		$(this).val("+");
		$('#paramBody').empty();
		$(this).addClass('expand').removeClass('collect');
	});
	
	$('#addProc').live('click',function(){
		var $editTr = $('#editTr');
		$editTr.remove();
		var $currTr= $(this).parent().parent();
		$currTr.before($editTr);
		$editTr.show();
		var $currTargetTd = $('#editTr td:first');
		var count = $editTr.children().size();
		for(var i=0;i<count;i++){
			var $target = $($currTargetTd.children()[0]);
			$target.width($currTargetTd.width());
			$currTargetTd = $currTargetTd.next();
		}
		return false;
	});
	
	$('.cancelProdEdit').live('click', function(){
		var $editTr = $('#editTr');
		$editTr.hide();
		return false;
	});
	
	function saveTestValue(paramId){
		var testValue=$("#testValue"+paramId).val();
		var testValueDesc=$("#testValueDesc"+paramId).val();
		var buildId=$("#buildId").val();
		var testprocedureId = $("#testValue"+paramId).attr('testprocedureId');
		/* alert(testValue);
		alert(testValueDesc); */
		$.ajax({
            url: "work/FuncTestEdit!ajaxAdd",   // 提交的页面
            		
            data: {"testValue":testValue,"testValueDesc":testValueDesc,"buildId":buildId,"paramId":paramId,"testprocedureId":testprocedureId},  // 从表单中获取数据
            type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
            dataType:'json',
            success:function(jsonObj){
            	var $paramValue = $("#changeTestValue"+paramId);
            	$paramValue.empty();
        		$paramValue.append($("<input style='width: 48px;' testprocedureId='"+jsonObj.testprocedureId+"' id='testValue"+paramId+"' onblur='saveTestValue("+paramId+")' type='text' value='"+jsonObj.testValue+"'/>"));
            },
            error:function(){
           		alert("失败");
           	}
        });
	}
	
	function saveTestValueDesc(paramId){
		var testValue=$("#testValue"+paramId).val();
		var testValueDesc=$("#testValueDesc"+paramId).val();
		var buildId=$("#buildId").val();
		var testprocedureId = $("#testValueDesc"+paramId).attr('testprocedureId');
		/* alert(testValue);
		alert(testValueDesc); */
		$.ajax({
            url: "work/FuncTestEdit!ajaxAdd",   // 提交的页面
            		
            data: {"testValue":testValue,"testValueDesc":testValueDesc,"buildId":buildId,"paramId":paramId,"testprocedureId":testprocedureId},  // 从表单中获取数据
            type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
            dataType:'json',
            success:function(jsonObj){
            	var $paramValueDesc=$("#changeTestValueDesc"+paramId);
            	$paramValueDesc.empty();
        		$paramValueDesc.append($("<input style='width: 48px;' testprocedureId='"+jsonObj.testprocedureId+"' id='testValueDesc"+paramId+"' onblur='saveTestValueDesc("+paramId+")' type='text' value='"+jsonObj.testValueDesc+"'/>"));

            },
            error:function(){
           		alert("失败");
           	}
        });
	}
	
	$('.expand').live('click',function(){
		if($('.collect')!=null){
			$('.collect').val("+");
			$('.collect').addClass('expand').removeClass('collect');
		}

		var $paramTr = $('#paramTr');
		$paramTr.remove();
		$(this).parent().parent().after($paramTr);
		$paramTr.show();
		$(this).val("-");
		$(this).addClass('collect').removeClass('expand');
		var funcProcedureId = $(this).attr("funcProcedureId");
		var testprocedureId = $(this).attr('testprocedureId');
		var buildId=$("#buildId").val();
		$('#param_funcProcedureId').val(funcProcedureId);
		$.ajax({
            url: "work/FuncProcedureList!getParamList?AFuncProcedureId="+funcProcedureId+"&buildId="+buildId+"&testprocedureId="+testprocedureId,   // 提交的页面
            		
            //data: {},  // 从表单中获取数据
            type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
            dataType:'json',
            success:function(jsonObj){
            	var $paramBody = $('#paramBody');
            	$paramBody.empty();
        		for(var i =0;i<jsonObj.list.length;i++){
        			$paramBody.append($("<tr><td>"+jsonObj.list[i].paramId+"</td><td title='"+jsonObj.list[i].paramCode+"'>"+jsonObj.list[i].paramCode+"</td><td title='"+jsonObj.list[i].paramName+"'>"+jsonObj.list[i].paramName+"</td><td>"+jsonObj.list[i].paramDirection+"</td><td>"+jsonObj.list[i].paramCategory+"</td><td title='"+jsonObj.list[i].paramComment+"'>"+jsonObj.list[i].paramComment+"</td><td>"+jsonObj.list[i].parentParamId+"</td><td title='"+jsonObj.list[i].paramDataType+"'>"+jsonObj.list[i].paramDataType+"</td><td>"+jsonObj.list[i].paramDataLength+"</td><td>"+jsonObj.list[i].paramDataDecimal+"</td><td>"+jsonObj.list[i].paramDataNotNull+"</td><td>"+jsonObj.list[i].paramDataDefaultValue+"</td>"+
            				"<td>"+jsonObj.list[i].paramAllowModify+"</td><td>"+jsonObj.list[i].implInterface+"</td><td>"+jsonObj.list[i].pub0+"</td><td id='changeTestValue"+jsonObj.list[i].paramId+"'><input style='width: 48px;' testprocedureId='"+jsonObj.testparamValueList[i].testProcedureId+"' id='testValue"+jsonObj.list[i].paramId+"' onblur='saveTestValue("+jsonObj.list[i].paramId+")' type='text' value='"+jsonObj.testparamValueList[i].testValue+"'/></td><td id='changeTestValueDesc"+jsonObj.list[i].paramId+"'><input style='width: 48px;' testprocedureId='"+jsonObj.testparamValueList[i].testProcedureId+"' id='testValueDesc"+jsonObj.list[i].paramId+"' onblur='saveTestValueDesc("+jsonObj.list[i].paramId+")' type='text' value='"+jsonObj.testparamValueList[i].testValueDesc+"'/></td></tr>")); 
            	}

            },
            error:function(){
           		alert("失败");
           	}
        });
		
	
	});
	
</script>
	<style type="text/css">
	</style>
</head>
<body>
        <div class="top">
            <a href="#">构建函数参数设置</a>
        </div>
   		<a href="<s:property value='%{urlManage.getCodeBuildProcedureListUrl(buildId)}' />">构建函数选择</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildEditUrl(buildId)}' />">构建修改</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildPropertyEditUrl(buildId)}' />">构建属性</a> |  
        <a href="<s:property value='%{urlManage.getCodeBuildExecuteUrl(buildId)}' />">构建执行</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildListUrl()}' />">返回构建列表</a>
			<s:form method="post"  >
				<s:hidden id="buildId" name="buildId"></s:hidden> 
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
								<s:if test='pub5 == "1"'>
									<td><input type="button" testprocedureId="<s:property value='pub2'/>" id='bt<s:property value="funcProcedureId"/>' funcProcedureId="<s:property value='funcProcedureId'/>" style="display:block;width:20px;height:20px;" class="btn2 expand" value="+" /></td>
									<td style="text-align: left;"><s:property value="procVersion"/></td>
									<td style="text-align: left;"><s:property value="procCode"/></td>
									<td style="text-align: left;"><s:property value="procName"/></td>
								</s:if>
							</tr>
						</s:iterator>
						<tr id="editTr" style="display:none;">
							<s:form method="post" >
								<td></td>
								<td style="text-align: left;"><s:textfield   name="addprocVersion" /></td>
								<td style="text-align: left;"><s:textfield   name="addprocCode" /></td>
								<td style="text-align: left;"><s:textfield   name="addprocName"  /></td>
								<td>
									<s:submit method="addsave" value="保存" ></s:submit>	&nbsp;<a href="#" class="cancelProdEdit">取消</a>
									<s:hidden buildId="<s:property value='buildId'/>"></s:hidden>
									<s:hidden name="buildProcedureId" value="%{buildProcedureId}"></s:hidden>
								</td>
							</s:form>
						</tr>
						<tr id='paramTr' style="display:none;">
							<td colspan="12">
								<div class="mainContent" style="width:100%;">
						            <div class="top"><a href="#">参数列表</a></div>
									<table width=100% border=1 id="paraa" cellspacing="0" cellpadding="0" class="tablestyle1" style="table-layout:fixed;">
									<thead>
									<tr>
										<th style="width: 24px;">参数<br/>标识</th>
										<th style="width: 60px;">参数<br/>代码</th>
										<th style="width: 60px;">参数<br/>名称</th>
										<th style="width: 16px;">参数<br/>方向</th>
										<th style="width: 16px;">参数<br/>类型</th>
										<th style="width: 36px;">参数<br/>说明</th>
										<th style="width: 24px;">父参<br/>标识</th>
										<th style="width: 16px;">数据<br/>类型</th>
										<th style="width: 16px;">类型<br/>长度</th>
										<th style="width: 16px;">小数<br/>长度</th>
										<th style="width: 16px;">数据<br/>非空</th>
										<th style="width: 22px;">参数<br/>默认值</th>
										<th style="width: 16px;">允许<br/>修改</th>
										<th style="width: 16px;">实现<br>接口</th>
										<th style="width: 18px;">pub0</th>
										<th style="width: 28px;">参数<br>值</th>
										<th style="width: 28px;">参数<br>值描述</th>
									</tr>
									</thead>
									<tbody id="paramBody">
									</tbody>
									<tfoot id="paramListFoot">
									</tfoot>
									</table>
								</div>
							</td>
						</tr>
						</tbody>
						<tfoot>
						<tr>
							<td colspan="3" ><input type="button" id="addProc" value="添加"/></td>
						</tr>
						</tfoot>
				</table>
		   	</s:form>
</body>
</html>