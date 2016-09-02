<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/func/codeBuildProcedureListManage.js?v=${res.version!''}"></script>
<script type="text/javascript" src="${base}/js/slick.grid/plugins/slick.checkboxselectcolumn.js"></script>
<script type="text/javascript" src="${base}/js/slick.grid/plugins/slick.rowselectionmodel.js"></script>
<script type="text/javascript" src="${base}/js/slick.grid/plugins/slick.cellselectionmodel.js"></script>
<script type="text/javascript" src="${base}/js/slick.grid/plugins/slick.autotooltips.js"></script>
<script type="text/javascript">
	$(function(){
		var buildId = ${res.buildId};
		CodeBuildProcedureListManage.initPage(buildId);
	});

</script>

</#macro>
<#macro htmlbody>
  	构建函数选择
  </br><hr></hr>
  	<a href = "CodeBuildProcedureList.action?buildId=" + ${res.buildId}>构建函数选择</a>| 
  	<a href = "CodeBuildEdit.action?buildId=" + ${res.buildId}>构建修改</a> |
  	<a href = "CodeBuildPropertyEdit.action?buildId=" + ${res.buildId}>构建属性</a> |
  	<a href = "CodeBuildExecute.action?buildId=" + ${res.buildId}>构建执行</a> |
  	<a href = "FuncTestEdit.action?buildId=" + ${res.buildId}>参数设置</a>|
  	<a href = "CodeBuildList.action">返回构建列表</a>
  	<div id="myGrid" style="width:62%;height:380px;"></div>
    <input type="button" value="确定" class="save"></input>
</br>要导入的build标识<input type="text" id="srcBuildId"></input>  <input type="button" value="导入" class="import"></input> 是否反向导入<input type="checkbox"  name="booleanInvert" id="booleanInvert" class="booleanInvert"></input>
</#macro>
<#include "../common/html-page.ftl">