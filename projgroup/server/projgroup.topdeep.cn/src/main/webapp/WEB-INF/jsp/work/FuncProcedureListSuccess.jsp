<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>函数过程列表</title>
<script language="javascript" type="text/javascript">
	
	$(function(){
		$('.expand').live('click',function(){
			var $paramTr = $('#paramTr');
			$paramTr.remove();
			$(this).parent().parent().after($paramTr);
			$paramTr.show();
			$(this).val("-");
			$(this).addClass('collect').removeClass('expand');
			var funcProcedureId = $(this).attr("funcProcedureId");
			$('#param_funcProcedureId').val(funcProcedureId);
			$.ajax({
	            url: "work/FuncProcedureList!getList?AFuncProcedureId="+funcProcedureId,   // 提交的页面
	            		
	            //data: {},  // 从表单中获取数据
	            type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
	            dataType:'json',
	            success:function(jsonObj){
	            	var $paramBody = $('#paramBody');
	            	$paramBody.empty();
	        		for(var i =0;i<jsonObj.length;i++){
	        			$paramBody.append($("<tr id='param"+jsonObj[i].paramId+"'><td>"+jsonObj[i].paramId+"</td><td title='"+jsonObj[i].paramCode+"'>"+jsonObj[i].paramCode+"</td><td title='"+jsonObj[i].paramName+"'>"+jsonObj[i].paramName+"</td><td>"+jsonObj[i].paramDirection+"</td><td>"+jsonObj[i].paramCategory+"</td><td title='"+jsonObj[i].paramComment+"'>"+jsonObj[i].paramComment+"</td><td>"+jsonObj[i].parentParamId+"</td><td title='"+jsonObj[i].paramDataType+"'>"+jsonObj[i].paramDataType+"</td><td>"+jsonObj[i].paramDataLength+"</td><td>"+jsonObj[i].paramDataDecimal+"</td><td>"+jsonObj[i].paramDataNotNull+"</td><td>"+jsonObj[i].paramDataDefaultValue+"</td>"+
	            				"<td>"+jsonObj[i].paramAllowModify+"</td><td>"+jsonObj[i].implInterface+"</td><td>"+jsonObj[i].pub0+"</td><td>"+jsonObj[i].pub1+"</td><td><a href='javascript:void(0)' onclick='moveUp("+jsonObj[i].paramId+","+funcProcedureId+",this)' class='moveup"+jsonObj[i].paramId+"'>上移</a><a href='javascript:void(0)' class='movedown"+jsonObj[i].paramId+"' onclick='moveDown("+jsonObj[i].paramId+","+funcProcedureId+",this)'>下移</a><a href='#' class='editParam'>修改</a><a href='#' class='deleteParam'>删除</a><a href='#' class='copyParam'>复制</a></td></tr>"));
	            	} 
	            },
	            error:function(){
	           		alert("失败");
	           	}
	        });
		});
		
		$('.collect').live('click',function(){
			$('#paramTr').hide();
			$(this).val("+");
			$('#paramBody').empty();
			$(this).addClass('expand').removeClass('collect');
		});
		
		$('.editProc').live('click',function(){
			var $editTr = $('#editTr');
			$editTr.remove();
			$(this).parent().parent().after($editTr);
			$editTr.show();   
			$("#updateTrId").val($(this).parent().parent().attr("id"));
			var $currTd = $($(this).parent().parent().children()[1]); 
			var $currTargetTd = $('#editTr td:first').next(); 
			var count = $(this).parent().parent().children().size() - 1;
			
			for(var i=1;i<count ;i++){
				var value = $.trim($currTd.html());
				var $target = $($currTargetTd.children()[0]);
				$target.val(value);
				$target.width($currTargetTd.width());
				$currTd = $currTd.next();
				$currTargetTd = $currTargetTd.next();
			}
			return false;
		});
		
		$('.addProc').click(function(){
			var $editTr = $('#editTr');
			$editTr.remove(); 
			var $currTr= $(this).parent().parent();
			$currTr.before($editTr);
			$editTr.show();
			var $currTargetTd = $('#editTr td:first').next().next();
			var count = $editTr.children().size()-2;
			for(var i=2;i<count;i++){
				var $target = $($currTargetTd.children()[0]);
				$target.width($currTargetTd.width());
				$currTargetTd = $currTargetTd.next();
			} 
			$("input:text").val("");
			$("#func_Procedure_Id").val("");
			$("#proc_Code").val("");  
			return false;
		});
		
		$('.cancelProdEdit').live('click', function(){
			var $editTr = $('#editTr');
			$editTr.hide(); 
			$("#updateTrId").val("");
			return false;
		});
		
		$('.deleteProc').live('click', function(){
			var $currTd = $($(this).parent().parent().children()[1]);
			var FuncProcedureId = $.trim($currTd.html()); 
			var $currTr = $(this).parent().parent();
			$.ajax({
				 url: "work/FuncProcedureList!ajaxDelete.action", 
		            data: {AFuncProcedureId:FuncProcedureId}, 
		            type: "POST",                  
		            dataType:"json",
		            success: function(jsonObj){  
		            	if(jsonObj=="ok"){  
	            			$currTr.remove();
		            	}else if(jsonObj != null && jsonObj!="ok"){
		            		alert(jsonObj);
		            	}
		            },
		        	error:function(jsonObj){
		        		alert(data);
		        		alert('error');
		        	}
	        });
			return false;

		});
		
		$('.copyParam').live('click', function(){
			var $currTd = $($(this).parent().parent().children()[0]);
			var paramId = $.trim($currTd.html());
			var $currTr = $(this).parent().parent();
			$.ajax({
	            url: "work/FuncProcedureList!ajaxCopyParams.action",  
	            data: {AparamsId:paramId}, 
	            type: "POST",                 
	            dataType:"json",
	            success: function(jsonObj){
	            	if(jsonObj.paramId != null){ 
            			var $paramBody = $('#paramBody');    
            			$paramBody.append($("<tr id='param"+jsonObj.paramId+"'><td>"+jsonObj.paramId+"</td><td title='"+jsonObj.paramCode+"'>"+jsonObj.paramCode+"</td><td title='"+jsonObj.paramName+"'>"+jsonObj.paramName+"</td><td>"+jsonObj.paramDirection+"</td><td>"+jsonObj.paramCategory+"</td><td title='"+jsonObj.paramComment+"'>"+jsonObj.paramComment+"</td><td>"+jsonObj.parentParamId+"</td><td title='"+jsonObj.paramDataType+"'>"+jsonObj.paramDataType+"</td><td>"+jsonObj.paramDataLength+"</td><td>"+jsonObj.paramDataDecimal+"</td><td>"+jsonObj.paramDataNotNull+"</td><td>"+jsonObj.paramDataDefaultValue+"</td>"+
	            				"<td>"+jsonObj.paramAllowModify+"</td><td>"+jsonObj.implInterface+"</td><td>"+jsonObj.pub0+"</td><td>"+jsonObj.pub1+"</td><td><a href='javascript:void(0)' onclick='moveUp("+jsonObj.paramId+","+jsonObj.funcProcedureId+",this)' class='moveup"+jsonObj.paramId+"'>上移</a><a href='javascript:void(0)' class='movedown"+jsonObj.paramId+"' onclick='moveDown("+jsonObj.paramId+","+jsonObj.funcProcedureId+",this)'>下移</a><a href='#' class='editParam'>修改</a><a href='#' class='deleteParam'>删除</a><a href='#' class='copyParam'>复制</a></td></tr>"));
            			alert("copy ok!");
	            	}else{
	            		alert(jsonObj);
	            	} 

	            },
	        	error:function(jsonObj){
	        		alert(jsonObj);
	        	}
	        });
			return false;

		});

		$('.copyOtherParam').live('click', function(){
			var $copyParamId = $('#copyParamId');
			var $param_funcProcedureId = $('#param_funcProcedureId');
			$.ajax({
	            url: "work/FuncProcedureList!ajaxCopyOtherParams.action",  
	            data: {AparamsId: $copyParamId.val(), AFuncProcedureId: $param_funcProcedureId.val()}, 
	            type: "POST",                 
	            dataType:"json",
	            success: function(jsonObj){
	            	if(jsonObj.paramId != null){ 
            			var $paramBody = $('#paramBody');    
            			$paramBody.append($("<tr id='param"+jsonObj.paramId+"'><td>"+jsonObj.paramId+"</td><td title='"+jsonObj.paramCode+"'>"+jsonObj.paramCode+"</td><td title='"+jsonObj.paramName+"'>"+jsonObj.paramName+"</td><td>"+jsonObj.paramDirection+"</td><td>"+jsonObj.paramCategory+"</td><td title='"+jsonObj.paramComment+"'>"+jsonObj.paramComment+"</td><td>"+jsonObj.parentParamId+"</td><td title='"+jsonObj.paramDataType+"'>"+jsonObj.paramDataType+"</td><td>"+jsonObj.paramDataLength+"</td><td>"+jsonObj.paramDataDecimal+"</td><td>"+jsonObj.paramDataNotNull+"</td><td>"+jsonObj.paramDataDefaultValue+"</td>"+
	            				"<td>"+jsonObj.paramAllowModify+"</td><td>"+jsonObj.implInterface+"</td><td>"+jsonObj.pub0+"</td><td>"+jsonObj.pub1+"</td><td><a href='javascript:void(0)' onclick='moveUp("+jsonObj.paramId+","+jsonObj.funcProcedureId+",this)' class='moveup"+jsonObj.paramId+"'>上移</a><a href='javascript:void(0)' class='movedown"+jsonObj.paramId+"' onclick='moveDown("+jsonObj.paramId+","+jsonObj.funcProcedureId+",this)'>下移</a><a href='#' class='editParam'>修改</a><a href='#' class='deleteParam'>删除</a><a href='#' class='copyParam'>复制</a></td></tr>"));
            			alert("copy ok!");
	            	}else{
	            		alert(jsonObj);
	            	} 

	            },
	        	error:function(jsonObj){
	        		alert(jsonObj);
	        	}
	        });
			return false;

		});
		
		$('.deleteParam').live('click', function(){
			var $currTd = $($(this).parent().parent().children()[0]);
			var paramId = $.trim($currTd.html());
			var $currTr = $(this).parent().parent();
			$.ajax({
	            url: "work/FuncProcedureList!ajaxDeleteParams.action",  
	            data: {AparamsId:paramId}, 
	            type: "POST",                 
	            dataType:"json",
	            success: function(jsonObj){
	            	if(jsonObj == "ok"){
	            		$currTr.remove();
	            	}else if(jsonObj != null&&jsonObj!="ok"){
	            		alert(jsonObj);
	            	}
	            },
	        	error:function(jsonObj){
	        		alert(jsonObj);
	        	}
	        });
			return false;

		});
		
		$('.addParams').live('click',function(){
			var $editTr = $('#paramEditTr');
			if($editTr.is(":visible")){
				alert("当前已处于编辑状态");
			}else{    
				$editTr.show();
				var $currTargetTd = $('#paramEditTr td:first');
				var $target = $($currTargetTd.children()[0]);
				$target.val(0);
				var count = $currTargetTd.parent().children().size() - 1;
				for(var i=0;i<count ;i++){
					var $target = $($currTargetTd.children()[0]);
					$target.width($currTargetTd.width());
					$currTargetTd = $currTargetTd.next();
				} 
				$("input:text").val(""); 
				$("#updateTrParams").val();
			}
			return false;
		});
		
		$('.editParam').live('click',function(){
			var $editTr = $('#paramEditTr');
			$editTr.remove();
			$(this).parent().parent().after($editTr);
			$editTr.show();   
    		$("#updateTrParams").val($(this).parent().parent().attr("id"));
			var $currTd = $($(this).parent().parent().children()[0]);
			var $currTargetTd = $('#paramEditTr td:first');
			var count = $(this).parent().parent().children().size() - 1;
			
			for(var i=0;i<count ;i++){
				var value = $.trim($currTd.html());
				var $target = $($currTargetTd.children()[0]);
				$target.val(value);
				$target.width($currTd.width());
				$currTd = $currTd.next();
				$currTargetTd = $currTargetTd.next();
			} 
			return false;
		});
		
		$('.saveParams').live('click',function(){ 
			var funcProcedureId = $(this).attr("funcProcedureId");
			$.ajax({
	            url: "work/FuncProcedureList!ajaxSaveParams.action",   // 提交的页面
	            data: $("#editParamForm").serialize(), //$('#paparamsAdd').serialize(), // 从表单中获取数据
	            type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
	            dataType:"json",
	            success: function(jsonObj){ 
	            	var $editTr = $('#paramEditTr');
            		$editTr.hide();
            		$editTr.remove();
            		$('#paramListFoot').append($editTr);
	            	if(jsonObj.paramId != null){ 
	            		var updateTrParams = $("#updateTrParams").val();   
	            		if(updateTrParams !=""){    
	            			$("#"+updateTrParams).children("td").eq(1).text(jsonObj.paramCode);  
          					$("#"+updateTrParams).children("td").eq(2).text(jsonObj.paramName);  
          					$("#"+updateTrParams).children("td").eq(3).text(jsonObj.paramDirection);  
          					$("#"+updateTrParams).children("td").eq(4).text(jsonObj.paramCategory);  
          					$("#"+updateTrParams).children("td").eq(5).text(jsonObj.paramComment);  
          					$("#"+updateTrParams).children("td").eq(6).text(jsonObj.parentParamId);  
          					$("#"+updateTrParams).children("td").eq(7).text(jsonObj.paramDataType);  
          					$("#"+updateTrParams).children("td").eq(8).text(jsonObj.paramDataLength);  
          					$("#"+updateTrParams).children("td").eq(9).text(jsonObj.paramDataDecimal); 
          					$("#"+updateTrParams).children("td").eq(10).text(jsonObj.paramDataNotNull);
          					$("#"+updateTrParams).children("td").eq(11).text(jsonObj.paramDataDefaultValue);  
          					$("#"+updateTrParams).children("td").eq(12).text(jsonObj.paramAllowModify);  
          					$("#"+updateTrParams).children("td").eq(13).text(jsonObj.implInterface);
          					$("#"+updateTrParams).children("td").eq(14).text(jsonObj.pub0);    
          					$("#"+updateTrParams).children("td").eq(15).text(jsonObj.pub1);
          					$("#updateTrParams").val();
	            		}else{   
	            			var $paramBody = $('#paramBody');    
	            			$paramBody.append($("<tr id='param"+jsonObj.paramId+"'><td>"+jsonObj.paramId+"</td><td title='"+jsonObj.paramCode+"'>"+jsonObj.paramCode+"</td><td title='"+jsonObj.paramName+"'>"+jsonObj.paramName+"</td><td>"+jsonObj.paramDirection+"</td><td>"+jsonObj.paramCategory+"</td><td title='"+jsonObj.paramComment+"'>"+jsonObj.paramComment+"</td><td>"+jsonObj.parentParamId+"</td><td title='"+jsonObj.paramDataType+"'>"+jsonObj.paramDataType+"</td><td>"+jsonObj.paramDataLength+"</td><td>"+jsonObj.paramDataDecimal+"</td><td>"+jsonObj.paramDataNotNull+"</td><td>"+jsonObj.paramDataDefaultValue+"</td>"+
		            				"<td>"+jsonObj.paramAllowModify+"</td><td>"+jsonObj.implInterface+"</td><td>"+jsonObj.pub0+"</td><td>"+jsonObj.pub1+"</td><td><a href='javascript:void(0)' onclick='moveUp("+jsonObj.paramId+","+funcProcedureId+",this)' class='moveup"+jsonObj.paramId+"'>上移</a><a href='javascript:void(0)' class='movedown"+jsonObj.paramId+"' onclick='moveDown("+jsonObj.paramId+","+funcProcedureId+",this)'>下移</a><a href='#' class='editParam'>修改</a><a href='#' class='deleteParam'>删除</a><a href='#' class='copyParam'>复制</a></td></tr>"));
		            	}
	            		
	            	} 
	            },
	        	error:function(jsonObj){
	        		alert(data);
	        		alert('error');
	        	}
	        });
			return false;
		});
		
		$('.cancelEditParams').live('click', function(){
    		var $editTr = $('#paramEditTr');
    		$editTr.hide();
    		$editTr.remove();
    		$('#paramListFoot').append($editTr);
    		$("#updateTrParams").val($(this).parent().parent().attr("id"));
    		return false;
		});
		$(".moveUp").live('click',function(){ 
			 var objParentTR = $(this).parent().parent(); 
			 var objTrId = $(this).parent().parent().attr("id");
			 var funcrocedureId = objTrId.substr(9,objTrId.length-1); 
			$.ajax({	 
		         url: "work/FuncProcedureList!ajaxMoveUp.action",    
		         data: {AFuncProcedureId:funcrocedureId},	 
		         type: "POST",            
		         dataType:"json",	 
		         success: function(jsonObj){ 	 
		                if(jsonObj == "ok"){	 
		                      var prevTR = objParentTR.prev();	 
		                            if (prevTR.length > 0) {	 
		                                   prevTR.insertAfter(objParentTR);	 
		                            } 	 
		                }else if(jsonObj != null && jsonObj != "ok" ){	 
		                       alert(jsonObj);	 
		                }	 
		         }  
		     }); 	 	
		});
		
		$(".moveDown").live('click',function(){ 
			 var objParentTR = $(this).parent().parent(); 
			 var objTrId = $(this).parent().parent().attr("id");
			 var funcrocedureId = objTrId.substr(9,objTrId.length-1); 
			$.ajax({	 
		         url: "work/FuncProcedureList!ajaxMoveDown.action",    
		         data: {AFuncProcedureId:funcrocedureId},	 
		         type: "POST",            
		         dataType:"json",	 
		         success: function(jsonObj){ 	 
		                if(jsonObj == "ok"){	 
		                	  var nextTR = objParentTR.next();	 	 
		                      if (nextTR.length > 0) {	 
	                              nextTR.insertBefore(objParentTR);	 
	                          } 		 
		                }else if(jsonObj != null && jsonObj != "ok" ){	 
		                       alert(jsonObj);	 
		                }	 
		         }  
		   }); 	 	
		}); 
	});
	
