<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<title>问题搜索</title>
<s:head/>
</head>

<body>

<s:form method="post" validate="true">
	<s:hidden name="post" value ="true"></s:hidden>
	<s:hidden name="issueQuerySql"></s:hidden>
	<table border="0" cellpadding="8">
		<tr>
			<td colspan="10"><span class="smallnote">按ctrl键可以选择多个项目.</span></td>
		</tr>
		<tr>
				<td nowrap><span class="lbl">由谁报告:</span><br />
			<s:select name="issueCondition.reportUser" list="userList" listKey="issueUserId" listValue="issueUserName" multiple="true"></s:select>
				</td>
<%--不允许选择 应该赋值为登录的项目				<td nowrap><span class="lbl">项目:</span><br />--%>
<%--			<s:select name="issueCondition.issueProject" list="ProjList" listKey="issueProjectId" listValue="issueProjectName" multiple="true"></s:select>--%>
<%--				</td>--%>
				<td nowrap><span class="lbl">优先级:</span><br />
			<s:select name="issueCondition.issuePriorities" list="prioritiesList" listKey="prioritiesId" listValue="prioritiesName" multiple="true"></s:select>
				</td>
				<td><s:if test="%{getIssueLoginUser().getLoginUser().getInnerUserId() != null}">
				<td nowrap><span class="lbl">分配到:</span><br />
			<s:select name="issueCondition.assignToUser" list="userList" listKey="issueUserId" listValue="issueUserName" multiple="true"></s:select>
				</s:if></td>
				<td nowrap><span class="lbl">状态:</span><br />
			<s:select name="issueCondition.issueStatu" list="statusList" listKey="statusId" listValue="statusName" multiple="true"></s:select>
				</td>
				<td nowrap><span class="lbl">问题类型:</span><br />
			<s:select name="issueCondition.issueType" list="#{0:'程序问题' , 1:'系统改进'}" listKey="key" listValue="value" multiple="true"></s:select>
				</td>
		</tr><br />
		</table>
		<table>
		<tr>
				<td><span class="lbl">问题 描述包含: </span>&nbsp;</td>
				<td colspan="2"><s:textfield name="issueCondition.keyword" required="true" cssStyle="width:600px;"></s:textfield><br>
				</td>
		</tr>
<!-- 	暂时还不支持注释查询	<tr> -->
<%-- 			<td><span class="lbl">问题 注释包含: </span>&nbsp;</td> --%>
<%-- 			<td colspan="2"><s:textfield name="issueCondition." required="true" cssStyle="width:600px;"></s:textfield> --%>
<!-- 			</td> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<%-- 			<td><span class="lbl">问题 注释从: </span></td> --%>
<!-- 			<td colspan="2"> -->
<!-- 			<input name="comments_since" type="text" id="comments_since" onkeyup="on_change()" size="10" /> -->
<!-- 			<a style="font-size: 8pt;" href="javascript:show_calendar('ctl00.comments_since',  null,null,'yyyy-MM-dd');"> -->
<!-- 			[select] </a></td> -->
<!-- 		</tr> -->
		<tr>
			<td><span class="lbl">&quot;报告&quot;从日期: </span></td>
			<td colspan="2">
				<s:textfield id="reportBeginTime" name="reportBeginTime" readonly="true" onclick="setDayH(this);"></s:textfield>
				<span class="lbl">到: </span>&nbsp;
				<s:textfield id="reportEndTime" name="reportEndTime" readonly="true" onclick="setDayH(this);"></s:textfield>
			</td>
		</tr>
		<tr>
			<td><span class="lbl">&quot;最后更新&quot; 从日期: </span>&nbsp;</td>
			<td colspan="2">
				<s:textfield id="updateBeginTime" name="updateBeginTime" readonly="true" onclick="setDayH(this);"></s:textfield>
				<span class="lbl">到: </span>&nbsp;
				<s:textfield id="updateEndTime" name="updateEndTime" readonly="true" onclick="setDayH(this);"></s:textfield>
			</td>
		</tr>
		<tr>
		<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 11, 1)}">
			<td colspan="10" align="center">
			<s:submit type="input" cssClass="btn" method="search" value="搜索"></s:submit><br>
			</td>
		</s:if>
		</tr>
	</table>
	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 1)}">
	<s:if test="post">
	 <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                    <th width="3%" scope="col">Id</th>
                    <th width="60%" scope="col">问题描述</th>
<%--                    <th width="10%" scope="col">项目名称</th>--%>
                    <th width="5%" scope="col">提交用户</th>
                    <th width="5%" scope="col">问题类型</th>
                    <th width="5%" scope="col">优先级别</th>
                    <th width="5%" scope="col">关联用户</th>
                    <th width="5%" scope="col">问题状态</th>
                    <th width="5%" scope="col">项目模块</th>
<%--                    <th width="10%" scope="col">报告时间</th>--%>
                    <th width="10%" scope="col">最后更新时间</th>
                                      
                </tr>
                <s:iterator value="issueListViewByQueryConditionList" status="rowStatus" ><div></div>
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
	               <td align="center"><s:property value="issueId"></s:property>&nbsp;</td>       
	                <td>
                    	<s:a href="%{issueUrlManage.getIssueEditUrl(issueId)}"><s:property value="issueShortDesc"></s:property></s:a>
                    </td>
<%--	                <td align="center"><s:property value="issueProjectName"></s:property>&nbsp;</td>--%>
	                <td align="center"><s:property value="reportUserName"></s:property>&nbsp;</td>
	                <td align="center"><s:if test="issueType ==0">程序问题</s:if><s:else>系统改进</s:else>&nbsp;</td>
	                <td align="center"><s:property value="prioritiesName"></s:property>&nbsp;</td>
	                <td align="center"><s:property value="AssignUserName"></s:property>&nbsp;</td>
	                <td align="center"><s:property value="statusName"></s:property>&nbsp;</td>
	                <td align="center"><s:property value="moduleName"></s:property>&nbsp;</td>
<%--	                <td align="center"><s:property value="reportTime"></s:property>&nbsp;</td>--%>
	                <td align="center"><s:text name="format.date2"><s:param name="value" value="%{updateTime}"></s:param></s:text>&nbsp;</td>
                </tr>
                
                </s:iterator>    
            </table>
            <s:include value="./include/pagefoot.jsp"></s:include>
            </s:if>
            </s:if>
</s:form>
<s:form action="QueryEdit" method="post" validate="true">
<s:hidden name="issueQuerySql"></s:hidden>
	<tr><s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 12, 2)}">
		<td>SQl&nbsp&nbsp&nbsp&nbsp</td>
		<td><s:submit value="保存该查询SQL"></s:submit></td>
		</s:if>
	</tr>
</s:form>
</body>
</html>
