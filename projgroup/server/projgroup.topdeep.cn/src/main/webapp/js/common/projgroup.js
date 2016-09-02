var ProjGroup = {};
ProjGroup.contentType = "application/x-www-form-urlencoded; charset=utf-8", ProjGroup.jsonContentType = "application/json; charset=utf-8",
		ProjGroup.contextPath = contextPath;
// 图片验证码链接
// Post.picturValidatacodeUrl = Post.contextPath+"/v/VerifyCodeServlet.action?seed=";
// 密码正则表达式
// Post.passwordReg = /^\d{6}$/;
// 密码为非6位数字时的提示语句
ProjGroup.passwordTipMessage = "请输入六位数字交易密码";
ProjGroup.showDiv = function(showPageStepList, stepID) {
	if (!showPageStepList || !stepID) {
		return false;
	}
	var isShow = false;
	for (var i = 0; i < showPageStepList.length; i++) {
		var item = showPageStepList[i];
		$("#" + item).hide();
		if (item == stepID) {
			isShow = true;
		}
	}
	if (isShow) {
		$(window).scrollTop(0);
		$("#" + stepID).show();
	}
};

ProjGroup.alertTipMessage = function(title, tipMessage, callback) {
	if (arguments.length <= 1) {
		tipMessage = title;
		title = "提示信息";
	}
	var $dlg = $("#dialog_div");
	$dlg.empty();
	var dialogContentHtml = "<div id='global_alert_title' class='dlg_title'>"
			+ title
			+ "</div>"
			+ "<div id='global_alert_content' class='dlg_content' style='text-align:left;max-width:280px;word-wrap: break-word;min-height: 70px;height: initial;'>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ tipMessage + "</div>" + "<div class='dlg_bar' style='margin-bottom:20px;'>" + "<button id='alertConfirm_btn' class='btn btn_center'>确定</button>"
			+ "</div>";
	$dlg.append(dialogContentHtml);
	Post.createMask();
	Post.centerDlg($dlg);
	$dlg.show();
	$("#alertConfirm_btn").bind("click", function() {
		Post.deleteMask();
		$dlg.hide();
		if (callback && typeof (callback) == "function") {
			callback();
		}
	});
};
// 确认对话框
ProjGroup.confirmDialog = function(title, tipMessage, callback) {
	if (arguments.length <= 1) {
		tipMessage = title;
		title = "提示信息";
	}
	var $dlg = $("#dialog_div");
	$dlg.empty();
	var dialogContentHtml = "<div class='dlg_title'>"
			+ title
			+ "</div>"
			+ "<div class='dlg_content' style='text-align:left;max-width:280px;word-wrap: break-word;min-height: 70px;height: initial;'>&nbsp;&nbsp;&nbsp;&nbsp;"
			+ tipMessage + "</div>" + "<div class='dlg_bar' style='margin-bottom:20px;'>" + "<button id='dialogConfirm_btn' class='btn btn_left'>确定</button>"
			+ "<button id='dialogCancle_btn' class='btn btn_right'>返回</button>" + "</div>";
	$dlg.append(dialogContentHtml);
	Post.createMask();
	Post.centerDlg($dlg);
	$dlg.show();

	$("#dialogConfirm_btn").bind("click", function() {
		Post.deleteMask();
		$dlg.hide();
		if (callback && typeof (callback) == "function") {
			callback();
		}
	});
	$("#dialogCancle_btn").bind("click", function() {
		Post.deleteMask();
		$dlg.hide();
	});
};
// 创建遮盖层并显示
ProjGroup.createMask = function() {

	var $mask = $("#mask_div");
	if ($mask.length > 0) {
		var showCount = parseInt($mask.attr("showCount"));
		showCount++;
		$mask.attr("showCount", showCount);
	} else {
		var bodyObj = $($("body")[0]);
		bodyObj.append("<div id='mask_div' showCount='1' class='dlg_mask' style='display: block;'></div>");

		var maskObj = $("#mask_div").get(0);
		maskObj.className = "dlg_mask";
		maskObj.style.height = Post.maxHeight() + "px"; // document.body.scrollHeight+"px";
	}
};
// 删除遮照层
ProjGroup.deleteMask = function() {
	var $mask = $("#mask_div");
	if ($mask.length > 0) {
		var showCount = parseInt($mask.attr("showCount"));
		if (showCount > 1) {
			showCount--;
			$mask.attr("showCount", showCount);
		} else {
			$mask.remove();
		}
	}
};
// 计算当前页面窗口的最大高度
ProjGroup.maxHeight = function() {
	var maxHeight = document.documentElement.offsetHeight;
	if (maxHeight <= document.documentElement.scrollHeight) {
		maxHeight = document.documentElement.scrollHeight;
	}
	if (maxHeight <= document.documentElement.clientHeight) {
		maxHeight = document.documentElement.clientHeight;
	}
	if (maxHeight <= window.screen.height) {
		maxHeight = window.screen.height;
	}
	return maxHeight;
};

