package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_EXECUTION: 
 */
public class Jbpm4Execution extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
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
	 * ACTIVITYNAME_: 
	 */
	String activityname;
	
	/**
	 * PROCDEFID_: 
	 */
	String procdefid;
	
	/**
	 * HASVARS_: 
	 */
	Byte hasvars;
	
	/**
	 * NAME_: 
	 */
	String name;
	
	/**
	 * KEY_: 
	 */
	String key;
	
	/**
	 * ID_: 
	 */
	String id;
	
	/**
	 * STATE_: 
	 */
	String state;
	
	/**
	 * SUSPHISTSTATE_: 
	 */
	String susphiststate;
	
	/**
	 * PRIORITY_: 
	 */
	Integer priority;
	
	/**
	 * HISACTINST_: 
	 */
	Double hisactinst;
	
	/**
	 * PARENT_: 
	 */
	Double parent;
	
	/**
	 * INSTANCE_: 
	 */
	Double instance;
	
	/**
	 * SUPEREXEC_: 
	 */
	Double superexec;
	
	/**
	 * SUBPROCINST_: 
	 */
	Double subprocinst;
	
	/**
	 * PARENT_IDX_: 
	 */
	Integer parentIdx;
	
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
	 * ACTIVITYNAME_: 
	 */
	public String getActivityname() {
		return this.activityname;
	}
	
	/**
	 * ACTIVITYNAME_: 
	 */
	public void setActivityname(String value)
	 {
		this.activityname = value;
	}
	
	/**
	 * PROCDEFID_: 
	 */
	public String getProcdefid() {
		return this.procdefid;
	}
	
	/**
	 * PROCDEFID_: 
	 */
	public void setProcdefid(String value)
	 {
		this.procdefid = value;
	}
	
	/**
	 * HASVARS_: 
	 */
	public Byte getHasvars() {
		return this.hasvars;
	}
	
	/**
	 * HASVARS_: 
	 */
	public void setHasvars(Byte value)
	 {
		this.hasvars = value;
	}
	
	/**
	 * NAME_: 
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * NAME_: 
	 */
	public void setName(String value)
	 {
		this.name = value;
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
	 * ID_: 
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * ID_: 
	 */
	public void setId(String value)
	 {
		this.id = value;
	}
	
	/**
	 * STATE_: 
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * STATE_: 
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * SUSPHISTSTATE_: 
	 */
	public String getSusphiststate() {
		return this.susphiststate;
	}
	
	/**
	 * SUSPHISTSTATE_: 
	 */
	public void setSusphiststate(String value)
	 {
		this.susphiststate = value;
	}
	
	/**
	 * PRIORITY_: 
	 */
	public Integer getPriority() {
		return this.priority;
	}
	
	/**
	 * PRIORITY_: 
	 */
	public void setPriority(Integer value)
	 {
		this.priority = value;
	}
	
	/**
	 * HISACTINST_: 
	 */
	public Double getHisactinst() {
		return this.hisactinst;
	}
	
	/**
	 * HISACTINST_: 
	 */
	public void setHisactinst(Double value)
	 {
		this.hisactinst = value;
	}
	
	/**
	 * PARENT_: 
	 */
	public Double getParent() {
		return this.parent;
	}
	
	/**
	 * PARENT_: 
	 */
	public void setParent(Double value)
	 {
		this.parent = value;
	}
	
	/**
	 * INSTANCE_: 
	 */
	public Double getInstance() {
		return this.instance;
	}
	
	/**
	 * INSTANCE_: 
	 */
	public void setInstance(Double value)
	 {
		this.instance = value;
	}
	
	/**
	 * SUPEREXEC_: 
	 */
	public Double getSuperexec() {
		return this.superexec;
	}
	
	/**
	 * SUPEREXEC_: 
	 */
	public void setSuperexec(Double value)
	 {
		this.superexec = value;
	}
	
	/**
	 * SUBPROCINST_: 
	 */
	public Double getSubprocinst() {
		return this.subprocinst;
	}
	
	/**
	 * SUBPROCINST_: 
	 */
	public void setSubprocinst(Double value)
	 {
		this.subprocinst = value;
	}
	
	/**
	 * PARENT_IDX_: 
	 */
	public Integer getParentIdx() {
		return this.parentIdx;
	}
	
	/**
	 * PARENT_IDX_: 
	 */
	public void setParentIdx(Integer value)
	 {
		this.parentIdx = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_EXECUTION].[DBID_], [JBPM4_EXECUTION].[CLASS_], [JBPM4_EXECUTION].[DBVERSION_], [JBPM4_EXECUTION].[ACTIVITYNAME_], [JBPM4_EXECUTION].[PROCDEFID_], [JBPM4_EXECUTION].[HASVARS_], [JBPM4_EXECUTION].[NAME_], [JBPM4_EXECUTION].[KEY_], [JBPM4_EXECUTION].[ID_], [JBPM4_EXECUTION].[STATE_], [JBPM4_EXECUTION].[SUSPHISTSTATE_], [JBPM4_EXECUTION].[PRIORITY_], [JBPM4_EXECUTION].[HISACTINST_], [JBPM4_EXECUTION].[PARENT_], [JBPM4_EXECUTION].[INSTANCE_], [JBPM4_EXECUTION].[SUPEREXEC_], [JBPM4_EXECUTION].[SUBPROCINST_], [JBPM4_EXECUTION].[PARENT_IDX_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_EXECUTION].[DBID_], [JBPM4_EXECUTION].[CLASS_], [JBPM4_EXECUTION].[DBVERSION_], [JBPM4_EXECUTION].[ACTIVITYNAME_], [JBPM4_EXECUTION].[PROCDEFID_], [JBPM4_EXECUTION].[HASVARS_], [JBPM4_EXECUTION].[NAME_], [JBPM4_EXECUTION].[KEY_], [JBPM4_EXECUTION].[ID_], [JBPM4_EXECUTION].[STATE_], [JBPM4_EXECUTION].[SUSPHISTSTATE_], [JBPM4_EXECUTION].[PRIORITY_], [JBPM4_EXECUTION].[HISACTINST_], [JBPM4_EXECUTION].[PARENT_], [JBPM4_EXECUTION].[INSTANCE_], [JBPM4_EXECUTION].[SUPEREXEC_], [JBPM4_EXECUTION].[SUBPROCINST_], [JBPM4_EXECUTION].[PARENT_IDX_]   from [JBPM4_EXECUTION] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_EXECUTION].[DBID_], [JBPM4_EXECUTION].[CLASS_], [JBPM4_EXECUTION].[DBVERSION_], [JBPM4_EXECUTION].[ACTIVITYNAME_], [JBPM4_EXECUTION].[PROCDEFID_], [JBPM4_EXECUTION].[HASVARS_], [JBPM4_EXECUTION].[NAME_], [JBPM4_EXECUTION].[KEY_], [JBPM4_EXECUTION].[ID_], [JBPM4_EXECUTION].[STATE_], [JBPM4_EXECUTION].[SUSPHISTSTATE_], [JBPM4_EXECUTION].[PRIORITY_], [JBPM4_EXECUTION].[HISACTINST_], [JBPM4_EXECUTION].[PARENT_], [JBPM4_EXECUTION].[INSTANCE_], [JBPM4_EXECUTION].[SUPEREXEC_], [JBPM4_EXECUTION].[SUBPROCINST_], [JBPM4_EXECUTION].[PARENT_IDX_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_EXECUTION";
	}
	
	
	public String getTableName() {
		return "JBPM4_EXECUTION";
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
		if (Jbpm4Execution.class.isInstance(obj)) {
			Jbpm4Execution o = ((Jbpm4Execution)(obj));
			this.dbid = o.dbid;
			this.class_ = o.class_;
			this.dbversion = o.dbversion;
			this.activityname = o.activityname;
			this.procdefid = o.procdefid;
			this.hasvars = o.hasvars;
			this.name = o.name;
			this.key = o.key;
			this.id = o.id;
			this.state = o.state;
			this.susphiststate = o.susphiststate;
			this.priority = o.priority;
			this.hisactinst = o.hisactinst;
			this.parent = o.parent;
			this.instance = o.instance;
			this.superexec = o.superexec;
			this.subprocinst = o.subprocinst;
			this.parentIdx = o.parentIdx;
		}
	}
	
	/**
	 * 插入Jbpm4Execution对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Execution">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Execution jbpm4Execution) throws SQLException, DbException {
		String sql = "insert into [JBPM4_EXECUTION](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [CLASS_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [ACTIVITYNAME_]");
		sql = (sql + ", [PROCDEFID_]");
		sql = (sql + ", [HASVARS_]");
		sql = (sql + ", [NAME_]");
		sql = (sql + ", [KEY_]");
		sql = (sql + ", [ID_]");
		sql = (sql + ", [STATE_]");
		sql = (sql + ", [SUSPHISTSTATE_]");
		sql = (sql + ", [PRIORITY_]");
		sql = (sql + ", [HISACTINST_]");
		sql = (sql + ", [PARENT_]");
		sql = (sql + ", [INSTANCE_]");
		sql = (sql + ", [SUPEREXEC_]");
		sql = (sql + ", [SUBPROCINST_]");
		sql = (sql + ", [PARENT_IDX_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Execution.getDbid());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getClass_().toString()));
		sql = (sql + ", ");
		sql = (sql + jbpm4Execution.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4Execution.activityname == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getActivityname().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.procdefid == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getProcdefid().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.hasvars == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Execution.getHasvars());
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.name == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getName().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.key == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getKey().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.id == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getId().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.state == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getState().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.susphiststate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getSusphiststate().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.priority == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Execution.getPriority());
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.hisactinst == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Execution.getHisactinst());
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.parent == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Execution.getParent());
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.instance == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Execution.getInstance());
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.superexec == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Execution.getSuperexec());
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.subprocinst == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Execution.getSubprocinst());
		}
		sql = (sql + ", ");
		if ((jbpm4Execution.parentIdx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Execution.getParentIdx());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Execution对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Execution.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Execution对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Execution">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Execution jbpm4Execution, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_EXECUTION] set ";
		sql = (sql + "[CLASS_] = ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getClass_().toString()));
		sql = (sql + ",");
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4Execution.getDbversion());
		sql = (sql + ",");
		if ((jbpm4Execution.activityname == null)) {
			sql = (sql + "[ACTIVITYNAME_] = default ,");
		}
		else {
			sql = (sql + "[ACTIVITYNAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getActivityname().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Execution.procdefid == null)) {
			sql = (sql + "[PROCDEFID_] = default ,");
		}
		else {
			sql = (sql + "[PROCDEFID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getProcdefid().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Execution.hasvars == null)) {
			sql = (sql + "[HASVARS_] = default ,");
		}
		else {
			sql = (sql + "[HASVARS_] = ");
			sql = (sql + jbpm4Execution.getHasvars());
			sql = (sql + ",");
		}
		if ((jbpm4Execution.name == null)) {
			sql = (sql + "[NAME_] = default ,");
		}
		else {
			sql = (sql + "[NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getName().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Execution.key == null)) {
			sql = (sql + "[KEY_] = default ,");
		}
		else {
			sql = (sql + "[KEY_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getKey().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Execution.id == null)) {
			sql = (sql + "[ID_] = default ,");
		}
		else {
			sql = (sql + "[ID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getId().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Execution.state == null)) {
			sql = (sql + "[STATE_] = default ,");
		}
		else {
			sql = (sql + "[STATE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getState().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Execution.susphiststate == null)) {
			sql = (sql + "[SUSPHISTSTATE_] = default ,");
		}
		else {
			sql = (sql + "[SUSPHISTSTATE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Execution.getSusphiststate().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Execution.priority == null)) {
			sql = (sql + "[PRIORITY_] = default ,");
		}
		else {
			sql = (sql + "[PRIORITY_] = ");
			sql = (sql + jbpm4Execution.getPriority());
			sql = (sql + ",");
		}
		if ((jbpm4Execution.hisactinst == null)) {
			sql = (sql + "[HISACTINST_] = default ,");
		}
		else {
			sql = (sql + "[HISACTINST_] = ");
			sql = (sql + jbpm4Execution.getHisactinst());
			sql = (sql + ",");
		}
		if ((jbpm4Execution.parent == null)) {
			sql = (sql + "[PARENT_] = default ,");
		}
		else {
			sql = (sql + "[PARENT_] = ");
			sql = (sql + jbpm4Execution.getParent());
			sql = (sql + ",");
		}
		if ((jbpm4Execution.instance == null)) {
			sql = (sql + "[INSTANCE_] = default ,");
		}
		else {
			sql = (sql + "[INSTANCE_] = ");
			sql = (sql + jbpm4Execution.getInstance());
			sql = (sql + ",");
		}
		if ((jbpm4Execution.superexec == null)) {
			sql = (sql + "[SUPEREXEC_] = default ,");
		}
		else {
			sql = (sql + "[SUPEREXEC_] = ");
			sql = (sql + jbpm4Execution.getSuperexec());
			sql = (sql + ",");
		}
		if ((jbpm4Execution.subprocinst == null)) {
			sql = (sql + "[SUBPROCINST_] = default ,");
		}
		else {
			sql = (sql + "[SUBPROCINST_] = ");
			sql = (sql + jbpm4Execution.getSubprocinst());
			sql = (sql + ",");
		}
		if ((jbpm4Execution.parentIdx == null)) {
			sql = (sql + "[PARENT_IDX_] = default ,");
		}
		else {
			sql = (sql + "[PARENT_IDX_] = ");
			sql = (sql + jbpm4Execution.getParentIdx());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Execution.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Execution对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Execution">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Execution jbpm4Execution) throws SQLException, DbException {
		return Jbpm4Execution.update(dataVisit, jbpm4Execution, "");
	}
	
	/**
	 * 更新Jbpm4Execution对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Execution.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Execution对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Execution.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Execution> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Execution> list = new ArrayList<Jbpm4Execution>();
		try {
			for (; reader.next(); ) {
				Jbpm4Execution obj = new Jbpm4Execution();
				Jbpm4Execution.readValue(reader, obj);
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
	public static List<Jbpm4Execution> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Execution> list = new ArrayList<Jbpm4Execution>();
		try {
			for (; reader.next(); ) {
				Jbpm4Execution obj = new Jbpm4Execution();
				Jbpm4Execution.readValue(reader, obj);
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
	public static List<Jbpm4Execution> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Execution.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Execution> list = new ArrayList<Jbpm4Execution>();
		try {
			for (; reader.next(); ) {
				Jbpm4Execution obj = new Jbpm4Execution();
				Jbpm4Execution.readValue(reader, obj);
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
	public static List<Jbpm4Execution> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Execution.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Execution> list = new ArrayList<Jbpm4Execution>();
		try {
			for (; reader.next(); ) {
				Jbpm4Execution obj = new Jbpm4Execution();
				Jbpm4Execution.readValue(reader, obj);
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
	public static <T extends Jbpm4Execution> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Execution.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Execution.readValue(reader, obj);
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
public static <T extends Jbpm4Execution> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Execution.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Execution.readValue(reader, obj);
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
	String sql = "select * from JBPM4_EXECUTION ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Execution
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Execution selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Execution> list = Jbpm4Execution.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 根据查询Jbpm4Execution
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AId"></param>
 */
