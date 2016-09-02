/**
 * 
 */
package cn.topdeep.issue.action;

import java.sql.SQLException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import common.tag.struts2.ActionSupport;
import common.util.SiteUrl;
import cn.topdeep.projgroup.biz.*;
import cn.topdeep.projgroup.entity.data.IssueLoginUser;
/**
 * @author gmtstu
 *
 */
public class BaseAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public final static String NO_PRIVILEGES = "noprivileges";

	protected IssueLoginUser issueLoginUser;
	
	protected IssueBiz issueBiz;
	
	protected IssueUrlManage issueUrlManage;
	
	private SiteUrl rootSite = null;

	private boolean _initMenu = false;
	public static final String CURRENT_LOGIN_MODOULE = "cn.topdeep.issue.action.LoginMoudle.";

	
	protected void initMenu() throws SQLException{
		_initMenu = true;
	}
	
	public SiteUrl	getRootSiteUrl() throws SQLException{
		if(!_initMenu){
			initMenu();
		}
		if(rootSite == null){
			rootSite = issueUrlManage.getHome();
//			if(rootSite != null){
//				setCurrentSiteMap(rootSite, getActionUrlId());
//			}
		}
		return rootSite;
	}

	
	
	
	public IssueBiz getIssueBiz() {
		return issueBiz;
	}

	public void setIssueBiz(IssueBiz issueBiz) {
		this.issueBiz = issueBiz;
	}

	public IssueUrlManage getIssueUrlManage() {
		return issueUrlManage;
	}

	public void setIssueUrlManage(IssueUrlManage issueUrlManage) {
		this.issueUrlManage = issueUrlManage;
	}

	public void setAttribute(String key, Object value){
		ActionContext.getContext().getSession().put(key, value);
	}
	
	public Object getAttribute(String key){
		return ActionContext.getContext().getSession().get(key);
	}
	
	public Object removeAttribute(String key){
		return ActionContext.getContext().getSession().remove(key);
	}

	public IssueLoginUser getIssueLoginUser() {
		return issueLoginUser;
	}

	public void setIssueLoginUser(IssueLoginUser issueLoginUser) {
		this.issueLoginUser = issueLoginUser;
	}

	
	public int getFunc() {
		return 0;
	}

	public boolean hasPrivilege(int func, int operate) {
		if(!issueLoginUser.isLogin()){
			return false;
		}
		if(func <= 0){
			return true;
		}
		return issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), func, operate);
	}

	public String getUploadPath(){
		return ServletActionContext.getServletContext().getRealPath("/upload");
	}
	
	public String getDbPath(){
		return "/upload";
	}
}
