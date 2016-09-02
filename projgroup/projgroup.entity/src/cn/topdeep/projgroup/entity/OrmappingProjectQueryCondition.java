package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_ORMAPPING_PROJECT查询条件定义
 */
public class OrmappingProjectQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,PROJ_ID: 工程号
	 */
	Integer projId;
	
	/**
	 * 查询条件开始值,PROJ_ID: 工程号
	 */
	Integer projIdBegin;
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	Integer projIdEnd;
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	Integer projIdEndEqual;
	
	/**
	 * 查询条件,PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	String projParamFilePath;
	
	/**
	 * 查询条件字符串相等,PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	String projParamFilePathEqual;
	
	/**
	 * 查询条件,PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	String projDbConfigPath;
	
	/**
	 * 查询条件字符串相等,PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	String projDbConfigPathEqual;
	
	/**
	 * 查询条件,DB_HOST: 数据库主机
	 */
	String dbHost;
	
	/**
	 * 查询条件字符串相等,DB_HOST: 数据库主机
	 */
	String dbHostEqual;
	
	/**
	 * 查询条件,DB_NAME: 数据库名称
	 */
	String dbName;
	
	/**
	 * 查询条件字符串相等,DB_NAME: 数据库名称
	 */
	String dbNameEqual;
	
	/**
	 * 查询条件,DB_USER: 数据库用户
	 */
	String dbUser;
	
	/**
	 * 查询条件字符串相等,DB_USER: 数据库用户
	 */
	String dbUserEqual;
	
	/**
	 * 查询条件,DB_PASS: 数据库用户密码
	 */
	String dbPass;
	
	/**
	 * 查询条件字符串相等,DB_PASS: 数据库用户密码
	 */
	String dbPassEqual;
	
	/**
	 * PROJ_ID: 工程号
	 */
	public Integer getProjId() {
		return this.projId;
	}
	
	/**
	 * PROJ_ID: 工程号
	 */
	public void setProjId(Integer value)
	 {
		this.projId = value;
	}
	
	/**
	 * 查询条件开始值,PROJ_ID: 工程号
	 */
	public Integer getProjIdBegin() {
		return this.projIdBegin;
	}
	
	/**
	 * 查询条件开始值,PROJ_ID: 工程号
	 */
	public void setProjIdBegin(Integer value)
	 {
		this.projIdBegin = value;
	}
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	public Integer getProjIdEnd() {
		return this.projIdEnd;
	}
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	public void setProjIdEnd(Integer value)
	 {
		this.projIdEnd = value;
	}
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	public Integer getProjIdEndEqual() {
		return this.projIdEndEqual;
	}
	
	/**
	 * 查询条件结束值,PROJ_ID: 工程号
	 */
	public void setProjIdEndEqual(Integer value)
	 {
		this.projIdEndEqual = value;
	}
	
	/**
	 * PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	public String getProjParamFilePath() {
		return this.projParamFilePath;
	}
	
	/**
	 * PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	public void setProjParamFilePath(String value)
	 {
		this.projParamFilePath = value;
	}
	
	/**
	 * 查询条件字符串相等,PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	public String getProjParamFilePathEqual() {
		return this.projParamFilePathEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	public void setProjParamFilePathEqual(String value)
	 {
		this.projParamFilePathEqual = value;
	}
	
	/**
	 * PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	public String getProjDbConfigPath() {
		return this.projDbConfigPath;
	}
	
	/**
	 * PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	public void setProjDbConfigPath(String value)
	 {
		this.projDbConfigPath = value;
	}
	
	/**
	 * 查询条件字符串相等,PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	public String getProjDbConfigPathEqual() {
		return this.projDbConfigPathEqual;
	}
	
	/**
	 * 查询条件字符串相等,PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	public void setProjDbConfigPathEqual(String value)
	 {
		this.projDbConfigPathEqual = value;
	}
	
	/**
	 * DB_HOST: 数据库主机
	 */
	public String getDbHost() {
		return this.dbHost;
	}
	
	/**
	 * DB_HOST: 数据库主机
	 */
	public void setDbHost(String value)
	 {
		this.dbHost = value;
	}
	
	/**
	 * 查询条件字符串相等,DB_HOST: 数据库主机
	 */
	public String getDbHostEqual() {
		return this.dbHostEqual;
	}
	
	/**
	 * 查询条件字符串相等,DB_HOST: 数据库主机
	 */
	public void setDbHostEqual(String value)
	 {
		this.dbHostEqual = value;
	}
	
	/**
	 * DB_NAME: 数据库名称
	 */
	public String getDbName() {
		return this.dbName;
	}
	
	/**
	 * DB_NAME: 数据库名称
	 */
	public void setDbName(String value)
	 {
		this.dbName = value;
	}
	
	/**
	 * 查询条件字符串相等,DB_NAME: 数据库名称
	 */
	public String getDbNameEqual() {
		return this.dbNameEqual;
	}
	
	/**
	 * 查询条件字符串相等,DB_NAME: 数据库名称
	 */
	public void setDbNameEqual(String value)
	 {
		this.dbNameEqual = value;
	}
	
	/**
	 * DB_USER: 数据库用户
	 */
	public String getDbUser() {
		return this.dbUser;
	}
	
	/**
	 * DB_USER: 数据库用户
	 */
	public void setDbUser(String value)
	 {
		this.dbUser = value;
	}
	
	/**
	 * 查询条件字符串相等,DB_USER: 数据库用户
	 */
	public String getDbUserEqual() {
		return this.dbUserEqual;
	}
	
	/**
	 * 查询条件字符串相等,DB_USER: 数据库用户
	 */
	public void setDbUserEqual(String value)
	 {
		this.dbUserEqual = value;
	}
	
	/**
	 * DB_PASS: 数据库用户密码
	 */
	public String getDbPass() {
		return this.dbPass;
	}
	
	/**
	 * DB_PASS: 数据库用户密码
	 */
	public void setDbPass(String value)
	 {
		this.dbPass = value;
	}
	
	/**
	 * 查询条件字符串相等,DB_PASS: 数据库用户密码
	 */
	public String getDbPassEqual() {
		return this.dbPassEqual;
	}
	
	/**
	 * 查询条件字符串相等,DB_PASS: 数据库用户密码
	 */
	public void setDbPassEqual(String value)
	 {
		this.dbPassEqual = value;
	}
	
	/**
	 * 设置查询条件PROJ_ID: 工程号
	 */
	public OrmappingProjectQueryCondition setProjIdCondition(Integer value) {
		this.projId = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_ID: 工程号
	 */
	public OrmappingProjectQueryCondition setProjIdConditionBegin(Integer value) {
		this.projIdBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_ID: 工程号
	 */
	public OrmappingProjectQueryCondition setProjIdConditionEnd(Integer value) {
		this.projIdEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_ID: 工程号
	 */
	public OrmappingProjectQueryCondition setProjIdConditionEndEqual(Integer value) {
		this.projIdEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	public OrmappingProjectQueryCondition setProjParamFilePathCondition(String value) {
		this.projParamFilePath = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_PARAM_FILE_PATH: 参数文件路径
	 */
	public OrmappingProjectQueryCondition setProjParamFilePathConditionEqual(String value) {
		this.projParamFilePathEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	public OrmappingProjectQueryCondition setProjDbConfigPathCondition(String value) {
		this.projDbConfigPath = value;
		return this;
	}
	
	/**
	 * 设置查询条件PROJ_DB_CONFIG_PATH: 数据架构文件路径
	 */
	public OrmappingProjectQueryCondition setProjDbConfigPathConditionEqual(String value) {
		this.projDbConfigPathEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DB_HOST: 数据库主机
	 */
	public OrmappingProjectQueryCondition setDbHostCondition(String value) {
		this.dbHost = value;
		return this;
	}
	
	/**
	 * 设置查询条件DB_HOST: 数据库主机
	 */
	public OrmappingProjectQueryCondition setDbHostConditionEqual(String value) {
		this.dbHostEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DB_NAME: 数据库名称
	 */
	public OrmappingProjectQueryCondition setDbNameCondition(String value) {
		this.dbName = value;
		return this;
	}
	
	/**
	 * 设置查询条件DB_NAME: 数据库名称
	 */
	public OrmappingProjectQueryCondition setDbNameConditionEqual(String value) {
		this.dbNameEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DB_USER: 数据库用户
	 */
	public OrmappingProjectQueryCondition setDbUserCondition(String value) {
		this.dbUser = value;
		return this;
	}
	
	/**
	 * 设置查询条件DB_USER: 数据库用户
	 */
	public OrmappingProjectQueryCondition setDbUserConditionEqual(String value) {
		this.dbUserEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件DB_PASS: 数据库用户密码
	 */
	public OrmappingProjectQueryCondition setDbPassCondition(String value) {
		this.dbPass = value;
		return this;
	}
	
	/**
	 * 设置查询条件DB_PASS: 数据库用户密码
	 */
	public OrmappingProjectQueryCondition setDbPassConditionEqual(String value) {
		this.dbPassEqual = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if ((this.projId == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([T_ORMAPPING_PROJECT].[PROJ_ID] = " + this.projId) 
						+ ") "));
		}
		if ((this.projIdBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ORMAPPING_PROJECT].[PROJ_ID] >= " 
						+ (this.projIdBegin + ")")));
		}
		if ((this.projIdEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ORMAPPING_PROJECT].[PROJ_ID] < " 
						+ (this.projIdEnd + ") ")));
		}
		if ((this.projIdEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([T_ORMAPPING_PROJECT].[PROJ_ID] <= " 
						+ (this.projIdEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.projParamFilePath)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ORMAPPING_PROJECT].[PROJ_PARAM_FILE_PATH]", this.projParamFilePath)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.projParamFilePathEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ORMAPPING_PROJECT].[PROJ_PARAM_FILE_PATH] = " + SqlServerUtils.safeSql(this.projParamFilePathEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.projDbConfigPath)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ORMAPPING_PROJECT].[PROJ_DB_CONFIG_PATH]", this.projDbConfigPath)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.projDbConfigPathEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ORMAPPING_PROJECT].[PROJ_DB_CONFIG_PATH] = " + SqlServerUtils.safeSql(this.projDbConfigPathEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.dbHost)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ORMAPPING_PROJECT].[DB_HOST]", this.dbHost)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.dbHostEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ORMAPPING_PROJECT].[DB_HOST] = " + SqlServerUtils.safeSql(this.dbHostEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.dbName)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ORMAPPING_PROJECT].[DB_NAME]", this.dbName)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.dbNameEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ORMAPPING_PROJECT].[DB_NAME] = " + SqlServerUtils.safeSql(this.dbNameEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.dbUser)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ORMAPPING_PROJECT].[DB_USER]", this.dbUser)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.dbUserEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ORMAPPING_PROJECT].[DB_USER] = " + SqlServerUtils.safeSql(this.dbUserEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.dbPass)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[T_ORMAPPING_PROJECT].[DB_PASS]", this.dbPass)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.dbPassEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[T_ORMAPPING_PROJECT].[DB_PASS] = " + SqlServerUtils.safeSql(this.dbPassEqual))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
