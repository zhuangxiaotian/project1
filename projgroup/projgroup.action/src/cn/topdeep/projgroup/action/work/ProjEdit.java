package cn.topdeep.projgroup.action.work;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.*;

import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import common.util.StringUtils;

import cn.topdeep.projgroup.action.BaseAction;
import cn.topdeep.projgroup.entity.DbException;
import cn.topdeep.projgroup.entity.User;
import cn.topdeep.projgroup.entity.Task;
import cn.topdeep.projgroup.entity.Project;
import cn.topdeep.projgroup.entity.ProjectJoinUser;
import cn.topdeep.projgroup.entity.view.ProjUserView;
import cn.topdeep.projgroup.action.work.*;
import cn.topdeep.projgroup.action.system.*;


public class ProjEdit extends BaseAction implements ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3864959797885187592L;

	public String execute() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		initData();
		return INPUT;
	}
	/*
	 * 下面这个方法的功能是什么?
	 * 我认为错在:应该创建project-user实例,但是,getjoinusers()怎样写才能返回一个user对象?
	 */
	private void initData() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		
		mayUseUserList = new ArrayList();
		mayUseUserList = getSystemBiz().getUserList(0, Integer.MAX_VALUE);
		if(proj != null){
			List<User> joinUserList = getProjectBiz().getJoinUsers(proj.getProjId());
			if(joinUserList.size() > 0){
				java.util.Iterator iter = joinUserList.iterator();
				while(iter.hasNext()){
					User user = (User)iter.next();
					for(int i=0;i<mayUseUserList.size();i++){
						User user1 = (User)mayUseUserList.get(i);
						if(user1.getUserId() == user.getUserId()){
							mayUseUserList.remove(i);
							break;
						}
					}
				}
			}
		}
	}
	
	public void validateSave() throws DbException, SQLException {
		if(StringUtils.isNullOrEmpty(getProj().getProjectShortName())) {
			addFieldError("proj.projectShortName", "请输入项目简写!");
		}
		if(StringUtils.isNullOrEmpty(getProj().getProjectName())){
			addFieldError("proj.projectName", "请输入项目名称!");
		}
		if(StringUtils.isNullOrEmpty(getProj().getProjectDesc())) {
			addFieldError("proj.projectDesc", "请输入项目描述!");
		}
		if(aaa[0].equals("false")) {
			addFieldError("proj.projectManager", "请选择开发人员!");
		}
		if(getProj().getProjectPlanStartDate() == null) {
			addFieldError("proj.projectPlanStartDate", "请选择计划开始时间!");
		}
//		if(getProj().getProjectActualStartDate()== null) {
//			addFieldError("proj.projectActualStartDate", "请选择实际开始时间!");
//		}
		
		if(getProj().getProjectPlanEndDate()== null) {
			addFieldError("proj.projectPlanEndDate", "请选择计划结束时间!");
		}
		
//		if(getProj().getProjectActualEndDate() == null) {
//			addFieldError("proj.projectActualEndDate", "请选择实际结束时间!");
//		}
		
		if(getProj().getProjectPlanEndDate() != null && getProj().getProjectPlanStartDate() != null) {
			if(getProj().getProjectPlanEndDate().before(getProj().getProjectPlanStartDate())) {
				addFieldError("proj.projectPlanEndDate", "计划结束时间必须在计划开始时间之后!");
			}
		}

		if(getProj().getProjectActualStartDate() != null && getProj().getProjectActualEndDate() != null) {
			if(getProj().getProjectActualEndDate().before(getProj().getProjectActualStartDate())) {
				addFieldError("proj.projectActualStartDate", "实际结束时间必须在实际开始时间之后!");
			}
		}
		
	}
	
	
	public String save() throws Exception{
		//initData();
		if(aaa != null){
			if(aaa.length == 1 && aaa[0].equals("false")){
				getProjectBiz().saveProject(this.proj,null);
			}else{
				int[] ids = new int[aaa.length];
				for(int i=0;i<aaa.length;i++){
					ids[i] = Integer.parseInt(aaa[i]);
				}
				getProjectBiz().saveProject(this.proj,ids);
			}
		}else{
			getProjectBiz().saveProject(this.proj,null);
		}
		
	
		return SUCCESS;
	}
	
	private Project proj; 
	
	private String[] aaa;
	
	/*
	 * i add sth here
	 */
	
	//private ProjectJoinUser pro_j_u;
	private int projId;

	private List userList;
	private List mayUseUserList;
	private List projJoinUserList;
	private List projectManager;
	
	private List<ProjUserView> projUserList;
	
	public Project getProj() throws DbException, SQLException {
		if(proj == null) {
			if(projId > 0){
				this.proj = getProjectBiz().getProject(projId);
				if(this.proj.getProjectDesc() == null) {
					this.proj.setProjectDesc("");
				}
				this.proj.setProjectDesc(this.proj.getProjectDesc().replaceAll("\r\n", "").replaceAll("\r", "").replaceAll("\n", ""));
			}
		}
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) throws DbException, SQLException {
		this.projId = projId;
	}

	public List getUserList() throws DbException, SQLException {
		if(userList == null){
			userList = getSystemBiz().getUserList(0, Integer.MAX_VALUE);
		}
		return userList;
	}

	public void setUserList(List userList) {
		this.userList = userList;
	}

	public List getMayUseUserList() {
		return mayUseUserList;
	}

	public void setMayUseUserList(List mayUseUserList) {
		this.mayUseUserList = mayUseUserList;
	}

	HttpServletRequest request;
	
	public void setServletRequest(HttpServletRequest request) {
		this.request = request; 
		java.util.Map map = request.getParameterMap();
		for(Iterator it = map.keySet().iterator();it.hasNext();){
			String key = (String)it.next();
			System.out.println(key+" = "+map.get(key).toString());
		}
	}
	public List getProjJoinUserList() {
		return projJoinUserList;
	}
	public void setProjJoinUserList(List projJoinUserList) {
		this.projJoinUserList = projJoinUserList;
	}
	/**
	 * @return the projUserList
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 * @throws IllegalArgumentException 
	 */
	public List<ProjUserView> getProjUserList() throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if(projUserList == null){
			projUserList = getProjectBiz().getProjUserList(projId);
		}
		return projUserList;
	}
	/**
	 * @param aaa the aaa to set
	 */
	public void setAaa(String[] aaa) {
		this.aaa = aaa;
	}
	public List getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(List projectManager) {
		this.projectManager = projectManager;
	}
	
	
//	private User projmanageruser;
//
//	public User getProjmanageruser() throws DbException, SQLException {
//		if(projmanageruser == null){
//			projmanageruser = getSystemBiz().getUser(proj.getProjectManagerId());
//		}
//		return projmanageruser;
//	}
//	public void setProjmanageruser(User projmanageruser) {
//		this.projmanageruser = projmanageruser;
//	}

	

	
}
