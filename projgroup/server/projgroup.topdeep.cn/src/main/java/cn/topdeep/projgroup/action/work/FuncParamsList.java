package cn.topdeep.projgroup.action.work;

import java.util.List;

import common.privilege.PrivilegeOperate;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.db.FuncParams;
import cn.topdeep.projgroup.entity.Privilege;

public class FuncParamsList extends  BaseAction{
	private FuncParams funcParams;
	private List funcProceList;
	private List funcParamsList;
	private int AParamId;

	private FuncProjectBiz funcProjectBiz;
	
	/*
	 * save
	 */
	public String save() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		funcProjectBiz.funcParamsInsert(funcParams);
		return SUCCESS;
	}
	/*
	 * delete
	 */
	public String delete() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Delete)){
			return NO_PRIVILEGES;
		}
		funcProjectBiz.funcParamsDeleteByPrimaryKey(AParamId);
		return SUCCESS;
	}
	/*
	 * update 
	 */
	public String update() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		funcProjectBiz.funcParamsUpdate(funcParams);
		return SUCCESS;
	}
	/*
	 * List
	 */
	public String list() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		//this.funcParamsList = funcProjectBiz.funcParamsSelectObjectsByFuncProcedureId(AFuncProcedureId) this.funcParamsBiz.list();
		return SUCCESS;
	}
	/*
	 * get(id)
	 */
	public String get() throws Exception{
		if(!hasPrivilege(Privilege.FUNC_FUNC_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		this.funcParams = funcProjectBiz.funcParamsSelectByPrimaryKey(AParamId);
		return INPUT;
	}
	
	public FuncParams getFuncParams() {
		return funcParams;
	}
	public void setFuncParams(FuncParams funcParams) {
		this.funcParams = funcParams;
	}
	public List getFuncproceList() {
		return funcProceList;
	}
	public void setFuncproceList(List funcproceList) {
		this.funcProceList = funcproceList;
	}
	public List getFuncParamsList() {
		return funcParamsList;
	}
	public void setFuncParamsList(List funcParamsList) {
		this.funcParamsList = funcParamsList;
	}
	public int getAParamId() {
		return AParamId;
	}
	public void setAParamId(int aParamId) {
		AParamId = aParamId;
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
	
}
