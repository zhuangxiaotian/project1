<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>工作分数列表</title>
 </head>
<body>
        <div class="mainContent">
            <div class="top">
                <a href="#">工作分数排行榜</a>  
            </div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle1">
                <tr>
                    <th width="10%">姓名</th>
                    <th width="100">工作天数</th>
                    <th width="100">平均分</th>
                </tr>
                <s:iterator value="scoreList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td>
                    	<s:property value="realName" />
                    </td>
                    <td>
	                   	<s:property value="workDayCount" />
                    </td>
                    <td><s:property value="workDayScore"/> </td>                 
                </tr> 
                </s:iterator>    
             </table>
        </div>
        
 </body>
</html>