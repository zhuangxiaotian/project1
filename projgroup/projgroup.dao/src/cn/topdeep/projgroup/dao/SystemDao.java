package cn.topdeep.projgroup.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import common.db.*;
import cn.topdeep.projgroup.entity.*;
import cn.topdeep.projgroup.entity.data.TaskState;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SystemDao extends ProjgroupDao {
	
	private final static Log logger = LogFactory.getLog(SystemDao.class);
	//private ProjgroupDao projgDao=new ProjgroupDao();
	
	public Role getRole(int roleId) throws DbException, SQLException{
		return roleSelectByRoleId(roleId);
	}
	
	public void insertRole(Role role) throws DbException, SQLException{
		roleInsert(role);
	}
	
	public void updateRole(Role role) throws DbException, SQLException{
		roleUpdate(role,"");
	}

	public List<Role> getRoleList() throws DbException, SQLException {
		return roleSelectObjects("");
	}

	public Role getRole(String roleName) throws DbException, SQLException {
		return roleSelectByRoleName(roleName);
	}

	public void changeRoleState(int[] ids, int newState) throws SQLException {
		if((ids == null) || (ids.length == 0)) 
			return;
		getDataVisit().execSql("update T_ROLE set ROLE_STATE = "+newState+" where ROLE_ID in ("+SqlUtils.intArrayToString(ids)+")");
	}

	public void deleteRole(int[] ids) throws SQLException {
		if((ids == null) || (ids.length == 0)) 
			return;
		getDataVisit().execSql("delete T_ROLE where ROLE_ID in ("+SqlUtils.intArrayToString(ids)+")");
	}

	public User getUser(int userId) throws DbException, SQLException {
		return userSelectByUserId(userId);
		
	}

	public List getUserList(int pageIndex, int rowsOfPage) throws DbException, SQLException {
		return userSelectObjects("",pageIndex, rowsOfPage, "USER_ID", "asc");
	}

	public void changeUserState(int[] ids, int newState) throws SQLException {
		if((ids == null) || (ids.length == 0)) 
			return;
		String sql = "update T_USER set USER_STATE = "+newState+" where USER_ID in ("+SqlUtils.intArrayToString(ids)+")";
		getDataVisit().execSql(sql);
		
	}
	
	public void changeProjectState(int[] ids, int newState) throws SQLException {
		if((ids == null) || (ids.length == 0)) 
			return;
		String sql = "update T_PROJECT set PROJECT_STATE = "+newState+" where PROJ_ID in ("+SqlUtils.intArrayToString(ids)+")";
		getDataVisit().execSql(sql);
		
	}
	
	public void changeTaskState(int[] ids, int newState) throws SQLException {
		if((ids == null) || (ids.length == 0)) 
			return;
		String sql = "update T_TASK set TASK_STATE = "+newState+" where TASK_ID in ("+SqlUtils.intArrayToString(ids)+")";
		getDataVisit().execSql(sql);
		
	}

	public void changeOneTaskState(int id,int newState) throws SQLException{
		if(id==0) return;
		String sql = "update T_TASK set TASK_STATE = "+newState;
		switch (newState) {
		case TaskState.Normal:
			sql += ", TASK_ACTUAL_START_DATE = "+SqlServerUtils.getDateSql(new Date());
			break;
		case TaskState.Gameover:
			sql+=", TASK_ACTUAL_END_DATE = "+SqlServerUtils.getDateSql(new Date());
		default:
			break;
		}
		sql += "where TASK_ID="+id;
		getDataVisit().execSql(sql);
	}
	
	public void changeOneTaskStateNoTime(int id,int newState) throws SQLException{
		if(id==0) return;
		String sql = "update T_TASK set TASK_STATE = "+newState;
		sql += "where TASK_ID="+id;
		getDataVisit().execSql(sql);
	}
	/**
	 * 
	 * @param userRoles 角色参数为用逗号分隔开的角色ID
	 * @return
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 * @throws IllegalArgumentException 
	 */
	public List<Role> getRoleList(String userRoles) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException {
		String sql = Role.getSelectSql()+" from T_ROLE where ROLE_ID in ("+userRoles+")";
		return queryEntity(Role.class, sql);
		
	}

	public int getQueryUserListCount() throws SQLException {
		String sql = User.getSelectSql() +"from T_User";
		return queryCount(sql);
	} 
	
	
}
