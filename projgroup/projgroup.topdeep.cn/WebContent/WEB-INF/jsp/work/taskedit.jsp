<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<title>任务编辑</title>
		<link rel="stylesheet" type="text/css" href="topdeep/js/jquery/plugins/jquery.ui/themes/base/ui.all.css" />
		<script type="text/javascript" src="<s:property value='urlManage.baseUrl' />topdeep/js/ckeditor/ckeditor_3.0.1/ckeditor.js"></script>
		<script type="text/javascript" src="topdeep/js/jquery/jquery-1.3.2/jquery-1.3.2.js"></script>
		<script type="text/javascript" src="topdeep/js/jquery/plugins/jquery.ui/ui/ui.core.js"></script>
		<script type="text/javascript" src="topdeep/js/jquery/plugins/jquery.ui/ui/ui.tabs.js"></script>
		<link rel="stylesheet" type="text/css" href="topdeep/js/jquery/plugins/jquery.datepick.package-3.7.2/redmond.datepick.css" />
		<script type="text/javascript" src="topdeep/js/jquery/plugins/jquery.datepick.package-3.7.2/jquery.datepick.pack.js"></script>
		<script type="text/javascript" src="topdeep/js/jquery/plugins/jquery.datepick.package-3.7.2/jquery.datepick-zh-CN.js"></script>
		<script type="text/javascript">
		$(function() {
			$("#tabs").tabs({
				event: 'click'
			});
			
			$(".dateInput").datepick();
		});
	</script>
	</head>
	<body>
		<s:form method="post" validate="true">
			<s:hidden name="projId"></s:hidden>
			<s:hidden name="taskId"></s:hidden>
			<div class="mainContent">
				<div class="top">
					<s:url id="url" action="Function">
						<s:param name="mainfunc" value="1"></s:param>
					</s:url>
					<s:a href="%{url}">任务编辑</s:a>
				</div>
				<div id="tabs">
					<ul>
						<li>
							<a href="#tabs-1">基本信息</a>
						</li>
						<li>
							<a href="#tabs-2">资源分配</a>
						</li>
						<li>
							<a href="#tabs-3">前置任务</a>
						</li>
					</ul>

					<div id="tabs-1">
						<table width="100%" border="0" cellspacing="0" cellpadding="0"
							class="tableForm">
							<tr>
								<td width="15%">任务名称</td>
								<td width="35%"><s:textfield name="task.taskName" required="true"></s:textfield></td>
								<td class="errorMessage">
									<s:fielderror>
										<s:param>task.taskName</s:param>
									</s:fielderror>
								</td>
							</tr>
							<tr>
								<td width="15%">
									任务管理者
								</td>
								<td width="35%">
									<s:select list="joinUserList" listKey="userId"
										listValue="realName" name="task.taskManagerId"></s:select>
								</td>
								<td class="errorMessage">
									<s:fielderror>
										<s:param>task.taskManager</s:param>
									</s:fielderror>
								</td>
							</tr>
							<tr>
								<td width="15%">
									任务状态
								</td>
								<td width="35%">
									<s:if test="taskId>0">
										<s:select list="projectBiz.taskStateMap" listKey="key"
											listValue="value" name="task.taskState"></s:select>
									</s:if>
									<s:else>暂停</s:else>
								</td>
								<td class="errorMessage">
									<s:fielderror>
										<s:param>task.taskState</s:param>
									</s:fielderror>
								</td>
							</tr>
							<tr>
								<td width="15%">
									上级任务
								</td>
								<td width="35%">
									<s:select name="task.taskParentId" list="mayParentTaskList"
										listKey="taskId" listValue="%{taskOutline+taskName}" emptyOption="true"></s:select>
								</td>
								<td></td>
							</tr>
							<tr>
								<td width="15%">
									工期
								</td>
								<td>
									<s:textfield name="task.estimateWorkTime"></s:textfield>
								</td>
								<td class="errorMessage">
									<s:fielderror>
										<s:param>task.estimateWorkTime</s:param>
									</s:fielderror>
								</td>
							</tr>
							<tr>
								<td width="15%">
									计划开始时间
								</td>
								<td width="35%">
									<s:textfield cssClass="dateInput" name="task.taskPlanStartDate"
										onclick="setDay(this);" value="%{getDateString(task.taskPlanStartDate)}"></s:textfield>
								</td>
								<td class="errorMessage">
									<s:fielderror>
										<s:param>task.taskPlanStartDate</s:param>
									</s:fielderror>
								</td>
							</tr>
							<tr>
								<td width="15%">
									计划结束时间
								</td>
								<td width="35%">
									<s:textfield cssClass="dateInput" name="task.taskPlanEndDate"
										onclick="setDay(this);" value="%{getDateString(task.taskPlanEndDate)}"></s:textfield>
								</td>
								<td class="errorMessage">
									<s:fielderror>
										<s:param>task.taskPlanEndDate</s:param>
									</s:fielderror>
								</td>
							</tr>
							<tr>
								<s:if test="taskId>0">
									<td width="15%">
										已耗工时
									</td>
									<td width="35%">
										<s:textfield name="task.actualWorkTime"></s:textfield>
										小时
									</td>
									<td class="errorMessage">
										<s:fielderror>
											<s:param>task.actualWorkTime</s:param>
										</s:fielderror>
									</td>
								</s:if>
								<s:else>
									<td width="15%">
										已耗工时
									</td>
									<td width="35%">
										<s:textfield name="task.actualWorkTime" value="0.0"></s:textfield>
										小时
									</td>
									<td></td>
								</s:else>
							</tr>
						</table>
					</div>
					<div id="tabs-2">
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
							<thead>
								<tr>
									<th width="100px">选择</th>
									<th>资源名称</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="resourceList">
								<tr>
									<td><s:checkbox name="joinTaskUserIds" fieldValue="%{userId}" value="%{selected}" /></td>
									<td><s:property value="realName" /></td>
								</tr>	
								</s:iterator>
								
							</tbody>
						</table>
					</div>
					<div id="tabs-3">
						<s:select id="prevTask" list="mayPrevTaskList"
										listKey="taskId" listValue="%{taskOutline+taskName}"></s:select>
						<input id="prevTaskAdd" type="button" value="添加" />
						<script type="text/javascript">
							$(function(){
								$("#prevTaskAdd").bind("click",function(){
									var target = $("#prevTask option:selected"); 
									//alert(target.val()+":"+target.text());
									var id = "#prevTask_"+target.val();
									if($(id).length > 0){
										alert("您所选择的任务已经是前置任务了！");
									}else{
										var html = "<tr id='prevTask_"+target.val()+"'><td><input type='hidden' name='selectedPrevTaskIds' value='"+target.val()+"' />"+target.val()+"</td><td>"+target.text()+"</td><td><input id='removePrevTask_"+target.val()+"' type='button' value='删除' /></td></tr>";
										$("#selectedPrevTask").append(html);
										$("#removePrevTask_"+target.val()).bind("click",function(){
											$(id).remove();
										});
									}
								});
							});
						</script>
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
							<thead>
								<tr>
									<th width="100px">编号</th>
									<th width="200px">任务名称</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody id="selectedPrevTask">
								<s:iterator value="prevTaskList">
								<tr id='prevTask_<s:property value="taskId" />'>
									<td><input type="hidden" name="selectedPrevTaskIds" value='<s:property value="previousTaskId" />' /><s:property value="previousTaskId" /></td>
									<td><s:property value="taskOutline + taskName" /></td>
									<td><input id='removePrevTask_<s:property value="taskId" />' type="button" value="删除" /></td>
								</tr>	
								</s:iterator>
							</tbody>
						</table>
						<script type="text/javascript">
							$(function(){
								$("#selectedPrevTask input").bind("click",function(){
									$(this.parentNode.parentNode).remove();
								});
							});
						</script>
					</div>
					
					<div class="title">
					任务描述
				</div>
				<s:textarea id="taskEditor" name="task.taskDesc"></s:textarea>
<%--				<textarea rows="10" cols="80" id="taskEditor"></textarea>--%>
		<script type="text/javascript">
			CKEDITOR.replace( 'taskEditor' );
		</script>
					
				</div>
				<div class="title">
					错误描述
					<s:fielderror></s:fielderror>
				</div>



				<div class="controlBtn">
					<s:submit cssClass="btnStyle1" value="保存" method="save"></s:submit>
					<input class="btnStyle1" type="button" value="返回任务管理"
						onclick='submitForm("TaskList.action");' />
				</div>



			</div>
		</s:form>


	</body>

</html>
