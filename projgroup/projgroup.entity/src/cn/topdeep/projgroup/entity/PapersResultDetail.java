package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PAPERS_RESULT_DETAIL: 回答明细
 */
public class PapersResultDetail extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	int papersResultDetailId;
	
	/**
	 * PAPERS_RESULT_ID: 回答标识
	 */
	int papersResultId;
	
	/**
	 * ANSWER_ID: 答案标识
	 */
	int answerId;
	
	/**
	 * PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public int getPapersResultDetailId() {
		return this.papersResultDetailId;
	}
	
	/**
	 * PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public void setPapersResultDetailId(int value)
	 {
		this.papersResultDetailId = value;
	}
	
	/**
	 * PAPERS_RESULT_ID: 回答标识
	 */
	public int getPapersResultId() {
		return this.papersResultId;
	}
	
	/**
	 * PAPERS_RESULT_ID: 回答标识
	 */
	public void setPapersResultId(int value)
	 {
		this.papersResultId = value;
	}
	
	/**
	 * ANSWER_ID: 答案标识
	 */
	public int getAnswerId() {
		return this.answerId;
	}
	
	/**
	 * ANSWER_ID: 答案标识
	 */
	public void setAnswerId(int value)
	 {
		this.answerId = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_DETAIL_ID], [T_PAPERS_RESULT_DETA" +
"IL].[PAPERS_RESULT_ID], [T_PAPERS_RESULT_DETAIL].[ANSWER_ID]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_DETAIL_ID], [T_PAPERS_RESULT_DETA" +
"IL].[PAPERS_RESULT_ID], [T_PAPERS_RESULT_DETAIL].[ANSWER_ID]   from [T_PAPERS_RE" +
"SULT_DETAIL] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_DETAIL_ID], [T_PAPERS_RESULT_DETAIL].[PA" +
"PERS_RESULT_ID], [T_PAPERS_RESULT_DETAIL].[ANSWER_ID] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_PAPERS_RESULT_DETAIL";
	}
	
	
	public String getTableName() {
		return "T_PAPERS_RESULT_DETAIL";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PAPERS_RESULT_DETAIL_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.papersResultDetailId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (PapersResultDetail.class.isInstance(obj)) {
			PapersResultDetail o = ((PapersResultDetail)(obj));
			this.papersResultDetailId = o.papersResultDetailId;
			this.papersResultId = o.papersResultId;
			this.answerId = o.answerId;
		}
	}
	
	/**
	 * 插入PapersResultDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersResultDetail">需要插入的回答明细</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, PapersResultDetail papersResultDetail) throws SQLException, DbException {
		String sql = "insert into [T_PAPERS_RESULT_DETAIL](";
		if ((papersResultDetail.getPapersResultDetailId() > 0)) {
			sql = (sql + "[PAPERS_RESULT_DETAIL_ID], ");
		}
		sql = (sql + "[PAPERS_RESULT_ID]");
		sql = (sql + ", [ANSWER_ID]");
		sql = (sql + ")values(");
		if ((papersResultDetail.getPapersResultDetailId() > 0)) {
			sql = (sql + papersResultDetail.getPapersResultDetailId());
			sql = (sql + ", ");
		}
		sql = (sql + papersResultDetail.getPapersResultId());
		sql = (sql + ", ");
		sql = (sql + papersResultDetail.getAnswerId());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((papersResultDetail.getPapersResultDetailId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_PAPERS_RESULT_DETAIL] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_PAPERS_RESULT_DETAIL off");
			}
			dataVisit.execSql(sql);
			if ((papersResultDetail.getPapersResultDetailId() == 0)) {
				papersResultDetail.papersResultDetailId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入PapersResultDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		PapersResultDetail.insert(dataVisit, this);
	}
	
	/**
	 * 更新PapersResultDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersResultDetail">需要更新的回答明细</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, PapersResultDetail papersResultDetail, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_PAPERS_RESULT_DETAIL] set ";
		sql = (sql + "[PAPERS_RESULT_ID] = ");
		sql = (sql + papersResultDetail.getPapersResultId());
		sql = (sql + ",");
		sql = (sql + "[ANSWER_ID] = ");
		sql = (sql + papersResultDetail.getAnswerId());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PAPERS_RESULT_DETAIL_ID = ");
		sql = (sql + papersResultDetail.getPapersResultDetailId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新PapersResultDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="papersResultDetail">需要更新的回答明细</param>
	 */
	protected static int update(IDataVisit2 dataVisit, PapersResultDetail papersResultDetail) throws SQLException, DbException {
		return PapersResultDetail.update(dataVisit, papersResultDetail, "");
	}
	
	/**
	 * 更新PapersResultDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return PapersResultDetail.update(dataVisit, this);
	}
	
	/**
	 * 更新PapersResultDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return PapersResultDetail.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<PapersResultDetail> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<PapersResultDetail> list = new ArrayList<PapersResultDetail>();
		try {
			for (; reader.next(); ) {
				PapersResultDetail obj = new PapersResultDetail();
				PapersResultDetail.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static List<PapersResultDetail> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<PapersResultDetail> list = new ArrayList<PapersResultDetail>();
		try {
			for (; reader.next(); ) {
				PapersResultDetail obj = new PapersResultDetail();
				PapersResultDetail.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static List<PapersResultDetail> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((PapersResultDetail.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<PapersResultDetail> list = new ArrayList<PapersResultDetail>();
		try {
			for (; reader.next(); ) {
				PapersResultDetail obj = new PapersResultDetail();
				PapersResultDetail.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public static List<PapersResultDetail> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((PapersResultDetail.getFullSelectSql() + appendConditionSql));
		List<PapersResultDetail> list = new ArrayList<PapersResultDetail>();
		try {
			for (; reader.next(); ) {
				PapersResultDetail obj = new PapersResultDetail();
				PapersResultDetail.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static <T extends PapersResultDetail> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((PapersResultDetail.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			PapersResultDetail.readValue(reader, obj);
			list.add(obj);
		}
	}
	finally {
		if ((reader != null)) {
			reader.close();
		}
		dataVisit.releaseConnection();
	}
	return list;
}

/**
 * <param name="dataVisit">数据查询接口</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public static <T extends PapersResultDetail> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((PapersResultDetail.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			PapersResultDetail.readValue(reader, obj);
			list.add(obj);
		}
	}
	finally {
		if ((reader != null)) {
			reader.close();
		}
		dataVisit.releaseConnection();
	}
	return list;
}

/**
 * <param name="dataVisit">数据查询接口</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public static int querySelectObjectsCount(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
	String sql = "select * from T_PAPERS_RESULT_DETAIL ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据回答明细标识查询PapersResultDetail
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersResultDetailId">回答明细标识</param>
 */
