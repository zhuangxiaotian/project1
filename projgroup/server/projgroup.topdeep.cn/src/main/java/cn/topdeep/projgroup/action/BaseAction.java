package cn.topdeep.projgroup.action;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.topdeep.projgroup.biz.*;
import cn.topdeep.projgroup.entity.data.LoginUser;
import cn.topdeep.projgroup.util.ApplicationContextHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import common.util.*;
import common.web.ClientScriptManage;

public class BaseAction extends ActionSupport {

	protected org.apache.commons.logging.Log log = LogFactory.getLog(this.getClass());
	
	public final static String NEXT = "next";
	
	public final static String NO_PRIVILEGES = "noprivileges";
	
	public final static String REDIRECT = "redirect";
	
	public final static String CLIENT_REDIRECT = "clientRedirect";

	public final static String AJAX = "ajax";

	
	protected Object jsonObj;

	protected LoginUser loginUser;
	
	protected ClientScriptManage scriptManage = new ClientScriptManage();
	
	public LoginUser getLoginUser() {
		return loginUser;
	}

	public boolean hasPrivilege(int aFunc, int anOperate) {
		if (null == getLoginUser())
			return false;
		return getLoginUser().hasPrivilege(aFunc, anOperate);
	}
	
	protected String redirectUrl;
	
	protected UrlManage urlManage = new UrlManage();
	
	@Autowired
	@Qualifier("systemBiz")
	protected SystemBiz systemBiz;
	
	protected Config config;
	
	@Autowired
	@Qualifier("projectBiz")
	protected ProjectBiz projectBiz;
	
	@Autowired
	@Qualifier("funcProjectBiz")
	protected FuncProjectBiz funcProjectBiz;
	
	public SystemBiz getSystemBiz(){
		systemBiz.setLoginUser(getLoginUser());
		return systemBiz;
//		SystemBiz biz = BizFactory.getSystemBiz();
//		biz.setLoginUser(getLoginUser());
//		return biz;
	}

	public ProjectBiz getProjectBiz() {
		projectBiz.setLoginUser(getLoginUser());
		return projectBiz;
//		ProjectBiz biz = BizFactory.getProjectBiz();
//		biz.setLoginUser(getLoginUser());
//		return biz;
	}

	public void setSystemBiz(SystemBiz systemBiz) {
		this.systemBiz = systemBiz;
	}

	public void setProjectBiz(ProjectBiz projectBiz) {
		this.projectBiz = projectBiz;
	}

	public void setAttribute(String key, Object value){
		ActionContext ac = ActionContext.getContext();
		ac.getSession().put(key, value);
	}
	
	public Object getAttribute(String key){
		return  ActionContext.getContext().getSession().get(key);
	}
	
	public Object removeAttribute(String key){
		ActionContext ac = ActionContext.getContext();
		return ac.getSession().remove(key);
	}

	
	public int getFunc() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRowsCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	
	public UrlManage getUrlManage() {
		return urlManage;

	}

	public void setUrlManage(UrlManage urlManage) {
		this.urlManage = urlManage;
	}

	public String getDateString(java.util.Date date){
		return StringUtils.dateTimeToString(date, "yyyy-MM-dd");
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}


	public ClientScriptManage getScriptManage() {
		return scriptManage;
	}
	
	public void showMessage(String key, String message){
		message = message.replace('\r', '0');
		message = message.replace('\n', '0');
		scriptManage.registerScript(key, "alert ('"+message+"');");
	}
	
	public void clientRedirect(String key, String targetUrl){
		scriptManage.registerScript(key, "window.location.href='"+targetUrl+"';");
	}
	
	public void showMessageAndRedirect(String key, String message, String targetUrl){
		message = message.replace('\r', '0');
		message = message.replace('\n', '0');
		scriptManage.registerScript(key, "alert ('"+message+"'); window.location.href='"+targetUrl+"';");
	}

	/**
	 * @return the jsonObj
	 */
	public Object getJsonObj() {
		return jsonObj;
	}

	/**
	 * @param jsonObj the jsonObj to set
	 */
	public void setJsonObj(Object jsonObj) {
		this.jsonObj = jsonObj;
	}
	
	
}
