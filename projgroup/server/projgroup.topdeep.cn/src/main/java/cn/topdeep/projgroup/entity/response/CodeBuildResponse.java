package cn.topdeep.projgroup.entity.response;

import java.util.List;

import cn.topdeep.projgroup.entity.db.CodeBuild;

public class CodeBuildResponse extends PageResponse {

	private static final long serialVersionUID = 1L;

	public CodeBuild output;

	public List<CodeBuild> codeBuildList;

	public List<CodeBuild> getCodeBuildList() {
		return codeBuildList;
	}

	public void setCodeBuildList(List<CodeBuild> codeBuildList) {
		this.codeBuildList = codeBuildList;
	}

	public CodeBuild getOutput() {
		return output;
	}

	public void setOutput(CodeBuild output) {
		this.output = output;
	}

}
