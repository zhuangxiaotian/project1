<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title><s:if test="issueProjectId > 0">项目编辑</s:if><s:else>增加项目</s:else></title>
</head>
<body>
    	<s:form method="post" validate="true">
    	<s:hidden name="issueProjectId"></s:hidden>
        <div class="mainContent">
            <div class="top">
                <s:url id="url" action="Function">
            		<s:param name="mainfunc" value="1"></s:param>
            	</s:url>
            </div>
            
            <div class="title">项目信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td width="15%"> 项目名称</td>
                    <td width="35%">
                    	<s:textfield  name="project.issueProjectName" required="true"></s:textfield>
                        </td>
                        <td class="errorMessage"><s:fielderror><s:param>project.issueProjectName</s:param></s:fielderror> </td>
                 </tr>
                <tr>
                    <td width="15%">默认处理用户</td>  
                      <td width="35%">
<!--                    显示出来拿到的userlist-->
                      <s:select name="project.defaultUserId" list="userList" listKey="issueUserId" listValue="loginName"></s:select>
                      </td>
                        <td class="errorMessage"><s:fielderror><s:param>project.defaultUserId</s:param></s:fielderror> </td>
                        <td></td>
                </tr>
               <tr class="odd">
                    <td width="15%">项目状态</td>
                    <td width="35%">
						<s:select name="project.projectActive" list='#{"true":"激活" , "false":"禁止"}' listKey="key" listValue="value"></s:select>
                    </td>
                    <td></td>
                </tr>
            </table>
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 3 ,2)}">
            <s:submit cssClass="btnStyle1" type="input" value="保存" method="save"></s:submit>
            </s:if>
            </div>
        </div>
        </s:form>
      </body>
</html>