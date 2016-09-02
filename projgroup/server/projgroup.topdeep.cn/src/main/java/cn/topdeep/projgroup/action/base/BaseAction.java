/**
 * 
 */
package cn.topdeep.projgroup.action.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.topdeep.projgroup.biz.AttendanceStatisticsBiz;
import cn.topdeep.projgroup.biz.FuncProjectBiz;
import cn.topdeep.projgroup.biz.SystemBiz;
import cn.topdeep.projgroup.entity.data.LoginUser;
import cn.topdeep.projgroup.util.ApplicationContextHelper;

/**
 * @author niexin
 *
 */
public class BaseAction {

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("funcProjectBiz")
	protected FuncProjectBiz funcProjectBiz;

	@Autowired
	@Qualifier("systemBiz")
	protected SystemBiz systemBiz;

	@Autowired
	@Qualifier("attendanceStatisticsBiz")
	protected AttendanceStatisticsBiz attendanceStatisticsBiz;
	
	public LoginUser getLoginUser() {
		return (LoginUser) ApplicationContextHelper.getBean("loginUser");
	}

	public boolean hasPrivilege(int aFunc, int anOperate) {
		if (true)
			return true;
		if (null == getLoginUser())
			return false;
		return getLoginUser().hasPrivilege(aFunc, anOperate);
	}

	/**
	 * @return the funcProjectBiz
	 */
	public FuncProjectBiz getFuncProjectBiz() {
		return funcProjectBiz;
	}

	/**
	 * @param funcProjectBiz the funcProjectBiz to set
	 */
	public void setFuncProjectBiz(FuncProjectBiz funcProjectBiz) {
		this.funcProjectBiz = funcProjectBiz;
	}

}