ProjGroup.centerDlg = function($dlg) {
	if ($dlg.length <= 0) {
		return;
	}
	var dlgWidth = $dlg.width();
	var dlgHeight = $dlg.height();
	var windowWidth = $(window).width();
	var windowHeight = $(window).height();
	var dlgLeft = (windowWidth - dlgWidth) / 2;
	var dlgTop = (windowHeight - dlgHeight) / 2;
	// alert(dlgLeft+","+dlgTop);
	$dlg.css("left", "");
	$dlg.css("top", "");
	$dlg.offset({
		top : dlgTop,
		left : dlgLeft
	});
	// var props = {};
	// props.left = dlgLeft;
	// props.top = dlgTop;
	// $dlg.css(props);
}

ProjGroup.doResize = function() {
	var obj = document.getElementsByTagName("select");

	for (var i = 0; i < obj.length; i++) {
		Post.resizeSel(obj[i]);
	}
};
ProjGroup.resizeSel = function(selObj) {
	var coverObj = selObj.parentNode;
	var w = coverObj.parentNode.offsetWidth;

	selObj.style.width = w + "px";
	coverObj.style.width = (w - 20) + "px";
};
ProjGroup.selInfo = function(obj) {
	var objs = document.getElementsByName("info_list");

	for (var i = 0; i < objs.length; i++) {
		objs[i].className = "info_list info_unsel";
	}
	obj.className = "info_list info_sel";
};

ProjGroup.redeemClick = function($_obj, fundItem, redeemToTradeAccMap) {
	$_obj.bind("click", function() {
		Post.alertTipMessage("未实现每支基金的click事件,此方法如果是赎回需要在Redeem.js中重写️");
	});
};
ProjGroup.checkDate = function(dateStr) {
	var reg = /((^((1[8-9]\d{2})|([2-9]\d{3}))(-)(10|12|0?[13578])(-)(3[01]|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))(-)(11|0?[469])(-)(30|[12][0-9]|0?[1-9])$)|(^((1[8-9]\d{2})|([2-9]\d{3}))(-)(0?2)(-)(2[0-8]|1[0-9]|0?[1-9])$)|(^([2468][048]00)(-)(0?2)(-)(29)$)|(^([3579][26]00)(-)(0?2)(-)(29)$)|(^([1][89][0][48])(-)(0?2)(-)(29)$)|(^([2-9][0-9][0][48])(-)(0?2)(-)(29)$)|(^([1][89][2468][048])(-)(0?2)(-)(29)$)|(^([2-9][0-9][2468][048])(-)(0?2)(-)(29)$)|(^([1][89][13579][26])(-)(0?2)(-)(29)$)|(^([2-9][0-9][13579][26])(-)(0?2)(-)(29)$))/;
	return reg.test(dateStr);
};
// 后退功能，如果是风险测评页面，再跳到上一页面
ProjGroup.goBackPre = function() {
	history.go(-1);
};
// 关闭窗口，退出微信
ProjGroup.closeWindow = function() {
	var ua = navigator.userAgent;
	if (ua.indexOf("MicroMessenger") > -1) {
		WeixinJSBridge.call('closeWindow');
	} else {
		// Scripts may close only the windows that were opened by it.
		window.opener = null;
		window.open('', '_self');
		window.close();
	}
};
ProjGroup.locationReplace = function(directUrl) {
	if (directUrl) {
		window.location.replace(directUrl);
	}
};

