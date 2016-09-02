package cn.topdeep.issue.action;

import com.opensymphony.xwork2.ActionSupport;
import cn.topdeep.projgroup.biz.*;

public class Index extends ActionSupport {
	
	private SystemBiz systemBiz;
	
	@Override
	public String execute() throws Exception {
		systemBiz.UserLogin("admin", "", "");
		return super.execute();
	}

	public SystemBiz getSystemBiz() {
		return systemBiz;
	}

	public void setSystemBiz(SystemBiz systemBiz) {
		this.systemBiz = systemBiz;
	}
	
}
