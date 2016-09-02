<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title><s:if test="statusId > 0">状态编辑</s:if><s:else>状态增加</s:else></title>
</head>
<body>
   	<s:form method="post" validate="true">
   	<s:hidden name="statusId"></s:hidden>
        <div class="mainContent">
            <div class="top">
                <s:url id="url" action="Function">
            		<s:param name="mainfunc" value="1"></s:param>
            	</s:url>
            	<s:if test="statusId > 0">状态编辑</s:if><s:else>增加状态</s:else>
            </div>
         <div class="title">状态信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td width="15%">状态名称</td><td width="35%"><br />
                    	<s:textfield name="status.statusName"></s:textfield>
                    </td>
                    <td class="errorMessage"><s:fielderror><s:param>role.roleName</s:param></s:fielderror> </td>
                </tr>
                <tr >
                    <td width="15%">状态顺序</td><td width="15%"><br />
                    	<s:textfield name="status.statusSort"></s:textfield>
                    </td>
                    <td class="errorMessage"><s:fielderror><s:param>status.statusSort</s:param></s:fielderror> </td>
                </tr>
                <tr class="odd">
                	<td width="15%">状态是否默认</td>
	                	<td width="35%">
	                		<s:select name="status.isDefault" list='#{"true":"激活" , "false":"禁止"}' listKey="key" listValue="value"></s:select>
	                    </td>
	                 <td></td>
                </tr>
            </table>
            <div class="title"></div>
<%--			<s:include value="/WEB-INF/jsp/include/privilege.jsp"></s:include>--%>
            <div class="controlBtn">
            	<s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 6, 2)}">
	            <s:submit cssClass="btnStyle1" type="button" value="保存修改" method="save"></s:submit>
	            </s:if>
            </div>
        </div>
     </s:form>
</body>
</html>