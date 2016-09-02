<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


  <head>
    
    
    <title>工时结算</title>

	
	
  </head>
  
  <body>
 	<s:form name="inputworktime" action="TaskList" method="post"> 
	<div class="mainContent">

	  <table width="70%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
		   	  <tr>
			  	<td>给所有该任务的最子任务提交工作时间</td>
			  	
			  </tr>
			  <s:iterator value="sonTaskList" status="rowStatus" >
				<tr>
					<td>任务名称：</td>
					<td><s:property name="taskName"></s:property></td>
					
				</tr>
				<tr>
					<td>输入工作时间：</td>
					<td><s:textfield name="actualWorkTime"></s:textfield></td>
				</tr>
			  </s:iterator>
			  
		  	<tr>
		  	
		  		<s:submit cssClass="btnStyle1"  value="提交" action="TaskList_worktimepose"></s:submit>
		  	</tr>
		 
	  </table>
	</div>
</s:form>
  </body>
</html>
