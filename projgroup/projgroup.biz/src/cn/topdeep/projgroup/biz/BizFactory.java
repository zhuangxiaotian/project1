package cn.topdeep.projgroup.biz;

public class BizFactory {
	private static ThreadLocal<SystemBiz> systemBiz = new ThreadLocal<SystemBiz>();
	
	private static ThreadLocal<ProjectBiz> projectBiz = new ThreadLocal<ProjectBiz>();
	
	public static SystemBiz getSystemBiz(){
		if(systemBiz.get() == null){
			systemBiz.set(new SystemBiz());
		}
		return systemBiz.get();
	}
	
	public static ProjectBiz getProjectBiz(){
		if(projectBiz.get() == null){
			projectBiz.set(new ProjectBiz());
		}
		return projectBiz.get();
	}
	
}
