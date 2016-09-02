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
		<SCRIPT type="text/javascript">
			$(function(){
			});
		</SCRIPT>
</head>
<body>
    	<s:form method="post" validate="true">
    	<s:hidden name="taskId"></s:hidden>
        <div class="mainContent">
            <div class="title">任务信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td width="10%">任务ID</td>
                    <td><s:property value="task.id"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务名称</td>
                    <td><s:property value="task.name"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务描述</td>
                    <td><s:property value="task.description"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务分配人</td>
                    <td><s:property value="task.assignee"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务创建时间</td>
                    <td><s:property value="task.createTime"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务截止时间</td>
                    <td><s:property value="task.duedate"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务优先级</td>
                    <td><s:property value="task.priority"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务进度</td>
                    <td><s:property value="task.progress"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务执行ID</td>
                    <td><s:property value="task.executionId"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务活动名称</td>
                    <td><s:property value="task.activityName"/></td>
                </tr>
            	 <tr >
                    <td width="10%">任务表格资源名称</td>
                    <td><s:property value="task.formResourceName"/></td>
                </tr>
            </table>
            <div class="controlBtn">
            	<s:hidden id="taskOutcomeId" name="taskOutcome" value=""></s:hidden>
            	<s:iterator value="outcomes" id="ot">
            	<s:submit cssClass="btnStyle1"  value="%{#ot}" method="completedTask" onclick="$('#taskOutcomeId').val($(this).val())"></s:submit>
            	</s:iterator>
            		
            </div>
        </div>
        </s:form>
        
      </body>
</html>