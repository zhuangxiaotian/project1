package cn.topdeep.issue.action;

import cn.topdeep.projgroup.entity.*;

import java.sql.SQLException;
import java.util.*;
import common.util.*;
import cn.topdeep.projgroup.entity.data.issue.*;
import common.cache2.CacheException;
import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.validator.annotations.*;

public class IssueAdd extends BaseAction {

	private Issue issue;
	private String issueCommentContent;
	private common.service.email.SendEmail sendmail; 
	
	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
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
			IssueUsers defaultUser = issueBiz.queryIssueUsers(issueLoginUser.getLoginProject().getDefaultUserId());
			defaultUser.setIssueUserName("默认处理用户");
			userList.add(0,defaultUser);
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
				ProjMoudleList = issueBiz.queryIssueProjectsModuleList(issueLoginUser.getLoginProject().getIssueProjectId(), 0, Integer.MAX_VALUE, "ISSUE_PROJECT_MODULE_ID", "asc");
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
	
		
	public String execute() throws Exception {
		return Action.INPUT; 
	}
	
//	public void validateSave() throws DbException, SQLException{
//		IssueProjectUserPrivileges pri = issueBiz.queryIssueProjectUserPrivileges(issueProjectId, getUserPrivileges().getIssueUserId());
//		if(pri != null) {
//			if(!(pri.getIssueProjectId() ==  getIssue().getIssueProjectId() && pri.getIssueUserId() == getUserPrivileges().getIssueUserId())){
//				addFieldError("userPrivileges.issueUserId", "已经存在该项目被分配的用户");	
//			}
//		} 
//	} 
	
	@Validations(
			requiredStrings = {
					@RequiredStringValidator(type=ValidatorType.SIMPLE,trim=true,fieldName="issue.issueShortDesc",message="请输入简单描述")
			}
	)
	public String save() throws Exception{
			issue.setIssueProjectId(issueLoginUser.getLoginProject().getIssueProjectId());
			issue.setReportUserId(issueLoginUser.getLoginUserId());
			IssueStatus newStatus = issueBiz.queryIssueStatusByStatusName("新的");
			if(newStatus != null) {
				issue.setStatusId(newStatus.getStatusId());
			}
			issue.setReportTime(new Date());
			issue.setUpdateTime(new Date());
			IssueComment comment = null;
			if(!StringUtils.isNullOrEmpty(issueCommentContent)){
				comment = new IssueComment();
				comment.setCommentContent(issueCommentContent.trim());
				comment.setCommentTime(new Date());
				comment.setCommentType(IssueCommentType.Normal);
				comment.setCommentUserId(issueLoginUser.getLoginUserId());
				comment.setParentCommentId(0);
			}
			issueBiz.issueAdd(issue,comment);
			//收集项目用户
			//IssueUsers lgUser = issueBiz.queryIssueUsers(issueLoginUser.getLoginUserId());
			String[] userEmails = issueBiz.getCurrentProjectUser(issueLoginUser.getLoginProject().getIssueProjectId());
			String mailSubject = "问题跟踪: 新增问题["+issue.getIssueId()+"||"+issue .getIssueShortDesc()+"]";
			String mailContent = "问题ID: "+getIssue().getIssueId()+",访问地址:"+issueUrlManage.getIssueEditUrl(issue.getIssueId())+"\n\n问题所属项目:"+getAttribute(CURRENT_LOGIN_MODOULE);
			try{
				sendmail.sendMail(userEmails, mailSubject, mailContent);	
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return Action.SUCCESS;
	}

	public String getIssueCommentContent() {
		return issueCommentContent;
	}

	public void setIssueCommentContent(String issueCommentContent) {
		this.issueCommentContent = issueCommentContent;
	}

	public common.service.email.SendEmail getSendmail() {
		return sendmail;
	}

	public void setSendmail(common.service.email.SendEmail sendmail) {
		this.sendmail = sendmail;
	}
	
	
}
