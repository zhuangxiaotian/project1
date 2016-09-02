var CodeBuildPropertyManage = {};

CodeBuildPropertyManage.grid;
CodeBuildPropertyManage.gridView = null;
CodeBuildPropertyManage.currentBuildId;
CodeBuildPropertyManage.currentTotalPages;
CodeBuildPropertyManage.contextPath = contextPath;
CodeBuildPropertyManage.gridData = [];
var PageUtil;

CodeBuildPropertyManage.ajaxQuery = function(pageIndex) {
	try {
		$.ajax({
			type : "POST",
			url : CodeBuildPropertyManage.contextPath + "/func/codeBuildPropertyEditManage!ajaxQuery.do",
			data : {
				"buildId" : CodeBuildPropertyManage.currentBuildId,
				"pageIndex" : pageIndex
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						CodeBuildPropertyManage.gridData = result.codeBuildPropertyView;
						CodeBuildPropertyManage.grid.setData(CodeBuildPropertyManage.gridData);
						CodeBuildPropertyManage.grid.render();
						PageUtil.pageData = result.pageData;
						PageUtil.refreshPage();
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
				}
			},
			error : function() {
			}
		});
	} catch (e) {
	}
};

CodeBuildPropertyManage.ajaxSave = function(obj) {
	obj.buildId = CodeBuildPropertyManage.currentBuildId;
	try {
		$.ajax({
			type : "POST",
			url : CodeBuildPropertyManage.contextPath + "/func/codeBuildPropertyEditManage!ajaxSave.do",
			data : JSON.stringify({
				"input" : obj
			}),
			datatype : "json",
			contentType : "application/json;charset=UTF-8",
			success : function(result) {
				try {
					if (result.success) {
						if (result.operaCode == 1) {
							CodeBuildPropertyManage.ajaxQuery(0);
						} else if (result.operaCode == 2) {
							CodeBuildPropertyManage.ajaxQuery($("#pageIndex").val());
						}
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
				}
			},
			error : function() {
			}
		});
	} catch (e) {
	}
};

CodeBuildPropertyManage.ajaxDelete = function(buildPropertyId) {
	try {
		$.ajax({
			type : "POST",
			url : CodeBuildPropertyManage.contextPath + "/func/codeBuildPropertyEditManage!ajaxDelete.do",
			data : {
				"buildPropertyId" : buildPropertyId,
				"buildId" : CodeBuildPropertyManage.currentBuildId,
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						CodeBuildPropertyManage.ajaxQuery($("#pageIndex").val());
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
				}
			},
			error : function() {
			}
		});
	} catch (e) {
	}
};

CodeBuildPropertyManage.ajaxImport = function() {
	var buildId = CodeBuildPropertyManage.currentBuildId;
	var srcBuildId = $("#srcBuildId").val();
	try {
		$.ajax({
			type : "POST",
			url : CodeBuildPropertyManage.contextPath + "/func/codeBuildPropertyEditManage!ajaxImport.do",
			data : JSON.stringify({
				"buildId" : buildId,
				"srcBuildId" : srcBuildId
			}),
			datatype : "json",
			contentType : "application/json;charset=UTF-8",
			success : function(result) {
				try {
					if (result.success) {
						alert("导入成功!");
						CodeBuildPropertyManage.ajaxQuery($("#pageIndex").val());
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
				}
			},
			error : function() {
			}
		});
	} catch (e) {
	}
};

CodeBuildPropertyManage.operationFormatter = function(row, cell, value, columnDef, dataContext) {
	var html = "";
	var item = CodeBuildPropertyManage.gridData[row];
	if (item.changed) {
		html += "<input row='" + row + "' class='commitRow' type='button' value = '保存' /> ";
	}
	html += "<input row='" + row + "'  class='deleteRow' type='button' value = '删除' /> ";
	return html;
}

CodeBuildPropertyManage.initGrid = function() {
	var columns = [ {
		id : "buildPropertyId",
		name : "属性标识",
		field : "buildPropertyId",
		width : 15
	}, {
		id : "buildId",
		name : "构建标识",
		field : "buildId",
		width : 8
	}, {
		id : "buildPropertyName",
		name : "属性名称",
		field : "buildPropertyName",
		editor : Slick.Editors.Text,
		width : 45
	}, {
		id : "buildPropertyValue",
		name : "属性值",
		field : "buildPropertyValue",
		editor : Slick.Editors.Text,
		width : 100
	}, {
		id : "buildPropertyDesc",
		name : "属性描述",
		field : "buildPropertyDesc",
		editor : Slick.Editors.Text,
		width : 20
	}, {
		id : "operation",
		name : "操作",
		formatter : CodeBuildPropertyManage.operationFormatter
	} ];

	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	CodeBuildPropertyManage.grid = new Slick.Grid("#myGrid", [], columns, options);
	CodeBuildPropertyManage.grid.autosizeColumns();

	CodeBuildPropertyManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		CodeBuildPropertyManage.grid.invalidateRow(CodeBuildPropertyManage.gridData.length);
		CodeBuildPropertyManage.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		CodeBuildPropertyManage.grid.updateRowCount();
		CodeBuildPropertyManage.grid.render();
	});

	CodeBuildPropertyManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		CodeBuildPropertyManage.grid.updateRow(args.row);
	});
}
CodeBuildPropertyManage.initPage = function(buildId) {
	PageUtil = new TopdeepUtil.pageUtil(null, CodeBuildPropertyManage.ajaxQuery, "");
	CodeBuildPropertyManage.currentBuildId = buildId;
	CodeBuildPropertyManage.initGrid();
	PageUtil.initPage();
	CodeBuildPropertyManage.ajaxQuery(0);
	$(document).on("click", ".commitRow", function() {
		var row = $(this).attr("row");
		var item = CodeBuildPropertyManage.gridData[row];
		CodeBuildPropertyManage.ajaxSave(item);
		return false;
	});
	$(document).on("click", ".deleteRow", function() {
		var row = $(this).attr("row");
		var item = CodeBuildPropertyManage.gridData[row];
		if (window.confirm("是否确认删除?")) {
			CodeBuildPropertyManage.ajaxDelete(item.buildPropertyId);
		}
		return false;
	});
};
