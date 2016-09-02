<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>用户管理</title>
 </head>
<body>
<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 1, 2)}">
 		<s:form method="post">
        <div class="mainContent">
            <div class="top">
                <a href="#">用户管理</a>  
            </div>
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                    <th width="5%" scope="col"> 标识</th>
                    <th width="20%" scope="col">登录名称</th>
                    <th width="20%" scope="col">用户姓名</th>
                    <th width="20%" scope="col">用户状态</th>
                    <th width="20%" scope="col">关联用户 </th>  
                </tr>
                <s:iterator value="userList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td align="center"><s:checkbox name="userIds" fieldValue="%{issueUserId}"></s:checkbox></td>
                    <td align="center">
                    	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 1, 2)}">
	                   	<s:url id="url" action="UserEdit"><s:param name="issueUserId" value="issueUserId" ></s:param></s:url>
	                   	<s:a href="%{url}"><s:property value="loginName"></s:property></s:a>
	                   	</s:if>
	                   	<s:else><s:property value="loginName"></s:property></s:else>
                    </td>
                    <td align="center"><s:property value="issueUserName"></s:property>&nbsp;</td>
                    <td align="center"><s:if test="userState==0"><img src="images/riskok-1.gif" alt="" />正常用户</s:if><s:else><img src="images/risknote-1.gif" alt="" />禁止用户</s:else></td>
                    <td align="center"><s:if test="issueUserType==0"><s:property value="innerUserName"></s:property></s:if><s:else><s:property value="innerUserName"></s:property></s:else>&nbsp;</td>
                </tr> 
                </s:iterator>    
            </table>
 				<s:include value="./include/pagefoot.jsp"></s:include>
             <div class="controlBtn">
             <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 1, 2)}">
            <s:a href="%{issueUrlManage.getIssueUserEditUrl()}">添加</s:a>
            <s:submit type="input" method="disable" value="禁用用户"></s:submit>
            <s:submit type="input" method="enable" value="启用用户"></s:submit>
            </s:if>
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 1, 4)}">
            <s:submit type="input" method="delete" value="删除用户"></s:submit>
            </s:if>
            <s:fielderror></s:fielderror>
           </div>
        </div>
        </s:form>
 </s:if>
 </body>
</html>