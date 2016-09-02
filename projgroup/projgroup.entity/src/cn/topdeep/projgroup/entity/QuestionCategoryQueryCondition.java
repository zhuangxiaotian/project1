package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_QUESTION_CATEGORY查询条件定义
 */
public class QuestionCategoryQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,CATEGORY_ID: 分类标识
	 */
	Integer categoryId;
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 分类标识
	 */
	Integer categoryIdBegin;
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	Integer categoryIdEnd;
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	Integer categoryIdEndEqual;
	
	/**
	 * 查询条件,CATEGORY_NAME: 分类名称
	 */
	String categoryName;
	
	/**
	 * 查询条件字符串相等,CATEGORY_NAME: 分类名称
	 */
	String categoryNameEqual;
	
	/**
	 * 查询条件,CATEGORY_DESC: 分类描述
	 */
	String categoryDesc;
	
	/**
	 * 查询条件字符串相等,CATEGORY_DESC: 分类描述
	 */
	String categoryDescEqual;
	
	/**
	 * 查询条件,DELETED: 是否删除
	 */
	Boolean deleted;
	
	/**
	 * CATEGORY_ID: 分类标识
	 */
	public Integer getCategoryId() {
		return this.categoryId;
	}
	
	/**
	 * CATEGORY_ID: 分类标识
	 */
	public void setCategoryId(Integer value)
	 {
		this.categoryId = value;
	}
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 分类标识
	 */
	public Integer getCategoryIdBegin() {
		return this.categoryIdBegin;
	}
	
	/**
	 * 查询条件开始值,CATEGORY_ID: 分类标识
	 */
	public void setCategoryIdBegin(Integer value)
	 {
		this.categoryIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	public Integer getCategoryIdEnd() {
		return this.categoryIdEnd;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	public void setCategoryIdEnd(Integer value)
	 {
		this.categoryIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	public Integer getCategoryIdEndEqual() {
		return this.categoryIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,CATEGORY_ID: 分类标识
	 */
	public void setCategoryIdEndEqual(Integer value)
	 {
		this.categoryIdEndEqual = value;
	}
	
	/**
	 * CATEGORY_NAME: 分类名称
	 */
	public String getCategoryName() {
		return this.categoryName;
	}
	
	/**
	 * CATEGORY_NAME: 分类名称
	 */
	public void setCategoryName(String value)
	 {
		this.categoryName = value;
	}
	
	/**
	 * 查询条件字符串相等,CATEGORY_NAME: 分类名称
	 */
	public String getCategoryNameEqual() {
		return this.categoryNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,CATEGORY_NAME: 分类名称
	 */
	public void setCategoryNameEqual(String value)
	 {
		this.categoryNameEqual = value;
	}
	
	/**
	 * CATEGORY_DESC: 分类描述
	 */
	public String getCategoryDesc() {
		return this.categoryDesc;
	}
	
	/**
	 * CATEGORY_DESC: 分类描述
	 */
	public void setCategoryDesc(String value)
	 {
		this.categoryDesc = value;
	}
	
	/**
	 * 查询条件字符串相等,CATEGORY_DESC: 分类描述
	 */
	public String getCategoryDescEqual() {
		return this.categoryDescEqual;
	}
	
	/**
	 * 查询条件字符串相等,CATEGORY_DESC: 分类描述
	 */
	public void setCategoryDescEqual(String value)
	 {
		this.categoryDescEqual = value;
	}
	
	/**
	 * DELETED: 是否删除
	 */
	public Boolean getDeleted() {
		return this.deleted;
	}
	
	/**
	 * DELETED: 是否删除
	 */
	public void setDeleted(Boolean value)
	 {
		this.deleted = value;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 分类标识
	 */
	public QuestionCategoryQueryCondition setCategoryIdCondition(Integer value) {
		this.categoryId = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 分类标识
	 */
	public QuestionCategoryQueryCondition setCategoryIdConditionBegin(Integer value) {
		this.categoryIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 分类标识
	 */
	public QuestionCategoryQueryCondition setCategoryIdConditionEnd(Integer value) {
		this.categoryIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_ID: 分类标识
	 */
	public QuestionCategoryQueryCondition setCategoryIdConditionEndEqual(Integer value) {
		this.categoryIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_NAME: 分类名称
	 */
	public QuestionCategoryQueryCondition setCategoryNameCondition(String value) {
		this.categoryName = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_NAME: 分类名称
	 */
	public QuestionCategoryQueryCondition setCategoryNameConditionEqual(String value) {
		this.categoryNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_DESC: 分类描述
	 */
	public QuestionCategoryQueryCondition setCategoryDescCondition(String value) {
		this.categoryDesc = value;
		return this;
	}
	
	/**
	 * 设置查询条件CATEGORY_DESC: 分类描述
	 */
	public QuestionCategoryQueryCondition setCategoryDescConditionEqual(String value) {
		this.categoryDescEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DELETED: 是否删除
	 */
	public QuestionCategoryQueryCondition setDeletedCondition(Boolean value) {
		this.deleted = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.categoryId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_CATEGORY].[CATEGORY_ID] = " + this.categoryId) 
						+ ") "));
		}
		if ((this.categoryIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_CATEGORY].[CATEGORY_ID] >= " 
						+ (this.categoryIdBegin + ")")));
		}
		if ((this.categoryIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_CATEGORY].[CATEGORY_ID] < " 
						+ (this.categoryIdEnd + ") ")));
		}
		if ((this.categoryIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_QUESTION_CATEGORY].[CATEGORY_ID] <= " 
						+ (this.categoryIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.categoryName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_QUESTION_CATEGORY].[CATEGORY_NAME]", this.categoryName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_QUESTION_CATEGORY].[CATEGORY_NAME] = " + SqlServerUtils.safeSql(this.categoryNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryDesc)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_QUESTION_CATEGORY].[CATEGORY_DESC]", this.categoryDesc)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.categoryDescEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_QUESTION_CATEGORY].[CATEGORY_DESC] = " + SqlServerUtils.safeSql(this.categoryDescEqual))) 
						+ ") "));
		}
		if ((this.deleted == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_QUESTION_CATEGORY].[DELETED] = " + SqlServerUtils.getBoolSql(this.deleted)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
