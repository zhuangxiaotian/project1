package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

import common.cache2.CacheException;

import cn.topdeep.projgroup.action.PageAction;
import cn.topdeep.projgroup.entity.db.WorkLogExample;

public class WorkLogList extends PageAction {

	@Override
	public int getRowsCount() {
		// TODO Auto-generated method stub
		//return 0;
		WorkLogExample condition = new WorkLogExample();
		condition.or().andWorkUserIdEqualTo(getLoginUser().getLoginUser().getUserId());
		
		try {
			return getProjectBiz().workLogQuerySelectObjectsCount(condition);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public String execute() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		bindData();
		return SUCCESS;
	}
	
	
	
	private void bindData() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		logList = getProjectBiz().getWorkLogList(getLoginUser().getLoginUser().getUserId(), getPageIndex(), getRowsOfPage());
	}
	
	private List logList;

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
