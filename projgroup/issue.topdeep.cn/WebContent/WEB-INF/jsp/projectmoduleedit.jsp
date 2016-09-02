<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title><s:if test="roleId > 0">模块编辑</s:if><s:else>增加模块</s:else></title>
</head>
<body>
   	<s:form method="post" validate="true">
   	<s:hidden name="issueProjectModuleId"></s:hidden>
   	<s:hidden name="issueProjectId"></s:hidden>
        <div class="mainContent">
            <div class="top">
                <s:url id="url" action="Function">
            		<s:param name="mainfunc" value="1"></s:param>
            	</s:url>
            	<s:if test="issueProjectModuleId > 0"><s:a href="%{url}">模块编辑</s:a></s:if><s:else><s:a href="%{url}">模块增加</s:a></s:else>
            </div>
         <div class="title">模块信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td width="15%">模块名称</td><td width="35%"><br />
                    	<s:textfield name="projMoudle.moduleName"></s:textfield>
                    </td>
                    <td class="errorMessage"><s:fielderror><s:param>projMoudle.ModuleName</s:param></s:fielderror> </td>
                 </tr>
               <tr class="odd">
              		<td width="15%">项目名称</td>
	                	<td width="35%">
	                		<s:select name="projMoudle.issueProjectId" list="projList" listKey="issueProjectId" listValue="issueProjectName"></s:select>
	                    </td>
	                  <td></td>
               </tr>
<!--                <tr>-->
<!--                    <td width="15%">角色权限管理</td>-->
<!--	                    <td width="35%"><s:textarea name="role.roleDesc"></s:textarea></td>-->
<!--                    <td></td>-->
<!--                </tr>-->
            </table>
            <div class="title"></div>
<%--			<s:include value="/WEB-INF/jsp/include/privilege.jsp"></s:include>--%>
            <div class="controlBtn">
            	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 14, 2)}">
	            <s:submit cssClass="btnStyle1" type="button" value="保存修改" method="save"></s:submit>
	           	</s:if>
            </div>
        </div>
     </s:form>
</body>
</html>