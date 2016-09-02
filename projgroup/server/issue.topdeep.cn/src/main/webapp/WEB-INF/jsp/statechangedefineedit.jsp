<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title><s:if test="currentStatusId>0 ">问题状态编辑</s:if><s:else>问题状态增加</s:else></title>
</head>
<body>
   	<s:form method="post" validate="true">
   	<s:hidden name="currentStatusId"></s:hidden>
    <s:hidden name="nextStatusId"></s:hidden>
    	<div class="mainContent">
            <div class="top">
            	<s:if test="currentStatusId > 0">问题状态定义编辑</s:if><s:else>问题状态定义增加</s:else>
            </div>
         <div class="title">角色信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	<tr>
                    <td width="15%">当前状态名称</td>
                    <td width="35%"><s:select name="define.currentStatusId" list="statusList" listKey="statusId" listValue="statusName"></s:select></td>
					<td></td>
                </tr>
                <tr>
                    <td width="15%">下个状态名称</td>
                    <td width="35%"><s:select name="define.nextStatusId" list="statusList" listKey="statusId" listValue="statusName"></s:select></td>
                    <td class="errorMessage"><s:fielderror><s:param>define.NextStatusId</s:param></s:fielderror> </td>
					<td></td>
                </tr>
                <tr>
                    <td width="15%">允许进行状态改变的角色</td>
                    <td width="35%">
                    <s:iterator value="roleList">
                    	<s:checkbox name="selectedRoleIds" fieldValue="%{roleId}" value="%{selected}"><s:property value="roleName" /></s:checkbox>
                    </s:iterator>
                    </td>
					<td></td>
                </tr>
             
            </table>
            <div class="title"></div>
<%--			<s:include value="/WEB-INF/jsp/include/privilege.jsp"></s:include>--%>
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 8, 2)}">
	            <s:submit cssClass="btnStyle1" type="input" value="保存修改" method="save"></s:submit>
	        </s:if>
            </div>
        </div>
     </s:form>
</body>
</html>