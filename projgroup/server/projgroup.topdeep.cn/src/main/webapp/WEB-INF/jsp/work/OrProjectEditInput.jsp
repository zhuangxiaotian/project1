<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
if(path.equals("/")){
	path = "";
}
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html >
<head>
  <title>OrMapping项目编辑</title>
</head>
<body>
    	<s:form method="post" validate="true"  enctype="multipart/form-data" >
    	<s:hidden name="projectId"></s:hidden>
        <div class="mainContent">
            <div class="title">项目信息</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tableForm">
            	 <tr >
                    <td width="15%">dbhost</td>
                    <td width="35%">
                    	<s:textfield name="project.dbHost" required="true"></s:textfield>
                    </td>
                    <td style="color:red" class="errorMessage"><s:fielderror><s:param>project.dbHost</s:param></s:fielderror> </td>
                </tr>
                <tr>
                    <td width="15%">dbname</td>
                    <td width="35%">
                    	<s:textfield name="project.dbName"></s:textfield>
                    </td>
                    <td style="color:red"><s:fielderror><s:param>project.dbName</s:param></s:fielderror></td>
                </tr>
                <tr>
                    <td width="15%">dbuser</td>
                    <td width="35%">
                    	<s:textfield name="project.dbUser"></s:textfield>
                    </td>
                    <td style="color:red"><s:fielderror><s:param>project.dbUser</s:param></s:fielderror></td>
                </tr>
                <tr>
                    <td width="15%">dbpass</td>
                    <td width="35%">
                    	<s:textfield name="project.dbPass"></s:textfield>
                    </td>
                    <td style="color:red"><s:fielderror><s:param>project.dbPass</s:param></s:fielderror></td>
                </tr>
                <tr>
                    <td width="15%">项目文件</td>
                    <td width="35%">
                    	<input type="file" name="prjFile" />
                    </td>
                    <td style="color:red">&nbsp;</td>
                </tr>
				<tr>
                    <td width="15%">架构文件</td>
                    <td width="35%">
                    	<input type="file" name="dbFile" />
                    </td>
                    <td style="color:red">&nbsp;</td>
                </tr>
              </table>
            <div class="controlBtn">
            		<s:submit cssClass="btnStyle1"  value="保存" method="save"></s:submit>
            		<s:submit type="input" action="OrProjectList" cssClass="btnStyle1" value="返回项目管理"></s:submit>
            </div>
        </div>
        </s:form>
        
      </body>
</html>