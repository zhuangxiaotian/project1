package cn.topdeep.projgroup.biz;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.cache2.CacheException;

import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.LoginUser;
import cn.topdeep.projgroup.dao.*;

public class SystemBiz extends BaseBiz {
	//public final static String LOGIN_SESSION_NAME = "cn.topdeep.projgroup.loginsessionname";
	
	private SystemDao systemDao;
	
	public Role getRole(int roleId) throws DbException, SQLException, CacheException{
		return roleSelectByRoleId(roleId);
	}
	
	public Role getRole(String roleName) throws DbException, SQLException{
		if(roleName == null)return null;
		return systemDao.getRole(roleName);
	}
	
	public void saveRole(Role role) throws DbException, SQLException{
		if(role.getRoleId() > 0){
			systemDao.updateRole(role);
		}else{
			systemDao.insertRole(role);
		}
	}
	
	public int getQueryUserListCount() throws SQLException {
		return getSystemDao().getQueryUserListCount();
	}
	

	public List getRoleList() throws DbException, SQLException {
		return systemDao.getRoleList();
	}

	public void disableRoles(int[] ids) throws SQLException {
		systemDao.changeRoleState(ids,EntityState.Disabled);
	}
	
	public void enableRoles(int[] ids) throws SQLException{
		systemDao.changeRoleState(ids,EntityState.Normal);
	}

	public void deleteRoles(int[] ids) throws SQLException {
		systemDao.deleteRole(ids);
	}

	public User getUser(int userId) throws DbException, SQLException {
		return systemDao.getUser(userId);
	}
	
	public User getUser(String loginName) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException{
		return userSelectByLoginName(loginName);
	}

	public void saveUser(User user) throws DbException, SQLException, CacheException {
		if(user.getUserId() > 0){
			userUpdate(user);
		}else{
			userInsert(user);
		}
	}

	public String getUserPassword(String userPassword) {
		return userPassword;
	}

	public List getUserList(int pageIndex, int rowsOfPage) throws DbException, SQLException {
		return systemDao.getUserList(pageIndex, rowsOfPage);
	}

	public void disableUsers(int[] ids) throws SQLException {
		systemDao.changeUserState(ids,EntityState.Disabled);
	}

	public void enableUsers(int[] ids) throws SQLException {
		systemDao.changeUserState(ids,EntityState.Normal);
	}
	
	public void enableProjects(int[] ids) throws SQLException {
		systemDao.changeProjectState(ids,EntityState.Normal);
	}
	
	public void disableProjects(int[] ids) throws SQLException{
		systemDao.changeProjectState(ids, EntityState.Disabled);
	}

	public void disableTasks(int[] ids) throws SQLException{
		systemDao.changeTaskState(ids, EntityState.Disabled);
	}
	
	public void enableTasks(int[] ids) throws SQLException{
		systemDao.changeTaskState(ids, EntityState.Normal);
	}
	
	public void startTask(int id) throws SQLException{
		systemDao.changeOneTaskState(id, cn.topdeep.projgroup.entity.data.TaskState.Normal);
	}
	
	public void startTaskNoTime(int id) throws SQLException{
		systemDao.changeOneTaskStateNoTime(id, cn.topdeep.projgroup.entity.data.TaskState.Normal);
	}
	
	
	public void gameoverTask(int id) throws SQLException{
		systemDao.changeOneTaskState(id, cn.topdeep.projgroup.entity.data.TaskState.Gameover);
	}
	
	public void parseTask(int id) throws SQLException{
		systemDao.changeOneTaskState(id, cn.topdeep.projgroup.entity.data.TaskState.Disabled);
	}
	
	
	/**
	 * 处理用户登录,登录成功后返回初始化好的AdminUser
	 * @param ALoginName 登录名称
	 * @param ALoginPass 登录密码
	 * @param ALoginAddress 登录地址
	 * @return 如果登录成功,返回登录用户,否则返回Null
	 * @throws SQLException 
	 * @throws DbException 
	 * @throws SQLException
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IllegalArgumentException 
	 * @throws CacheException 
	 */
	public LoginUser UserLogin(String loginName, String loginPass, String loginAddress) throws DbException, SQLException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, CacheException
	{
		if((loginName == null) || (loginPass == null)){
			return null;
		}
		User user = getUser(loginName);
		if (user == null) return null;
		if (!user.getLoginPass().equals(getUserPassword(loginPass))) {
			return null;
		}
		if (user.getUserState() != EntityState.Normal) {
			return null;
		}
		loginUser.setLoginUser(user);
		if((user.getUserRoles() != null) && (user.getUserRoles().trim().length() != 0)){
			List roleList = systemDao.getRoleList(user.getUserRoles());
			for(int i=0;i<roleList.size();i++){
				Role role = (Role)roleList.get(i);
				if(role.getRolePrivileges() != null){
					loginUser.privilegeAdd(role.getRolePrivileges());
				}
			}
		}
		if((user.getUserPrivileges() != null) && (user.getUserPrivileges().trim().length() != 0)){
			loginUser.privilegeAdd(user.getUserPrivileges());
		}
		//systemDao.updateUserLoginTime(user.getUserId(), loginAddress);
		user.setLastLoginAddress(loginAddress);
		user.setLastLoginTime(new java.util.Date());
		userUpdate(user);
		//插入登记记录
		loginUser.setLogin(true);
		return loginUser;
	}

	public SystemDao getSystemDao() {
		return systemDao;
	}

	public void setSystemDao(SystemDao systemDao) {
		this.systemDao = systemDao;
	}
}
