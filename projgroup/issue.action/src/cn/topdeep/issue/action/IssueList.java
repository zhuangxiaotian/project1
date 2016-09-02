package cn.topdeep.issue.action;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
import java.util.Map.Entry;
import com.opensymphony.xwork2.ActionContext;

import common.cache2.CacheException;
import common.util.StringUtils;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.bugtracker.DbException;
import cn.topdeep.projgroup.entity.data.IssueLoginUser;
import cn.topdeep.projgroup.entity.data.issue.*;
import cn.topdeep.projgroup.entity.view.issue.IssueListView;
import cn.topdeep.projgroup.entity.view.issue.IssueProjectUserPrivilegesListView;
import cn.topdeep.projgroup.entity.view.issue.IssueQueryListView;
import cn.topdeep.projgroup.entity.view.issue.IssueStatusNextListView;

public class IssueList extends PageAction {
	
	public static final String CURRENT_QUERY_SESSION_KEY = "cn.topdeep.issue.action.IssueList.DefaultQuery";
	
	
	

	private List<IssueListView> issueList;
	
	private Integer issueQueryId;
	private common.service.email.SendEmail sendmail; 
	
	public Integer getIssueQueryId() {
		if(issueQueryId == null){
			issueQueryId = (Integer)getAttribute(CURRENT_QUERY_SESSION_KEY);
		}
		return issueQueryId;
	}

	public void setIssueQueryId(Integer issueQueryId) {
		this.issueQueryId = issueQueryId;
	}

	private int[] issueIds;

	public void setIssueIds(int[] issueIds) {
		this.issueIds = issueIds;
	}

	//删除暂时没加链接 方法已经写好了
	public String delete() throws Exception {
		if(issueIds != null) {
			issueBiz.issueDelete(issueIds);
		}
		return execute();
	}
	
	public List<IssueQueryListView> issueQueryList;

