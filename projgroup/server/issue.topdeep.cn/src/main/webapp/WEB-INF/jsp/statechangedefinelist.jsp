<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>问题状态管理</title>
 </head>
<body>
 	<s:form method="post">
        <div class="mainContent">
        <div class="top">问题状态管理</div>
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 8, 4)}">
                    <th width="5%" scope="col">管理</th>
                    </s:if>
                    <th width="20%" scope="col">当前状态</th>
                    <th width="20%" scope="col">下个状态</th>
                    <th width="20%" scope="col">允许状态改变的角色</th>
                </tr>
                <s:iterator value="stateChangeDefineList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 8, 4)}">
               		<td align="center"><s:a href="%{issueUrlManage.getIssueStateChangeDefineDeleteUrl(currentStatusId, nextStatusId)}">删除</s:a></td>
               		</s:if>
	                 <td align="center">
	                 <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 8, 2)}">
	                 	<s:a href="%{issueUrlManage.getIssueStateChangeDefineEditUrl(currentStatusId, nextStatusId)}"><s:property value="currentStatusName" /></s:a>
	                 </s:if><s:else></s:else>
                    </td>
                    <td align="center"><s:property value="nextStatusName"></s:property>&nbsp;</td>
                    <td align="center"><s:property value="roleListName"></s:property>&nbsp;</td>
                </tr> 
                </s:iterator>    
            </table>
			<s:fielderror>
				<s:param>errorMessage</s:param>
			</s:fielderror>
			<s:include value="./include/pagefoot.jsp"></s:include>
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 8, 2)}">
            <s:a href="%{issueUrlManage.getIssueStateChangeDefineEditUrl()}">添加</s:a>
            </s:if>
           </div>
        </div>
        </s:form>
 </body>
</html>
