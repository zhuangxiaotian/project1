/**
 * $Id$
 */
package cn.topdeep.projgroup.biz.aop;

import java.lang.reflect.Method;
import cn.topdeep.projgroup.entity.data.*;

import org.aspectj.lang.JoinPoint;
import org.springframework.aop.MethodBeforeAdvice;

import common.privilege.MethodPrivilegeAttribute;

/**
 * @author niexin
 *
 */
public class PrivilegeChecker implements MethodBeforeAdvice {

	private IssueLoginUser issueLoginUser;
	
	/* (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void before(Method m, Object[] args, Object target)
			throws Throwable {
		MethodPrivilegeAttribute methodPrivilege = m.getAnnotation(MethodPrivilegeAttribute.class);
		if(methodPrivilege != null){
			if(issueLoginUser.hasPrivilege(issueLoginUser.getLoginProject().getIssueProjectId(), methodPrivilege.FuncModule(), methodPrivilege.FuncOperate())){
				return;
			}
			throw new Exception("没有合适的权限");
		}
		return;
	}
	
	public void checkPrivilege(JoinPoint joinPoint) throws Exception{
	}

	public IssueLoginUser getIssueLoginUser() {
		return issueLoginUser;
	}

	public void setIssueLoginUser(IssueLoginUser issueLoginUser) {
		this.issueLoginUser = issueLoginUser;
	}

}