	public List<IssueQueryListView> getIssueQueryList() throws IllegalArgumentException, SQLException, CacheException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(issueQueryList == null) {
			setAttribute(CURRENT_QUERY_SESSION_KEY, null);
			issueQueryList = issueBiz.queryIssueQueryListViewList(0, Integer.MAX_VALUE, "ISSUE_QUERY_ID", "asc");
			IssueQueryListView view = new IssueQueryListView();
			IssueRoleDefaultQuery defaultQuery = null;
			IssueProjectUserPrivileges userPrivileges =null;
			view.setIssueQueryName("[default query]");
			if(issueLoginUser.getLoginUser().getInnerUserId() != null) {
				userPrivileges = issueBiz.queryIssueProjectUserPrivileges(issueLoginUser.getLoginProject().getIssueProjectId(), issueLoginUser.getLoginUser().getIssueUserId());
				defaultQuery = issueBiz.queryRoleDefaultQuery(issueLoginUser.getLoginProject().getIssueProjectId(), userPrivileges.getRoleId());
				if(defaultQuery != null) {
					view.setIssueQueryId(defaultQuery.getIssueQueryId());
					issueQueryList.add(0,view);
				}else {
					view.setIssueQueryId(0);
					issueQueryList.add(0, view);
				}
			}else {
				view.setIssueQueryId(0);
				issueQueryList.add(0,view);
			}
		}
		return issueQueryList;
	}

	public void setIssueQueryList(List<IssueQueryListView> issueQueryList) {
		this.issueQueryList = issueQueryList;
	}

	public List<IssueListView> getIssueList() throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, ParseException, CacheException {
		if(issueList == null){
//System.out.print(issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 12, 1));
//System.out.print(issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), 4, 1));
			//下边就是限制没登陆的人不许进行问题的访问.第一步先创建一个IssueProject对象,他的值就是用户登录时所选择的值issueLoginUser.getLoginProject();
			IssueProject proj = issueLoginUser.getLoginProject();
			//然后跟上边的项目ID再执行查询操作()
			//直接设置默认查询
			if(issueQueryId != null && issueQueryId > 0){
				setAttribute(CURRENT_QUERY_SESSION_KEY, issueQueryId);
				issueList = issueBiz.queryIssueListViewByQueryIdList(proj.getIssueProjectId(), issueQueryId, getPageIndex(), getRowsOfPage(), "UPDATE_TIME", "desc");
				if(getIssueLoginUser().getLoginUser().getInnerUserId() == null) {
					for(Iterator<IssueListView> it = issueList.iterator();it.hasNext();) {
						IssueListView view = it.next();
						IssueUsers reUser = issueBiz.queryIssueUsers(view.getReportUserId());
						IssueUsers asUser =issueBiz.queryIssueUsers(view.getAssignUserId());
						if(reUser.getInnerUserId() != null) {
							view.setReportUserName("develop");
						}
						if(asUser.getInnerUserId() != null){
							view.setAssignUserName("develop");
						}
//System.out.print(issueList.iterator().next().getPrioritiesId());
					}
				} 
			}else{
//System.out.print(getIssueLoginUser().getLoginUser().getInnerUserId());
				IssueProjectUserPrivileges userPrivilege = issueBiz.queryIssueProjectUserPrivileges(issueLoginUser.getLoginProject().getIssueProjectId(),issueLoginUser.getLoginUserId());
				IssueRoleDefaultQuery roledequery = issueBiz.queryIssueRoleDefaultQuery(issueLoginUser.getLoginProject().getIssueProjectId(), userPrivilege.getRoleId());
				if(roledequery != null) {
					issueQueryId = roledequery.getIssueQueryId();
					setAttribute(CURRENT_QUERY_SESSION_KEY, issueQueryId);
					issueList = issueBiz.queryIssueListViewByQueryIdList(proj.getIssueProjectId(), issueQueryId, getPageIndex(), getRowsOfPage(), "UPDATE_TIME", "desc");
					if(getIssueLoginUser().getLoginUser().getInnerUserId() == null) {
						for(Iterator<IssueListView> it = issueList.iterator();it.hasNext();) {
							IssueListView view = it.next();
							IssueUsers reUser = issueBiz.queryIssueUsers(view.getReportUserId());
							IssueUsers asUser =issueBiz.queryIssueUsers(view.getAssignUserId());
							if(reUser.getInnerUserId() != null) {
								view.setReportUserName("develop");
							}
							if(asUser.getInnerUserId() != null){
								view.setAssignUserName("develop");
							}
	//System.out.print(issueList.iterator().next().getPrioritiesId());
						}
					}
				}else{
					issueList = issueBiz.queryIssueListViewList(proj.getIssueProjectId(), getPageIndex(), getRowsOfPage(), "UPDATE_TIME", "desc");
					if(getIssueLoginUser().getLoginUser().getInnerUserId() == null) {
						for(Iterator<IssueListView> it = issueList.iterator();it.hasNext();) {
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
			
		}
		return issueList;
	}

	private int rowsCount = -1;
	//在这里,登录成功的issueLoginUser的相关信息都可以直接读取了.比如issueLoginUser.getLoginProject().getIssueProjectId就是得到当前登陆项目的id
	public int getRowsCount() {
		if(rowsCount < 0) {
			try {
				IssueProject proj = issueLoginUser.getLoginProject();
				if(issueQueryId != null && issueQueryId > 0){
					rowsCount = issueBiz.queryIssueListViewByQueryIdListCount(proj.getIssueProjectId(), issueQueryId);
				}else{
					rowsCount = issueBiz.queryIssueListViewListCount(proj.getIssueProjectId());
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return rowsCount;
	}
	
	public String search() throws Exception {
		if(getAttribute(CURRENT_QUERY_SESSION_KEY)  != (getIssueQueryId())  ) { 
			setPageIndex(0);
		}
		return execute();
	}
	
  private  List<IssueStatus> statusList;		
	
	public List<IssueStatus> getStatusList() throws DbException, SQLException, CacheException {
		if(statusList == null) {
			statusList = issueBiz.queryIssueStatusList(0, Integer.MAX_VALUE, "STATUS_ID", "asc");
			//修改statusList方法
		}
		return statusList;
	}
	
	private int statusId;

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String statechangebat() throws Exception {
		if(issueIds != null) {
			IssueComment comment = new IssueComment();
			Issue issue = null;
			IssueStatus oldStatus = null;
			for(int i=0;i<issueIds.length;i++) {
				 issue = issueBiz.queryIssue(issueIds[i]);
				 if(issue.getStatusId() != statusId) {
					 
					 oldStatus = issueBiz.queryIssueStatus(issue.getStatusId());
					 IssueStatus changeStatus = issueBiz.queryIssueStatus(statusId);
					 issueBiz.issueStatusChangeByIssueId(issueIds[i], statusId);
//					 IssueStatus oldStatus = issueBiz.queryIssueStatus(oldStatusId);
					 comment.setCommentTime(new Date());
					 comment.setCommentContent("改变状态从 \""  +oldStatus.getStatusName()+ "\" 更改为 \"" +changeStatus.getStatusName() +"\"");
					 comment.setCommentType(IssueCommentType.StateChange);
					 comment.setCommentUserId(issueLoginUser.getLoginUserId());
					 comment.setIssueId(issueIds[i]);
					 issueBiz.issueCommentAdd(comment);
					 //IssueUsers reUser = issueBiz.queryIssueUsers(issue.getReportUserId());
					 String[] userEmails = issueBiz.getCurrentProjectUser(issueLoginUser.getLoginProject().getIssueProjectId());
				     String mailSubject = "问题跟踪: 问题["+issue.getIssueId()+" "+issue .getIssueShortDesc()+"]更新";
					 String mailContent = "问题ID: "+issue.getIssueId()+",访问地址:"+issueUrlManage.getIssueEditUrl(issue.getIssueId())+"\n\n问题所属项目:"+getAttribute(CURRENT_LOGIN_MODOULE);
					try{
						sendmail.sendMail(userEmails, mailSubject, mailContent);	
					}catch(Exception e){
						e.printStackTrace();
					}
					 
				 }
			}
			//issueBiz.issueStatusChangeByIssueIds(issueIds, statusId);
		}
		return execute();
	}

	public common.service.email.SendEmail getSendmail() {
		return sendmail;
	}

	public void setSendmail(common.service.email.SendEmail sendmail) {
		this.sendmail = sendmail;
	}
	
}
