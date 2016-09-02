<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>角色默认查询</title>
 </head>
<body>
 		<s:form method="post">
 		<s:hidden name="issueProjectId"></s:hidden>
 		<s:hidden name="roleId"></s:hidden>
        <div class="mainContent">
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 15, 4)}">
                	<th width="10%" scope="col">操作</th>
                </s:if>
                    <th width="40%" scope="col">角色名称</th>
                    <th width="40%" scope="col">默认查询名称</th>
                </tr>
                <s:iterator value="defaultQuerylist" status="rowStatus" ><div></div>
	                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
	                <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 15, 4)}">
	                	<td align="center">
	                    	<s:a href="%{issueUrlManage.getRoleDefaultQueryDelete(issueProjectId,roleId)}">删除</s:a>
	                    </td>
	                </s:if>
		                <td align="center">
		                <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 15, 2)}">
	                    	<s:a href="%{issueUrlManage.getRoleDefaultQueryEditUrl(issueProjectId,roleId)}"><s:property value="roleName"></s:property></s:a>
	                    </s:if><s:else><s:property value="roleName"></s:property></s:else>
	                    </td>
		                <td align="center"><s:property value="defaultQueryName"></s:property>&nbsp;</td>
	                </tr>
                </s:iterator> 
            </table>
            <s:include value="./include/pagefoot.jsp"></s:include>
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 15, 2)}">
            <s:a href="%{issueUrlManage.getRoleDefaultQueryEditUrl(issueProjectId)}">添加&nbsp;</s:a> 
            </s:if>
        </div>
        </s:form>
 </body>
</html>