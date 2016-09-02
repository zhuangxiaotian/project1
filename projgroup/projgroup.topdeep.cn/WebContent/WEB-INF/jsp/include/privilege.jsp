<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<table class="tablestyle3">
	<thead>
		<tr><th width="20%">权限名称</td><th>读取</th><th>修改</th><th>删除</th><th>执行</th><th>报表</th></tr>
	</thead>
	<s:iterator status="stat" value="privilegeList">
	<tbody>
		<tr>
			<td><s:property value="privilegeName" /></td>
			<td>
				<s:checkbox value="%{operateList[0].hasPrivilege}" disabled="%{!operateList[0].operateEnabled}" name="operateSelectValue" fieldValue="%{operateList[0].operateValue}"></s:checkbox>
			</td>
			<td>
				<s:checkbox value="%{operateList[1].hasPrivilege}"  disabled="%{!operateList[1].operateEnabled}" name="operateSelectValue" fieldValue="%{operateList[1].operateValue}"></s:checkbox>
			</td>
			<td>
				<s:checkbox value="%{operateList[2].hasPrivilege}"  disabled="%{!operateList[2].operateEnabled}" name="operateSelectValue" fieldValue="%{operateList[2].operateValue}"></s:checkbox>
			</td>
			<td>
				<s:checkbox value="%{operateList[3].hasPrivilege}"  disabled="%{!operateList[3].operateEnabled}" name="operateSelectValue" fieldValue="%{operateList[3].operateValue}"></s:checkbox>
			</td>
			<td>
				<s:checkbox value="%{operateList[4].hasPrivilege}"  disabled="%{!operateList[4].operateEnabled}" name="operateSelectValue" fieldValue="%{operateList[4].operateValue}"></s:checkbox>
			</td>
	  	</tr>
	  </tbody>
	</s:iterator>
</table>