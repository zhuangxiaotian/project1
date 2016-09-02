package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * JBPM4_TASK: 
 */
public class Jbpm4Task extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
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
	 * NAME_: 
	 */
	String name;
	
	/**
	 * DESCR_: 
	 */
	String descr;
	
	/**
	 * STATE_: 
	 */
	String state;
	
	/**
	 * SUSPHISTSTATE_: 
	 */
	String susphiststate;
	
	/**
	 * ASSIGNEE_: 
	 */
	String assignee;
	
	/**
	 * FORM_: 
	 */
	String form;
	
	/**
	 * PRIORITY_: 
	 */
	Integer priority;
	
	/**
	 * CREATE_: 
	 */
	java.util.Date create;
	
	/**
	 * DUEDATE_: 
	 */
	java.util.Date duedate;
	
	/**
	 * PROGRESS_: 
	 */
	Integer progress;
	
	/**
	 * SIGNALLING_: 
	 */
	Byte signalling;
	
	/**
	 * EXECUTION_ID_: 
	 */
	String executionId;
	
	/**
	 * ACTIVITY_NAME_: 
	 */
	String activityName;
	
	/**
	 * HASVARS_: 
	 */
	Byte hasvars;
	
	/**
	 * SUPERTASK_: 
	 */
	Double supertask;
	
	/**
	 * EXECUTION_: 
	 */
	Double execution;
	
	/**
	 * PROCINST_: 
	 */
	Double procinst;
	
	/**
	 * SWIMLANE_: 
	 */
	Double swimlane;
	
	/**
	 * TASKDEFNAME_: 
	 */
	String taskdefname;
	
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
	 * DESCR_: 
	 */
	public String getDescr() {
		return this.descr;
	}
	
	/**
	 * DESCR_: 
	 */
	public void setDescr(String value)
	 {
		this.descr = value;
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
	 * ASSIGNEE_: 
	 */
	public String getAssignee() {
		return this.assignee;
	}
	
	/**
	 * ASSIGNEE_: 
	 */
	public void setAssignee(String value)
	 {
		this.assignee = value;
	}
	
	/**
	 * FORM_: 
	 */
	public String getForm() {
		return this.form;
	}
	
	/**
	 * FORM_: 
	 */
	public void setForm(String value)
	 {
		this.form = value;
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
	 * CREATE_: 
	 */
	public java.util.Date getCreate() {
		return this.create;
	}
	
	/**
	 * CREATE_: 
	 */
	public void setCreate(java.util.Date value)
	 {
		this.create = value;
	}
	
	/**
	 * DUEDATE_: 
	 */
	public java.util.Date getDuedate() {
		return this.duedate;
	}
	
	/**
	 * DUEDATE_: 
	 */
	public void setDuedate(java.util.Date value)
	 {
		this.duedate = value;
	}
	
	/**
	 * PROGRESS_: 
	 */
	public Integer getProgress() {
		return this.progress;
	}
	
	/**
	 * PROGRESS_: 
	 */
	public void setProgress(Integer value)
	 {
		this.progress = value;
	}
	
	/**
	 * SIGNALLING_: 
	 */
	public Byte getSignalling() {
		return this.signalling;
	}
	
	/**
	 * SIGNALLING_: 
	 */
	public void setSignalling(Byte value)
	 {
		this.signalling = value;
	}
	
	/**
	 * EXECUTION_ID_: 
	 */
	public String getExecutionId() {
		return this.executionId;
	}
	
	/**
	 * EXECUTION_ID_: 
	 */
	public void setExecutionId(String value)
	 {
		this.executionId = value;
	}
	
	/**
	 * ACTIVITY_NAME_: 
	 */
	public String getActivityName() {
		return this.activityName;
	}
	
	/**
	 * ACTIVITY_NAME_: 
	 */
	public void setActivityName(String value)
	 {
		this.activityName = value;
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
	 * SUPERTASK_: 
	 */
	public Double getSupertask() {
		return this.supertask;
	}
	
	/**
	 * SUPERTASK_: 
	 */
	public void setSupertask(Double value)
	 {
		this.supertask = value;
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
	 * PROCINST_: 
	 */
	public Double getProcinst() {
		return this.procinst;
	}
	
	/**
	 * PROCINST_: 
	 */
	public void setProcinst(Double value)
	 {
		this.procinst = value;
	}
	
	/**
	 * SWIMLANE_: 
	 */
	public Double getSwimlane() {
		return this.swimlane;
	}
	
	/**
	 * SWIMLANE_: 
	 */
	public void setSwimlane(Double value)
	 {
		this.swimlane = value;
	}
	
	/**
	 * TASKDEFNAME_: 
	 */
	public String getTaskdefname() {
		return this.taskdefname;
	}
	
	/**
	 * TASKDEFNAME_: 
	 */
	public void setTaskdefname(String value)
	 {
		this.taskdefname = value;
	}
	
	public static String getSelectSql() {
		return "select  [JBPM4_TASK].[DBID_], [JBPM4_TASK].[CLASS_], [JBPM4_TASK].[DBVERSION_], [JBPM4_TASK].[NAME_], [JBPM4_TASK].[DESCR_], [JBPM4_TASK].[STATE_], [JBPM4_TASK].[SUSPHISTSTATE_], [JBPM4_TASK].[ASSIGNEE_], [JBPM4_TASK].[FORM_], [JBPM4_TASK].[PRIORITY_], [JBPM4_TASK].[CREATE_], [JBPM4_TASK].[DUEDATE_], [JBPM4_TASK].[PROGRESS_], [JBPM4_TASK].[SIGNALLING_], [JBPM4_TASK].[EXECUTION_ID_], [JBPM4_TASK].[ACTIVITY_NAME_], [JBPM4_TASK].[HASVARS_], [JBPM4_TASK].[SUPERTASK_], [JBPM4_TASK].[EXECUTION_], [JBPM4_TASK].[PROCINST_], [JBPM4_TASK].[SWIMLANE_], [JBPM4_TASK].[TASKDEFNAME_]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [JBPM4_TASK].[DBID_], [JBPM4_TASK].[CLASS_], [JBPM4_TASK].[DBVERSION_], [JBPM4_TASK].[NAME_], [JBPM4_TASK].[DESCR_], [JBPM4_TASK].[STATE_], [JBPM4_TASK].[SUSPHISTSTATE_], [JBPM4_TASK].[ASSIGNEE_], [JBPM4_TASK].[FORM_], [JBPM4_TASK].[PRIORITY_], [JBPM4_TASK].[CREATE_], [JBPM4_TASK].[DUEDATE_], [JBPM4_TASK].[PROGRESS_], [JBPM4_TASK].[SIGNALLING_], [JBPM4_TASK].[EXECUTION_ID_], [JBPM4_TASK].[ACTIVITY_NAME_], [JBPM4_TASK].[HASVARS_], [JBPM4_TASK].[SUPERTASK_], [JBPM4_TASK].[EXECUTION_], [JBPM4_TASK].[PROCINST_], [JBPM4_TASK].[SWIMLANE_], [JBPM4_TASK].[TASKDEFNAME_]   from [JBPM4_TASK] ";
	}
	
	
	public static String getColumnSql() {
		return " [JBPM4_TASK].[DBID_], [JBPM4_TASK].[CLASS_], [JBPM4_TASK].[DBVERSION_], [JBPM4_TASK].[NAME_], [JBPM4_TASK].[DESCR_], [JBPM4_TASK].[STATE_], [JBPM4_TASK].[SUSPHISTSTATE_], [JBPM4_TASK].[ASSIGNEE_], [JBPM4_TASK].[FORM_], [JBPM4_TASK].[PRIORITY_], [JBPM4_TASK].[CREATE_], [JBPM4_TASK].[DUEDATE_], [JBPM4_TASK].[PROGRESS_], [JBPM4_TASK].[SIGNALLING_], [JBPM4_TASK].[EXECUTION_ID_], [JBPM4_TASK].[ACTIVITY_NAME_], [JBPM4_TASK].[HASVARS_], [JBPM4_TASK].[SUPERTASK_], [JBPM4_TASK].[EXECUTION_], [JBPM4_TASK].[PROCINST_], [JBPM4_TASK].[SWIMLANE_], [JBPM4_TASK].[TASKDEFNAME_] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "JBPM4_TASK";
	}
	
	
	public String getTableName() {
		return "JBPM4_TASK";
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
		if (Jbpm4Task.class.isInstance(obj)) {
			Jbpm4Task o = ((Jbpm4Task)(obj));
			this.dbid = o.dbid;
			this.class_ = o.class_;
			this.dbversion = o.dbversion;
			this.name = o.name;
			this.descr = o.descr;
			this.state = o.state;
			this.susphiststate = o.susphiststate;
			this.assignee = o.assignee;
			this.form = o.form;
			this.priority = o.priority;
			this.create = o.create;
			this.duedate = o.duedate;
			this.progress = o.progress;
			this.signalling = o.signalling;
			this.executionId = o.executionId;
			this.activityName = o.activityName;
			this.hasvars = o.hasvars;
			this.supertask = o.supertask;
			this.execution = o.execution;
			this.procinst = o.procinst;
			this.swimlane = o.swimlane;
			this.taskdefname = o.taskdefname;
		}
	}
	
	/**
	 * 插入Jbpm4Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Task">需要插入的</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Jbpm4Task jbpm4Task) throws SQLException, DbException {
		String sql = "insert into [JBPM4_TASK](";
		sql = (sql + "[DBID_]");
		sql = (sql + ", [CLASS_]");
		sql = (sql + ", [DBVERSION_]");
		sql = (sql + ", [NAME_]");
		sql = (sql + ", [DESCR_]");
		sql = (sql + ", [STATE_]");
		sql = (sql + ", [SUSPHISTSTATE_]");
		sql = (sql + ", [ASSIGNEE_]");
		sql = (sql + ", [FORM_]");
		sql = (sql + ", [PRIORITY_]");
		sql = (sql + ", [CREATE_]");
		sql = (sql + ", [DUEDATE_]");
		sql = (sql + ", [PROGRESS_]");
		sql = (sql + ", [SIGNALLING_]");
		sql = (sql + ", [EXECUTION_ID_]");
		sql = (sql + ", [ACTIVITY_NAME_]");
		sql = (sql + ", [HASVARS_]");
		sql = (sql + ", [SUPERTASK_]");
		sql = (sql + ", [EXECUTION_]");
		sql = (sql + ", [PROCINST_]");
		sql = (sql + ", [SWIMLANE_]");
		sql = (sql + ", [TASKDEFNAME_]");
		sql = (sql + ")values(");
		sql = (sql + jbpm4Task.getDbid());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getClass_().toString()));
		sql = (sql + ", ");
		sql = (sql + jbpm4Task.getDbversion());
		sql = (sql + ", ");
		if ((jbpm4Task.name == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getName().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.descr == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getDescr().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.state == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getState().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.susphiststate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getSusphiststate().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.assignee == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getAssignee().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.form == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getForm().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.priority == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Task.getPriority());
		}
		sql = (sql + ", ");
		if ((jbpm4Task.create == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Task.getCreate()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.duedate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Task.getDuedate()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.progress == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Task.getProgress());
		}
		sql = (sql + ", ");
		if ((jbpm4Task.signalling == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Task.getSignalling());
		}
		sql = (sql + ", ");
		if ((jbpm4Task.executionId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getExecutionId().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.activityName == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getActivityName().toString()));
		}
		sql = (sql + ", ");
		if ((jbpm4Task.hasvars == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Task.getHasvars());
		}
		sql = (sql + ", ");
		if ((jbpm4Task.supertask == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Task.getSupertask());
		}
		sql = (sql + ", ");
		if ((jbpm4Task.execution == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Task.getExecution());
		}
		sql = (sql + ", ");
		if ((jbpm4Task.procinst == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Task.getProcinst());
		}
		sql = (sql + ", ");
		if ((jbpm4Task.swimlane == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + jbpm4Task.getSwimlane());
		}
		sql = (sql + ", ");
		if ((jbpm4Task.taskdefname == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getTaskdefname().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入Jbpm4Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Jbpm4Task.insert(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Task">需要更新的</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Task jbpm4Task, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [JBPM4_TASK] set ";
		sql = (sql + "[CLASS_] = ");
		sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getClass_().toString()));
		sql = (sql + ",");
		sql = (sql + "[DBVERSION_] = ");
		sql = (sql + jbpm4Task.getDbversion());
		sql = (sql + ",");
		if ((jbpm4Task.name == null)) {
			sql = (sql + "[NAME_] = default ,");
		}
		else {
			sql = (sql + "[NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getName().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.descr == null)) {
			sql = (sql + "[DESCR_] = default ,");
		}
		else {
			sql = (sql + "[DESCR_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getDescr().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.state == null)) {
			sql = (sql + "[STATE_] = default ,");
		}
		else {
			sql = (sql + "[STATE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getState().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.susphiststate == null)) {
			sql = (sql + "[SUSPHISTSTATE_] = default ,");
		}
		else {
			sql = (sql + "[SUSPHISTSTATE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getSusphiststate().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.assignee == null)) {
			sql = (sql + "[ASSIGNEE_] = default ,");
		}
		else {
			sql = (sql + "[ASSIGNEE_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getAssignee().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.form == null)) {
			sql = (sql + "[FORM_] = default ,");
		}
		else {
			sql = (sql + "[FORM_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getForm().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.priority == null)) {
			sql = (sql + "[PRIORITY_] = default ,");
		}
		else {
			sql = (sql + "[PRIORITY_] = ");
			sql = (sql + jbpm4Task.getPriority());
			sql = (sql + ",");
		}
		if ((jbpm4Task.create == null)) {
			sql = (sql + "[CREATE_] = default ,");
		}
		else {
			sql = (sql + "[CREATE_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Task.getCreate()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.duedate == null)) {
			sql = (sql + "[DUEDATE_] = default ,");
		}
		else {
			sql = (sql + "[DUEDATE_] = ");
			sql = (sql + SqlServerUtils.getDateSql(jbpm4Task.getDuedate()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.progress == null)) {
			sql = (sql + "[PROGRESS_] = default ,");
		}
		else {
			sql = (sql + "[PROGRESS_] = ");
			sql = (sql + jbpm4Task.getProgress());
			sql = (sql + ",");
		}
		if ((jbpm4Task.signalling == null)) {
			sql = (sql + "[SIGNALLING_] = default ,");
		}
		else {
			sql = (sql + "[SIGNALLING_] = ");
			sql = (sql + jbpm4Task.getSignalling());
			sql = (sql + ",");
		}
		if ((jbpm4Task.executionId == null)) {
			sql = (sql + "[EXECUTION_ID_] = default ,");
		}
		else {
			sql = (sql + "[EXECUTION_ID_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getExecutionId().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.activityName == null)) {
			sql = (sql + "[ACTIVITY_NAME_] = default ,");
		}
		else {
			sql = (sql + "[ACTIVITY_NAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getActivityName().toString()));
			sql = (sql + ",");
		}
		if ((jbpm4Task.hasvars == null)) {
			sql = (sql + "[HASVARS_] = default ,");
		}
		else {
			sql = (sql + "[HASVARS_] = ");
			sql = (sql + jbpm4Task.getHasvars());
			sql = (sql + ",");
		}
		if ((jbpm4Task.supertask == null)) {
			sql = (sql + "[SUPERTASK_] = default ,");
		}
		else {
			sql = (sql + "[SUPERTASK_] = ");
			sql = (sql + jbpm4Task.getSupertask());
			sql = (sql + ",");
		}
		if ((jbpm4Task.execution == null)) {
			sql = (sql + "[EXECUTION_] = default ,");
		}
		else {
			sql = (sql + "[EXECUTION_] = ");
			sql = (sql + jbpm4Task.getExecution());
			sql = (sql + ",");
		}
		if ((jbpm4Task.procinst == null)) {
			sql = (sql + "[PROCINST_] = default ,");
		}
		else {
			sql = (sql + "[PROCINST_] = ");
			sql = (sql + jbpm4Task.getProcinst());
			sql = (sql + ",");
		}
		if ((jbpm4Task.swimlane == null)) {
			sql = (sql + "[SWIMLANE_] = default ,");
		}
		else {
			sql = (sql + "[SWIMLANE_] = ");
			sql = (sql + jbpm4Task.getSwimlane());
			sql = (sql + ",");
		}
		if ((jbpm4Task.taskdefname == null)) {
			sql = (sql + "[TASKDEFNAME_] = default ,");
		}
		else {
			sql = (sql + "[TASKDEFNAME_] = ");
			sql = (sql + SqlServerUtils.safeSql(jbpm4Task.getTaskdefname().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "DBID_ = ");
		sql = (sql + jbpm4Task.getDbid());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Jbpm4Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="jbpm4Task">需要更新的</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Jbpm4Task jbpm4Task) throws SQLException, DbException {
		return Jbpm4Task.update(dataVisit, jbpm4Task, "");
	}
	
	/**
	 * 更新Jbpm4Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Jbpm4Task.update(dataVisit, this);
	}
	
	/**
	 * 更新Jbpm4Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Jbpm4Task.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Jbpm4Task> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Jbpm4Task> list = new ArrayList<Jbpm4Task>();
		try {
			for (; reader.next(); ) {
				Jbpm4Task obj = new Jbpm4Task();
				Jbpm4Task.readValue(reader, obj);
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
	public static List<Jbpm4Task> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Task> list = new ArrayList<Jbpm4Task>();
		try {
			for (; reader.next(); ) {
				Jbpm4Task obj = new Jbpm4Task();
				Jbpm4Task.readValue(reader, obj);
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
	public static List<Jbpm4Task> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Task.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Jbpm4Task> list = new ArrayList<Jbpm4Task>();
		try {
			for (; reader.next(); ) {
				Jbpm4Task obj = new Jbpm4Task();
				Jbpm4Task.readValue(reader, obj);
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
	public static List<Jbpm4Task> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Jbpm4Task.getFullSelectSql() + appendConditionSql));
		List<Jbpm4Task> list = new ArrayList<Jbpm4Task>();
		try {
			for (; reader.next(); ) {
				Jbpm4Task obj = new Jbpm4Task();
				Jbpm4Task.readValue(reader, obj);
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
	public static <T extends Jbpm4Task> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Task.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Task.readValue(reader, obj);
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
public static <T extends Jbpm4Task> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Jbpm4Task.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Jbpm4Task.readValue(reader, obj);
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
	String sql = "select * from JBPM4_TASK ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据查询Jbpm4Task
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static Jbpm4Task selectByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	List<Jbpm4Task> list = Jbpm4Task.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Jbpm4Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [JBPM4_TASK] where ");
	sql = (sql + "DBID_ = ");
	sql = (sql + ADbid);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Jbpm4Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ADbid"></param>
 */
public static void deleteByDbid(IDataVisit2 dataVisit, double ADbid) throws SQLException, DbException {
	Jbpm4Task.deleteByDbid(dataVisit, ADbid, "");
}

/**
 * 根据外键删除一批Jbpm4Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Swimlane"></param>
 */
public static void deleteListBySwimlane(IDataVisit2 dataVisit, Double ASwimlane) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_TASK] where ");
	sql = (sql + "SWIMLANE_ = ");
	sql = (sql + ASwimlane);
	dataVisit.execSql(sql);
}

/**
 * 根据外键删除一批Jbpm4Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Supertask"></param>
 */
public static void deleteListBySupertask(IDataVisit2 dataVisit, Double ASupertask) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [JBPM4_TASK] where ");
	sql = (sql + "SUPERTASK_ = ");
	sql = (sql + ASupertask);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Swimlane"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Task> selectObjectsBySwimlane(IDataVisit2 dataVisit, Double ASwimlane, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SWIMLANE_ = ";
	sql = (sql + ASwimlane);
	sql = (sql + appendConditionSql);
	return Jbpm4Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Swimlane"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Task> selectObjectsBySwimlane(IDataVisit2 dataVisit, Double ASwimlane, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SWIMLANE_ = ";
	sql = (sql + ASwimlane);
	return Jbpm4Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Swimlane"></param>
 */
public static List<Jbpm4Task> selectObjectsBySwimlane(IDataVisit2 dataVisit, Double ASwimlane) throws SQLException, DbException {
	String sql = " where SWIMLANE_ = ";
	sql = (sql + ASwimlane);
	return Jbpm4Task.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Supertask"></param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Task> selectObjectsBySupertask(IDataVisit2 dataVisit, Double ASupertask, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SUPERTASK_ = ";
	sql = (sql + ASupertask);
	sql = (sql + appendConditionSql);
	return Jbpm4Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Supertask"></param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Jbpm4Task> selectObjectsBySupertask(IDataVisit2 dataVisit, Double ASupertask, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where SUPERTASK_ = ";
	sql = (sql + ASupertask);
	return Jbpm4Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="Supertask"></param>
 */
public static List<Jbpm4Task> selectObjectsBySupertask(IDataVisit2 dataVisit, Double ASupertask) throws SQLException, DbException {
	String sql = " where SUPERTASK_ = ";
	sql = (sql + ASupertask);
	return Jbpm4Task.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象jbpm4Task中
 * <param name="reader">数据源</param>
 * <param name="jbpm4Task">目标对象</param>
 */
public static void readValue(ResultSet reader, Jbpm4Task jbpm4Task) throws SQLException, DbException {
	jbpm4Task.dbid = reader.getDouble(1);
	jbpm4Task.class_ = reader.getString(2);
	jbpm4Task.dbversion = reader.getInt(3);
	jbpm4Task.name = reader.getString(4);
	if (reader.wasNull()) {
		jbpm4Task.name = null;
	}
	jbpm4Task.descr = reader.getString(5);
	if (reader.wasNull()) {
		jbpm4Task.descr = null;
	}
	jbpm4Task.state = reader.getString(6);
	if (reader.wasNull()) {
		jbpm4Task.state = null;
	}
	jbpm4Task.susphiststate = reader.getString(7);
	if (reader.wasNull()) {
		jbpm4Task.susphiststate = null;
	}
	jbpm4Task.assignee = reader.getString(8);
	if (reader.wasNull()) {
		jbpm4Task.assignee = null;
	}
	jbpm4Task.form = reader.getString(9);
	if (reader.wasNull()) {
		jbpm4Task.form = null;
	}
	jbpm4Task.priority = reader.getInt(10);
	if (reader.wasNull()) {
		jbpm4Task.priority = null;
	}
	jbpm4Task.create = SqlUtils.getDate(reader, 11);
	if (reader.wasNull()) {
		jbpm4Task.create = null;
	}
	jbpm4Task.duedate = SqlUtils.getDate(reader, 12);
	if (reader.wasNull()) {
		jbpm4Task.duedate = null;
	}
	jbpm4Task.progress = reader.getInt(13);
	if (reader.wasNull()) {
		jbpm4Task.progress = null;
	}
	jbpm4Task.signalling = reader.getByte(14);
	if (reader.wasNull()) {
		jbpm4Task.signalling = null;
	}
	jbpm4Task.executionId = reader.getString(15);
	if (reader.wasNull()) {
		jbpm4Task.executionId = null;
	}
	jbpm4Task.activityName = reader.getString(16);
	if (reader.wasNull()) {
		jbpm4Task.activityName = null;
	}
	jbpm4Task.hasvars = reader.getByte(17);
	if (reader.wasNull()) {
		jbpm4Task.hasvars = null;
	}
	jbpm4Task.supertask = reader.getDouble(18);
	if (reader.wasNull()) {
		jbpm4Task.supertask = null;
	}
	jbpm4Task.execution = reader.getDouble(19);
	if (reader.wasNull()) {
		jbpm4Task.execution = null;
	}
	jbpm4Task.procinst = reader.getDouble(20);
	if (reader.wasNull()) {
		jbpm4Task.procinst = null;
	}
	jbpm4Task.swimlane = reader.getDouble(21);
	if (reader.wasNull()) {
		jbpm4Task.swimlane = null;
	}
	jbpm4Task.taskdefname = reader.getString(22);
	if (reader.wasNull()) {
		jbpm4Task.taskdefname = null;
	}
}
}
