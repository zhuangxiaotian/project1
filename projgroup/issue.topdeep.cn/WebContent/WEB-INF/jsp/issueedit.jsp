<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
if(path.equals("/")){
	path = "";
}
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<title >问题查看</title>
<script type="text/javascript">
function autofill(){
	var t1 = document.getElementById("comment");
	var s1 = document.getElementById("statechange");
	if(s1.options[s1.selectedIndex].text == "已修复") {
		t1.value = "已修复" + t1.value;
	}
}
</script>
</head>
<body>
<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 1)}">
<div class=align>
	<s:form action= "IssueEdit"  method="post" validate="true">
				<td align="center">问题ID:&nbsp;&nbsp;<s:textfield name="issueId"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td><s:submit cssClass="btnStyle1" type="input"  value=" go to 问题" ></s:submit></td>
				<td style="color:red"><s:fielderror><s:param>issueId</s:param></s:fielderror></td> 
	</s:form>
<s:if test="%{issue != null}">
	<table border="0">
		
	
	<s:form validate="true">
	<s:hidden name="issueId"></s:hidden>
	<s:hidden name="oldTimeStamp" value="%{timeStamp}"></s:hidden>
	<s:hidden name="oldStatusId" value="%{issue.getStatusId()}"></s:hidden>
	
	<table border=0>
		<tr>
			<td>
				<span>问题描述:</span>
				<s:if test='%{!statusName.equalsIgnoreCase("已关闭")}'>
				<span ><s:textfield name="issue.issueShortDesc" required="true" cssStyle="width:600px;"></s:textfield></span><br><br>
				<s:fielderror><s:param>issue.issueShortDesc</s:param></s:fielderror>
				</s:if>
				<s:else><s:property value="issue.getIssueShortDesc()"/></s:else>
			</td>
		</tr>
		<tr id="row1">
			<td colspan="5" nowrap>
			<s:if test="issueLoginUser.getLoginUser().getInnerUserId() != null">
				<span id="reassign_label" class="lbl">分配到:&nbsp;</span>
				<s:if test='%{!statusName.equalsIgnoreCase("已关闭")}'>
				<s:select name="issue.assignUserId"  list="userList" listKey="issueUserId" listValue="issueUserName"></s:select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				</s:if>
				<s:else><s:select name="issue.assignUserId"  list="userList" listKey="issueUserId" listValue="issueUserName" disabled="true"></s:select>&nbsp;&nbsp;&nbsp;&nbsp;</s:else>
				</s:if>
				<span id="reassign_label" class="lbl">模块分类:&nbsp;</span>
				<s:if test='%{!statusName.equalsIgnoreCase("已关闭")}'>
				<s:select name="issue.issueProjectModuleId" list="ProjMoudleList" listKey="issueProjectModuleId"></s:select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				</s:if>
				<s:else>
				<s:select name="issue.issueProjectModuleId" list="ProjMoudleList" listKey="issueProjectModuleId" disabled="true"></s:select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				</s:else>
				<span class="lbl" id="priority_label">优先级:&nbsp;</span>
				<span id="static_priority" class="static" style="display: none;"></span>
				<s:if test='%{!statusName.equalsIgnoreCase("已关闭")}'>
				<s:select name="issue.prioritiesId" list="prioritiesList" listKey="prioritiesId" listValue="prioritiesName"></s:select>
				&nbsp;&nbsp;&nbsp;&nbsp;
				</s:if>
				<s:else><s:select name="issue.prioritiesId" list="prioritiesList" listKey="prioritiesId" listValue="prioritiesName" disabled="true"></s:select>
				&nbsp;&nbsp;&nbsp;&nbsp;</s:else>
				<span id="reassign_label" class="lbl">问题类型:&nbsp;</span>
				<s:if test='%{!statusName.equalsIgnoreCase("已关闭")}'>
				<s:select name="issue.issueType" list='#{"0":"程序问题" , "1":"系统改进"}' listKey="key" listValue="value"></s:select><br><br>
				</s:if>
				<s:else><s:select name="issue.issueType" list='#{"0":"程序问题" , "1":"系统改进"}' listKey="key" listValue="value" disabled="true"></s:select><br><br></s:else>
			</td>
		</tr>
		<tr>
		<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 2)}">
			<td>
				当前状态为:&nbsp;
				<s:property value="statusName"/>&nbsp;&nbsp;
				更改状态为:&nbsp;
				<s:if test='%{!statusName.equalsIgnoreCase("已关闭")}'>
				<s:select name="issue.statusId" id="statechange" list="nextStatusList" listKey="statusId" listValue="statusName" emptyOption="true" onchange="autofill()"></s:select>
				</s:if>
				<s:else><s:select name="issue.statusId" id="statechange" list="nextStatusList" listKey="statusId" listValue="statusName" disabled="true" emptyOption="true" onchange="autofill()"></s:select></s:else>
			</td>
		</s:if>
		</tr>
		<tr>
			<td colspan=4>
				<font size=0></font>
				<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 5, 2)}">
				<span id="comment_label">填写注释:<s:if test='%{statusName.equalsIgnoreCase("已关闭")}'>&nbsp;&nbsp;<font color="#ff0000">(该问题已关闭,您仅可以添加注释!)</font></s:if></span><br>
				<textarea name="issueCommentContent" id="comment" rows="12" cols="80" class="txt"></textarea><br>
				<span id="comment_err" class="err"></span>
				</s:if>
			</td>
		</tr>
			<tr>
				<td colspan=4 align=left>
					<span id="custom_field_msg" class="err"></span>
					<span id="msg" class="err"></span>
				</td>
			</tr>
			<tr>
				<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 2)}">
			            <td><s:submit name="test" cssClass="btnStyle1" type="button" value="更新" method="save"></s:submit></td>
			            <td style="color:red"><s:fielderror><s:param>test</s:param></s:fielderror></td>
			    </s:if>
		    </tr>
		   
	</table>
		
	
	</s:form>
	</table>
	
	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 5, 1)}">
	<table border=0 cellspacing=3>
		<tr><td nowrap>
		<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 2)}">
			<span id="attachment"><s:a href="%{issueUrlManage.getUpLoadUrl(issueId)}">添加附件</s:a><span class="smallnote">(save changes first)</span></span>
		</s:if>
			<p>
			<span id="toggle_images"><s:a href="%{issueUrlManage.getIssueEditUrl(issueId)}">隐藏图片</s:a><span class="smallnote">(save changes first)</span></span>
			&nbsp;&nbsp;&nbsp;&nbsp;
			<span id="toggle_history"><a href='javascript:toggle_history(1247)'>show change history</a>&nbsp;&nbsp;&nbsp;&nbsp;<span class="smallnote">(save changes first)</span></span>
		</td></tr>
		
		<s:iterator value="issueCommentListViewList" status="rowStatus" >
		<tr><td class=cmt><table width=100% ><tr><td align=left>
		<s:if test="commentType == 1"><span class="pst">状态改变 <a name=5705></a>由:&nbsp; <s:property value="issueUserName"></s:property> 提交于:&nbsp; <s:property value="commentTime" />&nbsp;</span></s:if><s:else>
		<span class="pst">该条注释 <a name=5705></a>由 :&nbsp; <s:property value="issueUserName"></s:property> 提交于 :&nbsp; <s:property value="commentTime" /></span>
		</s:else></td>
		<td align=right>&nbsp;&nbsp;&nbsp;&nbsp;<a style='font-size: 8pt;' href=send_email.aspx?quote=1&bp_id=5705&reply=forward>forward</a></td></tr></table>
	<table border=0><tr><td><span class="cmt_text"></span>
		<tr>
			<td>
				<s:if test="attachFileSize > 0">
				附件描述：<s:property value="commentContent"></s:property>
					<a href="<%=path%><s:property  value = 'attachFilePath'/>" target="_blank">下载附件</a><br />
					<s:if test="isImage">
					<img src="<%=path%><s:property  value = 'attachFilePath'/>" />
					</s:if>
				</s:if>
				<s:else>
				<pre><s:property value="commentContent"></s:property></pre>
				</s:else>
			</td>
		</tr>
	</table>
	</td></tr>
		</s:iterator>
	</table>
	</s:if>
</s:if>
<s:else>
	<font color="#ff0000" size="6"><strong><br><br><br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	⊙﹏⊙您查看的问题不存在,请重新输入问题ID!</strong></font>
</s:else>
</div>
</s:if>
</body>
</html>