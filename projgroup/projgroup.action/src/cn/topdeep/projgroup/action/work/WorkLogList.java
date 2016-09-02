package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import cn.topdeep.projgroup.action.PageAction;

public class WorkLogList extends PageAction {

	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		//return 0;
		if(this.logList==null)
			try {
				bindData();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return this.LogListAll.size();
		
	}
	
	public String execute() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		bindData();
		return SUCCESS;
	}
	
	
	
	private void bindData() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		
		LogListAll=getProjectBiz().getWorkLogListAll(getLoginUser().getLoginUser().getUserId());
		logList = getProjectBiz().getWorkLogList(getLoginUser().getLoginUser().getUserId(), getPageIndex(), getRowsOfPage());
	}
	
	private List logList;
	private List LogListAll;

	public List getLogListAll() {
		return LogListAll;
	}

	public void setLogListAll(List logListAll) {
		LogListAll = logListAll;
	}

	public List getLogList() {
		return logList;
	}

	public void setLogList(List logList) {
		this.logList = logList;
	}
	public String worklogView(){
		return SUCCESS;
	}
}
