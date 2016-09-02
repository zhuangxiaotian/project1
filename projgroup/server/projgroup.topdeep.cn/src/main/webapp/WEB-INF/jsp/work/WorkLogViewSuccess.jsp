<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>工作日志列表</title>
  <script type="text/javascript" src="topdeep/js/common/Calendar.js"></script>
  
  
  <script type="text/javascript">
  $(function(){
	  $('.logSetButtonId').click(function(){
		  var ajaxUrl = '<s:property value="urlManage.getAjaxSetLogScoreServiceUrl()" />';
		  ajaxUrl += "?logId="+$(this).attr("logId")+"&logScore="+$(this).prev().val();
			$.getJSON(ajaxUrl,null,function(data){
		//		var page = $("a.page_current").text()-1;
			//	queryid_newsCatalogListPageData(page,10,'ORDER_FIELD','DESC');
			
				alert(data.msg);
			});
			$(this).hide();
			$(this).prev().hide();
	  });
	  
	  
  });
  </script>
  
  
  <style type="text/css">
  
  </style>
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="top">
                <a href="#">工作日志管理</a>  
            </div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle2">
                <tr>
                    <th width="10%" nowrap="nowrap">工作日<s:textfield name="condition.createTime" onclick="setDay(this);" /></th>
                    <th width="10%" nowrap="nowrap">作者<s:select name="condition.workUserId" list="userList" listKey="userId" listValue="realName" emptyOption="true" /></th>
                    <th width="10%" nowrap="nowrap"><s:submit type="input" cssClass="btnStyle1" method="search" value="查询"/></th>
                    <th width="5%"></th>
                </tr>
            </table>
            <hr />
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle2">
                <tr>
<%--<th width="30">标识</th>--%>
                    <th style="width: 40px;text-align:left;">评价</th>
                    <th style="width: 60px;text-align:left;">作者</th>
                    <th style="width: 100px;text-align:left;">工作日</th>
                    <th style="width: 100px;text-align:left;">创建时间</th>
                    <th style="text-align:left;">修改时间</th>
                </tr>
                <s:iterator value="logList" status="rowStatus" >
                <tr class='<s:if test="#rowStatus.odd"></s:if><s:else>odd</s:else>'>
                    <td style="font-weight: 600;color:red;"><s:property value="workEvaluationScore"/> </td>                  
<%--                    <td>--%>
<%--                    	<s:checkbox name="selectedWorkLogs" fieldValue="%{workLogId}"></s:checkbox>--%>
<%--                    </td>--%>
                    <td>
                    	<s:property value="workerName"></s:property>
                    </td>
                    <td>
	                   	<s:url id="url" action="WorkLogEdit" namespace="work">
	                   		<s:param name="logId" value="workLogId" ></s:param>
	                   	</s:url>
	                    <s:a href="%{url}">
	                    	<s:date name="workDay" format="yyyy年MM月dd日"/>
	                    </s:a>
                    </td>
                    <td><s:date name="createTime" format="yyyy年MM月dd日"/></td>                   
                    <td><s:date name="modifyTime" format="yyyy年MM月dd日"/></td>  
                </tr>
                <tr>
                <td colspan="5">
                	<div style="border-width: 1px; border-style: solid; border-color: blue;"><s:property escape="false" value="workContent" /></div>
                </td>
                </tr>
                <s:if test="workEvaluationScore == null">
                <s:if test="%{getLoginUser().hasPrivilege(13, 8)}">
                <tr>
                <td colspan="5">
					工作日志评分:&nbsp;
					<select>
						<option value="1">1分</option>
						<option value="2">2分</option>
						<option value="3">3分</option>
						<option value="4">4分</option>
						<option value="5">5分</option>
					</select>
					<input type="button" logId='<s:property value="workLogId" />' value="设置" class="logSetButtonId"/>
                </td>
                </tr> 
				</s:if>
                </s:if>
                <s:if test="workEvaluationContent != '' && workEvaluationContent != null">
                <tr>
                <td colspan="5">
                	<div style="border-width: 1px; border-style: solid; border-color: blue;">日志反馈：<br/><s:property escape="false" value="workEvaluationContent" /></div>
                </td>
                </tr> 
                </s:if>
                </s:iterator>    
             </table>
            <s:include value="/WEB-INF/jsp/include/pagefoot.jsp">
            <s:param name="tableclass" value="T_WORK_LOG"></s:param>
            </s:include>
            <!-- 为了能获得当前请求页对应的表的行数等信息，这里应该要有传入参数 -->
            
            
            
            <div class="controlBtn">
           </div>
        </div>
        </s:form>
 </body>
</html>