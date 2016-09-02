<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/work/nineStatistical.js?v=${res.version!''}"></script>
<script type="text/javascript">
	$(function(){
		NineStatistical.initPage();
	});
</script>
</#macro>
<#macro htmlbody>
  	九点考勤汇总：
  	<br>
 年:<select id="selYear"  name = "selYear" onchange="NineStatistical.ajaxQuery()" ></select> 
 月:<select id="selMonth" name = "selMonth"  onchange="NineStatistical.ajaxQuery()" ></select> 
  <br>
  <br>
	<div id="myGrid" style="width:98%;height:600px;"></div>
</#macro>
<#include "../common/html-page.ftl">
