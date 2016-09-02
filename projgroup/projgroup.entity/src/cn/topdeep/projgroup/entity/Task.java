package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TASK: 任务表
 */
public class Task extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * TASK_ID: 任务代号
	 */
	int taskId;
	
	/**
	 * ACTUAL_WORK_TIME: 实际工作时间
	 */
	Double actualWorkTime;
	
	/**
	 * AUDIT_WORK_TIME: 审计工作时间
	 */
	Double auditWorkTime;
	
	/**
	 * CREATE_TIME: 创建时间
	 */
	java.util.Date createTime;
	
	/**
	 * ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	double estimateWorkTime;
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	java.util.Date modifyTime;
	
	/**
	 * ORDER_FIELD: 口令域
	 */
	java.util.Date orderField;
	
	/**
	 * TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	java.util.Date taskActualEndDate;
	
	/**
	 * TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	java.util.Date taskActualStartDate;
	
	/**
	 * TASK_DESC: 任务描述
	 */
	String taskDesc;
	
	/**
	 * TASK_LEVEL: 任务级别
	 */
	int taskLevel;
	
	/**
	 * TASK_NAME: 任务名称
	 */
	String taskName = "";
	
	/**
	 * TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	java.util.Date taskPlanEndDate;
	
	/**
	 * TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	java.util.Date taskPlanStartDate;
	
	/**
	 * TASK_STATE: 任务状态
	 */
	int taskState;
	
	/**
	 * TASK_PARENT_ID: 父任务代号
	 */
	Integer taskParentId;
	
	/**
	 * TASK_PROJECT_ID: 任务工程代号
	 */
	int taskProjectId;
	
	/**
	 * TASK_CREATER_ID: 任务创建者代号
	 */
	int taskCreaterId;
	
	/**
	 * TASK_MANAGER_ID: 任务管理员代号
	 */
	int taskManagerId;
	
	/**
	 * TASK_MODIFIER_ID: 任务修改者代号
	 */
	int taskModifierId;
	
	/**
	 * TASK_OUTLINE: 任务大纲
	 */
	String taskOutline = "";
	
	/**
	 * TASK_COMPLETE: 任务完成度
	 */
	byte taskComplete;
	
	/**
	 * TASK_ID: 任务代号
	 */
	public int getTaskId() {
		return this.taskId;
	}
	
	/**
	 * TASK_ID: 任务代号
	 */
	public void setTaskId(int value)
	 {
		this.taskId = value;
	}
	
	/**
	 * ACTUAL_WORK_TIME: 实际工作时间
	 */
	public Double getActualWorkTime() {
		return this.actualWorkTime;
	}
	
	/**
	 * ACTUAL_WORK_TIME: 实际工作时间
	 */
	public void setActualWorkTime(Double value)
	 {
		this.actualWorkTime = value;
	}
	
	/**
	 * AUDIT_WORK_TIME: 审计工作时间
	 */
	public Double getAuditWorkTime() {
		return this.auditWorkTime;
	}
	
	/**
	 * AUDIT_WORK_TIME: 审计工作时间
	 */
	public void setAuditWorkTime(Double value)
	 {
		this.auditWorkTime = value;
	}
	
	/**
	 * CREATE_TIME: 创建时间
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * CREATE_TIME: 创建时间
	 */
	public void setCreateTime(java.util.Date value)
	 {
		this.createTime = value;
	}
	
	/**
	 * ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public double getEstimateWorkTime() {
		return this.estimateWorkTime;
	}
	
	/**
	 * ESTIMATE_WORK_TIME: 工作估计完成时间
	 */
	public void setEstimateWorkTime(double value)
	 {
		this.estimateWorkTime = value;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}
	
	/**
	 * MODIFY_TIME: 修改时间
	 */
	public void setModifyTime(java.util.Date value)
	 {
		this.modifyTime = value;
	}
	
	/**
	 * ORDER_FIELD: 口令域
	 */
	public java.util.Date getOrderField() {
		return this.orderField;
	}
	
	/**
	 * ORDER_FIELD: 口令域
	 */
	public void setOrderField(java.util.Date value)
	 {
		this.orderField = value;
	}
	
	/**
	 * TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public java.util.Date getTaskActualEndDate() {
		return this.taskActualEndDate;
	}
	
	/**
	 * TASK_ACTUAL_END_DATE: 任务实际结束日期
	 */
	public void setTaskActualEndDate(java.util.Date value)
	 {
		this.taskActualEndDate = value;
	}
	
	/**
	 * TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public java.util.Date getTaskActualStartDate() {
		return this.taskActualStartDate;
	}
	
	/**
	 * TASK_ACTUAL_START_DATE: 任务实际开始日期
	 */
	public void setTaskActualStartDate(java.util.Date value)
	 {
		this.taskActualStartDate = value;
	}
	
	/**
	 * TASK_DESC: 任务描述
	 */
	public String getTaskDesc() {
		return this.taskDesc;
	}
	
	/**
	 * TASK_DESC: 任务描述
	 */
	public void setTaskDesc(String value)
	 {
		this.taskDesc = value;
	}
	
	/**
	 * TASK_LEVEL: 任务级别
	 */
	public int getTaskLevel() {
		return this.taskLevel;
	}
	
	/**
	 * TASK_LEVEL: 任务级别
	 */
	public void setTaskLevel(int value)
	 {
		this.taskLevel = value;
	}
	
	/**
	 * TASK_NAME: 任务名称
	 */
	public String getTaskName() {
		return this.taskName;
	}
	
	/**
	 * TASK_NAME: 任务名称
	 */
	public void setTaskName(String value)
	 {
		this.taskName = value;
	}
	
	/**
	 * TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public java.util.Date getTaskPlanEndDate() {
		return this.taskPlanEndDate;
	}
	
	/**
	 * TASK_PLAN_END_DATE: 任务计划结束日期
	 */
	public void setTaskPlanEndDate(java.util.Date value)
	 {
		this.taskPlanEndDate = value;
	}
	
	/**
	 * TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public java.util.Date getTaskPlanStartDate() {
		return this.taskPlanStartDate;
	}
	
	/**
	 * TASK_PLAN_START_DATE: 任务计划开始日期
	 */
	public void setTaskPlanStartDate(java.util.Date value)
	 {
		this.taskPlanStartDate = value;
	}
	
	/**
	 * TASK_STATE: 任务状态
	 */
	public int getTaskState() {
		return this.taskState;
	}
	
	/**
	 * TASK_STATE: 任务状态
	 */
	public void setTaskState(int value)
	 {
		this.taskState = value;
	}
	
	/**
	 * TASK_PARENT_ID: 父任务代号
	 */
	public Integer getTaskParentId() {
		return this.taskParentId;
	}
	
	/**
	 * TASK_PARENT_ID: 父任务代号
	 */
	public void setTaskParentId(Integer value)
	 {
		this.taskParentId = value;
	}
	
	/**
	 * TASK_PROJECT_ID: 任务工程代号
	 */
	public int getTaskProjectId() {
		return this.taskProjectId;
	}
	
	/**
	 * TASK_PROJECT_ID: 任务工程代号
	 */
	public void setTaskProjectId(int value)
	 {
		this.taskProjectId = value;
	}
	
	/**
	 * TASK_CREATER_ID: 任务创建者代号
	 */
	public int getTaskCreaterId() {
		return this.taskCreaterId;
	}
	
	/**
	 * TASK_CREATER_ID: 任务创建者代号
	 */
	public void setTaskCreaterId(int value)
	 {
		this.taskCreaterId = value;
	}
	
	/**
	 * TASK_MANAGER_ID: 任务管理员代号
	 */
	public int getTaskManagerId() {
		return this.taskManagerId;
	}
	
	/**
	 * TASK_MANAGER_ID: 任务管理员代号
	 */
	public void setTaskManagerId(int value)
	 {
		this.taskManagerId = value;
	}
	
	/**
	 * TASK_MODIFIER_ID: 任务修改者代号
	 */
	public int getTaskModifierId() {
		return this.taskModifierId;
	}
	
	/**
	 * TASK_MODIFIER_ID: 任务修改者代号
	 */
	public void setTaskModifierId(int value)
	 {
		this.taskModifierId = value;
	}
	
	/**
	 * TASK_OUTLINE: 任务大纲
	 */
	public String getTaskOutline() {
		return this.taskOutline;
	}
	
	/**
	 * TASK_OUTLINE: 任务大纲
	 */
	public void setTaskOutline(String value)
	 {
		this.taskOutline = value;
	}
	
	/**
	 * TASK_COMPLETE: 任务完成度
	 */
	public byte getTaskComplete() {
		return this.taskComplete;
	}
	
	/**
	 * TASK_COMPLETE: 任务完成度
	 */
	public void setTaskComplete(byte value)
	 {
		this.taskComplete = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_TASK].[TASK_ID], [T_TASK].[ACTUAL_WORK_TIME], [T_TASK].[AUDIT_WORK_TIME], [T_TASK].[CREATE_TIME], [T_TASK].[ESTIMATE_WORK_TIME], [T_TASK].[MODIFY_TIME], [T_TASK].[ORDER_FIELD], [T_TASK].[TASK_ACTUAL_END_DATE], [T_TASK].[TASK_ACTUAL_START_DATE], [T_TASK].[TASK_DESC], [T_TASK].[TASK_LEVEL], [T_TASK].[TASK_NAME], [T_TASK].[TASK_PLAN_END_DATE], [T_TASK].[TASK_PLAN_START_DATE], [T_TASK].[TASK_STATE], [T_TASK].[TASK_PARENT_ID], [T_TASK].[TASK_PROJECT_ID], [T_TASK].[TASK_CREATER_ID], [T_TASK].[TASK_MANAGER_ID], [T_TASK].[TASK_MODIFIER_ID], [T_TASK].[TASK_OUTLINE], [T_TASK].[TASK_COMPLETE]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_TASK].[TASK_ID], [T_TASK].[ACTUAL_WORK_TIME], [T_TASK].[AUDIT_WORK_TIME], [T_TASK].[CREATE_TIME], [T_TASK].[ESTIMATE_WORK_TIME], [T_TASK].[MODIFY_TIME], [T_TASK].[ORDER_FIELD], [T_TASK].[TASK_ACTUAL_END_DATE], [T_TASK].[TASK_ACTUAL_START_DATE], [T_TASK].[TASK_DESC], [T_TASK].[TASK_LEVEL], [T_TASK].[TASK_NAME], [T_TASK].[TASK_PLAN_END_DATE], [T_TASK].[TASK_PLAN_START_DATE], [T_TASK].[TASK_STATE], [T_TASK].[TASK_PARENT_ID], [T_TASK].[TASK_PROJECT_ID], [T_TASK].[TASK_CREATER_ID], [T_TASK].[TASK_MANAGER_ID], [T_TASK].[TASK_MODIFIER_ID], [T_TASK].[TASK_OUTLINE], [T_TASK].[TASK_COMPLETE]   from [T_TASK] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_TASK].[TASK_ID], [T_TASK].[ACTUAL_WORK_TIME], [T_TASK].[AUDIT_WORK_TIME], [T_TASK].[CREATE_TIME], [T_TASK].[ESTIMATE_WORK_TIME], [T_TASK].[MODIFY_TIME], [T_TASK].[ORDER_FIELD], [T_TASK].[TASK_ACTUAL_END_DATE], [T_TASK].[TASK_ACTUAL_START_DATE], [T_TASK].[TASK_DESC], [T_TASK].[TASK_LEVEL], [T_TASK].[TASK_NAME], [T_TASK].[TASK_PLAN_END_DATE], [T_TASK].[TASK_PLAN_START_DATE], [T_TASK].[TASK_STATE], [T_TASK].[TASK_PARENT_ID], [T_TASK].[TASK_PROJECT_ID], [T_TASK].[TASK_CREATER_ID], [T_TASK].[TASK_MANAGER_ID], [T_TASK].[TASK_MODIFIER_ID], [T_TASK].[TASK_OUTLINE], [T_TASK].[TASK_COMPLETE] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_TASK";
	}
	
	
	public String getTableName() {
		return "T_TASK";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "TASK_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.taskId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (Task.class.isInstance(obj)) {
			Task o = ((Task)(obj));
			this.taskId = o.taskId;
			this.actualWorkTime = o.actualWorkTime;
			this.auditWorkTime = o.auditWorkTime;
			this.createTime = o.createTime;
			this.estimateWorkTime = o.estimateWorkTime;
			this.modifyTime = o.modifyTime;
			this.orderField = o.orderField;
			this.taskActualEndDate = o.taskActualEndDate;
			this.taskActualStartDate = o.taskActualStartDate;
			this.taskDesc = o.taskDesc;
			this.taskLevel = o.taskLevel;
			this.taskName = o.taskName;
			this.taskPlanEndDate = o.taskPlanEndDate;
			this.taskPlanStartDate = o.taskPlanStartDate;
			this.taskState = o.taskState;
			this.taskParentId = o.taskParentId;
			this.taskProjectId = o.taskProjectId;
			this.taskCreaterId = o.taskCreaterId;
			this.taskManagerId = o.taskManagerId;
			this.taskModifierId = o.taskModifierId;
			this.taskOutline = o.taskOutline;
			this.taskComplete = o.taskComplete;
		}
	}
	
	/**
	 * 插入Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="task">需要插入的任务表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, Task task) throws SQLException, DbException {
		String sql = "insert into [T_TASK](";
		if ((task.getTaskId() > 0)) {
			sql = (sql + "[TASK_ID], ");
		}
		sql = (sql + "[ACTUAL_WORK_TIME]");
		sql = (sql + ", [AUDIT_WORK_TIME]");
		sql = (sql + ", [CREATE_TIME]");
		sql = (sql + ", [ESTIMATE_WORK_TIME]");
		sql = (sql + ", [MODIFY_TIME]");
		sql = (sql + ", [ORDER_FIELD]");
		sql = (sql + ", [TASK_ACTUAL_END_DATE]");
		sql = (sql + ", [TASK_ACTUAL_START_DATE]");
		sql = (sql + ", [TASK_DESC]");
		sql = (sql + ", [TASK_LEVEL]");
		sql = (sql + ", [TASK_NAME]");
		sql = (sql + ", [TASK_PLAN_END_DATE]");
		sql = (sql + ", [TASK_PLAN_START_DATE]");
		sql = (sql + ", [TASK_STATE]");
		sql = (sql + ", [TASK_PARENT_ID]");
		sql = (sql + ", [TASK_PROJECT_ID]");
		sql = (sql + ", [TASK_CREATER_ID]");
		sql = (sql + ", [TASK_MANAGER_ID]");
		sql = (sql + ", [TASK_MODIFIER_ID]");
		sql = (sql + ", [TASK_OUTLINE]");
		sql = (sql + ", [TASK_COMPLETE]");
		sql = (sql + ")values(");
		if ((task.getTaskId() > 0)) {
			sql = (sql + task.getTaskId());
			sql = (sql + ", ");
		}
		if ((task.actualWorkTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + task.getActualWorkTime());
		}
		sql = (sql + ", ");
		if ((task.auditWorkTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + task.getAuditWorkTime());
		}
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(task.getCreateTime()));
		sql = (sql + ", ");
		sql = (sql + task.getEstimateWorkTime());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(task.getModifyTime()));
		sql = (sql + ", ");
		if ((task.orderField == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(task.getOrderField()));
		}
		sql = (sql + ", ");
		if ((task.taskActualEndDate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(task.getTaskActualEndDate()));
		}
		sql = (sql + ", ");
		if ((task.taskActualStartDate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(task.getTaskActualStartDate()));
		}
		sql = (sql + ", ");
		if ((task.taskDesc == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(task.getTaskDesc().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + task.getTaskLevel());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(task.getTaskName().toString()));
		sql = (sql + ", ");
		if ((task.taskPlanEndDate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(task.getTaskPlanEndDate()));
		}
		sql = (sql + ", ");
		if ((task.taskPlanStartDate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.getDateSql(task.getTaskPlanStartDate()));
		}
		sql = (sql + ", ");
		sql = (sql + task.getTaskState());
		sql = (sql + ", ");
		if ((task.taskParentId == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + task.getTaskParentId());
		}
		sql = (sql + ", ");
		sql = (sql + task.getTaskProjectId());
		sql = (sql + ", ");
		sql = (sql + task.getTaskCreaterId());
		sql = (sql + ", ");
		sql = (sql + task.getTaskManagerId());
		sql = (sql + ", ");
		sql = (sql + task.getTaskModifierId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(task.getTaskOutline().toString()));
		sql = (sql + ", ");
		sql = (sql + task.getTaskComplete());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((task.getTaskId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_TASK] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_TASK off");
			}
			dataVisit.execSql(sql);
			if ((task.getTaskId() == 0)) {
				task.taskId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		Task.insert(dataVisit, this);
	}
	
	/**
	 * 更新Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="task">需要更新的任务表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Task task, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_TASK] set ";
		if ((task.actualWorkTime == null)) {
			sql = (sql + "[ACTUAL_WORK_TIME] = default ,");
		}
		else {
			sql = (sql + "[ACTUAL_WORK_TIME] = ");
			sql = (sql + task.getActualWorkTime());
			sql = (sql + ",");
		}
		if ((task.auditWorkTime == null)) {
			sql = (sql + "[AUDIT_WORK_TIME] = default ,");
		}
		else {
			sql = (sql + "[AUDIT_WORK_TIME] = ");
			sql = (sql + task.getAuditWorkTime());
			sql = (sql + ",");
		}
		sql = (sql + "[CREATE_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(task.getCreateTime()));
		sql = (sql + ",");
		sql = (sql + "[ESTIMATE_WORK_TIME] = ");
		sql = (sql + task.getEstimateWorkTime());
		sql = (sql + ",");
		sql = (sql + "[MODIFY_TIME] = ");
		sql = (sql + SqlServerUtils.getDateSql(task.getModifyTime()));
		sql = (sql + ",");
		if ((task.orderField == null)) {
			sql = (sql + "[ORDER_FIELD] = default ,");
		}
		else {
			sql = (sql + "[ORDER_FIELD] = ");
			sql = (sql + SqlServerUtils.getDateSql(task.getOrderField()));
			sql = (sql + ",");
		}
		if ((task.taskActualEndDate == null)) {
			sql = (sql + "[TASK_ACTUAL_END_DATE] = default ,");
		}
		else {
			sql = (sql + "[TASK_ACTUAL_END_DATE] = ");
			sql = (sql + SqlServerUtils.getDateSql(task.getTaskActualEndDate()));
			sql = (sql + ",");
		}
		if ((task.taskActualStartDate == null)) {
			sql = (sql + "[TASK_ACTUAL_START_DATE] = default ,");
		}
		else {
			sql = (sql + "[TASK_ACTUAL_START_DATE] = ");
			sql = (sql + SqlServerUtils.getDateSql(task.getTaskActualStartDate()));
			sql = (sql + ",");
		}
		if ((task.taskDesc == null)) {
			sql = (sql + "[TASK_DESC] = default ,");
		}
		else {
			sql = (sql + "[TASK_DESC] = ");
			sql = (sql + SqlServerUtils.safeSql(task.getTaskDesc().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[TASK_LEVEL] = ");
		sql = (sql + task.getTaskLevel());
		sql = (sql + ",");
		sql = (sql + "[TASK_NAME] = ");
		sql = (sql + SqlServerUtils.safeSql(task.getTaskName().toString()));
		sql = (sql + ",");
		if ((task.taskPlanEndDate == null)) {
			sql = (sql + "[TASK_PLAN_END_DATE] = default ,");
		}
		else {
			sql = (sql + "[TASK_PLAN_END_DATE] = ");
			sql = (sql + SqlServerUtils.getDateSql(task.getTaskPlanEndDate()));
			sql = (sql + ",");
		}
		if ((task.taskPlanStartDate == null)) {
			sql = (sql + "[TASK_PLAN_START_DATE] = default ,");
		}
		else {
			sql = (sql + "[TASK_PLAN_START_DATE] = ");
			sql = (sql + SqlServerUtils.getDateSql(task.getTaskPlanStartDate()));
			sql = (sql + ",");
		}
		sql = (sql + "[TASK_STATE] = ");
		sql = (sql + task.getTaskState());
		sql = (sql + ",");
		if ((task.taskParentId == null)) {
			sql = (sql + "[TASK_PARENT_ID] = default ,");
		}
		else {
			sql = (sql + "[TASK_PARENT_ID] = ");
			sql = (sql + task.getTaskParentId());
			sql = (sql + ",");
		}
		sql = (sql + "[TASK_PROJECT_ID] = ");
		sql = (sql + task.getTaskProjectId());
		sql = (sql + ",");
		sql = (sql + "[TASK_CREATER_ID] = ");
		sql = (sql + task.getTaskCreaterId());
		sql = (sql + ",");
		sql = (sql + "[TASK_MANAGER_ID] = ");
		sql = (sql + task.getTaskManagerId());
		sql = (sql + ",");
		sql = (sql + "[TASK_MODIFIER_ID] = ");
		sql = (sql + task.getTaskModifierId());
		sql = (sql + ",");
		sql = (sql + "[TASK_OUTLINE] = ");
		sql = (sql + SqlServerUtils.safeSql(task.getTaskOutline().toString()));
		sql = (sql + ",");
		sql = (sql + "[TASK_COMPLETE] = ");
		sql = (sql + task.getTaskComplete());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "TASK_ID = ");
		sql = (sql + task.getTaskId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="task">需要更新的任务表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, Task task) throws SQLException, DbException {
		return Task.update(dataVisit, task, "");
	}
	
	/**
	 * 更新Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return Task.update(dataVisit, this);
	}
	
	/**
	 * 更新Task对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return Task.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.taskName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<Task> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<Task> list = new ArrayList<Task>();
		try {
			for (; reader.next(); ) {
				Task obj = new Task();
				Task.readValue(reader, obj);
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
	public static List<Task> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<Task> list = new ArrayList<Task>();
		try {
			for (; reader.next(); ) {
				Task obj = new Task();
				Task.readValue(reader, obj);
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
	public static List<Task> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Task.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<Task> list = new ArrayList<Task>();
		try {
			for (; reader.next(); ) {
				Task obj = new Task();
				Task.readValue(reader, obj);
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
	public static List<Task> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((Task.getFullSelectSql() + appendConditionSql));
		List<Task> list = new ArrayList<Task>();
		try {
			for (; reader.next(); ) {
				Task obj = new Task();
				Task.readValue(reader, obj);
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
	public static <T extends Task> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Task.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Task.readValue(reader, obj);
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
public static <T extends Task> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((Task.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			Task.readValue(reader, obj);
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
	String sql = "select * from T_TASK ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据任务代号查询Task
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskId">任务代号</param>
 */
