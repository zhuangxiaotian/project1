<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
<title id="title">添加新问题</title>
</head>
<body>
<div class=align>
<table border=0>
	  添加新问题    (带*号的为必填项)
			<form  method="post" validate="true">
				<tr>
					<td>
						<span>问题描述*</span>
						<span ><s:textfield name="issue.issueShortDesc" required="true" cssStyle="width:600px;"></s:textfield></span><br><br>
					</td>
					<td class="errorMessage"><s:fielderror><s:param>issue.issueShortDesc</s:param></s:fielderror></td>
				</tr>
				
				<tr id="row1">
					<td colspan="5" nowrap>
						<span id="reassign_label" class="lbl">分配到:&nbsp;</span>
						<s:select name="issue.assignUserId"  list="userList" listKey="issueUserId" listValue="issueUserName"></s:select>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<span id="reassign_label" class="lbl">模块分类:&nbsp;</span>
						<s:select name="issue.issueProjectModuleId" list="ProjMoudleList" listKey="issueProjectModuleId"></s:select>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<span class="lbl" id="priority_label">优先级:&nbsp;</span>
						<span id="static_priority" class="static" style="display: none;"></span>
						<s:select name="issue.prioritiesId" list="prioritiesList" listKey="prioritiesId" listValue="prioritiesName"></s:select>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<span id="reassign_label" class="lbl">问题类型:&nbsp;</span>
						<s:select name="issue.issueType" list='#{"0":"程序问题" , "1":"系统改进"}' listKey="key" listValue="value"></s:select><br><br>
					</td>
				</tr>
				<tr>
					<td colspan=4>
<!--						<font size=0>-->
<!--							<span id="plus_label">-->
<!--								<a name=toggle_link href=javascript:resize_comment(10)><span id="toggle_link">[+]</span></a>-->
<!--								&nbsp;<a name=toggle_link href=javascript:resize_comment(-10)><span id="toggle_link">[-]</span></a>-->
<!--							</span>-->
<!--						</font>&nbsp;-->
							<span id="comment_label">注释:</span><br>
							<textarea name="issueCommentContent" id="comment" rows="12" cols="80" class="txt"></textarea><br>
							<span id="comment_err" class="err"></span>
					</td>
				</tr>
				<tr>
					<td colspan=4 align=left>
						<span id="custom_field_msg" class="err"></span>
						<span id="msg" class="err"></span>
					</td>
				</tr>
				<tr>
					<td>	 
			            <div class="controlBtn">
			            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 2)}">
			            <s:submit cssClass="btnStyle1" type="button" value="保存" method="save"></s:submit>
			            </s:if>
	           		</td>
	            </tr>
</table>
</div>
</body>
</html>