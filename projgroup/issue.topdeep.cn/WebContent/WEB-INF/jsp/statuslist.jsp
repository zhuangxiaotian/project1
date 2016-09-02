<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>问题状态管理</title>
 </head>
<body>
<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 6, 1)}">
 	<s:form method="post">
        <div class="mainContent">
        <div class="top"><a href="#">问题状态管理</a></div>
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                    <th width="5%" scope="col">标识</th>
                    <th width="20%" scope="col">问题状态名称</th>
                    <th width="20%" scope="col">问题状态顺序</th>
                    <th width="20%" scope="col">状态是否默认</th>
<!--                    <th width="20%" scope="col">登录密码</th>              -->
                </tr>
                <s:iterator value="StatusList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td align="center"><s:checkbox name="statusIds" fieldValue="%{statusId}"></s:checkbox></td>
                    <td align="center">
                    <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 6, 2)}">	
                    	<s:url id="url" action="StatusEdit"><s:param name="statusId" value="statusId" ></s:param></s:url>
	                    <s:a href="%{url}"><s:property value="statusName"></s:property></s:a>
	                </s:if><s:else><s:property value="statusName"></s:property></s:else>
                    </td>
                    <td align="center"><s:property value="statusSort"></s:property>&nbsp;</td>
                    <td align="center"><s:if test="isDefault==1"><img src="images/riskok-1.gif" alt="" /></s:if><s:else><img src="images/risknote-1.gif" alt="" /></s:else></td>
<!--                    <td><s:property value="roleDesc"></s:property>&nbsp;</td>                   -->
                </tr> 
                </s:iterator>    
            </table>
			<s:fielderror>
				<s:param>errorMessage</s:param>
			</s:fielderror>
			 <s:include value="./include/pagefoot.jsp"></s:include>  
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 6, 2)}">
            <s:a href="%{issueUrlManage.getIssueStatusEditUrl()}">添加</s:a>
            <s:submit type="input" method="disable" value="非默认"></s:submit>
            <s:submit type="input" method="enable" value="默认"></s:submit>
            </s:if>
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 6, 4)}">
            <s:submit type="input" method="delete" value="删除"></s:submit>
            </s:if>
           </div>
        </div>
        </s:form>
 </s:if>
 </body>
</html>
