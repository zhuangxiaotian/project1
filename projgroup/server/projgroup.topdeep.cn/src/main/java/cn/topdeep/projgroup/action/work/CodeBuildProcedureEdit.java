package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.db.CodeBuild;
import cn.topdeep.projgroup.entity.db.CodeBuildProcedure;
import cn.topdeep.projgroup.entity.db.CodeBuildProcedureExample;
import cn.topdeep.projgroup.entity.db.FuncProcedureExample;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.db.FuncProcedure;
import cn.topdeep.projgroup.entity.Privilege;

public class CodeBuildProcedureEdit extends BaseAction{
	private int buildId;
	private int funcProjectId;

	private FuncProjectBiz funcProjectBiz;
	
	private List<FuncProcedure> funcprocedureList;
	
	public List<FuncProcedure> getFuncprocedureList() {
		return funcprocedureList;
	}



	public void setFuncprocedureList(List<FuncProcedure> funcprocedureList) {
		this.funcprocedureList = funcprocedureList;
	}



	public int getFuncProjectId() {
		return funcProjectId;
	}



	public void setFuncProjectId(int funcProjectId) {
		this.funcProjectId = funcProjectId;
	}



	public int getBuildId() {
		return buildId;
	}



	public void setBuildId(int buildId) {
		this.buildId = buildId;
	}



	/**
	 * @return the funcProjectBiz
	 */
	public FuncProjectBiz getFuncProjectBiz() {
		return funcProjectBiz;
	}



	/**
	 * @param funcProjectBiz the funcProjectBiz to set
	 */
	public void setFuncProjectBiz(FuncProjectBiz funcProjectBiz) {
		this.funcProjectBiz = funcProjectBiz;
	}
	



	public String execute() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		return SUCCESS;
	}
	
	public String list() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_BUILD_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		CodeBuildProcedureExample condition = new CodeBuildProcedureExample();
		condition.or().andBuildIdEqualTo(buildId);
		List<CodeBuildProcedure> codeBuildProcedureList=funcProjectBiz.codeBuildProcedureSelectObjects(condition);
		CodeBuild codeBuild = funcProjectBiz.codeBuildSelectByPrimaryKey(buildId);
//		if(StringUtils.isNullOrEmpty(codeBuild.getFuncProjects())){
//			
//		}
		List<Integer> idList = new ArrayList<Integer>();
		if(!StringUtils.isNullOrEmpty(codeBuild.getFuncProjects())){
			String[] ary = codeBuild.getFuncProjects().split(",");
			for(String item : ary){
				idList.add(Integer.parseInt(item));
			}
		}
		FuncProcedureExample condition1 = new FuncProcedureExample();
		condition1.or().andFuncProjectIdIn(idList);
		List<FuncProcedure> allFuncprocedureList = funcProjectBiz.funcProcedureSelectObjects(condition1);
		int funcProcedureId;
		for(CodeBuildProcedure codeBuildProcedure:codeBuildProcedureList){
			funcProcedureId=codeBuildProcedure.getFuncProcedureId();
			for(FuncProcedure funcProcedure:allFuncprocedureList){
				if(funcProcedureId==funcProcedure.getFuncProcedureId()){
					allFuncprocedureList.remove(funcProcedure);
					break;
				}
			}
		}
		this.funcprocedureList=allFuncprocedureList;
		return SUCCESS;
	}	


}
