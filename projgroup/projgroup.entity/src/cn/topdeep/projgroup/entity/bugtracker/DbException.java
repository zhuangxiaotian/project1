package cn.topdeep.projgroup.entity.bugtracker;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import java.sql.*;
/**
 * <summary>
 * 数据操作异常定义
 * </summary>
 */
public class DbException extends SQLException {
	
	public DbException(String message) {
		super(message);
	}
}
