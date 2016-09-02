var CodeBuild = {};
CodeBuild.grid = null;
CodeBuild.contextPath = contextPath;
CodeBuild.gridView = null;
CodeBuild.gridData = [];
CodeBuild.currentTotalPages;
CodeBuild.maxId = 10000;
var PageUtil;
var itemFlag;
CodeBuild.initPage = function() {
	// PageUtil = new TopdeepUtil.pageUtil(null, CodeBuild.ajaxQuery, "");
	// PageUtil.initPage();
	CodeBuild.initGrid();
	CodeBuild.ajaxQuery();
	$(document).ready(function() {
		var screenHeight = $(window).height();
		var screenWidth = $(window).width();
		var divHeight = $("#myGrid").height();
		var divWidth = $("myGrid").width();
		if (screenHeight * 3 / 5 > divHeight) {
			document.getElementById("myGrid").style.height = divHeight + "px";
		} else {
			document.getElementById("myGrid").style.height = screenHeight * 3 / 5 + "px";
		}
	});
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = CodeBuild.gridView.getItemById(row);
		if (window.confirm("是否确认保存修改?")) {
			CodeBuild.ajaxSave(item);
		}
		return false;
	});

	$(document).on("click", ".addNewCode", function() {
		var target = $(this).parent().parent().find(".toggle");
		if ($(target).hasClass("expand")) {
			$(target).click();
		}
		var id = $(this).attr("buildId");
		var item = CodeBuild.gridView.getItemById(id);
		var idx = CodeBuild.gridView.getIdxById(id);
		var newIdx = idx + 1;
		var nextItem = CodeBuild.gridView.getItemByIdx(newIdx);
		while (nextItem && nextItem.parentBuildId == item.buildId) {
			newIdx++;
			nextItem = CodeBuild.gridView.getItemByIdx(newIdx);
		}

		CodeBuild.maxId = CodeBuild.maxId + 1;
		var maxId = -CodeBuild.maxId;
		var item = {
			"buildId" : maxId,
			"buildName" : "新项目",
			"parentBuildId" : item.buildId,
			"funcProjects" : "",
			"pub0" : "",
			"pub1" : "",
			"pub2" : "",
			"pub3" : "",
			"pub4" : "",
			"pub5" : "",
			"changed" : true,
			"isNew" : true
		};

		CodeBuild.gridView.insertItem(newIdx, item);

		return false;
	});
}

CodeBuild.getGridColumns = function() {
	var columns = [];
	columns.push({
		id : "buildId",
		name : "构建标识",
		field : "buildId",
		width : 50,
		formatter : CodeBuild.formatFuncName,
	});
	columns.push({
		id : "buildName",
		name : "构建名称",
		field : "buildName",
		editor : Slick.Editors.Text
	});
	// columns.push({
	// id : "parentBuildId",
	// name : "父构建标识",
	// field : "parentBuildId",
	// width : 40
	// });
	columns.push({
		id : "funcProjects",
		name : "相关项目",
		field : "funcProjects",
		width : 50,
		editor : Slick.Editors.Text
	});
	// columns.push({
	// id : "pub0",
	// name : "公共0",
	// field : "pub0",
	// width : 10,
	// editor : Slick.Editors.Text
	// });
	// columns.push({
	// id : "pub1",
	// name : "公共1",
	// field : "pub1",
	// width : 10,
	// editor : Slick.Editors.Text
	// });
	// columns.push({
	// id : "pub2",
	// name : "公共2",
	// field : "pub2",
	// width : 10,
	// editor : Slick.Editors.Text
	// });
	// columns.push({
	// id : "pub3",
	// name : "公共3",
	// field : "pub3",
	// width : 10,
	// editor : Slick.Editors.Text
	// });
	// columns.push({
	// id : "pub4",
	// name : "公共4",
	// field : "pub4",
	// width : 10,
	// editor : Slick.Editors.Text,
	// });
	// columns.push({
	// id : "pub5",
	// name : "公共5",
	// field : "pub5",
	// width : 10,
	// editor : Slick.Editors.Text
	// });
	columns.push({
		id : "pub",
		name : "操作",
		field : "pub",
		formatter : CodeBuild.operationFormatter,
	});
	return columns;
}

