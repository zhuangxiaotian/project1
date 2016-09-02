package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_PAPERS_RESULT_DETAIL查询条件定义
 */
public class PapersResultDetailQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	Integer papersResultDetailId;
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	Integer papersResultDetailIdBegin;
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	Integer papersResultDetailIdEnd;
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	Integer papersResultDetailIdEndEqual;
	
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
	 * PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public Integer getPapersResultDetailId() {
		return this.papersResultDetailId;
	}
	
	/**
	 * PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public void setPapersResultDetailId(Integer value)
	 {
		this.papersResultDetailId = value;
	}
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public Integer getPapersResultDetailIdBegin() {
		return this.papersResultDetailIdBegin;
	}
	
	/**
	 * 查询条件开始值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public void setPapersResultDetailIdBegin(Integer value)
	 {
		this.papersResultDetailIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public Integer getPapersResultDetailIdEnd() {
		return this.papersResultDetailIdEnd;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public void setPapersResultDetailIdEnd(Integer value)
	 {
		this.papersResultDetailIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public Integer getPapersResultDetailIdEndEqual() {
		return this.papersResultDetailIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public void setPapersResultDetailIdEndEqual(Integer value)
	 {
		this.papersResultDetailIdEndEqual = value;
	}
	
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
	 * 设置查询条件PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public PapersResultDetailQueryCondition setPapersResultDetailIdCondition(Integer value) {
		this.papersResultDetailId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public PapersResultDetailQueryCondition setPapersResultDetailIdConditionBegin(Integer value) {
		this.papersResultDetailIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public PapersResultDetailQueryCondition setPapersResultDetailIdConditionEnd(Integer value) {
		this.papersResultDetailIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_DETAIL_ID: 回答明细标识
	 */
	public PapersResultDetailQueryCondition setPapersResultDetailIdConditionEndEqual(Integer value) {
		this.papersResultDetailIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 回答标识
	 */
	public PapersResultDetailQueryCondition setPapersResultIdCondition(Integer value) {
		this.papersResultId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 回答标识
	 */
	public PapersResultDetailQueryCondition setPapersResultIdConditionBegin(Integer value) {
		this.papersResultIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 回答标识
	 */
	public PapersResultDetailQueryCondition setPapersResultIdConditionEnd(Integer value) {
		this.papersResultIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_RESULT_ID: 回答标识
	 */
	public PapersResultDetailQueryCondition setPapersResultIdConditionEndEqual(Integer value) {
		this.papersResultIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 答案标识
	 */
	public PapersResultDetailQueryCondition setAnswerIdCondition(Integer value) {
		this.answerId = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 答案标识
	 */
	public PapersResultDetailQueryCondition setAnswerIdConditionBegin(Integer value) {
		this.answerIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 答案标识
	 */
	public PapersResultDetailQueryCondition setAnswerIdConditionEnd(Integer value) {
		this.answerIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件ANSWER_ID: 答案标识
	 */
	public PapersResultDetailQueryCondition setAnswerIdConditionEndEqual(Integer value) {
		this.answerIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.papersResultDetailId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_DETAIL_ID] = " + this.papersResultDetailId) 
						+ ") "));
		}
		if ((this.papersResultDetailIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_DETAIL_ID] >= " 
						+ (this.papersResultDetailIdBegin + ")")));
		}
		if ((this.papersResultDetailIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_DETAIL_ID] < " 
						+ (this.papersResultDetailIdEnd + ") ")));
		}
		if ((this.papersResultDetailIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_DETAIL_ID] <= " 
						+ (this.papersResultDetailIdEndEqual + ") ")));
		}
		if ((this.papersResultId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_ID] = " + this.papersResultId) 
						+ ") "));
		}
		if ((this.papersResultIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_ID] >= " 
						+ (this.papersResultIdBegin + ")")));
		}
		if ((this.papersResultIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_ID] < " 
						+ (this.papersResultIdEnd + ") ")));
		}
		if ((this.papersResultIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[PAPERS_RESULT_ID] <= " 
						+ (this.papersResultIdEndEqual + ") ")));
		}
		if ((this.answerId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_PAPERS_RESULT_DETAIL].[ANSWER_ID] = " + this.answerId) 
						+ ") "));
		}
		if ((this.answerIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[ANSWER_ID] >= " 
						+ (this.answerIdBegin + ")")));
		}
		if ((this.answerIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[ANSWER_ID] < " 
						+ (this.answerIdEnd + ") ")));
		}
		if ((this.answerIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_PAPERS_RESULT_DETAIL].[ANSWER_ID] <= " 
						+ (this.answerIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