</script>
<style type="text/css">
	
	.tablestyle1 tr td{
		border:1px solid #D8DCDF;
		text-align:center;
		overflow:hidden; 
		white-space:nowrap;
		word-break:keep-all;
		text-overflow:ellipsis;
	}

</style>
<script type="text/javascript">
	function saveFunc(){ 
		$.ajax({
            url: "work/FuncProcedureList!ajaxSave.action",   // 提交的页面
            data: $("#editFrocForm").serialize(), //$('#paparamsAdd').serialize(), // 从表单中获取数据
            type: "POST",                   // 设置请求类型为"POST"，默认为"GET"
            dataType:"json",
            success: function(jsonObj){ 
            	var $editTr = $('#editTr');
        		$editTr.hide();
        		var updateTrId = $("#updateTrId").val();
          		  if(jsonObj.funcProcedureId !=null ||jsonObj.funcProcedureId >0){
          			  if(updateTrId !=""){  
          					$("#"+updateTrId).children("td").eq(2).text(jsonObj.procCode);  
          					$("#"+updateTrId).children("td").eq(3).text(jsonObj.procName);  
          					$("#"+updateTrId).children("td").eq(4).text(jsonObj.funcCategory);  
          					$("#"+updateTrId).children("td").eq(5).text(jsonObj.procComment);  
          					$("#"+updateTrId).children("td").eq(6).text(jsonObj.procVersion);  
          					$("#"+updateTrId).children("td").eq(7).text(jsonObj.funcCode);  
          					$("#"+updateTrId).children("td").eq(8).text(jsonObj.cacheTime);  
          					$("#"+updateTrId).children("td").eq(9).text(jsonObj.procType);  
          					$("#"+updateTrId).children("td").eq(10).text(jsonObj.funcInputInterface);  
          					$("#"+updateTrId).children("td").eq(11).text(jsonObj.funcOutputInterface);  
          					$("#updateTrId").val("");
          			  }else{
          				var $frocListBody = $('#frocListBody');  
              			$frocListBody.append($("<tr id='procedure"+jsonObj.funcProcedureId+"'><td><input type='button' id='bt"+jsonObj.funcProcedureId+"' style='display:black;width:20px;height:20px;' funcProcedureId='"+jsonObj.funcProcedureId+"' class='btn2 expand' value='+' /></td><td>"+jsonObj.funcProcedureId+"</td>"+
              			"<td style='text-align: left' title='"+jsonObj.procCode+"'>"+jsonObj.procCode+"</td><td style='text-align: left' title='"+jsonObj.procName+"'>"+jsonObj.procName+"</td><td style='text-align: left' title='"+jsonObj.funcCategory+"'>"+jsonObj.funcCategory+"</td>"+
              			"<td style='text-align: left' title='"+jsonObj.procComment+"'>"+jsonObj.procComment+"</td><td title='"+jsonObj.procVersion+"'>"+jsonObj.procVersion+"</td><td title='"+jsonObj.funcCode+"'>"+jsonObj.funcCode+"</td> <td>"+jsonObj.cacheTime+"</td><td>"+jsonObj.procType+"</td>"+
              			"<td>"+jsonObj.funcInputInterface+"</td><td>"+jsonObj.funcOutputInterface+"</td><td><a href='javascript:void(0)' class='moveUp'>上移</a> <a href='javascript:void(0)' class='moveDown'>下移</a>"+
              			"<a href='#' funcProcedureId='"+jsonObj.funcProcedureId+"' class='editProc'>更新</a>&nbsp; <a href='javascript:void(0);' class='deleteProc'>删除</a><a href='javascript:void(0);' class='copyProc'>复制</a></td></tr>"));
          			  }  
          		  } 
            }
		});
	} 
	function moveUp(id1,id3,obj){  
		        var objParentTR = $(obj).parent().parent();   
		        $.ajax({	
		         url: "work/FuncProcedureList!ajaxMoveUpParams.action",   	
		         data: {AparamsId:id1,AFuncProcedureId:id3},	
		         type: "POST",           
		         dataType:"json",	
		         success: function(jsonObj){	
		                if(jsonObj == "ok"){	 
		                      var prevTR = objParentTR.prev();	 
		                            if (prevTR.length > 0) {	 
		                                   prevTR.insertAfter(objParentTR);	 
		                            } 	 
		                }else if(jsonObj != null && jsonObj != "ok" ){	 
		                       alert(jsonObj);	 
		                }	 
		         }  
		     }); 	 
		 }	 
		 function moveDown(id1,id3,obj){  
			 var objParentTR = $(obj).parent().parent();	 
		        $.ajax({ 
		         url: "work/FuncProcedureList!ajaxMoveDownParams.action",    
		         data: {AparamsId:id1,AFuncProcedureId:id3}, 
		         type: "POST",           
		         dataType:"json",	 
		         success: function(jsonObj){	 
		                if(jsonObj == "ok"){	 
		                       var nextTR = objParentTR.next(); 
		                       if (nextTR.length > 0) { 
		                              nextTR.insertBefore(objParentTR);	 
		                       } 	 
		                }else if(jsonObj != null && jsonObj != "ok" ){	 
		                       alert(jsonObj);	 
		                }	 
		         } 	 
		     }); 	 
		 }	 
		 
		 function moveDownFun(id1,obj){     
		        $.ajax({	 
		         url: "/projgroup/work/FuncProcedureList!ajaxMoveDown.action",   	 
		         data: {AFuncProcedureId:id1},	 
		         type: "POST",            
		         dataType:"json",	 
		         success: function(jsonObj){	 
		                if(jsonObj == "ok"){ 	 
		                       var objParentTR = $(obj).parent().parent();	 
		                       
		                        
		                }else if(jsonObj != null && jsonObj != "ok" ){	 
		                       alert(jsonObj);	 
		                }	 
		         }
		     }); 
		 }
