<#macro htmlhead>
<link rel="stylesheet" href="${base}/css/slick.grid/slick.grid.css" type="text/css"/>
<link rel="stylesheet" href="${base}/css/slick.grid/smoothness/jquery-ui-1.8.16.custom.css" type="text/css"/>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/home/Index.js?v=${res.version!''}"></script>
<script src="${base}/js/slick.grid/slick.core.js"></script>
<script src="${base}/jquery-ui-1.11.2.custom/jquery-ui.min.js"></script>
<script src="${base}/js/slick.grid/slick.editors.js"></script>
<script src="${base}/js/slick.grid/slick.grid.js"></script>
<script src="${base}/js/echarts/echarts.min.js"></script>
<script type="text/javascript">
	$(function(){
		var columnList = [];
		var i = 0;
		<#list res.columnList as column>
			i = columnList.length;
			columnList[i] = {};
			columnList[i].name = "${column.name}";
			columnList[i].value = "${column.value}";
		</#list>
		Index.initPage(columnList);
	});
</script>
</#macro>
<#macro htmlbody>
	<div style="width:98%;height:30px;">
	<select id="queryType">
		<option value="0">当月成就</option>
		<option value="1">上月成就</option>
		<option value="2">近一年成就(累计)</option>
	</select><input type="button" id="queryButton" value="查询" style="width: 60px;"/>
	</div>
  	<div id="myChart" style="width:98%;height:600px;"></div>
	<div id="myGrid" style="width:98%;height:600px;"></div>
	<#include "../common/html-foot.ftl">
</#macro>
<#include "../common/html-page.ftl">
