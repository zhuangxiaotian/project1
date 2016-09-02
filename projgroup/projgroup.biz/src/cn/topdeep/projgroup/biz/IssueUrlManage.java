/**
 * 
 */
package cn.topdeep.projgroup.biz;

import common.util.SiteMapException;
import common.util.SiteMapProviderForAttribute;
import common.util.SiteUrl;
import common.util.SiteUrlAttribute;

import cn.topdeep.projgroup.biz.issue.IssueContext;
import cn.topdeep.projgroup.entity.data.IssueLoginUser;
import cn.topdeep.projgroup.entity.data.issue.IssuePrivilege;

/**
 * @author gmtstu
 *
 *菜单结构
 *首页
 *	问题
 *		问题列表
 *		问题添加
 *		问题查看
 *		问题搜索
 *		....
 *	系统管理
 *		项目管理
 *		用户管理
 *		角色管理
 *		状态管理
 *		优先级管理
 *			
 *		...
 *	登出系统
 *
 */
public class IssueUrlManage {

	private IssueContext issueContext;
	
	public String getBaseUrl() {
		if (issueContext == null)
			return "";
		return issueContext.getBaseUrl();
	}

	@SiteUrlAttribute(Desc="首页",Func=0,Id=1,IsMenu=true,Name="首页",ParentId=0,Url="IssueList.action")
	public String getIssueHomeUrl(){
		return getIssueListUrl();
	}

	
	@SiteUrlAttribute(Desc="问题管理",Func=4,Id=2,IsMenu=true,Name="问题管理",ParentId=1,Url="IssueList.action")
	public String getIssueManageUrl(){
		return getIssueListUrl();
	}
	
	@SiteUrlAttribute(Desc="系统管理",Func=10,Id=3,IsMenu=true,Name="系统管理",ParentId=1,Url="IssueList.action")
	public String getSystemManageUrl(){
		return getIssueListUrl();  //以前是""
	}

	@SiteUrlAttribute(Desc="退出系统",Func=0,Id=4,IsMenu=true,Name="退出系统",ParentId=1,Url="Logout.action")
	public String getLogouUrl(){
		return getBaseUrl()+"Logout.action";
	} 
	
	
	@SiteUrlAttribute(Desc="角色管理",Func=2,Id=301,IsMenu=true,Name="角色管理",ParentId=3,Url="RoleList.action")
	public String getIssueRoleListUrl(){
		return getBaseUrl() + "RoleList.action";
	}
	
	public String getIssueRoleEditUrl(){
		return getBaseUrl() + "RoleEdit.action";
	}
	@SiteUrlAttribute(Desc="用户管理",Func=1,Id=302,IsMenu=true,Name="用户管理",ParentId=3,Url="UserList.action")
	public String getIssueUserListUrl(){
		return getBaseUrl() + "UserList.action";
	}
	public String getIssueUserEditUrl(){
		return getBaseUrl() + "UserEdit.action";
	}
	
	public String getIssueUserEditUrl(int issueUserId){
		return getBaseUrl() + "UserEdit.action?issueUserId="+ issueUserId;
	}
	
	public String getUserPasswordUpdataUrl(int issueUserId){
		return getBaseUrl() + "UserPasswordUpdata.action?issueUserId="+ issueUserId;
	}
	
	@SiteUrlAttribute(Desc="项目管理",Func=3,Id=303,IsMenu=true,Name="项目管理",ParentId=3,Url="ProjList.action")
	public String getIssueProjListUrl(){
		return getBaseUrl() + "ProjList.action";
	}	
	
	public String getIssueProjEditUrl(){
		return getBaseUrl() + "ProjEdit.action";
	}
	@SiteUrlAttribute(Desc="状态管理",Func=6,Id=304,IsMenu=true,Name="状态管理",ParentId=3,Url="StatusList.action")
	public String getIssueStatusListUrl(){
		return getBaseUrl() + "StatusList.action";
	}	
	
	public String getIssueStatusEditUrl(){
		return getBaseUrl() + "StatusEdit.action";
	}
	
	public String getIssuePrioritiesEditUrl(){
		return getBaseUrl() + "PrioritlesEdit.action";
	}	
	
	@SiteUrlAttribute(Desc="优先级管理",Func=7,Id=305,IsMenu=true,Name="优先级管理",ParentId=3,Url="PrioritlesList.action")
	public String getIssuePrioritiesListUrl(){
		return getBaseUrl() + "PrioritlesList.action";
	}
	
	public String getIssueProjModuleListUrl(int issueProjectId){
		return getBaseUrl() + "ProjectModuleList.action?issueProjectId="+issueProjectId;
	}	
	
	public String getIssueProjModuleEditUrl(int issueProjectId){
		return getBaseUrl() + "ProjectModuleEdit.action?issueProjectId="+issueProjectId;
	}
	
	public String getIssueProjModuleEditUrl(int issueProjectId, int issueProjectModuleId){
		return getBaseUrl() + "ProjectModuleEdit.action?issueProjectId="+issueProjectId+"&issueProjectModuleId="+issueProjectModuleId;
	}
	
	public String getIssueStateChangeDefineEditUrl(){
		return getBaseUrl() + "StateChangeDefineEdit.action";
	}	
	
	public String getIssueStateChangeDefineEditUrl(int currentStatusId, int nextStatusId){
		return getBaseUrl() + "StateChangeDefineEdit.action?currentStatusId="+currentStatusId+"&nextStatusId="+nextStatusId;
	}	
	//记住下边的方法.用于双主键的删除
	public String getIssueStateChangeDefineDeleteUrl(int currentStatusId, int nextStatusId){
		return getBaseUrl() + "StateChangeDefineList!delete.action?currentStatusId="+currentStatusId+"&nextStatusId="+nextStatusId;
	}	
	@SiteUrlAttribute(Desc="状态改变定义",Func=8,Id=307,IsMenu=true,Name="状态改变定义",ParentId=3,Url="StateChangeDefineList.action")
	public String getIssueStateChangeDefineListUrl(){
		return getBaseUrl() + "StateChangeDefineList.action";
	}
	
