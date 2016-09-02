package cn.topdeep.issue.action.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.*;

import cn.topdeep.projgroup.biz.issue.IssueContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import common.web.HttpContext;


public class HttpContextInterceptor extends AbstractInterceptor implements StrutsStatics {

	private static final Log logger = LogFactory.getLog(HttpContextInterceptor.class);
	
	private IssueContext issueContext;
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context = invocation.getInvocationContext();
		HttpContext.setContext(ServletActionContext.getPageContext());
		HttpContext.setRequest(ServletActionContext.getRequest());
		HttpContext.setResponse(ServletActionContext.getResponse());
		HttpContext.setSession(context.getSession());
		//issueContext.setRealPath(ServletActionContext.getServletContext().getRealPath("/"));
//		HttpServletRequest request = ServletActionContext.getRequest();
//		System.out.println(request.getRequestURI());
//		System.out.println(request.getParameter("issueId"));
//		System.out.println(request.getQueryString());;
		return invocation.invoke();
	}

	public IssueContext getIssueContext() {
		return issueContext;
	}

	public void setIssueContext(IssueContext issueContext) {
		this.issueContext = issueContext;
	}

}
