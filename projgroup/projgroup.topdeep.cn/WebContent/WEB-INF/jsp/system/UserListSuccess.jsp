<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <link rel="stylesheet" type="text/css" href="skin/style1/css/face.css">
  <title>用户管理</title>
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="title">
                <a href="#">用户管理</a>  
            </div>
            
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle1">
                <tr>
                     <th width="2%" scope="col">
                        标识</th>
                    <th width="20%" scope="col">
                       登录名称</th>
                    <th width="10%" scope="col">
                        真实姓名</th>
                    <th width="5%" scope="col">
                        用户状态</th>
                    <th width="5%" scope="col">
                        上次登录时间</th>  
                </tr>
                <s:iterator value="userList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td>
                    	<s:checkbox name="selectedUsers" fieldValue="%{userId}"></s:checkbox>
                    </td>
                    <td>
	                   	<s:url id="url" action="system/UserEdit">
	                   		<s:param name="userId" value="userId" ></s:param>
	                   	</s:url>
	                    <s:a href="%{url}">
	                    	<s:property value="loginName"></s:property>
	                    </s:a>
                    </td>
                    <td><s:property value="realName"></s:property></td>
                    <td><s:if test="userState==1"><img src="images/riskok-1.gif" alt="" /></s:if><s:else><img src="<%=request.getContextPath() %>/images/risknote-1.gif" alt="" /></s:else></td>
                    <td style="color:blue;"><s:property value="lastLoginTime"></s:property></td>                   
                </tr> 
                </s:iterator>    
            </table>
            <table><tr><td style="color:red"><s:fielderror><s:param>error</s:param></s:fielderror></td></tr></table>
            <s:include value="/WEB-INF/jsp/include/pagefoot.jsp"></s:include>
			<div class="footerButton">
            <s:submit type="input" action="system/UserEdit" cssClass="btn2" value="添加"></s:submit>
            <s:submit type="input" action="system/UserList!disable" cssClass="btn2" value="禁用"></s:submit>
            <s:submit type="input" action="system/UserList!enable" cssClass="btn2" value="启用"></s:submit>
            
<!--            <input class="btnStyle1" type="button" value="添加" onclick='submitForm("UserEdit.action");'/>-->
<!--            <input class="btnStyle1" type="button" value="禁用" onclick='submitForm("UserList!disable.action");'/>-->
<!--      		<input class="btnStyle1" type="button" value="启用" onclick='submitForm("UserList!enable.action");'/>-->
           </div>
        </div>
        </s:form>
 </body>
</html>