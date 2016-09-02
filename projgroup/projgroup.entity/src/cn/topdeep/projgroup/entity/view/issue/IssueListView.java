package cn.topdeep.projgroup.entity.view.issue;

import cn.topdeep.projgroup.entity.*;
//注意一定要继承超类..还有成员变量一定要跟sql语句中查找出来的字段名称相符才能赋值,否则不会.还要引入父类所在的包
public class IssueListView extends Issue{
	private String statusName;
	private String reportUserName;
	private String assignUserName;
	private String issueProjectModouleName;
	private String issueProjectName;
	private String prioritiesName;
	private String moduleName;
	private Integer reportInnerUserId;
	public Integer getReportInnerUserId() {
		return reportInnerUserId;
	}
	public void setReportInnerUserId(Integer reportInnerUserId) {
		this.reportInnerUserId = reportInnerUserId;
	}
	public Integer getAssignInnerUserId() {
		return assignInnerUserId;
	}
	public void setAssignInnerUserId(Integer assignInnerUserId) {
		this.assignInnerUserId = assignInnerUserId;
	}
	private Integer assignInnerUserId;
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public String getReportUserName() {
		return reportUserName;
	}
	public void setReportUserName(String reportUserName) {
		this.reportUserName = reportUserName;
	}
	public String getAssignUserName() {
		return assignUserName;
	}
	public void setAssignUserName(String assignUserName) {
		this.assignUserName = assignUserName;
	}
	public String getIssueProjectModouleName() {
		return issueProjectModouleName;
	}
	public void setIssueProjectModouleName(String issueProjectModouleName) {
		this.issueProjectModouleName = issueProjectModouleName;
	}
	public String getIssueProjectName() {
		return issueProjectName;
	}
	public void setIssueProjectName(String issueProjectName) {
		this.issueProjectName = issueProjectName;
	}
	public String getPrioritiesName() {
		return prioritiesName;
	}
	public void setPrioritiesName(String prioritiesName) {
		this.prioritiesName = prioritiesName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
}
