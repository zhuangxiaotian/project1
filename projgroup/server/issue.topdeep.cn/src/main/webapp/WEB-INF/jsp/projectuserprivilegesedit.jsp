<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title><s:if test="issueUserId>0 ">项目用户权限编辑</s:if><s:else>项目用户权限增加</s:else></title>
</head>
<body>
   	<s:form method="post" validate="true">
   	<s:hidden name="issueProjectId"></s:hidden>
   	<s:hidden name="issueUserId"></s:hidden>
	<s:hidden name="editFlag"></s:hidden>
    	<div class="mainContent">
            <div class="top">
                <s:url id="url" action="Function">
            		<s:param name="mainfunc" value="1"></s:param>
            	</s:url>
            	<s:if test="issueUserId > 0"><s:a href="%{url}"><s:property value="issueProject.issueProjectName" />项目用户权限编辑</s:a></s:if><s:else><s:a href="%{url}"><s:property value="issueProject.issueProjectName" />项目用户权限增加</s:a></s:else>
            </div>
         <div class="title">项目用户权限信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
<!--            	<tr>-->
<!--                    <td width="15%">项目名称</td>-->
<!--                    <td width="35%"><s:select name="userPrivileges.issueProjectId" list="projList" listKey="issueProjectId" listValue="issueProjectName"></s:select></td>-->
<!--					<td></td>-->
<!--                </tr>-->
                <tr>
                    <td width="15%">用户名称</td>
                    <s:if test="issueUserId > 0 || editFlag == 1" >
                    	<td><s:property value="issueUsers.issueUserName"/></td>
                    </s:if>
                    <s:else>
	                    <td width="35%"><s:select name="userPrivileges.issueUserId" list="userList" listKey="issueUserId" listValue="issueUserName"></s:select></td>
	                    <td class="errorMessage"><s:fielderror><s:param>userPrivileges.issueUserId</s:param></s:fielderror></td>
						<td></td>
					</s:else>
                </tr>
                <tr>
                    <td width="15%">角色名称</td>
                    <td width="35%">
                    	<s:select name="userPrivileges.roleId" list="roleList" listKey="roleId" listValue="roleName"></s:select>
                    </td>
					<td></td>
                </tr>
             
            </table>
            <div class="title"></div>
<%--			<s:include value="/WEB-INF/jsp/include/privilege.jsp"></s:include>--%>
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 13, 2)}">
	            <s:submit cssClass="btnStyle1" type="button" value="保存修改" method="save"></s:submit>
	        </s:if>   
            </div>
        </div>
     </s:form>
</body>
</html>