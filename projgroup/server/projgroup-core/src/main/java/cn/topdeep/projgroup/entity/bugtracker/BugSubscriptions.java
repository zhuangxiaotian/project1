package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * BUG_SUBSCRIPTIONS: 
 */
public class BugSubscriptions extends common.dbvisit.BaseTable {
	
	/**
	 * BS_ID: 
	 */
	private int bsId;
	
	/**
	 * BS_BUG: 
	 */
	private int bsBug;
	
	/**
	 * BS_USER: 
	 */
	private int bsUser;
	
	/**
	 * BS_ID: 
	 */
	public int getBsId() {
		return this.bsId;
	}
	
	/**
	 * BS_ID: 
	 */
	public void setBsId(int value)
	 {
		this.bsId = value;
	}
	
	/**
	 * BS_BUG: 
	 */
	public int getBsBug() {
		return this.bsBug;
	}
	
	/**
	 * BS_BUG: 
	 */
	public void setBsBug(int value)
	 {
		this.bsBug = value;
	}
	
	/**
	 * BS_USER: 
	 */
	public int getBsUser() {
		return this.bsUser;
	}
	
	/**
	 * BS_USER: 
	 */
	public void setBsUser(int value)
	 {
		this.bsUser = value;
	}
	
	public static String getSelectSql() {
		return "select [BUG_SUBSCRIPTIONS].[BS_ID],[BUG_SUBSCRIPTIONS].[BS_BUG],[BUG_SUBSCRIPTION" +
"S].[BS_USER] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param BugSubscriptions 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, BugSubscriptions ABugSubscriptions) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [BUG_SUBSCRIPTIONS] (");
		sql.append("[BUG_SUBSCRIPTIONS].[BS_BUG],");
		sql.append("[BUG_SUBSCRIPTIONS].[BS_USER],");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(ABugSubscriptions.bsBug);
		sql.append(",");
		sql.append(ABugSubscriptions.bsUser);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			ABugSubscriptions.bsId = ((int)(((double)(ADataVisit.getIDentity()))));
			ADataVisit.commitTransaction();
		}
		catch (SQLException e) {
			ADataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param BugSubscriptions 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, BugSubscriptions ABugSubscriptions) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("BUG_SUBSCRIPTIONS set ");
		sql.append("BS_BUG = ");
		sql.append(ABugSubscriptions.bsBug);
		sql.append(",");
		sql.append("BS_USER = ");
		sql.append(ABugSubscriptions.bsUser);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("BS_ID = ");
		sql.append(ABugSubscriptions.bsId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param BugSubscriptions 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, BugSubscriptions ABugSubscriptions, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("BUG_SUBSCRIPTIONS set ");
		sql.append("BS_BUG = ");
		sql.append(ABugSubscriptions.bsBug);
		sql.append(",");
		sql.append("BS_USER = ");
		sql.append(ABugSubscriptions.bsUser);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("BS_ID = ");
		sql.append(ABugSubscriptions.bsId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<BugSubscriptions> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((BugSubscriptions.getSelectSql() 
						+ (" from [BUG_SUBSCRIPTIONS] " + AppendSql)));
		List<BugSubscriptions> list = new ArrayList<BugSubscriptions>();
		try {
			for (; reader.next(); ) {
				BugSubscriptions obj = new BugSubscriptions();
				BugSubscriptions.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			ADataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @return 查询结果
	 */
	public static List<BugSubscriptions> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return BugSubscriptions.selectObjects(ADataVisit, "");
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public static List<BugSubscriptions> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((BugSubscriptions.getSelectSql() 
						+ (" from [BUG_SUBSCRIPTIONS] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<BugSubscriptions> list = new ArrayList<BugSubscriptions>();
		try {
			for (; reader.next(); ) {
				BugSubscriptions obj = new BugSubscriptions();
				BugSubscriptions.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			ADataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @return 查询结果
	 * @param pageIndex 页索引
	 * @param rowsOfPage 每页记录数
	 * @param orderField 排序字段
	 * @param order 排序顺序 asc desc
	 */
	public static List<BugSubscriptions> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return BugSubscriptions.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表BUG_SUBSCRIPTIONS中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static BugSubscriptions SelectByBsId(IDataVisit2 ADataVisit, int ABsId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("BS_ID = ");
		sql.append(ABsId);
		List<BugSubscriptions> list = BugSubscriptions.selectObjects(ADataVisit, sql.toString());
		if ((list.size() > 0)) {
			return list.get(0);
		}
		else {
			return null;
		}
	}
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * @param object 源对象
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (this.getClass().isInstance(obj)) {
			BugSubscriptions o = ((BugSubscriptions)(obj));
			this.bsId = o.bsId;
			this.bsBug = o.bsBug;
			this.bsUser = o.bsUser;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			BugSubscriptions o = ((BugSubscriptions)(obj));
			o.bsId = this.bsId;
			o.bsBug = this.bsBug;
			o.bsUser = this.bsUser;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByBsId(IDataVisit2 ADataVisit, int ABsId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from BUG_SUBSCRIPTIONS where ");
		sql = (sql + "BS_ID = ");
		sql = (sql + ABsId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByBsId(IDataVisit2 ADataVisit, int ABsId) throws SQLException, DbException {
		BugSubscriptions.deleteByBsId(ADataVisit, ABsId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param ABugSubscriptions 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, BugSubscriptions ABugSubscriptions) throws SQLException {
		ABugSubscriptions.bsId = AReader.getInt(1);
		ABugSubscriptions.bsBug = AReader.getInt(2);
		ABugSubscriptions.bsUser = AReader.getInt(3);
	}
}
