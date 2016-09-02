<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>		<tr>

			<td nowrap><span class="lbl" id="project_label">项目:</span><br />
		<s:select name="issueCondition.issueProject" list="ProjList" listKey="issueProjectId" listValue="issueProjectName"></s:select>
			</td>
			<td nowrap><span class="lbl" id="priority_label">优先级:</span><br />
		<s:select name="issueCondition.issuePriorities" list="prioritiesList" listKey="prioritiesId" listValue="prioritiesName"></s:select>
			</td>
			<td nowrap><span class="lbl" id="assigned_to_label">分配到:</span><br />
		<s:select name="issueCondition.assignUserId" list="userList" listKey="issueUserId" listValue="issueUserName"></s:select>
			</td>
			<td nowrap><span class="lbl" id="status_label">状态:</span><br />
		<s:select name="issueCondition.assignUserId" list="userList" listKey="issueUserId" listValue="issueUserName"></s:select>
			</td>
		</tr>
	
	<table border="0" cellpadding="8">
		<tr>
			<td><span class="lbl">问题 描述包含: </span>&nbsp;</td>
			<td colspan="2"><s:textfield name="issue.issueShortDesc" required="true" cssStyle="width:600px;"></s:textfield>

			</td>
		</tr>
		<tr>
			<td><span class="lbl">问题 注释包含: </span>&nbsp;</td>
			<td colspan="2"><s:textfield name="issueComment." required="true" cssStyle="width:600px;"></s:textfield>
			</td>
		</tr>
		<tr>
			<td><span class="lbl">问题 注释从: </span></td>
			<td colspan="2">
			<input name="comments_since" type="text" id="comments_since" onkeyup="on_change()" size="10" />
			<a style="font-size: 8pt;" href="javascript:show_calendar('ctl00.comments_since',  null,null,'yyyy-MM-dd');">
			[select] </a></td>
		</tr>
		<tr>
			<td><span class="lbl">&quot;报告&quot;从日期: </span></td>
			<td colspan="2">
			<input name="from_date" type="text" id="from_date" maxlength="10" size="10" onchange="on_change()" />
			<a style="font-size: 8pt;" href="javascript:show_calendar('ctl00.from_date',  null,null,'yyyy-MM-dd');">
			[select] </a>&nbsp;&nbsp;&nbsp;&nbsp; <span class="lbl">到: </span>&nbsp;<input name="to_date" type="text" id="to_date" maxlength="10" size="10" onchange="on_change()" />
			<a style="font-size: 8pt;" href="javascript:show_calendar('ctl00.to_date',    null,null,'yyyy-MM-dd');">
			[select] </a></td>
		</tr>
		<tr>
			<td><span class="lbl">&quot;最后更新&quot; 从日期: </span>&nbsp;</td>
			<td colspan="2">
			<input name="lu_from_date" type="text" id="lu_from_date" maxlength="10" size="10" onchange="on_change()" />
			<a style="font-size: 8pt;" href="javascript:show_calendar('ctl00.lu_from_date',null,null,'yyyy-MM-dd');">
			[select] </a>&nbsp;&nbsp;&nbsp;&nbsp; <span class="lbl">到: </span>&nbsp;<input name="lu_to_date" type="text" id="lu_to_date" maxlength="10" size="10" onchange="on_change()" />
		<a style="font-size: 8pt;" href="javascript:show_calendar('ctl00.lu_to_date',  null,null,'yyyy-MM-dd');">
		[select] </a></td>
		</tr>