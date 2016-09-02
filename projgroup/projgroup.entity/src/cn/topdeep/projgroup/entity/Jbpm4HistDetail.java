package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_HIST_DETAIL: 
 */
public class Jbpm4HistDetail extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
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
	 * USERID_: 
	 */
	String userid;
	
	/**
	 * TIME_: 
	 */
	java.util.Date time;
	
	/**
	 * HPROCI_: 
	 */
	Double hproci;
	
	/**
	 * HPROCIIDX_: 
	 */
	Integer hprociidx;
	
	/**
	 * HACTI_: 
	 */
	Double hacti;
	
	/**
	 * HACTIIDX_: 
	 */
	Integer hactiidx;
	
	/**
	 * HTASK_: 
	 */
	Double htask;
	
	/**
	 * HTASKIDX_: 
	 */
	Integer htaskidx;
	
	/**
	 * HVAR_: 
	 */
	Double hvar;
	
	/**
	 * HVARIDX_: 
	 */
	Integer hvaridx;
	
	/**
	 * MESSAGE_: 
	 */
	String message;
	
	/**
	 * OLD_STR_: 
	 */
	String oldStr;
	
	/**
	 * NEW_STR_: 
	 */
	String newStr;
	
	/**
	 * OLD_INT_: 
	 */
	Integer oldInt;
	
	/**
	 * NEW_INT_: 
	 */
	Integer newInt;
	
	/**
	 * OLD_TIME_: 
	 */
	java.util.Date oldTime;
	
	/**
	 * NEW_TIME_: 
	 */
	java.util.Date newTime;
	
	/**
	 * PARENT_: 
	 */
	Double parent;
	
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
	 * USERID_: 
	 */
	public String getUserid() {
		return this.userid;
	}
	
	/**
	 * USERID_: 
	 */
	public void setUserid(String value)
	 {
		this.userid = value;
	}
	
	/**
	 * TIME_: 
	 */
	public java.util.Date getTime() {
		return this.time;
	}
	
	/**
	 * TIME_: 
	 */
	public void setTime(java.util.Date value)
	 {
		this.time = value;
	}
	
	/**
	 * HPROCI_: 
	 */
	public Double getHproci() {
		return this.hproci;
	}
	
	/**
	 * HPROCI_: 
	 */
	public void setHproci(Double value)
	 {
		this.hproci = value;
	}
	
	/**
	 * HPROCIIDX_: 
	 */
	public Integer getHprociidx() {
		return this.hprociidx;
	}
	
	/**
	 * HPROCIIDX_: 
	 */
	public void setHprociidx(Integer value)
	 {
		this.hprociidx = value;
	}
	
	/**
	 * HACTI_: 
	 */
	public Double getHacti() {
		return this.hacti;
	}
	
	/**
	 * HACTI_: 
	 */
	public void setHacti(Double value)
	 {
		this.hacti = value;
	}
	
	/**
	 * HACTIIDX_: 
	 */
	public Integer getHactiidx() {
		return this.hactiidx;
	}
	
	/**
	 * HACTIIDX_: 
	 */
	public void setHactiidx(Integer value)
	 {
		this.hactiidx = value;
	}
	
	/**
	 * HTASK_: 
	 */
	public Double getHtask() {
		return this.htask;
	}
	
	/**
	 * HTASK_: 
	 */
	public void setHtask(Double value)
	 {
		this.htask = value;
	}
	
	/**
	 * HTASKIDX_: 
	 */
	public Integer getHtaskidx() {
		return this.htaskidx;
	}
	
	/**
	 * HTASKIDX_: 
	 */
	public void setHtaskidx(Integer value)
	 {
		this.htaskidx = value;
	}
	
	/**
	 * HVAR_: 
	 */
	public Double getHvar() {
		return this.hvar;
	}
	
	/**
	 * HVAR_: 
	 */
	public void setHvar(Double value)
	 {
		this.hvar = value;
	}
	
	/**
	 * HVARIDX_: 
	 */
	public Integer getHvaridx() {
		return this.hvaridx;
	}
	
	/**
	 * HVARIDX_: 
	 */
	public void setHvaridx(Integer value)
	 {
		this.hvaridx = value;
	}
	
	/**
	 * MESSAGE_: 
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * MESSAGE_: 
	 */
	public void setMessage(String value)
	 {
		this.message = value;
	}
	
	/**
	 * OLD_STR_: 
	 */
	public String getOldStr() {
		return this.oldStr;
	}
	
	/**
	 * OLD_STR_: 
	 */
	public void setOldStr(String value)
	 {
		this.oldStr = value;
	}
	
	/**
	 * NEW_STR_: 
	 */
	public String getNewStr() {
		return this.newStr;
	}
	
	/**
	 * NEW_STR_: 
	 */
	public void setNewStr(String value)
	 {
		this.newStr = value;
	}
	
	/**
	 * OLD_INT_: 
	 */
	public Integer getOldInt() {
		return this.oldInt;
	}
	
	/**
	 * OLD_INT_: 
	 */
	public void setOldInt(Integer value)
	 {
		this.oldInt = value;
	}
	
	/**
	 * NEW_INT_: 
	 */
	public Integer getNewInt() {
		return this.newInt;
	}
	
	/**
	 * NEW_INT_: 
	 */
	public void setNewInt(Integer value)
	 {
		this.newInt = value;
	}
	
	/**
	 * OLD_TIME_: 
	 */
	public java.util.Date getOldTime() {
		return this.oldTime;
	}
	
	/**
	 * OLD_TIME_: 
	 */
	public void setOldTime(java.util.Date value)
	 {
		this.oldTime = value;
	}
	
	/**
	 * NEW_TIME_: 
	 */
	public java.util.Date getNewTime() {
		return this.newTime;
	}
	
	/**
	 * NEW_TIME_: 
	 */
	public void setNewTime(java.util.Date value)
	 {
		this.newTime = value;
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
		return "select  [JBPM4_HIST_DETAIL].[DBID_], [JBPM4_HIST_DETAIL].[CLASS_], [JBPM4_HIST_DETAIL].[DBVERSION_], [JBPM4_HIST_DETAIL].[USERID_], [JBPM4_HIST_DETAIL].[TIME_], [JBPM4_HIST_DETAIL].[HPROCI_], [JBPM4_HIST_DETAIL].[HPROCIIDX_], [JBPM4_HIST_DETAIL].[HACTI_], [JBPM4_HIST_DETAIL].[HACTIIDX_], [JBPM4_HIST_DETAIL].[HTASK_], [JBPM4_HIST_DETAIL].[HTASKIDX_], [JBPM4_HIST_DETAIL].[HVAR_], [JBPM4_HIST_DETAIL].[HVARIDX_], [JBPM4_HIST_DETAIL].[MESSAGE_], [JBPM4_HIST_DETAIL].[OLD_STR_], [JBPM4_HIST_DETAIL].[NEW_STR_], [JBPM4_HIST_DETAIL].[OLD_INT_], [JBPM4_HIST_DETAIL].[NEW_INT_], [JBPM4_HIST_DETAIL].[OLD_TIME_], [JBPM4_HIST_DETAIL].[NEW_TIME_], [JBPM4_HIST_DETAIL].[PARENT_], [JBPM4_HIST_DETAIL].[PARENT_IDX_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_HIST_DETAIL].[DBID_], [JBPM4_HIST_DETAIL].[CLASS_], [JBPM4_HIST_DETAIL].[DBVERSION_], [JBPM4_HIST_DETAIL].[USERID_], [JBPM4_HIST_DETAIL].[TIME_], [JBPM4_HIST_DETAIL].[HPROCI_], [JBPM4_HIST_DETAIL].[HPROCIIDX_], [JBPM4_HIST_DETAIL].[HACTI_], [JBPM4_HIST_DETAIL].[HACTIIDX_], [JBPM4_HIST_DETAIL].[HTASK_], [JBPM4_HIST_DETAIL].[HTASKIDX_], [JBPM4_HIST_DETAIL].[HVAR_], [JBPM4_HIST_DETAIL].[HVARIDX_], [JBPM4_HIST_DETAIL].[MESSAGE_], [JBPM4_HIST_DETAIL].[OLD_STR_], [JBPM4_HIST_DETAIL].[NEW_STR_], [JBPM4_HIST_DETAIL].[OLD_INT_], [JBPM4_HIST_DETAIL].[NEW_INT_], [JBPM4_HIST_DETAIL].[OLD_TIME_], [JBPM4_HIST_DETAIL].[NEW_TIME_], [JBPM4_HIST_DETAIL].[PARENT_], [JBPM4_HIST_DETAIL].[PARENT_IDX_]   from [JBPM4_HIST_DETAIL] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_HIST_DETAIL].[DBID_], [JBPM4_HIST_DETAIL].[CLASS_], [JBPM4_HIST_DETAIL].[DBVERSION_], [JBPM4_HIST_DETAIL].[USERID_], [JBPM4_HIST_DETAIL].[TIME_], [JBPM4_HIST_DETAIL].[HPROCI_], [JBPM4_HIST_DETAIL].[HPROCIIDX_], [JBPM4_HIST_DETAIL].[HACTI_], [JBPM4_HIST_DETAIL].[HACTIIDX_], [JBPM4_HIST_DETAIL].[HTASK_], [JBPM4_HIST_DETAIL].[HTASKIDX_], [JBPM4_HIST_DETAIL].[HVAR_], [JBPM4_HIST_DETAIL].[HVARIDX_], [JBPM4_HIST_DETAIL].[MESSAGE_], [JBPM4_HIST_DETAIL].[OLD_STR_], [JBPM4_HIST_DETAIL].[NEW_STR_], [JBPM4_HIST_DETAIL].[OLD_INT_], [JBPM4_HIST_DETAIL].[NEW_INT_], [JBPM4_HIST_DETAIL].[OLD_TIME_], [JBPM4_HIST_DETAIL].[NEW_TIME_], [JBPM4_HIST_DETAIL].[PARENT_], [JBPM4_HIST_DETAIL].[PARENT_IDX_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_HIST_DETAIL";
	}
	
	
	public String getTableName() {
		return "JBPM4_HIST_DETAIL";
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
		if (Jbpm4HistDetail.class.isInstance(obj)) {
			Jbpm4HistDetail o = ((Jbpm4HistDetail)(obj));
			this.dbid = o.dbid;
			this.class_ = o.class_;
			this.dbversion = o.dbversion;
			this.userid = o.userid;
			this.time = o.time;
			this.hproci = o.hproci;
			this.hprociidx = o.hprociidx;
			this.hacti = o.hacti;
			this.hactiidx = o.hactiidx;
			this.htask = o.htask;
			this.htaskidx = o.htaskidx;
			this.hvar = o.hvar;
			this.hvaridx = o.hvaridx;
			this.message = o.message;
			this.oldStr = o.oldStr;
			this.newStr = o.newStr;
			this.oldInt = o.oldInt;
			this.newInt = o.newInt;
			this.oldTime = o.oldTime;
			this.newTime = o.newTime;
			this.parent = o.parent;
			this.parentIdx = o.parentIdx;
		}
	}
	
	/**
	 * 插入Jbpm4HistDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistDetail">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException {
		String sql = "insert into [JBPM4_HIST_DETAIL](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [CLASS_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [USERID_]");
		sql = (sql + ", [TIME_]");
		sql = (sql + ", [HPROCI_]");
		sql = (sql + ", [HPROCIIDX_]");
		sql = (sql + ", [HACTI_]");
		sql = (sql + ", [HACTIIDX_]");
		sql = (sql + ", [HTASK_]");
		sql = (sql + ", [HTASKIDX_]");
		sql = (sql + ", [HVAR_]");
		sql = (sql + ", [HVARIDX_]");
		sql = (sql + ", [MESSAGE_]");
		sql = (sql + ", [OLD_STR_]");
		sql = (sql + ", [NEW_STR_]");
		sql = (sql + ", [OLD_INT_]");
		sql = (sql + ", [NEW_INT_]");
		sql = (sql + ", [OLD_TIME_]");
		sql = (sql + ", [NEW_TIME_]");
		sql = (sql + ", [PARENT_]");
		sql = (sql + ", [PARENT_IDX_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4HistDetail.getDbid());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getClass_().toString()));
		sql = (sql + ", ");
		sql = (sql + jbpm4HistDetail.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4HistDetail.userid == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getUserid().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.time == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistDetail.getTime()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.hproci == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getHproci());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.hprociidx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getHprociidx());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.hacti == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getHacti());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.hactiidx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getHactiidx());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.htask == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getHtask());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.htaskidx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getHtaskidx());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.hvar == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getHvar());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.hvaridx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getHvaridx());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.message == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getMessage().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.oldStr == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getOldStr().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.newStr == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getNewStr().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.oldInt == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getOldInt());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.newInt == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getNewInt());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.oldTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistDetail.getOldTime()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.newTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistDetail.getNewTime()));
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.parent == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getParent());
		}
		sql = (sql + ", ");
		if ((jbpm4HistDetail.parentIdx == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4HistDetail.getParentIdx());
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4HistDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4HistDetail.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistDetail">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistDetail jbpm4HistDetail, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_HIST_DETAIL] set ";
		sql = (sql + "[CLASS_] = ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getClass_().toString()));
		sql = (sql + ",");
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4HistDetail.getDbversion());
		sql = (sql + ",");
		if ((jbpm4HistDetail.userid == null)) {
			sql = (sql + "[USERID_] = default ,");
		}
		else {
			sql = (sql + "[USERID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getUserid().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.time == null)) {
			sql = (sql + "[TIME_] = default ,");
		}
		else {
			sql = (sql + "[TIME_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistDetail.getTime()));
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.hproci == null)) {
			sql = (sql + "[HPROCI_] = default ,");
		}
		else {
			sql = (sql + "[HPROCI_] = ");
			sql = (sql + jbpm4HistDetail.getHproci());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.hprociidx == null)) {
			sql = (sql + "[HPROCIIDX_] = default ,");
		}
		else {
			sql = (sql + "[HPROCIIDX_] = ");
			sql = (sql + jbpm4HistDetail.getHprociidx());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.hacti == null)) {
			sql = (sql + "[HACTI_] = default ,");
		}
		else {
			sql = (sql + "[HACTI_] = ");
			sql = (sql + jbpm4HistDetail.getHacti());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.hactiidx == null)) {
			sql = (sql + "[HACTIIDX_] = default ,");
		}
		else {
			sql = (sql + "[HACTIIDX_] = ");
			sql = (sql + jbpm4HistDetail.getHactiidx());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.htask == null)) {
			sql = (sql + "[HTASK_] = default ,");
		}
		else {
			sql = (sql + "[HTASK_] = ");
			sql = (sql + jbpm4HistDetail.getHtask());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.htaskidx == null)) {
			sql = (sql + "[HTASKIDX_] = default ,");
		}
		else {
			sql = (sql + "[HTASKIDX_] = ");
			sql = (sql + jbpm4HistDetail.getHtaskidx());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.hvar == null)) {
			sql = (sql + "[HVAR_] = default ,");
		}
		else {
			sql = (sql + "[HVAR_] = ");
			sql = (sql + jbpm4HistDetail.getHvar());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.hvaridx == null)) {
			sql = (sql + "[HVARIDX_] = default ,");
		}
		else {
			sql = (sql + "[HVARIDX_] = ");
			sql = (sql + jbpm4HistDetail.getHvaridx());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.message == null)) {
			sql = (sql + "[MESSAGE_] = default ,");
		}
		else {
			sql = (sql + "[MESSAGE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getMessage().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.oldStr == null)) {
			sql = (sql + "[OLD_STR_] = default ,");
		}
		else {
			sql = (sql + "[OLD_STR_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getOldStr().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.newStr == null)) {
			sql = (sql + "[NEW_STR_] = default ,");
		}
		else {
			sql = (sql + "[NEW_STR_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4HistDetail.getNewStr().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.oldInt == null)) {
			sql = (sql + "[OLD_INT_] = default ,");
		}
		else {
			sql = (sql + "[OLD_INT_] = ");
			sql = (sql + jbpm4HistDetail.getOldInt());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.newInt == null)) {
			sql = (sql + "[NEW_INT_] = default ,");
		}
		else {
			sql = (sql + "[NEW_INT_] = ");
			sql = (sql + jbpm4HistDetail.getNewInt());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.oldTime == null)) {
			sql = (sql + "[OLD_TIME_] = default ,");
		}
		else {
			sql = (sql + "[OLD_TIME_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistDetail.getOldTime()));
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.newTime == null)) {
			sql = (sql + "[NEW_TIME_] = default ,");
		}
		else {
			sql = (sql + "[NEW_TIME_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4HistDetail.getNewTime()));
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.parent == null)) {
			sql = (sql + "[PARENT_] = default ,");
		}
		else {
			sql = (sql + "[PARENT_] = ");
			sql = (sql + jbpm4HistDetail.getParent());
			sql = (sql + ",");
		}
		if ((jbpm4HistDetail.parentIdx == null)) {
			sql = (sql + "[PARENT_IDX_] = default ,");
		}
		else {
			sql = (sql + "[PARENT_IDX_] = ");
			sql = (sql + jbpm4HistDetail.getParentIdx());
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4HistDetail.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4HistDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4HistDetail">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException {
		return Jbpm4HistDetail.update(dataVisit, jbpm4HistDetail, "");
	}
	
	/**
	 * 更新Jbpm4HistDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4HistDetail.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4HistDetail对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4HistDetail.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4HistDetail> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4HistDetail> list = new ArrayList<Jbpm4HistDetail>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistDetail obj = new Jbpm4HistDetail();
				Jbpm4HistDetail.readValue(reader, obj);
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
	public static List<Jbpm4HistDetail> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistDetail> list = new ArrayList<Jbpm4HistDetail>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistDetail obj = new Jbpm4HistDetail();
				Jbpm4HistDetail.readValue(reader, obj);
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
	public static List<Jbpm4HistDetail> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistDetail.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4HistDetail> list = new ArrayList<Jbpm4HistDetail>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistDetail obj = new Jbpm4HistDetail();
				Jbpm4HistDetail.readValue(reader, obj);
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
	public static List<Jbpm4HistDetail> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4HistDetail.getFullSelectSql() + appendConditionSql));
		List<Jbpm4HistDetail> list = new ArrayList<Jbpm4HistDetail>();
		try {
			for (; reader.next(); ) {
				Jbpm4HistDetail obj = new Jbpm4HistDetail();
				Jbpm4HistDetail.readValue(reader, obj);
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
	public static <T extends Jbpm4HistDetail> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistDetail.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistDetail.readValue(reader, obj);
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
public static <T extends Jbpm4HistDetail> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4HistDetail.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4HistDetail.readValue(reader, obj);
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
	String sql = "select * from JBPM4_HIST_DETAIL ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4HistDetail
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4HistDetail selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4HistDetail> list = Jbpm4HistDetail.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4HistDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_HIST_DETAIL] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4HistDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4HistDetail.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4HistDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hacti"></param>
 */
