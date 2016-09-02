package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_QUESTION_ANSWER查询条件定义
 */
public class QuestionAnswerQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,ANSWER_ID: 答案标识
	 */
	Integer answerId;
	
	/**
	 * 查询条件开始值,ANSWER_ID: 答案标识
	 */
	Integer answerIdBegin;
	
	/**
	 * 查询条件结束值,ANSWER_ID: 答案标识
	 */
	Integer answerIdEnd;
	
	/**
	 * 查询条件结束值,ANSWER_ID: 答案标识
	 */
	Integer answerIdEndEqual;
	
	/**
	 * 查询条件,QUESTION_ID: 题目标识
	 */
	Integer questionId;
	
	/**
	 * 查询条件开始值,QUESTION_ID: 题目标识
	 */
	Integer questionIdBegin;
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	Integer questionIdEnd;
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	Integer questionIdEndEqual;
	
	/**
	 * 查询条件,QUESTION_CONTENT: 答案内容
	 */
	String questionContent;
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 答案内容
	 */
	String questionContentEqual;
	
	/**
	 * 查询条件,IS_ANSWER: 是否是正确答案
	 */
	Boolean isAnswer;
	
	/**
	 * 查询条件,ANSWER_ORDER: 答案顺序
	 */
	Integer answerOrder;
	
	/**
	 * 查询条件开始值,ANSWER_ORDER: 答案顺序
	 */
	Integer answerOrderBegin;
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 答案顺序
	 */
	Integer answerOrderEnd;
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 答案顺序
	 */
	Integer answerOrderEndEqual;
	
	/**
	 * ANSWER_ID: 答案标识
	 */
	public Integer getAnswerId() {
		return this.answerId;
	}
	
	/**
	 * ANSWER_ID: 答案标识
	 */
	public void setAnswerId(Integer value)
	 {
		this.answerId = value;
	}
	
	/**
	 * 查询条件开始值,ANSWER_ID: 答案标识
	 */
	public Integer getAnswerIdBegin() {
		return this.answerIdBegin;
	}
	
	/**
	 * 查询条件开始值,ANSWER_ID: 答案标识
	 */
	public void setAnswerIdBegin(Integer value)
	 {
		this.answerIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ID: 答案标识
	 */
	public Integer getAnswerIdEnd() {
		return this.answerIdEnd;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ID: 答案标识
	 */
	public void setAnswerIdEnd(Integer value)
	 {
		this.answerIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ID: 答案标识
	 */
	public Integer getAnswerIdEndEqual() {
		return this.answerIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ID: 答案标识
	 */
	public void setAnswerIdEndEqual(Integer value)
	 {
		this.answerIdEndEqual = value;
	}
	
	/**
	 * QUESTION_ID: 题目标识
	 */
	public Integer getQuestionId() {
		return this.questionId;
	}
	
	/**
	 * QUESTION_ID: 题目标识
	 */
	public void setQuestionId(Integer value)
	 {
		this.questionId = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_ID: 题目标识
	 */
	public Integer getQuestionIdBegin() {
		return this.questionIdBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_ID: 题目标识
	 */
	public void setQuestionIdBegin(Integer value)
	 {
		this.questionIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	public Integer getQuestionIdEnd() {
		return this.questionIdEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	public void setQuestionIdEnd(Integer value)
	 {
		this.questionIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	public Integer getQuestionIdEndEqual() {
		return this.questionIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_ID: 题目标识
	 */
	public void setQuestionIdEndEqual(Integer value)
	 {
		this.questionIdEndEqual = value;
	}
	
	/**
	 * QUESTION_CONTENT: 答案内容
	 */
	public String getQuestionContent() {
		return this.questionContent;
	}
	
	/**
	 * QUESTION_CONTENT: 答案内容
	 */
	public void setQuestionContent(String value)
	 {
		this.questionContent = value;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 答案内容
	 */
	public String getQuestionContentEqual() {
		return this.questionContentEqual;
	}
	
	/**
	 * 查询条件字符串相等,QUESTION_CONTENT: 答案内容
	 */
	public void setQuestionContentEqual(String value)
	 {
		this.questionContentEqual = value;
	}
	
	/**
	 * IS_ANSWER: 是否是正确答案
	 */
	public Boolean getIsAnswer() {
		return this.isAnswer;
	}
	
	/**
	 * IS_ANSWER: 是否是正确答案
	 */
	public void setIsAnswer(Boolean value)
	 {
		this.isAnswer = value;
	}
	
	/**
	 * ANSWER_ORDER: 答案顺序
	 */
	public Integer getAnswerOrder() {
		return this.answerOrder;
	}
	
	/**
	 * ANSWER_ORDER: 答案顺序
	 */
	public void setAnswerOrder(Integer value)
	 {
		this.answerOrder = value;
	}
	
	/**
	 * 查询条件开始值,ANSWER_ORDER: 答案顺序
	 */
	public Integer getAnswerOrderBegin() {
		return this.answerOrderBegin;
	}
	
	/**
	 * 查询条件开始值,ANSWER_ORDER: 答案顺序
	 */
	public void setAnswerOrderBegin(Integer value)
	 {
		this.answerOrderBegin = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 答案顺序
	 */
	public Integer getAnswerOrderEnd() {
		return this.answerOrderEnd;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 答案顺序
	 */
	public void setAnswerOrderEnd(Integer value)
	 {
		this.answerOrderEnd = value;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 答案顺序
	 */
	public Integer getAnswerOrderEndEqual() {
		return this.answerOrderEndEqual;
	}
	
	/**
	 * 查询条件结束值,ANSWER_ORDER: 答案顺序
	 */
	public void setAnswerOrderEndEqual(Integer value)
	 {
		this.answerOrderEndEqual = value;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 答案标识
	 */
	public QuestionAnswerQueryCondition setAnswerIdCondition(Integer value) {
		this.answerId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 答案标识
	 */
	public QuestionAnswerQueryCondition setAnswerIdConditionBegin(Integer value) {
		this.answerIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 答案标识
	 */
	public QuestionAnswerQueryCondition setAnswerIdConditionEnd(Integer value) {
		this.answerIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 答案标识
	 */
	public QuestionAnswerQueryCondition setAnswerIdConditionEndEqual(Integer value) {
		this.answerIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public QuestionAnswerQueryCondition setQuestionIdCondition(Integer value) {
		this.questionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public QuestionAnswerQueryCondition setQuestionIdConditionBegin(Integer value) {
		this.questionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public QuestionAnswerQueryCondition setQuestionIdConditionEnd(Integer value) {
		this.questionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public QuestionAnswerQueryCondition setQuestionIdConditionEndEqual(Integer value) {
		this.questionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 答案内容
	 */
	public QuestionAnswerQueryCondition setQuestionContentCondition(String value) {
		this.questionContent = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_CONTENT: 答案内容
	 */
	public QuestionAnswerQueryCondition setQuestionContentConditionEqual(String value) {
		this.questionContentEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件IS_ANSWER: 是否是正确答案
	 */
	public QuestionAnswerQueryCondition setIsAnswerCondition(Boolean value) {
		this.isAnswer = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ORDER: 答案顺序
	 */
	public QuestionAnswerQueryCondition setAnswerOrderCondition(Integer value) {
		this.answerOrder = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ORDER: 答案顺序
	 */
	public QuestionAnswerQueryCondition setAnswerOrderConditionBegin(Integer value) {
		this.answerOrderBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ORDER: 答案顺序
	 */
	public QuestionAnswerQueryCondition setAnswerOrderConditionEnd(Integer value) {
		this.answerOrderEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ORDER: 答案顺序
	 */
	public QuestionAnswerQueryCondition setAnswerOrderConditionEndEqual(Integer value) {
		this.answerOrderEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.answerId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_ANSWER].[ANSWER_ID] = " + this.answerId) 
						+ ") "));
		}
		if ((this.answerIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[ANSWER_ID] >= " 
						+ (this.answerIdBegin + ")")));
		}
		if ((this.answerIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[ANSWER_ID] < " 
						+ (this.answerIdEnd + ") ")));
		}
		if ((this.answerIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[ANSWER_ID] <= " 
						+ (this.answerIdEndEqual + ") ")));
		}
		if ((this.questionId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_ANSWER].[QUESTION_ID] = " + this.questionId) 
						+ ") "));
		}
		if ((this.questionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[QUESTION_ID] >= " 
						+ (this.questionIdBegin + ")")));
		}
		if ((this.questionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[QUESTION_ID] < " 
						+ (this.questionIdEnd + ") ")));
		}
		if ((this.questionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[QUESTION_ID] <= " 
						+ (this.questionIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.questionContent)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_QUESTION_ANSWER].[QUESTION_CONTENT]", this.questionContent)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.questionContentEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_QUESTION_ANSWER].[QUESTION_CONTENT] = " + SqlServerUtils.safeSql(this.questionContentEqual))) 
						+ ") "));
		}
		if ((this.isAnswer == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_ANSWER].[IS_ANSWER] = " + SqlServerUtils.getBoolSql(this.isAnswer)) 
						+ ") "));
		}
		if ((this.answerOrder == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_ANSWER].[ANSWER_ORDER] = " + this.answerOrder) 
						+ ") "));
		}
		if ((this.answerOrderBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[ANSWER_ORDER] >= " 
						+ (this.answerOrderBegin + ")")));
		}
		if ((this.answerOrderEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[ANSWER_ORDER] < " 
						+ (this.answerOrderEnd + ") ")));
		}
		if ((this.answerOrderEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_ANSWER].[ANSWER_ORDER] <= " 
						+ (this.answerOrderEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
