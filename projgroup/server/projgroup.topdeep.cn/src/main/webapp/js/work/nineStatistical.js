var NineStatistical = {};
// NineStatistical.data = null;
// 路径
NineStatistical.contextPath = contextPath;
NineStatistical.funcProjectId = null;
NineStatistical.currentProcedureId = null;
NineStatistical.grid;
NineStatistical.gridData = [];

NineStatistical.formatFuncId = function(row, cell, value, columnDef, dataContext) {
	// var item = NineStatistical.gridData[row];
	var ret = "";
	if (value) {
		ret += "<input type='button' class='editParam btn btn-default' row='" + row + "' value='" + value + "'/> ";
	}
	return ret;
};

NineStatistical.ajaxQuery = function() {
	var year = $("#selYear").val();
	var month = $("#selMonth").val();
	var queryMonth = year + month;
	try {
		$.ajax({
			type : "POST",
			url : NineStatistical.contextPath + "/work/nineStatistical!ajaxQuery.do",
			data : {
				"queryMonth" : queryMonth
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						// alert("query finished!");
						NineStatistical.gridData = result.data.list;
						NineStatistical.grid.setData(NineStatistical.gridData);
						NineStatistical.grid.render();
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.message);
				}
				// NineStatistical.enableButton(_ObjBtn,"btn_short");
			},
			error : function() {
				// NineStatistical.enableButton(_ObjBtn,"btn_short");
			}
		});
	} catch (e) {
	}
};

NineStatistical.initGrid = function() {
	var columns = [ {
		id : "realName",
		name : "姓名",
		field : "realName",
		width : 50
	}, {
		id : "workCount",
		name : "总计",
		field : "workCount",
		width : 50,
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	NineStatistical.grid = new Slick.Grid("#myGrid", [], columns, options);
	NineStatistical.grid.autosizeColumns();

	NineStatistical.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		NineStatistical.grid.invalidateRow(NineStatistical.gridData.length);
		NineStatistical.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		NineStatistical.grid.updateRowCount();
		NineStatistical.grid.render();
	});

	NineStatistical.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		NineStatistical.grid.updateRow(args.row);
	});
}

NineStatistical.initPage = function() {
	NineStatistical.initGrid();
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
	NineStatistical.ajaxQuery();
}

NineStatistical.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == undefined) {
		return "";
	}
	var value = ProjGroup.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
	return value;
}
