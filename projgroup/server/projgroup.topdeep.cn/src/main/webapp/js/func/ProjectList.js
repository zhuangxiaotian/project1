var ProjectList = {};
// ProjectList.data = null;
// 路径
var grid;

ProjectList.contextPath = contextPath;
ProjectList.gridData = [];

ProjectList.addOperateButton = function(row, cell, value, columnDef, dataContext) {
	var item = ProjectList.gridData[row];
	var ret = "";
	if (item.changed) {
		ret += "<input type='button' class='rowCommitBtn' row='" + row + "' value='保存'/>";
	} else {
		ret += "<a target='_blank' href='" + ProjectList.contextPath + "/" + "work/FuncProcedureList.action?funcProjectId=" + item.funcProjectId + "' row='"
				+ row + "'>函数</a>";
		ret += " <a target='_blank' href='" + ProjectList.contextPath + "/" + "func/FuncProcedureManage.do?funcProjectId=" + item.funcProjectId + "' row='"
				+ row + "'>函数(新)</a>";
		ret += " <a target='_blank' href='" + ProjectList.contextPath + "/" + "work/FuncImport.action?funcProjectId=" + item.funcProjectId + "' row='" + row
				+ "'>数据上传</a>";
		ret += " <a   href='#' row='" + row + "' onclick = 'export1("+item.funcProjectId+")'>导出</a>";
	}
	return ret;
	// <s:a action="work/FuncProcedureList?funcProjectId=%{funcProjectId}">函数</s:a>
	// <a href="<s:property value="urlManage.getFuncImportUrl(funcProjectId)" />">数据上传</a>
};

function export1(id){
	$("#projectId").val(id);
	$("#exportForm").submit();

}

ProjectList.commitRow = function(row) {

	if (ProjectList.gridData == null) {
		alert("no data");
	}
	if (row < 0 || row >= ProjectList.gridData.length) {
		alert("row index error: " + row);
	}
	var dataItem = ProjectList.gridData[row];
	var str = dataItem.funcProjectId + ":" + dataItem.funcProjectName + ":" + dataItem.funcProjectDesc + ":" + dataItem.pub0;
	try {
		$.ajax({
			type : "POST",
			url : ProjectList.contextPath + "/func/ProjectList!ajaxSave.do",
			data : JSON.stringify(dataItem),
			datatype : "json",
			contentType : ProjGroup.jsonContentType,
			success : function(result) {
				try {
					if (result.success) {
						// alert("query finished!");
						ProjectList.gridData[row].funcProjectId = result.data.funcProjectId;
						ProjectList.gridData[row].changed = false;
						grid.updateRow(row);
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					// ProjectList.alertTipMessage(e.message);
				}
				// ProjectList.enableButton(_ObjBtn,"btn_short");
			},
			error : function() {
				// ProjectList.enableButton(_ObjBtn,"btn_short");
			}
		});
	} catch (e) {
	}

};

ProjectList.ajaxQueryProjectList = function() {
	try {
		$.ajax({
			type : "POST",
			url : ProjectList.contextPath + "/func/ProjectList!ajaxQueryProjectList.do",
			data : {},
			datatype : "json",
			contentType : ProjGroup.contentType,
			success : function(result) {
				try {
					if (result.success) {
						// alert("query finished!");
						ProjectList.gridData = result.data.list;
						grid.setData(ProjectList.gridData);
						grid.render();
					} else {
						alert(result.tipMessage);
					}
				} catch (e) {
					// ProjectList.alertTipMessage(e.message);
				}
				// ProjectList.enableButton(_ObjBtn,"btn_short");
			},
			error : function() {
				// ProjectList.enableButton(_ObjBtn,"btn_short");
			}
		});
	} catch (e) {
	}
};

ProjectList.initGrid = function() {
	var columns = [ {
		id : "funcProjectId",
		name : "标识",
		field : "funcProjectId",
		width : 50
	}, {
		id : "funcProjectDesc",
		name : "项目描述",
		field : "funcProjectDesc",
		editor : Slick.Editors.Text
	}, {
		id : "funcProjectName",
		name : "项目名称",
		field : "funcProjectName",
		editor : Slick.Editors.Text
	}, {
		id : "operate",
		name : "操作",
		field : "operate",
		formatter : ProjectList.addOperateButton
	} ];

	var options = {
		editable : true,
		enableAddRow : true,
		enableCellNavigation : true,
		asyncEditorLoading : false,
		rowHeight : 30
	};

	// var options = {
	// enableCellNavigation: true,
	// enableColumnReorder: false
	// };
	grid = new Slick.Grid("#myGrid", [], columns, options);
	grid.autosizeColumns();

	grid.onAddNewRow.subscribe(function(e, args) {
		var item = args.item;
		grid.invalidateRow(ProjectList.gridData.length);
		ProjectList.gridData.push(item);
		item.changed = true;
		item.isNew = true;
		grid.updateRowCount();
		grid.render();
	});

	grid.onCellChange.subscribe(function(e, args) {
		var item = args.item;
		item.changed = true;
		grid.updateRow(args.row);
	});
}

ProjectList.initPage = function() {
	ProjectList.initGrid();
	try {
		$('#myGrid').on('click', 'input.rowCommitBtn', function() {
			var row = $(this).attr("row");
			ProjectList.commitRow(row);
		});
		ProjectList.ajaxQueryProjectList();
	} catch (e) {
		alert(e);
	}
};

