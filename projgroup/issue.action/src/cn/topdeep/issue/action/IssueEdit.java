package cn.topdeep.issue.action;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import common.cache2.CacheException;
import common.db.SqlServerUtils;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.bugtracker.DbException;
import cn.topdeep.projgroup.entity.data.IssueLoginUser;
import cn.topdeep.projgroup.entity.data.issue.IssueCommentType;
import cn.topdeep.projgroup.entity.data.issue.IssuePrivilege;
import cn.topdeep.projgroup.entity.view.issue.IssueCommentListView;
import cn.topdeep.projgroup.entity.view.issue.IssueProjectUserPrivilegesListView;
import cn.topdeep.projgroup.entity.view.issue.IssueStateChangeDefineListView;
import cn.topdeep.projgroup.entity.view.issue.IssueStatusNextListView;
import java.util.*;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

public class IssueEdit extends BaseAction {
	
	private Issue issue;
	private int issueId;
	private int issueCommentId;
	private String issueCommentContent;
	private String statusName;
	private int oldStatusId;
	private common.service.email.SendEmail sendmail; 

	public void setOldStatusId(int oldStatusId) {
		this.oldStatusId = oldStatusId;
	}

	public String getStatusName() throws DbException, SQLException, CacheException {
		if(StringUtils.isNullOrEmpty(statusName)) {
			statusName = issueBiz.queryIssueStatus(issue.getStatusId()).getStatusName();
		}
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	/**
	 * 未修改前的时间戳,通过jsp页面的hidden传递过来,只需要set方法
	 */
	private String oldTimeStamp;
	
	/**
	 * 保存到页面的时间戳
	 */
	private String timeStamp;
	
	public String getTimeStamp() throws DbException, SQLException, CacheException {
		if(timeStamp == null) {
			timeStamp = SqlServerUtils.getByteArySql(getIssue().getTimeStamp()).toString();
		}
		return timeStamp;
	}
	
	public void setOldTimeStamp(String oldTimeStamp) {
		this.oldTimeStamp = oldTimeStamp;
	}

	public String getIssueCommentContent() {
		return issueCommentContent;
	}

	public void setIssueCommentContent(String issueCommentContent) {
		this.issueCommentContent = issueCommentContent;
	}

	public Issue getIssue() throws DbException, SQLException, CacheException {
		if(issue == null && issueId > 0) {
			issue = issueBiz.queryIssue(issueId);
		}
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public int getIssueCommentId() {
		return issueCommentId;
	}

	public void setIssueCommentId(int issueCommentId) {
		this.issueCommentId = issueCommentId;
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
//System.out.print(issueLoginUser.getLoginUser().getInnerUserId());
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
	//需要重新修改statusList 功能为显示该用户所在角色能操作的状态
	
	
	public List<IssueStatusNextListView> nextStatusList;
		

	public List<IssueStatusNextListView> getNextStatusList() throws DbException, SQLException, CacheException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(nextStatusList == null) {
			//先判断该用户是否有没权限 
			Integer roleId = issueLoginUser.getRole(issueLoginUser.getLoginProject().getIssueProjectId());
			if(roleId == null){
				//没的话不能操作更改状态
				nextStatusList = new ArrayList<IssueStatusNextListView>();
			}else{
				nextStatusList = issueBiz.queryIssueStateNextListViewByCurrentStatusId(getIssue().getStatusId(), 0, Integer.MAX_VALUE, "STATUS_ID", "asc");
				for(Iterator<IssueStatusNextListView> it = nextStatusList.iterator();it.hasNext();){
					IssueStatusNextListView view = it.next();
					String roleList = view.getRoleList();
					boolean find = false;
					if(!StringUtils.isNullOrEmpty(roleList)){
						String[] pp = roleList.split(",");
						for(String roleIds : pp){
							int rid = Integer.parseInt(roleIds);
							if(rid == roleId){
								find = true;
							}
						}
					}
					if(!find){
						it.remove();
					}
				}
					
			}
		}
		return  nextStatusList;
	}
	
	
    private  List<IssueStatus> statusList;		
		
		public List<IssueStatus> getStatusList() throws DbException, SQLException, CacheException {
			if(statusList == null) {
				statusList = issueBiz.queryIssueStatusList(0, Integer.MAX_VALUE, "STATUS_ID", "asc");
				//修改statusList方法
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
	
	private List<IssueComment> issueCommentList;

	public List<IssueComment> getIssueCommentList() throws DbException, SQLException, CacheException {
		if(issueCommentList == null) {
			issueCommentList = issueBiz.queryIssueCommentList(issueId, 0, Integer.MAX_VALUE, "ISSUE_COMMENT_ID", "asc");
		}
		return issueCommentList;
	}
//注意下面的方法 :::::;get方法不能传参数的...谨记
//	public List<IssueComment> getIssueCommentList(int issueId, int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException {
//		return issueBiz.queryIssueCommentList(issueId, 0, Integer.MAX_VALUE, "ISSUE_COMMENT_ID", "asc");
//	}


	public void setIssueCommentList(List<IssueComment> issueCommentList) {
		this.issueCommentList = issueCommentList;
	}
	
	private List<IssueCommentListView> issueCommentListViewList;
	
	

	public List<IssueCommentListView> getIssueCommentListViewList() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException {
		if(issueCommentListViewList == null) {
			issueCommentListViewList = issueBiz.queryIssueCommentListViewList(issueId, 0, Integer.MAX_VALUE, "ISSUE_COMMENT_ID", "desc");
			if(issueCommentListViewList != null && issueLoginUser.getLoginUser().getInnerUserId() == null) {
				IssueUsers user = null;
				for(Iterator<IssueCommentListView> it = issueCommentListViewList.iterator(); it.hasNext();) {
					IssueCommentListView view = it.next();
					if(view != null) {
						user = issueBiz.queryIssueUsers(view.getCommentUserId());
						if(user != null) {
							if(user.getInnerUserId() != null) {
								view.setIssueUserName("develop");
							}
						}
					}
				}
			}
		}
		return issueCommentListViewList;
	}

	public String execute() throws Exception {
			return super.execute();
	}
	
	
	@Validations(
			requiredStrings = {
					@RequiredStringValidator(type=ValidatorType.SIMPLE,trim=true,fieldName="issue.issueShortDesc",message="请输入简单描述")
			}
	)
	public String save() throws Exception {
//System.out.println(SqlServerUtils.getByteArySql(getIssue().getTimeStamp()));
		IssueStatus oldStatus = issueBiz.queryIssueStatus(oldStatusId);
		IssueComment comment = null;
		String mailContent = "问题ID: "+getIssue().getIssueId()+",访问地址:"+issueUrlManage.getIssueEditUrl(issueId)+"\n\n问题所属项目:"+getAttribute(CURRENT_LOGIN_MODOULE)+"\n";
		issue.setUpdateTime(new Date());
		if(!StringUtils.isNullOrEmpty(issueCommentContent)) {
			comment = new IssueComment();
			comment.setCommentTime(new Date());
			comment.setCommentContent(issueCommentContent.trim());
			comment.setCommentType(IssueCommentType.Normal);
			comment.setCommentUserId(issueLoginUser.getLoginUserId());
			comment.setIssueId(getIssue().getIssueId());
			mailContent += "问题添加注释: \n";
			mailContent += comment.getCommentContent()+"\n";
		}
		int ret = 0;
		if(!oldStatus.getStatusName().equalsIgnoreCase("已关闭")) {
			ret = issueBiz.issueUpdateAdd(issue, comment, oldTimeStamp);
			if(ret == 1){
				if(oldStatusId != getIssue().getStatusId() ) {
					IssueStatus changeStatus = issueBiz.queryIssueStatus(getIssue().getStatusId());
					comment = new IssueComment();
					comment.setCommentTime(new Date());
					comment.setCommentContent("改变状态从 \""  +oldStatus.getStatusName()+ "\" 更改为 \"" +changeStatus.getStatusName() +"\"");
					comment.setCommentType(IssueCommentType.StateChange);
					comment.setCommentUserId(issueLoginUser.getLoginUserId());
					comment.setIssueId(issueId);
					issueBiz.issueCommentAdd(comment); 
					mailContent += comment.getCommentContent();
				}
			}else{
				issue = null; 
				addFieldError("test", "更新冲突,可能别的用户刚才更新过了,请检查无误后重新提交!");
				return INPUT;
			}
		}else{
			comment.setIssueId(issueId);
			issueBiz.issueCommentAdd(comment);
		}
		//发邮件
		String[] userEmails = issueBiz.getCurrentProjectUser(issueLoginUser.getLoginProject().getIssueProjectId());
		String mailSubject = "问题跟踪: 问题["+issue.getIssueId()+" "+issue .getIssueShortDesc()+"]更新";
		try{
			sendmail.sendMail(userEmails, mailSubject, mailContent);	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return SUCCESS;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String smtphost = "smtp.163.com"; 		    // 发送邮件服务器
	    String user = "gmtstu";					    // 邮件服务器登录用户名
	    String password = "13101402"; 				 // 邮件服务器登录密码
	    String from = "gmtstu@163.com"; 			// 发送人邮件地址
	    
		if(!oldStatus.getStatusName().equalsIgnoreCase("已关闭")) {
			if(!StringUtils.isNullOrEmpty(getIssue().getIssueShortDesc())) {
				issue.setUpdateTime(new Date());
				issue.setIssueId(issueId);
				
				int ret = issueBiz.issueUpdateAdd(issue, comment, oldTimeStamp);
				
				if(ret == 1){
					//return SUCCESS;添加注释或者update成功,
					//仅添加了注释但没有改变问题的状态,发送一封添加注释的通知,判断一下更新问题的人与问题提出者是不是同一个人
					if(issueLoginUser.getLoginUser().getIssueUserId() != getIssue().getReportUserId()) {
						if(comment != null && oldStatusId == getIssue().getStatusId()) {
							 if(!StringUtils.isNullOrEmpty(emailUser.getUserEmail())) {   
								    String to = "279034160@qq.com";
								    //String to = emailUser.getUserEmail(); 			// 收件人邮件地址
								    String subject ="问题跟踪系统:有人对您提出的问题["+issue.getIssueShortDesc()+"]添加了新的注释"; // 邮件标题
								    String body = "\n注释:" +comment.getCommentContent()+"\n\n您可以登录此站点查看:http://bugtracker.topdeep.cn/Login.action"
								    			+"\n\n登录项目名称: ["+getAttribute(CURRENT_LOGIN_MODOULE) +"]\n\n问题ID: ["+issueId+"],登陆后您可以通过输入问题id号直接查看该问题";// 邮件内容
								 issueBiz.sendEmail(smtphost, user, password, from, to, subject, body);
							 }
						}else{
							//仅仅是问题被更新了;
							
							if(oldStatusId == getIssue().getStatusId()) {
								 if(issueLoginUser.getLoginUser().getIssueUserId() != getIssue().getReportUserId()) {
									 if(!StringUtils.isNullOrEmpty(emailUser.getUserEmail())) {   
										    String to = "279034160@qq.com";
										    //String to = emailUser.getUserEmail(); 			// 收件人邮件地址
										    String subject ="问题跟踪系统:有人更新了您提出的问题["+issue.getIssueShortDesc()+"]"; // 邮件标题
										    String body = "您可以登录此站点查看:http://bugtracker.topdeep.cn/Login.action"
										    			+"\n\n登录项目名称: ["+getAttribute(CURRENT_LOGIN_MODOULE) +"]\n\n问题ID: ["+issueId+"],登陆后您可以通过输入问题id号直接查看该问题";// 邮件内容
										 issueBiz.sendEmail(smtphost, user, password, from, to, subject, body);
									 }
								 }
							}
						}
					 }
					
					//改变了问题的状态,发送一封状态改变的通知
					 if(oldStatusId != getIssue().getStatusId() ) {
						 IssueStatus changeStatus = issueBiz.queryIssueStatus(getIssue().getStatusId());
						 if(comment != null) {
							 //不仅添加了注释,还改变了状态
							 if(issueLoginUser.getLoginUser().getIssueUserId() != getIssue().getReportUserId()) {
								 if(!StringUtils.isNullOrEmpty(emailUser.getUserEmail())) {   
									    String to = "279034160@qq.com";
									    //String to = emailUser.getUserEmail(); 			// 收件人邮件地址
									    String subject ="问题跟踪系统:有人对您提出的问题["+issue.getIssueShortDesc()+"]添加了新的注释,问题状态由\""+oldStatus.getStatusName()+"\"更改为\""+changeStatus.getStatusName()+"\""; // 邮件标题
									    String body = "\n注释:" +comment.getCommentContent()+"\n\n您可以登录此站点查看:http://bugtracker.topdeep.cn/Login.action"
									    			+"\n\n登录项目名称: ["+getAttribute(CURRENT_LOGIN_MODOULE) +"]\n\n问题ID: ["+issueId+"],登陆后您可以通过输入问题id号直接查看该问题";// 邮件内容
									 issueBiz.sendEmail(smtphost, user, password, from, to, subject, body);
								 }
							 }
						 }else {
							 //仅改变了状态,没有添加注释,程序追加一条改变状态的注释
							 comment = new IssueComment();
							 comment.setCommentTime(new Date());
//							 IssueStatus oldStatus = issueBiz.queryIssueStatus(oldStatusId);
							 comment.setCommentContent("改变状态从 \""  +oldStatus.getStatusName()+ "\" 更改为 \"" +changeStatus.getStatusName() +"\"");
							 comment.setCommentType(IssueCommentType.StateChange);
							 comment.setCommentUserId(issueLoginUser.getLoginUserId());
							 comment.setIssueId(issueId);
							 issueBiz.issueCommentAdd(comment); 
							 //发送邮件
							 if(issueLoginUser.getLoginUser().getIssueUserId() != getIssue().getReportUserId()) {
								 if(!StringUtils.isNullOrEmpty(emailUser.getUserEmail())) {   
									    String to = "279034160@qq.com";
									    //String to = emailUser.getUserEmail(); 			// 收件人邮件地址
									    String subject ="问题跟踪系统:有人将您提出的:["+issue.getIssueShortDesc()+"]问题的状态由\""+oldStatus.getStatusName()+"\"更改为\"" +changeStatus.getStatusName() +"\""; // 邮件标题
									    String body = "问题状态变更,由 \""  +oldStatus.getStatusName()+ "\" 更改为 \"" +changeStatus.getStatusName() +"\""+"\n注释:" +comment.getCommentContent()
									    			+"\n\n您可以登录此站点查看:http://bugtracker.topdeep.cn/Login.action"
									    			+"\n\n登录项目名称: ["+getAttribute(CURRENT_LOGIN_MODOULE) +"]\n\n问题ID: ["+issueId+"],登陆后您可以通过输入问题id号直接查看该问题"; // 邮件内容
									 issueBiz.sendEmail(smtphost, user, password, from, to, subject, body);
								 }
							 }
						 }
					 }
					issue = null;
					addFieldError("test", "更新成功");
				}else{
					issue = null; 
					addFieldError("test", "更新冲突,可能别的用户刚才更新过了,请检查无误后重新提交!");
				}
			}else {
				addFieldError("issue.issueShortDesc", "请输入简单描述");
			}
			return SUCCESS;
		}else {
			if(!StringUtils.isNullOrEmpty(issueCommentContent)) {
				 comment = new IssueComment();
				 comment.setCommentContent(issueCommentContent.trim());
				 comment.setCommentType(IssueCommentType.Normal);
				 comment.setCommentTime(new Date());
//				 IssueStatus oldStatus = issueBiz.queryIssueStatus(oldStatusId);
				 comment.setCommentUserId(issueLoginUser.getLoginUserId());
				 comment.setIssueId(issueId);
				 issueBiz.issueCommentAdd(comment);
				 //发送邮件
				 if(issueLoginUser.getLoginUser().getIssueUserId() != getIssue().getReportUserId()) {
					 if(!StringUtils.isNullOrEmpty(emailUser.getUserEmail())) {   
						    String to = "279034160@qq.com";
						    //String to = emailUser.getUserEmail(); 			// 收件人邮件地址
						    String subject ="问题跟踪系统:有人对您提出的问题["+issue.getIssueShortDesc()+"]添加了新的注释"+issue.getIssueShortDesc(); // 邮件标题
						    String body = "\n注释:" +comment.getCommentContent()+"\n\n您可以登录此站点查看:http://bugtracker.topdeep.cn/Login.action"
						    			+"\n\n登录项目名称: ["+getAttribute(CURRENT_LOGIN_MODOULE) +"]\n\n问题ID: ["+issueId+"],登陆后您可以通过输入问题id号直接查看该问题";// 邮件内容
						 issueBiz.sendEmail(smtphost, user, password, from, to, subject, body);
					 }
				 }
				 addFieldError("test", "添加注释成功!");
				 return SUCCESS;
			}
			return INPUT;
		}
		*/
	}	
	/**
	 * 废弃不用.改用disable
	 */
//	private IssueUsers assUsers;
//	
//	public IssueUsers getAssUsers() throws DbException, SQLException {
//		if(assUsers == null) {
//			assUsers = issueBiz.queryIssueUsers(issue.getAssignUserId());
//		}
//		return assUsers;
//	}
//
//	public void setAssUsers(IssueUsers assUsers) {
//		this.assUsers = assUsers;
//	}

	public common.service.email.SendEmail getSendmail() {
		return sendmail;
	}

	public void setSendmail(common.service.email.SendEmail sendmail) {
		this.sendmail = sendmail;
	}
}
