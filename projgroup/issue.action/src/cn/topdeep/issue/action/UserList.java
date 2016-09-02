/**
 * 
 */
package cn.topdeep.issue.action;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;


import com.opensymphony.xwork2.ActionContext;
import common.privilege.PrivilegeOperate;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.*;
import cn.topdeep.projgroup.entity.view.issue.IssueUsersListView;

public class UserList extends PageAction {
	
	private List<IssueUsersListView> userList;
	private int[] userIds;
	
	public String execute() throws Exception{
		return super.execute();
	}
	
	//状态修改
	public String disable() throws Exception{
		if(userIds != null){
			issueBiz.issueUserChanageState(userIds, IssueUserState.Disabled);
		}
		return execute();
	}
	
	public String enable() throws Exception{
		
		ActionContext ac = ActionContext.getContext();
   	    Map map = ac.getParameters();
		for(Iterator<Entry<String, String[]>> it = map.entrySet().iterator();it.hasNext();){
			Entry<String, String[]> entry = it.next();
			System.out.println(entry.getKey()+"="+entry.getValue().toString());
		}
		
		if(userIds != null){
			issueBiz.issueUserChanageState(userIds, IssueUserState.Enabled);
		}
		return execute();
	}
	
    //删除用户
	public String delete() throws Exception {
		if(userIds != null) {
			issueBiz.issueUserDelete(userIds);
		}
		return execute();
	}
	
	public void setUserIds(int[] userIds) {
		this.userIds = userIds;
	}

	public List<IssueUsersListView> getUserList() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(userList == null){
			userList = issueBiz.queryIssueUsersListViewList(getPageIndex(), getRowsOfPage(), "ISSUE_USER_ID", "asc");
		}
		return userList;
	}
	
	private int rowsCount = -1;
	
	public int getRowsCount() {
		if(rowsCount < 0){
			try {
				rowsCount = issueBiz.queryIssueUsersListViewListCount();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
	
}
