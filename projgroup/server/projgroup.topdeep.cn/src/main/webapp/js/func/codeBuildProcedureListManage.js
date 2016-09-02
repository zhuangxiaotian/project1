var CodeBuildProcedureListManage = {};
CodeBuildProcedureListManage.contextPath = contextPath;
CodeBuildProcedureListManage.gridData = [];
CodeBuildProcedureListManage.codeBuildExecuteUrl = null;
CodeBuildProcedureListManage.currentBuildId;
CodeBuildProcedureListManage.grid;
CodeBuildProcedureListManage.rows = [];

CodeBuildProcedureListManage.ajaxQuery = function() {
	try {
		$.ajax({
			type : "POST",
			url : CodeBuildProcedureListManage.contextPath
					+ "/func/codeBuildProcedureListManage!ajaxQuery.do",
			data : {
				"buildId" : CodeBuildProcedureListManage.currentBuildId,
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						CodeBuildProcedureListManage.rows = [];
						CodeBuildProcedureListManage.gridData = result.procList;
						for(var i=0;i<CodeBuildProcedureListManage.gridData.length;i++){
							if(CodeBuildProcedureListManage.gridData[i].pub5=="1"){
								CodeBuildProcedureListManage.rows.push(i);
							}
						}
						CodeBuildProcedureListManage.grid.setSelectedRows(CodeBuildProcedureListManage.rows);
						CodeBuildProcedureListManage.grid.setData(CodeBuildProcedureListManage.gridData);
						CodeBuildProcedureListManage.grid.render();
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

CodeBuildProcedureListManage.ajaxImport = function() {
	var srcBuildId = $("#srcBuildId").val();
	try {
		$.ajax({
			type : "POST",
			url : CodeBuildProcedureListManage.contextPath
					+ "/func/codeBuildProcedureListManage!ajaxImport.do",
			data : {
				"buildId" : CodeBuildProcedureListManage.currentBuildId,
				"srcBuildId" : srcBuildId
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						alert("导入成功！");
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

CodeBuildProcedureListManage.ajaxInvertImport = function() {
	var srcBuildId = $("#srcBuildId").val();
	try {
		$.ajax({
			type : "POST",
			url : CodeBuildProcedureListManage.contextPath
					+ "/func/codeBuildProcedureListManage!ajaxInvertImport.do",
			data : {
				"buildId" : CodeBuildProcedureListManage.currentBuildId,
				"srcBuildId" : srcBuildId
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						alert("反向导入成功！");
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

CodeBuildProcedureListManage.ajaxSave = function(ids) {
	try {
		$.ajax({
			type : "POST",
			url : CodeBuildProcedureListManage.contextPath
					+ "/func/codeBuildProcedureListManage!ajaxSave.do",
			data : {
				"buildId" : CodeBuildProcedureListManage.currentBuildId,
				"selectedFuncIdsString" : ids
			},
			datatype : "json",
			success : function(result) {
				try {
					if (result.success) {
						alert("保存成功！");
						CodeBuildProcedureListManage.grid.setSelectedRows([]);
						CodeBuildProcedureListManage.ajaxQuery();
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

CodeBuildProcedureListManage.select = function(o) {
	var a = document.getElementsByName("subBox");
	for (var i = 0; i < a.length; i++) {
		a[i].checked = o.checked;
	}
}

CodeBuildProcedureListManage.initGrid = function() {
	var columnDefinition = {};
	checkboxSelector = new Slick.CheckboxSelectColumn({});
	columnDefinition = checkboxSelector.getColumnDefinition();
	var columns = [ columnDefinition, {
		id : "procVersion",
		name : "函数版本",
		field : "procVersion",
	}, {
		id : "procCode",
		name : "函数代码",
		field : "procCode",
	}, {
		id : "procName",
		name : "函数名称",
		field : "procName",
	} ];

	var options = {
		editable : true,
		enableAddRow : false,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	CodeBuildProcedureListManage.grid = new Slick.Grid("#myGrid", [], columns, options);
	CodeBuildProcedureListManage.grid.autosizeColumns();
	CodeBuildProcedureListManage.grid.setSelectionModel(new Slick.RowSelectionModel({
		selectActiveRow : false
	}));
	CodeBuildProcedureListManage.grid.registerPlugin(checkboxSelector);
	CodeBuildProcedureListManage.grid.registerPlugin(new Slick.AutoTooltips());

	CodeBuildProcedureListManage.grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		CodeBuildProcedureListManage.grid.invalidateRow(CodeBuildProcedureListManage.gridData.length);
		CodeBuildProcedureListManage.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		CodeBuildProcedureListManage.grid.updateRowCount();
		CodeBuildProcedureListManage.grid.render();
	});

	CodeBuildProcedureListManage.grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		CodeBuildProcedureListManage.grid.updateRow(args.row);
	});
}

CodeBuildProcedureListManage.initPage = function(buildId) {
	CodeBuildProcedureListManage.initGrid();
	CodeBuildProcedureListManage.currentBuildId = buildId;
	CodeBuildProcedureListManage.ajaxQuery();
	$(document).on("click", ".import", function() {
		if($("#srcBuildId").val()!=""){
		if ($(".booleanInvert").is(':checked')) {
			CodeBuildProcedureListManage.ajaxInvertImport ();
		}else if(!$(".booleanInvert").is(':checked')) {
			CodeBuildProcedureListManage.ajaxImport ();
		}}else{
			alert("请输入正确格式的build标识！");
		}
		return false;
	});
	
	$(document).on("click", ".save", function() {
		var rowIds = CodeBuildProcedureListManage.grid.getSelectedRows();
		if (window.confirm("是否确认?")) {
			var ids = '';
			for (var i = 0; i < rowIds.length; i++) {
				ids += CodeBuildProcedureListManage.gridData[rowIds[i]].funcProcedureId + ",";
			}
			CodeBuildProcedureListManage.ajaxSave(ids);
		}
            return false;
	});
};