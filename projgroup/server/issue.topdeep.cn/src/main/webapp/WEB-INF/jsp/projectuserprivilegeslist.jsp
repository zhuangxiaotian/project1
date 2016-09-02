<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>问题系统项目用户权限管理</title>
 </head>
<body>
 		<s:form method="post">
 		<s:hidden name="issueProjectId"></s:hidden>
 		<s:hidden name="issueUserId"></s:hidden>
        <div class="mainContent">
            <div class="top">
                <a href="#"><s:property value="issueProject.issueProjectName" />用户权限管理</a>  
            </div>
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 13, 4)}">
                    <th width="5%" scope="col">管理</th>
                    </s:if>
                    <th width="20%" scope="col">用户名称</th>
                    <th width="20%" scope="col">角色名称</th>
                </tr>
                <s:iterator value="privilegesList" status="rowStatus" ><div></div>
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
<!--                <td align="center"><s:checkbox name="privilegesIds" fieldValue="%{issueprojectId}"></s:checkbox></td>       修改为以下-->
					<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 13, 4)}">
						<td align="center">
							<s:a href="%{issueUrlManage.getIssueProjectUserPrivilegesDeleteUrl(issueProjectId,issueUserId)}">删除</s:a>
						</td>
					</s:if>
	                <td align="center">
	                	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 13, 2)}">
	                    <s:a href="%{issueUrlManage.getIssueProjectUserPrivilegesEditUrl(issueProjectId, issueUserId)}"><s:property value="issueUserName"></s:property></s:a>
	                    </s:if>
	                    <s:else><s:property value="issueUserName"></s:property></s:else>
                    </td>
                    <td align="center"><s:property value="RoleName"></s:property>&nbsp;</td>
                </tr>
                </s:iterator>    
            </table>
			<s:include value="./include/pagefoot.jsp"></s:include>
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 13, 2)}">
            <s:a href="%{issueUrlManage.getIssueProjectUserPrivilegesEditUrl(issueProjectId)}">添加</s:a>
            </s:if>
           </div>
        </div>
        </s:form>
 </body>
</html>