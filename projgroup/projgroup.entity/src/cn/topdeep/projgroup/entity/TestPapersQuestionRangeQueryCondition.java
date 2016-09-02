package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_TEST_PAPERS_QUESTION_RANGE查询条件定义
 */
public class TestPapersQuestionRangeQueryCondition extends Object implements ConditionQuery {
	
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
	 * 查询条件,CATEGORY_ID: 试卷分类标识
	 */
	Integer categoryId;
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 试卷分类标识
	 */
	Integer categoryIdBegin;
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 试卷分类标识
	 */
	Integer categoryIdEnd;
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 试卷分类标识
	 */
	Integer categoryIdEndEqual;
	
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
	 * CATEGORY_ID: 试卷分类标识
	 */
	public Integer getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * CATEGORY_ID: 试卷分类标识
	 */
	public void setCategoryId(Integer value)
	 {
		this.categoryId = value;
	}
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 试卷分类标识
	 */
	public Integer getCategoryIdBegin() {
		return this.categoryIdBegin;
	}
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 试卷分类标识
	 */
	public void setCategoryIdBegin(Integer value)
	 {
		this.categoryIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 试卷分类标识
	 */
	public Integer getCategoryIdEnd() {
		return this.categoryIdEnd;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 试卷分类标识
	 */
	public void setCategoryIdEnd(Integer value)
	 {
		this.categoryIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 试卷分类标识
	 */
	public Integer getCategoryIdEndEqual() {
		return this.categoryIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 试卷分类标识
	 */
	public void setCategoryIdEndEqual(Integer value)
	 {
		this.categoryIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQuestionRangeQueryCondition setPapersIdCondition(Integer value) {
		this.papersId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQuestionRangeQueryCondition setPapersIdConditionBegin(Integer value) {
		this.papersIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQuestionRangeQueryCondition setPapersIdConditionEnd(Integer value) {
		this.papersIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PAPERS_ID: 考卷标识
	 */
	public TestPapersQuestionRangeQueryCondition setPapersIdConditionEndEqual(Integer value) {
		this.papersIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 试卷分类标识
	 */
	public TestPapersQuestionRangeQueryCondition setCategoryIdCondition(Integer value) {
		this.categoryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 试卷分类标识
	 */
	public TestPapersQuestionRangeQueryCondition setCategoryIdConditionBegin(Integer value) {
		this.categoryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 试卷分类标识
	 */
	public TestPapersQuestionRangeQueryCondition setCategoryIdConditionEnd(Integer value) {
		this.categoryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 试卷分类标识
	 */
	public TestPapersQuestionRangeQueryCondition setCategoryIdConditionEndEqual(Integer value) {
		this.categoryIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.papersId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS_QUESTION_RANGE].[PAPERS_ID] = " + this.papersId) 
						+ ") "));
		}
		if ((this.papersIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION_RANGE].[PAPERS_ID] >= " 
						+ (this.papersIdBegin + ")")));
		}
		if ((this.papersIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION_RANGE].[PAPERS_ID] < " 
						+ (this.papersIdEnd + ") ")));
		}
		if ((this.papersIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION_RANGE].[PAPERS_ID] <= " 
						+ (this.papersIdEndEqual + ") ")));
		}
		if ((this.categoryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_TEST_PAPERS_QUESTION_RANGE].[CATEGORY_ID] = " + this.categoryId) 
						+ ") "));
		}
		if ((this.categoryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION_RANGE].[CATEGORY_ID] >= " 
						+ (this.categoryIdBegin + ")")));
		}
		if ((this.categoryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION_RANGE].[CATEGORY_ID] < " 
						+ (this.categoryIdEnd + ") ")));
		}
		if ((this.categoryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_TEST_PAPERS_QUESTION_RANGE].[CATEGORY_ID] <= " 
						+ (this.categoryIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
