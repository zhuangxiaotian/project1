var NineStatisticalDetail = {};
NineStatisticalDetail.contextPath = contextPath;
NineStatisticalDetail.funcProjectId = null;
NineStatisticalDetail.currentProcedureId = null;
NineStatisticalDetail.grid;
NineStatisticalDetail.gridData = [];

NineStatisticalDetail.formatFuncId = function(row, cell, value, columnDef, dataContext) {
	// var item = NineStatisticalDetail.gridData[row];
	var ret = "";
	if (value) {
		ret += "<input type='button' class='editParam btn btn-default' row='" + row + "' value='" + value + "'/> ";
	}
	return ret;
};

NineStatisticalDetail.ajaxQuery = function() {
	var year = $("#selYear").val();
	var month = $("#selMonth").val();
	var queryMonth = year + month;
	try {
		$.ajax({
			type : "POST",
			url : NineStatisticalDetail.contextPath + "/work/nineStatisticalDetail!ajaxQuery.do",
			data : {
				"queryMonth" : queryMonth
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						// alert("query finished!");
						NineStatisticalDetail.gridData = result.data.list;
						NineStatisticalDetail.grid.setData(NineStatisticalDetail.gridData);
						NineStatisticalDetail.grid.render();
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

NineStatisticalDetail.initGrid = function() {
	var columns = [ {
		id : "realName",
		name : "姓名",
		field : "realName",
		width : 50
	}, {
		id : "workDay",
		name : "工作日",
		field : "workDay",
		width : 50,
		formatter : NineStatisticalDetail.formatDate
	}, {
		id : "modifyTime",
		name : "修改时间",
		field : "modifyTime",
		width : 50,
		formatter : NineStatisticalDetail.formatDateTime
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	NineStatisticalDetail.grid = new Slick.Grid("#myGrid", [], columns, options);
	NineStatisticalDetail.grid.autosizeColumns();

	NineStatisticalDetail.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		NineStatisticalDetail.grid.invalidateRow(NineStatisticalDetail.gridData.length);
		NineStatisticalDetail.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		NineStatisticalDetail.grid.updateRowCount();
		NineStatisticalDetail.grid.render();
	});

	NineStatisticalDetail.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		NineStatisticalDetail.grid.updateRow(args.row);
	});
}

NineStatisticalDetail.initPage = function() {
	NineStatisticalDetail.initGrid();
	var date = new Date();
	var year = date.getFullYear();
	var month = date.getMonth() + 1;
	for (var i = 0; i < 10; i++) {
		var sel = document.getElementById("selYear");
		sel.options.add(new Option(year, year));
		year--;
	}
	for (var j = 1; j < 13; j++) {
		var month = document.getElementById("selMonth");
		month.options.add(new Option(j, j < 10 ? "0" + j : j));
	}
	NineStatisticalDetail.ajaxQuery();
};

NineStatisticalDetail.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == undefined) {
		return "";
	}
	var value = ProjGroup.formatDate(new Date(value), "yyyy-MM-dd");
	return value;
}

NineStatisticalDetail.formatDateTime = function(row, cell, value, columnDef, dataContext) {
	if (value == undefined) {
		return "";
	}
	var value = ProjGroup.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
	return value;
}
