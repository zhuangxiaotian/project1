package cn.topdeep.projgroup.entity.response;

import java.util.List;

import cn.topdeep.projgroup.entity.db.FuncProcedure;

public class CodeBuildProcedureListResponse extends BaseResponse {

	private Integer buildId;
	private List<FuncProcedure> procList;
	private Integer operaCode;

	public Integer getBuildId() {
		return buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

	public List<FuncProcedure> getProcList() {
		return procList;
	}

	public void setProcList(List<FuncProcedure> procList) {
		this.procList = procList;
	}

	public Integer getOperaCode() {
		return operaCode;
	}

	public void setOperaCode(Integer operaCode) {
		this.operaCode = operaCode;
	}
	
}