public static PapersResultDetail selectByPapersResultDetailId(IDataVisit2 dataVisit, int APapersResultDetailId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PAPERS_RESULT_DETAIL_ID = ");
	sql = (sql + APapersResultDetailId);
	List<PapersResultDetail> list = PapersResultDetail.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个PapersResultDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersResultDetailId">回答明细标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByPapersResultDetailId(IDataVisit2 dataVisit, int APapersResultDetailId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_PAPERS_RESULT_DETAIL] where ");
	sql = (sql + "PAPERS_RESULT_DETAIL_ID = ");
	sql = (sql + APapersResultDetailId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个PapersResultDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="APapersResultDetailId">回答明细标识</param>
 */
public static void deleteByPapersResultDetailId(IDataVisit2 dataVisit, int APapersResultDetailId) throws SQLException, DbException {
	PapersResultDetail.deleteByPapersResultDetailId(dataVisit, APapersResultDetailId, "");
}

/**
 * 根据外键回答标识删除一批PapersResultDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersResultId">回答标识</param>
 */
public static void deleteListByPapersResultId(IDataVisit2 dataVisit, int APapersResultId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_PAPERS_RESULT_DETAIL] where ");
	sql = (sql + "PAPERS_RESULT_ID = ");
	sql = (sql + APapersResultId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键答案标识删除一批PapersResultDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AnswerId">答案标识</param>
 */
public static void deleteListByAnswerId(IDataVisit2 dataVisit, int AAnswerId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_PAPERS_RESULT_DETAIL] where ");
	sql = (sql + "ANSWER_ID = ");
	sql = (sql + AAnswerId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersResultId">回答标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<PapersResultDetail> selectObjectsByPapersResultId(IDataVisit2 dataVisit, int APapersResultId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PAPERS_RESULT_ID = ";
	sql = (sql + APapersResultId);
	sql = (sql + appendConditionSql);
	return PapersResultDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersResultId">回答标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<PapersResultDetail> selectObjectsByPapersResultId(IDataVisit2 dataVisit, int APapersResultId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PAPERS_RESULT_ID = ";
	sql = (sql + APapersResultId);
	return PapersResultDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="PapersResultId">回答标识</param>
 */
public static List<PapersResultDetail> selectObjectsByPapersResultId(IDataVisit2 dataVisit, int APapersResultId) throws SQLException, DbException {
	String sql = " where PAPERS_RESULT_ID = ";
	sql = (sql + APapersResultId);
	return PapersResultDetail.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AnswerId">答案标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<PapersResultDetail> selectObjectsByAnswerId(IDataVisit2 dataVisit, int AAnswerId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ANSWER_ID = ";
	sql = (sql + AAnswerId);
	sql = (sql + appendConditionSql);
	return PapersResultDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AnswerId">答案标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<PapersResultDetail> selectObjectsByAnswerId(IDataVisit2 dataVisit, int AAnswerId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where ANSWER_ID = ";
	sql = (sql + AAnswerId);
	return PapersResultDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AnswerId">答案标识</param>
 */
public static List<PapersResultDetail> selectObjectsByAnswerId(IDataVisit2 dataVisit, int AAnswerId) throws SQLException, DbException {
	String sql = " where ANSWER_ID = ";
	sql = (sql + AAnswerId);
	return PapersResultDetail.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象papersResultDetail中
 * <param name="reader">数据源</param>
 * <param name="papersResultDetail">目标对象</param>
 */
public static void readValue(ResultSet reader, PapersResultDetail papersResultDetail) throws SQLException, DbException {
	papersResultDetail.papersResultDetailId = reader.getInt(1);
	papersResultDetail.papersResultId = reader.getInt(2);
	papersResultDetail.answerId = reader.getInt(3);
}
}
