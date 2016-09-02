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
	<script type='text/javascript' src='topdeep/js/cn/topdeep/common.js'></script>
	<script type='text/javascript' src='topdeep/js/cn/topdeep/util/PageUtil.js'></script>
	<script type='text/javascript' src='topdeep/js/cn/topdeep/util/DateUtil.js'></script>

<script language="javascript" type="text/javascript">

	$(function(){
		$('#ajaxBuild').click(function(){
			var buildId = $(this).attr("buildId");
			$.ajax({
	            url: "<s:property value='urlManage.getAjaxCodeBuileExecuteServiceUrl()' />",  
	            data: {buildId: buildId}, 
	            type: "POST",                 
	            dataType:"json",
	            success: function(data){
	            	if(data.result == "ok"){
	            		//refresh data
	            		initpageData();
	            		//viewlog
	            		var  buildLogId = data.buildLogId;
	            		$('#logView').empty();
	            		viewServerLog(buildLogId);
	            	}else{
	            		alert(data.result);	
	            	}
	            },
	        	error:function(jsonObj){
	        		alert(jsonObj);
	        	}
	        });
			return false;
			
		});
		
	});


	$('.download').live('click',function(){
			var buildLogId = $(this).attr("buildLogId");
  			var callUrl = "<s:property value='urlManage.getCodeBuildDownloadUrl()' />";
			var postData = "buildLogId="+buildLogId;
			callUrl += "?"+postData;
			var obj=document.getElementById('download'); 
			obj.contentWindow.location.href=callUrl; 
			return false;
	});
	
	$('.downloadLogFile').live('click',function(){
		var buildLogId = $(this).attr("buildLogId");
		var callUrl = "<s:property value='urlManage.getCodeBuildDownloadLogFileUrl()' />";
		var postData = "buildLogId="+buildLogId;
		callUrl += "?"+postData;
		var obj=document.getElementById('download'); 
		obj.contentWindow.location.href=callUrl; 
		return false;
	});
	
	$('.delete').live('click', function(){
		if(confirm("确认删除")){
			var buildLogId = $(this).attr("buildLogId");
			var $currTr = $(this).parent().parent();
			$.ajax({
	            url: "<s:property value='urlManage.getCodeBuildAjaxDeleteUrl()' />",  
	            data: {buildLogId: buildLogId}, 
	            type: "POST",                 
	            dataType:"json",
	            success: function(jsonObj){
	            	if(jsonObj == "ok"){
	            		$currTr.remove();
	            	}else{
	            		alert(jsonObj);
	            	}
	            },
	        	error:function(jsonObj){
	        		alert(jsonObj);
	        	}
	        });
		}
		return false;
	});
	var s=null;
	$('.viewLog').live('click',function(){
		var  buildLogId = $(this).attr("buildLogId");
		viewServerLog(buildLogId);
		return false;
	});
	
	
	function viewServerLog(buildLogId){
		if(s!=null){//清除上一次的定时器
			clearInterval(s);
		}
		var oldbuildLogViewPos = 0;//初始化已读文件位置
	 	var readStop;
		var logEnd=false;
		var readtimes = 1;//查找文件次数
		//var buildLogId = $(this).attr("buildLogId");
		//定时器开始
		s = setInterval(function(){
			$.ajax({//ajax开始
		 		  url: "<s:property value='urlManage.getCodeBuildAjaxViewLogUrl()' />",   // 提交的页面
				  data:{buildLogId:buildLogId,buildLogViewPos:oldbuildLogViewPos,logEnd:logEnd},    // 从表单中获取数据
				  type: "POST",  // 设置请求类型为"POST"，默认为"GET"
			  	  dataType:'json',
				  success:function(jsonObj) {
					readStop=jsonObj.readStop;
					logEnd=jsonObj.logEnd;
					if(readStop){
						clearInterval(s);
						//window.location.href=window.location.href;
					}    
					var $logView = $('#logView');
					if(jsonObj.result == "ok")//文件存在
					{
						oldbuildLogViewPos = jsonObj.position;//记录已读文件位置
						for(var i =0;i<jsonObj.loginfo.length;i++){//读文件
							if(jsonObj.loginfo[i]==null){
								continue;
							}
							$logView.append($("<span>"+jsonObj.loginfo[i]+"</span><br>"));
						}
						var e=document.getElementById("logView");
				 		e.scrollTop=e.scrollHeight;	//滚动条到最底下
					}
					else//文件不存在
					{	
						if(readtimes==2){
							clearInterval(s);
						}else{
							readtimes+=1;
							$logView.empty();
							$logView.append($("<span style='color:red;font-size:20pt;'>"+jsonObj.result+"</span><br>"));
						}
					}
				  },
				  //错误异常
				  error:function(jsonObj){
					clearInterval(s);
					var $logView = $('#logView');  
					$logView.append($("<span style='color:red;font-size:20pt;'>"+jsonObj.result+"</span><br>"));
				  }
				 });//ajax结束
			},1000);//定时器结束
		}