CodeBuild.initGrid = function() {
	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 36
	};

	CodeBuild.gridView = new Slick.Data.DataView({
		inlineFilters : true
	});
	CodeBuild.gridView.beginUpdate();
	CodeBuild.gridView.setItems(CodeBuild.gridData);
	CodeBuild.gridView.setFilter(CodeBuild.gridViewFilter);
	CodeBuild.gridView.endUpdate();

	CodeBuild.grid = new Slick.Grid("#myGrid", CodeBuild.gridView, CodeBuild.getGridColumns(), options);
	CodeBuild.grid.autosizeColumns();

	CodeBuild.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		CodeBuild.gridView.updateItem(args.item.buildId, args.item);
	});

	CodeBuild.grid.onAddNewRow.subscribe(function(e, args) {
		CodeBuild.maxId = CodeBuild.maxId + 1;
		var maxId = -CodeBuild.maxId;
		var item = {
			"buildId" : maxId,
			"buildName" : "",
			"parentBuildId" : 0,
			"funcProjects" : "",
			"pub0" : "",
			"pub1" : "",
			"pub2" : "",
			"pub3" : "",
			"pub4" : "",
			"pub5" : "",
			"changed" : true,
			"isNew" : true
		};
		$.extend(item, args.item);
		CodeBuild.gridView.addItem(item);

	});
	CodeBuild.grid.onClick.subscribe(function(e, args) {
		if ($(e.target).hasClass("toggle")) {
			itemFlag = CodeBuild.gridView.getItem(args.row);
			if (itemFlag) {
				if (itemFlag._collapsed == undefined || itemFlag._collapsed == true) {
					itemFlag._collapsed = false;
				} else {
					itemFlag._collapsed = true;
				}
				CodeBuild.gridView.updateItem(itemFlag.buildId, itemFlag);
			}
			e.stopImmediatePropagation();
		}
	});
	CodeBuild.gridView.onRowCountChanged.subscribe(function(e, args) {
		CodeBuild.grid.updateRowCount();
		CodeBuild.grid.render();
	});
	CodeBuild.gridView.onRowsChanged.subscribe(function(e, args) {
		CodeBuild.grid.invalidateRows(args.rows);
		CodeBuild.grid.render();
	});
}

