package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.Privilege;
import cn.topdeep.projgroup.entity.db.CodeBuild;
import cn.topdeep.projgroup.entity.db.FuncProject;

public class CodeBuildEdit extends BaseAction{
	private CodeBuild codeBuild;
	private int buildId;
	
	public CodeBuild getCodeBuild() throws SQLException, CacheException {
		if(codeBuild == null && buildId > 0){
			codeBuild = projectBiz.codeBuildSelectByPrimaryKey(buildId);
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
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		return INPUT;
	}
	
	public String save() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		if(buildId > 0){
			projectBiz.codeBuildUpdate(codeBuild);
		}else{
			projectBiz.codeBuildInsert(codeBuild);
		}
		redirectUrl = urlManage.getCodeBuildListUrl();
		return REDIRECT;
	}
	
}
