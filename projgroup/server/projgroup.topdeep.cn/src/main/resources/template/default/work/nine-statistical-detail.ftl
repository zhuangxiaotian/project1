<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/work/nineStatisticalDetail.js?v=${res.version!''}"></script>
<script type="text/javascript">
	$(function(){
		NineStatisticalDetail.initPage();
	});
	
</script>
</#macro>
<#macro htmlbody>
  	<br>
   	九点考勤汇总详情：
  	<br>
 年:<select id="selYear"  name = "selYear" onchange="NineStatisticalDetail.ajaxQuery()" ></select> 
 月:<select id="selMonth" name = "selMonth"  onchange="NineStatisticalDetail.ajaxQuery()" ></select> 
  <br>
  <br>
	<div id="myGrid" style="width:98%;height:600px;"></div>
</#macro>
<#include "../common/html-page.ftl">