</script>
</head>
<body>
	<div class="mainContent" style="width:100%;">
            <div class="top">
                <a href="#">函数列表</a>  
            </div>
	<table width=100% border=1 cellspacing="0" cellpadding="0" style="table-layout:fixed;" class="tablestyle1">
		<thead>
			<tr>
				<th style="width: 40px;">&nbsp;</th>
				<th style="width: 50px;">函数标识</th>
				<th>函数代码</th>
				<th>函数名称</th>
				<th>函数分类</th>
				<th style="width: 80px;">函数描述</th>
				<th style="width: 40px;">函数版本</th>
				<th style="width: 100px;">功能编号</th>
				<th style="width: 40px;">缓存时间</th>
				<th style="width: 40px;">类型</th>
				<th>输入接口</th>
				<th>输出接口</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody  id="frocListBody">
			<s:iterator value="funcprocedureList">
			<tr id='procedure<s:property value="funcProcedureId"/>'>
				<td><input type="button" id='bt<s:property value="funcProcedureId"/>' style="display:black;width:20px;height:20px;" funcProcedureId="<s:property value='funcProcedureId'/>" class="btn2 expand" value="+" /></td>
				<td><s:property value="funcProcedureId"/></td>
				<td style="text-align: left" title="<s:property value="procCode"/>"><s:property value="procCode"/></td>
				<td style="text-align: left" title="<s:property value="procName"/>"><s:property value="procName"/></td>
				<td style="text-align: left" title="<s:property value="funcCategory"/>"><s:property value="funcCategory"/></td>
				<td style="text-align: left" title="<s:property value="procComment"/>"><s:property value="procComment"/></td>
				<td title="<s:property value="procVersion"/>"><s:property value="procVersion"/></td>
				<td title="<s:property value="funcCode"/>"><s:property value="funcCode"/></td>
				<td><s:property value="cacheTime"/></td>
				<td><s:property value="procType"/></td>
				<td><s:property value="funcInputInterface"/></td>
				<td><s:property value="funcOutputInterface"/></td>
				<td>
					<a href="javascript:void(0)" class="moveUp">上移</a>
	 				<a href="javascript:void(0)" class="moveDown">下移</a>
					<a href="#" funcProcedureId="<s:property value='funcProcedureId' />" class="editProc">更新</a>
					<a href="javascript:void(0);" class="deleteProc" >删除</a>
					<a href="javascript:void(0);" class="copyProc" >复制</a>
				</td>
			</tr>
			</s:iterator>
	  	    <tr id='paramTr' style="display:none;">
				<td colspan="13">
					<div class="mainContent" style="width:100%;">
			            <div class="top"><a href="#">参数列表</a></div>
						<table width=100% border=1 id="paraa" cellspacing="0" cellpadding="0" class="tablestyle1" style="table-layout:fixed;">
						<thead>
					<!--  	<tr>
							<th>参数标识</th>
							<th>参数代码</th>
							<th>参数名称</th>
							<th>参数方向</th>
							<th>参数类型</th>
							<th>参数说明</th>
							<th>父参数<br/>标识</th>
							<th>数据类型</th>
							<th>数据类型<br/>长度</th>
							<th>数据类型<br/>小数长度</th>
							<th>数据非空</th>
							<th>参数<br/>默认值</th>
							<th>参数允许<br/>修改</th>
							<th>实现接口</th>
							<th>pub0</th>
							<th>pub1</th>
							<th>操作</th>
						</tr>
						-->
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
							<th style="width: 18px;">pub1</th>
							<th style="width: 48px;">操作</th>
						</tr> 
						</thead>
						<tbody id="paramBody">
						</tbody>
						<tfoot id="paramListFoot">
							<tr id="paramEditTr" style="display: none;">
								<s:form method="post" id="editParamForm">
								<td><s:hidden name="AparamsId" id="param_paramId"/></td>
								<td><s:textfield name="funcParams.paramCode" id="param_paramCode"></s:textfield></td>
								<td><s:textfield name="funcParams.paramName" id="param_paramName"></s:textfield></td>
								<td><s:textfield name="funcParams.paramDirection" id="param_paramDirection"></s:textfield></td>
								<td><s:textfield name="funcParams.paramCategory" id="param_paramCategory"></s:textfield></td>
								<td><s:textfield name="funcParams.paramComment" id="param_paramComment"></s:textfield></td>
								<td><s:textfield name="funcParams.parentParamId" id="param_parentParamId"></s:textfield></td>
								<td><s:textfield name="funcParams.paramDataType" id="param_paramDataType"></s:textfield></td>
								<td><s:textfield name="funcParams.paramDataLength" id="param_paramDataLength"></s:textfield></td>
								<td><s:textfield name="funcParams.paramDataDecimal" id="param_paramDataDecimal"></s:textfield></td>
								<td><s:textfield name="funcParams.paramDataNotNull" id="param_paramDataNotNull"></s:textfield></td>
								<td><s:textfield name="funcParams.paramDataDefaultValue" id="param_paramDataDefaultValue"></s:textfield></td>
								<td><s:textfield name="funcParams.paramAllowModify" id="param_paramAllowModify"></s:textfield></td>
								<td><s:textfield name="funcParams.implInterface" id="param_implInterface"></s:textfield></td>
								<td><s:textfield name="funcParams.pub0" id="param_pub0"></s:textfield></td>
								<td><s:textfield name="funcParams.pub1" id="param_pub1"></s:textfield></td>
								<td><a href="#" class="saveParams">保存</a><a href="#" class="cancelEditParams">取消</a><s:hidden name="funcParams.funcProcedureId" id="param_funcProcedureId"/></td>
								</s:form> 
							<tr><th colspan="16"><a href="#" class="addParams">添加参数</a><input type="text" id="copyParamId" /><a href="#" class="copyOtherParam">复制参数</a></th></tr>
							
						</tfoot>
						</table>
					</div>
				</td>
			</tr>
			
			<tr id='editTr' style="display:none;">
			<s:form method="post" id="editFrocForm">
				<td>&nbsp;</td>
				<td><s:hidden name="funcProcedure.funcProcedureId" id="func_Procedure_Id"/></td>
				<td><s:textfield name="funcProcedure.procCode" id="proc_Code"/></td>
				<td><s:textfield name="funcProcedure.procName" id="proc_Name"/></td>
				<td><s:textfield name="funcProcedure.funcCategory" id="func_Category"/></td>
				<td><s:textfield name="funcProcedure.procComment" id="proc_Comment"/></td>
				<td><s:textfield name="funcProcedure.procVersion" id="proc_Version"/></td>
				<td><s:textfield name="funcProcedure.funcCode" id="func_Code2" /></td>
				<td><s:textfield name="funcProcedure.cacheTime" id="cache_Time"/></td>
				<td><s:textfield name="funcProcedure.procType" id="proc_Type"/></td>
				<td><s:textfield name="funcProcedure.funcInputInterface" id="func_Input_Interface"/></td>
				<td><s:textfield name="funcProcedure.funcOutputInterface" id="func_Output_Interface"/></td>
				<td>
				<a href="javascript:void(0);" onclick="saveFunc()" >保存</a>	&nbsp;<a href="#" class="cancelProdEdit">取消</a>
				<s:hidden name="AFuncProcedureId" id="edit_func_procId"></s:hidden>
				<s:hidden name="funcProjectId"></s:hidden>
				<s:hidden name="funcProcedure.funcProjectId" value="%{funcProjectId}" />
				</td> 
			</s:form>
			</tr>
		</tbody>
		<tfoot id="frocListFoot">
		<tr><th colspan="13"><a href="#" class="addProc">添加</a></th></tr>
		</tfoot>
	</table>
	<input type="hidden" id="updateTrId" value="" />
	<input type="hidden" id="updateTrParams" value="" />
	</div>
</body>
</html>