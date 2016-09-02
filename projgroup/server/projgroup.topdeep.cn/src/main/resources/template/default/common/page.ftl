<#macro pageutil id="">
<div id= "customerLog_list_table${id}" class="innerA" style="color:#333; font-size:12px;margin-top:14px">
共<span id = "totalCount${id}"></span>条 第(<span id = "pageIndex_value${id}"></span>)页
    <input id="btn_browsePrev${id}" class="btn btn-default" type="button" value="上一页" ></input>
    <input id="btn_browseNext${id}" class="btn btn-default" type="button" value="下一页" src="images/next_active.gif" alt="下一页"></input>
    		到第
    <input id="jumpPageIndex${id}" type="text" style="width:20px" value=""></input>
    		页
    <input id="jumpButton${id}" class="btn btn-default" type="button" value="跳转" ></input>
    <input id="pageIndex${id}" type="hidden" value="" ></input>
    <input id="totalPage${id}" type="hidden" value="" ></input>
</div>
</#macro>