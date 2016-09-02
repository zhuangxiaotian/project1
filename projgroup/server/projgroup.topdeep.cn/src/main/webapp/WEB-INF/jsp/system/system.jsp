<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>角色管理</title>
 </head>
<body>
 		<s:form method="post">
        <div class="mainContent">
            <div class="top">
                <a href="#">系统管理</a>  
            </div>
            <div class="controlBtn">
             <s:submit type="input" method="rebuildTaskOutline" cssClass="btnStyle1" value="重建任务大纲"></s:submit>
            </div>
        </div>
        </s:form>
 </body>
</html>