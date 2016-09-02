package cn.topdeep.projgroup.entity.response;

import java.util.List;

import cn.topdeep.projgroup.entity.db.CodeBuildProperty;
import cn.topdeep.projgroup.entity.db.FuncProcedure;

public class CodeBuildPropertyEditResponse extends PageResponse {

	private List<CodeBuildProperty> codeBuildPropertyView;
	private Integer buildId;
	private Integer buildPropertyId;
	private CodeBuildProperty output;
	private int totalPages;
	private List<FuncProcedure> procList;
	private Integer operaCode;
	
	public List<CodeBuildProperty> getCodeBuildPropertyView() {
		return codeBuildPropertyView;
	}

	public void setCodeBuildPropertyView(List<CodeBuildProperty> codeBuildPropertyView) {
		this.codeBuildPropertyView = codeBuildPropertyView;
	}

	public Integer getBuildId() {
		return buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

	public Integer getBuildPropertyId() {
		return buildPropertyId;
	}

	public void setBuildPropertyId(Integer buildPropertyId) {
		this.buildPropertyId = buildPropertyId;
	}

	public CodeBuildProperty getOutput() {
		return output;
	}

	public void setOutput(CodeBuildProperty output) {
		this.output = output;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
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