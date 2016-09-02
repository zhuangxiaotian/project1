<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/work/evelenStatistical.js?v=${res.version!''}"></script>
<script type="text/javascript">
	$(function(){
		EvelenStatistical.initPage();
	});
</script>

</#macro>
<#macro htmlbody>
  	十一点考勤汇总
  	<br/>
  	请输入年月：
<select name="selYear" id="selYear" onchange = "EvelenStatistical.ajaxQuery();">  
</select>年  
 <select name="selMonth" id="selMonth" onchange = "EvelenStatistical.ajaxQuery();">  
 </select>月
	<div id="myGrid" style="width:62%;height:800px;"></div>
</#macro>
<#include "../common/html-page.ftl">
