<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


  <head>
    
    
    <title>输入工时</title>

	
	这个页面让你输入工时的，输入了工时，老板就能计算你的工资了哦。你不输入的话，就拿不到工资咯
  </head>
  
  <body>
 	<s:form name="inputworktime" method="post"> 
 	<s:hidden name="projId"></s:hidden>
	<div class="mainContent">
	
	  <table width="70%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
		  <tr>
			  <td>该任务的工时:</td><td><s:textfield  name="actualWorkTime"></s:textfield></td>
			  <td style="color:red"><s:fielderror><s:param>task.actualWorkTime</s:param></s:fielderror></td>
		  </tr>
		  <tr>
		  	<s:if test="returntag==1">
		  		已经将所有祖先任务的状态结束，并且将它们的工作时间也进行了更新。
		  	</s:if>
		  	
		  </tr>
		  <tr><td></td><td>

		 
	      <s:hidden name="taskId" value="taskId"></s:hidden>

		  <s:submit cssClass="btnStyle1"  value="提交" action="TaskList_worktimepose">
		  		
            	</s:submit>
		  </td>
		  <td>ta</td>
		  </tr>
	  </table>
	</div>
</s:form>
  </body>
</html:html>
