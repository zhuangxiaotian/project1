package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PAPERS_RESULT查询条件定义
 */
public class PapersResultQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PAPERS_RESULT_ID: 回答标识
	 */
	Integer papersResultId;
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_ID: 回答标识
	 */
	Integer papersResultIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 回答标识
	 */
	Integer papersResultIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 回答标识
	 */
	Integer papersResultIdEndEqual;
	
	/**
	 * 查询条件,TESTER_NAME: testername
	 */
	String testerName;
	
	/**
	 * 查询条件字符串相等,TESTER_NAME: testername
	 */
	String testerNameEqual;
	
	/**
	 * 查询条件,PAPERS_QUESTION_ID: 考题标识
	 */
	Integer papersQuestionId;
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 考题标识
	 */
	Integer papersQuestionIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 考题标识
	 */
	Integer papersQuestionIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 考题标识
	 */
	Integer papersQuestionIdEndEqual;
	
	/**
	 * 查询条件,ANSWER_CORRECT: 回答正确否
	 */
	Boolean answerCorrect;
	
	/**
	 * 查询条件,ANSWER_TIME: 回答时间
	 */
	java.util.Date answerTime;
	
	/**
	 * 查询条件开始值,ANSWER_TIME: 回答时间
	 */
	java.util.Date answerTimeBegin;
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 回答时间
	 */
	java.util.Date answerTimeEnd;
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 回答时间
	 */
	java.util.Date answerTimeEndEqual;
	
	/**
	 * 查询条件,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	Integer answerSecond;
	
	/**
	 * 查询条件开始值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	Integer answerSecondBegin;
	
	/**
	 * 查询条件结束值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	Integer answerSecondEnd;
	
	/**
	 * 查询条件结束值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	Integer answerSecondEndEqual;
	
	/**
	 * PAPERS_RESULT_ID: 回答标识
	 */
	public Integer getPapersResultId() {
		return this.papersResultId;
	}
	
	/**
	 * PAPERS_RESULT_ID: 回答标识
	 */
	public void setPapersResultId(Integer value)
	 {
		this.papersResultId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_ID: 回答标识
	 */
	public Integer getPapersResultIdBegin() {
		return this.papersResultIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_ID: 回答标识
	 */
	public void setPapersResultIdBegin(Integer value)
	 {
		this.papersResultIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 回答标识
	 */
	public Integer getPapersResultIdEnd() {
		return this.papersResultIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 回答标识
	 */
	public void setPapersResultIdEnd(Integer value)
	 {
		this.papersResultIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 回答标识
	 */
	public Integer getPapersResultIdEndEqual() {
		return this.papersResultIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 回答标识
	 */
	public void setPapersResultIdEndEqual(Integer value)
	 {
		this.papersResultIdEndEqual = value;
	}
	
	/**
	 * TESTER_NAME: testername
	 */
	public String getTesterName() {
		return this.testerName;
	}
	
	/**
	 * TESTER_NAME: testername
	 */
	public void setTesterName(String value)
	 {
		this.testerName = value;
	}
	
	/**
	 * 查询条件字符串相等,TESTER_NAME: testername
	 */
	public String getTesterNameEqual() {
		return this.testerNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,TESTER_NAME: testername
	 */
	public void setTesterNameEqual(String value)
	 {
		this.testerNameEqual = value;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 考题标识
	 */
	public Integer getPapersQuestionId() {
		return this.papersQuestionId;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 考题标识
	 */
	public void setPapersQuestionId(Integer value)
	 {
		this.papersQuestionId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 考题标识
	 */
	public Integer getPapersQuestionIdBegin() {
		return this.papersQuestionIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 考题标识
	 */
	public void setPapersQuestionIdBegin(Integer value)
	 {
		this.papersQuestionIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 考题标识
	 */
	public Integer getPapersQuestionIdEnd() {
		return this.papersQuestionIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 考题标识
	 */
	public void setPapersQuestionIdEnd(Integer value)
	 {
		this.papersQuestionIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 考题标识
	 */
	public Integer getPapersQuestionIdEndEqual() {
		return this.papersQuestionIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 考题标识
	 */
	public void setPapersQuestionIdEndEqual(Integer value)
	 {
		this.papersQuestionIdEndEqual = value;
	}
	
	/**
	 * ANSWER_CORRECT: 回答正确否
	 */
	public Boolean getAnswerCorrect() {
		return this.answerCorrect;
	}
	
	/**
	 * ANSWER_CORRECT: 回答正确否
	 */
	public void setAnswerCorrect(Boolean value)
	 {
		this.answerCorrect = value;
	}
	
	/**
	 * ANSWER_TIME: 回答时间
	 */
	public java.util.Date getAnswerTime() {
		return this.answerTime;
	}
	
	/**
	 * ANSWER_TIME: 回答时间
	 */
	public void setAnswerTime(java.util.Date value)
	 {
		this.answerTime = value;
	}
	
	/**
	 * 查询条件开始值,ANSWER_TIME: 回答时间
	 */
	public java.util.Date getAnswerTimeBegin() {
		return this.answerTimeBegin;
	}
	
	/**
	 * 查询条件开始值,ANSWER_TIME: 回答时间
	 */
	public void setAnswerTimeBegin(java.util.Date value)
	 {
		this.answerTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 回答时间
	 */
	public java.util.Date getAnswerTimeEnd() {
		return this.answerTimeEnd;
	}
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 回答时间
	 */
	public void setAnswerTimeEnd(java.util.Date value)
	 {
		this.answerTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 回答时间
	 */
	public java.util.Date getAnswerTimeEndEqual() {
		return this.answerTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 回答时间
	 */
	public void setAnswerTimeEndEqual(java.util.Date value)
	 {
		this.answerTimeEndEqual = value;
	}
	
	/**
	 * ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public Integer getAnswerSecond() {
		return this.answerSecond;
	}
	
	/**
	 * ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public void setAnswerSecond(Integer value)
	 {
		this.answerSecond = value;
	}
	
	/**
	 * 查询条件开始值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public Integer getAnswerSecondBegin() {
		return this.answerSecondBegin;
	}
	
	/**
	 * 查询条件开始值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public void setAnswerSecondBegin(Integer value)
	 {
		this.answerSecondBegin = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public Integer getAnswerSecondEnd() {
		return this.answerSecondEnd;
	}
	
	/**
	 * 查询条件结束值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public void setAnswerSecondEnd(Integer value)
	 {
		this.answerSecondEnd = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public Integer getAnswerSecondEndEqual() {
		return this.answerSecondEndEqual;
	}
	
	/**
	 * 查询条件结束值,ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public void setAnswerSecondEndEqual(Integer value)
	 {
		this.answerSecondEndEqual = value;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 回答标识
	 */
	public PapersResultQueryCondition setPapersResultIdCondition(Integer value) {
		this.papersResultId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 回答标识
	 */
	public PapersResultQueryCondition setPapersResultIdConditionBegin(Integer value) {
		this.papersResultIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 回答标识
	 */
	public PapersResultQueryCondition setPapersResultIdConditionEnd(Integer value) {
		this.papersResultIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 回答标识
	 */
	public PapersResultQueryCondition setPapersResultIdConditionEndEqual(Integer value) {
		this.papersResultIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TESTER_NAME: testername
	 */
	public PapersResultQueryCondition setTesterNameCondition(String value) {
		this.testerName = value;
		return this;
	}
	
	/**
	 * 设置查询条件TESTER_NAME: testername
	 */
	public PapersResultQueryCondition setTesterNameConditionEqual(String value) {
		this.testerNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 考题标识
	 */
	public PapersResultQueryCondition setPapersQuestionIdCondition(Integer value) {
		this.papersQuestionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 考题标识
	 */
	public PapersResultQueryCondition setPapersQuestionIdConditionBegin(Integer value) {
		this.papersQuestionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 考题标识
	 */
	public PapersResultQueryCondition setPapersQuestionIdConditionEnd(Integer value) {
		this.papersQuestionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 考题标识
	 */
	public PapersResultQueryCondition setPapersQuestionIdConditionEndEqual(Integer value) {
		this.papersQuestionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_CORRECT: 回答正确否
	 */
	public PapersResultQueryCondition setAnswerCorrectCondition(Boolean value) {
		this.answerCorrect = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_TIME: 回答时间
	 */
	public PapersResultQueryCondition setAnswerTimeCondition(java.util.Date value) {
		this.answerTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_TIME: 回答时间
	 */
	public PapersResultQueryCondition setAnswerTimeConditionBegin(java.util.Date value) {
		this.answerTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_TIME: 回答时间
	 */
	public PapersResultQueryCondition setAnswerTimeConditionEnd(java.util.Date value) {
		this.answerTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_TIME: 回答时间
	 */
	public PapersResultQueryCondition setAnswerTimeConditionEndEqual(java.util.Date value) {
		this.answerTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public PapersResultQueryCondition setAnswerSecondCondition(Integer value) {
		this.answerSecond = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public PapersResultQueryCondition setAnswerSecondConditionBegin(Integer value) {
		this.answerSecondBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public PapersResultQueryCondition setAnswerSecondConditionEnd(Integer value) {
		this.answerSecondEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_SECOND: 答题用时,以秒为单位
	 */
	public PapersResultQueryCondition setAnswerSecondConditionEndEqual(Integer value) {
		this.answerSecondEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.papersResultId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_RESULT].[PAPERS_RESULT_ID] = " + this.papersResultId) 
						+ ") "));
		}
		if ((this.papersResultIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[PAPERS_RESULT_ID] >= " 
						+ (this.papersResultIdBegin + ")")));
		}
		if ((this.papersResultIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[PAPERS_RESULT_ID] < " 
						+ (this.papersResultIdEnd + ") ")));
		}
		if ((this.papersResultIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[PAPERS_RESULT_ID] <= " 
						+ (this.papersResultIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.testerName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_PAPERS_RESULT].[TESTER_NAME]", this.testerName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testerNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_PAPERS_RESULT].[TESTER_NAME] = " + SqlServerUtils.safeSql(this.testerNameEqual))) 
						+ ") "));
		}
		if ((this.papersQuestionId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_RESULT].[PAPERS_QUESTION_ID] = " + this.papersQuestionId) 
						+ ") "));
		}
		if ((this.papersQuestionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[PAPERS_QUESTION_ID] >= " 
						+ (this.papersQuestionIdBegin + ")")));
		}
		if ((this.papersQuestionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[PAPERS_QUESTION_ID] < " 
						+ (this.papersQuestionIdEnd + ") ")));
		}
		if ((this.papersQuestionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[PAPERS_QUESTION_ID] <= " 
						+ (this.papersQuestionIdEndEqual + ") ")));
		}
		if ((this.answerCorrect == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_RESULT].[ANSWER_CORRECT] = " + SqlServerUtils.getBoolSql(this.answerCorrect)) 
						+ ") "));
		}
		if ((this.answerTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_RESULT].[ANSWER_TIME] = " + SqlServerUtils.getDateSql(this.answerTime)) 
						+ ") "));
		}
		if ((this.answerTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[ANSWER_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.answerTimeBegin) + ")")));
		}
		if ((this.answerTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[ANSWER_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.answerTimeEnd) + ") ")));
		}
		if ((this.answerTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[ANSWER_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.answerTimeEndEqual) + ") ")));
		}
		if ((this.answerSecond == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_RESULT].[ANSWER_SECOND] = " + this.answerSecond) 
						+ ") "));
		}
		if ((this.answerSecondBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[ANSWER_SECOND] >= " 
						+ (this.answerSecondBegin + ")")));
		}
		if ((this.answerSecondEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[ANSWER_SECOND] < " 
						+ (this.answerSecondEnd + ") ")));
		}
		if ((this.answerSecondEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT].[ANSWER_SECOND] <= " 
						+ (this.answerSecondEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
