package cn.topdeep.projgroup.interceptor;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;
import org.apache.struts2.dispatcher.RequestMap;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.entity.data.LoginUser;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import common.util.*;

public class UserMenuInterceptor extends AbstractInterceptor implements StrutsStatics {

	private LoginUser loginUser;
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		if(!(invocation.getAction() instanceof  BaseAction)){
			return invocation.invoke();
		}
		
		ActionContext ctx = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(HTTP_REQUEST);

		if(!loginUser.isLogin()){
			ctx.put("usermenu", "用户未登录");
			return ActionSupport.LOGIN;
			//return invocation.invoke();
		}
		try {
			SiteManage sitemap = SiteManage.getInstance();
			ArrayList rootList = sitemap.getRootUrl().getChildUrlList();
			StringBuffer sb = new StringBuffer();
			sb.append("<ul class='nav'>");
			for(int i =0;i<rootList.size();i++){
				SiteUrl url = (SiteUrl)rootList.get(i);
				sb.append("<li><a href='javascript:exp_coll("+i+");' class='current'>").append(url.getName()).append("</a>");
				sb.append("<ul id='sp_"+i+"' style='display: block'>");
					ArrayList childList = url.getChildUrlList();
					for(int j=0;j<childList.size();j++){
						SiteUrl childUrl = (SiteUrl)childList.get(j);
						if(!loginUser.hasPrivilege(childUrl.getFunc(), common.privilege.PrivilegeOperate.Read)){
							continue;
						}
						sb.append("<li><a href='"+request.getContextPath()+ childUrl.getUrl()+"'>"+childUrl.getName()+"</a></li>");
					}
				sb.append("</ul>");
				sb.append("</li>");
			}
			sb.append("</ul>");
			ctx.put("usermenu", sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ctx.put("usermenu", "初始化菜单出错");
		} 
		return invocation.invoke();
	}

	public LoginUser getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}

}
