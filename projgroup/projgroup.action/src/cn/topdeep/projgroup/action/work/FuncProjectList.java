package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.List;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.FuncProject;

public class FuncProjectList extends  BaseAction{
	FuncProjectBiz funcProjectBiz;
	private FuncProject fproj;
	private int pageIndex;
	private int rowsOfPage;
	private List<FuncProject> funcProjectlist;
	private int funcProjectId;
	
	

	public List<FuncProject> getFuncProjectlist() {
		return funcProjectlist;
	}

	public void setFuncProjectlist(List<FuncProject> funcProjectlist) {
		this.funcProjectlist = funcProjectlist;
	}

	public int getFuncProjectId() {
		return funcProjectId;
	}

	public void setFuncProjectId(int funcProjectId) {
		this.funcProjectId = funcProjectId;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getRowsOfPage() {
		return rowsOfPage;
	}

	public void setRowsOfPage(int rowsOfPage) {
		this.rowsOfPage = rowsOfPage;
	}

	public FuncProjectBiz getFuncProjectBiz() {
		return funcProjectBiz;
	}

	public void setFuncProjectBiz(FuncProjectBiz funcProjectBiz) {
		this.funcProjectBiz = funcProjectBiz;
	}

	public FuncProject getFproj() {
		return fproj;
	}

	public void setFproj(FuncProject fproj) {
		this.fproj = fproj;
	}
	
	public String execute(){
		return SUCCESS;
	}
	/*
	 * list
	 */
	public String list() throws DbException, SQLException{
		this.funcProjectlist =funcProjectBiz.funcProjectSelectObjects();
		return SUCCESS;
	}
	/*
	 * save
	 */
	public String ajaxSave() throws Exception {
		funcProjectBiz.funcProjectInsert(fproj); 
		jsonObj=fproj;
		return AJAX;
	}
	
	/*
	 * update
	 */
	public String ajaxUpdate() throws Exception {
		this.funcProjectBiz.funcProjectUpdate(fproj); 
		jsonObj=fproj;
		return AJAX;
	}
	/*
	 * delete 
	 */
	public String ajaxDelete() throws Exception {
		try{	
			this.funcProjectBiz.funcProjectDeleteByFuncProjectId(funcProjectId);
			jsonObj="ok";	 
		}catch(Exception ex){	 
			jsonObj=ex.getMessage();	 
			
		} 	
		return AJAX; 
	}
	/*
	 * get(id)
	 */
	public String get() throws Exception{
		list();
		this.fproj = this.funcProjectBiz.funcProjectSelectByFuncProjectId(funcProjectId);
		return INPUT;
	}
}