public static Task selectByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "TASK_ID = ");
	sql = (sql + ATaskId);
	List<Task> list = Task.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskId">任务代号</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByTaskId(IDataVisit2 dataVisit, int ATaskId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_TASK] where ");
	sql = (sql + "TASK_ID = ");
	sql = (sql + ATaskId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="ATaskId">任务代号</param>
 */
public static void deleteByTaskId(IDataVisit2 dataVisit, int ATaskId) throws SQLException, DbException {
	Task.deleteByTaskId(dataVisit, ATaskId, "");
}

/**
 * 根据外键任务工程代号删除一批Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskProjectId">任务工程代号</param>
 */
public static void deleteListByTaskProjectId(IDataVisit2 dataVisit, int ATaskProjectId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TASK] where ");
	sql = (sql + "TASK_PROJECT_ID = ");
	sql = (sql + ATaskProjectId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键父任务代号删除一批Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskParentId">父任务代号</param>
 */
public static void deleteListByTaskParentId(IDataVisit2 dataVisit, Integer ATaskParentId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TASK] where ");
	sql = (sql + "TASK_PARENT_ID = ");
	sql = (sql + ATaskParentId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键任务修改者代号删除一批Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskModifierId">任务修改者代号</param>
 */
public static void deleteListByTaskModifierId(IDataVisit2 dataVisit, int ATaskModifierId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TASK] where ");
	sql = (sql + "TASK_MODIFIER_ID = ");
	sql = (sql + ATaskModifierId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键任务管理员代号删除一批Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskManagerId">任务管理员代号</param>
 */
public static void deleteListByTaskManagerId(IDataVisit2 dataVisit, int ATaskManagerId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TASK] where ");
	sql = (sql + "TASK_MANAGER_ID = ");
	sql = (sql + ATaskManagerId);
	dataVisit.execSql(sql);
}

/**
 * 根据外键任务创建者代号删除一批Task对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskCreaterId">任务创建者代号</param>
 */
public static void deleteListByTaskCreaterId(IDataVisit2 dataVisit, int ATaskCreaterId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_TASK] where ");
	sql = (sql + "TASK_CREATER_ID = ");
	sql = (sql + ATaskCreaterId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskProjectId">任务工程代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskProjectId(IDataVisit2 dataVisit, int ATaskProjectId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_PROJECT_ID = ";
	sql = (sql + ATaskProjectId);
	sql = (sql + appendConditionSql);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskProjectId">任务工程代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskProjectId(IDataVisit2 dataVisit, int ATaskProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_PROJECT_ID = ";
	sql = (sql + ATaskProjectId);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskProjectId">任务工程代号</param>
 */
public static List<Task> selectObjectsByTaskProjectId(IDataVisit2 dataVisit, int ATaskProjectId) throws SQLException, DbException {
	String sql = " where TASK_PROJECT_ID = ";
	sql = (sql + ATaskProjectId);
	return Task.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskParentId">父任务代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskParentId(IDataVisit2 dataVisit, Integer ATaskParentId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_PARENT_ID = ";
	sql = (sql + ATaskParentId);
	sql = (sql + appendConditionSql);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskParentId">父任务代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskParentId(IDataVisit2 dataVisit, Integer ATaskParentId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_PARENT_ID = ";
	sql = (sql + ATaskParentId);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskParentId">父任务代号</param>
 */
public static List<Task> selectObjectsByTaskParentId(IDataVisit2 dataVisit, Integer ATaskParentId) throws SQLException, DbException {
	String sql = " where TASK_PARENT_ID = ";
	sql = (sql + ATaskParentId);
	return Task.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskModifierId">任务修改者代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskModifierId(IDataVisit2 dataVisit, int ATaskModifierId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_MODIFIER_ID = ";
	sql = (sql + ATaskModifierId);
	sql = (sql + appendConditionSql);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskModifierId">任务修改者代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskModifierId(IDataVisit2 dataVisit, int ATaskModifierId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_MODIFIER_ID = ";
	sql = (sql + ATaskModifierId);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskModifierId">任务修改者代号</param>
 */
public static List<Task> selectObjectsByTaskModifierId(IDataVisit2 dataVisit, int ATaskModifierId) throws SQLException, DbException {
	String sql = " where TASK_MODIFIER_ID = ";
	sql = (sql + ATaskModifierId);
	return Task.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskManagerId">任务管理员代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskManagerId(IDataVisit2 dataVisit, int ATaskManagerId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_MANAGER_ID = ";
	sql = (sql + ATaskManagerId);
	sql = (sql + appendConditionSql);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskManagerId">任务管理员代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskManagerId(IDataVisit2 dataVisit, int ATaskManagerId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_MANAGER_ID = ";
	sql = (sql + ATaskManagerId);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskManagerId">任务管理员代号</param>
 */
public static List<Task> selectObjectsByTaskManagerId(IDataVisit2 dataVisit, int ATaskManagerId) throws SQLException, DbException {
	String sql = " where TASK_MANAGER_ID = ";
	sql = (sql + ATaskManagerId);
	return Task.selectObjects(dataVisit, sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskCreaterId">任务创建者代号</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskCreaterId(IDataVisit2 dataVisit, int ATaskCreaterId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_CREATER_ID = ";
	sql = (sql + ATaskCreaterId);
	sql = (sql + appendConditionSql);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskCreaterId">任务创建者代号</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<Task> selectObjectsByTaskCreaterId(IDataVisit2 dataVisit, int ATaskCreaterId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where TASK_CREATER_ID = ";
	sql = (sql + ATaskCreaterId);
	return Task.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="TaskCreaterId">任务创建者代号</param>
 */
public static List<Task> selectObjectsByTaskCreaterId(IDataVisit2 dataVisit, int ATaskCreaterId) throws SQLException, DbException {
	String sql = " where TASK_CREATER_ID = ";
	sql = (sql + ATaskCreaterId);
	return Task.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象task中
 * <param name="reader">数据源</param>
 * <param name="task">目标对象</param>
 */
public static void readValue(ResultSet reader, Task task) throws SQLException, DbException {
	task.taskId = reader.getInt(1);
	task.actualWorkTime = reader.getDouble(2);
	if (reader.wasNull()) {
		task.actualWorkTime = null;
	}
	task.auditWorkTime = reader.getDouble(3);
	if (reader.wasNull()) {
		task.auditWorkTime = null;
	}
	task.createTime = SqlUtils.getDate(reader, 4);
	task.estimateWorkTime = reader.getDouble(5);
	task.modifyTime = SqlUtils.getDate(reader, 6);
	task.orderField = SqlUtils.getDate(reader, 7);
	if (reader.wasNull()) {
		task.orderField = null;
	}
	task.taskActualEndDate = SqlUtils.getDate(reader, 8);
	if (reader.wasNull()) {
		task.taskActualEndDate = null;
	}
	task.taskActualStartDate = SqlUtils.getDate(reader, 9);
	if (reader.wasNull()) {
		task.taskActualStartDate = null;
	}
	task.taskDesc = reader.getString(10);
	if (reader.wasNull()) {
		task.taskDesc = null;
	}
	task.taskLevel = reader.getInt(11);
	task.taskName = reader.getString(12);
	task.taskPlanEndDate = SqlUtils.getDate(reader, 13);
	if (reader.wasNull()) {
		task.taskPlanEndDate = null;
	}
	task.taskPlanStartDate = SqlUtils.getDate(reader, 14);
	if (reader.wasNull()) {
		task.taskPlanStartDate = null;
	}
	task.taskState = reader.getInt(15);
	task.taskParentId = reader.getInt(16);
	if (reader.wasNull()) {
		task.taskParentId = null;
	}
	task.taskProjectId = reader.getInt(17);
	task.taskCreaterId = reader.getInt(18);
	task.taskManagerId = reader.getInt(19);
	task.taskModifierId = reader.getInt(20);
	task.taskOutline = reader.getString(21);
	task.taskComplete = reader.getByte(22);
}
}
