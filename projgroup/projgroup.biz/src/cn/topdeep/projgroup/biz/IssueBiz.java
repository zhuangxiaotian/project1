/**
 * 
 */
package cn.topdeep.projgroup.biz;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;

import cn.topdeep.projgroup.dao.BugtrackerDao;
import cn.topdeep.projgroup.dao.IssueDao;
import cn.topdeep.projgroup.entity.Issue;
import cn.topdeep.projgroup.entity.IssueComment;
import cn.topdeep.projgroup.entity.IssuePriorities;
import cn.topdeep.projgroup.entity.IssueProject;
import cn.topdeep.projgroup.entity.IssueProjectModule;
import cn.topdeep.projgroup.entity.IssueProjectUserPrivileges;
import cn.topdeep.projgroup.entity.IssueQuery;
import cn.topdeep.projgroup.entity.IssueRoleDefaultQuery;
import cn.topdeep.projgroup.entity.IssueRoles;
import cn.topdeep.projgroup.entity.IssueStateChangeDefine;
import cn.topdeep.projgroup.entity.IssueStatus;
import cn.topdeep.projgroup.entity.IssueUsers;
import cn.topdeep.projgroup.entity.User;
import cn.topdeep.projgroup.entity.bugtracker.BugPosts;
import cn.topdeep.projgroup.entity.bugtracker.Bugs;
import cn.topdeep.projgroup.entity.bugtracker.DbException;
import cn.topdeep.projgroup.entity.bugtracker.Priorities;
import cn.topdeep.projgroup.entity.bugtracker.Projects;
import cn.topdeep.projgroup.entity.bugtracker.Statuses;
import cn.topdeep.projgroup.entity.bugtracker.Users;
import cn.topdeep.projgroup.entity.data.issue.IssueCommentType;
import cn.topdeep.projgroup.entity.data.issue.IssuePrivilege;
import cn.topdeep.projgroup.entity.data.issue.IssueQueryCondition;
import cn.topdeep.projgroup.entity.data.issue.IssueType;
import cn.topdeep.projgroup.entity.data.issue.IssueUserState;
import cn.topdeep.projgroup.entity.data.issue.IssueUsersType;
import cn.topdeep.projgroup.entity.view.issue.IssueCommentListView;
import cn.topdeep.projgroup.entity.view.issue.IssueListView;
import cn.topdeep.projgroup.entity.view.issue.IssueProjectListView;
import cn.topdeep.projgroup.entity.view.issue.IssueProjectUserPrivilegesListView;
import cn.topdeep.projgroup.entity.view.issue.IssueQueryListView;
import cn.topdeep.projgroup.entity.view.issue.IssueRoleDefaultQueryListView;
import cn.topdeep.projgroup.entity.view.issue.IssueRolesView;
import cn.topdeep.projgroup.entity.view.issue.IssueStateChangeDefineListView;
import cn.topdeep.projgroup.entity.view.issue.IssueStatusNextListView;
import cn.topdeep.projgroup.entity.view.issue.IssueUsersListView;

import common.cache2.CacheException;
import common.privilege.MethodPrivilegeAttribute;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;

/**
 * @author gmtstu
 *
 */
public class IssueBiz extends BaseBiz {

	private IssueDao issueDao;
	
	private BugtrackerDao bugtrackerDao;
	
	public IssueDao getIssueDao() {
		return issueDao;
	}

