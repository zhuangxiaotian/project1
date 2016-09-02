<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>项目管理</title>
  <link rel="stylesheet" type="text/css" href="skin/style1/css/face.css" />
  
  <script type="text/javascript">
  	$(function(){
  		
  	});
  </script>
  
  
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
						<th width="10">标识</th>
						<th width="52">项目名称</th>
						<th width="26">状态</th>
						<th width="26">操作</th>
					</tr>
				</thead>
                <s:iterator value="projectList" status="rowStatus" >
                <tr>
                    <td><s:property value="projId"/></td>
                    <td><s:property value="projectShortName"></s:property></td>
                    <td><s:if test="projectState==1"><img src="images/riskok-1.gif" alt="" /></s:if><s:else><img src="images/risknote-1.gif" alt="" /></s:else></td>
                    <td>
                    	<s:a href="%{urlManage.getOrMappingProjectEditUrl(projId)}">设置</s:a>
                    	<s:a href="%{urlManage.getBuildProjectOrMappingFileUrl(projId)}">下载</s:a>
                    	<s:a href="%{urlManage.getProjectBuildUrl(projId)}">构建</s:a>
                    </td>
                </tr> 
                </s:iterator>  
            </table>
            <table><tr>
                	<td style="color:red"><s:fielderror><s:param>error</s:param></s:fielderror></td> 
                </tr>  
             </table>
            <s:include value="/WEB-INF/jsp/include/pagefoot.jsp"></s:include>
         </div>
        </s:form>
        <iframe id="download" name="download" height="0px" width="0px"></iframe>
 </body>
</html>