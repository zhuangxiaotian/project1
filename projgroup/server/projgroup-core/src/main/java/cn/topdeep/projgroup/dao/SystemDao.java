package cn.topdeep.projgroup.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import common.db.*;
import common.util.StringUtils;
import cn.topdeep.projgroup.entity.base.PageImpl;
import cn.topdeep.projgroup.entity.db.*;
import cn.topdeep.projgroup.entity.data.TaskState;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.poifs.storage.ListManagedBlock;

public class SystemDao extends ProjgroupDao {
	
	private final static Log logger = LogFactory.getLog(SystemDao.class);
	//private ProjgroupDao projgDao=new ProjgroupDao();
	
	public Role getRole(int roleId) throws SQLException{
		return roleSelectByPrimaryKey(roleId);
	}
	
	public void insertRole(Role role) throws SQLException{
		roleInsert(role);
	}
	
	public void updateRole(Role role) throws SQLException{
		roleUpdate(role);
	}

	public List<Role> getRoleList() throws SQLException {
		RoleExample condition = new RoleExample();
		return roleSelectObjects(condition);
	}

	public Role getRole(String roleName) throws SQLException {
		RoleExample condition = new RoleExample();
		condition.or(condition.createCriteria().andRoleNameEqualTo(roleName));
		List<Role> list = roleSelectObjects(condition);
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
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

	public User getUser(int userId) throws SQLException {
		return userSelectByPrimaryKey(userId);
		
	}

	public List getUserList(int pageIndex, int rowsOfPage) throws SQLException {
		UserExample condition = new UserExample();
		PageImpl page = new PageImpl(pageIndex, rowsOfPage);
		condition.setPage(page);
		condition.setOrderByClause("USER_ID asc");
		return userSelectObjects(condition);
	}

	public void changeUserState(int[] ids, int newState) throws SQLException {
		if((ids == null) || (ids.length == 0)) 
			return;
		UserExample condition = new UserExample();
		List<Integer> idList = new ArrayList<Integer>();
		for(int item : ids){
			idList.add(item);
		}
		condition.or().andUserIdIn(idList);
		UserMapper mapperImpl = this.getSqlSession().getMapper(UserMapper.class);
		User editUser = new User();
		editUser.setUserState(newState);
		mapperImpl.updateByExampleSelective(editUser, condition);
//		return ret;
//		super.userUpdate(user)
//		String sql = "update T_USER set USER_STATE = "+newState+" where USER_ID in ("+SqlUtils.intArrayToString(ids)+")";
//		getDataVisit().execSql(sql);
		
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
		RoleExample condition = new RoleExample();
		List<Integer> idList = new ArrayList<Integer>();
		String[] roleIdAry = userRoles.split(",");
		if(roleIdAry != null && roleIdAry.length > 0){
			for(String item : roleIdAry){
				if(!StringUtils.isNullOrEmpty(item)){
					int id = Integer.parseInt(item);
					idList.add(id);
				}
			}
		}
		condition.createCriteria().andRoleIdIn(idList);
		return roleSelectObjects(condition);
//		String sql = Role.getSelectSql()+" from T_ROLE where ROLE_ID in ("+userRoles+")";
//		return queryEntity(Role.class, sql);
		
	}

	public int getQueryUserListCount() throws SQLException {
		return userQuerySelectObjectsCount(new UserExample());
	} 
	
	
}
