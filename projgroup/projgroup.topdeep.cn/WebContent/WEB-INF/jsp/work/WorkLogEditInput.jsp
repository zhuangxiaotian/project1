<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
if(path.equals("/")){
	path = "";
}
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


<head>
  <title>添加工作日志</title>
  <s:head/>
   <script type="text/javascript" src="topdeep/fckeditor/fckeditor_2.6.4/fckeditor.js"></script>

 </head>
<body>

    	<s:form method="post">
    	
    	<s:hidden name="logId"></s:hidden>
        <div class="mainContent">
            <div class="top">
                <s:url id="url" action="Function">
            		<s:param name="mainfunc" value="1"></s:param>
            	</s:url>
            	<s:a href="%{url}">工作日志编辑</s:a>
            </div>
           
            <div class="title">工作日志内容<br/>本月工作日志平均分数<s:property value="currentScore" /></div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle2">
            	 <tr >
                    <td width="6%">工作日</td>
                    <td width="15%"><s:textfield name="workLog.workDay" readonly="true" onclick="setDay(this);"></s:textfield></td>
                    <td><s:fielderror><s:param>workLog.workDay</s:param></s:fielderror> </td>
                 </tr>
                 <tr>
                 	<td width="15%" colspan="3">所属相关任务</td>
                 </tr>
                 <tr>
                 	<td colspan="3">
                 		
							<s:iterator value="logRelationTaskList" status="st">
                        		<s:checkbox name="relationtask" fieldValue="%{taskId}" value="%{selected}"></s:checkbox><s:property value="taskName"/>
                       	    </s:iterator>
						
                 	</td>
                 </tr>
            </table>
            <div class="title">工作内容编辑</div>
     	 <table style="padding: 0px; margin: 0px; border: 1px solid #00FFFF; border-spacing: 0px;">
             <script type="text/javascript">

// Automatically calculates the editor base path based on the _samples directory.
// This is usefull only for these samples. A real application should use something like this:
// oFCKeditor.BasePath = '/fckeditor/' ;	// '/fckeditor/' is the default value.
var sBasePath = '<%=basePath%>topdeep/fckeditor/fckeditor_2.6.4/'

var oFCKeditor = new FCKeditor( 'workLog.workContent' ) ;
oFCKeditor.Config["CustomConfigurationsPath"] = "<%=basePath%>" + "/js/fckeditconfig.js";
oFCKeditor.BasePath	= sBasePath ;
oFCKeditor.Height	= 300 ;
oFCKeditor.Width    =720;


oFCKeditor.ToolbarSet='OaToolBar';


oFCKeditor.Value	= '<s:property escape="false" value="%{workLog.workContent}" />' ;
oFCKeditor.Create() ;
//-->
		</script>
         </table>
         <table><tr><td class="errorMessage"><s:fielderror><s:param>error</s:param></s:fielderror> </td></tr></table>
            <div class="controlBtn">
            	<s:submit cssClass="btn2" type="input" value="保存"  method="save"></s:submit>
           		<!--  <input class="btnStyle1" type="button" value="保存" onclick='submitForm("WorkLogEdit_save.action");'/>-->
           		<s:submit cssClass="btn2" type="input" value="返回项目管理" action="ProjList"></s:submit>
<!--            		<input class="btnStyle1" type="button" value="返回项目管理" onclick='submitForm("ProjList.action");'/>-->
            </div>
        </div>
        </s:form>
        
      </body>
</html>