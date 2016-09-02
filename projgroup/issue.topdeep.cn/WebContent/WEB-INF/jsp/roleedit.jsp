<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title><s:if test="roleId > 0">角色编辑</s:if><s:else>角色增加</s:else></title>
</head>
<body>
   	<s:form method="post" validate="true">
   	<s:hidden name="roleId"></s:hidden>
        <div class="mainContent">
            <div class="top">
                <s:url id="url" action="Function">
            		<s:param name="mainfunc" value="1"></s:param>
            	</s:url>
            	<s:if test="roleId > 0"><s:a href="%{url}">角色编辑</s:a></s:if><s:else><s:a href="%{url}">角色增加</s:a></s:else>
            </div>
         <div class="title">角色信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td width="15%">角色名称</td><td width="35%"><br />
                    	<s:textfield name="role.roleName"/>
                    </td>
                    <td class="errorMessage"><s:fielderror><s:param>role.roleName</s:param></s:fielderror> </td>
                </tr>
                <tr class="odd">
                	<td width="15%">角色状态</td>
	                	<td width="35%">
	                		<s:select name="role.roleState" list="#{1:'激活' , 0:'禁止'}" listKey="key" listValue="value"></s:select>
	                    </td>
	                <td></td>
                </tr>
            	<tr><td>#角色权限管理#</td>
            	<s:include value="./include/privilege.jsp"></s:include>
            	</tr>
				
			</table>
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 2, 2)}">
	            <s:submit cssClass="btnStyle1" type="button" value="保存修改" method="save"></s:submit>
	        </s:if>
	            <s:a href="%{issueUrlManage.getIssueRoleListUrl()}">返回角色管理</s:a>
            </div>
        </div>
     </s:form>
</body>
</html>