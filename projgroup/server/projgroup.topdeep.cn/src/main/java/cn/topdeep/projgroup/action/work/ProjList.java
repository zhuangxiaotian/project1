package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import common.privilege.Privilege;
import common.privilege.PrivilegeOperate;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.view.*;
public class ProjList extends PageAction {
	
	
	

	@Override
//	public int getRowsCount() {
//		// TODO Auto-generated method stub
//		//return 0;
//		if(this.projListAll==null)
//			try {
//				bindData();
//			} catch (DbException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		return this.projListAll.size();
//	}
	public String execute() throws DbException, SQLException{
//		bindData();
		return SUCCESS;
	}
	
//	private void bindData() throws DbException, SQLException {
//		projListAll=getProjectBiz().getProjListAll();
//		projList = getProjectBiz().getProjList(getPageIndex(),getRowsOfPage());
//	}

	public String disable() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectUserIds();
		if(ids != null){
			getSystemBiz().disableProjects(ids);
		}else {
			addFieldError("error", "没有选择要禁用的项目");
		}
		return execute();
	}
	
	public String enable() throws SQLException{
		if(!hasPrivilege(Privilege.FUNC_USER_MANAGE, PrivilegeOperate.Write)){
			return NO_PRIVILEGES;
		}
		int[] ids = getSelectUserIds();
		if(ids != null){
			getSystemBiz().enableProjects(ids);
		}else {
			addFieldError("error", "没有选择要禁用的项目");
		}
		return execute();
	}

	private int[] getSelectUserIds(){
		if(!selectedProjs.equals("false")) {
			return common.db.SqlUtils.stringToIntArray(selectedProjs);
		}
		return null;
	}
		
	
	
	private List projList;
	private List projListAll;

	private String selectedProjs;
	
	public List getProjList() {
		return projList;
	}

	public void setProjList(List projList) {
		this.projList = projList;
	}

	public String getSelectedProjs() {
		return selectedProjs;
	}

	public void setSelectedProjs(String selectedUsers) {
		this.selectedProjs = selectedUsers;
	}
	
	private List<ProjectListView> projectListView;

	public List<ProjectListView> getProjectListView() throws DbException, IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(projectListView == null) {
			projectListView = getProjectBiz().getProjListViewlist(getPageIndex(), getRowsOfPage(),"PROJ_ID" ,"desc");
		}
		return projectListView;
	}
	public void setProjectListView(List<ProjectListView> projectListView) {
		this.projectListView = projectListView;
	}
	
	private int rowsCount = -1;
	@Override
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				rowsCount = getProjectBiz().getQueryProjListViewlistCount();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}

}
