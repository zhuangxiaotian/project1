var EvelenStatistical = {};
// EvelenStatistical.data = null;
// 路径
EvelenStatistical.grid;

EvelenStatistical.contextPath = contextPath;
EvelenStatistical.gridData = [];

EvelenStatistical.ajaxQuery = function() {
	var selMonth =$("#selMonth").val()
	var selYear =$("#selYear").val();
	var queryMonth = selYear + selMonth;
	try {
		$.ajax({
			type : "POST",
			url : EvelenStatistical.contextPath + "/work/evelenStatistical!ajaxQuery.do",
			data : {"queryMonth":queryMonth},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						EvelenStatistical.gridData = result.list;
						EvelenStatistical.grid.setData(EvelenStatistical.gridData);
						EvelenStatistical.grid.render();
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

EvelenStatistical.initGrid = function() {
	var columns = [ {
		id : "realName",
		name : "姓名",
		field : "realName",
		width : 50
	}, {
		id : "workCount",
		name : "次数",
		field : "workCount",
		width : 50
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	EvelenStatistical.grid = new Slick.Grid("#myGrid", [], columns, options);
	EvelenStatistical.grid.autosizeColumns();

	EvelenStatistical.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		EvelenStatistical.grid.invalidateRow(EvelenStatistical.gridData.length);
		EvelenStatistical.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		EvelenStatistical.grid.updateRowCount();
		EvelenStatistical.grid.render();
	});

	EvelenStatistical.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		EvelenStatistical.grid.updateRow(args.row);
	});
}

EvelenStatistical.initPage = function() {
	EvelenStatistical.initGrid();
	var nowdate = new Date();
	var y = nowdate.getFullYear();
	var m = nowdate.getMonth() + 1;
	var defaultMonth =(m<10 ? "0" + m : m);
	for(var i = 0; i < 9; i++){
		var sel= document.getElementById("selYear"); 
		sel.options.add(new Option(y,y));
		y--;}
		for(var j = 1; j <13; j++){
			var mon= document.getElementById("selMonth"); 
			mon.options.add(new Option(j,j<10 ? "0" + j : j));
		}	
		var optElements=document.getElementById("selMonth").children;
		for(var index in optElements){
			if(optElements[index].value==m){
				optElements[index].selected="selected";
				return;
			}
		}
		EvelenStatistical.ajaxQuery();
}