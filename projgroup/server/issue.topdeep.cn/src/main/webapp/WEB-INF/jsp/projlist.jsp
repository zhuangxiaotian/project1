<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>项目管理</title>
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="top">
                <a href="#">项目管理</a>  
            </div>
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 3 ,1)}">
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                    <th width="5%" scope="col">标识</th>
                    <th width="15%" scope="col">项目名称</th>
                    <th width="15%" scope="col">模块</th>
                    <th width="15%" scope="col">项目用户权限</th>
                    <th width="15%" scope="col">角色默认查询</th>
                    <th width="15%" scope="col">默认处理用户</th>
                    <th width="15%" scope="col">项目状态</th>
                </tr>
                
                <s:iterator value="projList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td align="center"><s:checkbox name="projIds" fieldValue="%{issueProjectId}"></s:checkbox></td>
                 	<td align="center">
                 	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 3 ,2)}">
	                   	<s:url id="url" action="ProjEdit">
	                   		<s:param name="issueProjectId" value="issueProjectId" ></s:param>
	                   	</s:url>
	                    <s:a href="%{url}">
	                    	<s:property value="issueProjectName"></s:property>
	                    </s:a>
	                </s:if><s:else><s:property value="issueProjectName"></s:property></s:else>
                    </td>
                    <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 14 ,1)}">
                    <td align="center"><s:a href="%{issueUrlManage.getIssueProjModuleListUrl(issueProjectId)}">管理</s:a></td>
                    </s:if><s:else><td align="center">管理</td></s:else>
                    <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 13 ,1)}">
                    <td align="center"><s:a href="%{issueUrlManage.getIssueProjectUserPrivilegesListUrl(issueProjectId)}">管理</s:a></td>
                    </s:if><s:else><td align="center">管理</td></s:else>
                    <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 15 ,1)}">
                    <td align="center"><s:a href="%{issueUrlManage.getRoleDefaultQueryListUrl(issueProjectId)}">管理</s:a></td>
                    </s:if><s:else><td align="center">管理</td></s:else>
                    <td align="center"><s:property value="defaultUserName"></s:property> </td>
                    <td align="center"><s:if test="projectActive==1"><img src="images/riskok-1.gif" alt="" /></s:if><s:else><img src="images/risknote-1.gif" alt="" /></s:else></td>
                </tr> 
                </s:iterator>    
                
            </table>
            <s:include value="./include/pagefoot.jsp"></s:include>           
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 3 ,2)}">
            <s:a href="%{issueUrlManage.getIssueProjEditUrl()}">添加</s:a>
            <s:submit type="input" method="disable" value="禁用项目"></s:submit>
            <s:submit type="input" method="enable" value="启用项目"></s:submit>
            </s:if>
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 3 ,4)}">
            <s:submit type="input" method="delete" value="删除"></s:submit>
            </s:if>
           </div>
           </s:if>
        </div>
        </s:form>
 </body>
</html>