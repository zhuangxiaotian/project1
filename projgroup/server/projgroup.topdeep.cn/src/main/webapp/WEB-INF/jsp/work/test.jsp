<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <title>Test</title>
</head>
<body>
    	<s:form  method="post">
    	<div class="mainContent">
            <div class="top">
                <s:url id="url" action="Function">
            		<s:param name="mainfunc" value="1"></s:param>
            	</s:url>
            	<s:a href="%{url}">工作日志编辑</s:a>
            </div>
            <div class="title">
                工作日志内容</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td width="15%">
                        工作日
                    </td>
                    <td width="35%">
                    	<s:datetimepicker name="workLog.workDay"></s:datetimepicker>
                        </td>
                        <td class="errorMessage"><s:fielderror><s:param>role.roleName</s:param></s:fielderror> </td>
                </tr>
            </table>
            <div class="title">
                工作内容编辑</div>
    	<table style="padding: 0px; margin: 0px; border: 1px solid #00FFFF; border-spacing: 0px;">
             <s:textarea name="content" rows="30" cols="50" theme="ajax"></s:textarea>
        </table>
             <s:submit></s:submit>

            <div class="controlBtn">
            		<input class="btnStyle1" type="button" value="保存" onclick='submitForm("Test.action");'/>
            		<input class="btnStyle1" type="button" value="返回项目管理" onclick='submitForm("ProjList.action");'/>
            </div>
        </div>
        </s:form>
</body>
</html>