public static Jbpm4Execution selectById(IDataVisit2 dataVisit, String AId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "ID_ = ");
	sql = (sql + SqlServerUtils.safeSql(AId.toString()));
	List<Jbpm4Execution> list = Jbpm4Execution.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Execution对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_EXECUTION] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Execution对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Execution.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 从数据库中删除一个Jbpm4Execution对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AId"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteById(IDataVisit2 dataVisit, String AId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_EXECUTION] where ");
	sql = (sql + "ID_ = ");
	sql = (sql + SqlServerUtils.safeSql(AId.toString()));
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Execution对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AId"></param>
 */
public static void deleteById(IDataVisit2 dataVisit, String AId) throws SQLException, DbException {
	Jbpm4Execution.deleteById(dataVisit, AId, "");
}

/**
 * 根据外键删除一批Jbpm4Execution对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Subprocinst"></param>
 */
public static void deleteListBySubprocinst(IDataVisit2 dataVisit, Double ASubprocinst) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_EXECUTION] where ");
	sql = (sql + "SUBPROCINST_ = ");
	sql = (sql + ASubprocinst);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4Execution对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Instance"></param>
 */
public static void deleteListByInstance(IDataVisit2 dataVisit, Double AInstance) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_EXECUTION] where ");
	sql = (sql + "INSTANCE_ = ");
	sql = (sql + AInstance);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4Execution对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Superexec"></param>
 */
