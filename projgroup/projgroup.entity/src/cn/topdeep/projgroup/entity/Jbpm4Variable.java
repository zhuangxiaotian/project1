package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_VARIABLE: 
 */
public class Jbpm4Variable extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * DBID_: 
	 */
	double dbid;
	
	/**
	 * CLASS_: 
	 */
	String class_ = "";
	
	/**
	 * DBVERSION_: 
	 */
	int dbversion;
	
	/**
	 * KEY_: 
	 */
	String key;
	
	/**
	 * CONVERTER_: 
	 */
	String converter;
	
	/**
	 * HIST_: 
	 */
	Byte hist;
	
	/**
	 * EXECUTION_: 
	 */
	Double execution;
	
	/**
	 * TASK_: 
	 */
	Double task;
	
	/**
	 * LOB_: 
	 */
	Double lob;
	
	/**
	 * DATE_VALUE_: 
	 */
	java.util.Date dateValue;
	
	/**
	 * DOUBLE_VALUE_: 
	 */
	Double doubleValue;
	
	/**
	 * CLASSNAME_: 
	 */
	String classname;
	
	/**
	 * LONG_VALUE_: 
	 */
	Double longValue;
	
	/**
	 * STRING_VALUE_: 
	 */
	String stringValue;
	
	/**
	 * TEXT_VALUE_: 
	 */
	String textValue;
	
	/**
	 * EXESYS_: 
	 */
	Double exesys;
	
	/**
	 * DBID_: 
	 */
	public double getDbid() {
		return this.dbid;
	}
	
	/**
	 * DBID_: 
	 */
	public void setDbid(double value)
	 {
		this.dbid = value;
	}
	
	/**
	 * CLASS_: 
	 */
	public String getClass_() {
		return this.class_;
	}
	
	/**
	 * CLASS_: 
	 */
	public void setClass_(String value)
	 {
		this.class_ = value;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public int getDbversion() {
		return this.dbversion;
	}
	
	/**
	 * DBVERSION_: 
	 */
	public void setDbversion(int value)
	 {
		this.dbversion = value;
	}
	
	/**
	 * KEY_: 
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * KEY_: 
	 */
	public void setKey(String value)
	 {
		this.key = value;
	}
	
	/**
	 * CONVERTER_: 
	 */
	public String getConverter() {
		return this.converter;
	}
	
	/**
	 * CONVERTER_: 
	 */
	public void setConverter(String value)
	 {
		this.converter = value;
	}
	
	/**
	 * HIST_: 
	 */
	public Byte getHist() {
		return this.hist;
	}
	
	/**
	 * HIST_: 
	 */
	public void setHist(Byte value)
	 {
		this.hist = value;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public Double getExecution() {
		return this.execution;
	}
	
	/**
	 * EXECUTION_: 
	 */
	public void setExecution(Double value)
	 {
		this.execution = value;
	}
	
	/**
	 * TASK_: 
	 */
	public Double getTask() {
		return this.task;
	}
	
	/**
	 * TASK_: 
	 */
	public void setTask(Double value)
	 {
		this.task = value;
	}
	
	/**
	 * LOB_: 
	 */
	public Double getLob() {
		return this.lob;
	}
	
	/**
	 * LOB_: 
	 */
	public void setLob(Double value)
	 {
		this.lob = value;
	}
	
	/**
	 * DATE_VALUE_: 
	 */
	public java.util.Date getDateValue() {
		return this.dateValue;
	}
	
	/**
	 * DATE_VALUE_: 
	 */
	public void setDateValue(java.util.Date value)
	 {
		this.dateValue = value;
	}
	
	/**
	 * DOUBLE_VALUE_: 
	 */
	public Double getDoubleValue() {
		return this.doubleValue;
	}
	
	/**
	 * DOUBLE_VALUE_: 
	 */
	public void setDoubleValue(Double value)
	 {
		this.doubleValue = value;
	}
	
	/**
	 * CLASSNAME_: 
	 */
	public String getClassname() {
		return this.classname;
	}
	
	/**
	 * CLASSNAME_: 
	 */
	public void setClassname(String value)
	 {
		this.classname = value;
	}
	
	/**
	 * LONG_VALUE_: 
	 */
	public Double getLongValue() {
		return this.longValue;
	}
	
	/**
	 * LONG_VALUE_: 
	 */
	public void setLongValue(Double value)
	 {
		this.longValue = value;
	}
	
	/**
	 * STRING_VALUE_: 
	 */
	public String getStringValue() {
		return this.stringValue;
	}
	
	/**
	 * STRING_VALUE_: 
	 */
	public void setStringValue(String value)
	 {
		this.stringValue = value;
	}
	
	/**
	 * TEXT_VALUE_: 
	 */
	public String getTextValue() {
		return this.textValue;
	}
	
	/**
	 * TEXT_VALUE_: 
	 */
	public void setTextValue(String value)
	 {
		this.textValue = value;
	}
	
	/**
	 * EXESYS_: 
	 */
	public Double getExesys() {
		return this.exesys;
	}
	
	/**
	 * EXESYS_: 
	 */
	public void setExesys(Double value)
	 {
		this.exesys = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_VARIABLE].[DBID_], [JBPM4_VARIABLE].[CLASS_], [JBPM4_VARIABLE].[DBVERSION_], [JBPM4_VARIABLE].[KEY_], [JBPM4_VARIABLE].[CONVERTER_], [JBPM4_VARIABLE].[HIST_], [JBPM4_VARIABLE].[EXECUTION_], [JBPM4_VARIABLE].[TASK_], [JBPM4_VARIABLE].[LOB_], [JBPM4_VARIABLE].[DATE_VALUE_], [JBPM4_VARIABLE].[DOUBLE_VALUE_], [JBPM4_VARIABLE].[CLASSNAME_], [JBPM4_VARIABLE].[LONG_VALUE_], [JBPM4_VARIABLE].[STRING_VALUE_], [JBPM4_VARIABLE].[TEXT_VALUE_], [JBPM4_VARIABLE].[EXESYS_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_VARIABLE].[DBID_], [JBPM4_VARIABLE].[CLASS_], [JBPM4_VARIABLE].[DBVERSION_], [JBPM4_VARIABLE].[KEY_], [JBPM4_VARIABLE].[CONVERTER_], [JBPM4_VARIABLE].[HIST_], [JBPM4_VARIABLE].[EXECUTION_], [JBPM4_VARIABLE].[TASK_], [JBPM4_VARIABLE].[LOB_], [JBPM4_VARIABLE].[DATE_VALUE_], [JBPM4_VARIABLE].[DOUBLE_VALUE_], [JBPM4_VARIABLE].[CLASSNAME_], [JBPM4_VARIABLE].[LONG_VALUE_], [JBPM4_VARIABLE].[STRING_VALUE_], [JBPM4_VARIABLE].[TEXT_VALUE_], [JBPM4_VARIABLE].[EXESYS_]   from [JBPM4_VARIABLE] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_VARIABLE].[DBID_], [JBPM4_VARIABLE].[CLASS_], [JBPM4_VARIABLE].[DBVERSION_], [JBPM4_VARIABLE].[KEY_], [JBPM4_VARIABLE].[CONVERTER_], [JBPM4_VARIABLE].[HIST_], [JBPM4_VARIABLE].[EXECUTION_], [JBPM4_VARIABLE].[TASK_], [JBPM4_VARIABLE].[LOB_], [JBPM4_VARIABLE].[DATE_VALUE_], [JBPM4_VARIABLE].[DOUBLE_VALUE_], [JBPM4_VARIABLE].[CLASSNAME_], [JBPM4_VARIABLE].[LONG_VALUE_], [JBPM4_VARIABLE].[STRING_VALUE_], [JBPM4_VARIABLE].[TEXT_VALUE_], [JBPM4_VARIABLE].[EXESYS_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_VARIABLE";
	}
	
	
	public String getTableName() {
		return "JBPM4_VARIABLE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "DBID_";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.dbid);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (Jbpm4Variable.class.isInstance(obj)) {
			Jbpm4Variable o = ((Jbpm4Variable)(obj));
			this.dbid = o.dbid;
			this.class_ = o.class_;
			this.dbversion = o.dbversion;
			this.key = o.key;
			this.converter = o.converter;
			this.hist = o.hist;
			this.execution = o.execution;
			this.task = o.task;
			this.lob = o.lob;
			this.dateValue = o.dateValue;
			this.doubleValue = o.doubleValue;
			this.classname = o.classname;
			this.longValue = o.longValue;
			this.stringValue = o.stringValue;
			this.textValue = o.textValue;
			this.exesys = o.exesys;
		}
	}
	
	/**
	 * 插入Jbpm4Variable对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Variable">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Variable jbpm4Variable) throws SQLException, DbException {
		String sql = "insert into [JBPM4_VARIABLE](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [CLASS_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [KEY_]");
		sql = (sql + ", [CONVERTER_]");
		sql = (sql + ", [HIST_]");
		sql = (sql + ", [EXECUTION_]");
		sql = (sql + ", [TASK_]");
		sql = (sql + ", [LOB_]");
		sql = (sql + ", [DATE_VALUE_]");
		sql = (sql + ", [DOUBLE_VALUE_]");
		sql = (sql + ", [CLASSNAME_]");
		sql = (sql + ", [LONG_VALUE_]");
		sql = (sql + ", [STRING_VALUE_]");
		sql = (sql + ", [TEXT_VALUE_]");
		sql = (sql + ", [EXESYS_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Variable.getDbid());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getClass_().toString()));
		sql = (sql + ", ");
		sql = (sql + jbpm4Variable.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4Variable.key == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getKey().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.converter == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getConverter().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.hist == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Variable.getHist());
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.execution == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Variable.getExecution());
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.task == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Variable.getTask());
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.lob == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Variable.getLob());
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.dateValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Variable.getDateValue()));
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.doubleValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Variable.getDoubleValue());
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.classname == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getClassname().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.longValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Variable.getLongValue());
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.stringValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getStringValue().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.textValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getTextValue().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Variable.exesys == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Variable.getExesys());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Variable对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Variable.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Variable对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Variable">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Variable jbpm4Variable, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_VARIABLE] set ";
		sql = (sql + "[CLASS_] = ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getClass_().toString()));
		sql = (sql + ",");
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4Variable.getDbversion());
		sql = (sql + ",");
		if ((jbpm4Variable.key == null)) {
			sql = (sql + "[KEY_] = default ,");
		}
		else {
			sql = (sql + "[KEY_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getKey().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Variable.converter == null)) {
			sql = (sql + "[CONVERTER_] = default ,");
		}
		else {
			sql = (sql + "[CONVERTER_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getConverter().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Variable.hist == null)) {
			sql = (sql + "[HIST_] = default ,");
		}
		else {
			sql = (sql + "[HIST_] = ");
			sql = (sql + jbpm4Variable.getHist());
			sql = (sql + ",");
		}
		if ((jbpm4Variable.execution == null)) {
			sql = (sql + "[EXECUTION_] = default ,");
		}
		else {
			sql = (sql + "[EXECUTION_] = ");
			sql = (sql + jbpm4Variable.getExecution());
			sql = (sql + ",");
		}
		if ((jbpm4Variable.task == null)) {
			sql = (sql + "[TASK_] = default ,");
		}
		else {
			sql = (sql + "[TASK_] = ");
			sql = (sql + jbpm4Variable.getTask());
			sql = (sql + ",");
		}
		if ((jbpm4Variable.lob == null)) {
			sql = (sql + "[LOB_] = default ,");
		}
		else {
			sql = (sql + "[LOB_] = ");
			sql = (sql + jbpm4Variable.getLob());
			sql = (sql + ",");
		}
		if ((jbpm4Variable.dateValue == null)) {
			sql = (sql + "[DATE_VALUE_] = default ,");
		}
		else {
			sql = (sql + "[DATE_VALUE_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Variable.getDateValue()));
			sql = (sql + ",");
		}
		if ((jbpm4Variable.doubleValue == null)) {
			sql = (sql + "[DOUBLE_VALUE_] = default ,");
		}
		else {
			sql = (sql + "[DOUBLE_VALUE_] = ");
			sql = (sql + jbpm4Variable.getDoubleValue());
			sql = (sql + ",");
		}
		if ((jbpm4Variable.classname == null)) {
			sql = (sql + "[CLASSNAME_] = default ,");
		}
		else {
			sql = (sql + "[CLASSNAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getClassname().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Variable.longValue == null)) {
			sql = (sql + "[LONG_VALUE_] = default ,");
		}
		else {
			sql = (sql + "[LONG_VALUE_] = ");
			sql = (sql + jbpm4Variable.getLongValue());
			sql = (sql + ",");
		}
		if ((jbpm4Variable.stringValue == null)) {
			sql = (sql + "[STRING_VALUE_] = default ,");
		}
		else {
			sql = (sql + "[STRING_VALUE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getStringValue().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Variable.textValue == null)) {
			sql = (sql + "[TEXT_VALUE_] = default ,");
		}
		else {
			sql = (sql + "[TEXT_VALUE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Variable.getTextValue().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Variable.exesys == null)) {
			sql = (sql + "[EXESYS_] = default ,");
		}
		else {
			sql = (sql + "[EXESYS_] = ");
			sql = (sql + jbpm4Variable.getExesys());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Variable.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Variable对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Variable">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Variable jbpm4Variable) throws SQLException, DbException {
		return Jbpm4Variable.update(dataVisit, jbpm4Variable, "");
	}
	
	/**
	 * 更新Jbpm4Variable对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Variable.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Variable对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Variable.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Variable> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Variable> list = new ArrayList<Jbpm4Variable>();
		try {
			for (; reader.next(); ) {
				Jbpm4Variable obj = new Jbpm4Variable();
				Jbpm4Variable.readValue(reader, obj);
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
	public static List<Jbpm4Variable> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Variable> list = new ArrayList<Jbpm4Variable>();
		try {
			for (; reader.next(); ) {
				Jbpm4Variable obj = new Jbpm4Variable();
				Jbpm4Variable.readValue(reader, obj);
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
	public static List<Jbpm4Variable> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Variable.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Variable> list = new ArrayList<Jbpm4Variable>();
		try {
			for (; reader.next(); ) {
				Jbpm4Variable obj = new Jbpm4Variable();
				Jbpm4Variable.readValue(reader, obj);
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
	public static List<Jbpm4Variable> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Variable.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Variable> list = new ArrayList<Jbpm4Variable>();
		try {
			for (; reader.next(); ) {
				Jbpm4Variable obj = new Jbpm4Variable();
				Jbpm4Variable.readValue(reader, obj);
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
	public static <T extends Jbpm4Variable> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Variable.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Variable.readValue(reader, obj);
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
public static <T extends Jbpm4Variable> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Variable.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Variable.readValue(reader, obj);
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
	String sql = "select * from JBPM4_VARIABLE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Variable
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Variable selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Variable> list = Jbpm4Variable.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Variable对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_VARIABLE] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Variable对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Variable.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4Variable对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Exesys"></param>
 */
