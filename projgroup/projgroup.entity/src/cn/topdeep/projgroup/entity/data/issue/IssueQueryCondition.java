/**
 * $Id$
 */
package cn.topdeep.projgroup.entity.data.issue;

import java.util.*;

/**
 * @author niexin
 *
 */
public class IssueQueryCondition {
	/**
	 * 在问题简短描述中查找
	 */
	private String keyword;

	private Integer issueProject;
	
	private int[] reportUser;
	
	public int[] getReportUser() {
		return reportUser;
	}

	public void setReportUser(int[] reportUser) {
		this.reportUser = reportUser;
	}

	public int[] getAssignToUser() {
		return assignToUser;
	}

	public void setAssignToUser(int[] assignToUser) {
		this.assignToUser = assignToUser;
	}

	public int[] getProjectModule() {
		return projectModule;
	}

	public void setProjectModule(int[] projectModule) {
		this.projectModule = projectModule;
	}

	public int[] getIssueType() {
		return issueType;
	}

	public void setIssueType(int[] issueType) {
		this.issueType = issueType;
	}

	public int[] getIssuePriorities() {
		return issuePriorities;
	}

	public void setIssuePriorities(int[] issuePriorities) {
		this.issuePriorities = issuePriorities;
	}

	public int[] getIssueStatu() {
		return issueStatu;
	}

	public void setIssueStatu(int[] issueStatu) {
		this.issueStatu = issueStatu;
	}

	public Date getReportBeginTime() {
		return reportBeginTime;
	}

	public void setReportBeginTime(Date reportBeginTime) {
		this.reportBeginTime = reportBeginTime;
	}

	public Date getReportEndTime() {
		return reportEndTime;
	}

	public void setReportEndTime(Date reportEndTime) {
		this.reportEndTime = reportEndTime;
	}

	public Date getUpdateBeginTime() {
		return updateBeginTime;
	}

	public void setUpdateBeginTime(Date updateBeginTime) {
		this.updateBeginTime = updateBeginTime;
	}

	public Date getUpdateEndTime() {
		return updateEndTime;
	}

	public void setUpdateEndTime(Date updateEndTime) {
		this.updateEndTime = updateEndTime;
	}

	private int[] assignToUser;
	
	private int[] projectModule;
	
	private int[] issueType;
	
	private int[] issuePriorities;
	
	private int[] issueStatu;
	
	private Date reportBeginTime;
	
	private Date reportEndTime;
	
	private Date updateBeginTime;
	
	private Date updateEndTime;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getIssueProject() {
		return issueProject;
	}

	public void setIssueProject(Integer issueProject) {
		this.issueProject = issueProject;
	}

	
}
