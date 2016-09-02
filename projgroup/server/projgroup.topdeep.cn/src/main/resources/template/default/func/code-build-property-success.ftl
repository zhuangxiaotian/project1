<#macro htmlhead>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/func/codeBuildPropertyManage.js?v=${res.version!''}"></script>
<script type="text/javascript">
	$(function(){
		var buildId = ${res.buildId};
		CodeBuildPropertyManage.initPage(buildId);
	});
</script>

</#macro>
<#macro htmlbody>
  	构建属性
  	</br><hr></hr>
  	<a href = "CodeBuildProcedureList.action?buildId=" + ${res.buildId}>构建函数选择</a>| 
  	<a href = "CodeBuildEdit.action?buildId=" + ${res.buildId}>构建修改</a> |
  	<a href = "CodeBuildPropertyEdit.action?buildId=" + ${res.buildId}>构建属性</a> |
  	<a href = "CodeBuildExecute.action?buildId=" + ${res.buildId}>构建执行</a> |
  	<a href = "FuncTestEdit.action?buildId=" + ${res.buildId}>参数设置</a>|
  	<a href = "CodeBuildList.action">返回构建列表</a>
  	<div id="myGrid" style="width:95%;height:400px;"></div>
  	要导入的build标识<input type="text" id="srcBuildId"></input><input type="button" value="导入" onclick="CodeBuildProperty.import()">
  				   <#include "../common/page.ftl">
  <#if pageutil??>
									<@pageutil id=""></@pageutil>
	</#if>
</#macro>
<#include "../common/html-page.ftl">
