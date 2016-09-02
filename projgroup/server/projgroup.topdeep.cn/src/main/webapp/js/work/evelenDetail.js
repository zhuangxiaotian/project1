var EvelenDetail = {};
EvelenDetail.grid;

EvelenDetail.contextPath = contextPath;
EvelenDetail.gridData = [];

EvelenDetail.ajaxQuery = function() {
	var selMonth = $("#selMonth").val();
	var selYear = $("#selYear").val();
	var queryMonth = selYear + selMonth;
	try {
		$.ajax({
			type : "POST",
			url : EvelenDetail.contextPath + "/work/evelenDetail!ajaxQuery.do",
			data : {
				"queryMonth" : queryMonth
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						EvelenDetail.gridData = result.detailList;
						EvelenDetail.grid.setData(EvelenDetail.gridData);
						EvelenDetail.grid.render();
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

EvelenDetail.initPage = function() {
	EvelenDetail.initGrid();
	var nowdate = new Date();
	var y = nowdate.getFullYear();
	var m = nowdate.getMonth() + 1;
	var defaultMonth = (m < 10 ? "0" + m : m);
	for (var i = 0; i < 9; i++) {
		var sel = document.getElementById("selYear");
		sel.options.add(new Option(y, y));
		y--;
	}
	for (var j = 1; j < 13; j++) {
		var mon = document.getElementById("selMonth");
		mon.options.add(new Option(j, j < 10 ? "0" + j : j));
	}
	var optElements = document.getElementById("selMonth").children;
	for ( var index in optElements) {
		if (optElements[index].value == m) {
			optElements[index].selected = "selected";
			return;
		}
	}
	EvelenDetail.ajaxQuery();

};

EvelenDetail.initGrid = function() {
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
		formatter : EvelenDetail.formatDate
	}, {
		id : "modifyTime",
		name : "修改时间",
		field : "modifyTime",
		width : 50,
		formatter : EvelenDetail.formatDateTime
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	EvelenDetail.grid = new Slick.Grid("#myGrid", [], columns, options);
	EvelenDetail.grid.autosizeColumns();

	EvelenDetail.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		EvelenDetail.grid.invalidateRow(EvelenDetail.gridData.length);
		EvelenDetail.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		EvelenDetail.grid.updateRowCount();
		EvelenDetail.grid.render();
	});

	EvelenDetail.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		EvelenDetail.grid.updateRow(args.row);
	});
}

EvelenDetail.formatDate = function(row, cell, value, columnDef, dataContext) {
	if (value == undefined) {
		return "";
	}
	var value = ProjGroup.formatDate(new Date(value), "yyyy-MM-dd");
	return value;
}

EvelenDetail.formatDateTime = function(row, cell, value, columnDef, dataContext) {
	if (value == undefined) {
		return "";
	}
	var value = ProjGroup.formatDate(new Date(value), "yyyy-MM-dd hh:mm:ss");
	return value;
}