	public String getIssueProjectUserPrivilegesListUrl(int issueProjectId){
		return getBaseUrl() + "ProjectUserPrivilegesList.action?issueProjectId="+ issueProjectId;
	}	
	
	public String getIssueProjectUserPrivilegesEditUrl(){
		return getBaseUrl() + "ProjectUserPrivilegesEdit.action";
	}
	
	public String getIssueProjectUserPrivilegesEditUrl(int issueProjectId ){
		return getBaseUrl() + "ProjectUserPrivilegesEdit.action?issueProjectId="+ issueProjectId;
	}
	
	public String getIssueProjectUserPrivilegesDeleteUrl(int issueProjectId, int issueUserId){
		return getBaseUrl() + "ProjectUserPrivilegesList!delete.action?issueProjectId="+ issueProjectId+"&issueUserId="+issueUserId;
	}
	
	
	public String getIssueProjectUserPrivilegesEditUrl(int issueProjectId, int issueUserId){
		return getBaseUrl() + "ProjectUserPrivilegesEdit.action?issueProjectId="+ issueProjectId+"&issueUserId="+issueUserId;
	}
	
	public String getIssueProjectUserPrivilegesEditUrl(int issueProjectId, int issueUserId, int roleID ){
		return getBaseUrl() + "ProjectUserPrivilegesEdit.action?issueProjectId="+ issueProjectId+"&issueUserId="+issueUserId+"&roleId="+roleID;
	}
	
	public String getIssueListUrl(int issueQueryId) {
		return getBaseUrl() + "IssueList.action?issueQueryId=" +issueQueryId;
	}
	
	public String getIssueListUrl() {
		return getBaseUrl() + "IssueList.action";
	}
	
	
	public String getIssueEditUrl(int issueId){
		return getBaseUrl() + "IssueEdit.action?issueId=" +issueId;
	}
	@SiteUrlAttribute(Desc="增加问题",Func=9,Id=201,IsMenu=true,Name="增加问题",ParentId=2,Url="IssueAdd.action")
	public String getIssueAddUrl(){
		return getBaseUrl() + "IssueAdd.action";
	}
	
	@SiteUrlAttribute(Desc="问题查询",Func=11,Id=202,IsMenu=true,Name="问题查询",ParentId=2,Url="Search.action")
	public String getSearchUrl() {
		return getBaseUrl() + "Search.action";
	}
	
	//@SiteUrlAttribute(Desc="上传",Func=0,Id=203,IsMenu=true,Name="上传",ParentId=2,Url="UpLoad.action")
	public String getUpLoadUrl(){
		return getBaseUrl() + "UpLoad.action";
	}
	
	
	public String getUpLoadUrl(int issueId){
		return getBaseUrl() + "UpLoad.action?issueId="+ issueId;
	}
	
	@SiteUrlAttribute(Desc="自定义查询列表",Func=12,Id=203,IsMenu=true,Name="自定义查询列表",ParentId=2,Url="QueryList.action")
	public String getQueryListUrl(){
		return getBaseUrl() + "QueryList.action";
	}
	
	@SiteUrlAttribute(Desc="个人信息修改",Func = 0,Id=516,IsMenu=true,Name="个人信息修改",ParentId=3,Url="UserPasswordUpdata.action")
	public String getUserPasswordUpdataUrl(){
		return getBaseUrl() + "UserPasswordUpdata.action";
	}
	
	
	public String getQueryEditUrl() {
		return getBaseUrl() + "QueryEdit.action";
	}
	
	public String getQueryEditUrl(int issueQueryId) {
		return getBaseUrl() + "QueryEdit.action?issueQueryId=" +issueQueryId;
	}
	
	public String getRoleDefaultQueryListUrl() {
		return getBaseUrl() + "RoleDefaultQueryList.action";
	}
	
	public String getRoleDefaultQueryListUrl(int issueProjectId) {
		return getBaseUrl() + "RoleDefaultQueryList.action?issueProjectId="+ issueProjectId;
	}
	
	public String getRoleDefaultQueryEditUrl(int issueProjectId, int roleId) {
		return getBaseUrl() + "RoleDefaultQueryEdit.action?issueProjectId="+ issueProjectId+ "&RoleId=" +roleId;
	}
	
	public String getRoleDefaultQueryEditUrl(int issueProjectId) {
		return getBaseUrl() + "RoleDefaultQueryEdit.action?issueProjectId=" +issueProjectId;
	}
	
	public String getRoleDefaultQueryEditUrl() {
		return getBaseUrl() + "RoleDefaultQueryEdit.action";
	}
	
	public String getRoleDefaultQueryDelete(int issueProjectId, int roleId) {
		return getBaseUrl() + "RoleDefaultQueryList!delete.action?issueProjectId="+ issueProjectId + "&roleId="+ roleId;
	}

	public IssueContext getIssueContext() {
		return  issueContext;
	}


	public void setIssueContext(IssueContext issueContext) {
		this.issueContext = issueContext;
	}
	
	
	public SiteUrl getHome(){
		SiteUrl root = null;
		try {
			root = (SiteUrl)issueContext.getAttribute("root_url");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(root == null){
			try {
				root = new SiteMapProviderForAttribute().addSiteUrl(this);
				if(root != null){
					issueContext.setAttribute("root_url", root);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return root;
	}

}

