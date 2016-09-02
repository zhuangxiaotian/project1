<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>角色管理</title>
  <link rel="stylesheet" type="text/css" href="skin/style1/css/face.css" />
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="title">
                <a href="#">角色管理</a>  
            </div>
            
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle1">
				<thead>
					<tr>
						<th width="6%" scope="col">标识</th>
						<th width="20%" scope="col">角色名称</th>
						<th width="20%" scope="col">角色权限</th>
						<th width="10%" scope="col">角色状态</th>
						<th width="20%" scope="col">角色备注</th>  
					</tr>
				</thead>
                <s:iterator value="roleList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td>
                    	<s:checkbox name="selectedRoles" fieldValue="%{roleId}"></s:checkbox>
                    </td>
                    <td style="text-align:left;">
	                   	<s:url id="url" action="RoleEdit">
	                   		<s:param name="roleId" value="roleId" ></s:param>
	                   	</s:url>
	                    <s:a href="%{url}">
	                    	<s:property value="roleName"></s:property>
	                    </s:a>
                    </td>
                    <td><s:property value="rolePrivileges"></s:property>    </td>
                    <td><s:if test="roleState==1"><img src="images/riskok-1.gif" alt="" /></s:if><s:else><img src="<%=request.getContextPath() %>/images/risknote-1.gif" alt="" /></s:else></td>
                    <td style="text-align:left;"><s:property value="roleDesc"></s:property>        </td>
                </tr> 
                </s:iterator> 
                <tr>  
				<td style="color:red" colspan="5"><s:fielderror><s:param>selectedRoles</s:param></s:fielderror></td> 
                </tr> 
				<tfoot>
					<tr>
						<td colspan="5">
							<div class="footerButton">
							<s:submit type="input" action="system/RoleEdit" cssClass="btn2" value="添加"></s:submit>
							<s:submit type="input" action="system/RoleList!disable" cssClass="btn2" value="禁用"></s:submit>
							<s:submit type="input" action="system/RoleList!enable" cssClass="btn2" value="启用"></s:submit>
							<s:submit type="input" action="system/RoleList!delete" cssClass="btn2" value="删除"></s:submit>
							
							
							<!--            <input class="btnStyle1" type="button" value="添加" onclick='submitForm("RoleEdit.action");'/>-->
							<!--            <input class="btnStyle1" type="button" value="禁用" onclick='submitForm("RoleList!disable.action");'/>-->
							<!--      		<input class="btnStyle1" type="button" value="启用" onclick='submitForm("RoleList!enable.action");'/>-->
							<!--      		<input class="btnStyle1" type="button" value="删除" onclick='submitForm("RoleList!delete.action");'/>-->
							</div>
						</td>
					</tr>
				</tfoot>
			</table>
			
            
        </div>
        </s:form>
 </body>
</html>