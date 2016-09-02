/**
 * 
 */
package cn.topdeep.projgroup.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import common.db.SqlServerUtils;
import common.db.SqlUtils;
import common.dbvisit.sqlserver.SqlServerDataVisit;
import common.util.StringUtils;

import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.Issue;
import cn.topdeep.projgroup.entity.IssueRoles;
import cn.topdeep.projgroup.entity.IssueStatus;
import cn.topdeep.projgroup.entity.IssueUsers;
import cn.topdeep.projgroup.entity.IssueProject;
import cn.topdeep.projgroup.entity.data.issue.IssueQueryCondition;
import cn.topdeep.projgroup.entity.view.issue.*;
import cn.topdeep.projgroup.entity.*;
/**
 * @author gmtstu
 *
 */
public class IssueDao extends ProjgroupDao{

	public List<IssueProject> issueProjectInsert(int pageIndex, int rowsOfPage,
			String orderField, String order) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<IssueUsers> issueUsersInsert(int pageIndex, int rowsOfPage,
			String orderField, String order) {
		// TODO Auto-generated method stub
		return null;
	}
	

//Projectlist页面增加issueUsers中的默认用户	
	//新增sql语句
	private String getQueryIssueProjectListViewListSql(){
		String sql = IssueProject.getSelectSql()+", T_ISSUE_USERS.LOGIN_NAME DEFAULT_USER_NAME from T_ISSUE_PROJECT inner join T_ISSUE_USERS on T_ISSUE_USERS.ISSUE_USER_ID = T_ISSUE_PROJECT.DEFAULT_USER_ID";
		return sql;
	}
	
