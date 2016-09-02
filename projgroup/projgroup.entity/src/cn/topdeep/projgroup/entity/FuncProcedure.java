package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_FUNC_PROCEDURE: 函数过程
 */
public class FuncProcedure extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	int funcProcedureId;
	
	/**
	 * FUNC_PROJECT_ID: 函数项目标识
	 */
	int funcProjectId;
	
	/**
	 * PROC_CODE: 函数代码
	 */
	String procCode = "";
	
	/**
	 * PROC_NAME: 函数名称
	 */
	String procName;
	
	/**
	 * PROC_COMMENT: 函数描述
	 */
	String procComment;
	
	/**
	 * PROC_VERSION: 函数版本
	 */
	String procVersion;
	
	/**
	 * FUNC_CODE: 函数代码
	 */
	String funcCode;
	
	/**
	 * CACHE_TIME: 缓存时间
	 */
	Integer cacheTime;
	
	/**
	 * PUB0: 备用字段1
	 */
	String pub0;
	
	/**
	 * PUB1: 备用字段2
	 */
	String pub1;
	
	/**
	 * PUB2: 备用字段3
	 */
	String pub2;
	
	/**
	 * PUB3: 备用字段4
	 */
	String pub3;
	
	/**
	 * PUB4: 备用字段5
	 */
	String pub4;
	
	/**
	 * PUB5: 备用字段6
	 */
	String pub5;
	
	/**
	 * PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	int procType;
	
	/**
	 * FUNC_CATEGORY: 函数分类
	 */
	String funcCategory;
	
	/**
	 * FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	String funcInputInterface;
	
	/**
	 * FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	String funcOutputInterface;
	
	/**
	 * ORDER_FIELD: 
	 */
	int orderField;
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public int getFuncProcedureId() {
		return this.funcProcedureId;
	}
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	public void setFuncProcedureId(int value)
	 {
		this.funcProcedureId = value;
	}
	
	/**
	 * FUNC_PROJECT_ID: 函数项目标识
	 */
	public int getFuncProjectId() {
		return this.funcProjectId;
	}
	
	/**
	 * FUNC_PROJECT_ID: 函数项目标识
	 */
	public void setFuncProjectId(int value)
	 {
		this.funcProjectId = value;
	}
	
	/**
	 * PROC_CODE: 函数代码
	 */
	public String getProcCode() {
		return this.procCode;
	}
	
	/**
	 * PROC_CODE: 函数代码
	 */
	public void setProcCode(String value)
	 {
		this.procCode = value;
	}
	
	/**
	 * PROC_NAME: 函数名称
	 */
	public String getProcName() {
		return this.procName;
	}
	
	/**
	 * PROC_NAME: 函数名称
	 */
	public void setProcName(String value)
	 {
		this.procName = value;
	}
	
	/**
	 * PROC_COMMENT: 函数描述
	 */
	public String getProcComment() {
		return this.procComment;
	}
	
	/**
	 * PROC_COMMENT: 函数描述
	 */
	public void setProcComment(String value)
	 {
		this.procComment = value;
	}
	
	/**
	 * PROC_VERSION: 函数版本
	 */
	public String getProcVersion() {
		return this.procVersion;
	}
	
	/**
	 * PROC_VERSION: 函数版本
	 */
	public void setProcVersion(String value)
	 {
		this.procVersion = value;
	}
	
	/**
	 * FUNC_CODE: 函数代码
	 */
	public String getFuncCode() {
		return this.funcCode;
	}
	
	/**
	 * FUNC_CODE: 函数代码
	 */
	public void setFuncCode(String value)
	 {
		this.funcCode = value;
	}
	
	/**
	 * CACHE_TIME: 缓存时间
	 */
	public Integer getCacheTime() {
		return this.cacheTime;
	}
	
	/**
	 * CACHE_TIME: 缓存时间
	 */
	public void setCacheTime(Integer value)
	 {
		this.cacheTime = value;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public String getPub0() {
		return this.pub0;
	}
	
	/**
	 * PUB0: 备用字段1
	 */
	public void setPub0(String value)
	 {
		this.pub0 = value;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public String getPub1() {
		return this.pub1;
	}
	
	/**
	 * PUB1: 备用字段2
	 */
	public void setPub1(String value)
	 {
		this.pub1 = value;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public String getPub2() {
		return this.pub2;
	}
	
	/**
	 * PUB2: 备用字段3
	 */
	public void setPub2(String value)
	 {
		this.pub2 = value;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public String getPub3() {
		return this.pub3;
	}
	
	/**
	 * PUB3: 备用字段4
	 */
	public void setPub3(String value)
	 {
		this.pub3 = value;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public String getPub4() {
		return this.pub4;
	}
	
	/**
	 * PUB4: 备用字段5
	 */
	public void setPub4(String value)
	 {
		this.pub4 = value;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public String getPub5() {
		return this.pub5;
	}
	
	/**
	 * PUB5: 备用字段6
	 */
	public void setPub5(String value)
	 {
		this.pub5 = value;
	}
	
	/**
	 * PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public int getProcType() {
		return this.procType;
	}
	
	/**
	 * PROC_TYPE: 过程类型，0通用参数过程1普通过程
	 */
	public void setProcType(int value)
	 {
		this.procType = value;
	}
	
	/**
	 * FUNC_CATEGORY: 函数分类
	 */
	public String getFuncCategory() {
		return this.funcCategory;
	}
	
	/**
	 * FUNC_CATEGORY: 函数分类
	 */
	public void setFuncCategory(String value)
	 {
		this.funcCategory = value;
	}
	
	/**
	 * FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	public String getFuncInputInterface() {
		return this.funcInputInterface;
	}
	
	/**
	 * FUNC_INPUT_INTERFACE: 输入参数接口
	 */
	public void setFuncInputInterface(String value)
	 {
		this.funcInputInterface = value;
	}
	
	/**
	 * FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	public String getFuncOutputInterface() {
		return this.funcOutputInterface;
	}
	
	/**
	 * FUNC_OUTPUT_INTERFACE: 输出参数接口
	 */
	public void setFuncOutputInterface(String value)
	 {
		this.funcOutputInterface = value;
	}
	
	/**
	 * ORDER_FIELD: 
	 */
	public int getOrderField() {
		return this.orderField;
	}
	
	/**
	 * ORDER_FIELD: 
	 */
	public void setOrderField(int value)
	 {
		this.orderField = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID], [T_FUNC_PROCEDURE].[FUNC_PROJECT_ID], [T_FUNC_PROCEDURE].[PROC_CODE], [T_FUNC_PROCEDURE].[PROC_NAME], [T_FUNC_PROCEDURE].[PROC_COMMENT], [T_FUNC_PROCEDURE].[PROC_VERSION], [T_FUNC_PROCEDURE].[FUNC_CODE], [T_FUNC_PROCEDURE].[CACHE_TIME], [T_FUNC_PROCEDURE].[PUB0], [T_FUNC_PROCEDURE].[PUB1], [T_FUNC_PROCEDURE].[PUB2], [T_FUNC_PROCEDURE].[PUB3], [T_FUNC_PROCEDURE].[PUB4], [T_FUNC_PROCEDURE].[PUB5], [T_FUNC_PROCEDURE].[PROC_TYPE], [T_FUNC_PROCEDURE].[FUNC_CATEGORY], [T_FUNC_PROCEDURE].[FUNC_INPUT_INTERFACE], [T_FUNC_PROCEDURE].[FUNC_OUTPUT_INTERFACE], [T_FUNC_PROCEDURE].[ORDER_FIELD]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID], [T_FUNC_PROCEDURE].[FUNC_PROJECT_ID], [T_FUNC_PROCEDURE].[PROC_CODE], [T_FUNC_PROCEDURE].[PROC_NAME], [T_FUNC_PROCEDURE].[PROC_COMMENT], [T_FUNC_PROCEDURE].[PROC_VERSION], [T_FUNC_PROCEDURE].[FUNC_CODE], [T_FUNC_PROCEDURE].[CACHE_TIME], [T_FUNC_PROCEDURE].[PUB0], [T_FUNC_PROCEDURE].[PUB1], [T_FUNC_PROCEDURE].[PUB2], [T_FUNC_PROCEDURE].[PUB3], [T_FUNC_PROCEDURE].[PUB4], [T_FUNC_PROCEDURE].[PUB5], [T_FUNC_PROCEDURE].[PROC_TYPE], [T_FUNC_PROCEDURE].[FUNC_CATEGORY], [T_FUNC_PROCEDURE].[FUNC_INPUT_INTERFACE], [T_FUNC_PROCEDURE].[FUNC_OUTPUT_INTERFACE], [T_FUNC_PROCEDURE].[ORDER_FIELD]   from [T_FUNC_PROCEDURE] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_FUNC_PROCEDURE].[FUNC_PROCEDURE_ID], [T_FUNC_PROCEDURE].[FUNC_PROJECT_ID], [T_FUNC_PROCEDURE].[PROC_CODE], [T_FUNC_PROCEDURE].[PROC_NAME], [T_FUNC_PROCEDURE].[PROC_COMMENT], [T_FUNC_PROCEDURE].[PROC_VERSION], [T_FUNC_PROCEDURE].[FUNC_CODE], [T_FUNC_PROCEDURE].[CACHE_TIME], [T_FUNC_PROCEDURE].[PUB0], [T_FUNC_PROCEDURE].[PUB1], [T_FUNC_PROCEDURE].[PUB2], [T_FUNC_PROCEDURE].[PUB3], [T_FUNC_PROCEDURE].[PUB4], [T_FUNC_PROCEDURE].[PUB5], [T_FUNC_PROCEDURE].[PROC_TYPE], [T_FUNC_PROCEDURE].[FUNC_CATEGORY], [T_FUNC_PROCEDURE].[FUNC_INPUT_INTERFACE], [T_FUNC_PROCEDURE].[FUNC_OUTPUT_INTERFACE], [T_FUNC_PROCEDURE].[ORDER_FIELD] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_FUNC_PROCEDURE";
	}
	
	
	public String getTableName() {
		return "T_FUNC_PROCEDURE";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "FUNC_PROCEDURE_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.funcProcedureId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (FuncProcedure.class.isInstance(obj)) {
			FuncProcedure o = ((FuncProcedure)(obj));
			this.funcProcedureId = o.funcProcedureId;
			this.funcProjectId = o.funcProjectId;
			this.procCode = o.procCode;
			this.procName = o.procName;
			this.procComment = o.procComment;
			this.procVersion = o.procVersion;
			this.funcCode = o.funcCode;
			this.cacheTime = o.cacheTime;
			this.pub0 = o.pub0;
			this.pub1 = o.pub1;
			this.pub2 = o.pub2;
			this.pub3 = o.pub3;
			this.pub4 = o.pub4;
			this.pub5 = o.pub5;
			this.procType = o.procType;
			this.funcCategory = o.funcCategory;
			this.funcInputInterface = o.funcInputInterface;
			this.funcOutputInterface = o.funcOutputInterface;
			this.orderField = o.orderField;
		}
	}
	
	/**
	 * 插入FuncProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcProcedure">需要插入的函数过程</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, FuncProcedure funcProcedure) throws SQLException, DbException {
		String sql = "insert into [T_FUNC_PROCEDURE](";
		if ((funcProcedure.getFuncProcedureId() > 0)) {
			sql = (sql + "[FUNC_PROCEDURE_ID], ");
		}
		sql = (sql + "[FUNC_PROJECT_ID]");
		sql = (sql + ", [PROC_CODE]");
		sql = (sql + ", [PROC_NAME]");
		sql = (sql + ", [PROC_COMMENT]");
		sql = (sql + ", [PROC_VERSION]");
		sql = (sql + ", [FUNC_CODE]");
		sql = (sql + ", [CACHE_TIME]");
		sql = (sql + ", [PUB0]");
		sql = (sql + ", [PUB1]");
		sql = (sql + ", [PUB2]");
		sql = (sql + ", [PUB3]");
		sql = (sql + ", [PUB4]");
		sql = (sql + ", [PUB5]");
		sql = (sql + ", [PROC_TYPE]");
		sql = (sql + ", [FUNC_CATEGORY]");
		sql = (sql + ", [FUNC_INPUT_INTERFACE]");
		sql = (sql + ", [FUNC_OUTPUT_INTERFACE]");
		sql = (sql + ", [ORDER_FIELD]");
		sql = (sql + ")values(");
		if ((funcProcedure.getFuncProcedureId() > 0)) {
			sql = (sql + funcProcedure.getFuncProcedureId());
			sql = (sql + ", ");
		}
		sql = (sql + funcProcedure.getFuncProjectId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(funcProcedure.getProcCode().toString()));
		sql = (sql + ", ");
		if ((funcProcedure.procName == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getProcName().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.procComment == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getProcComment().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.procVersion == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getProcVersion().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.funcCode == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getFuncCode().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.cacheTime == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + funcProcedure.getCacheTime());
		}
		sql = (sql + ", ");
		if ((funcProcedure.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub5().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + funcProcedure.getProcType());
		sql = (sql + ", ");
		if ((funcProcedure.funcCategory == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getFuncCategory().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.funcInputInterface == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getFuncInputInterface().toString()));
		}
		sql = (sql + ", ");
		if ((funcProcedure.funcOutputInterface == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getFuncOutputInterface().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + funcProcedure.getOrderField());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((funcProcedure.getFuncProcedureId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_FUNC_PROCEDURE] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_FUNC_PROCEDURE off");
			}
			dataVisit.execSql(sql);
			if ((funcProcedure.getFuncProcedureId() == 0)) {
				funcProcedure.funcProcedureId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入FuncProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		FuncProcedure.insert(dataVisit, this);
	}
	
	/**
	 * 更新FuncProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcProcedure">需要更新的函数过程</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FuncProcedure funcProcedure, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_FUNC_PROCEDURE] set ";
		sql = (sql + "[FUNC_PROJECT_ID] = ");
		sql = (sql + funcProcedure.getFuncProjectId());
		sql = (sql + ",");
		sql = (sql + "[PROC_CODE] = ");
		sql = (sql + SqlServerUtils.safeSql(funcProcedure.getProcCode().toString()));
		sql = (sql + ",");
		if ((funcProcedure.procName == null)) {
			sql = (sql + "[PROC_NAME] = default ,");
		}
		else {
			sql = (sql + "[PROC_NAME] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getProcName().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.procComment == null)) {
			sql = (sql + "[PROC_COMMENT] = default ,");
		}
		else {
			sql = (sql + "[PROC_COMMENT] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getProcComment().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.procVersion == null)) {
			sql = (sql + "[PROC_VERSION] = default ,");
		}
		else {
			sql = (sql + "[PROC_VERSION] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getProcVersion().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.funcCode == null)) {
			sql = (sql + "[FUNC_CODE] = default ,");
		}
		else {
			sql = (sql + "[FUNC_CODE] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getFuncCode().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.cacheTime == null)) {
			sql = (sql + "[CACHE_TIME] = default ,");
		}
		else {
			sql = (sql + "[CACHE_TIME] = ");
			sql = (sql + funcProcedure.getCacheTime());
			sql = (sql + ",");
		}
		if ((funcProcedure.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getPub5().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[PROC_TYPE] = ");
		sql = (sql + funcProcedure.getProcType());
		sql = (sql + ",");
		if ((funcProcedure.funcCategory == null)) {
			sql = (sql + "[FUNC_CATEGORY] = default ,");
		}
		else {
			sql = (sql + "[FUNC_CATEGORY] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getFuncCategory().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.funcInputInterface == null)) {
			sql = (sql + "[FUNC_INPUT_INTERFACE] = default ,");
		}
		else {
			sql = (sql + "[FUNC_INPUT_INTERFACE] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getFuncInputInterface().toString()));
			sql = (sql + ",");
		}
		if ((funcProcedure.funcOutputInterface == null)) {
			sql = (sql + "[FUNC_OUTPUT_INTERFACE] = default ,");
		}
		else {
			sql = (sql + "[FUNC_OUTPUT_INTERFACE] = ");
			sql = (sql + SqlServerUtils.safeSql(funcProcedure.getFuncOutputInterface().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[ORDER_FIELD] = ");
		sql = (sql + funcProcedure.getOrderField());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "FUNC_PROCEDURE_ID = ");
		sql = (sql + funcProcedure.getFuncProcedureId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新FuncProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcProcedure">需要更新的函数过程</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FuncProcedure funcProcedure) throws SQLException, DbException {
		return FuncProcedure.update(dataVisit, funcProcedure, "");
	}
	
	/**
	 * 更新FuncProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return FuncProcedure.update(dataVisit, this);
	}
	
	/**
	 * 更新FuncProcedure对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return FuncProcedure.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.procName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<FuncProcedure> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<FuncProcedure> list = new ArrayList<FuncProcedure>();
		try {
			for (; reader.next(); ) {
				FuncProcedure obj = new FuncProcedure();
				FuncProcedure.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static List<FuncProcedure> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<FuncProcedure> list = new ArrayList<FuncProcedure>();
		try {
			for (; reader.next(); ) {
				FuncProcedure obj = new FuncProcedure();
				FuncProcedure.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static List<FuncProcedure> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FuncProcedure.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<FuncProcedure> list = new ArrayList<FuncProcedure>();
		try {
			for (; reader.next(); ) {
				FuncProcedure obj = new FuncProcedure();
				FuncProcedure.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * @return 查询结果
	 */
	public static List<FuncProcedure> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FuncProcedure.getFullSelectSql() + appendConditionSql));
		List<FuncProcedure> list = new ArrayList<FuncProcedure>();
		try {
			for (; reader.next(); ) {
				FuncProcedure obj = new FuncProcedure();
				FuncProcedure.readValue(reader, obj);
				list.add(obj);
			}
		}
		finally {
			if ((reader != null)) {
				reader.close();
			}
			dataVisit.releaseConnection();
		}
		return list;
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
	 * <param name="pageIndex">要查询的页索引，从0开始</param>
	 * <param name="rowsOfPage">每页的记录数</param>
	 * <param name="orderField">排序字段</param>
	 * <param name="order">排序 asc | desc</param>
	 * @return 查询结果
	 */
	public static <T extends FuncProcedure> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FuncProcedure.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FuncProcedure.readValue(reader, obj);
			list.add(obj);
		}
	}
	finally {
		if ((reader != null)) {
			reader.close();
		}
		dataVisit.releaseConnection();
	}
	return list;
}

