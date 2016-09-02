var FuncProcedureManage = {};
// ProjectList.data = null;
// 路径
FuncProcedureManage.gridView = null;
FuncProcedureManage.maxId = 100000000;
FuncProcedureManage.contextPath = contextPath;
FuncProcedureManage.funcProjectId = null;
FuncProcedureManage.currentProcedureId = null;
FuncProcedureManage.grid = null;
FuncProcedureManage.gridData = [];
FuncProcedureManage.paramGrid = null;
FuncProcedureManage.paramGridView = null;
FuncProcedureManage.paramGridData = [];

FuncProcedureManage.formatFuncId = function(row, cell, value, columnDef, dataContext) {
	var item = FuncProcedureManage.gridView.getItemById(dataContext.funcProcedureId);
	var ret = "";
	if (value) {
		ret += "<input data_id='" + item.funcProcedureId + "' type='button' class='editParam btn btn-default' row='" + row + "' value='" + value + "'/> ";
	}
	return ret;
};

FuncProcedureManage.addOperateButton = function(row, cell, value, columnDef, dataContext) {
	var item = FuncProcedureManage.gridView.getItemById(dataContext.funcProcedureId);
	var ret = "";
	if (item.changed) {
		ret += "<input data_id='" + item.funcProcedureId + "'  type='button' class='rowCommitBtn btn btn-default' row='" + row + "' value='保存'/> ";
	}
	if (!item.isNew) {
		ret += "<input data_id='" + item.funcProcedureId + "' type='button' class='rowRemoveBtn btn btn-default'  row='" + row + "' value='删除'/>";
	}
	return ret;
};

FuncProcedureManage.addParamOperateButton = function(row, cell, value, columnDef, dataContext) {
	var item = FuncProcedureManage.paramGridView.getItemById(dataContext.paramId);
	var ret = "";
	if (item.changed) {
		ret += "<input type='button'  data_id='" + item.paramId + "' class='rowCommitParamBtn btn btn-default' row='" + row + "' value='保存'/> ";
	}
	if (!item.isNew) {
		if (item.deleted == "1") {
			ret += "<input type='button'  data_id='" + item.paramId + "' class='rowRestoreParamBtn btn btn-default'  row='" + row + "' value='恢复'/>";
		} else {
			ret += "<input type='button'  data_id='" + item.paramId + "' class='rowRemoveParamBtn btn btn-default'  row='" + row + "' value='删除'/>";
		}
		ret += " <input type='button'  data_id='" + item.paramId + "' class='rowCopyParamBtn btn btn-default'  row='" + row + "' value='复制'/>";
	}
	return ret;
};

