<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>问题管理</title>
 </head>
<body>	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 1)}">
			<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 1)}">
			<s:form action= "IssueEdit"  method="post" validate="true">
				<td align="center"><s:textfield name="issueId"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp;</td>
				<td><s:submit cssClass="btnStyle1" type="input"  value=" go to 问题" ></s:submit></td>
				<td style="color:red"><s:fielderror><s:param>issueId</s:param></s:fielderror></td> 
			</s:form>
			</s:if>
 		<s:form method="post">
 		<s:hidden name="issueProjectId"></s:hidden>
 		<s:hidden name="issueUserId"></s:hidden>
 		<s:hidden name="issueId"></s:hidden>
        <div class="mainContent">
        	<table>
	            <tr>
		            <td>问题所属项目:&nbsp;<font color="#ff0606"><s:property value="issueLoginUser.getLoginProject().getIssueProjectName()"></s:property></font></td>
		            <td>&nbsp;&nbsp;&nbsp;登录用户:&nbsp;<font color="#ff0606"><s:property value="issueLoginUser.getLoginUser().getIssueUserName()"></s:property></font></td>
		            <td>&nbsp;&nbsp;<s:a href="%{issueUrlManage.getUserPasswordUpdataUrl(issueLoginUser.getLoginUser().getIssueUserId())}">修改密码</s:a></td>
	            </tr>
	            <tr><td><br /></td></tr>
	            
	            <tr>
	            	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 2)}">
	            		<td><s:a href="%{issueUrlManage.getIssueAddUrl()}">添加新问题&nbsp;</s:a></td>
	            	</s:if>
	            	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 12, 1)}">
		            	<td><s:select name="issueQueryId" list="issueQueryList" listKey="issueQueryId" listValue="issueQueryName"></s:select></td>
		            	<td><s:submit cssClass="btnStyle1" type="input" method="search" value="查询" ></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		            					&nbsp;&nbsp;&nbsp;&nbsp;
		            	</td>
		            	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 17, 2)}">
		                <td><s:select name="statusId" list="statusList" listKey="statusId" listValue="statusName"></s:select></td>
		                <td><s:submit type="input" method="statechangebat" value="改变问题状态"></s:submit>(可多选)</td>
		                </s:if>
	            	</s:if>
	            </tr>
            </table>
            <br /><br />
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 1)}">
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 17, 2)}">
                	<th width="3%" nowrap="nowrap" scope="col">标识</th>
                	</s:if>
                    <th width="3%" nowrap="nowrap" scope="col">Id</th>
                    <th width="55%" scope="col">问题描述</th>
<%--                <th width="10%" scope="col">项目名称</th>       --%>
                    <th width="5%" nowrap="nowrap" scope="col">提交用户</th>
                    <th width="5%" nowrap="nowrap" scope="col">问题类型</th>
                    <th width="5%" nowrap="nowrap" scope="col">优先级别</th>
                    <th width="5%" nowrap="nowrap" scope="col">关联用户</th>
                    <th width="5%" nowrap="nowrap" scope="col">问题状态</th>
                    <th width="5%" nowrap="nowrap" scope="col">项目模块</th>
<%--                <th width="10%" scope="col">报告时间</th>        --%>
                    <th width="8%" nowrap="nowrap" scope="col">最后更新时间</th>
                                      
                </tr>
                <s:iterator value="issueList" status="rowStatus" ><div></div>
                
	                <tr bgcolor="#ff9999" class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
	                	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 17, 2)}">
	                	<td align="center"><s:checkbox name="issueIds" fieldValue="%{issueId}"></s:checkbox></td>
	                	</s:if>
		                <td align="center"><s:property value="issueId"></s:property>&nbsp;</td>
		                <td>
	                    	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 1)}"><s:a href="%{issueUrlManage.getIssueEditUrl(issueId)}"><s:property value="issueShortDesc"></s:property></s:a></s:if>
	                    	<s:else><s:property value="issueShortDesc"></s:property></s:else>
	                    </td>
	<!--	                <td align="center"><s:property value="issueProjectName"></s:property>&nbsp;</td>-->
		                <td align="center"><s:property value="reportUserName"></s:property>&nbsp;</td>
		                <td align="center"><s:if test="issueType ==0">程序问题</s:if><s:else>系统改进</s:else>&nbsp;</td>
		                <td align="center"><s:property value="prioritiesName"></s:property>&nbsp;</td>
		                <td align="center"><s:property value="AssignUserName"></s:property></td>
		                <td align="center"><s:property value="statusName"></s:property>&nbsp;</td>
		                <td align="center"><s:property value="moduleName"></s:property>&nbsp;</td>
	<!--	                <td align="center"><s:property value="reportTime"></s:property>&nbsp;</td>-->
		                <td align="center"><s:text name="format.date2"><s:param name="value" value="%{updateTime}"></s:param></s:text>&nbsp;</td>
	                </tr>
	              
                </s:iterator>
            </table>
            <s:include value="./include/pagefoot.jsp"></s:include>
             </s:if>
        </div>
        </s:form>
        </s:if>
 </body>
</html>