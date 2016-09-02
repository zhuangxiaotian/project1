/**
 * 
 */
package cn.topdeep.projgroup.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.List;

import cn.topdeep.projgroup.entity.bugtracker.BusinessLogicManage;
import common.db.SqlServerUtils;
import common.dbvisit.IDataVisit2;

/**
 * @author niexin
 *
 */
public class BugtrackerDao extends BusinessLogicManage {

	
	/* (non-Javadoc)
	 * @see com.lijigou.entity.BusinessLogicManage#getDataVisit()
	 */
	@Override
	public IDataVisit2 getDataVisit() {
		return bugTrackerDataVisit;
	}
	
	private IDataVisit2 bugTrackerDataVisit;
	

	public <T> List<T> queryEntity(Class<T> type, String sql) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		return getDataVisit().queryEntity(type, sql);
	}

	public <T> List<T> queryEntity(Class<T> type, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		return getDataVisit().queryEntity(type, sql, pageIndex, rowsOfPage, orderField, order);
	}

	public int queryCount(String sql) throws SQLException{
		return getDataVisit().getCount(sql);
	}

	public <T> T querySingleEntity(Class<T> type, String sql) throws IllegalArgumentException, SQLException, InstantiationException, IllegalAccessException, InvocationTargetException{
		List<T> list = queryEntity(type, sql);
		if(list.size() > 0){
			return list.get(0);
		}else{
			return null;
		}
	}

	public IDataVisit2 getBugTrackerDataVisit() {
		return bugTrackerDataVisit;
	}

	public void setBugTrackerDataVisit(IDataVisit2 bugTrackerDataVisit) {
		this.bugTrackerDataVisit = bugTrackerDataVisit;
	}
	
}