	public void setIssueDao(IssueDao issueDao) {
		this.issueDao = issueDao;
	} 
	
//查询部分 
	//查询表IssueRoles?
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ROLE_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueRoles> queryIssueRoleList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException{
		return issueRolesSelectObjects(pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ROLE_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueRolesView> queryIssueRoleListViewList(int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueRoleListViewList(pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ROLE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public IssueRoles queryIssueRoles(int roleId) throws DbException, SQLException, CacheException{
		return issueRolesSelectByRoleId(roleId);
	}
	//不需要要权限
	public IssueRoles queryIssueLoginRoles(int roleId) throws DbException, SQLException, CacheException{
		return issueRolesSelectByRoleId(roleId);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ROLE_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public int queryIssueRolesListCount() throws SQLException {
		return issueDao.queryIssueRolesListCount();
	}
	
	//查询表IssueUsers 同上
	//引用 不能限制@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_USER_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueUsers> queryIssueUserList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issueUsersSelectObjects(pageIndex, rowsOfPage, orderField, order);
	}
	
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SEARCH_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueListView> queryIssueListViewByQueryConditionList(IssueQueryCondition condition, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueListViewByQueryConditionList(condition, pageIndex, rowsOfPage, orderField, order);
	}
	
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public String getQueryIssueListViewByQueryContidionListSql(IssueQueryCondition condition){
		return issueDao.getQueryIssueListViewByQueryContidionListSql(condition);
	}
	
	public String getQueryIssueListViewByQueryContidionListNoprojectSql(IssueQueryCondition condition){
		return issueDao.getQueryIssueListViewByQueryContidionListNoprojSql(condition);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SEARCH_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int getQueryIssueListViewByQueryContidionListCount(IssueQueryCondition condition) throws SQLException {
		return issueDao.getQueryIssueListViewByQueryContidionListCount(condition);
	}
	
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public List<IssueQueryListView> queryIssueQueryListViewList(int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueQueryListViewList(pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public int getQueryIssueQueryListViewListCount() throws SQLException {
		return issueDao.getQueryIssueQueryListViewListCount();
	}
	
	/**
	 * biz层调用dao层的查询问题跟踪系统用户列表的记录数
	 * @return
	 * @throws SQLException
	 */
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_USER_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public int queryIssueUsersListViewListCount() throws SQLException {
		return issueDao.queryIssueUsersListViewListCount();
	} 
	
	/**
	 * 为了不与项目中引用冲突,这里加S以区分表示用户管理界面显示的内部用户关联
	 * @param pageIndex
	 * @param rowsOfPage
	 * @param orderField
	 * @param order
	 * @return
	 * @throws DbException
	 * @throws SQLException
	 * @throws IllegalArgumentException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_USER_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueUsersListView> queryIssueUsersListViewList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueUsersListViewList(pageIndex, rowsOfPage, orderField, order);
	}
	
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_USER_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public IssueUsers queryIssueUsers(int issueUserId) throws DbException, SQLException, CacheException{
		return issueUsersSelectByIssueUserId(issueUserId);
	}
	
	//不需要权限
	public List<IssueProject> queryLoginIssueProjectList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException{
		return issueProjectSelectObjects("where PROJECT_ACTIVE = 1", pageIndex, rowsOfPage, orderField, order);
	}
	
	//引用 不能限制@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueProject> queryIssueProjectList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException{
		return issueProjectSelectObjects(pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PRIORITIES_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssuePriorities> queryIssuePrioritiesList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issuePrioritiesSelectObjects(pageIndex, rowsOfPage, orderField, order);
		
	}
	
	//查询表IssueProject 同上   方法修改为返回值改为  List<IssueProjectListView> 因为前台改为显示包含了issueusers表里的内容
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueProjectListView> queryIssueProjList(int pageIndex,int rowsOfPage, String orderField, String order) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueProjectListViewList(pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public int queryIssueProjectListViewListCount() throws SQLException {
		return issueDao.queryIssueProjectListViewListCount();
	}
	
	/**
	 * 登录成功后查询带条件(用户登录所在的项目)的问题列表
	 * @param issueProjectId
	 * @param pageIndex
	 * @param rowsOfPage
	 * @param orderField
	 * @param order
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SQLException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_QUERY_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="没有权限")
	public List<IssueListView> queryIssueListViewList(Integer issueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueListViewList(issueProjectId, pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_QUERY_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueListView> queryIssueListViewByQueryIdList(int issueProjectId, int queryId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return issueDao.queryIssueListViewByQueryIdList(issueProjectId, queryId, pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_QUERY_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public int queryIssueListViewByQueryIdListCount(int issueProjectId, int queryId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		return issueDao.queryIssueListViewByQueryIdListCount(issueProjectId, queryId);
	}
	
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueRoleDefaultQueryListView> queryIssueRoleDefaultQueryListViewList(Integer projId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueRoleDefaultQueryListViewList(projId, pageIndex, rowsOfPage, orderField, order);
	}
	
	//引用 不能限制@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_COMMENT_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueCommentListView> queryIssueCommentListViewList(int issueId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueCommentListViewList(issueId, pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_QUERY_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public int queryIssueListViewListCount(Integer issueProjectId) throws SQLException {
		return issueDao.queryIssueListViewListCount(issueProjectId);
	}
	
	//编辑页面中查找IssueStateChangeDefine实例
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public IssueStateChangeDefine queryIssueStateChangeDefine(int currentStatusId, int nextStatusId) throws DbException, SQLException, CacheException {
		return issueStateChangeDefineSelectByCurrentStatusIdNextStatusId(currentStatusId, nextStatusId);
	}
	
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public List<IssueStateChangeDefine> queryIssueStateChangeDefine(int currentStatusId) throws DbException, SQLException, CacheException {
		return issueStateChangeDefineSelectObjects(" where CURRENT_STATUS_ID = " +currentStatusId);
	}
	
	//不需要权限
	public IssueProjectUserPrivileges queryIssueProjectUserPrivileges(int issueProjectId, int issueUserId) throws DbException, SQLException, CacheException {
		return issueProjectUserPrivilegesSelectByIssueProjectIdIssueUserId(issueProjectId, issueUserId);
	}
	
//"内部用户表User"拿数据  用在Projectedit.java里显示默认用户的集合
	public List<User> queryUserList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return userSelectObjects(pageIndex, rowsOfPage, orderField, order);
	}
//IssueProject 拿数据 显示在 ProjectModuleEdit 页面
	public List<IssueProject> queryProjList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issueProjectSelectObjects(pageIndex, rowsOfPage, orderField, order);
	}
	
	//查询status
	//引用 不能限制@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueStatus> queryIssueStatusList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException{
		return issueStatusSelectObjects(pageIndex, rowsOfPage, orderField, order);
	}
	
	//引用 不能限制@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public IssueStatus queryIssueStatus(int statusId) throws DbException, SQLException, CacheException{
		return issueStatusSelectByStatusId(statusId);
	}
	
	public IssueStatus queryIssueStatusByStatusName(String statusName) throws cn.topdeep.projgroup.entity.DbException, SQLException, CacheException {
		return issueStatusSelectByStatusName(statusName);
	}
	
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public int queryIssueStatusListCount() throws SQLException {
		return issueDao.queryIssueStatusListCount();
	} 
	//查询 IssuePriorities
	
	//引用 不能限制@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PRIORITIES_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssuePriorities> queryIssuePrioritlesList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issuePrioritiesSelectObjects(pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PRIORITIES_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public IssuePriorities queryIssuePrioritles (byte prioritiesId) throws DbException, SQLException, CacheException {
		return issuePrioritiesSelectByPrioritiesId(prioritiesId);
	}
	
	public int queryIssuePrioritlesListCount() throws SQLException {
		return issueDao.queryIssuePrioritlesListCount();
	}
	//查询 IssueProjectModule 第一种为查找所有的　　 第２中为查询相关联的ISSUE_PROJECT_ID的名称
	/**
	 * 查找IssueProjectModule列表此方法只能查找到ID不能显示
	 * @throws CacheException 
	 * @throws CacheException 
	 */
	public List<IssueProjectModule> queryIssueProjectModuleList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issueProjectModuleSelectObjects(pageIndex, rowsOfPage, orderField, order);
	}
	/**
	 * 查找IssueProjectModule得关联列表,注意中间加S的为后来需要查询新内容而增加的......
	 * @throws CacheException 
	 * @throws CacheException 
	 */
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MOUDLE_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueProjectModule> queryIssueProjectsModuleList(int issueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issueProjectModuleSelectObjects(" where ISSUE_PROJECT_ID = "+issueProjectId,pageIndex, rowsOfPage, orderField, order);
	}
	
	public int queryIssueProjectsModuleListCount(int issueProjectId) throws SQLException {
		return issueDao.queryIssueProjectsModuleListCount(issueProjectId);
	}
	
	//查询  IssueProjectUserPrivileges
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_USER_PRIVILEGE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public List<IssueProjectUserPrivilegesListView> queryIssueProjectUserPrivilegesList(int issueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.IssueProjectUserPrivilegesListViewList(issueProjectId, pageIndex, rowsOfPage, orderField, order);
	}
	
	public List<IssueProjectUserPrivilegesListView> queryIssueProjectUserPrivilegesListViewListByUserId(int userId) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueProjectUserPrivilegesListViewListByUserId(userId);
	}
	
	public int queryIssueProjectUserPrivilegesListViewListCount(int issueProjectId) throws SQLException {
		return issueDao.queryIssueProjectUserPrivilegesListViewListCount(issueProjectId);
	}
	

	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MOUDLE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public IssueProjectModule queryIssueProjectModule(int issueProjectModuleId) throws DbException, SQLException, CacheException {
		return issueProjectModuleSelectByIssueProjectModuleId(issueProjectModuleId);
	}

	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUSCHANGE_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueStateChangeDefineListView> queryIssueStateChangeDefineList(int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueStateChangeDefineListViewList(pageIndex, rowsOfPage, orderField, order);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUSCHANGE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public List<IssueStateChangeDefine> queryIssueStateChangeDefineList(int currentStatusId, int nextStatusId, int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issueStateChangeDefineSelectObjects(" where CURRENT_STATUS_ID= "+currentStatusId+ "and nextStatusId="+nextStatusId,pageIndex, rowsOfPage, orderField, order);
	}
	//未加权限
	public List<IssueStateChangeDefine> queryIssueStateChangeDefineList(int currentStatusId, int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issueStateChangeDefineSelectObjects(" where CURRENT_STATUS_ID= "+currentStatusId, pageIndex, rowsOfPage, orderField, order);
	}
	//暂时未加权限
	public List<IssueStatusNextListView> queryIssueStateNextListViewByCurrentStatusId(int currentStatusId, int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueStateNextListByCurrentStatusId(currentStatusId, pageIndex, rowsOfPage, orderField, order);
	}
	
	//
	
	//显示所有的Comment
	//引用 不能限制@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_COMMENT_MANAGE,FuncOperate=PrivilegeOperate.Read,FailDesc="您没有相关的权限")
	public List<IssueComment> queryIssueCommentList(int issueId, int pageIndex, int rowsOfPage, String orderField, String order) throws DbException, SQLException, CacheException {
		return issueCommentSelectObjects(" where ISSUE_ID =" +issueId, pageIndex, rowsOfPage, orderField, order);
	}
	
	public int queryIssueStateChangeDefineListViewListCount() throws SQLException {
		return issueDao.queryIssueStateChangeDefineListViewListCount();
	}
	//这个是什么意思哦
	public String queryLoginName(String loginName) throws DbException, SQLException, CacheException {
		List<IssueUsers> users = issueUsersSelectObjects();
		for(IssueUsers user : users) {
			if(user.getLoginName() == loginName)
				break;
		}
		return loginName;
	}
	
	//select issue by issueId
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public Issue queryIssue(int issueId) throws DbException, SQLException, CacheException {
		return issueSelectByIssueId(issueId);
	}
	
	//select issueComent by issueCommentId
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_COMMENT_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public IssueComment queryIssueComment(int issueCommentId) throws DbException, SQLException, CacheException {
		return issueCommentSelectByIssueCommentId(issueCommentId);
	}
	
	
//增加 角色.用户.项目
	//增加role.
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ROLE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueRoleAdd(IssueRoles role) throws DbException, SQLException, CacheException{
		issueRolesInsert(role);
	}
	
	//
	
	
	//增加user
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_USER_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueUserAdd(IssueUsers user) throws DbException, SQLException, CacheException {
		issueUsersInsert(user);
	}
	
	//增加project
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueProjectAdd(IssueProject AIssueProject) throws DbException, SQLException, CacheException {
		issueProjectInsert(AIssueProject);		
	}
	
	//增加 status
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueStatusAdd(IssueStatus AIssueStatus) throws DbException, SQLException, CacheException {
		issueStatusInsert(AIssueStatus);		
	}
	
	//增加 sssssss
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PRIORITIES_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issuePrioritiesAdd(IssuePriorities priorities) throws DbException, SQLException, CacheException {
		issuePrioritiesInsert(priorities);
		
	}
	//
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MOUDLE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueProjectMoudleAdd(IssueProjectModule projMoudle) throws DbException, SQLException, CacheException {
		issueProjectModuleInsert(projMoudle);
	}
	
	//add IssueStateChangeDefine
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUSCHANGE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueStateChangeDefineAdd(IssueStateChangeDefine define) throws DbException, SQLException, CacheException {
		issueStateChangeDefineInsert(define);
	}
	
	//add
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_USER_PRIVILEGE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueProjectUserPrivilegesAdd(IssueProjectUserPrivileges userPrivileges) throws DbException, SQLException, CacheException {
		issueProjectUserPrivilegesInsert(userPrivileges);
	}
	
	//add issue
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueAdd(Issue issue, IssueComment issueComment ) throws Exception {
		//开始事务
		issueDao.getDataVisit().beginTransaction();
		try {
			issueInsert(issue);
			if(issueComment != null){
				//不需要从新从书库库中重新查找issueId,issue插入以后他的id值自动赋值
				issueComment.setIssueId(issue.getIssueId());
				issueCommentInsert(issueComment);
			}
			issueDao.getDataVisit().commitTransaction();
		} catch (Exception e) {
			issueDao.getDataVisit().rollBackTransaction();
			throw e;
		}
	}
	
	//updateAdd ISSUE
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int issueUpdateAdd(Issue issue, IssueComment issueComment, String timeStamp) throws Exception {
		issueDao.getDataVisit().beginTransaction();
		try{
			//加上时间戳的更新....
			int ret = issueUpdate(issue, " and TIME_STAMP = "+timeStamp);
			if(ret > 0){
				if(issueComment != null) {
					issueComment.setIssueId(issue.getIssueId());
					issueCommentInsert(issueComment);
				}
			}
			issueDao.getDataVisit().commitTransaction();
			return ret;
		}catch(Exception e) {
			issueDao.getDataVisit().rollBackTransaction();
			throw e;
		}
		
	}
	
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public IssueQuery queryIssueQuery(int issueQueryId) throws DbException, SQLException, CacheException {
		return issueQuerySelectByIssueQueryId(issueQueryId);
	}
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueQueryAdd(IssueQuery issueQuery) throws DbException, SQLException, CacheException {
		issueQueryInsert(issueQuery);
	}
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueQueryUpdate(IssueQuery issueQuery, int issueQueryId) throws DbException, SQLException, CacheException {
		issueQueryUpdate(issueQuery, "and ISSUE_QUERY_ID =" + issueQueryId);
	}
	
	//add comment
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueCommentAdd(IssueComment issueComment) throws DbException, SQLException, CacheException {
		issueCommentInsert(issueComment);
	}
	//ROLE 删除两种方法 用第2中删除第一种为1个1个删除!!可以参考Projecct的删除方法;
	//暂时未用到此方法@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueRoleDelete(int ARoleId) throws DbException, SQLException, CacheException{
		issueRolesDeleteByRoleId(ARoleId);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ROLE_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueRoleDelete(int[] roleIds) throws DbException, SQLException, CacheException{
		for(int roleId : roleIds){
			issueRoleDelete(roleId);
		}
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueRoleDefaultQueryDelete(int issueProjectId, int roleId) throws DbException, SQLException, CacheException {
		issueRoleDefaultQueryDeleteByIssueProjectIdRoleId(issueProjectId, roleId);
	}
	 
	
	//删除users 第一个自己写的删除只能一个一个的删除
//	public void issueUserDelete(int ARoleId) throws DbException, SQLException{
//		issueDao.issueRolesDeleteByRoleId(ARoleId);
//	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_USER_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueUserDelete(int[] userIds) throws DbException, SQLException, CacheException {
		for (int userId : userIds)
			issueUsersDeleteByIssueUserId(userId);
	}
	
	//删除Project
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueProjectDelete(int[] projIds) throws DbException, SQLException, CacheException{
		for (int issueProjectId : projIds)
			issueProjectDeleteByIssueProjectId(issueProjectId);
	}
	
	//删除Status
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueStatusDelete(byte[] statusIds) throws DbException, SQLException, CacheException{
		for (int statusId : statusIds)
			issueStatusDeleteByStatusId(statusId);
	}
	
	//删除IssuePriorities
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PRIORITIES_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issuePrioritiesDelete(byte[] prioritiesIds) throws DbException, SQLException, CacheException {
		for (int prioritiesId : prioritiesIds)
			issuePrioritiesDeleteByPrioritiesId((byte) prioritiesId);
	}
	
	//delet modles
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MOUDLE_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueProjectModuleDelete(int[] moduleIds) throws DbException, SQLException, CacheException {
		for (int moduleId : moduleIds)
			issueProjectModuleDeleteByIssueProjectModuleId(moduleId);
	}
	
	//delet issueProjectUserPrivileges  单个删除不需要遍历,直接调用删除就可以了
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_USER_PRIVILEGE_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueProjectUserPrivilegesDelete(int issueProjectId, int issueUserId) throws DbException, SQLException, CacheException {
			issueProjectUserPrivilegesDeleteByIssueProjectIdIssueUserId(issueProjectId, issueUserId);
	}
	
	//delete IssueStateChangeDefine 单个删除
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUSCHANGE_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueStateChangeDefineDelete(int currentStatusId, int nextStatusId) throws DbException, SQLException, CacheException {
		issueStateChangeDefineDeleteByCurrentStatusIdNextStatusId(currentStatusId, nextStatusId);
	}
	
	//delete worklog
	public void WorkLogDelete(int[] workLogIds) throws DbException, SQLException, CacheException {
		for(int workLogId : workLogIds){
			workLogDeleteByWorkLogId(workLogId);
		}
	}
	
	//注意删除的权限
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_MANAGE,FuncOperate=PrivilegeOperate.Delete,FailDesc="您没有相关的权限")
	public void issueDelete(int[] issueIds) throws DbException, SQLException, CacheException {
		for (int issueId : issueIds)
			issueDeleteByIssueId(issueId);
	}
	
	//update  role数据
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ROLE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueRoleUpdate(IssueRoles role) throws DbException, SQLException, CacheException {
		issueRolesUpdate(role);
	}
	
	//update  USER数据
	//@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_USER_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueUserUpdate(IssueUsers user) throws DbException, SQLException, CacheException {
		issueUsersUpdate(user);
	}

	
	
	//验证添加的project项目名称是否重复
	public IssueProject queryIssueProject(String issueProjectName) throws DbException, SQLException, CacheException{
		return issueProjectSelectByIssueProjectName(issueProjectName);
	}
	//验证添加的issueUsers名称是否重复
	public IssueUsers  queryIssueUsers(String loginName) throws DbException, SQLException, CacheException {
		return issueUsersSelectByLoginName(loginName);
	}
	
	public IssueRoleDefaultQuery queryRoleDefaultQuery(int projId, int roleId) throws DbException, SQLException, CacheException {
		return issueRoleDefaultQuerySelectByIssueProjectIdRoleId(projId, roleId);
	} 
	
	//不需要权限
	public IssueUsers queryIssueProjectUsers(int issueProjectId, String loginName) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueDao.queryIssueProjectUser(issueProjectId, loginName);
	}
	
	public List<IssueProjectUserPrivileges> queryIssueUsersProjectList(int userId) throws DbException, SQLException, CacheException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		return issueProjectUserPrivilegesSelectObjectsByIssueUserId(userId);
	}
	
	//验证添加的issueRoles名称是否重复   已在roleName上加了唯一索引 但是不能让数据库报错啊,所以要在页面显示友好的错误提示;
	public IssueRoles queryIssueRoles(String roleName) throws DbException, SQLException, CacheException {
		return issueRolesSelectByRoleName(roleName);
	}
	////验证添加的issueProjectMoudle名称是否重复
	public IssueProjectModule  queryIssueProjectModule(int issueProjectId,String moduleName) throws DbException, SQLException, CacheException {
		return issueProjectModuleSelectByIssueProjectIdModuleName(issueProjectId, moduleName);
	}
	////验证添加的???????等待添加??????是否重复
	//验证添加的???????等待添加??????是否重复
	
	
	//update   Project数据
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int issueProjectUpdate(IssueProject project) throws DbException, SQLException {
		return super.issueProjectUpdate(project);
	}
	

	//update  status
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int issueStatusUpdate(IssueStatus status) throws DbException, SQLException {
		return super.issueStatusUpdate(status);
	}
	//update 
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PRIORITIES_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int issuePrioritiesUpdate(IssuePriorities priorities) throws DbException, SQLException {
		return super.issuePrioritiesUpdate(priorities);
		
	}
	//update  issueProjectMoudleUpdate
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MOUDLE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int issueProjectMoudleUpdate(IssueProjectModule projMoudle) throws DbException, SQLException, CacheException {
		return super.issueProjectModuleUpdate(projMoudle);
		
	}
	
	//update 
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUSCHANGE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int issueStateChangeDefineUpdate(IssueStateChangeDefine define) throws DbException, SQLException {
		return super.issueStateChangeDefineUpdate(define);
	}
	//update
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_USER_PRIVILEGE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int issueProjectUserPrivilegesUpdate(IssueProjectUserPrivileges userPrivileges) throws DbException, SQLException {
		return super.issueProjectUserPrivilegesUpdate(userPrivileges);
	}
	
	
	//Role 修改状态
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ROLE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueRoleChanageState(int[] roleIds, byte newState) throws DbException, SQLException, CacheException{
		if(roleIds == null){
			return;
		}
		for(int i=0;i<roleIds.length;i++){
			IssueRoles role = issueRolesSelectByRoleId(roleIds[i]);
			if(role != null){
				role.setRoleState(newState);
				issueRolesUpdate(role);
			}
		}
	}
	
	//User修改状态
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_USER_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueUserChanageState(int[] userIds, byte newState) throws DbException, SQLException, CacheException {
		if(userIds == null){
			return;
		}
		for(int i=0;i<userIds.length;i++){
			IssueUsers user = issueUsersSelectByIssueUserId(userIds[i]);
			if(user != null){
				user.setUserState(newState);
				issueUsersUpdate(user);
			}
		}
	}
	
	//project 修改状态
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PROJECT_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueprojectChanageState(int[] projIds, boolean value) throws DbException, SQLException, CacheException {
		if(projIds == null){
			return;
		}
		for(int i=0;i<projIds.length;i++){
			IssueProject proj = issueProjectSelectByIssueProjectId(projIds[i]);
			if(proj != null){
				proj.setProjectActive(value);
				issueProjectUpdate(proj);
			}
		}
	}
	/**
	 * 批量修改问题状态根据多个问题id,下个状态
	 * @param issueIds
	 * @param statusId
	 * @throws cn.topdeep.projgroup.entity.DbException
	 * @throws SQLException
	 * @throws CacheException 
	 */
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ISSUESTATECHANGE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueStatusChangeByIssueIds(int[] issueIds, int statusId) throws cn.topdeep.projgroup.entity.DbException, SQLException, CacheException {
		if(issueIds == null) {
			return ;
		}
		for(int i=0;i<issueIds.length;i++) {
			Issue issue = issueSelectByIssueId(issueIds[i]);
			if(issue != null) {
				issue.setStatusId(statusId);
				issueUpdate(issue);
			}
		}
	}
	/**
	 * 根据问题id,下个状态更新问题状态
	 * @param issueId
	 * @param statusId
	 * @throws cn.topdeep.projgroup.entity.DbException
	 * @throws SQLException
	 * @throws CacheException 
	 */
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_ISSUESTATECHANGE_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueStatusChangeByIssueId(int issueId, int statusId) throws cn.topdeep.projgroup.entity.DbException, SQLException, CacheException {
		if(issueId < 0) {
			return ;
		}
			Issue issue = issueSelectByIssueId(issueId);
			if(issue != null) {
				issue.setUpdateTime(new Date());
				issue.setStatusId(statusId);
				issueUpdate(issue);
			}
				
	}
	
	
	//status 修改状态
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_STATUS_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueStatusChanageState(byte[] statusIds, boolean value) throws DbException, SQLException, CacheException {
		if(statusIds == null){
			return;
		}
		for(int i=0;i<statusIds.length;i++){
			IssueStatus status = issueStatusSelectByStatusId(statusIds[i]);
			if(status != null){
				status.setIsDefault(value);
				issueStatusUpdate(status);
			}
		}
	}
	//Prioritles 修改状态
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_PRIORITIES_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issuePrioritiesChanageState(byte[] prioritiesIds, boolean value) throws DbException, SQLException, CacheException {
		if(prioritiesIds == null){
			return;
		}
		for(int i=0;i<prioritiesIds.length;i++){
			IssuePriorities priorities = issuePrioritiesSelectByPrioritiesId(prioritiesIds[i]);
			if(priorities != null){
				priorities.setIsDefault(value);
				issuePrioritiesUpdate(priorities);
			}
		}
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public void issueRoleDefaultQueryAdd(IssueRoleDefaultQuery roleDeafultQuery) throws DbException, SQLException, CacheException {
		issueRoleDefaultQueryInsert(roleDeafultQuery);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public int issueRoleDefaultQueryUpdate(IssueRoleDefaultQuery roleDeafultQuery) throws DbException, SQLException {
		return issueRoleDefaultQueryUpdate(roleDeafultQuery);
	}
	
	@MethodPrivilegeAttribute(FuncModule=IssuePrivilege.ISSUE_SQL_MANAGE,FuncOperate=PrivilegeOperate.Write,FailDesc="您没有相关的权限")
	public  IssueRoleDefaultQuery  queryIssueRoleDefaultQuery(Integer projId, int roleId) throws DbException, SQLException, CacheException {
		return issueRoleDefaultQuerySelectByIssueProjectIdRoleId(projId, roleId);
	}

	public BugtrackerDao getBugtrackerDao() {
		return bugtrackerDao;
	}

	public void setBugtrackerDao(BugtrackerDao bugtrackerDao) {
		this.bugtrackerDao = bugtrackerDao;
	}
	

	
	//导出数据
	public void importOldData() throws DbException, SQLException, CacheException {
		//从源数据库读数据(bugList);
		List<Bugs> bugList = bugtrackerDao.BugsselectObjects(0, Integer.MAX_VALUE, "BG_ID", "asc");
		Hashtable<Integer, Integer> userAccordList = new Hashtable<Integer, Integer>();  //用户记录
		Hashtable<Integer, Integer> statusAccordList = new Hashtable<Integer, Integer>(); //状态	
		Hashtable<Integer, Byte> prioritiesAccordList = new Hashtable<Integer, Byte>(); //优先级
		Hashtable<Integer, Integer> projAccordList = new Hashtable<Integer, Integer>(); //项目
		Hashtable<String, Integer> moudleAccordList = new Hashtable<String, Integer>(); //状态
		Hashtable<Integer, Integer> issueAccordList = new Hashtable<Integer, Integer>(); //问题
		
		if(bugList != null) {
			for(Iterator<Bugs> it = bugList.iterator();it.hasNext();) {
				Bugs bugs = it.next();
				if(bugs != null) {
					if(!userAccordList.containsKey(bugs.getBgReportedUser())){  //已检查
						//create new user
						Users reuser = bugtrackerDao.UsersSelectByUsId(bugs.getBgReportedUser());
						IssueUsers issueUser = null;
						
						issueUser = issueUsersSelectByLoginName(reuser.getUsUsername());
						if(issueUser == null){
							issueUser = new IssueUsers();
							issueUser.setIssueUserName(reuser.getUsFirstname() + reuser.getUsLastname());
							issueUser.setLoginName(reuser.getUsUsername());
							issueUser.setIssueUserType(IssueUsersType.out);
							issueUser.setUserState(IssueUserState.Enabled);
							issueUser.setLoginPassword(getMd5Password("123456"));
							issueUsersInsert(issueUser);
						}
						
						userAccordList.put(bugs.getBgReportedUser(), issueUser.getIssueUserId());
					}
					
					if(!userAccordList.containsKey(bugs.getBgAssignedToUser())) { //已检查
						//creat user
						Users asuser = bugtrackerDao.UsersSelectByUsId(bugs.getBgAssignedToUser());
						IssueUsers issueasuser = issueUsersSelectByLoginName(asuser.getUsUsername());
						
						if(issueasuser == null) {
							issueasuser = new IssueUsers();
							issueasuser.setIssueUserName(asuser.getUsFirstname() + asuser.getUsLastname());
							issueasuser.setLoginName(asuser.getUsUsername());
							issueasuser.setIssueUserType(IssueUsersType.out);
							issueasuser.setUserState(IssueUserState.Enabled);
							issueasuser.setLoginPassword(getMd5Password("123456"));
							issueUsersInsert(issueasuser);
						}
						userAccordList.put(bugs.getBgAssignedToUser(), issueasuser.getIssueUserId());
					}
					
					
					if(!statusAccordList.containsKey(bugs.getBgStatus())) {  //状态判断是否存在  已检查
						Statuses bgstatus = bugtrackerDao.StatusesSelectByStId(bugs.getBgStatus());
						IssueStatus issueStatus = issueStatusSelectByStatusName(bgstatus.getStName());
						
						if(issueStatus == null) {
							issueStatus = new IssueStatus();
							
							issueStatus.setStatusName(bgstatus.getStName());  //设置状态名称
							issueStatus.setStatusSort(bgstatus.getStSortSeq()); //设置状态顺序
							//状态是否默认  这里判断一下赋值
							if(bgstatus.getStDefault() == 1) {
								issueStatus.setIsDefault(true);
							}
							issueStatusInsert(issueStatus);
						}
						statusAccordList.put(bugs.getBgStatus(), issueStatus.getStatusId());
					}
					
					if(!prioritiesAccordList.containsKey(bugs.getBgPriority())) {
						Priorities oldpriorities = bugtrackerDao.PrioritiesSelectByPrId(bugs.getBgPriority());
						IssuePriorities issuePriorities = issuePrioritiesSelectByPrioritiesName(oldpriorities.getPrName());
						
						if(issuePriorities == null) {
							issuePriorities = new IssuePriorities();
							//检查后赋值
							if(oldpriorities.getPrDefault() == 1) {                      
								issuePriorities.setIsDefault(true);
							}
							issuePriorities.setPrioritiesId((byte)oldpriorities.getPrId());
							issuePriorities.setPrioritiesName(oldpriorities.getPrName());
							issuePrioritiesInsert(issuePriorities);
						}
						prioritiesAccordList.put(bugs.getBgPriority(), issuePriorities.getPrioritiesId());
					}
					
					if(!projAccordList.containsKey(bugs.getBgProject())) {  //已检查
						Projects oldprojects = bugtrackerDao.ProjectsSelectByPjId(bugs.getBgProject());
						IssueProject project = issueProjectSelectByIssueProjectName(oldprojects.getPjName());

						//先加用户
						if(!userAccordList.containsKey(oldprojects.getPjDefaultUser())) {
							Users oldpjreuser = bugtrackerDao.UsersSelectByUsId(oldprojects.getPjDefaultUser());
							IssueUsers pjreuser = issueUsersSelectByLoginName(oldpjreuser.getUsUsername());
							if(pjreuser == null) {
								pjreuser = new IssueUsers();
								pjreuser.setLoginName(oldpjreuser.getUsUsername());
								pjreuser.setIssueUserName(oldpjreuser.getUsFirstname()+ oldpjreuser.getUsLastname());
								pjreuser.setIssueUserType(IssueUsersType.out);
								pjreuser.setUserState(IssueUserState.Enabled);
								pjreuser.setLoginPassword(getMd5Password("123456"));
								issueUsersInsert(pjreuser);
							}
							userAccordList.put(oldprojects.getPjDefaultUser(), pjreuser.getIssueUserId());
						}
						
						if(!userAccordList.containsKey(oldprojects.getPjAutoAssignDefaultUser())) {
							Users oldasuser =bugtrackerDao.UsersSelectByUsId(oldprojects.getPjAutoAssignDefaultUser());
							if(oldasuser != null) {
								IssueUsers issueasuser = issueUsersSelectByLoginName(oldasuser.getUsUsername());
								
								if(issueasuser == null) {
									issueasuser = new IssueUsers();
									issueasuser.setLoginName(oldasuser.getUsUsername());
									issueasuser.setIssueUserName(oldasuser.getUsFirstname() + oldasuser.getUsLastname());
									issueasuser.setIssueUserType(IssueUsersType.out);
									issueasuser.setUserState(IssueUserState.Enabled);
									issueasuser.setLoginPassword(getMd5Password("123456"));
									issueUsersInsert(issueasuser);
								}
								userAccordList.put(oldprojects.getPjAutoAssignDefaultUser(), issueasuser.getIssueUserId());
							}
						}
						
						if(!userAccordList.containsKey(oldprojects.getPjAutoSubscribeDefaultUser())) {
							Users oldautouser = bugtrackerDao.UsersSelectByUsId(oldprojects.getPjAutoSubscribeDefaultUser());
							if(oldautouser != null) {
								IssueUsers autouser = issueUsersSelectByLoginName(oldautouser.getUsUsername());
								
								if(autouser == null) {
									autouser = new IssueUsers();
									autouser.setLoginName(oldautouser.getUsUsername());
									autouser.setIssueUserType(IssueUsersType.out);
									autouser.setIssueUserName(oldautouser.getUsFirstname() + oldautouser.getUsLastname());
									autouser.setLoginPassword(getMd5Password("123456"));
									autouser.setUserState(IssueUserState.Enabled);
									issueUsersInsert(autouser);
								}
								userAccordList.put(oldprojects.getPjAutoSubscribeDefaultUser(), autouser.getIssueUserId());
							}
						}
						
						if(project == null) { //已检查
							project = new IssueProject();
							project.setIssueProjectName(oldprojects.getPjName());
							project.setProjectActive(true);
							project.setDefaultUserId(userAccordList.get(oldprojects.getPjDefaultUser()));
							issueProjectInsert(project);
						}
						projAccordList.put(bugs.getBgProject(), project.getIssueProjectId());
					}
					
					//加入模块
					if(!moudleAccordList.containsKey(bugs.getBgProjectCustomDropdownValue1())) {
						//判断一下往哈希表里边放置时是否为空
						if(!StringUtils.isNullOrEmpty(bugs.getBgProjectCustomDropdownValue1())) {
							IssueProjectModule moudle =issueProjectModuleSelectByIssueProjectIdModuleName(projAccordList.get(bugs.getBgProject()), bugs.getBgProjectCustomDropdownValue1());
							
							if(moudle == null) {
								moudle = new IssueProjectModule();
								moudle.setIssueProjectId(projAccordList.get(bugs.getBgProject()));
								moudle.setModuleName(bugs.getBgProjectCustomDropdownValue1());
								issueProjectModuleInsert(moudle);
								moudleAccordList.put(bugs.getBgProjectCustomDropdownValue1(), moudle.getIssueProjectModuleId());
							}
							moudleAccordList.put(bugs.getBgProjectCustomDropdownValue1(), moudle.getIssueProjectModuleId());
						}
					}
					
					//新Issue数据库插入
					Issue issue = null;
					if(!issueAccordList.containsKey(bugs.getBgId())) {
						//检查数据库有没这个问题....好像不行...根据什么找呢????
								issue = new Issue();
								issue.setAssignUserId(userAccordList.get(bugs.getBgAssignedToUser()));
								issue.setIssueProjectId(projAccordList.get(bugs.getBgProject()));
								
								//也相应检查一下;
								if(bugs.getBgProjectCustomDropdownValue1() != null) {
									issue.setIssueProjectModuleId(moudleAccordList.get(bugs.getBgProjectCustomDropdownValue1()));   //暂时设为null
								}else {
									issue.setIssueProjectModuleId(moudleAccordList.get("defaultMoudle"));
								}
								
								issue.setIssueShortDesc(bugs.getBgShortDesc());
								issue.setIssueType(IssueType.normal); //源数据没包含.
								issue.setPrioritiesId(prioritiesAccordList.get(bugs.getBgPriority()));  
								issue.setReportTime(bugs.getBgReportedDate());
								issue.setReportUserId(userAccordList.get(bugs.getBgReportedUser()));
								issue.setStatusId(statusAccordList.get(bugs.getBgStatus()));
								issue.setUpdateTime(bugs.getBgLastUpdatedDate());
								issueInsert(issue);
								
								issueAccordList.put(bugs.getBgId(), issue.getIssueId());
								//导入相应注释;
								List<BugPosts> bugPostsList = bugtrackerDao.BugPostsselectObjects(" where BP_BUG =" +bugs.getBgId(), 0, Integer.MAX_VALUE, "BP_ID", "asc");
								Hashtable<Integer, Integer> issueCommentAccordList = new Hashtable<Integer, Integer>();
								if(bugPostsList != null) {
									for(Iterator<BugPosts> its = bugPostsList.iterator(); its.hasNext();) {
										BugPosts bugposts = its.next();
										if(bugposts != null) {
											//先添加用户
											if(!userAccordList.containsKey(bugposts.getBpUser())) {
												Users bugpostsuser = bugtrackerDao.UsersSelectByUsId(bugposts.getBpUser());
												IssueUsers issuebugpostsuser = issueUsersSelectByLoginName(bugpostsuser.getUsUsername());
												
												if(issuebugpostsuser == null) {
													issuebugpostsuser = new IssueUsers();
													issuebugpostsuser.setLoginName(bugpostsuser.getUsUsername());
													issuebugpostsuser.setIssueUserName(bugpostsuser.getUsFirstname() + bugpostsuser.getUsLastname());
													issuebugpostsuser.setIssueUserType(IssueUsersType.out);
													issuebugpostsuser.setLoginPassword(getMd5Password("123456"));
													issuebugpostsuser.setUserState(IssueUserState.Enabled);
													issueUsersInsert(issuebugpostsuser);
												}
												userAccordList.put(bugposts.getBpUser(), issuebugpostsuser.getIssueUserId());
											}
											
											if(!issueCommentAccordList.containsKey(bugposts.getBpId())) {
												IssueComment comment = new IssueComment();
												//类型判断
												if(!StringUtils.isNullOrEmpty(bugposts.getBpType())) {
													if(bugposts.getBpType().equalsIgnoreCase("update")) {    
														comment.setCommentType(IssueCommentType.StateChange);
													}else {
														comment.setCommentType(IssueCommentType.Normal);
													}
												}
												
												if(!StringUtils.isNullOrEmpty(bugposts.getBpFile())) {
													comment.setAttachFilePath("/upload/"+ bugposts.getBpBug()+ "_"+ bugposts.getBpId()+ "_"+ bugposts.getBpFile());
													comment.setAttachFileSize(bugposts.getBpSize());
													comment.setAttachFileType(bugposts.getBpContentType());
													comment.setAttachThumbPath("/upload/"+ bugposts.getBpBug()+ "_"+ bugposts.getBpId()+ "_"+ bugposts.getBpFile());
												}
												comment.setCommentContent(bugposts.getBpComment());
												comment.setCommentTime(bugposts.getBpDate());
												comment.setCommentUserId(userAccordList.get(bugposts.getBpUser()));
												comment.setIssueId(issueAccordList.get(bugposts.getBpBug()));
												if(bugposts.getBpParent() != null) {
													comment.setParentCommentId(bugposts.getBpParent());
												}
												issueCommentInsert(comment);
												issueCommentAccordList.put(bugposts.getBpId(), comment.getIssueCommentId());
											}
										}
									}
								}
						}
					}
				}
			}
		}
	/**
	 * 
	 * @param smtphost:邮件服务器
	 * @param user:邮件服务器登录名
	 * @param password:邮件服务器登录密码
	 * @param from:发信人地址
	 * @param to:收信人地址
	 * @param subject:主题
	 * @param body:内容
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 */
	public void sendEmail(String smtphost, String user,String password,String from,String to,String subject,String body) throws MessagingException, UnsupportedEncodingException {
		 Properties props = new Properties();
         props.put("mail.smtp.host", smtphost);
         props.put("mail.smtp.auth","true");
         Session ssn = Session.getInstance(props, null);

         MimeMessage message = new MimeMessage(ssn);

         InternetAddress fromAddress = new InternetAddress(from);
         message.setFrom(fromAddress);
         InternetAddress toAddress = new InternetAddress(to);
//   多人
//         InternetAddress[] toAddress = new InternetAddress[to.length];
//         for (int i = 0; i < to.length; i++) 
//         { 
//         System.out.println("发送到:" + to[i]); 
//         toAddress[i] = new InternetAddress(to[i]); 
//         }
//         message.setRecipients(type, addresses);
         message.addRecipient(Message.RecipientType.TO, toAddress);
         message.setSubject(subject,"UTF-8");
         message.setText(body);

         Transport transport = ssn.getTransport("smtp");
         transport.connect(smtphost, user, password);
         transport.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
         //transport.send(message);
         transport.close();
	}
	
	
	//返回当前用户的邮箱集合
	public String[] getCurrentProjectUser(int projectId) throws cn.topdeep.projgroup.entity.DbException, SQLException, CacheException {
		List<IssueUsers> projUserList = issueUsersSelectObjects(" where issue_user_id in(SELECT issue_user_id FROM T_ISSUE_PROJECT_USER_PRIVILEGES where issue_project_id = "+ projectId+")");
		if(projUserList.size() > 0) {
			List<String> userEmail = new ArrayList<String>();
			for(IssueUsers users : projUserList) {
				if(!StringUtils.isNullOrEmpty(users.getUserEmail())) {
					userEmail.add(users.getUserEmail());
				}
			}
			return   userEmail.toArray(new String[userEmail.size()]);
		}else{
			return null;
		}
	}
	
	
}


