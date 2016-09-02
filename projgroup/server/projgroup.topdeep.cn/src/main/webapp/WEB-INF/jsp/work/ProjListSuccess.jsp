<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>项目管理</title>
 </head>
<body>
 		<s:form method="post">
 		<s:hidden name="taskId"></s:hidden>
        <div class="mainContent">
            <div class="top">
                <a href="#">项目管理</a>  
            </div>
            
            <table  width="100%" border="1" cellspacing="0" cellpadding="0" class="tablestyle1">
                <thead>
					<tr>
						<th>标识</th>
						<th>项目名称</th>
						<th>状态</th>
						<th>项目经理</th>
						<th>任务管理</th>
						<th>甘特图</th>
						<th>计划开始时间</th>
						<th>实际开始时间</th>  
						<th>计划结束时间</th>
						<th>实际结束时间</th>  
					</tr>
				</thead>
                <s:iterator value="projectListView" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td>
                    	<s:checkbox name="selectedProjs" fieldValue="%{projId}"></s:checkbox>
                    </td>
                    <td>
	                   	<s:url id="url" action="ProjEdit">
	                   		<s:param name="projId" value="projId" ></s:param>
	                   	</s:url>
	                    <s:a href="%{url}">
	                    	<s:property value="projectShortName"></s:property>
	                    </s:a>&nbsp;
                    </td>
                    <td><s:if test="projectState==1"><img src="images/riskok-1.gif" alt="" /></s:if><s:else><img src="images/risknote-1.gif" alt="" /></s:else></td>
                    <td><s:property value="managename"></s:property></td>
                    <td>
	                   	<s:url id="taskurl" action="TaskList">
	                   		<s:param name="projId" value="projId" ></s:param>
	                   		
	                   	</s:url>
	                    <s:a href="%{taskurl}">管理任务</s:a>
                    </td>
                    <td>
                    	<s:a href="%{urlManage.getTaskListViewUrl(projId)}">查看</s:a>
<%--	                   	<s:url id="taskurl" action="TaskList_watchall">--%>
<%--	                   		<s:param name="projId" value="projId" ></s:param>--%>
<%--	                   		<s:param name="watch" value="1"></s:param>--%>
<%--	                   	</s:url>--%>
<%--	                    <s:a href="%{taskurl}">所有任务</s:a>--%>
                    </td>
                    <td><s:date name="projectPlanStartDate" format="yyyy年MM月dd日"/>&nbsp;</td>                   
                    <td><s:date name="projectActualStartDate" format="yyyy年MM月dd日"/>&nbsp;</td>                   
                    <td><s:date name="projectPlanEndDate" format="yyyy年MM月dd日"/>&nbsp;</td>                   
                    <td><s:date name="projectActualEndDate" format="yyyy年MM月dd日"/>&nbsp;</td>                   
                </tr> 
                </s:iterator>  
          </table>
            <table>
				<tr>
                	<td style="color:red"><s:fielderror><s:param>error</s:param></s:fielderror></td> 
                </tr>
             </table>
            <s:include value="/WEB-INF/jsp/include/pagefoot.jsp"></s:include>
            <div class="footerButton">
            <s:submit type="input" action="ProjEdit" cssClass="btn2" value="添加"></s:submit>
            <s:submit type="input" action="ProjList!disable" cssClass="btn2" value="禁用"></s:submit>
            <s:submit type="input" action="ProjList!enable" cssClass="btn2" value="启用"></s:submit>
           </div>
        </div>
        </s:form>
 </body>
</html>