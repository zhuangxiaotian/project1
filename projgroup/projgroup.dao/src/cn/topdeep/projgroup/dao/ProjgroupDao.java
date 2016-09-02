/**
 * 
 */
package cn.topdeep.projgroup.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.List;
import cn.topdeep.projgroup.entity.*;
import common.db.SqlServerUtils;
import common.dbvisit.IDataVisit2;

/**
 * @author niexin
 *
 */
public class ProjgroupDao extends BusinessLogicManage {

	
	/* (non-Javadoc)
	 * @see com.lijigou.entity.BusinessLogicManage#getDataVisit()
	 */
	@Override
	public IDataVisit2 getDataVisit() {
		return dataVisit;
	}
	
	private IDataVisit2 dataVisit;
	
	public void setDataVisit(IDataVisit2 dataVisit){
		this.dataVisit = dataVisit;
	}

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
	
	/**
	 * 获得20位的唯一代码作为主键
	 * @param tableName 主键所应用到的表名
	 * @return
	 * @throws SQLException 
	 */
	public String getIdentityCode(String tableName) throws SQLException{
		//String sql = "exec P_GET_IDENTITY "+SqlServerUtils.safeSql(tableName)+",121,3";
		String sql = "{call P_GET_IDENTITY(?,?,?,?)}"; 
		
		Connection cn = getDataVisit().getConnection();
		try {
			CallableStatement cmd = null;
		    cmd = cn.prepareCall(sql);
		    cmd.setString(1, tableName);
		    cmd.setInt(2, 121);
		    cmd.setInt(3, 3);
		    cmd.registerOutParameter(4, java.sql.Types.VARCHAR);
		    cmd.execute();
		    return cmd.getString(4);
		} finally{
			getDataVisit().releaseConnection();
		}
	}
}