public static void deleteListBySuperexec(IDataVisit2 dataVisit, Double ASuperexec) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_EXECUTION] where ");
	sql = (sql + "SUPEREXEC_ = ");
	sql = (sql + ASuperexec);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4Execution对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Parent"></param>
 */
public static void deleteListByParent(IDataVisit2 dataVisit, Double AParent) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_EXECUTION] where ");
	sql = (sql + "PARENT_ = ");
	sql = (sql + AParent);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Subprocinst"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Execution> selectObjectsBySubprocinst(IDataVisit2 dataVisit, Double ASubprocinst, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SUBPROCINST_ = ";
	sql = (sql + ASubprocinst);
	sql = (sql + appendConditionSql);
	return Jbpm4Execution.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Subprocinst"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Execution> selectObjectsBySubprocinst(IDataVisit2 dataVisit, Double ASubprocinst, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SUBPROCINST_ = ";
	sql = (sql + ASubprocinst);
	return Jbpm4Execution.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Subprocinst"></param>
 */
public static List<Jbpm4Execution> selectObjectsBySubprocinst(IDataVisit2 dataVisit, Double ASubprocinst) throws SQLException, DbException {
	String sql = " where SUBPROCINST_ = ";
	sql = (sql + ASubprocinst);
	return Jbpm4Execution.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Instance"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Execution> selectObjectsByInstance(IDataVisit2 dataVisit, Double AInstance, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where INSTANCE_ = ";
	sql = (sql + AInstance);
	sql = (sql + appendConditionSql);
	return Jbpm4Execution.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Instance"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Execution> selectObjectsByInstance(IDataVisit2 dataVisit, Double AInstance, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where INSTANCE_ = ";
	sql = (sql + AInstance);
	return Jbpm4Execution.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Instance"></param>
 */
public static List<Jbpm4Execution> selectObjectsByInstance(IDataVisit2 dataVisit, Double AInstance) throws SQLException, DbException {
	String sql = " where INSTANCE_ = ";
	sql = (sql + AInstance);
	return Jbpm4Execution.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Superexec"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Execution> selectObjectsBySuperexec(IDataVisit2 dataVisit, Double ASuperexec, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SUPEREXEC_ = ";
	sql = (sql + ASuperexec);
	sql = (sql + appendConditionSql);
	return Jbpm4Execution.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Superexec"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Execution> selectObjectsBySuperexec(IDataVisit2 dataVisit, Double ASuperexec, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SUPEREXEC_ = ";
	sql = (sql + ASuperexec);
	return Jbpm4Execution.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Superexec"></param>
 */
public static List<Jbpm4Execution> selectObjectsBySuperexec(IDataVisit2 dataVisit, Double ASuperexec) throws SQLException, DbException {
	String sql = " where SUPEREXEC_ = ";
	sql = (sql + ASuperexec);
	return Jbpm4Execution.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Parent"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Execution> selectObjectsByParent(IDataVisit2 dataVisit, Double AParent, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PARENT_ = ";
	sql = (sql + AParent);
	sql = (sql + appendConditionSql);
	return Jbpm4Execution.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Parent"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Execution> selectObjectsByParent(IDataVisit2 dataVisit, Double AParent, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where PARENT_ = ";
	sql = (sql + AParent);
	return Jbpm4Execution.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Parent"></param>
 */
public static List<Jbpm4Execution> selectObjectsByParent(IDataVisit2 dataVisit, Double AParent) throws SQLException, DbException {
	String sql = " where PARENT_ = ";
	sql = (sql + AParent);
	return Jbpm4Execution.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4Execution中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Execution">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Execution jbpm4Execution) throws SQLException, DbException {
	jbpm4Execution.dbid = reader.getDouble(1);
	jbpm4Execution.class_ = reader.getString(2);
	jbpm4Execution.dbversion = reader.getInt(3);
	jbpm4Execution.activityname = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4Execution.activityname = null;
	}
	jbpm4Execution.procdefid = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4Execution.procdefid = null;
	}
	jbpm4Execution.hasvars = reader.getByte(6);
	if (reader.wasNull()) {
		jbpm4Execution.hasvars = null;
	}
	jbpm4Execution.name = reader.getString(7);
	if (reader.wasNull()) {
		jbpm4Execution.name = null;
	}
	jbpm4Execution.key = reader.getString(8);
	if (reader.wasNull()) {
		jbpm4Execution.key = null;
	}
	jbpm4Execution.id = reader.getString(9);
	if (reader.wasNull()) {
		jbpm4Execution.id = null;
	}
	jbpm4Execution.state = reader.getString(10);
	if (reader.wasNull()) {
		jbpm4Execution.state = null;
	}
	jbpm4Execution.susphiststate = reader.getString(11);
	if (reader.wasNull()) {
		jbpm4Execution.susphiststate = null;
	}
	jbpm4Execution.priority = reader.getInt(12);
	if (reader.wasNull()) {
		jbpm4Execution.priority = null;
	}
	jbpm4Execution.hisactinst = reader.getDouble(13);
	if (reader.wasNull()) {
		jbpm4Execution.hisactinst = null;
	}
	jbpm4Execution.parent = reader.getDouble(14);
	if (reader.wasNull()) {
		jbpm4Execution.parent = null;
	}
	jbpm4Execution.instance = reader.getDouble(15);
	if (reader.wasNull()) {
		jbpm4Execution.instance = null;
	}
	jbpm4Execution.superexec = reader.getDouble(16);
	if (reader.wasNull()) {
		jbpm4Execution.superexec = null;
	}
	jbpm4Execution.subprocinst = reader.getDouble(17);
	if (reader.wasNull()) {
		jbpm4Execution.subprocinst = null;
	}
	jbpm4Execution.parentIdx = reader.getInt(18);
	if (reader.wasNull()) {
		jbpm4Execution.parentIdx = null;
	}
}
}