ProjGroup.loadingMaskShow = function() {
	Post.createMask();
	var bodyObj = $($("body")[0]);
	var $loading = $("#loading_div");
	$loading.empty();
	var loadingHtml = "<div id='loading_div2' class='dlg_content' style='text-align:center;'>" + "<div><image src='" + Post.contextPath
			+ "/skin/weixin/images/common/loading.gif'/></div>" + "<div style='color:#222;font-size:18px;font-weight:600;'>加载中...</div>" + "</div>";
	$loading.append(loadingHtml);
	var clientHeight = 100;// document.documentElement.clientHeight;
	// if(!clientHeight){
	// clientHeight = 200;
	// }
	// clientHeight = clientHeight/2-20;
	// Post.centerDlg($loading);
	$loading.css("top", "");
	$loading.css("left", "");
	$loading.offset({
		left : 0,
		top : $("body").height() / 2
	});
	$loading.show();
	// bodyObj.append(loadingHtml);
	// $("#loading_div1").get(0).style.top = clientHeight + "px";
};
// 删除遮照层和加载div
ProjGroup.closeLoadingMask = function() {
	var $loading = $("#loading_div");
	$loading.hide();
	Post.deleteMask();
	// $("#loading_div1").remove();
};
// 换成可点击按钮的样式
ProjGroup.enableButton = function($button, disableClass) {
	if (Post.checkEnableButton($button)) {
		return;
	}
	$button.removeAttr("disabled");
	$button.removeClass(disableClass);

	Post.closeLoadingMask();
};
// 把可点击的按钮变成不可点击样式
ProjGroup.disableButton = function($button, disableClass) {
	if (Post.checkEnableButton($button)) {
		$button.attr("disabled", "disabled");
		$button.addClass(disableClass);
		Post.loadingMaskShow();
	}
};
// 按钮是否可点击
ProjGroup.checkEnableButton = function($button) {
	return $button.attr("disabled") != "disabled";
};
// 给传进来的上一页的html对象设置后退的class的属性值,此方法目前只在绑定、开户、菜单页使用
ProjGroup.setBackPreClassValue = function($_obj) {
	if ($_obj) {
		$_obj.removeClass("closeWindowPage");
		$_obj.addClass("gotoPrevPage");

		var queryString = location.search;
		if (queryString) {
			var p1 = "";
			var p3 = "";
			var p99 = "";
			var index1 = queryString.indexOf("?") + 1;
			queryString = queryString.substring(index1);
			var paramArr = queryString.split("&");
			for (var i = 0; i < paramArr.length; i++) {
				try {
					var item = paramArr[i];
					var key = item.substring(0, item.indexOf("="));
					if (key == "p1") {
						p1 = item.substring(item.indexOf("=") + 1);
					}
					if (key == "p3") {
						p3 = item.substring(item.indexOf("=") + 1);
					}
					if (key == "p99") {
						p99 = item.substring(item.indexOf("=") + 1);
					}
				} catch (e) {
				}
			}
			if (p1 && p3 && p99) {
				$_obj.addClass("closeWindowPage");
				$_obj.removeClass("gotoPrevPage");
			}
		}
	}
};
ProjGroup.placeholderDateInput = function($_obj) {
	if (!$_obj || $_obj.length == 0) {
		return false;
	}
	// var date = new Date();
	// var year = date.getFullYear();
	// var month = date.getMonth() + 1;
	// if(month < 10){
	// month = "0"+month;
	// }
	// var _date = date.getDate();
	// if(_date < 10){
	// _date = "0" + _date;
	// }
	$_obj.attr("placeholder", "yyyyMMdd");
	return true;
};

ProjGroup.formatDate = function(date, format) {
	var paddNum = function(num) {
		num += "";
		return num.replace(/^(\d)$/, "0$1");
	}
	// 指定格式字符
	var cfg = {
		yyyy : date.getFullYear() // 年 : 4位
		,
		yy : date.getFullYear().toString().substring(2)// 年 : 2位
		,
		M : date.getMonth() + 1 // 月 : 如果1位的时候不补0
		,
		MM : paddNum(date.getMonth() + 1) // 月 : 如果1位的时候补0
		,
		d : date.getDate() // 日 : 如果1位的时候不补0
		,
		dd : paddNum(date.getDate())// 日 : 如果1位的时候补0
		,
		hh : paddNum(date.getHours()) // 时
		,
		mm : paddNum(date.getMinutes()) // 分
		,
		ss : paddNum(date.getSeconds())
	// 秒
	}
	format || (format = "yyyy-MM-dd hh:mm:ss");
	return format.replace(/([a-z])(\1)*/ig, function(m) {
		return cfg[m];
	});
}
