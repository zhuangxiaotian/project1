<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<table class="tablestyle1">
	<thead>
		<tr>
			<td width="10%">角色名称</td>
			<td>选中</td>
		</tr>
	</thead>
	<s:iterator status="stat" value="roleList">
		<tr>
			<td><s:checkbox value="roleSelected" name="roleSelectValue" fieldValue="%{role.roleId}"></s:checkbox></td>
			<td><s:property value="role.roleName" /></td>
		</tr>
	</s:iterator>
</table>