/**
 * <param name="dataVisit">数据查询接口</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public static <T extends FuncProcedure> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FuncProcedure.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FuncProcedure.readValue(reader, obj);
			list.add(obj);
		}
	}
	finally {
		if ((reader != null)) {
			reader.close();
		}
		dataVisit.releaseConnection();
	}
	return list;
}

/**
 * <param name="dataVisit">数据查询接口</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * @return 查询结果
 */
public static int querySelectObjectsCount(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
	String sql = "select * from T_FUNC_PROCEDURE ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据函数过程标识查询FuncProcedure
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public static FuncProcedure selectByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "FUNC_PROCEDURE_ID = ");
	sql = (sql + AFuncProcedureId);
	List<FuncProcedure> list = FuncProcedure.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个FuncProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AFuncProcedureId">函数过程标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_FUNC_PROCEDURE] where ");
	sql = (sql + "FUNC_PROCEDURE_ID = ");
	sql = (sql + AFuncProcedureId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个FuncProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AFuncProcedureId">函数过程标识</param>
 */
public static void deleteByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId) throws SQLException, DbException {
	FuncProcedure.deleteByFuncProcedureId(dataVisit, AFuncProcedureId, "");
}

/**
 * 根据外键函数项目标识删除一批FuncProcedure对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProjectId">函数项目标识</param>
 */
