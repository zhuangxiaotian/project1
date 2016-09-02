
package cn.topdeep.issue.action;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;
import com.opensymphony.xwork2.ActionContext;
import common.cache2.CacheException;

import cn.topdeep.projgroup.biz.IssueBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.*;
import cn.topdeep.projgroup.entity.view.issue.IssueProjectUserPrivilegesListView;

public class ProjectUserPrivilegesList extends PageAction {

	private int issueProjectId;
	private int issueUserId;
	
	private IssueProject issueProject;
	
	public IssueProject getIssueProject() throws DbException, SQLException, CacheException {
		if(issueProject == null){
			issueProject = issueBiz.issueProjectSelectByIssueProjectId(issueProjectId);
		}
		return issueProject;
	}

	public int getIssueProjectId() {
		return issueProjectId;
	}

	public void setIssueProjectId(int issueProjectId) {
		this.issueProjectId = issueProjectId;
	}

	public int getIssueUserId() {
		return issueUserId;
	}

	public void setIssueUserId(int issueUserId) {
		this.issueUserId = issueUserId;
	}

	private List<IssueProjectUserPrivilegesListView> privilegesList;
	
//	private int[] privilegesIds;
//	
//	public void setPrivilegesIds(int[] privilegesIds) {
//		this.privilegesIds = privilegesIds;
//	}

	//删除    已完成 单个删除
	public String delete() throws Exception {
		if(issueProjectId > 0 && issueUserId > 0) {
			issueBiz.issueProjectUserPrivilegesDelete(issueProjectId,issueUserId);
		}
		return execute();
	}
	
	
	//jsp页面显示部分
	public List<IssueProjectUserPrivilegesListView> getPrivilegesList() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(privilegesList == null){
			privilegesList = issueBiz.queryIssueProjectUserPrivilegesList(issueProjectId, getPageIndex(), getRowsOfPage(),"ISSUE_PROJECT_ID", "asc");
		}
		return privilegesList;
	}
	
	public int rowsCount = -1;
	
	public int getRowsCount() {
		if(rowsCount < 0){
			try {
				rowsCount = issueBiz.queryIssueProjectUserPrivilegesListViewListCount(issueProjectId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
}
