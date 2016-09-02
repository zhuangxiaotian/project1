<#macro htmlhead>
<link rel="stylesheet" href="${base}/css/slick.grid/slick.grid.css" type="text/css"/>
<link rel="stylesheet" href="${base}/css/slick.grid/smoothness/jquery-ui-1.8.16.custom.css" type="text/css"/>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/func/ProjectList.js?v=${res.version!''}"></script>
<script src="${base}/js/slick.grid/slick.core.js"></script>
<script src="${base}/jquery-ui-1.11.2.custom/jquery-ui.min.js"></script>
<script src="${base}/js/slick.grid/slick.editors.js"></script>
<script src="${base}/js/slick.grid/slick.grid.js"></script>
<script type="text/javascript">
	$(function(){
		ProjectList.initPage();
		//ProjectList.ajaxQueryProjectList();
	});
</script>
</#macro>
<#macro htmlbody>
 <form action="${base}/func/projectListExport.do" id="exportForm">	
            <input type="hidden" name="funcProjectId" value="" id="projectId" />	
</form>
  	项目列表
	<div id="myGrid" style="width:98%;height:600px;"></div>
	<#include "../common/html-foot.ftl">
</#macro>
<#include "../common/html-page.ftl">
