<#macro htmlhead>
<style>	
    .toggle {
      height: 9px;
      width: 9px;
      display: inline-block;
    }
    .toggle.expand {
      background: url(${base}/images/expand.gif) no-repeat center center;
    }
    .toggle.collapse {
      background: url(${base}/images/collapse.gif) no-repeat center center;
    }	
  </style>	
<script type="text/javascript" src="${base}/js/work/codeBuild.js?v=${res.version!''}"></script>
 <script type="text/javascript">	
        $(function(){
    			 CodeBuild.initPage();
     　})	
 </script>
</#macro>
<#macro htmlbody>
项目构建管理：	
   <br>
	<div id="myGrid" style="width:90%;height:500px;" class="gid"></div>
	<#--<#include "../common/page.ftl">
	<#if pageutil??>
		<@pageutil id=""></@pageutil>
	</#if>
	-->
</#macro>
<#include "../common/html-page.ftl">

