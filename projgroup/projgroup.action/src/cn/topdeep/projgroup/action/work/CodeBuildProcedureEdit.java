package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.List;

import common.util.StringUtils;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.CodeBuild;
import cn.topdeep.projgroup.entity.CodeBuildProcedure;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncProcedure;

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
		return SUCCESS;
	}
	
	public String list() throws Exception{
		List<CodeBuildProcedure> codeBuildProcedureList=funcProjectBiz.codeBuildProcedureSelectObjectsByBuildId(buildId);
		CodeBuild codeBuild = funcProjectBiz.codeBuildSelectByBuildId(buildId);
//		if(StringUtils.isNullOrEmpty(codeBuild.getFuncProjects())){
//			
//		}
		List<FuncProcedure> allFuncprocedureList = funcProjectBiz.funcProcedureSelectObjects(" where func_Project_Id in ("+codeBuild.getFuncProjects()+")");
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
