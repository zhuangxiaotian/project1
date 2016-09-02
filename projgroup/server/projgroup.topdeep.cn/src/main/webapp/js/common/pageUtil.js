var TopdeepUtil = {};

TopdeepUtil.pageUtil = function(pageData,queryCallback,pageKey){
	this.pageData = pageData;
	this.queryCallback = queryCallback;
	this.pageKey = pageKey;
	
	this.refreshPage= function() {
		$("#pageIndex"+pageKey).val(this.pageData.pageIndex);
		if (this.pageData.pageIndex == 0) {
			$("#btn_browsePrev"+pageKey).attr("disabled", true);
		} else {
			$("#btn_browsePrev"+pageKey).attr("disabled", false);
		}
		$("#totalPage"+pageKey).val(this.pageData.totalPage);
		if (this.pageData.pageIndex < this.pageData.totalPage - 1) {
			$("#btn_browseNext"+pageKey).attr("disabled", false);
		} else {
			$("#btn_browseNext"+pageKey).attr("disabled", true);
		}
		$("#totalPage"+pageKey).val(this.pageData.totalPage);
		$("#totalCount"+pageKey).html(this.pageData.totalCount);
		$("#pageIndex_value"+pageKey).html(this.pageData.pageIndex + 1);
	};
	
	this.initPage = function() {
		$("#btn_browseNext"+pageKey).unbind("click");
		$("#btn_browsePrev"+pageKey).unbind("click");
		$("#jumpButton"+pageKey).unbind("click");
		$("#btn_browseNext"+pageKey).bind(
				"click",
				function() {
					var pageIndex = $("#pageIndex"+pageKey).val();
					pageIndex = Number(pageIndex);
					var totalPage = $("#totalPage"+pageKey).val();
					totalPage = Number(totalPage);
					if (pageIndex < totalPage - 1) {
						queryCallback(pageIndex+1);
					} else {
						$("#btn_browseNext").attr("disabled", "disabled");
						alert("您已到最后一页");
					}
				});

		$("#btn_browsePrev"+pageKey).bind(
				"click",
				function() {
					var pageIndex = $("#pageIndex"+pageKey).val();
					pageIndex = Number(pageIndex);
					if(pageIndex > 0){
						queryCallback(pageIndex-1);
					}else{
						$("#btn_browsePrev"+pageKey).attr("disabled", "disabled");
						alert("您已到第一页");
					}
				});

		$("#jumpButton"+pageKey).bind(
				"click",
				function() {
					var pageIndex = $("#pageIndex"+pageKey).val();
					pageIndex = Number(pageIndex);
					var jumpPage = $("#jumpPageIndex"+pageKey).val() - 1;
					var totalPage = $("#totalPage"+pageKey).val();
					jumpPage = Number(jumpPage);
					totalPage = Number(totalPage);
					if (jumpPage >= 0 && jumpPage < totalPage && jumpPage != pageIndex) {
						queryCallback(jumpPage);
					} else {
						alert("跳转页数错误");
					}
				});

	};
}



