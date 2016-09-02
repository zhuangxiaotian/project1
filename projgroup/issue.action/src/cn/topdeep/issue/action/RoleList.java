
package cn.topdeep.issue.action;

import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;
import com.opensymphony.xwork2.ActionContext;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;

import cn.topdeep.projgroup.biz.IssueBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.*;

public class RoleList extends PageAction {
	//封装
	
	private List<IssueRoles> roleList;
	
	private int[] roleIds;
	
	public void setRoleIds(int[] roleIds) {
		this.roleIds = roleIds;
	}
	
	//修改状态
	
	public String disable() throws Exception{
		ActionContext ac = ActionContext.getContext();
		Map map = ac.getParameters();
		for(Iterator<Entry<String, String[]>> it = map.entrySet().iterator();it.hasNext();){
			Entry<String, String[]> entry = it.next();
			System.out.println(entry.getKey()+"="+entry.getValue().toString());
		}

		if(roleIds != null){
			issueBiz.issueRoleChanageState(roleIds, IssueRoleState.Disabled);
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
		
		if(roleIds != null){
			issueBiz.issueRoleChanageState(roleIds, IssueRoleState.Enabled);
		}
		return execute();
	}

	//删除
	
	public String delete() throws Exception {
		if(roleIds != null) {
			issueBiz.issueRoleDelete(roleIds);
		}
		return execute();
	}
	
	
	//jsp页面显示部分
	public List<IssueRoles> getRoleList() throws DbException, SQLException, CacheException {
		if(roleList == null){
			roleList = issueBiz.queryIssueRoleList(getPageIndex(), getRowsOfPage(), "ROLE_ID", "asc");
		}
//System.out.println(issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(),IssuePrivilege.ISSUE_ROLE_MANAGE, PrivilegeOperate.Delete));

return roleList;
	}
	
	private int rowsCount = -1;
	
	public int getRowsCount() {
		if(rowsCount < 0){
			try {
				rowsCount = issueBiz.queryIssueRolesListCount();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
}