public static void deleteListByFuncProjectId(IDataVisit2 dataVisit, int AFuncProjectId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_FUNC_PROCEDURE] where ");
	sql = (sql + "FUNC_PROJECT_ID = ");
	sql = (sql + AFuncProjectId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProjectId">函数项目标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<FuncProcedure> selectObjectsByFuncProjectId(IDataVisit2 dataVisit, int AFuncProjectId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where FUNC_PROJECT_ID = ";
	sql = (sql + AFuncProjectId);
	sql = (sql + appendConditionSql);
	return FuncProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProjectId">函数项目标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<FuncProcedure> selectObjectsByFuncProjectId(IDataVisit2 dataVisit, int AFuncProjectId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where FUNC_PROJECT_ID = ";
	sql = (sql + AFuncProjectId);
	return FuncProcedure.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProjectId">函数项目标识</param>
 */
public static List<FuncProcedure> selectObjectsByFuncProjectId(IDataVisit2 dataVisit, int AFuncProjectId) throws SQLException, DbException {
	String sql = " where FUNC_PROJECT_ID = ";
	sql = (sql + AFuncProjectId);
	return FuncProcedure.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象funcProcedure中
 * <param name="reader">数据源</param>
 * <param name="funcProcedure">目标对象</param>
 */
public static void readValue(ResultSet reader, FuncProcedure funcProcedure) throws SQLException, DbException {
	funcProcedure.funcProcedureId = reader.getInt(1);
	funcProcedure.funcProjectId = reader.getInt(2);
	funcProcedure.procCode = reader.getString(3);
	funcProcedure.procName = reader.getString(4);
	if (reader.wasNull()) {
		funcProcedure.procName = null;
	}
	funcProcedure.procComment = reader.getString(5);
	if (reader.wasNull()) {
		funcProcedure.procComment = null;
	}
	funcProcedure.procVersion = reader.getString(6);
	if (reader.wasNull()) {
		funcProcedure.procVersion = null;
	}
	funcProcedure.funcCode = reader.getString(7);
	if (reader.wasNull()) {
		funcProcedure.funcCode = null;
	}
	funcProcedure.cacheTime = reader.getInt(8);
	if (reader.wasNull()) {
		funcProcedure.cacheTime = null;
	}
	funcProcedure.pub0 = reader.getString(9);
	if (reader.wasNull()) {
		funcProcedure.pub0 = null;
	}
	funcProcedure.pub1 = reader.getString(10);
	if (reader.wasNull()) {
		funcProcedure.pub1 = null;
	}
	funcProcedure.pub2 = reader.getString(11);
	if (reader.wasNull()) {
		funcProcedure.pub2 = null;
	}
	funcProcedure.pub3 = reader.getString(12);
	if (reader.wasNull()) {
		funcProcedure.pub3 = null;
	}
	funcProcedure.pub4 = reader.getString(13);
	if (reader.wasNull()) {
		funcProcedure.pub4 = null;
	}
	funcProcedure.pub5 = reader.getString(14);
	if (reader.wasNull()) {
		funcProcedure.pub5 = null;
	}
	funcProcedure.procType = reader.getInt(15);
	funcProcedure.funcCategory = reader.getString(16);
	if (reader.wasNull()) {
		funcProcedure.funcCategory = null;
	}
	funcProcedure.funcInputInterface = reader.getString(17);
	if (reader.wasNull()) {
		funcProcedure.funcInputInterface = null;
	}
	funcProcedure.funcOutputInterface = reader.getString(18);
	if (reader.wasNull()) {
		funcProcedure.funcOutputInterface = null;
	}
	funcProcedure.orderField = reader.getInt(19);
}
}
