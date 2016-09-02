package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * V_TEST_PAPERS_RESULT查询条件定义
 */
public class VTestPapersResultQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionId;
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	Integer papersQuestionIdEndEqual;
	
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
	 * 查询条件,QUESTION_ID: 
	 */
	Integer questionId;
	
	/**
	 * 查询条件开始值,QUESTION_ID: 
	 */
	Integer questionIdBegin;
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	Integer questionIdEnd;
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	Integer questionIdEndEqual;
	
	/**
	 * 查询条件,QUESTION_SN: 
	 */
	Integer questionSn;
	
	/**
	 * 查询条件开始值,QUESTION_SN: 
	 */
	Integer questionSnBegin;
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	Integer questionSnEnd;
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	Integer questionSnEndEqual;
	
	/**
	 * 查询条件,ANSWER_CORRECT: 
	 */
	Boolean answerCorrect;
	
	/**
	 * 查询条件,ANSWER_TIME: 
	 */
	java.util.Date answerTime;
	
	/**
	 * 查询条件开始值,ANSWER_TIME: 
	 */
	java.util.Date answerTimeBegin;
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 
	 */
	java.util.Date answerTimeEnd;
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 
	 */
	java.util.Date answerTimeEndEqual;
	
	/**
	 * 查询条件,PAPERS_RESULT_ID: 
	 */
	Integer papersResultId;
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_ID: 
	 */
	Integer papersResultIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 
	 */
	Integer papersResultIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 
	 */
	Integer papersResultIdEndEqual;
	
	/**
	 * 查询条件,PAPERS_NAME: 
	 */
	String papersName;
	
	/**
	 * 查询条件字符串相等,PAPERS_NAME: 
	 */
	String papersNameEqual;
	
	/**
	 * 查询条件,TESTER_NAME: 
	 */
	String testerName;
	
	/**
	 * 查询条件字符串相等,TESTER_NAME: 
	 */
	String testerNameEqual;
	
	/**
	 * 查询条件,QUESTION_TYPE: 
	 */
	Byte questionType;
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 
	 */
	Byte questionTypeBegin;
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	Byte questionTypeEnd;
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	Byte questionTypeEndEqual;
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionId() {
		return this.papersQuestionId;
	}
	
	/**
	 * PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionId(Integer value)
	 {
		this.papersQuestionId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionIdBegin() {
		return this.papersQuestionIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionIdBegin(Integer value)
	 {
		this.papersQuestionIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionIdEnd() {
		return this.papersQuestionIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionIdEnd(Integer value)
	 {
		this.papersQuestionIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	public Integer getPapersQuestionIdEndEqual() {
		return this.papersQuestionIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_QUESTION_ID: 
	 */
	public void setPapersQuestionIdEndEqual(Integer value)
	 {
		this.papersQuestionIdEndEqual = value;
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
	 * QUESTION_ID: 
	 */
	public Integer getQuestionId() {
		return this.questionId;
	}
	
	/**
	 * QUESTION_ID: 
	 */
	public void setQuestionId(Integer value)
	 {
		this.questionId = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_ID: 
	 */
	public Integer getQuestionIdBegin() {
		return this.questionIdBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_ID: 
	 */
	public void setQuestionIdBegin(Integer value)
	 {
		this.questionIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	public Integer getQuestionIdEnd() {
		return this.questionIdEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	public void setQuestionIdEnd(Integer value)
	 {
		this.questionIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	public Integer getQuestionIdEndEqual() {
		return this.questionIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 
	 */
	public void setQuestionIdEndEqual(Integer value)
	 {
		this.questionIdEndEqual = value;
	}
	
	/**
	 * QUESTION_SN: 
	 */
	public Integer getQuestionSn() {
		return this.questionSn;
	}
	
	/**
	 * QUESTION_SN: 
	 */
	public void setQuestionSn(Integer value)
	 {
		this.questionSn = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_SN: 
	 */
	public Integer getQuestionSnBegin() {
		return this.questionSnBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_SN: 
	 */
	public void setQuestionSnBegin(Integer value)
	 {
		this.questionSnBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	public Integer getQuestionSnEnd() {
		return this.questionSnEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	public void setQuestionSnEnd(Integer value)
	 {
		this.questionSnEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	public Integer getQuestionSnEndEqual() {
		return this.questionSnEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 
	 */
	public void setQuestionSnEndEqual(Integer value)
	 {
		this.questionSnEndEqual = value;
	}
	
	/**
	 * ANSWER_CORRECT: 
	 */
	public Boolean getAnswerCorrect() {
		return this.answerCorrect;
	}
	
	/**
	 * ANSWER_CORRECT: 
	 */
	public void setAnswerCorrect(Boolean value)
	 {
		this.answerCorrect = value;
	}
	
	/**
	 * ANSWER_TIME: 
	 */
	public java.util.Date getAnswerTime() {
		return this.answerTime;
	}
	
	/**
	 * ANSWER_TIME: 
	 */
	public void setAnswerTime(java.util.Date value)
	 {
		this.answerTime = value;
	}
	
	/**
	 * 查询条件开始值,ANSWER_TIME: 
	 */
	public java.util.Date getAnswerTimeBegin() {
		return this.answerTimeBegin;
	}
	
	/**
	 * 查询条件开始值,ANSWER_TIME: 
	 */
	public void setAnswerTimeBegin(java.util.Date value)
	 {
		this.answerTimeBegin = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 
	 */
	public java.util.Date getAnswerTimeEnd() {
		return this.answerTimeEnd;
	}
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 
	 */
	public void setAnswerTimeEnd(java.util.Date value)
	 {
		this.answerTimeEnd = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 
	 */
	public java.util.Date getAnswerTimeEndEqual() {
		return this.answerTimeEndEqual;
	}
	
	/**
	 * 查询条件结束值,ANSWER_TIME: 
	 */
	public void setAnswerTimeEndEqual(java.util.Date value)
	 {
		this.answerTimeEndEqual = value;
	}
	
	/**
	 * PAPERS_RESULT_ID: 
	 */
	public Integer getPapersResultId() {
		return this.papersResultId;
	}
	
	/**
	 * PAPERS_RESULT_ID: 
	 */
	public void setPapersResultId(Integer value)
	 {
		this.papersResultId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_ID: 
	 */
	public Integer getPapersResultIdBegin() {
		return this.papersResultIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_ID: 
	 */
	public void setPapersResultIdBegin(Integer value)
	 {
		this.papersResultIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 
	 */
	public Integer getPapersResultIdEnd() {
		return this.papersResultIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 
	 */
	public void setPapersResultIdEnd(Integer value)
	 {
		this.papersResultIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 
	 */
	public Integer getPapersResultIdEndEqual() {
		return this.papersResultIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_ID: 
	 */
	public void setPapersResultIdEndEqual(Integer value)
	 {
		this.papersResultIdEndEqual = value;
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
	 * TESTER_NAME: 
	 */
	public String getTesterName() {
		return this.testerName;
	}
	
	/**
	 * TESTER_NAME: 
	 */
	public void setTesterName(String value)
	 {
		this.testerName = value;
	}
	
	/**
	 * 查询条件字符串相等,TESTER_NAME: 
	 */
	public String getTesterNameEqual() {
		return this.testerNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,TESTER_NAME: 
	 */
	public void setTesterNameEqual(String value)
	 {
		this.testerNameEqual = value;
	}
	
	/**
	 * QUESTION_TYPE: 
	 */
	public Byte getQuestionType() {
		return this.questionType;
	}
	
	/**
	 * QUESTION_TYPE: 
	 */
	public void setQuestionType(Byte value)
	 {
		this.questionType = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 
	 */
	public Byte getQuestionTypeBegin() {
		return this.questionTypeBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_TYPE: 
	 */
	public void setQuestionTypeBegin(Byte value)
	 {
		this.questionTypeBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	public Byte getQuestionTypeEnd() {
		return this.questionTypeEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	public void setQuestionTypeEnd(Byte value)
	 {
		this.questionTypeEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	public Byte getQuestionTypeEndEqual() {
		return this.questionTypeEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_TYPE: 
	 */
	public void setQuestionTypeEndEqual(Byte value)
	 {
		this.questionTypeEndEqual = value;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersQuestionIdCondition(Integer value) {
		this.papersQuestionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersQuestionIdConditionBegin(Integer value) {
		this.papersQuestionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersQuestionIdConditionEnd(Integer value) {
		this.papersQuestionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersQuestionIdConditionEndEqual(Integer value) {
		this.papersQuestionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersIdCondition(Integer value) {
		this.papersId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersIdConditionBegin(Integer value) {
		this.papersIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersIdConditionEnd(Integer value) {
		this.papersIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersIdConditionEndEqual(Integer value) {
		this.papersIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VTestPapersResultQueryCondition setQuestionIdCondition(Integer value) {
		this.questionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VTestPapersResultQueryCondition setQuestionIdConditionBegin(Integer value) {
		this.questionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VTestPapersResultQueryCondition setQuestionIdConditionEnd(Integer value) {
		this.questionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 
	 */
	public VTestPapersResultQueryCondition setQuestionIdConditionEndEqual(Integer value) {
		this.questionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 
	 */
	public VTestPapersResultQueryCondition setQuestionSnCondition(Integer value) {
		this.questionSn = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 
	 */
	public VTestPapersResultQueryCondition setQuestionSnConditionBegin(Integer value) {
		this.questionSnBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 
	 */
	public VTestPapersResultQueryCondition setQuestionSnConditionEnd(Integer value) {
		this.questionSnEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 
	 */
	public VTestPapersResultQueryCondition setQuestionSnConditionEndEqual(Integer value) {
		this.questionSnEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_CORRECT: 
	 */
	public VTestPapersResultQueryCondition setAnswerCorrectCondition(Boolean value) {
		this.answerCorrect = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_TIME: 
	 */
	public VTestPapersResultQueryCondition setAnswerTimeCondition(java.util.Date value) {
		this.answerTime = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_TIME: 
	 */
	public VTestPapersResultQueryCondition setAnswerTimeConditionBegin(java.util.Date value) {
		this.answerTimeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_TIME: 
	 */
	public VTestPapersResultQueryCondition setAnswerTimeConditionEnd(java.util.Date value) {
		this.answerTimeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_TIME: 
	 */
	public VTestPapersResultQueryCondition setAnswerTimeConditionEndEqual(java.util.Date value) {
		this.answerTimeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersResultIdCondition(Integer value) {
		this.papersResultId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersResultIdConditionBegin(Integer value) {
		this.papersResultIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersResultIdConditionEnd(Integer value) {
		this.papersResultIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 
	 */
	public VTestPapersResultQueryCondition setPapersResultIdConditionEndEqual(Integer value) {
		this.papersResultIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_NAME: 
	 */
	public VTestPapersResultQueryCondition setPapersNameCondition(String value) {
		this.papersName = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_NAME: 
	 */
	public VTestPapersResultQueryCondition setPapersNameConditionEqual(String value) {
		this.papersNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件TESTER_NAME: 
	 */
	public VTestPapersResultQueryCondition setTesterNameCondition(String value) {
		this.testerName = value;
		return this;
	}
	
	/**
	 * 设置查询条件TESTER_NAME: 
	 */
	public VTestPapersResultQueryCondition setTesterNameConditionEqual(String value) {
		this.testerNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VTestPapersResultQueryCondition setQuestionTypeCondition(Byte value) {
		this.questionType = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VTestPapersResultQueryCondition setQuestionTypeConditionBegin(Byte value) {
		this.questionTypeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VTestPapersResultQueryCondition setQuestionTypeConditionEnd(Byte value) {
		this.questionTypeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_TYPE: 
	 */
	public VTestPapersResultQueryCondition setQuestionTypeConditionEndEqual(Byte value) {
		this.questionTypeEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.papersQuestionId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_RESULT].[PAPERS_QUESTION_ID] = " + this.papersQuestionId) 
						+ ") "));
		}
		if ((this.papersQuestionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_QUESTION_ID] >= " 
						+ (this.papersQuestionIdBegin + ")")));
		}
		if ((this.papersQuestionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_QUESTION_ID] < " 
						+ (this.papersQuestionIdEnd + ") ")));
		}
		if ((this.papersQuestionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_QUESTION_ID] <= " 
						+ (this.papersQuestionIdEndEqual + ") ")));
		}
		if ((this.papersId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_RESULT].[PAPERS_ID] = " + this.papersId) 
						+ ") "));
		}
		if ((this.papersIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_ID] >= " 
						+ (this.papersIdBegin + ")")));
		}
		if ((this.papersIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_ID] < " 
						+ (this.papersIdEnd + ") ")));
		}
		if ((this.papersIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_ID] <= " 
						+ (this.papersIdEndEqual + ") ")));
		}
		if ((this.questionId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_RESULT].[QUESTION_ID] = " + this.questionId) 
						+ ") "));
		}
		if ((this.questionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_ID] >= " 
						+ (this.questionIdBegin + ")")));
		}
		if ((this.questionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_ID] < " 
						+ (this.questionIdEnd + ") ")));
		}
		if ((this.questionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_ID] <= " 
						+ (this.questionIdEndEqual + ") ")));
		}
		if ((this.questionSn == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_RESULT].[QUESTION_SN] = " + this.questionSn) 
						+ ") "));
		}
		if ((this.questionSnBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_SN] >= " 
						+ (this.questionSnBegin + ")")));
		}
		if ((this.questionSnEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_SN] < " 
						+ (this.questionSnEnd + ") ")));
		}
		if ((this.questionSnEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_SN] <= " 
						+ (this.questionSnEndEqual + ") ")));
		}
		if ((this.answerCorrect == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_RESULT].[ANSWER_CORRECT] = " + SqlServerUtils.getBoolSql(this.answerCorrect)) 
						+ ") "));
		}
		if ((this.answerTime == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_RESULT].[ANSWER_TIME] = " + SqlServerUtils.getDateSql(this.answerTime)) 
						+ ") "));
		}
		if ((this.answerTimeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[ANSWER_TIME] >= " 
						+ (SqlServerUtils.getDateSql(this.answerTimeBegin) + ")")));
		}
		if ((this.answerTimeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[ANSWER_TIME] < " 
						+ (SqlServerUtils.getDateSql(this.answerTimeEnd) + ") ")));
		}
		if ((this.answerTimeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[ANSWER_TIME] < " 
						+ (SqlServerUtils.getNextDateSql(this.answerTimeEndEqual) + ") ")));
		}
		if ((this.papersResultId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_RESULT].[PAPERS_RESULT_ID] = " + this.papersResultId) 
						+ ") "));
		}
		if ((this.papersResultIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_RESULT_ID] >= " 
						+ (this.papersResultIdBegin + ")")));
		}
		if ((this.papersResultIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_RESULT_ID] < " 
						+ (this.papersResultIdEnd + ") ")));
		}
		if ((this.papersResultIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[PAPERS_RESULT_ID] <= " 
						+ (this.papersResultIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.papersName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_TEST_PAPERS_RESULT].[PAPERS_NAME]", this.papersName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.papersNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_TEST_PAPERS_RESULT].[PAPERS_NAME] = " + SqlServerUtils.safeSql(this.papersNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testerName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[V_TEST_PAPERS_RESULT].[TESTER_NAME]", this.testerName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.testerNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[V_TEST_PAPERS_RESULT].[TESTER_NAME] = " + SqlServerUtils.safeSql(this.testerNameEqual))) 
						+ ") "));
		}
		if ((this.questionType == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([V_TEST_PAPERS_RESULT].[QUESTION_TYPE] = " + this.questionType) 
						+ ") "));
		}
		if ((this.questionTypeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_TYPE] >= " 
						+ (this.questionTypeBegin + ")")));
		}
		if ((this.questionTypeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_TYPE] < " 
						+ (this.questionTypeEnd + ") ")));
		}
		if ((this.questionTypeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([V_TEST_PAPERS_RESULT].[QUESTION_TYPE] <= " 
						+ (this.questionTypeEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
