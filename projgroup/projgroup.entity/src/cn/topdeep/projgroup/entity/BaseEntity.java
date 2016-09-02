package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
import common.cache2.*;
public interface BaseEntity {
	
	/**
	 * 插入对象
	 */
	void insert(IDataVisit2 dataVisit) throws SQLException, DbException;
	
	/**
	 * 更新对象
	 */
	int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException;
	
	/**
	 * 更新对象
	 */
	int update(IDataVisit2 dataVisit) throws SQLException, DbException;
	
	/**
	 * 获得对象的数据库表名
	 */
	String getTableName() throws SQLException, DbException;
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	String getKeyFieldNames() throws SQLException, DbException;
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	String getKeyFieldValues() throws SQLException, DbException;
}
