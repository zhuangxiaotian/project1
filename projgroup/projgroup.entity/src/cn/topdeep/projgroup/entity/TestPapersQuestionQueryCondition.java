package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PAPERS_QUESTION查询条件定义
 */
public class TestPapersQuestionQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,QUESTION_SN: 考题序号
	 */
	Integer questionSn;
	
	/**
	 * 查询条件开始值,QUESTION_SN: 考题序号
	 */
	Integer questionSnBegin;
	
	/**
	 * 查询条件结束值,QUESTION_SN: 考题序号
	 */
	Integer questionSnEnd;
	
	/**
	 * 查询条件结束值,QUESTION_SN: 考题序号
	 */
	Integer questionSnEndEqual;
	
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
	 * QUESTION_SN: 考题序号
	 */
	public Integer getQuestionSn() {
		return this.questionSn;
	}
	
	/**
	 * QUESTION_SN: 考题序号
	 */
	public void setQuestionSn(Integer value)
	 {
		this.questionSn = value;
	}
	
	/**
	 * 查询条件开始值,QUESTION_SN: 考题序号
	 */
	public Integer getQuestionSnBegin() {
		return this.questionSnBegin;
	}
	
	/**
	 * 查询条件开始值,QUESTION_SN: 考题序号
	 */
	public void setQuestionSnBegin(Integer value)
	 {
		this.questionSnBegin = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 考题序号
	 */
	public Integer getQuestionSnEnd() {
		return this.questionSnEnd;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 考题序号
	 */
	public void setQuestionSnEnd(Integer value)
	 {
		this.questionSnEnd = value;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 考题序号
	 */
	public Integer getQuestionSnEndEqual() {
		return this.questionSnEndEqual;
	}
	
	/**
	 * 查询条件结束值,QUESTION_SN: 考题序号
	 */
	public void setQuestionSnEndEqual(Integer value)
	 {
		this.questionSnEndEqual = value;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public TestPapersQuestionQueryCondition setPapersQuestionIdCondition(Integer value) {
		this.papersQuestionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public TestPapersQuestionQueryCondition setPapersQuestionIdConditionBegin(Integer value) {
		this.papersQuestionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public TestPapersQuestionQueryCondition setPapersQuestionIdConditionEnd(Integer value) {
		this.papersQuestionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_QUESTION_ID: 
	 */
	public TestPapersQuestionQueryCondition setPapersQuestionIdConditionEndEqual(Integer value) {
		this.papersQuestionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQuestionQueryCondition setPapersIdCondition(Integer value) {
		this.papersId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQuestionQueryCondition setPapersIdConditionBegin(Integer value) {
		this.papersIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQuestionQueryCondition setPapersIdConditionEnd(Integer value) {
		this.papersIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQuestionQueryCondition setPapersIdConditionEndEqual(Integer value) {
		this.papersIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public TestPapersQuestionQueryCondition setQuestionIdCondition(Integer value) {
		this.questionId = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public TestPapersQuestionQueryCondition setQuestionIdConditionBegin(Integer value) {
		this.questionIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public TestPapersQuestionQueryCondition setQuestionIdConditionEnd(Integer value) {
		this.questionIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_ID: 题目标识
	 */
	public TestPapersQuestionQueryCondition setQuestionIdConditionEndEqual(Integer value) {
		this.questionIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 考题序号
	 */
	public TestPapersQuestionQueryCondition setQuestionSnCondition(Integer value) {
		this.questionSn = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 考题序号
	 */
	public TestPapersQuestionQueryCondition setQuestionSnConditionBegin(Integer value) {
		this.questionSnBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 考题序号
	 */
	public TestPapersQuestionQueryCondition setQuestionSnConditionEnd(Integer value) {
		this.questionSnEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件QUESTION_SN: 考题序号
	 */
	public TestPapersQuestionQueryCondition setQuestionSnConditionEndEqual(Integer value) {
		this.questionSnEndEqual = value;
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
						+ ((" and ([T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] = " + this.papersQuestionId) 
						+ ") "));
		}
		if ((this.papersQuestionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] >= " 
						+ (this.papersQuestionIdBegin + ")")));
		}
		if ((this.papersQuestionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] < " 
						+ (this.papersQuestionIdEnd + ") ")));
		}
		if ((this.papersQuestionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[PAPERS_QUESTION_ID] <= " 
						+ (this.papersQuestionIdEndEqual + ") ")));
		}
		if ((this.papersId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS_QUESTION].[PAPERS_ID] = " + this.papersId) 
						+ ") "));
		}
		if ((this.papersIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[PAPERS_ID] >= " 
						+ (this.papersIdBegin + ")")));
		}
		if ((this.papersIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[PAPERS_ID] < " 
						+ (this.papersIdEnd + ") ")));
		}
		if ((this.papersIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[PAPERS_ID] <= " 
						+ (this.papersIdEndEqual + ") ")));
		}
		if ((this.questionId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS_QUESTION].[QUESTION_ID] = " + this.questionId) 
						+ ") "));
		}
		if ((this.questionIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[QUESTION_ID] >= " 
						+ (this.questionIdBegin + ")")));
		}
		if ((this.questionIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[QUESTION_ID] < " 
						+ (this.questionIdEnd + ") ")));
		}
		if ((this.questionIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[QUESTION_ID] <= " 
						+ (this.questionIdEndEqual + ") ")));
		}
		if ((this.questionSn == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS_QUESTION].[QUESTION_SN] = " + this.questionSn) 
						+ ") "));
		}
		if ((this.questionSnBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[QUESTION_SN] >= " 
						+ (this.questionSnBegin + ")")));
		}
		if ((this.questionSnEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[QUESTION_SN] < " 
						+ (this.questionSnEnd + ") ")));
		}
		if ((this.questionSnEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION].[QUESTION_SN] <= " 
						+ (this.questionSnEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
