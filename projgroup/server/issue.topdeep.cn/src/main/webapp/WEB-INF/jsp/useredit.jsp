<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title><s:if test="roleId > 0">用户编辑</s:if><s:else>增加用户</s:else></title>
  <script type="text/javascript">
  	function check(){
  	  	var mail = document.getElementById('mail').value;
  	  	var myreg = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
  	 	if(!myreg.test(mail)){
  	  	 	alert("请输入正确的邮箱格式")
			return false;
		}
		return true;
  	}
  </script>
</head>
<body>
    	<s:form method="post" validate="true" onsubmit="return check()">
    	<s:hidden name="issueUserId"></s:hidden>
        <div class="mainContent">
            <div class="title">
                用户信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	<tr>
                    <td width="15%">登录名称</td>
                    <td width="35%"><s:textfield name="user.loginName" required="true"></s:textfield></td>
                    <td class="errorMessage"><s:fielderror><s:param>user.loginName</s:param></s:fielderror></td>
                </tr>
                <tr class="odd">
                    <td width="15%">登录密码</td>
                    <td width="35%"><s:password name="loginPassword"></s:password></td>
                    <td class="errorMessage"><s:fielderror><s:param>loginPassword</s:param></s:fielderror> </td>
                </tr>
<!--                <tr>-->
<!--                    <td width="15%">用户状态</td>-->
<!--                    <td width="35%"><s:select name="user.userState" list="#{1:'正常用户' , 0:'禁止用户'}" listKey="key" listValue="value"></s:select></td>-->
<!--                    <td></td>-->
<!--                </tr>-->
                <tr class="odd">
                    <td width="15%">用户名称</td>
                    <td width="35%"><s:textfield name="user.issueUserName" required="true"></s:textfield></td>
                    <td class="errorMessage"><s:fielderror><s:param>user.realName</s:param></s:fielderror> </td>
                </tr>
                <tr>
                    <td width="15%">关联用户</td>
                    <td width="35%"><s:select name="user.innerUserId" list="userList" listKey="userId" listValue="loginName" emptyOption="true"></s:select></td>
					<td></td>
                </tr>
                <tr class="odd">
                    <td width="15%">邮箱</td>
                    <td width="35%"><s:textfield name="user.userEmail" id="mail" required="true"></s:textfield></td>
                    <td class="errorMessage"><s:fielderror><s:param>user.userEmail</s:param></s:fielderror> </td>
                </tr>
<!--                <tr>-->
<!--                    <td width="15%">用户状态</td>-->
<!--                    <td width="35%"><s:select name="user.issueUserState" list="#{0:'正常用户' , 1:'禁止用户'}" listKey="key" listValue="value"></s:select></td>-->
<!--					<td></td>-->
<!--                </tr>-->
                <tr class="odd"><td width="15%"></tr>
            </table>
<%--			<div class="title">用户角色管理</div>								 --%>
<%--			<s:include value="/WEB-INF/jsp/include/role.jsp"></s:include>        --%>
<%--            <div class="title">用户权限管理</div>								 --%>
<%--			<s:include value="/WEB-INF/jsp/include/privilege.jsp"></s:include>   --%>
            
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 1, 2)}">
            		<s:submit cssClass="btnStyle1" type="button" value="保存" method="save"></s:submit>
            </s:if>
<%--            		<input class="btnStyle1" type="button" value="保存" onclick='submitForm("UserEdit_save.action");'/>         --%>
            </div>
        </div>
        </s:form>
        
      </body>
</html>
