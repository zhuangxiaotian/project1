var Index = {};

Index.grid = null;
Index.contextPath = contextPath;
Index.gridData = [];

Index.beanFormatter = function(row, cell, value, columnDef, dataContext) {
	return value.toFixed(0);
};

Index.ajaxQueryTopdeepBeanList = function() {
	var queryType = $("#queryType").val();
	try {
		$.ajax({
			type : "POST",
			url : Index.contextPath + "/home/index!ajaxQueryTopdeepBeanList.do",
			data : {
				"queryType" : queryType
			},
			datatype : "json",
			contentType : ProjGroup.contentType,
			success : function(result) {
				try {
					if (result.success) {
						// alert("query finished!");
						// Index.gridData = result.topdeepBeanChangeList;
						// Index.grid.setData(Index.gridData);
						// Index.grid.render();

						var myChart = echarts.init(document.getElementById('myChart'));
						// 指定图表的配置项和数据
						var option = {
							title : {
								text : ''
							},
							tooltip : {},
							legend : {
								selected : result.eChartData.selectedUser,
								data : result.eChartData.userList
							},
							xAxis : {
								data : result.eChartData.dateList
							},
							yAxis : [ {}, {} ],
							series : result.eChartData.seriesList
						};

						// 使用刚指定的配置项和数据显示图表。
						myChart.setOption(option);

					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					alert(e.messsage);
				}
			},
			error : function() {
			}
		});
	} catch (e) {
		alert(e.message);
	}
};

Index.initGrid = function(columnList) {
	var columns = [];
	for (var i = 0; i < columnList.length; i++) {
		var item = {};
		item.id = columnList[i].value;
		item.name = columnList[i].name;
		item.field = columnList[i].value;
		item.width = 50;
		if (i > 0) {
			item.formatter = Index.beanFormatter;
		}
		columns[columns.length] = item;
	}

	var options = {
		editable : false,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	// var options = {
	// enableCellNavigation: true,
	// enableColumnReorder: false
	// };
	Index.grid = new Slick.Grid("#myGrid", [], columns, options);
	Index.grid.autosizeColumns();

}

Index.initPage = function(columnList) {
	// Index.initGrid(columnList);
	Index.ajaxQueryTopdeepBeanList();
	$("#queryButton").click(function() {
		Index.ajaxQueryTopdeepBeanList();
	});
};