public static void deleteListByHacti(IDataVisit2 dataVisit, Double AHacti) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_DETAIL] where ");
	sql = (sql + "HACTI_ = ");
	sql = (sql + AHacti);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4HistDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 */
public static void deleteListByHproci(IDataVisit2 dataVisit, Double AHproci) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_DETAIL] where ");
	sql = (sql + "HPROCI_ = ");
	sql = (sql + AHproci);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4HistDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 */
public static void deleteListByHtask(IDataVisit2 dataVisit, Double AHtask) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_DETAIL] where ");
	sql = (sql + "HTASK_ = ");
	sql = (sql + AHtask);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4HistDetail对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hvar"></param>
 */
public static void deleteListByHvar(IDataVisit2 dataVisit, Double AHvar) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_HIST_DETAIL] where ");
	sql = (sql + "HVAR_ = ");
	sql = (sql + AHvar);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hacti"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHacti(IDataVisit2 dataVisit, Double AHacti, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HACTI_ = ";
	sql = (sql + AHacti);
	sql = (sql + appendConditionSql);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hacti"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHacti(IDataVisit2 dataVisit, Double AHacti, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HACTI_ = ";
	sql = (sql + AHacti);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hacti"></param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHacti(IDataVisit2 dataVisit, Double AHacti) throws SQLException, DbException {
	String sql = " where HACTI_ = ";
	sql = (sql + AHacti);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	sql = (sql + appendConditionSql);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hproci"></param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHproci(IDataVisit2 dataVisit, Double AHproci) throws SQLException, DbException {
	String sql = " where HPROCI_ = ";
	sql = (sql + AHproci);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	sql = (sql + appendConditionSql);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Htask"></param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHtask(IDataVisit2 dataVisit, Double AHtask) throws SQLException, DbException {
	String sql = " where HTASK_ = ";
	sql = (sql + AHtask);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hvar"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHvar(IDataVisit2 dataVisit, Double AHvar, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HVAR_ = ";
	sql = (sql + AHvar);
	sql = (sql + appendConditionSql);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hvar"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHvar(IDataVisit2 dataVisit, Double AHvar, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where HVAR_ = ";
	sql = (sql + AHvar);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Hvar"></param>
 */
