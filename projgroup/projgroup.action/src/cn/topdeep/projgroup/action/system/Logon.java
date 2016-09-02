/**
 * 
 */
package cn.topdeep.projgroup.action.system;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.biz.*;
import cn.topdeep.projgroup.entity.data.LoginUser;

import com.opensymphony.xwork2.*;
/**
 * @author niexin
 *
 */
public class Logon extends BaseAction implements ServletRequestAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3956725479911208422L;
	
	public Logon(){
		//System.out.println("Logon Action constructor");
	}
	
	
	//@Override
	public String execute() throws Exception {
		//System.out.println("Logon Action execute");
//		SystemBiz biz = BizFactory.getSystemBiz();
		ActionContext ctx = ActionContext.getContext();
		String remoteAddr = request.getRemoteAddr();
		getSystemBiz().UserLogin(getUsername(),getPassword(), remoteAddr);
		
		if(loginUser.isLogin()){
			return SUCCESS;
		}else{
			return INPUT;
		}
		
	}
	
	private String username;
	private String password;
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
//	private HttpServletRequest request;
//	
//	public void setServletRequest(HttpServletRequest arg0) {
//		request = arg0;
//	}
	public String getPassword() {
		return password;
	}

	private HttpServletRequest request;
	
	public String logout() throws Exception{
		loginUser.setLogin(false);
		return NO_PRIVILEGES;
	}

	
	@Override
	public boolean hasPrivilege(int func, int anOperate) {
		return true;
	}


	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
