package cn.topdeep.projgroup.action.work;

import java.sql.SQLException;
import java.util.List;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.db.FuncProject;
import cn.topdeep.projgroup.entity.db.FuncProjectExample;
import cn.topdeep.projgroup.entity.Privilege;

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
		if(!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		return SUCCESS;
	}
	/*
	 * list
	 */
	public String list() throws DbException, SQLException, CacheException{
		if(!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		this.funcProjectlist =funcProjectBiz.funcProjectSelectObjects(new FuncProjectExample());
		return SUCCESS;
	}
	/*
	 * save
	 */
	public String ajaxSave() throws Exception {
		if(!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		funcProjectBiz.funcProjectInsert(fproj); 
		jsonObj=fproj;
		return AJAX;
	}
	
	/*
	 * update
	 */
	public String ajaxUpdate() throws Exception {
		if(!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		this.funcProjectBiz.funcProjectUpdate(fproj); 
		jsonObj=fproj;
		return AJAX;
	}
	/*
	 * delete 
	 */
	public String ajaxDelete() throws Exception {
		if(!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Delete)){
			return NO_PRIVILEGES;
		}
		try{	
			this.funcProjectBiz.funcProjectDeleteByPrimaryKey(funcProjectId);
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
		if(!hasPrivilege(Privilege.FUNC_FUNC_LIST_MANAGE, PrivilegeOperate.Read)){
			return NO_PRIVILEGES;
		}
		list();
		this.fproj = this.funcProjectBiz.funcProjectSelectByPrimaryKey(funcProjectId);
		return INPUT;
	}
}
