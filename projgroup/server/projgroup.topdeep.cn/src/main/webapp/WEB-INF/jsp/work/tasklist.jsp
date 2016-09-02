<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>我的任务管理</title>
  	<link href="topdeep/js/jquery/plugins/jqtreetable/jqtreetable.css" rel="stylesheet" type="text/css" />
  	<script type="text/javascript"  src="topdeep/js/common/common.js"></script>
  	<script type="text/javascript"  src="topdeep/js/common/common.util.js"></script>
  	<script type="text/javascript"  src="topdeep/js/jquery/jquery-1.3.2/jquery-1.3.2.min.js"></script>
  	<script type="text/javascript"  src="topdeep/js/jquery/plugins/jqtreetable/jqtreetable.js"></script>
  	<script type="text/javascript">
  		var taskTable = new cn.topdeep.util.HashTable();
  		<s:iterator value="taskList" status="st">
  			taskTable.put(<s:property value="taskId"/>,<s:property value="#st.index+1" />);
  		</s:iterator>
  	
  	
        $(function() {
            var map1 = [<s:iterator value="taskList" status="st"><s:if test="taskParentId == null">0</s:if><s:else>taskTable.get(<s:property value="taskParentId"/>)</s:else><s:if test="!#st.last">,</s:if></s:iterator>];
            //var map1 = [0, 1, 2, 3, 0];
            var options1 = { openImg: "images/tv-collapsable.gif", shutImg: "images/tv-expandable.gif", leafImg: "images/tv-item.gif", lastOpenImg: "images/tv-collapsable-last.gif", lastShutImg: "images/tv-expandable-last.gif", lastLeafImg: "images/tv-item-last.gif", vertLineImg: "images/vertline.gif", blankImg: "images/blank.gif", collapse: false, column: 1, striped: true, highlight: true, state: false };
           $("#treet1").jqTreeTable(map1, options1);
        });
    </script>
    
    
    
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="top">
                <a href="#">任务管理</a>  
            </div>
            <s:hidden name="projId"></s:hidden>
            <s:hidden name="userId"></s:hidden>
            <table class="tablemain"><thead>
            	<tr>
            		<th>标识</th>
            		<th>任务名称</th>
<%--            		<th>操作</th>--%>
            		<th>状态</th>
            		<th>资源</th>
                    <th>计划开始时间</th>
                    <th>实际开始时间</th>  
                    <th>计划结束时间</th>
                    <th>实际结束时间</th>  
                    <th>目前耗时</th>    
            	</tr>
            </thead>
<tbody id="treet1">
                <s:iterator value="taskList" status="rowStatus" >
                <tr>
                    <td>
                    	<s:checkbox name="selectedTasks" fieldValue="%{taskId}"></s:checkbox>
<%--							<s:property value="taskId"/>--%>
                    </td>
                    <td>
	                   	<s:url id="url" action="TaskEdit">
	                   		<s:param name="taskId" value="taskId" ></s:param>
	                   	</s:url>
	                    <s:a href="%{url}">
	                    	<s:property value="taskName"></s:property>
	                    </s:a>
                    </td>
<%--                    <td>--%>
<%--                    --%>
<%--	                   	<s:if test="taskState==1 || taskState == 2">开始</s:if>--%>
<%--	                   	<s:else >--%>
<%--	                   		<s:url id="url" action="TaskList" method="start">--%>
<%--	                   		<s:param name="taskId" value="taskId" ></s:param>--%>
<%--	                   		</s:url>--%>
<%--	                    	<s:a href="%{url}">开始</s:a>--%>
<%--	                    </s:else>--%>
<%--	                    --%>
<%--	                    --%>
<%--	                    <s:if test="taskState==2">结束</s:if>--%>
<%--	                   	<s:else>--%>
<%--	                   		<s:url id="url" action="TaskList" method="gameover">--%>
<%--	                   		<s:param name="taskId" value="taskId" ></s:param>--%>
<%--	                   		</s:url>--%>
<%--	                    	<s:a href="%{url}">结束</s:a>--%>
<%--	                    </s:else>--%>
<%--	                    --%>
<%--	                    <s:if test="taskState==0 || taskState == 2">暂停</s:if>--%>
<%--	                   	<s:else>--%>
<%--	                   		<s:url id="url" action="TaskList" method="parse">--%>
<%--	                   		<s:param name="taskId" value="taskId" ></s:param>--%>
<%--	                   		</s:url>--%>
<%--	                    	<s:a href="%{url}">--%>
<%--	                    		暂停--%>
<%--	                    	</s:a>--%>
<%--	                    </s:else>--%>
<%--                    </td>--%>
                    <td><s:if test="taskState==1"><img src="images/riskok-1.gif" alt="" /></s:if>
                    <s:elseif test="taskState==0"><img src="images/risknote-1.gif" alt="" /></s:elseif>
                    <s:else>任务结束</s:else>
                    </td>
                    <td>&nbsp;</td>
                    <td><s:date name="taskPlanStartDate" format="yyyy年MM月dd日"/></td>                   
                    <td><s:date name="taskActualStartDate" format="yyyy年MM月dd日"/></td>                   
                    <td><s:date name="taskPlanEndDate" format="yyyy年MM月dd日"/></td>                   
                    <td><s:date name="taskActualEndDate" format="yyyy年MM月dd日"/></td>   
                    <td><s:property value="actualWorkTime"></s:property> 小时</td>      
                </tr> 
                </s:iterator>    
</tbody></table>
            
            
            
