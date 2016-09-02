package cn.topdeep.projgroup.ftl;

import java.util.ArrayList;
import java.util.List;

import cn.topdeep.projgroup.entity.db.FuncParams;
import cn.topdeep.projgroup.entity.db.FuncProcedure;

public class FuncProcedureExport {
	private FuncProcedure fpd;
	private List<FuncParams> funcParamlist = new ArrayList<FuncParams>();

	public FuncProcedure getFpd() {
		return fpd;
	}

	public void setFpd(FuncProcedure fpd) {
		this.fpd = fpd;
	}

	public List<FuncParams> getFuncParamlist() {
		return funcParamlist;
	}

	public void setFuncParamlist(List<FuncParams> funcParamlist) {
		this.funcParamlist = funcParamlist;
	}

}