public static List<Jbpm4HistDetail> selectObjectsByHvar(IDataVisit2 dataVisit, Double AHvar) throws SQLException, DbException {
	String sql = " where HVAR_ = ";
	sql = (sql + AHvar);
	return Jbpm4HistDetail.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4HistDetail中
 * <param name="reader">数据源</param>
 * <param name="jbpm4HistDetail">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4HistDetail jbpm4HistDetail) throws SQLException, DbException {
	jbpm4HistDetail.dbid = reader.getDouble(1);
	jbpm4HistDetail.class_ = reader.getString(2);
	jbpm4HistDetail.dbversion = reader.getInt(3);
	jbpm4HistDetail.userid = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4HistDetail.userid = null;
	}
	jbpm4HistDetail.time = SqlUtils.getDate(reader, 5);
	if (reader.wasNull()) {
		jbpm4HistDetail.time = null;
	}
	jbpm4HistDetail.hproci = reader.getDouble(6);
	if (reader.wasNull()) {
		jbpm4HistDetail.hproci = null;
	}
	jbpm4HistDetail.hprociidx = reader.getInt(7);
	if (reader.wasNull()) {
		jbpm4HistDetail.hprociidx = null;
	}
	jbpm4HistDetail.hacti = reader.getDouble(8);
	if (reader.wasNull()) {
		jbpm4HistDetail.hacti = null;
	}
	jbpm4HistDetail.hactiidx = reader.getInt(9);
	if (reader.wasNull()) {
		jbpm4HistDetail.hactiidx = null;
	}
	jbpm4HistDetail.htask = reader.getDouble(10);
	if (reader.wasNull()) {
		jbpm4HistDetail.htask = null;
	}
	jbpm4HistDetail.htaskidx = reader.getInt(11);
	if (reader.wasNull()) {
		jbpm4HistDetail.htaskidx = null;
	}
	jbpm4HistDetail.hvar = reader.getDouble(12);
	if (reader.wasNull()) {
		jbpm4HistDetail.hvar = null;
	}
	jbpm4HistDetail.hvaridx = reader.getInt(13);
	if (reader.wasNull()) {
		jbpm4HistDetail.hvaridx = null;
	}
	jbpm4HistDetail.message = reader.getString(14);
	if (reader.wasNull()) {
		jbpm4HistDetail.message = null;
	}
	jbpm4HistDetail.oldStr = reader.getString(15);
	if (reader.wasNull()) {
		jbpm4HistDetail.oldStr = null;
	}
	jbpm4HistDetail.newStr = reader.getString(16);
	if (reader.wasNull()) {
		jbpm4HistDetail.newStr = null;
	}
	jbpm4HistDetail.oldInt = reader.getInt(17);
	if (reader.wasNull()) {
		jbpm4HistDetail.oldInt = null;
	}
	jbpm4HistDetail.newInt = reader.getInt(18);
	if (reader.wasNull()) {
		jbpm4HistDetail.newInt = null;
	}
	jbpm4HistDetail.oldTime = SqlUtils.getDate(reader, 19);
	if (reader.wasNull()) {
		jbpm4HistDetail.oldTime = null;
	}
	jbpm4HistDetail.newTime = SqlUtils.getDate(reader, 20);
	if (reader.wasNull()) {
		jbpm4HistDetail.newTime = null;
	}
	jbpm4HistDetail.parent = reader.getDouble(21);
	if (reader.wasNull()) {
		jbpm4HistDetail.parent = null;
	}
	jbpm4HistDetail.parentIdx = reader.getInt(22);
	if (reader.wasNull()) {
		jbpm4HistDetail.parentIdx = null;
	}
}
}
