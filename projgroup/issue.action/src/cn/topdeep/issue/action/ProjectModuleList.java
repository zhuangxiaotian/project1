
package cn.topdeep.issue.action;

import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;
import com.opensymphony.xwork2.ActionContext;
import common.cache2.CacheException;

import cn.topdeep.projgroup.biz.IssueBiz;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.*;
import cn.topdeep.projgroup.entity.view.issue.IssueProjectMoudleListView;

public class ProjectModuleList extends PageAction {

	private int issueProjectId;
	
	public int getIssueProjectId() {
		return issueProjectId;
	}

	public void setIssueProjectId(int issueProjectId) {
		this.issueProjectId = issueProjectId;
	}

	private List<IssueProjectModule> moduleList;
	
	private int[] moduleIds;
	
	public void setModuleIds(int[] moduleIds) {
		this.moduleIds = moduleIds;
	}
	
	//删除
	
	public String delete() throws Exception {
		if(moduleIds != null) {
			issueBiz.issueProjectModuleDelete(moduleIds);
		}
		return execute();
	}
	
	
	//jsp页面显示部分
	public List<IssueProjectModule> getModuleList() throws DbException, SQLException, CacheException {
		if(moduleList == null){
			moduleList = issueBiz.queryIssueProjectsModuleList(issueProjectId, getPageIndex(), getRowsOfPage(), "ISSUE_PROJECT_MODULE_ID", "asc");
		}
		return moduleList;
	}
	
	private int rowsCount = -1;
	
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				rowsCount = issueBiz.queryIssueProjectsModuleListCount(issueProjectId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
}
