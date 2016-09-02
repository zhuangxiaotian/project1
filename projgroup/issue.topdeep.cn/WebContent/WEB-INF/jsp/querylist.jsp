<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>查询语句列表</title>
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <table width="100%" border="1" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                    <th width="5%" scope="col">Id</th>
                    <th width="10%" scope="col">查询名称</th>
                    <th width="5%" scope="col">公开??</th>
                    <th width="50%" scope="col">查询语句</th>
                    <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 1)}">
                    <th width="10%" scope="col">查看对应问题列表</th>
                    </s:if>
                                      
                </tr>
                <s:iterator value="issueQueryList" status="rowStatus" ><div></div>
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
	                <td align="center"><s:property value="issueQueryId"></s:property>&nbsp;</td>      
	                <td align="center">
	                <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 12, 2)}">
                    	<s:a href="%{issueUrlManage.getQueryEditUrl(issueQueryId)}"><s:property value="issueQueryName"></s:property></s:a>
                    </s:if>
                    <s:else><s:property value="issueQueryName"></s:property></s:else>
                    </td>
                    <td align="center"><s:if test="isPublic">public</s:if><s:else>private</s:else>&nbsp;</td>
	                <td align="center"><s:property value="issueQuerySql"></s:property>&nbsp;</td>
	                <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 9, 1)}">
	                <td align="center"><s:a href="%{issueUrlManage.getIssueListUrl(issueQueryId)}">查看对应问题列表</s:a></td>
	                </s:if>
                </tr>
                </s:iterator>    
            </table>
            <s:include value="./include/pagefoot.jsp"></s:include>
            <div class="controlBtn">
            <s:if test="%{issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 12, 2)}">
            	<s:a href="%{issueUrlManage.getQueryEditUrl()}">添加</s:a>
            </s:if>
           </div>
        </div>
        </s:form>
 </body>
</html>