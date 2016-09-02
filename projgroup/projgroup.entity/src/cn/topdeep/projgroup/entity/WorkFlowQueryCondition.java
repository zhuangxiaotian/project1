package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_WORK_FLOW查询条件定义
 */
public class WorkFlowQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowId;
	
	/**
	 * 查询条件字符串相等,WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	String workFlowIdEqual;
	
	/**
	 * 查询条件,WORK_FLOW_TYPE: 工作流类型
	 */
	Integer workFlowType;
	
	/**
	 * 查询条件开始值,WORK_FLOW_TYPE: 工作流类型
	 */
	Integer workFlowTypeBegin;
	
	/**
	 * 查询条件结束值,WORK_FLOW_TYPE: 工作流类型
	 */
	Integer workFlowTypeEnd;
	
	/**
	 * 查询条件结束值,WORK_FLOW_TYPE: 工作流类型
	 */
	Integer workFlowTypeEndEqual;
	
	/**
	 * 查询条件,CREATOR: 创建人
	 */
	Integer creator;
	
	/**
	 * 查询条件开始值,CREATOR: 创建人
	 */
	Integer creatorBegin;
	
	/**
	 * 查询条件结束值,CREATOR: 创建人
	 */
	Integer creatorEnd;
	
	/**
	 * 查询条件结束值,CREATOR: 创建人
	 */
	Integer creatorEndEqual;
	
	/**
	 * 查询条件,PROCESS_ID: 流程实例ID
	 */
	String processId;
	
	/**
	 * 查询条件字符串相等,PROCESS_ID: 流程实例ID
	 */
	String processIdEqual;
	
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
	 * WORK_FLOW_TYPE: 工作流类型
	 */
	public Integer getWorkFlowType() {
		return this.workFlowType;
	}
	
	/**
	 * WORK_FLOW_TYPE: 工作流类型
	 */
	public void setWorkFlowType(Integer value)
	 {
		this.workFlowType = value;
	}
	
	/**
	 * 查询条件开始值,WORK_FLOW_TYPE: 工作流类型
	 */
	public Integer getWorkFlowTypeBegin() {
		return this.workFlowTypeBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_FLOW_TYPE: 工作流类型
	 */
	public void setWorkFlowTypeBegin(Integer value)
	 {
		this.workFlowTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_FLOW_TYPE: 工作流类型
	 */
	public Integer getWorkFlowTypeEnd() {
		return this.workFlowTypeEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_FLOW_TYPE: 工作流类型
	 */
	public void setWorkFlowTypeEnd(Integer value)
	 {
		this.workFlowTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_FLOW_TYPE: 工作流类型
	 */
	public Integer getWorkFlowTypeEndEqual() {
		return this.workFlowTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_FLOW_TYPE: 工作流类型
	 */
	public void setWorkFlowTypeEndEqual(Integer value)
	 {
		this.workFlowTypeEndEqual = value;
	}
	
	/**
	 * CREATOR: 创建人
	 */
	public Integer getCreator() {
		return this.creator;
	}
	
	/**
	 * CREATOR: 创建人
	 */
	public void setCreator(Integer value)
	 {
		this.creator = value;
	}
	
	/**
	 * 查询条件开始值,CREATOR: 创建人
	 */
	public Integer getCreatorBegin() {
		return this.creatorBegin;
	}
	
	/**
	 * 查询条件开始值,CREATOR: 创建人
	 */
	public void setCreatorBegin(Integer value)
	 {
		this.creatorBegin = value;
	}
	
	/**
	 * 查询条件结束值,CREATOR: 创建人
	 */
	public Integer getCreatorEnd() {
		return this.creatorEnd;
	}
	
	/**
	 * 查询条件结束值,CREATOR: 创建人
	 */
	public void setCreatorEnd(Integer value)
	 {
		this.creatorEnd = value;
	}
	
	/**
	 * 查询条件结束值,CREATOR: 创建人
	 */
	public Integer getCreatorEndEqual() {
		return this.creatorEndEqual;
	}
	
	/**
	 * 查询条件结束值,CREATOR: 创建人
	 */
	public void setCreatorEndEqual(Integer value)
	 {
		this.creatorEndEqual = value;
	}
	
	/**
	 * PROCESS_ID: 流程实例ID
	 */
	public String getProcessId() {
		return this.processId;
	}
	
	/**
	 * PROCESS_ID: 流程实例ID
	 */
	public void setProcessId(String value)
	 {
		this.processId = value;
	}
	
	/**
	 * 查询条件字符串相等,PROCESS_ID: 流程实例ID
	 */
	public String getProcessIdEqual() {
		return this.processIdEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROCESS_ID: 流程实例ID
	 */
	public void setProcessIdEqual(String value)
	 {
		this.processIdEqual = value;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public WorkFlowQueryCondition setWorkFlowIdCondition(String value) {
		this.workFlowId = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_ID: 工作流ID,关联JBPM
	 */
	public WorkFlowQueryCondition setWorkFlowIdConditionEqual(String value) {
		this.workFlowIdEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_TYPE: 工作流类型
	 */
	public WorkFlowQueryCondition setWorkFlowTypeCondition(Integer value) {
		this.workFlowType = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_TYPE: 工作流类型
	 */
	public WorkFlowQueryCondition setWorkFlowTypeConditionBegin(Integer value) {
		this.workFlowTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_TYPE: 工作流类型
	 */
	public WorkFlowQueryCondition setWorkFlowTypeConditionEnd(Integer value) {
		this.workFlowTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_FLOW_TYPE: 工作流类型
	 */
	public WorkFlowQueryCondition setWorkFlowTypeConditionEndEqual(Integer value) {
		this.workFlowTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATOR: 创建人
	 */
	public WorkFlowQueryCondition setCreatorCondition(Integer value) {
		this.creator = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATOR: 创建人
	 */
	public WorkFlowQueryCondition setCreatorConditionBegin(Integer value) {
		this.creatorBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATOR: 创建人
	 */
	public WorkFlowQueryCondition setCreatorConditionEnd(Integer value) {
		this.creatorEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CREATOR: 创建人
	 */
	public WorkFlowQueryCondition setCreatorConditionEndEqual(Integer value) {
		this.creatorEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCESS_ID: 流程实例ID
	 */
	public WorkFlowQueryCondition setProcessIdCondition(String value) {
		this.processId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROCESS_ID: 流程实例ID
	 */
	public WorkFlowQueryCondition setProcessIdConditionEqual(String value) {
		this.processIdEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if (StringUtils.isNullOrEmpty(this.workFlowId)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_WORK_FLOW].[WORK_FLOW_ID]", this.workFlowId)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.workFlowIdEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_WORK_FLOW].[WORK_FLOW_ID] = " + SqlServerUtils.safeSql(this.workFlowIdEqual))) 
						+ ") "));
		}
		if ((this.workFlowType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_FLOW].[WORK_FLOW_TYPE] = " + this.workFlowType) 
						+ ") "));
		}
		if ((this.workFlowTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_FLOW].[WORK_FLOW_TYPE] >= " 
						+ (this.workFlowTypeBegin + ")")));
		}
		if ((this.workFlowTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_FLOW].[WORK_FLOW_TYPE] < " 
						+ (this.workFlowTypeEnd + ") ")));
		}
		if ((this.workFlowTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_FLOW].[WORK_FLOW_TYPE] <= " 
						+ (this.workFlowTypeEndEqual + ") ")));
		}
		if ((this.creator == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_WORK_FLOW].[CREATOR] = " + this.creator) 
						+ ") "));
		}
		if ((this.creatorBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_FLOW].[CREATOR] >= " 
						+ (this.creatorBegin + ")")));
		}
		if ((this.creatorEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_FLOW].[CREATOR] < " 
						+ (this.creatorEnd + ") ")));
		}
		if ((this.creatorEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_WORK_FLOW].[CREATOR] <= " 
						+ (this.creatorEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.processId)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_WORK_FLOW].[PROCESS_ID]", this.processId)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.processIdEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_WORK_FLOW].[PROCESS_ID] = " + SqlServerUtils.safeSql(this.processIdEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
