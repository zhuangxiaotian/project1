/**
 * 
 */
package cn.topdeep.projgroup.interceptor;

import org.apache.struts2.ServletActionContext;

import cn.topdeep.projgroup.action.BaseAction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import common.privilege.Privilege;
import common.privilege.PrivilegeOperate;

/**
 * @author niexin
 *
 */
public class AuthzInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7525450308048794149L;

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//authz
		Object action = invocation.getAction();
		if(!(action instanceof BaseAction)){
			return invocation.invoke();
		}
		BaseAction ba = (BaseAction)action;
		if(ba.hasPrivilege(ba.getFunc(), PrivilegeOperate.Read)){
			return invocation.invoke();
		}
		//authz fail
		return BaseAction.NO_PRIVILEGES;
	}

}
