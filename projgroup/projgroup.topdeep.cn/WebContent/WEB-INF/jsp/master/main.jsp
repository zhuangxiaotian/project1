<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
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
  <title><decorator:title /></title>
    <base href="<%=basePath%>" />
  <link rel="stylesheet" type="text/css" href="skin/style1/css/face.css" />
  <script type="text/javascript"
			src="topdeep/js/jquery/jquery-1.3.2/jquery-1.3.2.js"></script>
<%--  <s:include value="/WEB-INF/jsp/include/head.jsp"></s:include>--%>
  <decorator:head></decorator:head>
<%--  <s:property escape="false" value="scriptManage.getScriptOutput()"/>--%>
</head>
<body>
<%--    <div class="wraper">--%>
<%--    	<s:include value="/WEB-INF/jsp/include/header.jsp"></s:include>--%>
<%--    	<s:include value="/WEB-INF/jsp/include/usermenu.jsp"></s:include>--%>
<%--        <decorator:body></decorator:body>--%>
<%--        <s:include value="/WEB-INF/jsp/include/footer.jsp"></s:include>--%>
<%--    </div>--%>
        <decorator:body></decorator:body>
</body>
</html>