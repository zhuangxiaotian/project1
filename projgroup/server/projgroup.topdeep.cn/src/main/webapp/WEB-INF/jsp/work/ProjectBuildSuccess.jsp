<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>项目管理</title>
  <link rel="stylesheet" type="text/css" href="skin/style1/css/face.css" />
  
  <script type="text/javascript">
  	$(function(){
  		$(".antBuild").click(function(){
  			var projId = $(this).attr("projId");
  			var execFilePath = $(this).attr("execFilePath");
  			var callUrl = "<s:property value='urlManage.getProjectAjaxBuildUrl()' />";
  			$.getJSON(callUrl,{"projectId":projId,"execFilePath":execFilePath},function(data){
				alert(data.msg);
			});
			return false;
  		});
  		
  		$('.download').click(function(){
  			var projId = $(this).attr("projId");
  			var execFilePath = $(this).attr("execFilePath");
  			if(execFilePath.indexOf("http") == 0){
  				window.open(execFilePath);
				return false;
  			}else{
  	  			var callUrl = "<s:property value='urlManage.getProjectDownloadBuildFileUrl()' />";
  				var postData = "projectId="+projId+"&execFilePath="+execFilePath;
  				callUrl += "?"+postData;
  				var obj=document.getElementById('download'); 
  				obj.contentWindow.location.href=callUrl; 
  				return false;
  			}
		});

  		
  	});
  </script>
  
  
 </head>
<body>
        <div class="mainContent">
            <div class="top">
                <a href="#">项目构建管理</a>  
            </div>
            
            <table  width="100%" border="1" cellspacing="0" cellpadding="0" class="tablestyle1">
				<tr><th>构建</th></tr>
                <s:iterator value="buildList" status="rowStatus" var="item">
                <tr>
                    <td>
                    	<a href="#" class="antBuild" projId="<s:property value='projectId' />" execFilePath="<s:property value='Second'/>"><s:property value='First'/></a>
                    </td>
                </tr> 
                </s:iterator>  
				<tr><th>下载</th></tr>
                <s:iterator value="downloadList" status="rowStatus" var="item">
                <tr>
                    <td>
                    	<a href="#" class="download" projId="<s:property value='projectId' />" execFilePath="<s:property value='Second'/>"><s:property value='First'/></a>
                    </td>
                </tr> 
                </s:iterator>  
            </table>
         </div>
        <iframe id="download" name="download" height="0px" width="0px"></iframe>
 </body>
</html>