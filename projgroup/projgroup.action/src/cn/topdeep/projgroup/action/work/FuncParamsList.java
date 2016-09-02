package cn.topdeep.projgroup.action.work;

import java.util.List;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.FuncParams;

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
		funcProjectBiz.funcParamsInsert(funcParams);
		return SUCCESS;
	}
	/*
	 * delete
	 */
	public String delete() throws Exception{
		funcProjectBiz.funcParamsDeleteByParamId(AParamId);
		return SUCCESS;
	}
	/*
	 * update 
	 */
	public String update() throws Exception{
		funcProjectBiz.funcParamsUpdate(funcParams);
		return SUCCESS;
	}
	/*
	 * List
	 */
	public String list() throws Exception{
		//this.funcParamsList = funcProjectBiz.funcParamsSelectObjectsByFuncProcedureId(AFuncProcedureId) this.funcParamsBiz.list();
		return SUCCESS;
	}
	/*
	 * get(id)
	 */
	public String get() throws Exception{
		this.funcParams = funcProjectBiz.funcParamsSelectByParamId(AParamId);
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
