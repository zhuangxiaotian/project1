package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * PRIORITIES: 
 */
public class Priorities extends common.dbvisit.BaseTable {
	
	/**
	 * PR_ID: 
	 */
	private int prId;
	
	/**
	 * PR_NAME: 
	 */
	private String prName = "";
	
	/**
	 * PR_SORT_SEQ: 
	 */
	private int prSortSeq;
	
	/**
	 * PR_BACKGROUND_COLOR: 
	 */
	private String prBackgroundColor = "";
	
	/**
	 * PR_STYLE: 
	 */
	private String prStyle;
	
	/**
	 * PR_DEFAULT: 
	 */
	private int prDefault;
	
	/**
	 * PR_ID: 
	 */
	public int getPrId() {
		return this.prId;
	}
	
	/**
	 * PR_ID: 
	 */
	public void setPrId(int value)
	 {
		this.prId = value;
	}
	
	/**
	 * PR_NAME: 
	 */
	public String getPrName() {
		return this.prName;
	}
	
	/**
	 * PR_NAME: 
	 */
	public void setPrName(String value)
	 {
		this.prName = value;
	}
	
	/**
	 * PR_SORT_SEQ: 
	 */
	public int getPrSortSeq() {
		return this.prSortSeq;
	}
	
	/**
	 * PR_SORT_SEQ: 
	 */
	public void setPrSortSeq(int value)
	 {
		this.prSortSeq = value;
	}
	
	/**
	 * PR_BACKGROUND_COLOR: 
	 */
	public String getPrBackgroundColor() {
		return this.prBackgroundColor;
	}
	
	/**
	 * PR_BACKGROUND_COLOR: 
	 */
	public void setPrBackgroundColor(String value)
	 {
		this.prBackgroundColor = value;
	}
	
	/**
	 * PR_STYLE: 
	 */
	public String getPrStyle() {
		return this.prStyle;
	}
	
	/**
	 * PR_STYLE: 
	 */
	public void setPrStyle(String value)
	 {
		this.prStyle = value;
	}
	
	/**
	 * PR_DEFAULT: 
	 */
	public int getPrDefault() {
		return this.prDefault;
	}
	
	/**
	 * PR_DEFAULT: 
	 */
	public void setPrDefault(int value)
	 {
		this.prDefault = value;
	}
	
