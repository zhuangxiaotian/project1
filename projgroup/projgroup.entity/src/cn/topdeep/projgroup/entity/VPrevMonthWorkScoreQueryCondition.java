package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_PREV_MONTH_WORK_SCORE查询条件定义
 */
public class VPrevMonthWorkScoreQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,REAL_NAME: 
	 */
	String realName;
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 
	 */
	String realNameEqual;
	
	/**
	 * 查询条件,WORK_USER_ID: 
	 */
	Integer workUserId;
	
	/**
	 * 查询条件开始值,WORK_USER_ID: 
	 */
	Integer workUserIdBegin;
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 
	 */
	Integer workUserIdEnd;
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 
	 */
	Integer workUserIdEndEqual;
	
	/**
	 * 查询条件,WORK_DAY_COUNT: 
	 */
	Integer workDayCount;
	
	/**
	 * 查询条件开始值,WORK_DAY_COUNT: 
	 */
	Integer workDayCountBegin;
	
	/**
	 * 查询条件结束值,WORK_DAY_COUNT: 
	 */
	Integer workDayCountEnd;
	
	/**
	 * 查询条件结束值,WORK_DAY_COUNT: 
	 */
	Integer workDayCountEndEqual;
	
	/**
	 * 查询条件,WORK_DAY_SCORE: 
	 */
	Double workDayScore;
	
	/**
	 * 查询条件开始值,WORK_DAY_SCORE: 
	 */
	Double workDayScoreBegin;
	
	/**
	 * 查询条件结束值,WORK_DAY_SCORE: 
	 */
	Double workDayScoreEnd;
	
	/**
	 * 查询条件结束值,WORK_DAY_SCORE: 
	 */
	Double workDayScoreEndEqual;
	
	/**
	 * REAL_NAME: 
	 */
	public String getRealName() {
		return this.realName;
	}
	
	/**
	 * REAL_NAME: 
	 */
	public void setRealName(String value)
	 {
		this.realName = value;
	}
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 
	 */
	public String getRealNameEqual() {
		return this.realNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,REAL_NAME: 
	 */
	public void setRealNameEqual(String value)
	 {
		this.realNameEqual = value;
	}
	
	/**
	 * WORK_USER_ID: 
	 */
	public Integer getWorkUserId() {
		return this.workUserId;
	}
	
	/**
	 * WORK_USER_ID: 
	 */
	public void setWorkUserId(Integer value)
	 {
		this.workUserId = value;
	}
	
	/**
	 * 查询条件开始值,WORK_USER_ID: 
	 */
	public Integer getWorkUserIdBegin() {
		return this.workUserIdBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_USER_ID: 
	 */
	public void setWorkUserIdBegin(Integer value)
	 {
		this.workUserIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 
	 */
	public Integer getWorkUserIdEnd() {
		return this.workUserIdEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 
	 */
	public void setWorkUserIdEnd(Integer value)
	 {
		this.workUserIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 
	 */
	public Integer getWorkUserIdEndEqual() {
		return this.workUserIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_USER_ID: 
	 */
	public void setWorkUserIdEndEqual(Integer value)
	 {
		this.workUserIdEndEqual = value;
	}
	
	/**
	 * WORK_DAY_COUNT: 
	 */
	public Integer getWorkDayCount() {
		return this.workDayCount;
	}
	
	/**
	 * WORK_DAY_COUNT: 
	 */
	public void setWorkDayCount(Integer value)
	 {
		this.workDayCount = value;
	}
	
	/**
	 * 查询条件开始值,WORK_DAY_COUNT: 
	 */
	public Integer getWorkDayCountBegin() {
		return this.workDayCountBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_DAY_COUNT: 
	 */
	public void setWorkDayCountBegin(Integer value)
	 {
		this.workDayCountBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY_COUNT: 
	 */
	public Integer getWorkDayCountEnd() {
		return this.workDayCountEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY_COUNT: 
	 */
	public void setWorkDayCountEnd(Integer value)
	 {
		this.workDayCountEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY_COUNT: 
	 */
	public Integer getWorkDayCountEndEqual() {
		return this.workDayCountEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY_COUNT: 
	 */
	public void setWorkDayCountEndEqual(Integer value)
	 {
		this.workDayCountEndEqual = value;
	}
	
	/**
	 * WORK_DAY_SCORE: 
	 */
	public Double getWorkDayScore() {
		return this.workDayScore;
	}
	
	/**
	 * WORK_DAY_SCORE: 
	 */
	public void setWorkDayScore(Double value)
	 {
		this.workDayScore = value;
	}
	
	/**
	 * 查询条件开始值,WORK_DAY_SCORE: 
	 */
	public Double getWorkDayScoreBegin() {
		return this.workDayScoreBegin;
	}
	
	/**
	 * 查询条件开始值,WORK_DAY_SCORE: 
	 */
	public void setWorkDayScoreBegin(Double value)
	 {
		this.workDayScoreBegin = value;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY_SCORE: 
	 */
	public Double getWorkDayScoreEnd() {
		return this.workDayScoreEnd;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY_SCORE: 
	 */
	public void setWorkDayScoreEnd(Double value)
	 {
		this.workDayScoreEnd = value;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY_SCORE: 
	 */
	public Double getWorkDayScoreEndEqual() {
		return this.workDayScoreEndEqual;
	}
	
	/**
	 * 查询条件结束值,WORK_DAY_SCORE: 
	 */
	public void setWorkDayScoreEndEqual(Double value)
	 {
		this.workDayScoreEndEqual = value;
	}
	
	/**
	 * 设置查询条件REAL_NAME: 
	 */
	public VPrevMonthWorkScoreQueryCondition setRealNameCondition(String value) {
		this.realName = value;
		return this;
	}
	
	/**
	 * 设置查询条件REAL_NAME: 
	 */
	public VPrevMonthWorkScoreQueryCondition setRealNameConditionEqual(String value) {
		this.realNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_USER_ID: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkUserIdCondition(Integer value) {
		this.workUserId = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_USER_ID: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkUserIdConditionBegin(Integer value) {
		this.workUserIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_USER_ID: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkUserIdConditionEnd(Integer value) {
		this.workUserIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_USER_ID: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkUserIdConditionEndEqual(Integer value) {
		this.workUserIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY_COUNT: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkDayCountCondition(Integer value) {
		this.workDayCount = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY_COUNT: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkDayCountConditionBegin(Integer value) {
		this.workDayCountBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY_COUNT: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkDayCountConditionEnd(Integer value) {
		this.workDayCountEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY_COUNT: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkDayCountConditionEndEqual(Integer value) {
		this.workDayCountEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY_SCORE: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkDayScoreCondition(Double value) {
		this.workDayScore = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY_SCORE: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkDayScoreConditionBegin(Double value) {
		this.workDayScoreBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY_SCORE: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkDayScoreConditionEnd(Double value) {
		this.workDayScoreEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件WORK_DAY_SCORE: 
	 */
	public VPrevMonthWorkScoreQueryCondition setWorkDayScoreConditionEndEqual(Double value) {
		this.workDayScoreEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if (StringUtils.isNullOrEmpty(this.realName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_PREV_MONTH_WORK_SCORE].[REAL_NAME]", this.realName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.realNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_PREV_MONTH_WORK_SCORE].[REAL_NAME] = " + SqlServerUtils.safeSql(this.realNameEqual))) 
						+ ") "));
		}
		if ((this.workUserId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PREV_MONTH_WORK_SCORE].[WORK_USER_ID] = " + this.workUserId) 
						+ ") "));
		}
		if ((this.workUserIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_USER_ID] >= " 
						+ (this.workUserIdBegin + ")")));
		}
		if ((this.workUserIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_USER_ID] < " 
						+ (this.workUserIdEnd + ") ")));
		}
		if ((this.workUserIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_USER_ID] <= " 
						+ (this.workUserIdEndEqual + ") ")));
		}
		if ((this.workDayCount == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PREV_MONTH_WORK_SCORE].[WORK_DAY_COUNT] = " + this.workDayCount) 
						+ ") "));
		}
		if ((this.workDayCountBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_DAY_COUNT] >= " 
						+ (this.workDayCountBegin + ")")));
		}
		if ((this.workDayCountEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_DAY_COUNT] < " 
						+ (this.workDayCountEnd + ") ")));
		}
		if ((this.workDayCountEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_DAY_COUNT] <= " 
						+ (this.workDayCountEndEqual + ") ")));
		}
		if ((this.workDayScore == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PREV_MONTH_WORK_SCORE].[WORK_DAY_SCORE] = " + this.workDayScore) 
						+ ") "));
		}
		if ((this.workDayScoreBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_DAY_SCORE] >= " 
						+ (this.workDayScoreBegin + ")")));
		}
		if ((this.workDayScoreEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_DAY_SCORE] < " 
						+ (this.workDayScoreEnd + ") ")));
		}
		if ((this.workDayScoreEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PREV_MONTH_WORK_SCORE].[WORK_DAY_SCORE] <= " 
						+ (this.workDayScoreEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
