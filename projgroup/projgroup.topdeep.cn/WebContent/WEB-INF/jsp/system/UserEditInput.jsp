<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>用户编辑</title>
  <link rel="stylesheet" type="text/css" href="skin/style1/css/face.css" />
</head>
<body>
    	<s:form method="post" validate="true">
    	<s:hidden name="userId"></s:hidden>
        <div class="mainContent">
            <div class="title">
            	<a href="###">用户信息</a>
			</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle4">
            	 <tr >
                    <td width="8%">
                        登录名称*
                    </td>
                    <td width="35%">
                    	<s:textfield name="user.loginName" required="true"></s:textfield>
                        </td>
                        <td class="errorMessage"><s:fielderror><s:param>user.loginName</s:param></s:fielderror> </td>
                </tr>
                <tr class="odd">
                    <td>
                        登录密码
                    </td>
                    <td width="35%">
                    	<s:password name="userPassword"></s:password>
                        </td>
                        <td class="errorMessage"><s:fielderror><s:param>userPassword</s:param></s:fielderror> </td>
                </tr>
                <tr>
                    <td>
                        角色状态
                    </td>
                    <td width="35%">
						<s:select name="user.userState" list="#{1:'激活' , 0:'禁止'}" listKey="key" listValue="value"></s:select>
                        </td>
                        <td></td>
                </tr>
                <tr>
                    <td>
                        真实名称
                    </td>
                    <td width="35%">
                    	<s:textfield name="user.realName" required="true"></s:textfield>
                        </td>
                       <td class="errorMessage"><s:fielderror><s:param>user.realName</s:param></s:fielderror> </td>
                </tr>
                <tr>
                    <td>
                        用户Email
                    </td>
                    <td>
                    	<s:textfield name="user.userEmail" required="true"></s:textfield>
                        </td>
                       <td class="errorMessage"><s:fielderror><s:param>user.userEmail</s:param></s:fielderror> </td>
                </tr>
                 <tr>
                    <td>
                        电话号码
                    </td>
                    <td width="35%">
                    	<s:textfield name="user.userTelephone" required="true"></s:textfield>
                        </td>
                       <td class="errorMessage"><s:fielderror><s:param>user.userTelephone</s:param></s:fielderror> </td>
                </tr>
                 <tr>
                    <td>
                        移动电话
                    </td>
                    <td width="35%">
                    	<s:textfield name="user.userMobile" required="true"></s:textfield>
                        </td>
                       <td class="errorMessage"><s:fielderror><s:param>user.userMobile</s:param></s:fielderror> </td>
                </tr>
                 <tr>
                    <td>
                        MSN
                    </td>
                    <td width="35%">
                    	<s:textfield name="user.userMsn" required="true"></s:textfield>
                        </td>
                       <td class="errorMessage"><s:fielderror><s:param>user.userMsn</s:param></s:fielderror> </td>
                </tr>
                <tr>
                    <td>
                        QQ
                    </td>
                    <td width="35%">
                    	<s:textfield name="user.userQq" required="true"></s:textfield>
                        </td>
                       <td class="errorMessage"><s:fielderror><s:param>user.userQq</s:param></s:fielderror> </td>
                </tr>
                 <tr>
                    <td style="vertical-align:top;">
                        用户备注
                    </td>
                    <td width="35%">
                    	<s:textarea name="user.userMemo"></s:textarea>
                        </td>
                       <td class="errorMessage"><s:fielderror><s:param>user.userMemo</s:param></s:fielderror> </td>
                </tr>
                
                
            </table>
 			<div class="title">
				<a href="###">用户角色管理</a>
			</div>
			<s:include value="/WEB-INF/jsp/include/role.jsp"></s:include>
            <div class="title">
				<a href="###">用户权限管理</a>
			</div>
			<s:include value="/WEB-INF/jsp/include/privilege.jsp"></s:include>
            
            <div class="footerButton">
            <s:submit type="input" method="save" cssClass="btn2" value="保存修改"></s:submit>
            <s:submit type="input" action="UserList" cssClass="btn2" value="返回用户列表"></s:submit>
<!--            		<input class="btnStyle1" type="button" value="保存" onclick='submitForm("UserEdit_save.action");'/>-->
<!--            		<input class="btnStyle1" type="button" value="返回用户管理" onclick='submitForm("UserList.action");'/>-->
            </div>
        </div>
        </s:form>
        
      </body>
</html>
