package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.CodeBuild;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncProject;

public class CodeBuildEdit extends BaseAction{
	private CodeBuild codeBuild;
	private int buildId;
	
	public CodeBuild getCodeBuild() throws DbException, SQLException {
		if(codeBuild == null && buildId > 0){
			codeBuild = projectBiz.codeBuildSelectByBuildId(buildId);
		}
		return codeBuild;
	}

	public int getBuildId() {
		return buildId;
	}

	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}

	public void setCodeBuild(CodeBuild codeBuild) {
		this.codeBuild = codeBuild;
	}

	public String execute(){
		return INPUT;
	}
	
	public String save() throws Exception{
		if(buildId > 0){
			projectBiz.codeBuildUpdate(codeBuild);
		}else{
			projectBiz.codeBuildInsert(codeBuild);
		}
		redirectUrl = urlManage.getCodeBuildListUrl();
		return REDIRECT;
	}
	
}