	public static String getSelectSql() {
		return "select [PRIORITIES].[PR_ID],[PRIORITIES].[PR_NAME],[PRIORITIES].[PR_SORT_SEQ],[PR" +
"IORITIES].[PR_BACKGROUND_COLOR],[PRIORITIES].[PR_STYLE],[PRIORITIES].[PR_DEFAULT" +
"] ";
	}
	
	
	/**
	 * 插入一个对象到数据库中
	 * @param ADataVisit 数据访问接口
	 * @param Priorities 需要插入的新对象
	 */
	public static void insert(IDataVisit2 ADataVisit, Priorities APriorities) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("insert into [PRIORITIES] (");
		sql.append("[PRIORITIES].[PR_NAME],");
		sql.append("[PRIORITIES].[PR_SORT_SEQ],");
		sql.append("[PRIORITIES].[PR_BACKGROUND_COLOR],");
		if ((APriorities.prStyle == null)) {
		}
		else {
			sql.append("[PRIORITIES].[PR_STYLE],");
		}
		sql.append("[PRIORITIES].[PR_DEFAULT],");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(") values (");
		sql.append(SqlServerUtils.safeSql(APriorities.prName.toString()));
		sql.append(",");
		sql.append(APriorities.prSortSeq);
		sql.append(",");
		sql.append(SqlServerUtils.safeSql(APriorities.prBackgroundColor.toString()));
		sql.append(",");
		if ((APriorities.prStyle == null)) {
		}
		else {
			sql.append(SqlServerUtils.safeSql(APriorities.prStyle.toString()));
			sql.append(",");
		}
		sql.append(APriorities.prDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(")");
		ADataVisit.beginTransaction();
		try {
			ADataVisit.execSql(sql.toString());
			APriorities.prId = ((int)(((double)(ADataVisit.getIDentity()))));
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
	 * @param Priorities 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Priorities APriorities) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("PRIORITIES set ");
		sql.append("PR_NAME = ");
		sql.append(SqlServerUtils.safeSql(APriorities.prName.toString()));
		sql.append(",");
		sql.append("PR_SORT_SEQ = ");
		sql.append(APriorities.prSortSeq);
		sql.append(",");
		sql.append("PR_BACKGROUND_COLOR = ");
		sql.append(SqlServerUtils.safeSql(APriorities.prBackgroundColor.toString()));
		sql.append(",");
		if ((APriorities.prStyle == null)) {
			sql.append("PR_STYLE = default ,");
		}
		else {
			sql.append("PR_STYLE = ");
			sql.append(SqlServerUtils.safeSql(APriorities.prStyle.toString()));
			sql.append(",");
		}
		sql.append("PR_DEFAULT = ");
		sql.append(APriorities.prDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("PR_ID = ");
		sql.append(APriorities.prId);
		return ADataVisit.execSql(sql.toString());
	}
	
	/**
	 * 更新一个对象到数据库中
	 * @param  ADataVisit 数据访问接口
	 * @param Priorities 需要插入的新对象
	 */
	public static int update(IDataVisit2 ADataVisit, Priorities APriorities, String appendConditionSql) throws SQLException, DbException {
		StringBuilder sql;
		sql = new StringBuilder();
		sql.append("update ");
		sql.append("PRIORITIES set ");
		sql.append("PR_NAME = ");
		sql.append(SqlServerUtils.safeSql(APriorities.prName.toString()));
		sql.append(",");
		sql.append("PR_SORT_SEQ = ");
		sql.append(APriorities.prSortSeq);
		sql.append(",");
		sql.append("PR_BACKGROUND_COLOR = ");
		sql.append(SqlServerUtils.safeSql(APriorities.prBackgroundColor.toString()));
		sql.append(",");
		if ((APriorities.prStyle == null)) {
			sql.append("PR_STYLE = default ,");
		}
		else {
			sql.append("PR_STYLE = ");
			sql.append(SqlServerUtils.safeSql(APriorities.prStyle.toString()));
			sql.append(",");
		}
		sql.append("PR_DEFAULT = ");
		sql.append(APriorities.prDefault);
		sql.append(",");
		sql.delete((sql.length() - 1), sql.length());
		sql.append(" where ");
		sql.append("PR_ID = ");
		sql.append(APriorities.prId);
		sql.append(appendConditionSql);
		return ADataVisit.execSql(sql.toString());
	}
	
	public String toString() {
		return this.prName.toString();
	}
	
	/**
	 * 查询数据集
	 * @param ADataVisit 数据访问接口
	 * @param AppendSql 附加的Sql语句
	 * @return 查询结果
	 */
	public static List<Priorities> selectObjects(IDataVisit2 ADataVisit, String AppendSql) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Priorities.getSelectSql() 
						+ (" from [PRIORITIES] " + AppendSql)));
		List<Priorities> list = new ArrayList<Priorities>();
		try {
			for (; reader.next(); ) {
				Priorities obj = new Priorities();
				Priorities.readValue(reader, obj);
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
	public static List<Priorities> selectObjects(IDataVisit2 ADataVisit) throws SQLException {
		return Priorities.selectObjects(ADataVisit, "");
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
	public static List<Priorities> selectObjects(IDataVisit2 ADataVisit, String AppendSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		ResultSet reader = ADataVisit.queryDataReader((Priorities.getSelectSql() 
						+ (" from [PRIORITIES] " + AppendSql)), pageIndex, rowsOfPage, orderField, order);
		List<Priorities> list = new ArrayList<Priorities>();
		try {
			for (; reader.next(); ) {
				Priorities obj = new Priorities();
				Priorities.readValue(reader, obj);
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
	public static List<Priorities> selectObjects(IDataVisit2 ADataVisit, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException {
		return Priorities.selectObjects(ADataVisit, "", pageIndex, rowsOfPage, orderField, order);
	}
	
	/**
	 * 从数据表PRIORITIES中查询一个实体对象
	 * @param ADataVisit 数据访问接口
	 * @param Int32 
	 */
	public static Priorities SelectByPrId(IDataVisit2 ADataVisit, int APrId) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append(" where ");
		sql.append("PR_ID = ");
		sql.append(APrId);
		List<Priorities> list = Priorities.selectObjects(ADataVisit, sql.toString());
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
			Priorities o = ((Priorities)(obj));
			this.prId = o.prId;
			this.prName = o.prName;
			this.prSortSeq = o.prSortSeq;
			this.prBackgroundColor = o.prBackgroundColor;
			this.prStyle = o.prStyle;
			this.prDefault = o.prDefault;
		}
	}
	
	/**
	 * 复制值到给定的对象,要求目标对象是子类
	 * @param object 目标对象
	 */
	public void assignTo(BaseTable obj) {
		super.assignTo(obj);
		if (this.getClass().isInstance(obj)) {
			Priorities o = ((Priorities)(obj));
			o.prId = this.prId;
			o.prName = this.prName;
			o.prSortSeq = this.prSortSeq;
			o.prBackgroundColor = this.prBackgroundColor;
			o.prStyle = this.prStyle;
			o.prDefault = this.prDefault;
		}
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 * <@param appendSql 附加的条件语句>
	 */
	public static void deleteByPrId(IDataVisit2 ADataVisit, int APrId, String appendSql) throws SQLException, DbException {
		String sql = "";
		sql = (sql + " delete from PRIORITIES where ");
		sql = (sql + "PR_ID = ");
		sql = (sql + APrId);
		sql = (sql + appendSql);
		ADataVisit.execSql(sql);
	}
	
	/**
	 * 从数据库中删除一个对象
	 * @param ADataVisit 数据访问接口
	 * @param name=Int32
	 */
	public static void deleteByPrId(IDataVisit2 ADataVisit, int APrId) throws SQLException, DbException {
		Priorities.deleteByPrId(ADataVisit, APrId, "");
	}
	
	/**
	 * 把ResultSet中的数据转到对象中
	 * @param AReader 数据源
	 * @param APriorities 目标对象
	 * @return 
	 */
	public static void readValue(ResultSet AReader, Priorities APriorities) throws SQLException {
		APriorities.prId = AReader.getInt(1);
		APriorities.prName = AReader.getString(2);
		APriorities.prSortSeq = AReader.getInt(3);
		APriorities.prBackgroundColor = AReader.getString(4);
		APriorities.prStyle = AReader.getString(5);
		if (AReader.wasNull()) {
			APriorities.prStyle = null;
		}
		APriorities.prDefault = AReader.getInt(6);
	}
}
