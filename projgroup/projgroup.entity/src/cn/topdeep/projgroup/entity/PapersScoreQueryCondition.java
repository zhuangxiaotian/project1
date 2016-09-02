package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PAPERS_SCORE查询条件定义
 */
public class PapersScoreQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PAPERS_SCORE_ID: 标识
	 */
	Integer papersScoreId;
	
	/**
	 * 查询条件开始值,PAPERS_SCORE_ID: 标识
	 */
	Integer papersScoreIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 标识
	 */
	Integer papersScoreIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 标识
	 */
	Integer papersScoreIdEndEqual;
	
	/**
	 * 查询条件,PAPERS_ID: 考卷标识
	 */
	Integer papersId;
	
	/**
	 * 查询条件开始值,PAPERS_ID: 考卷标识
	 */
	Integer papersIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	Integer papersIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	Integer papersIdEndEqual;
	
	/**
	 * 查询条件,OPERATOR_ID: 操作员标识
	 */
	String operatorId;
	
	/**
	 * 查询条件字符串相等,OPERATOR_ID: 操作员标识
	 */
	String operatorIdEqual;
	
	/**
	 * 查询条件,PASS_RATE: 通过率
	 */
	Integer passRate;
	
	/**
	 * 查询条件开始值,PASS_RATE: 通过率
	 */
	Integer passRateBegin;
	
	/**
	 * 查询条件结束值,PASS_RATE: 通过率
	 */
	Integer passRateEnd;
	
	/**
	 * 查询条件结束值,PASS_RATE: 通过率
	 */
	Integer passRateEndEqual;
	
	/**
	 * 查询条件,BEGIN_TIME: 开始时间
	 */
	java.util.Date beginTime;
	
	/**
	 * 查询条件开始值,BEGIN_TIME: 开始时间
	 */
	java.util.Date beginTimeBegin;
	
	/**
	 * 查询条件结束值,BEGIN_TIME: 开始时间
	 */
	java.util.Date beginTimeEnd;
	
	/**
	 * 查询条件结束值,BEGIN_TIME: 开始时间
	 */
	java.util.Date beginTimeEndEqual;
	
	/**
	 * 查询条件,END_TIME: 结束时间
	 */
	java.util.Date endTime;
	
	/**
	 * 查询条件开始值,END_TIME: 结束时间
	 */
	java.util.Date endTimeBegin;
	
	/**
	 * 查询条件结束值,END_TIME: 结束时间
	 */
	java.util.Date endTimeEnd;
	
	/**
	 * 查询条件结束值,END_TIME: 结束时间
	 */
	java.util.Date endTimeEndEqual;
	
	/**
	 * 查询条件,TEST_END: 是否考试结束
	 */
	Boolean testEnd;
	
	/**
	 * 查询条件,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	Integer totalAnswerSecond;
	
	/**
	 * 查询条件开始值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	Integer totalAnswerSecondBegin;
	
	/**
	 * 查询条件结束值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	Integer totalAnswerSecondEnd;
	
	/**
	 * 查询条件结束值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	Integer totalAnswerSecondEndEqual;
	
	/**
	 * 查询条件,PAPERS_SCORE: 考试成绩
	 */
	Double papersScore;
	
	/**
	 * 查询条件开始值,PAPERS_SCORE: 考试成绩
	 */
	Double papersScoreBegin;
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 考试成绩
	 */
	Double papersScoreEnd;
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 考试成绩
	 */
	Double papersScoreEndEqual;
	
	/**
	 * PAPERS_SCORE_ID: 标识
	 */
	public Integer getPapersScoreId() {
		return this.papersScoreId;
	}
	
	/**
	 * PAPERS_SCORE_ID: 标识
	 */
	public void setPapersScoreId(Integer value)
	 {
		this.papersScoreId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_SCORE_ID: 标识
	 */
	public Integer getPapersScoreIdBegin() {
		return this.papersScoreIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_SCORE_ID: 标识
	 */
	public void setPapersScoreIdBegin(Integer value)
	 {
		this.papersScoreIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 标识
	 */
	public Integer getPapersScoreIdEnd() {
		return this.papersScoreIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 标识
	 */
	public void setPapersScoreIdEnd(Integer value)
	 {
		this.papersScoreIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 标识
	 */
	public Integer getPapersScoreIdEndEqual() {
		return this.papersScoreIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE_ID: 标识
	 */
	public void setPapersScoreIdEndEqual(Integer value)
	 {
		this.papersScoreIdEndEqual = value;
	}
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	public Integer getPapersId() {
		return this.papersId;
	}
	
	/**
	 * PAPERS_ID: 考卷标识
	 */
	public void setPapersId(Integer value)
	 {
		this.papersId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_ID: 考卷标识
	 */
	public Integer getPapersIdBegin() {
		return this.papersIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_ID: 考卷标识
	 */
	public void setPapersIdBegin(Integer value)
	 {
		this.papersIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	public Integer getPapersIdEnd() {
		return this.papersIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	public void setPapersIdEnd(Integer value)
	 {
		this.papersIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	public Integer getPapersIdEndEqual() {
		return this.papersIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_ID: 考卷标识
	 */
	public void setPapersIdEndEqual(Integer value)
	 {
		this.papersIdEndEqual = value;
	}
	
	/**
	 * OPERATOR_ID: 操作员标识
	 */
	public String getOperatorId() {
		return this.operatorId;
	}
	
	/**
	 * OPERATOR_ID: 操作员标识
	 */
	public void setOperatorId(String value)
	 {
		this.operatorId = value;
	}
	
	/**
	 * 查询条件字符串相等,OPERATOR_ID: 操作员标识
	 */
	public String getOperatorIdEqual() {
		return this.operatorIdEqual;
	}
	
	/**
	 * 查询条件字符串相等,OPERATOR_ID: 操作员标识
	 */
	public void setOperatorIdEqual(String value)
	 {
		this.operatorIdEqual = value;
	}
	
	/**
	 * PASS_RATE: 通过率
	 */
	public Integer getPassRate() {
		return this.passRate;
	}
	
	/**
	 * PASS_RATE: 通过率
	 */
	public void setPassRate(Integer value)
	 {
		this.passRate = value;
	}
	
	/**
	 * 查询条件开始值,PASS_RATE: 通过率
	 */
	public Integer getPassRateBegin() {
		return this.passRateBegin;
	}
	
	/**
	 * 查询条件开始值,PASS_RATE: 通过率
	 */
	public void setPassRateBegin(Integer value)
	 {
		this.passRateBegin = value;
	}
	
	/**
	 * 查询条件结束值,PASS_RATE: 通过率
	 */
	public Integer getPassRateEnd() {
		return this.passRateEnd;
	}
	
	/**
	 * 查询条件结束值,PASS_RATE: 通过率
	 */
	public void setPassRateEnd(Integer value)
	 {
		this.passRateEnd = value;
	}
	
	/**
	 * 查询条件结束值,PASS_RATE: 通过率
	 */
	public Integer getPassRateEndEqual() {
		return this.passRateEndEqual;
	}
	
	/**
	 * 查询条件结束值,PASS_RATE: 通过率
	 */
	public void setPassRateEndEqual(Integer value)
	 {
		this.passRateEndEqual = value;
	}
	
	/**
	 * BEGIN_TIME: 开始时间
	 */
	public java.util.Date getBeginTime() {
		return this.beginTime;
	}
	
	/**
	 * BEGIN_TIME: 开始时间
	 */
	public void setBeginTime(java.util.Date value)
	 {
		this.beginTime = value;
	}
	
	/**
	 * 查询条件开始值,BEGIN_TIME: 开始时间
	 */
	public java.util.Date getBeginTimeBegin() {
		return this.beginTimeBegin;
	}
	
	/**
	 * 查询条件开始值,BEGIN_TIME: 开始时间
	 */
	public void setBeginTimeBegin(java.util.Date value)
	 {
		this.beginTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,BEGIN_TIME: 开始时间
	 */
	public java.util.Date getBeginTimeEnd() {
		return this.beginTimeEnd;
	}
	
	/**
	 * 查询条件结束值,BEGIN_TIME: 开始时间
	 */
	public void setBeginTimeEnd(java.util.Date value)
	 {
		this.beginTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,BEGIN_TIME: 开始时间
	 */
	public java.util.Date getBeginTimeEndEqual() {
		return this.beginTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,BEGIN_TIME: 开始时间
	 */
	public void setBeginTimeEndEqual(java.util.Date value)
	 {
		this.beginTimeEndEqual = value;
	}
	
	/**
	 * END_TIME: 结束时间
	 */
	public java.util.Date getEndTime() {
		return this.endTime;
	}
	
	/**
	 * END_TIME: 结束时间
	 */
	public void setEndTime(java.util.Date value)
	 {
		this.endTime = value;
	}
	
	/**
	 * 查询条件开始值,END_TIME: 结束时间
	 */
	public java.util.Date getEndTimeBegin() {
		return this.endTimeBegin;
	}
	
	/**
	 * 查询条件开始值,END_TIME: 结束时间
	 */
	public void setEndTimeBegin(java.util.Date value)
	 {
		this.endTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,END_TIME: 结束时间
	 */
	public java.util.Date getEndTimeEnd() {
		return this.endTimeEnd;
	}
	
	/**
	 * 查询条件结束值,END_TIME: 结束时间
	 */
	public void setEndTimeEnd(java.util.Date value)
	 {
		this.endTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,END_TIME: 结束时间
	 */
	public java.util.Date getEndTimeEndEqual() {
		return this.endTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,END_TIME: 结束时间
	 */
	public void setEndTimeEndEqual(java.util.Date value)
	 {
		this.endTimeEndEqual = value;
	}
	
	/**
	 * TEST_END: 是否考试结束
	 */
	public Boolean getTestEnd() {
		return this.testEnd;
	}
	
	/**
	 * TEST_END: 是否考试结束
	 */
	public void setTestEnd(Boolean value)
	 {
		this.testEnd = value;
	}
	
	/**
	 * TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public Integer getTotalAnswerSecond() {
		return this.totalAnswerSecond;
	}
	
	/**
	 * TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public void setTotalAnswerSecond(Integer value)
	 {
		this.totalAnswerSecond = value;
	}
	
	/**
	 * 查询条件开始值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public Integer getTotalAnswerSecondBegin() {
		return this.totalAnswerSecondBegin;
	}
	
	/**
	 * 查询条件开始值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public void setTotalAnswerSecondBegin(Integer value)
	 {
		this.totalAnswerSecondBegin = value;
	}
	
	/**
	 * 查询条件结束值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public Integer getTotalAnswerSecondEnd() {
		return this.totalAnswerSecondEnd;
	}
	
	/**
	 * 查询条件结束值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public void setTotalAnswerSecondEnd(Integer value)
	 {
		this.totalAnswerSecondEnd = value;
	}
	
	/**
	 * 查询条件结束值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public Integer getTotalAnswerSecondEndEqual() {
		return this.totalAnswerSecondEndEqual;
	}
	
	/**
	 * 查询条件结束值,TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public void setTotalAnswerSecondEndEqual(Integer value)
	 {
		this.totalAnswerSecondEndEqual = value;
	}
	
	/**
	 * PAPERS_SCORE: 考试成绩
	 */
	public Double getPapersScore() {
		return this.papersScore;
	}
	
	/**
	 * PAPERS_SCORE: 考试成绩
	 */
	public void setPapersScore(Double value)
	 {
		this.papersScore = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_SCORE: 考试成绩
	 */
	public Double getPapersScoreBegin() {
		return this.papersScoreBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_SCORE: 考试成绩
	 */
	public void setPapersScoreBegin(Double value)
	 {
		this.papersScoreBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 考试成绩
	 */
	public Double getPapersScoreEnd() {
		return this.papersScoreEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 考试成绩
	 */
	public void setPapersScoreEnd(Double value)
	 {
		this.papersScoreEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 考试成绩
	 */
	public Double getPapersScoreEndEqual() {
		return this.papersScoreEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_SCORE: 考试成绩
	 */
	public void setPapersScoreEndEqual(Double value)
	 {
		this.papersScoreEndEqual = value;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE_ID: 标识
	 */
	public PapersScoreQueryCondition setPapersScoreIdCondition(Integer value) {
		this.papersScoreId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE_ID: 标识
	 */
	public PapersScoreQueryCondition setPapersScoreIdConditionBegin(Integer value) {
		this.papersScoreIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE_ID: 标识
	 */
	public PapersScoreQueryCondition setPapersScoreIdConditionEnd(Integer value) {
		this.papersScoreIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE_ID: 标识
	 */
	public PapersScoreQueryCondition setPapersScoreIdConditionEndEqual(Integer value) {
		this.papersScoreIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public PapersScoreQueryCondition setPapersIdCondition(Integer value) {
		this.papersId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public PapersScoreQueryCondition setPapersIdConditionBegin(Integer value) {
		this.papersIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public PapersScoreQueryCondition setPapersIdConditionEnd(Integer value) {
		this.papersIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public PapersScoreQueryCondition setPapersIdConditionEndEqual(Integer value) {
		this.papersIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件OPERATOR_ID: 操作员标识
	 */
	public PapersScoreQueryCondition setOperatorIdCondition(String value) {
		this.operatorId = value;
		return this;
	}
	
	/**
	 * 设置查询条件OPERATOR_ID: 操作员标识
	 */
	public PapersScoreQueryCondition setOperatorIdConditionEqual(String value) {
		this.operatorIdEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PASS_RATE: 通过率
	 */
	public PapersScoreQueryCondition setPassRateCondition(Integer value) {
		this.passRate = value;
		return this;
	}
	
	/**
	 * 设置查询条件PASS_RATE: 通过率
	 */
	public PapersScoreQueryCondition setPassRateConditionBegin(Integer value) {
		this.passRateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PASS_RATE: 通过率
	 */
	public PapersScoreQueryCondition setPassRateConditionEnd(Integer value) {
		this.passRateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PASS_RATE: 通过率
	 */
	public PapersScoreQueryCondition setPassRateConditionEndEqual(Integer value) {
		this.passRateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BEGIN_TIME: 开始时间
	 */
	public PapersScoreQueryCondition setBeginTimeCondition(java.util.Date value) {
		this.beginTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件BEGIN_TIME: 开始时间
	 */
	public PapersScoreQueryCondition setBeginTimeConditionBegin(java.util.Date value) {
		this.beginTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BEGIN_TIME: 开始时间
	 */
	public PapersScoreQueryCondition setBeginTimeConditionEnd(java.util.Date value) {
		this.beginTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BEGIN_TIME: 开始时间
	 */
	public PapersScoreQueryCondition setBeginTimeConditionEndEqual(java.util.Date value) {
		this.beginTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_TIME: 结束时间
	 */
	public PapersScoreQueryCondition setEndTimeCondition(java.util.Date value) {
		this.endTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_TIME: 结束时间
	 */
	public PapersScoreQueryCondition setEndTimeConditionBegin(java.util.Date value) {
		this.endTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_TIME: 结束时间
	 */
	public PapersScoreQueryCondition setEndTimeConditionEnd(java.util.Date value) {
		this.endTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件END_TIME: 结束时间
	 */
	public PapersScoreQueryCondition setEndTimeConditionEndEqual(java.util.Date value) {
		this.endTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TEST_END: 是否考试结束
	 */
	public PapersScoreQueryCondition setTestEndCondition(Boolean value) {
		this.testEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public PapersScoreQueryCondition setTotalAnswerSecondCondition(Integer value) {
		this.totalAnswerSecond = value;
		return this;
	}
	
	/**
	 * 设置查询条件TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public PapersScoreQueryCondition setTotalAnswerSecondConditionBegin(Integer value) {
		this.totalAnswerSecondBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public PapersScoreQueryCondition setTotalAnswerSecondConditionEnd(Integer value) {
		this.totalAnswerSecondEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件TOTAL_ANSWER_SECOND: 考试用时,以秒计算
	 */
	public PapersScoreQueryCondition setTotalAnswerSecondConditionEndEqual(Integer value) {
		this.totalAnswerSecondEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE: 考试成绩
	 */
	public PapersScoreQueryCondition setPapersScoreCondition(Double value) {
		this.papersScore = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE: 考试成绩
	 */
	public PapersScoreQueryCondition setPapersScoreConditionBegin(Double value) {
		this.papersScoreBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE: 考试成绩
	 */
	public PapersScoreQueryCondition setPapersScoreConditionEnd(Double value) {
		this.papersScoreEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_SCORE: 考试成绩
	 */
	public PapersScoreQueryCondition setPapersScoreConditionEndEqual(Double value) {
		this.papersScoreEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.papersScoreId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_SCORE].[PAPERS_SCORE_ID] = " + this.papersScoreId) 
						+ ") "));
		}
		if ((this.papersScoreIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_SCORE_ID] >= " 
						+ (this.papersScoreIdBegin + ")")));
		}
		if ((this.papersScoreIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_SCORE_ID] < " 
						+ (this.papersScoreIdEnd + ") ")));
		}
		if ((this.papersScoreIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_SCORE_ID] <= " 
						+ (this.papersScoreIdEndEqual + ") ")));
		}
		if ((this.papersId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_SCORE].[PAPERS_ID] = " + this.papersId) 
						+ ") "));
		}
		if ((this.papersIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_ID] >= " 
						+ (this.papersIdBegin + ")")));
		}
		if ((this.papersIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_ID] < " 
						+ (this.papersIdEnd + ") ")));
		}
		if ((this.papersIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_ID] <= " 
						+ (this.papersIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.operatorId)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_PAPERS_SCORE].[OPERATOR_ID]", this.operatorId)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.operatorIdEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_PAPERS_SCORE].[OPERATOR_ID] = " + SqlServerUtils.safeSql(this.operatorIdEqual))) 
						+ ") "));
		}
		if ((this.passRate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_SCORE].[PASS_RATE] = " + this.passRate) 
						+ ") "));
		}
		if ((this.passRateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PASS_RATE] >= " 
						+ (this.passRateBegin + ")")));
		}
		if ((this.passRateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PASS_RATE] < " 
						+ (this.passRateEnd + ") ")));
		}
		if ((this.passRateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PASS_RATE] <= " 
						+ (this.passRateEndEqual + ") ")));
		}
		if ((this.beginTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_SCORE].[BEGIN_TIME] = " + SqlServerUtils.getDateSql(this.beginTime)) 
						+ ") "));
		}
		if ((this.beginTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[BEGIN_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.beginTimeBegin) + ")")));
		}
		if ((this.beginTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[BEGIN_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.beginTimeEnd) + ") ")));
		}
		if ((this.beginTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[BEGIN_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.beginTimeEndEqual) + ") ")));
		}
		if ((this.endTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_SCORE].[END_TIME] = " + SqlServerUtils.getDateSql(this.endTime)) 
						+ ") "));
		}
		if ((this.endTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[END_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.endTimeBegin) + ")")));
		}
		if ((this.endTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[END_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.endTimeEnd) + ") ")));
		}
		if ((this.endTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[END_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.endTimeEndEqual) + ") ")));
		}
		if ((this.testEnd == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_SCORE].[TEST_END] = " + SqlServerUtils.getBoolSql(this.testEnd)) 
						+ ") "));
		}
		if ((this.totalAnswerSecond == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_SCORE].[TOTAL_ANSWER_SECOND] = " + this.totalAnswerSecond) 
						+ ") "));
		}
		if ((this.totalAnswerSecondBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[TOTAL_ANSWER_SECOND] >= " 
						+ (this.totalAnswerSecondBegin + ")")));
		}
		if ((this.totalAnswerSecondEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[TOTAL_ANSWER_SECOND] < " 
						+ (this.totalAnswerSecondEnd + ") ")));
		}
		if ((this.totalAnswerSecondEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[TOTAL_ANSWER_SECOND] <= " 
						+ (this.totalAnswerSecondEndEqual + ") ")));
		}
		if ((this.papersScore == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_SCORE].[PAPERS_SCORE] = " + this.papersScore) 
						+ ") "));
		}
		if ((this.papersScoreBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_SCORE] >= " 
						+ (this.papersScoreBegin + ")")));
		}
		if ((this.papersScoreEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_SCORE] < " 
						+ (this.papersScoreEnd + ") ")));
		}
		if ((this.papersScoreEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_SCORE].[PAPERS_SCORE] <= " 
						+ (this.papersScoreEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
