package cn.topdeep.projgroup.entity.request;

import cn.topdeep.projgroup.entity.db.CodeBuildProperty;

public class CodeBuildPropertyEditRequest extends PageRequest {
	
	private Integer buildId;
	private Integer buildPropertyId;
	private Integer srcBuildId;
	private CodeBuildProperty input;

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

	public Integer getSrcBuildId() {
		return srcBuildId;
	}

	public void setSrcBuildId(Integer srcBuildId) {
		this.srcBuildId = srcBuildId;
	}

	public CodeBuildProperty getInput() {
		return input;
	}

	public void setInput(CodeBuildProperty input) {
		this.input = input;
	}


}