public static void deleteListByExesys(IDataVisit2 dataVisit, Double AExesys) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_VARIABLE] where ");
	sql = (sql + "EXESYS_ = ");
	sql = (sql + AExesys);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4Variable对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Execution"></param>
 */
public static void deleteListByExecution(IDataVisit2 dataVisit, Double AExecution) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_VARIABLE] where ");
	sql = (sql + "EXECUTION_ = ");
	sql = (sql + AExecution);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4Variable对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Lob"></param>
 */
public static void deleteListByLob(IDataVisit2 dataVisit, Double ALob) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_VARIABLE] where ");
	sql = (sql + "LOB_ = ");
	sql = (sql + ALob);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4Variable对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Task"></param>
 */
public static void deleteListByTask(IDataVisit2 dataVisit, Double ATask) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_VARIABLE] where ");
	sql = (sql + "TASK_ = ");
	sql = (sql + ATask);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Exesys"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Variable> selectObjectsByExesys(IDataVisit2 dataVisit, Double AExesys, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where EXESYS_ = ";
	sql = (sql + AExesys);
	sql = (sql + appendConditionSql);
	return Jbpm4Variable.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Exesys"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Variable> selectObjectsByExesys(IDataVisit2 dataVisit, Double AExesys, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where EXESYS_ = ";
	sql = (sql + AExesys);
	return Jbpm4Variable.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Exesys"></param>
 */
