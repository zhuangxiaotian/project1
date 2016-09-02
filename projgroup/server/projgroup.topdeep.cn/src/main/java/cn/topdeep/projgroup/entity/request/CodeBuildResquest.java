package cn.topdeep.projgroup.entity.request;

import cn.topdeep.projgroup.entity.db.CodeBuild;

public class CodeBuildResquest extends PageRequest {
	private Integer parentBuildId;
	private CodeBuild input;
	public Integer getParentBuildId() {
		return parentBuildId;
	}

	public void setParentBuildId(Integer parentBuildId) {
		this.parentBuildId = parentBuildId;
	}
	private CodeBuild codeBuild;

	public CodeBuild getCodeBuild() {
		return codeBuild;
	}

	public void setCodeBuild(CodeBuild codeBuild) {
		this.codeBuild = codeBuild;
	}

	public CodeBuild getInput() {
		return input;
	}

	public void setInput(CodeBuild input) {
		this.input = input;
	}
	
}
