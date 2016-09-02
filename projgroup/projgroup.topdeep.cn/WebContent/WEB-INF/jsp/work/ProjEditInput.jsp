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
  <title>项目编辑</title>
  <link rel="stylesheet" type="text/css" href="skin/style1/css/face.css" />
  <s:head/>
  <script type="text/javascript" src="topdeep/fckeditor/fckeditor_2.6.4/fckeditor.js"></script>
</head>
<body>
    	<s:form method="post" validate="true">
    	<s:hidden name="projId"></s:hidden>
        <div class="mainContent">
            
            
            <div class="title">
				<a href="###">项目信息</a>
			</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle4">
            	 <tr >
                    <td width="15%" style="text-align:right;">简称</td>
                    <td width="35%">
                    	<s:textfield name="proj.projectShortName" required="true"></s:textfield>
                    </td>
                    <td style="color:red" class="errorMessage"><s:fielderror><s:param>proj.projectShortName</s:param></s:fielderror> </td>
                </tr>
                <tr class="odd">
                    <td width="15%" style="text-align:right;">项目名称</td>
                    <td width="35%">
                    	<s:textfield name="proj.projectName"></s:textfield>
                    </td>
                    <td style="color:red"><s:fielderror><s:param>proj.projectName</s:param></s:fielderror></td>
                </tr>
            </table>
			<div class="title">
				<a href="###">项目描述</a>
			</div>
            <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle4">
	         
				<script type="text/javascript">
						// Automatically calculates the editor base path based on the _samples directory.
						// This is usefull only for these samples. A real application should use something like this:
						// oFCKeditor.BasePath = '/fckeditor/' ;	// '/fckeditor/' is the default value.
						var sBasePath = '<%=basePath%>topdeep/fckeditor/fckeditor_2.6.4/'
						var oFCKeditor = new FCKeditor( 'proj.projectDesc' ) ;
						oFCKeditor.Config["CustomConfigurationsPath"] = "<%=basePath%>" + "/js/fckeditconfig.js";
						oFCKeditor.BasePath	= sBasePath ;
						oFCKeditor.Height	= 300 ;
						oFCKeditor.Width    =720;
						oFCKeditor.ToolbarSet='OaToolBar';
						oFCKeditor.Value	= '<s:property escape="false" value="%{proj.projectDesc}" />' ;
						oFCKeditor.Create() ;
						//-->
				</script>
              </table>
              <table width="100%" border="0" cellspacing="0" cellpadding="0" class="tablestyle2">
              	<tr >
                       <td style="color:red"  class="errorMessage"><s:fielderror><s:param>proj.projectDesc</s:param></s:fielderror> </td>
                </tr>
                <tr class="odd">
                    <td width="15%" style="text-align:right;">
                        <s:label value="项目状态"></s:label>
                    </td>
                    <td width="35%">
						<s:select name="proj.projectState" list="#{1:'正常' , 0:'停止'}" listKey="key" listValue="value"></s:select>
                        </td>
                        <td></td>
                </tr>
                <tr class="odd">
                    <td width="15%" style="text-align:right;">项目经理
                    </td>
                    <td width="35%">
                    	<s:select list="userList" listKey="userId" listValue="realName" name="proj.projectManagerId"></s:select>
                     </td>
                </tr>
                <tr class="odd">
                    <td width="15%" style="text-align:right;">项目资源</td>
                    <td width="90%">
                        <s:iterator value="projUserList" status="st">
                        	<s:checkbox name="aaa" fieldValue="%{userId}" value="%{selected}"></s:checkbox><s:property value="realName"/>
                        </s:iterator>
                    </td>
                    
                </tr>
                <tr><td style="color:red" class="errorMessage"><s:fielderror><s:param>proj.projectManager</s:param></s:fielderror> </td></tr>
                 <tr class="odd">
                    <td width="15%" style="text-align:right;">计划开始时间 </td>
                    <td width="35%">
                    	<s:textfield name="proj.projectPlanStartDate" onclick="setDay(this);" cssClass="input"></s:textfield>
                    </td>
                </tr>
                <tr><td colspan="2" width="20%"  style="color:red" class="errorMessage"><s:fielderror><s:param>proj.projectPlanStartDate</s:param></s:fielderror> </td></tr>
                 <tr class="odd">
                    <td width="15%" style="text-align:right;">实际开始时间</td>
                    <td width="35%">
                    	<s:textfield name="proj.projectActualStartDate" onclick="setDay(this);" cssClass="input"></s:textfield>
                    </td>
                 </tr>
                 <tr><td colspan="2" style="color:red" class="errorMessage"><s:fielderror><s:param>proj.projectActualStartDate</s:param></s:fielderror> </td></tr>
                 <tr class="odd">
                    <td width="15%" style="text-align:right;">计划结束时间</td>
                    <td width="35%">
                        <s:textfield name="proj.projectPlanEndDate" onclick="setDay(this);" cssClass="input"></s:textfield>
                    </td>
                 </tr>
                 <tr><td colspan="2" style="color:red" class="errorMessage"><s:fielderror><s:param>proj.projectPlanEndDate</s:param></s:fielderror> </td></tr>
                 <tr class="odd">
                    <td width="15%" style="text-align:right;">实际结束时间</td>
                    <td width="35%">
                    	<s:textfield name="proj.projectActualEndDate" onclick="setDay(this);" cssClass="input"></s:textfield>
                    </td>
                    
                 </tr>
                 <tr><td colspan="2" style="color:red" class="errorMessage"><s:fielderror><s:param>proj.projectActualEndDate</s:param></s:fielderror> </td></tr>
              </table>
             
            <div class="footerButton">
            		<s:submit cssClass="btn2"  value="保存" method="save"></s:submit>
            		<s:submit type="input" action="ProjList" cssClass="btn2" value="返回项目管理"></s:submit>
            </div>
        </div>
        </s:form>
        
      </body>
</html>