package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_PAPERS_SCORE查询条件定义
 */
public class VPapersScoreQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PAPERS_BEGIN_TIME: 
	 */
	java.util.Date papersBeginTime;
	
	/**
	 * 查询条件开始值,PAPERS_BEGIN_TIME: 
	 */
	java.util.Date papersBeginTimeBegin;
	
	/**
	 * 查询条件结束值,PAPERS_BEGIN_TIME: 
	 */
	java.util.Date papersBeginTimeEnd;
	
	/**
	 * 查询条件结束值,PAPERS_BEGIN_TIME: 
	 */
	java.util.Date papersBeginTimeEndEqual;
	
	/**
	 * 查询条件,PAPERS_END_TIME: 
	 */
	java.util.Date papersEndTime;
	
	/**
	 * 查询条件开始值,PAPERS_END_TIME: 
	 */
	java.util.Date papersEndTimeBegin;
	
	/**
	 * 查询条件结束值,PAPERS_END_TIME: 
	 */
	java.util.Date papersEndTimeEnd;
	
	/**
	 * 查询条件结束值,PAPERS_END_TIME: 
	 */
	java.util.Date papersEndTimeEndEqual;
	
	/**
	 * 查询条件,PAPERS_PASS_RATE: 
	 */
	Integer papersPassRate;
	
	/**
	 * 查询条件开始值,PAPERS_PASS_RATE: 
	 */
	Integer papersPassRateBegin;
	
	/**
	 * 查询条件结束值,PAPERS_PASS_RATE: 
	 */
	Integer papersPassRateEnd;
	
	/**
	 * 查询条件结束值,PAPERS_PASS_RATE: 
	 */
	Integer papersPassRateEndEqual;
	
	/**
	 * 查询条件,PAPERS_SCORE_ID: 
	 */
	Integer papersScoreId;
	
	/**
	 * 查询条件开始值,PAPERS_SCORE_ID: 
	 */
	Integer papersScoreIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 
	 */
	Integer papersScoreIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 
	 */
	Integer papersScoreIdEndEqual;
	
	/**
	 * 查询条件,PAPERS_ID: 
	 */
	Integer papersId;
	
	/**
	 * 查询条件开始值,PAPERS_ID: 
	 */
	Integer papersIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	Integer papersIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	Integer papersIdEndEqual;
	
	/**
	 * 查询条件,PAPERS_NAME: 
	 */
	String papersName;
	
	/**
	 * 查询条件字符串相等,PAPERS_NAME: 
	 */
	String papersNameEqual;
	
	/**
	 * 查询条件,PAPERS_TIME_LIMIT: 
	 */
	Integer papersTimeLimit;
	
	/**
	 * 查询条件开始值,PAPERS_TIME_LIMIT: 
	 */
	Integer papersTimeLimitBegin;
	
	/**
	 * 查询条件结束值,PAPERS_TIME_LIMIT: 
	 */
	Integer papersTimeLimitEnd;
	
	/**
	 * 查询条件结束值,PAPERS_TIME_LIMIT: 
	 */
	Integer papersTimeLimitEndEqual;
	
	/**
	 * 查询条件,PAPERS_CREATE_TIME: 
	 */
	java.util.Date papersCreateTime;
	
	/**
	 * 查询条件开始值,PAPERS_CREATE_TIME: 
	 */
	java.util.Date papersCreateTimeBegin;
	
	/**
	 * 查询条件结束值,PAPERS_CREATE_TIME: 
	 */
	java.util.Date papersCreateTimeEnd;
	
	/**
	 * 查询条件结束值,PAPERS_CREATE_TIME: 
	 */
	java.util.Date papersCreateTimeEndEqual;
	
	/**
	 * 查询条件,PAPERS_MODIFY_OR: 
	 */
	String papersModifyOr;
	
	/**
	 * 查询条件字符串相等,PAPERS_MODIFY_OR: 
	 */
	String papersModifyOrEqual;
	
	/**
	 * 查询条件,PAPERS_TEST_END: 
	 */
	Boolean papersTestEnd;
	
	/**
	 * 查询条件,PAPERS_SCORE: 
	 */
	Double papersScore;
	
	/**
	 * 查询条件开始值,PAPERS_SCORE: 
	 */
	Double papersScoreBegin;
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 
	 */
	Double papersScoreEnd;
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 
	 */
	Double papersScoreEndEqual;
	
	/**
	 * 查询条件,PAPERS_TYPE: 
	 */
	Byte papersType;
	
	/**
	 * 查询条件开始值,PAPERS_TYPE: 
	 */
	Byte papersTypeBegin;
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 
	 */
	Byte papersTypeEnd;
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 
	 */
	Byte papersTypeEndEqual;
	
	/**
	 * PAPERS_BEGIN_TIME: 
	 */
	public java.util.Date getPapersBeginTime() {
		return this.papersBeginTime;
	}
	
	/**
	 * PAPERS_BEGIN_TIME: 
	 */
	public void setPapersBeginTime(java.util.Date value)
	 {
		this.papersBeginTime = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_BEGIN_TIME: 
	 */
	public java.util.Date getPapersBeginTimeBegin() {
		return this.papersBeginTimeBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_BEGIN_TIME: 
	 */
	public void setPapersBeginTimeBegin(java.util.Date value)
	 {
		this.papersBeginTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_BEGIN_TIME: 
	 */
	public java.util.Date getPapersBeginTimeEnd() {
		return this.papersBeginTimeEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_BEGIN_TIME: 
	 */
	public void setPapersBeginTimeEnd(java.util.Date value)
	 {
		this.papersBeginTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_BEGIN_TIME: 
	 */
	public java.util.Date getPapersBeginTimeEndEqual() {
		return this.papersBeginTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_BEGIN_TIME: 
	 */
	public void setPapersBeginTimeEndEqual(java.util.Date value)
	 {
		this.papersBeginTimeEndEqual = value;
	}
	
	/**
	 * PAPERS_END_TIME: 
	 */
	public java.util.Date getPapersEndTime() {
		return this.papersEndTime;
	}
	
	/**
	 * PAPERS_END_TIME: 
	 */
	public void setPapersEndTime(java.util.Date value)
	 {
		this.papersEndTime = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_END_TIME: 
	 */
	public java.util.Date getPapersEndTimeBegin() {
		return this.papersEndTimeBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_END_TIME: 
	 */
	public void setPapersEndTimeBegin(java.util.Date value)
	 {
		this.papersEndTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_END_TIME: 
	 */
	public java.util.Date getPapersEndTimeEnd() {
		return this.papersEndTimeEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_END_TIME: 
	 */
	public void setPapersEndTimeEnd(java.util.Date value)
	 {
		this.papersEndTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_END_TIME: 
	 */
	public java.util.Date getPapersEndTimeEndEqual() {
		return this.papersEndTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_END_TIME: 
	 */
	public void setPapersEndTimeEndEqual(java.util.Date value)
	 {
		this.papersEndTimeEndEqual = value;
	}
	
	/**
	 * PAPERS_PASS_RATE: 
	 */
	public Integer getPapersPassRate() {
		return this.papersPassRate;
	}
	
	/**
	 * PAPERS_PASS_RATE: 
	 */
	public void setPapersPassRate(Integer value)
	 {
		this.papersPassRate = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_PASS_RATE: 
	 */
	public Integer getPapersPassRateBegin() {
		return this.papersPassRateBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_PASS_RATE: 
	 */
	public void setPapersPassRateBegin(Integer value)
	 {
		this.papersPassRateBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_PASS_RATE: 
	 */
	public Integer getPapersPassRateEnd() {
		return this.papersPassRateEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_PASS_RATE: 
	 */
	public void setPapersPassRateEnd(Integer value)
	 {
		this.papersPassRateEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_PASS_RATE: 
	 */
	public Integer getPapersPassRateEndEqual() {
		return this.papersPassRateEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_PASS_RATE: 
	 */
	public void setPapersPassRateEndEqual(Integer value)
	 {
		this.papersPassRateEndEqual = value;
	}
	
	/**
	 * PAPERS_SCORE_ID: 
	 */
	public Integer getPapersScoreId() {
		return this.papersScoreId;
	}
	
	/**
	 * PAPERS_SCORE_ID: 
	 */
	public void setPapersScoreId(Integer value)
	 {
		this.papersScoreId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_SCORE_ID: 
	 */
	public Integer getPapersScoreIdBegin() {
		return this.papersScoreIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_SCORE_ID: 
	 */
	public void setPapersScoreIdBegin(Integer value)
	 {
		this.papersScoreIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 
	 */
	public Integer getPapersScoreIdEnd() {
		return this.papersScoreIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 
	 */
	public void setPapersScoreIdEnd(Integer value)
	 {
		this.papersScoreIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 
	 */
	public Integer getPapersScoreIdEndEqual() {
		return this.papersScoreIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 
	 */
	public void setPapersScoreIdEndEqual(Integer value)
	 {
		this.papersScoreIdEndEqual = value;
	}
	
	/**
	 * PAPERS_ID: 
	 */
	public Integer getPapersId() {
		return this.papersId;
	}
	
	/**
	 * PAPERS_ID: 
	 */
	public void setPapersId(Integer value)
	 {
		this.papersId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_ID: 
	 */
	public Integer getPapersIdBegin() {
		return this.papersIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_ID: 
	 */
	public void setPapersIdBegin(Integer value)
	 {
		this.papersIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	public Integer getPapersIdEnd() {
		return this.papersIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	public void setPapersIdEnd(Integer value)
	 {
		this.papersIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	public Integer getPapersIdEndEqual() {
		return this.papersIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 
	 */
	public void setPapersIdEndEqual(Integer value)
	 {
		this.papersIdEndEqual = value;
	}
	
	/**
	 * PAPERS_NAME: 
	 */
	public String getPapersName() {
		return this.papersName;
	}
	
	/**
	 * PAPERS_NAME: 
	 */
	public void setPapersName(String value)
	 {
		this.papersName = value;
	}
	
	/**
	 * 查询条件字符串相等,PAPERS_NAME: 
	 */
	public String getPapersNameEqual() {
		return this.papersNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,PAPERS_NAME: 
	 */
	public void setPapersNameEqual(String value)
	 {
		this.papersNameEqual = value;
	}
	
	/**
	 * PAPERS_TIME_LIMIT: 
	 */
	public Integer getPapersTimeLimit() {
		return this.papersTimeLimit;
	}
	
	/**
	 * PAPERS_TIME_LIMIT: 
	 */
	public void setPapersTimeLimit(Integer value)
	 {
		this.papersTimeLimit = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_TIME_LIMIT: 
	 */
	public Integer getPapersTimeLimitBegin() {
		return this.papersTimeLimitBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_TIME_LIMIT: 
	 */
	public void setPapersTimeLimitBegin(Integer value)
	 {
		this.papersTimeLimitBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TIME_LIMIT: 
	 */
	public Integer getPapersTimeLimitEnd() {
		return this.papersTimeLimitEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TIME_LIMIT: 
	 */
	public void setPapersTimeLimitEnd(Integer value)
	 {
		this.papersTimeLimitEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TIME_LIMIT: 
	 */
	public Integer getPapersTimeLimitEndEqual() {
		return this.papersTimeLimitEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TIME_LIMIT: 
	 */
	public void setPapersTimeLimitEndEqual(Integer value)
	 {
		this.papersTimeLimitEndEqual = value;
	}
	
	/**
	 * PAPERS_CREATE_TIME: 
	 */
	public java.util.Date getPapersCreateTime() {
		return this.papersCreateTime;
	}
	
	/**
	 * PAPERS_CREATE_TIME: 
	 */
	public void setPapersCreateTime(java.util.Date value)
	 {
		this.papersCreateTime = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_CREATE_TIME: 
	 */
	public java.util.Date getPapersCreateTimeBegin() {
		return this.papersCreateTimeBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_CREATE_TIME: 
	 */
	public void setPapersCreateTimeBegin(java.util.Date value)
	 {
		this.papersCreateTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_CREATE_TIME: 
	 */
	public java.util.Date getPapersCreateTimeEnd() {
		return this.papersCreateTimeEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_CREATE_TIME: 
	 */
	public void setPapersCreateTimeEnd(java.util.Date value)
	 {
		this.papersCreateTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_CREATE_TIME: 
	 */
	public java.util.Date getPapersCreateTimeEndEqual() {
		return this.papersCreateTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_CREATE_TIME: 
	 */
	public void setPapersCreateTimeEndEqual(java.util.Date value)
	 {
		this.papersCreateTimeEndEqual = value;
	}
	
	/**
	 * PAPERS_MODIFY_OR: 
	 */
	public String getPapersModifyOr() {
		return this.papersModifyOr;
	}
	
	/**
	 * PAPERS_MODIFY_OR: 
	 */
	public void setPapersModifyOr(String value)
	 {
		this.papersModifyOr = value;
	}
	
	/**
	 * 查询条件字符串相等,PAPERS_MODIFY_OR: 
	 */
	public String getPapersModifyOrEqual() {
		return this.papersModifyOrEqual;
	}
	
	/**
	 * 查询条件字符串相等,PAPERS_MODIFY_OR: 
	 */
	public void setPapersModifyOrEqual(String value)
	 {
		this.papersModifyOrEqual = value;
	}
	
	/**
	 * PAPERS_TEST_END: 
	 */
	public Boolean getPapersTestEnd() {
		return this.papersTestEnd;
	}
	
	/**
	 * PAPERS_TEST_END: 
	 */
	public void setPapersTestEnd(Boolean value)
	 {
		this.papersTestEnd = value;
	}
	
	/**
	 * PAPERS_SCORE: 
	 */
	public Double getPapersScore() {
		return this.papersScore;
	}
	
	/**
	 * PAPERS_SCORE: 
	 */
	public void setPapersScore(Double value)
	 {
		this.papersScore = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_SCORE: 
	 */
	public Double getPapersScoreBegin() {
		return this.papersScoreBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_SCORE: 
	 */
	public void setPapersScoreBegin(Double value)
	 {
		this.papersScoreBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 
	 */
	public Double getPapersScoreEnd() {
		return this.papersScoreEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 
	 */
	public void setPapersScoreEnd(Double value)
	 {
		this.papersScoreEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 
	 */
	public Double getPapersScoreEndEqual() {
		return this.papersScoreEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 
	 */
	public void setPapersScoreEndEqual(Double value)
	 {
		this.papersScoreEndEqual = value;
	}
	
	/**
	 * PAPERS_TYPE: 
	 */
	public Byte getPapersType() {
		return this.papersType;
	}
	
	/**
	 * PAPERS_TYPE: 
	 */
	public void setPapersType(Byte value)
	 {
		this.papersType = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_TYPE: 
	 */
	public Byte getPapersTypeBegin() {
		return this.papersTypeBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_TYPE: 
	 */
	public void setPapersTypeBegin(Byte value)
	 {
		this.papersTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 
	 */
	public Byte getPapersTypeEnd() {
		return this.papersTypeEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 
	 */
	public void setPapersTypeEnd(Byte value)
	 {
		this.papersTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 
	 */
	public Byte getPapersTypeEndEqual() {
		return this.papersTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_TYPE: 
	 */
	public void setPapersTypeEndEqual(Byte value)
	 {
		this.papersTypeEndEqual = value;
	}
	
	/**
	 * 设置查询条件PAPERS_BEGIN_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersBeginTimeCondition(java.util.Date value) {
		this.papersBeginTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_BEGIN_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersBeginTimeConditionBegin(java.util.Date value) {
		this.papersBeginTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_BEGIN_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersBeginTimeConditionEnd(java.util.Date value) {
		this.papersBeginTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_BEGIN_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersBeginTimeConditionEndEqual(java.util.Date value) {
		this.papersBeginTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_END_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersEndTimeCondition(java.util.Date value) {
		this.papersEndTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_END_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersEndTimeConditionBegin(java.util.Date value) {
		this.papersEndTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_END_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersEndTimeConditionEnd(java.util.Date value) {
		this.papersEndTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_END_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersEndTimeConditionEndEqual(java.util.Date value) {
		this.papersEndTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_PASS_RATE: 
	 */
	public VPapersScoreQueryCondition setPapersPassRateCondition(Integer value) {
		this.papersPassRate = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_PASS_RATE: 
	 */
	public VPapersScoreQueryCondition setPapersPassRateConditionBegin(Integer value) {
		this.papersPassRateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_PASS_RATE: 
	 */
	public VPapersScoreQueryCondition setPapersPassRateConditionEnd(Integer value) {
		this.papersPassRateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_PASS_RATE: 
	 */
	public VPapersScoreQueryCondition setPapersPassRateConditionEndEqual(Integer value) {
		this.papersPassRateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE_ID: 
	 */
	public VPapersScoreQueryCondition setPapersScoreIdCondition(Integer value) {
		this.papersScoreId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE_ID: 
	 */
	public VPapersScoreQueryCondition setPapersScoreIdConditionBegin(Integer value) {
		this.papersScoreIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE_ID: 
	 */
	public VPapersScoreQueryCondition setPapersScoreIdConditionEnd(Integer value) {
		this.papersScoreIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE_ID: 
	 */
	public VPapersScoreQueryCondition setPapersScoreIdConditionEndEqual(Integer value) {
		this.papersScoreIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VPapersScoreQueryCondition setPapersIdCondition(Integer value) {
		this.papersId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VPapersScoreQueryCondition setPapersIdConditionBegin(Integer value) {
		this.papersIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VPapersScoreQueryCondition setPapersIdConditionEnd(Integer value) {
		this.papersIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VPapersScoreQueryCondition setPapersIdConditionEndEqual(Integer value) {
		this.papersIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_NAME: 
	 */
	public VPapersScoreQueryCondition setPapersNameCondition(String value) {
		this.papersName = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_NAME: 
	 */
	public VPapersScoreQueryCondition setPapersNameConditionEqual(String value) {
		this.papersNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TIME_LIMIT: 
	 */
	public VPapersScoreQueryCondition setPapersTimeLimitCondition(Integer value) {
		this.papersTimeLimit = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TIME_LIMIT: 
	 */
	public VPapersScoreQueryCondition setPapersTimeLimitConditionBegin(Integer value) {
		this.papersTimeLimitBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TIME_LIMIT: 
	 */
	public VPapersScoreQueryCondition setPapersTimeLimitConditionEnd(Integer value) {
		this.papersTimeLimitEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TIME_LIMIT: 
	 */
	public VPapersScoreQueryCondition setPapersTimeLimitConditionEndEqual(Integer value) {
		this.papersTimeLimitEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_CREATE_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersCreateTimeCondition(java.util.Date value) {
		this.papersCreateTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_CREATE_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersCreateTimeConditionBegin(java.util.Date value) {
		this.papersCreateTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_CREATE_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersCreateTimeConditionEnd(java.util.Date value) {
		this.papersCreateTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_CREATE_TIME: 
	 */
	public VPapersScoreQueryCondition setPapersCreateTimeConditionEndEqual(java.util.Date value) {
		this.papersCreateTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_MODIFY_OR: 
	 */
	public VPapersScoreQueryCondition setPapersModifyOrCondition(String value) {
		this.papersModifyOr = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_MODIFY_OR: 
	 */
	public VPapersScoreQueryCondition setPapersModifyOrConditionEqual(String value) {
		this.papersModifyOrEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TEST_END: 
	 */
	public VPapersScoreQueryCondition setPapersTestEndCondition(Boolean value) {
		this.papersTestEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE: 
	 */
	public VPapersScoreQueryCondition setPapersScoreCondition(Double value) {
		this.papersScore = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE: 
	 */
	public VPapersScoreQueryCondition setPapersScoreConditionBegin(Double value) {
		this.papersScoreBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE: 
	 */
	public VPapersScoreQueryCondition setPapersScoreConditionEnd(Double value) {
		this.papersScoreEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE: 
	 */
	public VPapersScoreQueryCondition setPapersScoreConditionEndEqual(Double value) {
		this.papersScoreEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TYPE: 
	 */
	public VPapersScoreQueryCondition setPapersTypeCondition(Byte value) {
		this.papersType = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TYPE: 
	 */
	public VPapersScoreQueryCondition setPapersTypeConditionBegin(Byte value) {
		this.papersTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TYPE: 
	 */
	public VPapersScoreQueryCondition setPapersTypeConditionEnd(Byte value) {
		this.papersTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_TYPE: 
	 */
	public VPapersScoreQueryCondition setPapersTypeConditionEndEqual(Byte value) {
		this.papersTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.papersBeginTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_BEGIN_TIME] = " + SqlServerUtils.getDateSql(this.papersBeginTime)) 
						+ ") "));
		}
		if ((this.papersBeginTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_BEGIN_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.papersBeginTimeBegin) + ")")));
		}
		if ((this.papersBeginTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_BEGIN_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.papersBeginTimeEnd) + ") ")));
		}
		if ((this.papersBeginTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_BEGIN_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.papersBeginTimeEndEqual) + ") ")));
		}
		if ((this.papersEndTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_END_TIME] = " + SqlServerUtils.getDateSql(this.papersEndTime)) 
						+ ") "));
		}
		if ((this.papersEndTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_END_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.papersEndTimeBegin) + ")")));
		}
		if ((this.papersEndTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_END_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.papersEndTimeEnd) + ") ")));
		}
		if ((this.papersEndTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_END_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.papersEndTimeEndEqual) + ") ")));
		}
		if ((this.papersPassRate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_PASS_RATE] = " + this.papersPassRate) 
						+ ") "));
		}
		if ((this.papersPassRateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_PASS_RATE] >= " 
						+ (this.papersPassRateBegin + ")")));
		}
		if ((this.papersPassRateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_PASS_RATE] < " 
						+ (this.papersPassRateEnd + ") ")));
		}
		if ((this.papersPassRateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_PASS_RATE] <= " 
						+ (this.papersPassRateEndEqual + ") ")));
		}
		if ((this.papersScoreId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_SCORE_ID] = " + this.papersScoreId) 
						+ ") "));
		}
		if ((this.papersScoreIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_SCORE_ID] >= " 
						+ (this.papersScoreIdBegin + ")")));
		}
		if ((this.papersScoreIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_SCORE_ID] < " 
						+ (this.papersScoreIdEnd + ") ")));
		}
		if ((this.papersScoreIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_SCORE_ID] <= " 
						+ (this.papersScoreIdEndEqual + ") ")));
		}
		if ((this.papersId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_ID] = " + this.papersId) 
						+ ") "));
		}
		if ((this.papersIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_ID] >= " 
						+ (this.papersIdBegin + ")")));
		}
		if ((this.papersIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_ID] < " 
						+ (this.papersIdEnd + ") ")));
		}
		if ((this.papersIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_ID] <= " 
						+ (this.papersIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.papersName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_PAPERS_SCORE].[PAPERS_NAME]", this.papersName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.papersNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_PAPERS_SCORE].[PAPERS_NAME] = " + SqlServerUtils.safeSql(this.papersNameEqual))) 
						+ ") "));
		}
		if ((this.papersTimeLimit == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_TIME_LIMIT] = " + this.papersTimeLimit) 
						+ ") "));
		}
		if ((this.papersTimeLimitBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_TIME_LIMIT] >= " 
						+ (this.papersTimeLimitBegin + ")")));
		}
		if ((this.papersTimeLimitEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_TIME_LIMIT] < " 
						+ (this.papersTimeLimitEnd + ") ")));
		}
		if ((this.papersTimeLimitEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_TIME_LIMIT] <= " 
						+ (this.papersTimeLimitEndEqual + ") ")));
		}
		if ((this.papersCreateTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_CREATE_TIME] = " + SqlServerUtils.getDateSql(this.papersCreateTime)) 
						+ ") "));
		}
		if ((this.papersCreateTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_CREATE_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.papersCreateTimeBegin) + ")")));
		}
		if ((this.papersCreateTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_CREATE_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.papersCreateTimeEnd) + ") ")));
		}
		if ((this.papersCreateTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_CREATE_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.papersCreateTimeEndEqual) + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.papersModifyOr)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_PAPERS_SCORE].[PAPERS_MODIFY_OR]", this.papersModifyOr)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.papersModifyOrEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_PAPERS_SCORE].[PAPERS_MODIFY_OR] = " + SqlServerUtils.safeSql(this.papersModifyOrEqual))) 
						+ ") "));
		}
		if ((this.papersTestEnd == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_TEST_END] = " + SqlServerUtils.getBoolSql(this.papersTestEnd)) 
						+ ") "));
		}
		if ((this.papersScore == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_SCORE] = " + this.papersScore) 
						+ ") "));
		}
		if ((this.papersScoreBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_SCORE] >= " 
						+ (this.papersScoreBegin + ")")));
		}
		if ((this.papersScoreEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_SCORE] < " 
						+ (this.papersScoreEnd + ") ")));
		}
		if ((this.papersScoreEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_SCORE] <= " 
						+ (this.papersScoreEndEqual + ") ")));
		}
		if ((this.papersType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_PAPERS_SCORE].[PAPERS_TYPE] = " + this.papersType) 
						+ ") "));
		}
		if ((this.papersTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_TYPE] >= " 
						+ (this.papersTypeBegin + ")")));
		}
		if ((this.papersTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_TYPE] < " 
						+ (this.papersTypeEnd + ") ")));
		}
		if ((this.papersTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_PAPERS_SCORE].[PAPERS_TYPE] <= " 
						+ (this.papersTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