	//查询的数目
	public int queryIssueProjectListViewListCount() throws SQLException{
		String sql = getQueryIssueProjectListViewListSql();
		return queryCount(sql);
	}
	
	
	public List<IssueProjectListView> queryIssueProjectListViewList(int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		String sql = getQueryIssueProjectListViewListSql();
		return queryEntity(IssueProjectListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 新增加查询条件为T_USER.LOGIN_NAME的sql语句
	 * @return
	 */
	private String getQueryIssueUsersListViewListSql() {
		String sql = IssueUsers.getSelectSql()+", T_USER.LOGIN_NAME INNER_USER_NAME from T_ISSUE_USERS left join T_USER on T_USER.USER_ID = T_ISSUE_USERS.INNER_USER_ID ";
		return sql;
	}
	/**
	 * 查询问题跟踪系统用户列表的记录数
	 * @return
	 * @throws SQLException
	 */
	public int queryIssueUsersListViewListCount() throws SQLException {
		String sql = getQueryIssueUsersListViewListSql();
		return queryCount(sql);
	}
	/**
	 * 查询问题跟踪系统用户列表
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
	public List<IssueUsersListView> queryIssueUsersListViewList(int pageIndex, int rowsOfPage, String orderField,String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		String sql = getQueryIssueUsersListViewListSql();
		return  queryEntity(IssueUsersListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}

	
	// 修改显示了状态表中的名称	
	
	
	private String getQueryIssueStateChangeDefineListViewListSql() {
		String sql = IssueStateChangeDefine.getSelectSql()+",T_ISSUE_STATUS1.STATUS_NAME CURRENT_STATUS_NAME,T_ISSUE_STATUS2.STATUS_NAME NEXT_STATUS_NAME  from T_ISSUE_STATE_CHANGE_DEFINE inner join T_ISSUE_STATUS T_ISSUE_STATUS1 on T_ISSUE_STATUS1.STATUS_ID = T_ISSUE_STATE_CHANGE_DEFINE.CURRENT_STATUS_ID inner join T_ISSUE_STATUS T_ISSUE_STATUS2 on T_ISSUE_STATUS2.STATUS_ID = T_ISSUE_STATE_CHANGE_DEFINE.NEXT_STATUS_ID";
		return sql;
	}
	
	public int queryIssueStateChangeDefineListViewListCount() throws SQLException {
		String sql = getQueryIssueStateChangeDefineListViewListSql();
		return queryCount(sql);
	}
	
	public List<IssueStateChangeDefineListView> queryIssueStateChangeDefineListViewList(int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql =getQueryIssueStateChangeDefineListViewListSql();
		return queryEntity(IssueStateChangeDefineListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	//
	private String getQueryIssueProjectUserPrivilegesListViewListSql(int issueProjectId) {
		String sql = IssueProjectUserPrivileges.getSelectSql()+",T_ISSUE_PROJECT.ISSUE_PROJECT_NAME, T_ISSUE_USERS.ISSUE_USER_NAME, T_ISSUE_ROLES.ROLE_NAME FROM T_ISSUE_PROJECT_USER_PRIVILEGES inner join T_ISSUE_PROJECT on T_ISSUE_PROJECT.ISSUE_PROJECT_ID = T_ISSUE_PROJECT_USER_PRIVILEGES.ISSUE_PROJECT_ID inner join T_ISSUE_USERS  on T_ISSUE_USERS.ISSUE_USER_ID = T_ISSUE_PROJECT_USER_PRIVILEGES.ISSUE_USER_ID inner join T_ISSUE_ROLES on T_ISSUE_ROLES.ROLE_ID = T_ISSUE_PROJECT_USER_PRIVILEGES.ROLE_ID where T_ISSUE_PROJECT.ISSUE_PROJECT_ID =" + issueProjectId;
		return sql;
	}
	
	public int queryIssueProjectUserPrivilegesListViewListCount(int issueProjectId) throws SQLException {
		String sql = getQueryIssueProjectUserPrivilegesListViewListSql(issueProjectId);
		return queryCount(sql);
	}
	public List<IssueProjectUserPrivilegesListView> IssueProjectUserPrivilegesListViewList(int issueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryIssueProjectUserPrivilegesListViewListSql(issueProjectId);
		return queryEntity(IssueProjectUserPrivilegesListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	private String getQueryIssueProjectUserPrivilegesListViewListByUserIdSql(int userId) {
		String sql = IssueProjectUserPrivileges.getSelectSql()+",T_ISSUE_PROJECT.ISSUE_PROJECT_NAME FROM T_ISSUE_PROJECT_USER_PRIVILEGES inner join T_ISSUE_PROJECT on T_ISSUE_PROJECT.ISSUE_PROJECT_ID = T_ISSUE_PROJECT_USER_PRIVILEGES.ISSUE_PROJECT_ID  where  T_ISSUE_PROJECT_USER_PRIVILEGES.ISSUE_USER_ID =" + userId;
		return sql;
	}
	
	public List<IssueProjectUserPrivilegesListView> queryIssueProjectUserPrivilegesListViewListByUserId(int userId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryIssueProjectUserPrivilegesListViewListByUserIdSql(userId);
		return queryEntity(IssueProjectUserPrivilegesListView.class, sql );
	}
	
//   用于显示issue的List
	private String getQueryIssueListViewListSql(Integer issueProjectId) {
		String sql = Issue.getSelectSql()+",T_ISSUE_STATUS.STATUS_NAME STATUS_NAME, T_ISSUE_PRIORITIES.PRIORITIES_NAME PRIORITIES_NAME, T_ISSUE_USERS1.ISSUE_USER_NAME REPORT_USER_NAME, T_ISSUE_USERS2.ISSUE_USER_NAME ASSIGN_USER_NAME, T_ISSUE_PROJECT.ISSUE_PROJECT_NAME, T_ISSUE_PROJECT_MODULE.MODULE_NAME, T_ISSUE_USERS1.INNER_USER_ID REPORT_INNER_USER_ID, T_ISSUE_USERS2.INNER_USER_ID ASSIGN_INNER_USER_ID from T_ISSUE left join T_ISSUE_STATUS on T_ISSUE_STATUS.STATUS_ID = T_ISSUE.STATUS_ID left join T_ISSUE_PRIORITIES on T_ISSUE_PRIORITIES.PRIORITIES_ID = T_ISSUE.PRIORITIES_ID left join T_ISSUE_USERS T_ISSUE_USERS1 on T_ISSUE_USERS1.ISSUE_USER_ID = T_ISSUE.REPORT_USER_ID left join T_ISSUE_USERS T_ISSUE_USERS2 on T_ISSUE_USERS2.ISSUE_USER_ID = T_ISSUE.ASSIGN_USER_ID left join T_ISSUE_PROJECT on T_ISSUE_PROJECT.ISSUE_PROJECT_ID = T_ISSUE.ISSUE_PROJECT_ID left join T_ISSUE_PROJECT_MODULE on T_ISSUE_PROJECT_MODULE.ISSUE_PROJECT_MODULE_ID = T_ISSUE.ISSUE_PROJECT_MODULE_ID";
		if(issueProjectId != null){
			sql += " where T_ISSUE.ISSUE_PROJECT_ID = "+issueProjectId;
		}
		return sql;
	}
	
	public int queryIssueListViewListCount(Integer issueProjectId) throws SQLException {
		String sql = getQueryIssueListViewListSql(issueProjectId);
		return queryCount(sql);
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
	public List<IssueListView> queryIssueListViewList(Integer issueProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryIssueListViewListSql(issueProjectId);
		return queryEntity(IssueListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	private String getQueryIssueListViewListByQueryIdSql(int issueProjectId, int queryId) throws DbException, SQLException{
		IssueQuery query = issueQuerySelectByIssueQueryId(queryId);
		if(query != null){
			String sql = "select * from ("+query.getIssueQuerySql()+") t_issue where issue_project_id = "+issueProjectId;
			return sql;
		}else{
			return "";
		}
	}
	
	public List<IssueListView> queryIssueListViewByQueryIdList(int issueProjectId, int queryId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		String sql = getQueryIssueListViewListByQueryIdSql(issueProjectId, queryId);
		if(!StringUtils.isNullOrEmpty(sql)){
			return queryEntity(IssueListView.class, sql, pageIndex, rowsOfPage, orderField, order); 
		}else{
			return new ArrayList<IssueListView>();
		}
	}
	
	public int queryIssueListViewByQueryIdListCount(int issueProjectId, int queryId) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		String sql = getQueryIssueListViewListByQueryIdSql(issueProjectId, queryId);
		if(!StringUtils.isNullOrEmpty(sql)){
			return queryCount(sql); 
		}else{
			return 0;
		}
	}
	
	
	/**
	 * 这个是在登陆action中为了验证是否在这个项目下有权限而新写的方法..
	 * @param issueProjectId
	 * @param loginName
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SQLException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public IssueUsers queryIssueProjectUser(int issueProjectId, String loginName) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = IssueUsers.getSelectSql()+" from T_ISSUE_USERS inner join T_ISSUE_PROJECT_USER_PRIVILEGES on T_ISSUE_PROJECT_USER_PRIVILEGES.ISSUE_USER_ID = T_ISSUE_USERS.ISSUE_USER_ID where T_ISSUE_PROJECT_USER_PRIVILEGES.ISSUE_PROJECT_ID = "+ issueProjectId +" and T_ISSUE_USERS.LOGIN_NAME =" + SqlServerUtils.safeSql(loginName);
		return querySingleEntity(IssueUsers.class, sql) ;
	}
	
	
	//
	public int queryIssueRolesListCount() throws SQLException {
		String sql = getQueryIssueRolesListSql();
		return queryCount(sql);
	}

	private String getQueryIssueRolesListSql() {
		String sql = IssueRoles.getSelectSql() +"from T_ISSUE_ROLES";
		return sql;
	}
	//
	public String getQueryIssueStatusListSql() {
		String sql = IssueStatus.getSelectSql() +"from T_ISSUE_STATUS";
		return sql;
	}
	
	public int queryIssueStatusListCount() throws SQLException {
		String sql = getQueryIssueStatusListSql();
		return queryCount(sql);
	}
	
	//
	public String getQueryIssuePrioritlesListSql() {
		String sql = IssuePriorities.getSelectSql() +"from T_ISSUE_PRIORITIES";
		return sql;
	}
	
	public int queryIssuePrioritlesListCount() throws SQLException {
		String sql = getQueryIssuePrioritlesListSql();
		return queryCount(sql);
	}
	
	//
	public String getQueryIssueProjectsModuleListSql(int issueProjectId) {
		String sql = IssueProjectModule.getSelectSql()+"from T_ISSUE_PROJECT_MODULE where ISSUE_PROJECT_ID =" + issueProjectId;
		return sql;
	}
	
	public int queryIssueProjectsModuleListCount(int issueProjectId) throws SQLException {
		String sql = getQueryIssueProjectsModuleListSql(issueProjectId);
		return queryCount(sql);
	}
	
	/**
	 * 显示提交某个问题注释的用户
	 * @param pageIndex
	 * @param rowsOfPage
	 * @param orderField
	 * @param order
	 * @return
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 * @throws IllegalArgumentException 
	 */
	public List<IssueCommentListView> queryIssueCommentListViewList(int issueId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryIssueCommentListViewListSql(issueId);
		return queryEntity(IssueCommentListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	public String getQueryIssueCommentListViewListSql(int issueId) {
		String sql = IssueComment.getSelectSql() + " ,T_ISSUE_USERS.ISSUE_USER_NAME from T_ISSUE_COMMENT inner join T_ISSUE_USERS on T_ISSUE_USERS.ISSUE_USER_ID = T_ISSUE_COMMENT.COMMENT_USER_ID where T_ISSUE_COMMENT.ISSUE_ID = "+ issueId;
		return sql;
	}
	
	public int getQueryIssueCommentListViewListCOunt(int issueId) throws SQLException {
		String sql = getQueryIssueCommentListViewListSql(issueId);
		return queryCount(sql);
	}
	
//
	public List<IssueListView> queryIssueListViewByQueryConditionList(IssueQueryCondition condition, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryIssueListViewByQueryContidionListSql(condition);
		return queryEntity(IssueListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	public String getQueryIssueListViewByQueryContidionListSql(IssueQueryCondition condition){
		String sql = Issue.getSelectSql()+ ", T_ISSUE_STATUS.STATUS_NAME STATUS_NAME, T_ISSUE_PRIORITIES.PRIORITIES_NAME PRIORITIES_NAME, T_ISSUE_USERS1.ISSUE_USER_NAME REPORT_USER_NAME, T_ISSUE_USERS2.ISSUE_USER_NAME ASSIGN_USER_NAME, T_ISSUE_PROJECT.ISSUE_PROJECT_NAME, T_ISSUE_PROJECT_MODULE.MODULE_NAME, T_ISSUE_USERS1.INNER_USER_ID REPORT_INNER_USER_ID, T_ISSUE_USERS2.INNER_USER_ID ASSIGN_INNER_USER_ID from T_ISSUE left join T_ISSUE_STATUS on T_ISSUE_STATUS.STATUS_ID = T_ISSUE.STATUS_ID left join T_ISSUE_PRIORITIES on T_ISSUE_PRIORITIES.PRIORITIES_ID = T_ISSUE.PRIORITIES_ID left join T_ISSUE_USERS T_ISSUE_USERS1 on T_ISSUE_USERS1.ISSUE_USER_ID = T_ISSUE.REPORT_USER_ID left join T_ISSUE_USERS T_ISSUE_USERS2 on T_ISSUE_USERS2.ISSUE_USER_ID = T_ISSUE.ASSIGN_USER_ID left join T_ISSUE_PROJECT on T_ISSUE_PROJECT.ISSUE_PROJECT_ID = T_ISSUE.ISSUE_PROJECT_ID left join T_ISSUE_PROJECT_MODULE on T_ISSUE_PROJECT_MODULE.ISSUE_PROJECT_MODULE_ID = T_ISSUE.ISSUE_PROJECT_MODULE_ID where 1=1 ";
		if(condition.getReportUser() != null && condition.getReportUser().length > 0) {
			if(condition.getReportUser().length == 1 ) {
				sql += "  and (REPORT_USER_ID = " +condition.getReportUser()[0]+ ")";
			}else{
				sql += "  and (REPORT_USER_ID in (";
				boolean first = true;
				for(int item : condition.getReportUser()) {
					if(!first){
						sql += ",";
					}else{
						first = false;
					}
					sql += item;
				}
				sql += "))";
			}
		}
		
		if(condition.getIssueProject() != null ) {
				sql += " and (T_ISSUE.ISSUE_PROJECT_ID ="+ condition.getIssueProject() +")";
		}
		
		if(condition.getIssuePriorities() != null && condition.getIssuePriorities().length  > 0) {
			if(condition.getIssuePriorities().length == 1) {
				sql += "  and ( T_ISSUE.PRIORITIES_ID = " +condition.getIssuePriorities()[0]+ ")";
			}else {
				sql += " and ( T_ISSUE.PRIORITIES_ID in (";
				boolean first = true;
				for(int item : condition.getIssuePriorities()) {
					if(!first){
						sql += ",";
					}else{
						first = false;
					}
					sql += item;
				}
				sql += "))";
			}
			
		}
		
		if(condition.getAssignToUser() != null && condition.getAssignToUser().length > 0){
			sql += " and (T_ISSUE.ASSIGN_USER_ID in (";
			boolean first = true;
			for(int item : condition.getAssignToUser()){
				if(!first){
					sql += ",";
				}else{
					first = false;
				}
				sql += item;
			}
			sql += "))";
		}
		
		if(condition.getIssueStatu() != null && condition.getIssueStatu().length  > 0) {
			sql += " and ( T_ISSUE.STATUS_ID in (";
			boolean first = true;
			for(int item : condition.getIssueStatu()) {
				if(!first){
					sql += ",";
				}else{
					first = false;
				}
				sql += item;
			}
			sql += "))";
		}
		
		if(!StringUtils.isNullOrEmpty(condition.getKeyword())) {
			sql += " and ( T_ISSUE.ISSUE_SHORT_DESC like "+ SqlServerUtils.safeSql("%"+condition.getKeyword()+"%") +")";
		}
		
		if(condition.getIssueType() != null && condition.getIssueType().length > 0) {
			sql += " and ( T_ISSUE.ISSUE_TYPE in (";
			boolean first = true;
			for(int item : condition.getIssueType()) {
				if(!first){
					sql += ",";
				}else{
					first = false;
				}
				sql += item;
			}
			sql += "))";
		}
		
		if(condition.getReportBeginTime()!= null) { 
			sql += " and ( T_ISSUE.REPORT_TIME >= " + SqlServerUtils.getDateSql(condition.getReportBeginTime()) + ")";
		}
		
		if(condition.getReportEndTime()!= null) { 
			sql += " and ( T_ISSUE.REPORT_TIME <= " + SqlServerUtils.getDateSql(condition.getReportEndTime()) + ")";
		}
		
		if(condition.getUpdateBeginTime() != null) {
			sql += " and ( T_ISSUE.UPDATE_TIME >= " + SqlServerUtils.getDateSql(condition.getUpdateBeginTime()) + ")";
		}
		
		if(condition.getUpdateEndTime() != null) {
			sql += " and ( T_ISSUE.UPDATE_TIME <= " + SqlServerUtils.getDateSql(condition.getUpdateEndTime()) + ")";
		}
		
		return sql;
	}
	
	public String getQueryIssueListViewByQueryContidionListNoprojSql(IssueQueryCondition condition){
		String sql = Issue.getSelectSql()+ ", T_ISSUE_STATUS.STATUS_NAME STATUS_NAME, T_ISSUE_PRIORITIES.PRIORITIES_NAME PRIORITIES_NAME, T_ISSUE_USERS1.ISSUE_USER_NAME REPORT_USER_NAME, T_ISSUE_USERS2.ISSUE_USER_NAME ASSIGN_USER_NAME, T_ISSUE_PROJECT.ISSUE_PROJECT_NAME, T_ISSUE_PROJECT_MODULE.MODULE_NAME, T_ISSUE_USERS1.INNER_USER_ID REPORT_INNER_USER_ID, T_ISSUE_USERS2.INNER_USER_ID ASSIGN_INNER_USER_ID from T_ISSUE left join T_ISSUE_STATUS on T_ISSUE_STATUS.STATUS_ID = T_ISSUE.STATUS_ID left join T_ISSUE_PRIORITIES on T_ISSUE_PRIORITIES.PRIORITIES_ID = T_ISSUE.PRIORITIES_ID left join T_ISSUE_USERS T_ISSUE_USERS1 on T_ISSUE_USERS1.ISSUE_USER_ID = T_ISSUE.REPORT_USER_ID left join T_ISSUE_USERS T_ISSUE_USERS2 on T_ISSUE_USERS2.ISSUE_USER_ID = T_ISSUE.ASSIGN_USER_ID left join T_ISSUE_PROJECT on T_ISSUE_PROJECT.ISSUE_PROJECT_ID = T_ISSUE.ISSUE_PROJECT_ID left join T_ISSUE_PROJECT_MODULE on T_ISSUE_PROJECT_MODULE.ISSUE_PROJECT_MODULE_ID = T_ISSUE.ISSUE_PROJECT_MODULE_ID where 1=1 ";
		if(condition.getReportUser() != null && condition.getReportUser().length > 0) {
			if(condition.getReportUser().length == 1 ) {
				sql += "  and (REPORT_USER_ID = " +condition.getReportUser()[0]+ ")";
			}else{
				sql += "  and (REPORT_USER_ID in (";
				boolean first = true;
				for(int item : condition.getReportUser()) {
					if(!first){
						sql += ",";
					}else{
						first = false;
					}
					sql += item;
				}
				sql += "))";
			}
		}
		if(condition.getIssuePriorities() != null && condition.getIssuePriorities().length  > 0) {
			if(condition.getIssuePriorities().length == 1) {
				sql += "  and ( T_ISSUE.PRIORITIES_ID = " +condition.getIssuePriorities()[0]+ ")";
			}else {
				sql += " and ( T_ISSUE.PRIORITIES_ID in (";
				boolean first = true;
				for(int item : condition.getIssuePriorities()) {
					if(!first){
						sql += ",";
					}else{
						first = false;
					}
					sql += item;
				}
				sql += "))";
			}
			
		}
		
		if(condition.getAssignToUser() != null && condition.getAssignToUser().length > 0){
			sql += " and (T_ISSUE.ASSIGN_USER_ID in (";
			boolean first = true;
			for(int item : condition.getAssignToUser()){
				if(!first){
					sql += ",";
				}else{
					first = false;
				}
				sql += item;
			}
			sql += "))";
		}
		
		if(condition.getIssueStatu() != null && condition.getIssueStatu().length  > 0) {
			sql += " and ( T_ISSUE.STATUS_ID in (";
			boolean first = true;
			for(int item : condition.getIssueStatu()) {
				if(!first){
					sql += ",";
				}else{
					first = false;
				}
				sql += item;
			}
			sql += "))";
		}
		
		if(!StringUtils.isNullOrEmpty(condition.getKeyword())) {
			sql += " and ( T_ISSUE.ISSUE_SHORT_DESC like "+ SqlServerUtils.safeSql("%"+condition.getKeyword()+"%") +")";
		}
		
		if(condition.getIssueType() != null && condition.getIssueType().length > 0) {
			sql += " and ( T_ISSUE.ISSUE_TYPE in (";
			boolean first = true;
			for(int item : condition.getIssueType()) {
				if(!first){
					sql += ",";
				}else{
					first = false;
				}
				sql += item;
			}
			sql += "))";
		}
		
		if(condition.getReportBeginTime()!= null) { 
			sql += " and ( T_ISSUE.REPORT_TIME >= " + SqlServerUtils.getDateSql(condition.getReportBeginTime()) + ")";
		}
		
		if(condition.getReportEndTime()!= null) { 
			sql += " and ( T_ISSUE.REPORT_TIME <= " + SqlServerUtils.getDateSql(condition.getReportEndTime()) + ")";
		}
		
		if(condition.getUpdateBeginTime() != null) {
			sql += " and ( T_ISSUE.UPDATE_TIME >= " + SqlServerUtils.getDateSql(condition.getUpdateBeginTime()) + ")";
		}
		
		if(condition.getUpdateEndTime() != null) {
			sql += " and ( T_ISSUE.UPDATE_TIME <= " + SqlServerUtils.getDateSql(condition.getUpdateEndTime()) + ")";
		}
		return sql;
	}
	
	public int getQueryIssueListViewByQueryContidionListCount(IssueQueryCondition condition) throws SQLException {
		String sql = getQueryIssueListViewByQueryContidionListSql(condition);
		return queryCount(sql);
	}

	public List<IssueQueryListView> queryIssueQueryListViewList(int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryIssueQueryListViewListSql();
		return queryEntity(IssueQueryListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	public String getQueryIssueQueryListViewListSql() {
		String sql = IssueQuery.getSelectSql() +"From T_ISSUE_QUERY ";
		return sql;
	}
	
	public int getQueryIssueQueryListViewListCount() throws SQLException {
		String sql = getQueryIssueQueryListViewListSql();
		return queryCount(sql);
		
	}
	//
	public List<IssueStatusNextListView> queryIssueStateNextListByCurrentStatusId(int currentStatusId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryIssueStateNextListViewByCurrentStatusIdSql(currentStatusId);
		return queryEntity(IssueStatusNextListView.class, sql, pageIndex, rowsOfPage, orderField, order);
		
	}
	
	public String getQueryIssueStateNextListViewByCurrentStatusIdSql(int currentStatusId) {
		String sql = IssueStatus.getSelectSql()+ ", T_ISSUE_STATE_CHANGE_DEFINE.ROLE_LIST from T_ISSUE_STATUS inner join T_ISSUE_STATE_CHANGE_DEFINE on T_ISSUE_STATE_CHANGE_DEFINE.NEXT_STATUS_ID = T_ISSUE_STATUS.STATUS_ID where T_ISSUE_STATE_CHANGE_DEFINE.CURRENT_STATUS_ID =" +currentStatusId;
		return sql;
	}

	public List<IssueRolesView> queryIssueRoleListViewList(int pageIndex,
			int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = IssueRoles.getSelectSql()+ "from T_ISSUE_ROLES";
		return queryEntity(IssueRolesView.class, sql);
	}
	//
	public String getQueryIssueRoleDefaultQueryListViewSql(Integer projId) {
		String sql = IssueRoleDefaultQuery.getSelectSql() +", T_ISSUE_ROLES.ROLE_NAME ROLE_NAME, T_ISSUE_QUERY.ISSUE_QUERY_NAME DEFAULT_QUERY_NAME FROM T_ISSUE_ROLE_DEFAULT_QUERY inner join T_ISSUE_ROLES on T_ISSUE_ROLES.ROLE_ID = T_ISSUE_ROLE_DEFAULT_QUERY.ROLE_ID inner join T_ISSUE_QUERY on T_ISSUE_QUERY.ISSUE_QUERY_ID = T_ISSUE_ROLE_DEFAULT_QUERY.ISSUE_QUERY_ID";
		if(projId != null) {
			sql += " where T_ISSUE_ROLE_DEFAULT_QUERY.ISSUE_PROJECT_ID =  "+ projId;
		}
		return sql;
	}
	
	public List<IssueRoleDefaultQueryListView> queryIssueRoleDefaultQueryListViewList(Integer projId, int pageIndex, int rowsOfPage, String orderField, String order) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = getQueryIssueRoleDefaultQueryListViewSql(projId);
		return queryEntity(IssueRoleDefaultQueryListView.class, sql, pageIndex, rowsOfPage, orderField, order);
	}
	
	public int getQueryIssueRoleDefaultQueryListViewListCOunt(Integer projId) throws SQLException {
		String sql = getQueryIssueRoleDefaultQueryListViewSql(projId);
		return queryCount(sql);
	}
}