<%--            <table class="tablemain">--%>
<%--            <thead><tr>--%>
<%--                     <th width="30">标识</th>--%>
<%--                    <th width="50">任务名称</th>--%>
<%--                    <th>操作</th>--%>
<%--                    <th width="30"> 状态</th>--%>
<%--                    <th >任务人</th>--%>
<%--                    <th > 计划开始时间</th>--%>
<%--                    <th >实际开始时间</th>  --%>
<%--                    <th>计划结束时间</th>--%>
<%--                    <th >实际结束时间</th>  --%>
<%--                    <th >目前耗时</th>    --%>
<%--                </tr></thead>--%>
<%--            <tbody id="treet1">--%>
<%--                <s:iterator value="taskList" status="rowStatus" >--%>
<%--                <tr>--%>
<%--                    <td>--%>
<%--                    	<s:checkbox name="selectedTasks" fieldValue="%{taskId}"></s:checkbox>--%>
<%--                    </td>--%>
<%--                    <td>--%>
<%--	                   	<s:url id="url" action="TaskEdit">--%>
<%--	                   		<s:param name="taskId" value="taskId" ></s:param>--%>
<%--	                   	</s:url>--%>
<%--	                    <s:a href="%{url}">--%>
<%--	                    	<s:property value="taskName"></s:property>--%>
<%--	                    </s:a>--%>
<%--                    </td>--%>
<%--                    <td>--%>
<%--                    --%>
<%--	                   	<s:if test="taskState==1 || taskState == 2">开始</s:if>--%>
<%--	                   	<s:else >--%>
<%--	                   		<s:url id="url" action="TaskList" method="start">--%>
<%--	                   		<s:param name="taskId" value="taskId" ></s:param>--%>
<%--	                   		</s:url>--%>
<%--	                    	<s:a href="%{url}">开始</s:a>--%>
<%--	                    </s:else>--%>
<%--	                    --%>
<%--	                    --%>
<%--	                    <s:if test="taskState==2">结束</s:if>--%>
<%--	                   	<s:else>--%>
<%--	                   		<s:url id="url" action="TaskList" method="gameover">--%>
<%--	                   		<s:param name="taskId" value="taskId" ></s:param>--%>
<%--	                   		</s:url>--%>
<%--	                    	<s:a href="%{url}">结束</s:a>--%>
<%--	                    </s:else>--%>
<%--	                    --%>
<%--	                    <s:if test="taskState==0 || taskState == 2">暂停</s:if>--%>
<%--	                   	<s:else>--%>
<%--	                   		<s:url id="url" action="TaskList" method="parse">--%>
<%--	                   		<s:param name="taskId" value="taskId" ></s:param>--%>
<%--	                   		</s:url>--%>
<%--	                    	<s:a href="%{url}">--%>
<%--	                    		暂停--%>
<%--	                    	</s:a>--%>
<%--	                    </s:else>--%>
<%--                    </td>--%>
<%--                    <td><s:if test="taskState==1"><img src="images/riskok-1.gif" alt="" /></s:if>--%>
<%--                    <s:elseif test="taskState==0"><img src="images/risknote-1.gif" alt="" /></s:elseif>--%>
<%--                    <s:else>任务结束</s:else>--%>
<%--                    </td>--%>
<%--                    <td><s:property value="taskOwner.realName"></s:property>    </td>--%>
<%--                    <td><s:date name="taskPlanStartDate" format="yyyy年MM月dd日"/></td>                   --%>
<%--                    <td><s:date name="taskActualStartDate" format="yyyy年MM月dd日"/></td>                   --%>
<%--                    <td><s:date name="taskPlanEndDate" format="yyyy年MM月dd日"/></td>                   --%>
<%--                    <td><s:date name="taskActualEndDate" format="yyyy年MM月dd日"/></td>   --%>
<%--                    <td><s:property value="actualWorkTime"></s:property> 小时</td>      --%>
<%--                </tr> --%>
<%--                </s:iterator>    --%>
<%--            </tbody>--%>
                <tr><td colspan="2" style="color:red" class="errorMessage"><s:fielderror><s:param>error</s:param></s:fielderror> </td></tr>
<%--                --%>
<%--            </table>--%>
<%--            <s:include value="/WEB-INF/jsp/include/pagefoot.jsp">--%>
<%--            </s:include>--%>
            <div class="controlBtn">
            <s:url id="addtaskurl" action="TaskEdit">
	                   		<s:param name="projId" value="projId" ></s:param>
	                   		<s:param name="taskId" value="0"></s:param>
	                   	</s:url>
	                    <s:a cssClass="btnStyle1" href="%{addtaskurl}">添加任务</s:a>
<!--	                    <s:submit cssClass="btnStyle1" type="input" action="TaskList!gameover" value="结束"></s:submit>-->
<!--	                    <s:submit cssClass="btnStyle1" type="input" action="TaskList!start" value="开始"></s:submit>-->
<!--	                    <s:submit cssClass="btnStyle1" type="input" action="TaskList!parse" value="暂停"></s:submit>-->
<!--	                    -->
<!--            <input class="btnStyle1" type="button" value="结束" onclick='submitForm("TaskList!gameover.action");'/>-->
<!--      		<input class="btnStyle1" type="button" value="开始" onclick='submitForm("TaskList!enable.action");'/>-->
<!--      		<input class="btnStyle1" type="button" value="暂停" onclick='submitForm("TaskList!disable.action");'/>-->
           </div>
        </div>
        </s:form>
 </body>
</html>