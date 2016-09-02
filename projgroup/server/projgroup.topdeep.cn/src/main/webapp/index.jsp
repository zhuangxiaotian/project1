<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <baseee href="<%=basePath%>">
    
    <title2>My JSP 'index.jsp' starting page
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="fckeditor/fckeditor.js"></script>
  </head>
  
  <body>
    This is my JSP page. <br>
    <s:text name=""></s:text>
    <script type="text/javascript">
<!--
// Automatically calculates the editor base path based on the _samples directory.
// This is usefull only for these samples. A real application should use something like this:
// oFCKeditor.BasePath = '/fckeditor/' ;	// '/fckeditor/' is the default value.
var sBasePath = 'fckeditor/'

var oFCKeditor = new FCKeditor( 'FCKeditor1' ) ;
oFCKeditor.BasePath	= sBasePath ;
oFCKeditor.Height	= 300 ;
oFCKeditor.Value	= '<p>This is some <strong>sample text<\/strong>. You are using <a href="http://www.fckeditor.net/">FCKeditor<\/a>.<\/p>' ;
oFCKeditor.Create() ;
//-->
		</script>
  </body>
</html>
