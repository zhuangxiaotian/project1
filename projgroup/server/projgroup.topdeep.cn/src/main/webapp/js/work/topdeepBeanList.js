var TopdeepBeanList = {};
TopdeepBeanList.grid;

TopdeepBeanList.contextPath = contextPath;
TopdeepBeanList.gridData = [];

TopdeepBeanList.ajaxQuery = function() {
	var queryType = $("#queryType").val();
	var forceRefresh = $("#forceRefresh")[0].checked;
	try {
		$.ajax({
			type : "POST",
			url : TopdeepBeanList.contextPath + "/home/index!ajaxQueryTopdeepBeanList.do",
			data : {
				"queryType" : queryType,
				"forceRefresh" : forceRefresh
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						TopdeepBeanList.gridData = result.eChartData.seriesList;
						TopdeepBeanList.grid.setData(TopdeepBeanList.gridData);
						TopdeepBeanList.grid.render();
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

TopdeepBeanList.formatData = function(row, cell, value, columnDef, dataContext) {
	var item;
	item = TopdeepBeanList.gridData[row].data[cell - 1];
	return item;
}

TopdeepBeanList.initGrid = function() {
	var columns = [];

	columns.push({
		id : "name",
		name : "姓名",
		field : "name",
		width : 45
	});

	for (i = 1; i <= 31; i++) {
		listDay = (i < 10 ? "0" + i : i.toString());
		columns.push({
			id : "data",
			name : listDay,
			field : "data",
			width : 36,
			formatter : TopdeepBeanList.formatData
		});
	}

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	TopdeepBeanList.grid = new Slick.Grid("#myGrid", [], columns, options);
	TopdeepBeanList.grid.autosizeColumns();

}

TopdeepBeanList.initPage = function() {
	TopdeepBeanList.initGrid();
	TopdeepBeanList.ajaxQuery();
	$("#queryButton").click(function() {
		TopdeepBeanList.ajaxQuery();
	});
}