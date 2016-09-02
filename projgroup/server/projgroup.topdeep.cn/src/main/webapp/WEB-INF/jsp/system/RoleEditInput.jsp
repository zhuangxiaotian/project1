<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>角色编辑</title>
  <link rel="stylesheet" type="text/css" href="skin/style1/css/face.css" />
</head>
<body>
    	<s:form method="post" validate="true">
    	<s:hidden name="roleId"></s:hidden>
        <div class="mainContent">
            <div class="title">
                <s:url id="url" action="Function">
            		<s:param name="mainfunc" value="1"></s:param>
            	</s:url>
            	<s:a href="%{url}">角色编辑</s:a>
            </div>
            
            <div class="title">
                <a href="###">角色信息</a>
			</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle4">
            	 <tr >
                    <td width="15%" style="text-align:right;">
                        角色名称*
                    </td>
                    <td width="35%">
                    	<s:textfield label="角色名称" labelposition="left" name="role.roleName" required="true"></s:textfield>
                        </td>
                        <td class="errorMessage"><s:fielderror><s:param>role.roleName</s:param></s:fielderror> </td>
                </tr>
                <tr>
                    <td style="text-align:right;">
                        角色状态
                    </td>
                    <td width="35%">
						<s:select name="role.roleState" list="#{1:'激活' , 0:'禁止'}" listKey="key" listValue="value"></s:select>
                        </td>
                        <td></td>
                </tr>
                <tr>
                    <td style="vertical-align:top;text-align:right;">
                        角色备注
                    </td>
                    <td width="35%">
                    	<s:textarea name="role.roleDesc"></s:textarea>
                        </td>
                        <td></td>
                </tr>
            </table>
            <div class="title">
                <a href="###">角色权限管理</a>
			</div>
			<s:include value="/WEB-INF/jsp/include/privilege.jsp"></s:include>
            
            <div class="footerButton">
             <s:submit type="input" method="save" cssClass="btn2" value="保存"></s:submit>
             <s:submit type="input" action="RoleList" cssClass="btn2" value="返回角色管理"></s:submit>
<!--            		<input class="btnStyle1" type="button" value="保存" onclick='submitForm("RoleEdit_save.action");'/>-->
<!--            		<input class="btnStyle1" type="button" value="返回角色管理" onclick='submitForm("RoleList.action");'/>-->
            </div>
        </div>
        </s:form>
        
      </body>
</html>