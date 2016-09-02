package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
import common.cache2.*;
/**
 * 数据操作异常定义
 */
public class DbException extends SQLException {
	
	public DbException(String message) {
		super(message);
	}
}