</script>
</head>
<body>
        <div class="top">
            <a href="#">构建执行</a>
        </div>
        <a href="<s:property value='%{urlManage.getCodeBuildProcedureListUrl(buildId)}' />">构建函数选择</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildEditUrl(buildId)}' />">构建修改</a> | 
        <a href="<s:property value='%{urlManage.getCodeBuildPropertyEditUrl(buildId)}' />">构建属性</a> |  
        <a href="<s:property value='%{urlManage.getCodeBuildExecuteUrl(buildId)}' />">构建执行</a> | 
        <a href="<s:property value='%{urlManage.getFuncTestListUrl(buildId)}' />">参数设置</a>|
        <a href="<s:property value='%{urlManage.getCodeBuildListUrl()}' />">返回构建列表</a>
    <s:if test="allowBuild">
    <s:form method="post">
    <s:hidden name="buildId"></s:hidden>
    <s:submit method="build" value="构建"></s:submit>
    </s:form>
    <input id="ajaxBuild" type="button" value="构建并返回" buildId="<s:property value='buildId' />"/>
    <span><s:property value="executeMessage" /></span>
    </s:if>
    <form id="searchForm" action=""></form>
	<table width=560 border=1 cellspacing="0" cellpadding="0" class="tablestyle1">
		<thead>
		<tr>
			<th>构建记录标识</th>
			<th>构建标识</th>
			<th>构建状态</th>
			<th>构建结果</th>
			<th>结果提示</th>
			<th>开始时间</th>
			<th>结束时间</th>
			<th>构建人</th>
			<th>下载</th>
			<th>日志</th>
			<th>日志文件下载</th>
			<th>删除</th>
		</tr>
		</thead>
		<tbody id="data">
		<%--
			<s:iterator value="buildLogList">
			<tr>
			<td><s:property value="buildLogId" /></td>
			<td><s:property value="buildId" /></td>
			<td><s:property value="buildState" /></td>
			<td><s:property value="buildResult" /></td>
			<td><s:property value="buildMessage" /></td>
			<td><s:date name="buildStartTime" format="yyyy-MM-dd HH:mm:ss"/></td>
			<td><s:date name="buildEndTime" format="HH:mm:ss"/></td>
			<td><s:property value="buildOperator" /></td>
			<td><a href="#" class="download" buildLogId="<s:property value='buildLogId'/>" >下载</td>
			<td><a href="#" class="viewLog" id="<s:property value='buildLogId'/>" buildLogId="<s:property value='buildLogId'/>" >查看日志</td>
			<td><a href="#" class="downloadLogFile" buildLogId="<s:property value='buildLogId'/>"/>日志文件下载</td>
			<td><a href="#" class="delete" buildLogId="<s:property value='buildLogId'/>" >删除</td>
			</tr>
			</s:iterator>
			 --%>
		</tbody>
	</table>
	<div id="page" style="display: none;"></div>
	<s:asynIterator targetId="data" fillDataMethodName="fillInfo">
	<tr>
		<td><s:asynProperty value="buildLogId" /></td>
		<td><s:asynProperty value="buildId" /></td>
		<td><s:asynProperty value="buildState" /></td>
		<td><s:asynProperty value="buildResult" /></td>
		<td><s:asynProperty value="buildMessage" /></td>
		<td><s:asynProperty value="buildStartTime" dateFormat="yyyy-MM-dd hh:mm:ss"/></td>
		<td><s:asynProperty value="buildEndTime" dateFormat="hh:mm:ss"/></td>
		<td><s:asynProperty value="buildOperator" /></td>
		<td><a href="#" class="download" buildLogId="<s:asynProperty value='buildLogId' />" >下载</td>
		<td><a href="#" class="viewLog" buildLogId="<s:asynProperty value='buildLogId' />" >查看</td>
		<td><a href="#" class="downloadLogFile" buildLogId="<s:asynProperty value='buildLogId' />">日志文件下载</td>
		<td><a href="#" class="delete" buildLogId="<s:asynProperty value='buildLogId' />" >删除</td>
	</tr>
	</s:asynIterator>
	<s:asynPageBrowse fillDataMethodName="fillInfo" ajaxUrl="%{urlManage.getAjaxQueryCodeBuildExecuteListServiceUrl(buildId)}" targetId="page"/>
	
	<br>
	<div id="logView" style="padding:5px; font-size:12px; OVERFLOW-Y:auto; OVERFLOW-X:hidden; border:1px solid gray;MARGIN-RIGHT: auto; MARGIN-LEFT: auto;text-align:left;width:99%;height:300px;">
	这里是输出日志信息
	</div>
	<iframe id="download" name="download" height="0px" width="0px"></iframe>
</body>
</html>