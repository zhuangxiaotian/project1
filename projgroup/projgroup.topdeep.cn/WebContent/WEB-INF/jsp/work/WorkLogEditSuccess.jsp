<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <base />
    
    <title>查看工作日志</title>

	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
	<meta http-equiv="description" content="This is my page" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
 <table bordercolor="#000000" width="60%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
 <tr><td colspan="3">工作日:<s:property value="workLog.workDay"></s:property></td>
 <tr><td colspan="3">创建时间:<s:property value="workLog.createTime"></s:property></td>
<%-- <td colspan="2"><s:property value="workLog.createTime"></s:property></td>--%>
 </tr>
 <tr><td colspan="3">日志内容:</td></tr>
 <tr><td colspan="3"><s:property escape="false" value="workLog.workContent"></s:property></td></tr>
 <tr><td colspan="3">日志分数:<s:property value="workLog.workEvaluationScore" /></td></tr>
 <tr><td colspan="3">日志评价:<s:property value="workLog.workEvaluationContent" /></td></tr>
 <tr><td colspan="3"><s:url id="url" action="work/WorkLogEdit" method="change"><s:param name="logId" value="workLog.workLogId" ></s:param>
	  </s:url>
	  <s:if test="%{OwnerLog}">
	  	<s:a href="%{url}">修改</s:a>
	  </s:if>
	</td></tr>
 </table>
<%--<s:if test="%{getLoginUser().HasPrivilege(12, PrivilegeOperate.Delete)}  "  不能这样写,jsp页面不认识PrivilegeOperate,如果要这么写的话必须加上完成包名>--%>

<div style="width: 60%">
<s:if test="%{getLoginUser().hasPrivilege(13, 8)}">
<s:form method="post" action="WorkLogEdit" namespace="work">
<s:hidden name="logId"></s:hidden>
<table width="60%" border="0" cellspacing="0" cellpadding="0" class="tableForm" >
	<tr>
		<td width="30%">工作日志评分:&nbsp;<s:select name="logscore" list='#{"1":"1" , "2":"2" , "3":"3", "4":"4" , "5":"5"}' listKey="key" listValue="value"></s:select></td>
	</tr>
	<tr><td width="30%">工作日志评论:&nbsp;</tr>
	<tr>
		<td><s:textarea name="workevaluationcontent" rows="6" cols="40"></s:textarea></td>
	</tr>
	<tr><td ><s:submit type="input" value="评论" method="scoresave"></s:submit></td></tr>
</table>
</s:form>
</s:if>
评分说明:<br />
1: 未完成，离工作任务完成的差距还很大   <br />
2: 勉强完成，留有问题较多<br />
3: 基本完成，但有遗留问题<br />
4: 完成任务，只有极少的问题<br />
5: 较好的完成任务，完成任务且没有什么问题<br />   
</div>


</body>
</html>
