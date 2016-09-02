<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title><decorator:title /></title>
<link href="css/menu.css" rel="stylesheet" type="text/css"/>
<link href="css/issue.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/commlib.js"></script>
<decorator:head></decorator:head>
<script type="text/javascript">
function findObj(theObj, theDoc)
{
  var p, i, foundObj;
  
  if(!theDoc) theDoc = document;
  if( (p = theObj.indexOf("?")) > 0 && parent.frames.length)
  {
    theDoc = parent.frames[theObj.substring(p+1)].document;
    theObj = theObj.substring(0,p);
  }
  if(!(foundObj = theDoc[theObj]) && theDoc.all) foundObj = theDoc.all[theObj];
  for (i=0; !foundObj && i < theDoc.forms.length; i++) 
    foundObj = theDoc.forms[i][theObj];
  for(i=0; !foundObj && theDoc.layers && i < theDoc.layers.length; i++) 
    foundObj = findObj(theObj,theDoc.layers[i].document);
  if(!foundObj && document.getElementById) foundObj = document.getElementById(theObj);
  
  return foundObj;
}
</script>


<!--[if lte IE 6]> 

<style type="text/css"> 
/* styling specific to Internet Explorer IE5.5 and IE6. Yet to see if IE7 handles li:hover */ 

/* Get rid of any default table style */ 
table { 
border-collapse:collapse; 
margin:0;  
padding:0; 
} 
/* ignore the link used by 'other browsers' */ 
.menu ul li a.hide, .menu ul li a:visited.hide { 
display:none; 
} 
/* set the background and foreground color of the main menu link on hover */ 
.menu ul li a:hover { 
color:#fff;  
background:#b3ab79; 
} 
/* make the sub menu ul visible and position it beneath the main menu list item */ 
.menu ul li a:hover ul { 
display:block;  
position:absolute;  
top:32px;  
left:0;  
width:105px; 
} 
/* style the background and foreground color of the submenu links */ 
.menu ul li a:hover ul li a { 
background:#faeec7;  
color:#000; 
} 
/* style the background and forground colors of the links on hover */ 
.menu ul li a:hover ul li a:hover { 
background:#dfc184;  
color:#000; 
} 

</style> 

<![endif]-->
</head>
<body>
<div class="menu">
<ul> 
<s:iterator value="rootSiteUrl.getChildUrlList()" id="site1">
<s:if test="%{hasPrivilege(func,1)}">
<li>
<s:a cssClass="hide" href="%{url}"><s:property value="name" /></s:a>

<!--[if lte IE 6]>
<a href="<s:property value='url' />"><s:property value="name" /> 
<table><tr><td> 
<![endif]--> 

<s:if test="#site1.getChildUrlList().size > 0">
<ul>
<s:iterator value="getChildUrlList()" id="site2">
<s:if test="%{hasPrivilege(func,1)}">
<li>
<s:a href="%{url}"><s:property value="name" /></s:a>
</li>
</s:if>
</s:iterator>
</ul>
</s:if>

<!--[if lte IE 6]> 
</td></tr></table> 
</a> 
<![endif]--> 

</li>
</s:if>
</s:iterator>
</ul> 

<!-- clear the floats if required --> 
<div class="clear"> </div> 

</div>

<decorator:body></decorator:body>

</body>
</html>