CodeBuild.ajaxQuery = function() {
	try {
		$.ajax({
			type : "POST",
			url : CodeBuild.contextPath + "/work/codeBuildManage!ajaxQuery.do",
			datatype : "json",
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			success : function(result) {
				try {
					if (result.success) {
						CodeBuild.gridData = result.codeBuildList;
						CodeBuild.grid.setColumns(CodeBuild.getGridColumns());
						CodeBuild.grid.autosizeColumns();
						CodeBuild.gridView.beginUpdate();
						CodeBuild.gridView.setItems(CodeBuild.gridData, "buildId");
						CodeBuild.gridView.setFilter(CodeBuild.gridViewFilter);
						CodeBuild.gridView.endUpdate();
						// PageUtil.pageData = result.pageData;
						// PageUtil.refreshPage();
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert("操作失败" + e.message);
				}
			},
			error : function() {
				alert("操作失败");
			}
		});
	} catch (e) {
	}
};

CodeBuild.ajaxSave = function(obj) {
	try {
		$.ajax({
			type : "POST",
			url : CodeBuild.contextPath + "/work/codeBuildManage!ajaxSave.do",
			data : JSON.stringify({
				"input" : obj
			}),
			datatype : "json",
			contentType : 'application/json;charset=UTF-8',
			success : function(result) {
				try {
					if (result.success) {
						// alert("Success");
						var item = obj;
						if (item.buildId != result.output.buildId) {
							// new obj
							var idx = CodeBuild.gridView.getIdxById(item.buildId);
							CodeBuild.gridView.deleteItem(item.buildId);
							CodeBuild.gridView.insertItem(idx, result.output);
						} else {
							item.buildId = result.output.buildId;
							item.changed = false;
							item.isNew = false;
							CodeBuild.gridView.updateItem(item.buildId, item);
						}
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert("操作失败" + e.message);
				}
			},
			error : function() {
				alert("操作失败");
			}
		});
	} catch (e) {
	}
};

CodeBuild.operationFormatter = function(row, cell, value, columnDef, dataContext) {
	var item = dataContext;
	var ret = "";
	if (item.changed) {
		ret += "<input row='" + dataContext.buildId + "' class='commitRow btn btn-default'  type='button' value = '保存' /> ";
	}
	if (!item.isNew) {
		ret += "<a target='_blank' href='" + CodeBuild.contextPath + "/" + "work/CodeBuildExecute.action?buildId=" + item.buildId + "' row='" + row
				+ "'>构建</a>";
		ret += " <a target='_blank' href='" + CodeBuild.contextPath + "/" + "work/CodeBuildPropertyEdit.action?buildId=" + item.buildId + "' row='" + row
				+ "'>属性</a>";
		ret += " <a target='_blank' href='" + CodeBuild.contextPath + "/" + "func/codeBuildPropertyEdit.do?buildId=" + item.buildId + "' row='" + row
				+ "'>属性(新)</a>";
		ret += " <a target='_blank' href='" + CodeBuild.contextPath + "/" + "work/CodeBuildProcedureList.action?buildId=" + item.buildId + "' row='" + row
				+ "'>函数选择</a>";
		ret += " <a target='_blank' href='" + CodeBuild.contextPath + "/" + "work/FuncTestEdit.action?buildId=" + item.buildId + "' row='" + row + "'>参数设置</a>";
		if (item.parentBuildId == 0) {
			ret += " <a  class='addNewCode' href='javascript:void(0)' row='" + row + "' buildId='" + item.buildId + "'>添加子项</a>";
		} else {
		}
	}
	return ret;
}
CodeBuild.formatFuncName = function(row, cell, value, columns, dataContext) {
	var item = CodeBuild.gridView.getItemById(dataContext.buildId);
	var indent = 0;// 缩进
	if (item.parentBuildId != 0) {
		indent = 2;
	}
	var spacer = "<span style='display:inline-block;height:1px;width:" + (15 * indent) + "px'></span>";
	if (item.parentBuildId == 0) {
		if (dataContext._collapsed == undefined || dataContext._collapsed == true) {
			return spacer + " <span class='toggle expand'></span>&nbsp;" + value;
		} else {
			return spacer + " <span class='codebuildclick toggle collapse'></span>&nbsp;" + value;
		}
	} else {
		return spacer + value;
	}
}

CodeBuild.gridViewFilter = function(obj) {
	if (obj.parentBuildId != 0) {
		var parent = CodeBuild.gridView.getItemById(obj.parentBuildId);
		if (parent) {
			if (parent._collapsed == undefined || parent._collapsed == true) {
				return false;
			}
		}
	}
	return true;
}
var winWidth = 0;
var winHeight = 0;
CodeBuild.findDimensions = function() {// 函数：获取尺寸
	// 获取窗口宽度
	if (window.innerWidth) {
		winWidth = window.innerWidth;
	} else if ((document.body) && (document.body.clientWidth)) {
		winWidth = document.body.clientWidth;
	}
	// 获取窗口高度
	if (window.innerHeight) {
		winHeight = window.innerHeight;
	} else if ((document.body) && (document.body.clientHeight)) {
		winHeight = document.body.clientHeight;
	}
	// 通过深入Document内部对body进行检测，获取窗口大小
	if (document.documentElement && document.documentElement.clientHeight && document.documentElement.clientWidth) {
		winHeight = document.documentElement.clientHeight - 100;
		winWidth = document.documentElement.clientWidth;
	}
	// 设置div的具体宽度=窗口的宽度的%
	if (document.getElementById("myGrid")) {
		if (document.getElementById("myGrid").style.height > winHeight) {
			document.getElementById("myGrid").style.height = winHeight * 80 % +"px";
		}
	}
}

$(window).resize(function() {
	CodeBuild.findDimensions();
	$(".slick-viewport").height = winHeight * 80 % CodeBuild.ajaxQuery();
});
