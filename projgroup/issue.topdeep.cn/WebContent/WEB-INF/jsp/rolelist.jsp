<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>角色管理</title>
 </head>
<body>
<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 2 ,1)}">
 	<s:form method="post">
        <div class="mainContent">
        <div class="top"><a href="#">Issues角色管理</a></div>
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                    <th width="5%" scope="col">标识</th>
                    <th width="20%" scope="col">角色名称</th>
                    <th width="20%" scope="col">角色权限</th>
                    <th width="20%" scope="col">角色状态</th>
<!--                    <th width="20%" scope="col">登录密码</th>              -->
                </tr>
                <s:iterator value="roleList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td align="center"><s:checkbox name="roleIds" fieldValue="%{roleId}"></s:checkbox></td>
                    <td align="center">
                    	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 2 ,2)}">
                    	<s:url id="url" action="RoleEdit"><s:param name="roleId" value="roleId" ></s:param></s:url> 
	                    <s:a href="%{url}"><s:property value="roleName"></s:property></s:a>
	                  	</s:if>
	                  	<s:else><s:property value="roleName"></s:property></s:else>
                    </td>
                    <td align="center"><s:property value="rolePrivileges"></s:property>&nbsp;</td>
                    <td align="center"><s:if test="roleState==1"><img src="images/riskok-1.gif" alt="" /></s:if><s:else><img src="images/risknote-1.gif" alt="" /></s:else></td>
<!--                    <td><s:property value="roleDesc"></s:property>&nbsp;</td>                   -->
                </tr> 
                </s:iterator>    
            </table>
			<s:fielderror>
				<s:param>errorMessage</s:param>
			</s:fielderror>
			<s:include value="./include/pagefoot.jsp"></s:include>
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 2, 2)}">
            <s:a href="%{issueUrlManage.getIssueRoleEditUrl()}">添加</s:a>
            <s:submit type="input" method="disable" value="禁用角色"></s:submit>
            <s:submit type="input" method="enable" value="启用角色"></s:submit>
            </s:if>
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 2, 4)}">
            <s:submit type="input" method="delete" value="删除角色"></s:submit>
            </s:if>
           </div>
        </div>
        </s:form>
        </s:if>
 </body>
</html>
