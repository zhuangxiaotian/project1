<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>工作日志列表</title>
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="top">
                <a href="#">工作日志管理</a>  
            </div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle1">
                <tr>
                    <th width="5%">标识</th>
                    <th width="100">工作日</th>
                    <th width="100">创建时间</th>
                    <th width="100">修改时间</th>
                    <th width="20%">评价</th>
                </tr>
                <s:iterator value="logList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td>
                    	<s:checkbox name="selectedWorkLogs" fieldValue="%{workLogId}"></s:checkbox>
                    </td>
                    <td>
	                   	<s:url id="url" action="work/WorkLogEdit">
	                   		<s:param name="logId" value="workLogId" ></s:param>
	                   	</s:url>
	                    <s:a href="%{url}">
	                    	<s:date name="workDay" format="yyyy年MM月dd日"/>
	                    </s:a>
                    </td>
                    <td><s:date name="createTime" format="yyyy年MM月dd日"/></td>                   
                    <td><s:date name="modifyTime" format="yyyy年MM月dd日"/></td>  
                    <td><s:property value="workEvaluationScore"/> </td>                 
                </tr> 
                </s:iterator>    
             </table>
            <s:include value="/WEB-INF/jsp/include/pagefoot.jsp">
            
            </s:include>
            <!-- 为了能获得当前请求页对应的表的行数等信息，这里应该要有传入参数 -->
            
            
            <div class="controlBtn">
            <s:submit cssClass="btn2" type="input" action="WorkLogEdit" value="添加"></s:submit>
<!--            <input class="btnStyle1" type="button" value="添加" onclick='submitForm("WorkLogEdit.action");'/>-->
           </div>
        </div>
        </s:form>
        
 </body>
</html>