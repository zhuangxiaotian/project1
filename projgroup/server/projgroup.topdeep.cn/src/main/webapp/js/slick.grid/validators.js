var slickgrid = {};

slickgrid.options = {
		    editable: true,
		    enableAddRow: false,
		    enableCellNavigation: true,
		    asyncEditorLoading: false,
		    autoEdit: false,
		    autoHeight:false,
		    enableColumnReorder: false,
		    headerRowHeight: 45,
		    rowHeight: 40,
		    fullWidthRows: false,
		    selectedCellCssClass: "selected"
};

slickgrid.requiredFieldValidator=function(value){
	
	 if (value == null || value == undefined || !value.length) {
	      return {valid: false, msg: "不能为空"};
	    } else {
	      return {valid: true, msg: null};
	    }
}