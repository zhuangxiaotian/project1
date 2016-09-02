<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/work/evelenDetail.js?v=${res.version!''}"></script>
<script type="text/javascript">
	$(function(){
		EvelenDetail.initPage();
	});
</script>

</#macro>
<#macro htmlbody>
  	十一点考勤明细
  <br/>
  	请输入年月：
<select name="selYear" id="selYear" onchange = "EvelenDetail.ajaxQuery();">  
</select>年  
 <select name="selMonth" id="selMonth" onchange = "EvelenDetail.ajaxQuery();">  
 </select>月
	<div id="myGrid" style="width:62%;height:800px;"></div>
</#macro>
<#include "../common/html-page.ftl">
