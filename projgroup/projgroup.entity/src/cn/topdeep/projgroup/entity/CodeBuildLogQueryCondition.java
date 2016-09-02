package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_CODE_BUILD_LOG查询条件定义
 */
public class CodeBuildLogQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,BUILD_LOG_ID: 构建标识
	 */
	Integer buildLogId;
	
	/**
	 * 查询条件开始值,BUILD_LOG_ID: 构建标识
	 */
	Integer buildLogIdBegin;
	
	/**
	 * 查询条件结束值,BUILD_LOG_ID: 构建标识
	 */
	Integer buildLogIdEnd;
	
	/**
	 * 查询条件结束值,BUILD_LOG_ID: 构建标识
	 */
	Integer buildLogIdEndEqual;
	
	/**
	 * 查询条件,BUILD_ID: 构建标识
	 */
	Integer buildId;
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	Integer buildIdBegin;
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	Integer buildIdEnd;
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	Integer buildIdEndEqual;
	
	/**
	 * 查询条件,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	Integer buildState;
	
	/**
	 * 查询条件开始值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	Integer buildStateBegin;
	
	/**
	 * 查询条件结束值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	Integer buildStateEnd;
	
	/**
	 * 查询条件结束值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	Integer buildStateEndEqual;
	
	/**
	 * 查询条件,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	Integer buildResult;
	
	/**
	 * 查询条件开始值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	Integer buildResultBegin;
	
	/**
	 * 查询条件结束值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	Integer buildResultEnd;
	
	/**
	 * 查询条件结束值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	Integer buildResultEndEqual;
	
	/**
	 * 查询条件,BUILD_MESSAGE: 构建结果提示
	 */
	String buildMessage;
	
	/**
	 * 查询条件字符串相等,BUILD_MESSAGE: 构建结果提示
	 */
	String buildMessageEqual;
	
	/**
	 * 查询条件,BUILD_START_TIME: 构建开始时间
	 */
	java.util.Date buildStartTime;
	
	/**
	 * 查询条件开始值,BUILD_START_TIME: 构建开始时间
	 */
	java.util.Date buildStartTimeBegin;
	
	/**
	 * 查询条件结束值,BUILD_START_TIME: 构建开始时间
	 */
	java.util.Date buildStartTimeEnd;
	
	/**
	 * 查询条件结束值,BUILD_START_TIME: 构建开始时间
	 */
	java.util.Date buildStartTimeEndEqual;
	
	/**
	 * 查询条件,BUILD_END_TIME: 构建结束时间
	 */
	java.util.Date buildEndTime;
	
	/**
	 * 查询条件开始值,BUILD_END_TIME: 构建结束时间
	 */
	java.util.Date buildEndTimeBegin;
	
	/**
	 * 查询条件结束值,BUILD_END_TIME: 构建结束时间
	 */
	java.util.Date buildEndTimeEnd;
	
	/**
	 * 查询条件结束值,BUILD_END_TIME: 构建结束时间
	 */
	java.util.Date buildEndTimeEndEqual;
	
	/**
	 * 查询条件,BUILD_OPERATOR: 构建人
	 */
	String buildOperator;
	
	/**
	 * 查询条件字符串相等,BUILD_OPERATOR: 构建人
	 */
	String buildOperatorEqual;
	
	/**
	 * 查询条件,PUB0: 备用字段1
	 */
	String pub0;
	
	/**
	 * 查询条件字符串相等,PUB0: 备用字段1
	 */
	String pub0Equal;
	
	/**
	 * 查询条件,PUB1: 备用字段2
	 */
	String pub1;
	
	/**
	 * 查询条件字符串相等,PUB1: 备用字段2
	 */
	String pub1Equal;
	
	/**
	 * 查询条件,PUB2: 备用字段3
	 */
	String pub2;
	
	/**
	 * 查询条件字符串相等,PUB2: 备用字段3
	 */
	String pub2Equal;
	
	/**
	 * 查询条件,PUB3: 备用字段4
	 */
	String pub3;
	
	/**
	 * 查询条件字符串相等,PUB3: 备用字段4
	 */
	String pub3Equal;
	
	/**
	 * 查询条件,PUB4: 备用字段5
	 */
	String pub4;
	
	/**
	 * 查询条件字符串相等,PUB4: 备用字段5
	 */
	String pub4Equal;
	
	/**
	 * 查询条件,PUB5: 备用字段6
	 */
	String pub5;
	
	/**
	 * 查询条件字符串相等,PUB5: 备用字段6
	 */
	String pub5Equal;
	
	/**
	 * BUILD_LOG_ID: 构建标识
	 */
	public Integer getBuildLogId() {
		return this.buildLogId;
	}
	
	/**
	 * BUILD_LOG_ID: 构建标识
	 */
	public void setBuildLogId(Integer value)
	 {
		this.buildLogId = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_LOG_ID: 构建标识
	 */
	public Integer getBuildLogIdBegin() {
		return this.buildLogIdBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_LOG_ID: 构建标识
	 */
	public void setBuildLogIdBegin(Integer value)
	 {
		this.buildLogIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_LOG_ID: 构建标识
	 */
	public Integer getBuildLogIdEnd() {
		return this.buildLogIdEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_LOG_ID: 构建标识
	 */
	public void setBuildLogIdEnd(Integer value)
	 {
		this.buildLogIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_LOG_ID: 构建标识
	 */
	public Integer getBuildLogIdEndEqual() {
		return this.buildLogIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_LOG_ID: 构建标识
	 */
	public void setBuildLogIdEndEqual(Integer value)
	 {
		this.buildLogIdEndEqual = value;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public Integer getBuildId() {
		return this.buildId;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public void setBuildId(Integer value)
	 {
		this.buildId = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdBegin() {
		return this.buildIdBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	public void setBuildIdBegin(Integer value)
	 {
		this.buildIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdEnd() {
		return this.buildIdEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public void setBuildIdEnd(Integer value)
	 {
		this.buildIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdEndEqual() {
		return this.buildIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public void setBuildIdEndEqual(Integer value)
	 {
		this.buildIdEndEqual = value;
	}
	
	/**
	 * BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public Integer getBuildState() {
		return this.buildState;
	}
	
	/**
	 * BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public void setBuildState(Integer value)
	 {
		this.buildState = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public Integer getBuildStateBegin() {
		return this.buildStateBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public void setBuildStateBegin(Integer value)
	 {
		this.buildStateBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public Integer getBuildStateEnd() {
		return this.buildStateEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public void setBuildStateEnd(Integer value)
	 {
		this.buildStateEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public Integer getBuildStateEndEqual() {
		return this.buildStateEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public void setBuildStateEndEqual(Integer value)
	 {
		this.buildStateEndEqual = value;
	}
	
	/**
	 * BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public Integer getBuildResult() {
		return this.buildResult;
	}
	
	/**
	 * BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public void setBuildResult(Integer value)
	 {
		this.buildResult = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public Integer getBuildResultBegin() {
		return this.buildResultBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public void setBuildResultBegin(Integer value)
	 {
		this.buildResultBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public Integer getBuildResultEnd() {
		return this.buildResultEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public void setBuildResultEnd(Integer value)
	 {
		this.buildResultEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public Integer getBuildResultEndEqual() {
		return this.buildResultEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public void setBuildResultEndEqual(Integer value)
	 {
		this.buildResultEndEqual = value;
	}
	
	/**
	 * BUILD_MESSAGE: 构建结果提示
	 */
	public String getBuildMessage() {
		return this.buildMessage;
	}
	
	/**
	 * BUILD_MESSAGE: 构建结果提示
	 */
	public void setBuildMessage(String value)
	 {
		this.buildMessage = value;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_MESSAGE: 构建结果提示
	 */
	public String getBuildMessageEqual() {
		return this.buildMessageEqual;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_MESSAGE: 构建结果提示
	 */
	public void setBuildMessageEqual(String value)
	 {
		this.buildMessageEqual = value;
	}
	
	/**
	 * BUILD_START_TIME: 构建开始时间
	 */
	public java.util.Date getBuildStartTime() {
		return this.buildStartTime;
	}
	
	/**
	 * BUILD_START_TIME: 构建开始时间
	 */
	public void setBuildStartTime(java.util.Date value)
	 {
		this.buildStartTime = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_START_TIME: 构建开始时间
	 */
	public java.util.Date getBuildStartTimeBegin() {
		return this.buildStartTimeBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_START_TIME: 构建开始时间
	 */
	public void setBuildStartTimeBegin(java.util.Date value)
	 {
		this.buildStartTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_START_TIME: 构建开始时间
	 */
	public java.util.Date getBuildStartTimeEnd() {
		return this.buildStartTimeEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_START_TIME: 构建开始时间
	 */
	public void setBuildStartTimeEnd(java.util.Date value)
	 {
		this.buildStartTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_START_TIME: 构建开始时间
	 */
	public java.util.Date getBuildStartTimeEndEqual() {
		return this.buildStartTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_START_TIME: 构建开始时间
	 */
	public void setBuildStartTimeEndEqual(java.util.Date value)
	 {
		this.buildStartTimeEndEqual = value;
	}
	
	/**
	 * BUILD_END_TIME: 构建结束时间
	 */
	public java.util.Date getBuildEndTime() {
		return this.buildEndTime;
	}
	
	/**
	 * BUILD_END_TIME: 构建结束时间
	 */
	public void setBuildEndTime(java.util.Date value)
	 {
		this.buildEndTime = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_END_TIME: 构建结束时间
	 */
	public java.util.Date getBuildEndTimeBegin() {
		return this.buildEndTimeBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_END_TIME: 构建结束时间
	 */
	public void setBuildEndTimeBegin(java.util.Date value)
	 {
		this.buildEndTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_END_TIME: 构建结束时间
	 */
	public java.util.Date getBuildEndTimeEnd() {
		return this.buildEndTimeEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_END_TIME: 构建结束时间
	 */
	public void setBuildEndTimeEnd(java.util.Date value)
	 {
		this.buildEndTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_END_TIME: 构建结束时间
	 */
	public java.util.Date getBuildEndTimeEndEqual() {
		return this.buildEndTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_END_TIME: 构建结束时间
	 */
	public void setBuildEndTimeEndEqual(java.util.Date value)
	 {
		this.buildEndTimeEndEqual = value;
	}
	
	/**
	 * BUILD_OPERATOR: 构建人
	 */
	public String getBuildOperator() {
		return this.buildOperator;
	}
	
	/**
	 * BUILD_OPERATOR: 构建人
	 */
	public void setBuildOperator(String value)
	 {
		this.buildOperator = value;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_OPERATOR: 构建人
	 */
	public String getBuildOperatorEqual() {
		return this.buildOperatorEqual;
	}
	
	/**
	 * 查询条件字符串相等,BUILD_OPERATOR: 构建人
	 */
	public void setBuildOperatorEqual(String value)
	 {
		this.buildOperatorEqual = value;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public String getPub0() {
		return this.pub0;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public void setPub0(String value)
	 {
		this.pub0 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB0: 备用字段1
	 */
	public String getPub0Equal() {
		return this.pub0Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB0: 备用字段1
	 */
	public void setPub0Equal(String value)
	 {
		this.pub0Equal = value;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public String getPub1() {
		return this.pub1;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public void setPub1(String value)
	 {
		this.pub1 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB1: 备用字段2
	 */
	public String getPub1Equal() {
		return this.pub1Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB1: 备用字段2
	 */
	public void setPub1Equal(String value)
	 {
		this.pub1Equal = value;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public String getPub2() {
		return this.pub2;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public void setPub2(String value)
	 {
		this.pub2 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB2: 备用字段3
	 */
	public String getPub2Equal() {
		return this.pub2Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB2: 备用字段3
	 */
	public void setPub2Equal(String value)
	 {
		this.pub2Equal = value;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public String getPub3() {
		return this.pub3;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public void setPub3(String value)
	 {
		this.pub3 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB3: 备用字段4
	 */
	public String getPub3Equal() {
		return this.pub3Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB3: 备用字段4
	 */
	public void setPub3Equal(String value)
	 {
		this.pub3Equal = value;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public String getPub4() {
		return this.pub4;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public void setPub4(String value)
	 {
		this.pub4 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB4: 备用字段5
	 */
	public String getPub4Equal() {
		return this.pub4Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB4: 备用字段5
	 */
	public void setPub4Equal(String value)
	 {
		this.pub4Equal = value;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public String getPub5() {
		return this.pub5;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public void setPub5(String value)
	 {
		this.pub5 = value;
	}
	
	/**
	 * 查询条件字符串相等,PUB5: 备用字段6
	 */
	public String getPub5Equal() {
		return this.pub5Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB5: 备用字段6
	 */
	public void setPub5Equal(String value)
	 {
		this.pub5Equal = value;
	}
	
	/**
	 * 设置查询条件BUILD_LOG_ID: 构建标识
	 */
	public CodeBuildLogQueryCondition setBuildLogIdCondition(Integer value) {
		this.buildLogId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_LOG_ID: 构建标识
	 */
	public CodeBuildLogQueryCondition setBuildLogIdConditionBegin(Integer value) {
		this.buildLogIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_LOG_ID: 构建标识
	 */
	public CodeBuildLogQueryCondition setBuildLogIdConditionEnd(Integer value) {
		this.buildLogIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_LOG_ID: 构建标识
	 */
	public CodeBuildLogQueryCondition setBuildLogIdConditionEndEqual(Integer value) {
		this.buildLogIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildLogQueryCondition setBuildIdCondition(Integer value) {
		this.buildId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildLogQueryCondition setBuildIdConditionBegin(Integer value) {
		this.buildIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildLogQueryCondition setBuildIdConditionEnd(Integer value) {
		this.buildIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildLogQueryCondition setBuildIdConditionEndEqual(Integer value) {
		this.buildIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public CodeBuildLogQueryCondition setBuildStateCondition(Integer value) {
		this.buildState = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public CodeBuildLogQueryCondition setBuildStateConditionBegin(Integer value) {
		this.buildStateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public CodeBuildLogQueryCondition setBuildStateConditionEnd(Integer value) {
		this.buildStateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_STATE: 0构建准备 1构建中 2构建完成
	 */
	public CodeBuildLogQueryCondition setBuildStateConditionEndEqual(Integer value) {
		this.buildStateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public CodeBuildLogQueryCondition setBuildResultCondition(Integer value) {
		this.buildResult = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public CodeBuildLogQueryCondition setBuildResultConditionBegin(Integer value) {
		this.buildResultBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public CodeBuildLogQueryCondition setBuildResultConditionEnd(Integer value) {
		this.buildResultEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_RESULT: 构建结果0，构建结果未知 1 构建成功 2构建失败
	 */
	public CodeBuildLogQueryCondition setBuildResultConditionEndEqual(Integer value) {
		this.buildResultEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_MESSAGE: 构建结果提示
	 */
	public CodeBuildLogQueryCondition setBuildMessageCondition(String value) {
		this.buildMessage = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_MESSAGE: 构建结果提示
	 */
	public CodeBuildLogQueryCondition setBuildMessageConditionEqual(String value) {
		this.buildMessageEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_START_TIME: 构建开始时间
	 */
	public CodeBuildLogQueryCondition setBuildStartTimeCondition(java.util.Date value) {
		this.buildStartTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_START_TIME: 构建开始时间
	 */
	public CodeBuildLogQueryCondition setBuildStartTimeConditionBegin(java.util.Date value) {
		this.buildStartTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_START_TIME: 构建开始时间
	 */
	public CodeBuildLogQueryCondition setBuildStartTimeConditionEnd(java.util.Date value) {
		this.buildStartTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_START_TIME: 构建开始时间
	 */
	public CodeBuildLogQueryCondition setBuildStartTimeConditionEndEqual(java.util.Date value) {
		this.buildStartTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_END_TIME: 构建结束时间
	 */
	public CodeBuildLogQueryCondition setBuildEndTimeCondition(java.util.Date value) {
		this.buildEndTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_END_TIME: 构建结束时间
	 */
	public CodeBuildLogQueryCondition setBuildEndTimeConditionBegin(java.util.Date value) {
		this.buildEndTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_END_TIME: 构建结束时间
	 */
	public CodeBuildLogQueryCondition setBuildEndTimeConditionEnd(java.util.Date value) {
		this.buildEndTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_END_TIME: 构建结束时间
	 */
	public CodeBuildLogQueryCondition setBuildEndTimeConditionEndEqual(java.util.Date value) {
		this.buildEndTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_OPERATOR: 构建人
	 */
	public CodeBuildLogQueryCondition setBuildOperatorCondition(String value) {
		this.buildOperator = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_OPERATOR: 构建人
	 */
	public CodeBuildLogQueryCondition setBuildOperatorConditionEqual(String value) {
		this.buildOperatorEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public CodeBuildLogQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用字段1
	 */
	public CodeBuildLogQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public CodeBuildLogQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用字段2
	 */
	public CodeBuildLogQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public CodeBuildLogQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用字段3
	 */
	public CodeBuildLogQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public CodeBuildLogQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用字段4
	 */
	public CodeBuildLogQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public CodeBuildLogQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用字段5
	 */
	public CodeBuildLogQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public CodeBuildLogQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用字段6
	 */
	public CodeBuildLogQueryCondition setPub5ConditionEqual(String value) {
		this.pub5Equal = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.buildLogId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_LOG].[BUILD_LOG_ID] = " + this.buildLogId) 
						+ ") "));
		}
		if ((this.buildLogIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_LOG_ID] >= " 
						+ (this.buildLogIdBegin + ")")));
		}
		if ((this.buildLogIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_LOG_ID] < " 
						+ (this.buildLogIdEnd + ") ")));
		}
		if ((this.buildLogIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_LOG_ID] <= " 
						+ (this.buildLogIdEndEqual + ") ")));
		}
		if ((this.buildId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_LOG].[BUILD_ID] = " + this.buildId) 
						+ ") "));
		}
		if ((this.buildIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_ID] >= " 
						+ (this.buildIdBegin + ")")));
		}
		if ((this.buildIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_ID] < " 
						+ (this.buildIdEnd + ") ")));
		}
		if ((this.buildIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_ID] <= " 
						+ (this.buildIdEndEqual + ") ")));
		}
		if ((this.buildState == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_LOG].[BUILD_STATE] = " + this.buildState) 
						+ ") "));
		}
		if ((this.buildStateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_STATE] >= " 
						+ (this.buildStateBegin + ")")));
		}
		if ((this.buildStateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_STATE] < " 
						+ (this.buildStateEnd + ") ")));
		}
		if ((this.buildStateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_STATE] <= " 
						+ (this.buildStateEndEqual + ") ")));
		}
		if ((this.buildResult == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_LOG].[BUILD_RESULT] = " + this.buildResult) 
						+ ") "));
		}
		if ((this.buildResultBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_RESULT] >= " 
						+ (this.buildResultBegin + ")")));
		}
		if ((this.buildResultEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_RESULT] < " 
						+ (this.buildResultEnd + ") ")));
		}
		if ((this.buildResultEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_RESULT] <= " 
						+ (this.buildResultEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.buildMessage)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_LOG].[BUILD_MESSAGE]", this.buildMessage)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildMessageEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_LOG].[BUILD_MESSAGE] = " + SqlServerUtils.safeSql(this.buildMessageEqual))) 
						+ ") "));
		}
		if ((this.buildStartTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_LOG].[BUILD_START_TIME] = " + SqlServerUtils.getDateSql(this.buildStartTime)) 
						+ ") "));
		}
		if ((this.buildStartTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_START_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.buildStartTimeBegin) + ")")));
		}
		if ((this.buildStartTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_START_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.buildStartTimeEnd) + ") ")));
		}
		if ((this.buildStartTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_START_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.buildStartTimeEndEqual) + ") ")));
		}
		if ((this.buildEndTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_LOG].[BUILD_END_TIME] = " + SqlServerUtils.getDateSql(this.buildEndTime)) 
						+ ") "));
		}
		if ((this.buildEndTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_END_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.buildEndTimeBegin) + ")")));
		}
		if ((this.buildEndTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_END_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.buildEndTimeEnd) + ") ")));
		}
		if ((this.buildEndTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_LOG].[BUILD_END_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.buildEndTimeEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.buildOperator)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_LOG].[BUILD_OPERATOR]", this.buildOperator)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.buildOperatorEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_LOG].[BUILD_OPERATOR] = " + SqlServerUtils.safeSql(this.buildOperatorEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_LOG].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_LOG].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_LOG].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_LOG].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_LOG].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_LOG].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_LOG].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_LOG].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_LOG].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_LOG].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_CODE_BUILD_LOG].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_CODE_BUILD_LOG].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
