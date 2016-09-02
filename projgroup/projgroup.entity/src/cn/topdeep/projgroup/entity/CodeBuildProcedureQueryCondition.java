package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_CODE_BUILD_PROCEDURE查询条件定义
 */
public class CodeBuildProcedureQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	Integer buildProcedureId;
	
	/**
	 * 查询条件开始值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	Integer buildProcedureIdBegin;
	
	/**
	 * 查询条件结束值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	Integer buildProcedureIdEnd;
	
	/**
	 * 查询条件结束值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	Integer buildProcedureIdEndEqual;
	
	/**
	 * 查询条件,BUILD_ID: 构建标识
	 */
	Integer buildId;
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	Integer buildIdBegin;
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	Integer buildIdEnd;
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	Integer buildIdEndEqual;
	
	/**
	 * 查询条件,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	Integer funcProcedureId;
	
	/**
	 * 查询条件开始值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	Integer funcProcedureIdBegin;
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	Integer funcProcedureIdEnd;
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	Integer funcProcedureIdEndEqual;
	
	/**
	 * BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public Integer getBuildProcedureId() {
		return this.buildProcedureId;
	}
	
	/**
	 * BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public void setBuildProcedureId(Integer value)
	 {
		this.buildProcedureId = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public Integer getBuildProcedureIdBegin() {
		return this.buildProcedureIdBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public void setBuildProcedureIdBegin(Integer value)
	 {
		this.buildProcedureIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public Integer getBuildProcedureIdEnd() {
		return this.buildProcedureIdEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public void setBuildProcedureIdEnd(Integer value)
	 {
		this.buildProcedureIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public Integer getBuildProcedureIdEndEqual() {
		return this.buildProcedureIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public void setBuildProcedureIdEndEqual(Integer value)
	 {
		this.buildProcedureIdEndEqual = value;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public Integer getBuildId() {
		return this.buildId;
	}
	
	/**
	 * BUILD_ID: 构建标识
	 */
	public void setBuildId(Integer value)
	 {
		this.buildId = value;
	}
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdBegin() {
		return this.buildIdBegin;
	}
	
	/**
	 * 查询条件开始值,BUILD_ID: 构建标识
	 */
	public void setBuildIdBegin(Integer value)
	 {
		this.buildIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdEnd() {
		return this.buildIdEnd;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public void setBuildIdEnd(Integer value)
	 {
		this.buildIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public Integer getBuildIdEndEqual() {
		return this.buildIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,BUILD_ID: 构建标识
	 */
	public void setBuildIdEndEqual(Integer value)
	 {
		this.buildIdEndEqual = value;
	}
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public Integer getFuncProcedureId() {
		return this.funcProcedureId;
	}
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureId(Integer value)
	 {
		this.funcProcedureId = value;
	}
	
	/**
	 * 查询条件开始值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public Integer getFuncProcedureIdBegin() {
		return this.funcProcedureIdBegin;
	}
	
	/**
	 * 查询条件开始值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureIdBegin(Integer value)
	 {
		this.funcProcedureIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public Integer getFuncProcedureIdEnd() {
		return this.funcProcedureIdEnd;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureIdEnd(Integer value)
	 {
		this.funcProcedureIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public Integer getFuncProcedureIdEndEqual() {
		return this.funcProcedureIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureIdEndEqual(Integer value)
	 {
		this.funcProcedureIdEndEqual = value;
	}
	
	/**
	 * 设置查询条件BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public CodeBuildProcedureQueryCondition setBuildProcedureIdCondition(Integer value) {
		this.buildProcedureId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public CodeBuildProcedureQueryCondition setBuildProcedureIdConditionBegin(Integer value) {
		this.buildProcedureIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public CodeBuildProcedureQueryCondition setBuildProcedureIdConditionEnd(Integer value) {
		this.buildProcedureIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_PROCEDURE_ID: 构建过程标识
	 */
	public CodeBuildProcedureQueryCondition setBuildProcedureIdConditionEndEqual(Integer value) {
		this.buildProcedureIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildProcedureQueryCondition setBuildIdCondition(Integer value) {
		this.buildId = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildProcedureQueryCondition setBuildIdConditionBegin(Integer value) {
		this.buildIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildProcedureQueryCondition setBuildIdConditionEnd(Integer value) {
		this.buildIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件BUILD_ID: 构建标识
	 */
	public CodeBuildProcedureQueryCondition setBuildIdConditionEndEqual(Integer value) {
		this.buildIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public CodeBuildProcedureQueryCondition setFuncProcedureIdCondition(Integer value) {
		this.funcProcedureId = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public CodeBuildProcedureQueryCondition setFuncProcedureIdConditionBegin(Integer value) {
		this.funcProcedureIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public CodeBuildProcedureQueryCondition setFuncProcedureIdConditionEnd(Integer value) {
		this.funcProcedureIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public CodeBuildProcedureQueryCondition setFuncProcedureIdConditionEndEqual(Integer value) {
		this.funcProcedureIdEndEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.buildProcedureId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_PROCEDURE].[BUILD_PROCEDURE_ID] = " + this.buildProcedureId) 
						+ ") "));
		}
		if ((this.buildProcedureIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[BUILD_PROCEDURE_ID] >= " 
						+ (this.buildProcedureIdBegin + ")")));
		}
		if ((this.buildProcedureIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[BUILD_PROCEDURE_ID] < " 
						+ (this.buildProcedureIdEnd + ") ")));
		}
		if ((this.buildProcedureIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[BUILD_PROCEDURE_ID] <= " 
						+ (this.buildProcedureIdEndEqual + ") ")));
		}
		if ((this.buildId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_PROCEDURE].[BUILD_ID] = " + this.buildId) 
						+ ") "));
		}
		if ((this.buildIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[BUILD_ID] >= " 
						+ (this.buildIdBegin + ")")));
		}
		if ((this.buildIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[BUILD_ID] < " 
						+ (this.buildIdEnd + ") ")));
		}
		if ((this.buildIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[BUILD_ID] <= " 
						+ (this.buildIdEndEqual + ") ")));
		}
		if ((this.funcProcedureId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_CODE_BUILD_PROCEDURE].[FUNC_PROCEDURE_ID] = " + this.funcProcedureId) 
						+ ") "));
		}
		if ((this.funcProcedureIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[FUNC_PROCEDURE_ID] >= " 
						+ (this.funcProcedureIdBegin + ")")));
		}
		if ((this.funcProcedureIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[FUNC_PROCEDURE_ID] < " 
						+ (this.funcProcedureIdEnd + ") ")));
		}
		if ((this.funcProcedureIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_CODE_BUILD_PROCEDURE].[FUNC_PROCEDURE_ID] <= " 
						+ (this.funcProcedureIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
