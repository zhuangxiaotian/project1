package cn.topdeep.projgroup.entity.request;

public class CodeBuildProcedureListRequest extends BaseRequest {
	
	private Integer buildId;
	private Integer srcBuildId;
	private Integer invertImport;
	private String selectedFuncIdsString;

	public Integer getBuildId() {
		return buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

	public Integer getSrcBuildId() {
		return srcBuildId;
	}

	public void setSrcBuildId(Integer srcBuildId) {
		this.srcBuildId = srcBuildId;
	}

	public Integer getInvertImport() {
		return invertImport;
	}

	public void setInvertImport(Integer invertImport) {
		this.invertImport = invertImport;
	}

	public String getSelectedFuncIdsString() {
		return selectedFuncIdsString;
	}

	public void setSelectedFuncIdsString(String selectedFuncIdsString) {
		this.selectedFuncIdsString = selectedFuncIdsString;
	}


}
