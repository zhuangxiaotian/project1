<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/work/topdeepBeanList.js?v=${res.version!''}"></script>
<script type="text/javascript">
	$(function(){
		TopdeepBeanList.initPage();
	});
</script>
</#macro>
<#macro htmlbody>
	<div style="width:98%;height:30px;">
	<select id="queryType">
		<option value="0">当月成就</option>
		<option value="1">上月成就</option>
	</select><input type="button" id="queryButton" value="查询" style="width: 60px;"/><input type="checkbox" id="forceRefresh" value="0"/>强制刷新
	</div>
	<div id="myGrid" style="width:98%;height:520px;"></div>
	<#include "../common/html-foot.ftl">
</#macro>
<#include "../common/html-page.ftl">