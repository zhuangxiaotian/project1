package cn.topdeep.issue.action;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import common.cache2.CacheException;
import common.util.StringUtils;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.issue.IssueQueryCondition;
import cn.topdeep.projgroup.entity.view.issue.IssueListView;
/**
 * 
 * @author gmtstu
 *
 */
public class Search extends PageAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 942875533468388031L;

	private IssueQueryCondition issueCondition;
	
	
	private boolean post;

	public boolean getPost() {
		return post;
	}


	public void setPost(boolean post) {
		this.post = post;
	}


	private String reportBeginTime;
	private String reportEndTime;
	private String updateBeginTime;
	private String updateEndTime;
	private String issueQuerySql;
	
	public String getIssueQuerySql() throws ParseException {
		if(StringUtils.isNullOrEmpty(issueQuerySql) || issueCondition != null) {
			issueQuerySql =issueBiz.getQueryIssueListViewByQueryContidionListNoprojectSql(getIssueCondition());
		}
		return issueQuerySql;
	}


	public void setIssueQuerySql(String issueQuerySql) {
		this.issueQuerySql = issueQuerySql;
	}


	/**
	 * post 表示提交了查询条件
	 */


	public String getReportBeginTime() {
		return reportBeginTime;
	}


	public void setReportBeginTime(String reportBeginTime) {
		this.reportBeginTime = reportBeginTime;
	}


	public String getUpdateBeginTime() {
		return updateBeginTime;
	}


	public void setUpdateBeginTime(String updateBeginTime) {
		this.updateBeginTime = updateBeginTime;
	}


	public String getUpdateEndTime() {
		return updateEndTime;
	}


	public void setUpdateEndTime(String updateEndTime) {
		this.updateEndTime = updateEndTime;
	}


	public String getReportEndTime() {
		return reportEndTime;
	}


	public void setReportEndTime(String reportEndTime) {
		this.reportEndTime = reportEndTime;
	}


	public IssueQueryCondition getIssueCondition() {
		if(issueCondition == null){
			issueCondition = new IssueQueryCondition();
		}
		return issueCondition;
	}


	public void setIssueCondition(IssueQueryCondition issueCondition) {
		this.issueCondition = issueCondition;
	}


	private List<IssueListView> issueListViewByQueryConditionList;
	

	public List<IssueListView> getIssueListViewByQueryConditionList() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, ParseException {
		if(post) {
			if(issueListViewByQueryConditionList == null) {
				if(!StringUtils.isNullOrEmpty(reportBeginTime)){
					getIssueCondition().setReportBeginTime(StringUtils.stringToDate(reportBeginTime, "yyyy-MM-dd HH"));
				}
				if(!StringUtils.isNullOrEmpty(reportEndTime)){
					getIssueCondition().setReportEndTime(StringUtils.stringToDate(reportEndTime, "yyyy-MM-dd HH"));
				}
				if(!StringUtils.isNullOrEmpty(updateBeginTime)){
					getIssueCondition().setUpdateBeginTime(StringUtils.stringToDate(updateBeginTime, "yyyy-MM-dd HH"));
				}
				if(!StringUtils.isNullOrEmpty(updateEndTime)){
					getIssueCondition().setUpdateEndTime(StringUtils.stringToDate(updateEndTime, "yyyy-MM-dd HH"));
				}
				issueCondition.setIssueProject(issueLoginUser.getLoginProject().getIssueProjectId());
				issueListViewByQueryConditionList = issueBiz.queryIssueListViewByQueryConditionList(getIssueCondition(), getPageIndex(), getRowsOfPage(), "ISSUE_ID", "desc");
				if(getIssueLoginUser().getLoginUser().getInnerUserId() == null) {
					for(Iterator<IssueListView> it = issueListViewByQueryConditionList.iterator();it.hasNext();) {
						IssueListView view = it.next();
						if(view.getAssignInnerUserId() != null){
							view.setAssignUserName("Develop");
						}
						if(view.getReportInnerUserId() != null){
							view.setReportUserName("Develop");
						}
					}
				} 
			}
		}	
		return issueListViewByQueryConditionList;
	}

	public void setIssueListViewByQueryConditionList(List<IssueListView> issueListViewByQueryConditionList) {
		this.issueListViewByQueryConditionList = issueListViewByQueryConditionList;
	}


	//查找 IssueUsers 的list用于页面显示IssueUsers的name
	private List<IssueUsers> userList;

	public List<IssueUsers> getUserList() throws DbException, SQLException, CacheException {
		if (userList ==null){
			userList = issueBiz.queryIssueUserList(0, Integer.MAX_VALUE, "ISSUE_USER_ID", "asc");
			if(issueLoginUser.getLoginUser().getInnerUserId() == null) {
				for(Iterator<IssueUsers> it = userList.iterator(); it.hasNext();) {
					if(it.next().getInnerUserId() != null) {
						//it.next().setIssueUserName("develop");
						it.remove();
					}
				}
			}
			
		}
		return userList;
	}
	
	//查找IssueProject的list
	private List<IssueProject> projList;
		
		public List<IssueProject> getProjList() throws DbException, SQLException, CacheException {
			if(projList == null){
				projList = issueBiz.queryIssueProjectList(0, Integer.MAX_VALUE, "ISSUE_PROJECT_ID", "asc");
			}
			return projList;
		}
		
	private List<IssueProjectModule> ProjMoudleList;
	
		public List<IssueProjectModule> getProjMoudleList() throws DbException, SQLException, CacheException {
			if(ProjMoudleList == null) {
				ProjMoudleList = issueBiz.queryIssueProjectModuleList(0, Integer.MAX_VALUE, "ISSUE_PROJECT_MODULE_ID", "asc");
			}
			return ProjMoudleList;
		} 
		
	private  List<IssueStatus> statusList;
		
		public List<IssueStatus> getStatusList() throws DbException, SQLException, CacheException {
			if(statusList == null) {
				statusList = issueBiz.queryIssueStatusList(0, Integer.MAX_VALUE, "STATUS_ID", "asc");
			}
			return statusList;
		}
	private List<IssuePriorities> prioritiesList;
	
	public List<IssuePriorities> getPrioritiesList() throws DbException, SQLException, CacheException {
		if(prioritiesList == null){
			prioritiesList = issueBiz.queryIssuePrioritlesList(0, Integer.MAX_VALUE, "PRIORITIES_ID", "asc");
		}
		return prioritiesList;
	}
	
	
	public String search() throws Exception {
		setPageIndex(0);
		return execute();
	}
	
		
	public String execute() throws Exception {
		return super.execute(); 
	}
	
	private int rowsCount = -1;
	
	@Override
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				if(issueCondition.getIssueProject() == null) {
					issueCondition.setIssueProject(issueLoginUser.getLoginProject().getIssueProjectId());
				}
				rowsCount = issueBiz.getQueryIssueListViewByQueryContidionListCount(issueCondition);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
	
	public int getRowsOfPage() {
		return 10;
	}
	
	
}
