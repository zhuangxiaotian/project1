<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/topdeep-web-tags"%>
<s:hidden id="pi" name="pageIndex"></s:hidden>
<s:if test="%{rowsCount > 0}">
	<div class="innerA">
		共
		<s:property value="rowsCount" />
		条 第(
		<s:property value="pageNumber" />
		/
		<s:property value="pageCount" />
		)页
		<s:if test="%{pageNumber &gt; 1}">
			<s:submit type="image" src="images/previous_active.gif"
				method="browsePrev" align="absmiddle" value="上一页"
				cssClass="includeNextPage"></s:submit>
		</s:if>
		<s:else>
			<s:submit type="image" src="images/previous_disable.gif"
				disabled="true" align="absmiddle" cssClass="includeNextPage"></s:submit>
		</s:else>
<%-- 
<s:iterator value="pageNumberList">
	<s:if test="nav">
		<s:if test="current">
		<a onclick="return false;" href="" class="page_current"><s:property value="navNumber" /></a>
		</s:if>
		<s:else>
		<s:a onclick="document.getElementById('jumpPageIndex').value=%{navNumber}; document.getElementById('jumpButton').click();" cssStyle="cursor:hand;"><s:property value="navNumber" /></s:a>
		</s:else>	
	</s:if>
	<s:else>
	...
	</s:else>
</s:iterator>
 --%>
		<s:if test="pageNumber < pageCount ">
			<s:submit type="image" src="images/next_active.gif" value="下一页"
				method="browseNext" align="absmiddle" cssClass="includeNextPage" />
		</s:if>
		<s:else>
			<s:submit type="image" src="images/next_active.gif" value="下一页"
				disabled="true" method="browseNext" align="absmiddle"
				cssClass="includeNextPage" />
		</s:else>
		到第
		<input type="text" id="jumpPageIndex" name="jumpPageIndex" value="" cssStyle="width:30px;" />
		页
		<s:submit id="jumpButton" type="image" src="images/ok.gif"
			align="absmiddle" method="jumpPage" cssClass="includeNextPage"></s:submit>
	</div>
</s:if>
