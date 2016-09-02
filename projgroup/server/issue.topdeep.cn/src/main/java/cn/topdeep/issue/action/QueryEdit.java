package cn.topdeep.issue.action;

import java.sql.SQLException;

import common.cache2.CacheException;
import common.util.*;
import cn.topdeep.projgroup.entity.*;

public class QueryEdit extends BaseAction{
	
	private IssueQuery issueQuery;
	private int issueQueryId;
	
	private String issueQuerySql;
	
	
	public String getIssueQuerySql() throws DbException, SQLException, CacheException {
		if(StringUtils.isNullOrEmpty(issueQuerySql)) {
			issueQuerySql = issueBiz.queryIssueQuery(issueQueryId).getIssueQuerySql();
		}
		return issueQuerySql;
	}
	public void setIssueQuerySql(String issueQuerySql) {
		this.issueQuerySql = issueQuerySql;
	}
	
	public int getIssueQueryId() {
		return issueQueryId;
	}
	public void setIssueQueryId(int issueQueryId) {
		this.issueQueryId = issueQueryId;
	}
	
	//这个部分包含了两IssueQuery对象处理方法 一个是add时 IssueQuery为空.edit时需要从数据库查找
	public IssueQuery getIssueQuery() throws DbException, SQLException, CacheException {
		if(issueQuery == null && issueQueryId > 0) {
			issueQuery = issueBiz.queryIssueQuery(issueQueryId);
		}
		return issueQuery;
	}
	public void setIssueQuery(IssueQuery issueQuery) {
		this.issueQuery = issueQuery;
	}
	
	public String execute() throws Exception {
		return INPUT;
	}
	
	
	public String save() throws DbException, SQLException, CacheException {
		if(issueQuery != null) {
			if(!StringUtils.isNullOrEmpty(issueQuery.getIssueQueryName())) {
				if(issueQueryId > 0) {
					issueQuery.setIssueQuerySql(getIssueQuerySql());
					issueBiz.issueQueryUpdate(issueQuery, issueQueryId);
				}else {
					issueQuery.setIssueQuerySql(getIssueQuerySql());
					issueQuery.setIssueCreateUserId(issueLoginUser.getLoginUserId());
					issueQuery.setIssueProjectId(issueLoginUser.getLoginProject().getIssueProjectId());
					issueBiz.issueQueryAdd(issueQuery);
				}
			}else {
				addFieldError("issueQuery.issueQueryName", "请输入作为该查询结果的描述");
				return INPUT;
			}
		}
		return SUCCESS;
	}
	
}
