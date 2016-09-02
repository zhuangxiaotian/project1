package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * WORK_FLOW_MEMO查询条件定义
 */
public class WorkFlowMemoQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,WORK_FLOW_MEMO_ID: 标识
	 */
	Integer workFlowMemoId;
	
	/**
	 * 查询条件开始值,WORK_FLOW_MEMO_ID: 标识
	 */
	Integer workFlowMemoIdBegin;
	
	/**
	 * 查询条件结束值,WORK_FLOW_MEMO_ID: 标识
	 */
	Integer workFlowMemoIdEnd;
	
	/**
	 * 查询条件结束值,WORK_FLOW_MEMO_ID: 标识
	 */
	Integer workFlowMemoIdEndEqual;
	
	/**
	 * 查询条件,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowId;
	
	/**
	 * 查询条件字符串相等,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowIdEqual;
	
	/**
	 * 查询条件,MEMO_USER_ID: 用户代号
	 */
	Integer memoUserId;
	
	/**
	 * 查询条件开始值,MEMO_USER_ID: 用户代号
	 */
	Integer memoUserIdBegin;
	
	/**
	 * 查询条件结束值,MEMO_USER_ID: 用户代号
	 */
	Integer memoUserIdEnd;
	
	/**
	 * 查询条件结束值,MEMO_USER_ID: 用户代号
	 */
	Integer memoUserIdEndEqual;
	
	/**
	 * 查询条件,MEMO_TIME: 备注时间
	 */
	java.util.Date memoTime;
	
	/**
	 * 查询条件开始值,MEMO_TIME: 备注时间
	 */
	java.util.Date memoTimeBegin;
	
	/**
	 * 查询条件结束值,MEMO_TIME: 备注时间
	 */
	java.util.Date memoTimeEnd;
	
	/**
	 * 查询条件结束值,MEMO_TIME: 备注时间
	 */
	java.util.Date memoTimeEndEqual;
	
	/**
	 * 查询条件,MEMO_CONTENT: 备注内容
	 */
	String memoContent;
	
	/**
	 * 查询条件字符串相等,MEMO_CONTENT: 备注内容
	 */
	String memoContentEqual;
	
	/**
	 * WORK_FLOW_MEMO_ID: 标识
	 */
	public Integer getWorkFlowMemoId() {
		return this.workFlowMemoId;
	}
	
	/**
	 * WORK_FLOW_MEMO_ID: 标识
	 */
	public void setWorkFlowMemoId(Integer value)
	 {
		this.workFlowMemoId = value;
	}
	
	/**
	 * 查询条件开始值,WORK_FLOW_MEMO_ID: 标识
	 */
	public Integer getWorkFlowMemoIdBegin() {
		return this.workFlowMemoIdBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_FLOW_MEMO_ID: 标识
	 */
	public void setWorkFlowMemoIdBegin(Integer value)
	 {
		this.workFlowMemoIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_FLOW_MEMO_ID: 标识
	 */
	public Integer getWorkFlowMemoIdEnd() {
		return this.workFlowMemoIdEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_FLOW_MEMO_ID: 标识
	 */
	public void setWorkFlowMemoIdEnd(Integer value)
	 {
		this.workFlowMemoIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_FLOW_MEMO_ID: 标识
	 */
	public Integer getWorkFlowMemoIdEndEqual() {
		return this.workFlowMemoIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_FLOW_MEMO_ID: 标识
	 */
	public void setWorkFlowMemoIdEndEqual(Integer value)
	 {
		this.workFlowMemoIdEndEqual = value;
	}
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public String getWorkFlowId() {
		return this.workFlowId;
	}
	
	/**
	 * WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public void setWorkFlowId(String value)
	 {
		this.workFlowId = value;
	}
	
	/**
	 * 查询条件字符串相等,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public String getWorkFlowIdEqual() {
		return this.workFlowIdEqual;
	}
	
	/**
	 * 查询条件字符串相等,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public void setWorkFlowIdEqual(String value)
	 {
		this.workFlowIdEqual = value;
	}
	
	/**
	 * MEMO_USER_ID: 用户代号
	 */
	public Integer getMemoUserId() {
		return this.memoUserId;
	}
	
	/**
	 * MEMO_USER_ID: 用户代号
	 */
	public void setMemoUserId(Integer value)
	 {
		this.memoUserId = value;
	}
	
	/**
	 * 查询条件开始值,MEMO_USER_ID: 用户代号
	 */
	public Integer getMemoUserIdBegin() {
		return this.memoUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,MEMO_USER_ID: 用户代号
	 */
	public void setMemoUserIdBegin(Integer value)
	 {
		this.memoUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,MEMO_USER_ID: 用户代号
	 */
	public Integer getMemoUserIdEnd() {
		return this.memoUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,MEMO_USER_ID: 用户代号
	 */
	public void setMemoUserIdEnd(Integer value)
	 {
		this.memoUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,MEMO_USER_ID: 用户代号
	 */
	public Integer getMemoUserIdEndEqual() {
		return this.memoUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,MEMO_USER_ID: 用户代号
	 */
	public void setMemoUserIdEndEqual(Integer value)
	 {
		this.memoUserIdEndEqual = value;
	}
	
	/**
	 * MEMO_TIME: 备注时间
	 */
	public java.util.Date getMemoTime() {
		return this.memoTime;
	}
	
	/**
	 * MEMO_TIME: 备注时间
	 */
	public void setMemoTime(java.util.Date value)
	 {
		this.memoTime = value;
	}
	
	/**
	 * 查询条件开始值,MEMO_TIME: 备注时间
	 */
	public java.util.Date getMemoTimeBegin() {
		return this.memoTimeBegin;
	}
	
	/**
	 * 查询条件开始值,MEMO_TIME: 备注时间
	 */
	public void setMemoTimeBegin(java.util.Date value)
	 {
		this.memoTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,MEMO_TIME: 备注时间
	 */
	public java.util.Date getMemoTimeEnd() {
		return this.memoTimeEnd;
	}
	
	/**
	 * 查询条件结束值,MEMO_TIME: 备注时间
	 */
	public void setMemoTimeEnd(java.util.Date value)
	 {
		this.memoTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,MEMO_TIME: 备注时间
	 */
	public java.util.Date getMemoTimeEndEqual() {
		return this.memoTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,MEMO_TIME: 备注时间
	 */
	public void setMemoTimeEndEqual(java.util.Date value)
	 {
		this.memoTimeEndEqual = value;
	}
	
	/**
	 * MEMO_CONTENT: 备注内容
	 */
	public String getMemoContent() {
		return this.memoContent;
	}
	
	/**
	 * MEMO_CONTENT: 备注内容
	 */
	public void setMemoContent(String value)
	 {
		this.memoContent = value;
	}
	
	/**
	 * 查询条件字符串相等,MEMO_CONTENT: 备注内容
	 */
	public String getMemoContentEqual() {
		return this.memoContentEqual;
	}
	
	/**
	 * 查询条件字符串相等,MEMO_CONTENT: 备注内容
	 */
	public void setMemoContentEqual(String value)
	 {
		this.memoContentEqual = value;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_MEMO_ID: 标识
	 */
	public WorkFlowMemoQueryCondition setWorkFlowMemoIdCondition(Integer value) {
		this.workFlowMemoId = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_MEMO_ID: 标识
	 */
	public WorkFlowMemoQueryCondition setWorkFlowMemoIdConditionBegin(Integer value) {
		this.workFlowMemoIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_MEMO_ID: 标识
	 */
	public WorkFlowMemoQueryCondition setWorkFlowMemoIdConditionEnd(Integer value) {
		this.workFlowMemoIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_MEMO_ID: 标识
	 */
	public WorkFlowMemoQueryCondition setWorkFlowMemoIdConditionEndEqual(Integer value) {
		this.workFlowMemoIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public WorkFlowMemoQueryCondition setWorkFlowIdCondition(String value) {
		this.workFlowId = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public WorkFlowMemoQueryCondition setWorkFlowIdConditionEqual(String value) {
		this.workFlowIdEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_USER_ID: 用户代号
	 */
	public WorkFlowMemoQueryCondition setMemoUserIdCondition(Integer value) {
		this.memoUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_USER_ID: 用户代号
	 */
	public WorkFlowMemoQueryCondition setMemoUserIdConditionBegin(Integer value) {
		this.memoUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_USER_ID: 用户代号
	 */
	public WorkFlowMemoQueryCondition setMemoUserIdConditionEnd(Integer value) {
		this.memoUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_USER_ID: 用户代号
	 */
	public WorkFlowMemoQueryCondition setMemoUserIdConditionEndEqual(Integer value) {
		this.memoUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_TIME: 备注时间
	 */
	public WorkFlowMemoQueryCondition setMemoTimeCondition(java.util.Date value) {
		this.memoTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_TIME: 备注时间
	 */
	public WorkFlowMemoQueryCondition setMemoTimeConditionBegin(java.util.Date value) {
		this.memoTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_TIME: 备注时间
	 */
	public WorkFlowMemoQueryCondition setMemoTimeConditionEnd(java.util.Date value) {
		this.memoTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_TIME: 备注时间
	 */
	public WorkFlowMemoQueryCondition setMemoTimeConditionEndEqual(java.util.Date value) {
		this.memoTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_CONTENT: 备注内容
	 */
	public WorkFlowMemoQueryCondition setMemoContentCondition(String value) {
		this.memoContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件MEMO_CONTENT: 备注内容
	 */
	public WorkFlowMemoQueryCondition setMemoContentConditionEqual(String value) {
		this.memoContentEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.workFlowMemoId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([WORK_FLOW_MEMO].[WORK_FLOW_MEMO_ID] = " + this.workFlowMemoId) 
						+ ") "));
		}
		if ((this.workFlowMemoIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[WORK_FLOW_MEMO_ID] >= " 
						+ (this.workFlowMemoIdBegin + ")")));
		}
		if ((this.workFlowMemoIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[WORK_FLOW_MEMO_ID] < " 
						+ (this.workFlowMemoIdEnd + ") ")));
		}
		if ((this.workFlowMemoIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[WORK_FLOW_MEMO_ID] <= " 
						+ (this.workFlowMemoIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.workFlowId)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[WORK_FLOW_MEMO].[WORK_FLOW_ID]", this.workFlowId)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.workFlowIdEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[WORK_FLOW_MEMO].[WORK_FLOW_ID] = " + SqlServerUtils.safeSql(this.workFlowIdEqual))) 
						+ ") "));
		}
		if ((this.memoUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([WORK_FLOW_MEMO].[MEMO_USER_ID] = " + this.memoUserId) 
						+ ") "));
		}
		if ((this.memoUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[MEMO_USER_ID] >= " 
						+ (this.memoUserIdBegin + ")")));
		}
		if ((this.memoUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[MEMO_USER_ID] < " 
						+ (this.memoUserIdEnd + ") ")));
		}
		if ((this.memoUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[MEMO_USER_ID] <= " 
						+ (this.memoUserIdEndEqual + ") ")));
		}
		if ((this.memoTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([WORK_FLOW_MEMO].[MEMO_TIME] = " + SqlServerUtils.getDateSql(this.memoTime)) 
						+ ") "));
		}
		if ((this.memoTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[MEMO_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.memoTimeBegin) + ")")));
		}
		if ((this.memoTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[MEMO_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.memoTimeEnd) + ") ")));
		}
		if ((this.memoTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([WORK_FLOW_MEMO].[MEMO_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.memoTimeEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.memoContent)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[WORK_FLOW_MEMO].[MEMO_CONTENT]", this.memoContent)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.memoContentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[WORK_FLOW_MEMO].[MEMO_CONTENT] = " + SqlServerUtils.safeSql(this.memoContentEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