public static List<Jbpm4Variable> selectObjectsByExesys(IDataVisit2 dataVisit, Double AExesys) throws SQLException, DbException {
	String sql = " where EXESYS_ = ";
	sql = (sql + AExesys);
	return Jbpm4Variable.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Execution"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Variable> selectObjectsByExecution(IDataVisit2 dataVisit, Double AExecution, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where EXECUTION_ = ";
	sql = (sql + AExecution);
	sql = (sql + appendConditionSql);
	return Jbpm4Variable.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Execution"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Variable> selectObjectsByExecution(IDataVisit2 dataVisit, Double AExecution, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where EXECUTION_ = ";
	sql = (sql + AExecution);
	return Jbpm4Variable.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Execution"></param>
 */
public static List<Jbpm4Variable> selectObjectsByExecution(IDataVisit2 dataVisit, Double AExecution) throws SQLException, DbException {
	String sql = " where EXECUTION_ = ";
	sql = (sql + AExecution);
	return Jbpm4Variable.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Lob"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Variable> selectObjectsByLob(IDataVisit2 dataVisit, Double ALob, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where LOB_ = ";
	sql = (sql + ALob);
	sql = (sql + appendConditionSql);
	return Jbpm4Variable.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Lob"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Variable> selectObjectsByLob(IDataVisit2 dataVisit, Double ALob, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where LOB_ = ";
	sql = (sql + ALob);
	return Jbpm4Variable.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Lob"></param>
 */
public static List<Jbpm4Variable> selectObjectsByLob(IDataVisit2 dataVisit, Double ALob) throws SQLException, DbException {
	String sql = " where LOB_ = ";
	sql = (sql + ALob);
	return Jbpm4Variable.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Task"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Variable> selectObjectsByTask(IDataVisit2 dataVisit, Double ATask, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ = ";
	sql = (sql + ATask);
	sql = (sql + appendConditionSql);
	return Jbpm4Variable.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Task"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Variable> selectObjectsByTask(IDataVisit2 dataVisit, Double ATask, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_ = ";
	sql = (sql + ATask);
	return Jbpm4Variable.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Task"></param>
 */
public static List<Jbpm4Variable> selectObjectsByTask(IDataVisit2 dataVisit, Double ATask) throws SQLException, DbException {
	String sql = " where TASK_ = ";
	sql = (sql + ATask);
	return Jbpm4Variable.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4Variable中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Variable">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Variable jbpm4Variable) throws SQLException, DbException {
	jbpm4Variable.dbid = reader.getDouble(1);
	jbpm4Variable.class_ = reader.getString(2);
	jbpm4Variable.dbversion = reader.getInt(3);
	jbpm4Variable.key = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4Variable.key = null;
	}
	jbpm4Variable.converter = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4Variable.converter = null;
	}
	jbpm4Variable.hist = reader.getByte(6);
	if (reader.wasNull()) {
		jbpm4Variable.hist = null;
	}
	jbpm4Variable.execution = reader.getDouble(7);
	if (reader.wasNull()) {
		jbpm4Variable.execution = null;
	}
	jbpm4Variable.task = reader.getDouble(8);
	if (reader.wasNull()) {
		jbpm4Variable.task = null;
	}
	jbpm4Variable.lob = reader.getDouble(9);
	if (reader.wasNull()) {
		jbpm4Variable.lob = null;
	}
	jbpm4Variable.dateValue = SqlUtils.getDate(reader, 10);
	if (reader.wasNull()) {
		jbpm4Variable.dateValue = null;
	}
	jbpm4Variable.doubleValue = reader.getDouble(11);
	if (reader.wasNull()) {
		jbpm4Variable.doubleValue = null;
	}
	jbpm4Variable.classname = reader.getString(12);
	if (reader.wasNull()) {
		jbpm4Variable.classname = null;
	}
	jbpm4Variable.longValue = reader.getDouble(13);
	if (reader.wasNull()) {
		jbpm4Variable.longValue = null;
	}
	jbpm4Variable.stringValue = reader.getString(14);
	if (reader.wasNull()) {
		jbpm4Variable.stringValue = null;
	}
	jbpm4Variable.textValue = reader.getString(15);
	if (reader.wasNull()) {
		jbpm4Variable.textValue = null;
	}
	jbpm4Variable.exesys = reader.getDouble(16);
	if (reader.wasNull()) {
		jbpm4Variable.exesys = null;
	}
}
}
