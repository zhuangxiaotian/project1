<#macro htmlhead>
<link rel="stylesheet" href="${base}/css/slick.grid/slick.grid.css" type="text/css"/>
<link rel="stylesheet" href="${base}/css/slick.grid/smoothness/jquery-ui-1.8.16.custom.css" type="text/css"/>
</#macro>
<#macro jsimport>
<script type="text/javascript" src="${base}/js/func/funcProcedureManage.js?v=${res.version!''}"></script>
<script src="${base}/js/slick.grid/slick.core.js"></script>
<script src="${base}/jquery-ui-1.11.2.custom/jquery-ui.min.js"></script>
<script src="${base}/js/slick.grid/slick.editors.js"></script>
<script src="${base}/js/slick.grid/slick.grid.js"></script>
<script src="${base}/js/slick.grid/slick.dataview.js"></script>
 <script src="${base}/js/slick.grid/plugins/slick.autotooltips.js"></script>
<script type="text/javascript">
	$(function(){
		FuncProcedureManage.initPage(${res.funcProjectId});
	});
</script>
</#macro>
<#macro htmlbody>
  	项目列表
  	<div>
        <input style="width:300px;display:inline" id="search_keyword"  type="text" class="form-control" placeholder="函数代码/名称"/>
    </div>
	<div id="myGrid" style="width:98%;height:300px;"></div>
	<div style="width:98%;height:30px;">
	<select id="queryDeleteParams">
		<option value="false">普通</option>
		<option value="true">包含已删除的参数</option>
	</select>
	</div>
	<div id="myParamGrid" style="width:98%;height:300px;"></div>
	<#include "../common/html-foot.ftl">
</#macro>
<#include "../common/html-page.ftl">
