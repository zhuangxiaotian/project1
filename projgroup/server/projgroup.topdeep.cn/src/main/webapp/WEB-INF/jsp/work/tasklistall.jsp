<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>任务查看</title>
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="top">
                <a href="#">任务管理</a>  
            </div>
            <s:hidden name="projId"></s:hidden>
            <s:hidden name="watch" value="1"></s:hidden>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
                <tr>
                     <th width="30">标识</th>
                    <th width="50"> 任务名称</th>
                    <th>操作</th>
                    <th width="30">状态</th>
                    <th >任务人</th>
                    <th >计划开始时间</th>
                    <th >实际开始时间</th>  
                    <th> 计划结束时间</th>
                    <th >实际结束时间</th>  
                </tr>
                <s:iterator value="taskList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td>
                    	<s:checkbox name="selectedTasks" fieldValue="%{taskId}"></s:checkbox>
                    </td>
                    <td>
	                    
	                    	<s:property value="taskName"></s:property>
	                   
                    </td>
                    <td>
                    
	                   	<s:if test="taskState==1">进行中</s:if>
	                   	
	                    <s:if test="taskState==2">结束</s:if>
	                   	
	                    <s:if test="taskState==0">暂停</s:if>
	                   	
                    </td>
                    <td><s:if test="taskState==1"><img src="<%=request.getContextPath() %>/images/riskok-1.gif" alt="" /></s:if>
                    <s:elseif test="taskState==0"><img src="<%=request.getContextPath() %>/images/risknote-1.gif" alt="" /></s:elseif>
                    <s:else>任务结束</s:else>
                    </td>
                    <td><s:property value="taskOwner.realName"></s:property>    </td>
                    <td><s:date name="taskPlanStartDate" format="yyyy年MM月dd日"/></td>                   
                    <td><s:date name="taskActualStartDate" format="yyyy年MM月dd日"/></td>                   
                    <td><s:date name="taskPlanEndDate" format="yyyy年MM月dd日"/></td>                   
                    <td><s:date name="taskActualEndDate" format="yyyy年MM月dd日"/></td>         
                </tr> 
                </s:iterator>    
                <tr><td colspan="2" style="color:red" class="errorMessage"><s:fielderror><s:param>error</s:param></s:fielderror> </td></tr>
                
            </table>
            <s:include value="/WEB-INF/jsp/include/pagefoot.jsp">
            </s:include>
            <div class="controlBtn">
            <s:url id="addtaskurl" action="TaskEdit">
	                   		<s:param name="projId" value="projId" ></s:param>
	                   		<s:param name="taskId" value="0"></s:param>
	                   	</s:url>
	                    <s:a cssClass="btnStyle1" href="%{addtaskurl}">添加任务</s:a>
	                    <s:submit type="input" cssClass="btnStyle1"  value="结束 " action="TaskList!gameover"></s:submit>
	                    <s:submit type="input" cssClass="btnStyle1"  value="开始" action="TaskList!allstart"></s:submit>
	                    <s:submit type="input" cssClass="btnStyle1"  value="暂停" action="TaskList!disable"></s:submit>

<!--            <input class="btnStyle1" type="button" value="结束" onclick='submitForm("TaskList!gameover.action");'/>-->
<!--      		<input class="btnStyle1" type="button" value="开始" onclick='submitForm("TaskList!enable.action");'/>-->
<!--      		<input class="btnStyle1" type="button" value="暂停" onclick='submitForm("TaskList!disable.action");'/>-->
           </div>
        </div>
        </s:form>
 </body>
</html>