FuncProcedureManage.removeRow = function(dataItem) {
	try {
		$.ajax({
			type : "POST",
			url : FuncProcedureManage.contextPath + "/func/FuncProcedureManage!ajaxRemove.do",
			data : {
				funcProcedureId : dataItem.funcProcedureId
			},
			datatype : "json",
			contentType : ProjGroup.contentType,
			success : function(result) {
				try {
					if (result.success) {
						FuncProcedureManage.gridView.deleteItem(dataItem.funcProcedureId);
						alert("操作成功!");
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
		alert(e.message);
	}

}

FuncProcedureManage.commitRow = function(dataItem) {
	dataItem.funcProjectId = FuncProcedureManage.funcProjectId;
	try {
		$.ajax({
			type : "POST",
			url : FuncProcedureManage.contextPath + "/func/FuncProcedureManage!ajaxSave.do",
			data : JSON.stringify(dataItem),
			datatype : "json",
			contentType : ProjGroup.jsonContentType,
			success : function(result) {
				try {
					if (result.success) {
						if (dataItem.isNew) {
							var idx = FuncProcedureManage.gridView.getIdxById(dataItem.funcProcedureId);
							FuncProcedureManage.gridView.deleteItem(dataItem.funcProcedureId);
							FuncProcedureManage.gridView.insertItem(idx, result.output);
						} else {
							dataItem.funcProcedureId = result.output.funcProcedureId;
							dataItem.changed = false;
							dataItem.isNew = false;
							FuncProcedureManage.gridView.updateItem(dataItem.funcProcedureId, dataItem);
						}
						alert("操作成功!");

					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
		alert(e.message);
	}

};

FuncProcedureManage.ajaxQuery = function() {
	try {
		$.ajax({
			type : "POST",
			url : FuncProcedureManage.contextPath + "/func/FuncProcedureManage!ajaxQuery.do",
			data : {
				funcProjectId : FuncProcedureManage.funcProjectId
			},
			datatype : "json",
			contentType : ProjGroup.contentType,
			success : function(result) {
				try {
					if (result.success) {
						FuncProcedureManage.gridData = result.procedureList;
						FuncProcedureManage.grid.setColumns(FuncProcedureManage.getGridColumns());
						FuncProcedureManage.grid.autosizeColumns();
						FuncProcedureManage.gridView.beginUpdate();
						FuncProcedureManage.gridView.setItems(FuncProcedureManage.gridData, "funcProcedureId");
						FuncProcedureManage.gridView.setFilter(FuncProcedureManage.gridViewFilter);
						FuncProcedureManage.gridView.endUpdate();
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
	}
};

FuncProcedureManage.ajaxQueryParams = function(funcProcedureId) {
	try {
		$.ajax({
			type : "POST",
			url : FuncProcedureManage.contextPath + "/func/FuncProcedureManage!ajaxParamsQuery.do",
			data : {
				"funcProcedureId" : funcProcedureId,
				"queryDeleteParams" : $("#queryDeleteParams").val()
			},
			datatype : "json",
			contentType : ProjGroup.contentType,
			success : function(result) {
				try {
					if (result.success) {
						FuncProcedureManage.paramGridData = result.paramList;
						FuncProcedureManage.paramGrid.setColumns(FuncProcedureManage.getParamGridColumns());
						FuncProcedureManage.paramGrid.autosizeColumns();
						FuncProcedureManage.paramGridView.beginUpdate();
						FuncProcedureManage.paramGridView.setItems(FuncProcedureManage.paramGridData, "paramId");
						FuncProcedureManage.paramGridView.endUpdate();
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
		alert(e.message);
	}
};
FuncProcedureManage.getParamGridColumns = function() {
	var columns = [];
	columns.push({
		id : "paramId",
		name : "标识",
		field : "paramId"
	});
	columns.push({
		id : "paramCode",
		name : "参数代码",
		field : "paramCode",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramName",
		name : "参数名称",
		field : "paramName",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramDirection",
		name : "参数方向",
		field : "paramDirection",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramCategory",
		name : "参数类型",
		field : "paramCategory",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramComment",
		name : "参数说明",
		field : "paramComment",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "parentParamId",
		name : "父参数标识",
		field : "parentParamId",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramDataType",
		name : "数据类型",
		field : "paramDataType",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramDataLength",
		name : "类型长度",
		field : "paramDataLength",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramDataDecimal",
		name : "小数长度",
		field : "paramDataDecimal",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramDataNotNull",
		name : "数据非空",
		field : "paramDataNotNull",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramDataDefaultValue",
		name : "默认值",
		field : "paramDataDefaultValue",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "paramAllowModify",
		name : "允许修改",
		field : "paramAllowModify",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "implInterface",
		name : "实现接口",
		field : "implInterface",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "pub0",
		name : "pub0",
		field : "pub0",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "pub1",
		name : "pub1",
		field : "pub1",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "operate",
		name : "操作",
		field : "operate",
		formatter : FuncProcedureManage.addParamOperateButton
	});
	return columns;
}

FuncProcedureManage.initParamGrid = function() {
	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};
	FuncProcedureManage.paramGridView = new Slick.Data.DataView({
		inlineFilters : false
	});

	FuncProcedureManage.paramGrid = new Slick.Grid("#myParamGrid", FuncProcedureManage.paramGridView, FuncProcedureManage.getParamGridColumns(), options);
	FuncProcedureManage.paramGrid.autosizeColumns();
	FuncProcedureManage.paramGrid.registerPlugin(new Slick.AutoTooltips());

	FuncProcedureManage.paramGrid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		FuncProcedureManage.paramGridView.updateItem(args.item.paramId, args.item);
	});

	FuncProcedureManage.paramGrid.onAddNewRow.subscribe(function(e, args) {
		FuncProcedureManage.maxId = FuncProcedureManage.maxId + 1;
		var item = {
			"paramId" : FuncProcedureManage.maxId,
			"paramCode" : "",
			"paramName" : "",
			"paramDirection" : "",
			"paramCategory" : "",
			"paramComment" : "",
			"parentParamId" : "",
			"paramDataType" : "",
			"paramDataLength" : "",
			"paramDataDecimal" : "",
			"paramDataNotNull" : "",
			"paramDataDefaultValue" : "",
			"paramAllowModify" : "",
			"implInterface" : "",
			"pub0" : "",
			"pub1" : "",
			"changed" : true,
			"isNew" : true
		};
		$.extend(item, args.item);
		FuncProcedureManage.paramGridView.addItem(item);
	});

	FuncProcedureManage.paramGridView.onRowCountChanged.subscribe(function(e, args) {
		FuncProcedureManage.paramGrid.updateRowCount();
		FuncProcedureManage.paramGrid.render();
	});
	FuncProcedureManage.paramGridView.onRowsChanged.subscribe(function(e, args) {
		FuncProcedureManage.paramGrid.invalidateRows(args.rows);
		FuncProcedureManage.paramGrid.render();
	});
}
FuncProcedureManage.getGridColumns = function() {
	var columns = [];
	columns.push({
		id : "funcProcedureId",
		name : "标识",
		field : "funcProcedureId",
		width : 50,
		formatter : FuncProcedureManage.formatFuncId
	});
	columns.push({
		id : "procCode",
		name : "函数代码",
		field : "procCode",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "procName",
		name : "函数名称",
		field : "procName",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "funcCategory",
		name : "函数分类",
		field : "funcCategory",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "procComment",
		name : "备注",
		field : "procComment",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "procVersion",
		name : "版本",
		field : "procVersion",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "funcCode",
		name : "功能代码",
		field : "funcCode",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "procType",
		name : "类型",
		field : "procType",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "cacheTime",
		name : "缓存时间",
		field : "cacheTime",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "funcInputInterface",
		name : "输入接口",
		field : "funcInputInterface",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "funcOutputInterface",
		name : "输出接口",
		field : "funcOutputInterface",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "pub0",
		name : "pub0",
		field : "pub0",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "pub1",
		name : "pub1",
		field : "pub1",
		editor : Slick.Editors.Text
	});
	columns.push({
		id : "operate",
		name : "操作",
		field : "operate",
		formatter : FuncProcedureManage.addOperateButton
	});
	return columns;
}

FuncProcedureManage.initGrid = function() {
	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};
	FuncProcedureManage.gridView = new Slick.Data.DataView({
		inlineFilters : true
	});

	FuncProcedureManage.grid = new Slick.Grid("#myGrid", FuncProcedureManage.gridView, FuncProcedureManage.getGridColumns(), options);
	FuncProcedureManage.grid.autosizeColumns();

	FuncProcedureManage.grid.registerPlugin(new Slick.AutoTooltips());

	FuncProcedureManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		FuncProcedureManage.gridView.updateItem(args.item.funcProcedureId, args.item);
	});

	FuncProcedureManage.grid.onAddNewRow.subscribe(function(e, args) {
		FuncProcedureManage.maxId = FuncProcedureManage.maxId + 1;
		var item = {
			"funcProcedureId" : FuncProcedureManage.maxId,
			"procCode" : "",
			"procName" : "",
			"funcCategory" : "",
			"procComment" : "",
			"procVersion" : "",
			"funcCode" : "",
			"procType" : "",
			"cacheTime" : "",
			"funcInputInterface" : "",
			"funcOutputInterface" : "",
			"pub0" : "",
			"pub1" : "",
			"operate" : "",
			"changed" : true,
			"isNew" : true
		};
		$.extend(item, args.item);
		FuncProcedureManage.gridView.addItem(item);
	});

	FuncProcedureManage.grid.onClick.subscribe(function(e, args) {
		if ($(e.target).hasClass("toggle")) {
			var item = FuncProcedureManage.gridView.getItem(args.row);
			if (item) {
				if (!item._collapsed) {
					item._collapsed = true;
				} else {
					item._collapsed = false;
				}
				FuncProcedureManage.gridView.updateItem(item.funcProcedureId, item);
			}
			e.stopImmediatePropagation();
		}
	});

	// wire up model events to drive the grid
	FuncProcedureManage.gridView.onRowCountChanged.subscribe(function(e, args) {
		FuncProcedureManage.grid.updateRowCount();
		FuncProcedureManage.grid.render();
	});
	FuncProcedureManage.gridView.onRowsChanged.subscribe(function(e, args) {
		FuncProcedureManage.grid.invalidateRows(args.rows);
		FuncProcedureManage.grid.render();
	});
}
FuncProcedureManage.checkEditInput = function(data) {
	if (!data.procName) {
		alert("函数名称不能为空");
		return false;
	}
	return true;
}

FuncProcedureManage.initPage = function(funcProjectId) {
	FuncProcedureManage.funcProjectId = funcProjectId;
	FuncProcedureManage.initGrid();
	FuncProcedureManage.ajaxQuery();
	FuncProcedureManage.initParamGrid();
	$('#myGrid').on('click', 'input.rowCommitBtn', function() {
		var id = $(this).attr("data_id");
		var item = FuncProcedureManage.gridView.getItemById(id);
		if (FuncProcedureManage.checkEditInput(item)) {
			FuncProcedureManage.commitRow(item);
		}
	});
	$('#myGrid').on('click', 'input.rowRemoveBtn', function() {
		var id = $(this).attr("data_id");
		var item = FuncProcedureManage.gridView.getItemById(id);
		if (window.confirm("是否确认删除?")) {
			FuncProcedureManage.removeRow(item);
		}
	});

	$('#myGrid').on('click', 'input.editParam', function() {
		var id = $(this).attr("data_id");
		var dataItem = FuncProcedureManage.gridView.getItemById(id);
		FuncProcedureManage.currentProcedureId = dataItem.funcProcedureId;
		FuncProcedureManage.ajaxQueryParams(dataItem.funcProcedureId);
	});

	$('#myParamGrid').on('click', 'input.rowCommitParamBtn', function() {
		var id = $(this).attr("data_id");
		var item = FuncProcedureManage.paramGridView.getItemById(id);
		FuncProcedureManage.commitParamRow(item);
	});
	$('#myParamGrid').on('click', 'input.rowRemoveParamBtn', function() {
		var id = $(this).attr("data_id");
		var item = FuncProcedureManage.paramGridView.getItemById(id);
		FuncProcedureManage.removeParamRow(item);
	});
	$('#myParamGrid').on('click', 'input.rowRestoreParamBtn', function() {
		var id = $(this).attr("data_id");
		var item = FuncProcedureManage.paramGridView.getItemById(id);
		FuncProcedureManage.restoreParamRow(item);
	});

	$('#myParamGrid').on('click', 'input.rowCopyParamBtn', function() {
		var id = $(this).attr("data_id");
		var item = FuncProcedureManage.paramGridView.getItemById(id);
		FuncProcedureManage.copyParamRow(item);
	});
	document.getElementById("search_keyword").oninput = function() {
		FuncProcedureManage.gridView.beginUpdate();
		FuncProcedureManage.gridView.setItems(FuncProcedureManage.gridData);
		FuncProcedureManage.gridView.setFilter(FuncProcedureManage.gridViewFilter);
		FuncProcedureManage.gridView.endUpdate();
	}

};

FuncProcedureManage.commitParamRow = function(dataItem) {
	if (dataItem.isNew) {
		dataItem.funcProjectId = FuncProcedureManage.funcProjectId;
		dataItem.funcProcedureId = FuncProcedureManage.currentProcedureId;
	}
	try {
		$.ajax({
			type : "POST",
			url : FuncProcedureManage.contextPath + "/func/FuncProcedureManage!ajaxParamSave.do",
			data : JSON.stringify(dataItem),
			datatype : "json",
			contentType : ProjGroup.jsonContentType,
			success : function(result) {
				try {
					if (result.success) {
						dataItem.paramId = result.funcParamId;
						dataItem.changed = false;
						dataItem.isNew = false;
						FuncProcedureManage.paramGridView.updateItem(dataItem.paramId, dataItem);
						alert("操作成功!");
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
		alert(e.message);
	}

};

FuncProcedureManage.removeParamRow = function(dataItem) {
	try {
		$.ajax({
			type : "POST",
			url : FuncProcedureManage.contextPath + "/func/FuncProcedureManage!ajaxParamRemove.do",
			data : {
				funcParamId : dataItem.paramId
			},
			datatype : "json",
			contentType : ProjGroup.contentType,
			success : function(result) {
				try {
					if (result.success) {
						FuncProcedureManage.paramGridView.deleteItem(dataItem.paramId);
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
		alert(e.message);
	}

}

FuncProcedureManage.restoreParamRow = function(dataItem) {
	try {
		$.ajax({
			type : "POST",
			url : FuncProcedureManage.contextPath + "/func/FuncProcedureManage!ajaxParamRestore.do",
			data : {
				funcParamId : dataItem.paramId
			},
			datatype : "json",
			contentType : ProjGroup.contentType,
			success : function(result) {
				try {
					if (result.success) {
						dataItem.deleted = "0";
						FuncProcedureManage.paramGrid.invalidate();
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
		alert(e.message);
	}

}

FuncProcedureManage.copyParamRow = function(dataItem) {
	try {
		$.ajax({
			type : "POST",
			url : FuncProcedureManage.contextPath + "/func/FuncProcedureManage!ajaxParamCopy.do",
			data : {
				funcParamId : dataItem.paramId
			},
			datatype : "json",
			contentType : ProjGroup.contentType,
			success : function(result) {
				try {
					if (result.success) {
						FuncProcedureManage.paramGridView.updateItem(result.funcParam.paramId, result.funcParam);
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
		alert(e.message);
	}

}
FuncProcedureManage.gridViewFilter = function(item, args) {
	var searchkeyword = $("#search_keyword").val();
	if (searchkeyword) {
		if (item["funcProcedureId"] == searchkeyword) {
			return true;
		} else if (item["procCode"].indexOf(searchkeyword) >= 0) {
			return true;
		} else if (item["procName"].indexOf(searchkeyword) >= 0) {
			return true;
		} else if (item["funcCode"].indexOf(searchkeyword) >= 0) {
			return true;
		}
		return false;
	} else {
		return true;
	}
}
