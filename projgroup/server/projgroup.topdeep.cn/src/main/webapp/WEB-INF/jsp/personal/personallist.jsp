<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/topdeep-web-tags" %>
<%
String path = request.getContextPath();
if(path.equals("/")){
	path = "";
}
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html >
<head>
  <title>请假单</title>
  <s:head/>
  <script type="text/javascript" src="topdeep/js/common/common.js"></script>
  <script type="text/javascript" src="topdeep/js/common/common.web.util.js"></script>
  <script type="text/javascript">
  	function showToolTip(title,msg,event){
  		var util = new cn.topdeep.web.util();
      	util.showToolTip("toolTip",title,msg,event);
  	}
  	
  	function hideToolTip(){
  		var util = new cn.topdeep.web.util();
      	util.hideToolTip("toolTip");
  	}
  </script>
  <style type="text/css">
	  #toolTip{
	   border:1px solid #CCC;
	   background-color:#F9F9F9;
	   width:150px;
	   position:absolute;
	   visibility: hidden;
	   overflow: hidden;
	  	font-family: Tahoma,"宋体";
		font-size: 11px;
		font-weight: normal;
	   color:#333;
	}
	
	#toolTip h1{
	   display:block;
	  	font-family: Tahoma,"宋体";
		font-size: 12px;
		font-weight: bold;
	   background-color:#F1F1F1;
	   border-bottom:1px solid #CCC;  
	   margin:0px;
	   padding:0px 2px;   
	}
	
	#toolTip p {
	   margin:0px;
	   padding:4px 2px;   
	}
  </style>
</head>
<body>
    	<s:form method="post" validate="true">
    	
        <div class="mainContent">
            <div class="title">name待处理事项</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            <tr>
            	<th>执行ID</th>
            	<th>任务名称</th>
            	<th>活动名称</th>
            	<th>分配到</th>
            	<th>操作</th>
            	<th>任务描述</th>
            	<th>创建时间</th>
            	<th>执行时间</th>
            </tr>
            <s:iterator value="personalTaskList">
            <tr>
            	<td><a href="<s:property value='urlManage.getFlowTaskViewUrl(id)' />"><s:property value="executionId" /></a></td>
            	<td><s:property value="name" />&nbsp;</td>
            	<td><s:property value="activityName" />&nbsp;</td>
            	<td><s:property value="assignee" />&nbsp;</td>
            	<td>
            	<s:iterator value="%{getOperateList(id)}">
            		<s:a href="%{url}" title="%{desc}"><s:property value="name" /></s:a>&nbsp;
            	</s:iterator>
            	&nbsp;</td>
            	<td><s:property value="description" />&nbsp;</td>
            	<td><s:property value="createTime" />&nbsp;</td>
            </tr>
            </s:iterator>
    		</table>
            <div class="controlBtn">
<%--            		<s:submit cssClass="btnStyle1"  value="申请" method="confirm"></s:submit>--%>
            </div>
        </div>
        </s:form>
        <div id="toolTip"> </div>
      </body>
</html>