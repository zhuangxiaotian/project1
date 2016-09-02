<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<table>
<tr><td>权限名称</td><td>读取</td><td>修改</td><td>删除</td><td>执行</td><td>报表</td></tr>
<s:iterator status="stat" value="privilegeList">
<tr>
    <td><s:property value="privilegeName" /></td>
<!--    value 为checkbox的???  disabled为-->
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
</s:iterator>
</table>
