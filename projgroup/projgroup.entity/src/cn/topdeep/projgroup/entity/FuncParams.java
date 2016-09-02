package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * T_FUNC_PARAMS: 函数参数
 */
public class FuncParams extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * PARAM_ID: 参数标识
	 */
	int paramId;
	
	/**
	 * FUNC_PROCEDURE_ID: 函数过程标识
	 */
	int funcProcedureId;
	
	/**
	 * PARAM_CODE: 参数代码
	 */
	String paramCode = "";
	
	/**
	 * PARAM_NAME: 参数名称
	 */
	String paramName;
	
	/**
	 * PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	int paramDirection;
	
	/**
	 * PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	int paramCategory;
	
	/**
	 * PARAM_COMMENT: 参数说明
	 */
	String paramComment;
	
	/**
	 * PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	int parentParamId;
	
	/**
	 * PARAM_DATA_TYPE: 数据类型
	 */
	String paramDataType = "";
	
	/**
	 * PARAM_DATA_LENGTH: 数据类型长度
	 */
	int paramDataLength;
	
	/**
	 * PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	int paramDataDecimal;
	
	/**
	 * PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	int paramDataNotNull;
	
	/**
	 * PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	String paramDataDefaultValue;
	
	/**
	 * PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	int paramAllowModify;
	
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
	 * IMPL_INTERFACE: 实现接口
	 */
	String implInterface;
	
	/**
	 * ORDER_FIELD: 排序字段
	 */
	int orderField;
	
	/**
	 * PARAM_ID: 参数标识
	 */
	public int getParamId() {
		return this.paramId;
	}
	
	/**
	 * PARAM_ID: 参数标识
	 */
	public void setParamId(int value)
	 {
		this.paramId = value;
	}
	
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
	 * PARAM_CODE: 参数代码
	 */
	public String getParamCode() {
		return this.paramCode;
	}
	
	/**
	 * PARAM_CODE: 参数代码
	 */
	public void setParamCode(String value)
	 {
		this.paramCode = value;
	}
	
	/**
	 * PARAM_NAME: 参数名称
	 */
	public String getParamName() {
		return this.paramName;
	}
	
	/**
	 * PARAM_NAME: 参数名称
	 */
	public void setParamName(String value)
	 {
		this.paramName = value;
	}
	
	/**
	 * PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public int getParamDirection() {
		return this.paramDirection;
	}
	
	/**
	 * PARAM_DIRECTION: 参数方向,0输入参数1输出参数
	 */
	public void setParamDirection(int value)
	 {
		this.paramDirection = value;
	}
	
	/**
	 * PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public int getParamCategory() {
		return this.paramCategory;
	}
	
	/**
	 * PARAM_CATEGORY: 参数类型，0普通参数1集合参数
	 */
	public void setParamCategory(int value)
	 {
		this.paramCategory = value;
	}
	
	/**
	 * PARAM_COMMENT: 参数说明
	 */
	public String getParamComment() {
		return this.paramComment;
	}
	
	/**
	 * PARAM_COMMENT: 参数说明
	 */
	public void setParamComment(String value)
	 {
		this.paramComment = value;
	}
	
	/**
	 * PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public int getParentParamId() {
		return this.parentParamId;
	}
	
	/**
	 * PARENT_PARAM_ID: 父参数标识,0表示没有父参数
	 */
	public void setParentParamId(int value)
	 {
		this.parentParamId = value;
	}
	
	/**
	 * PARAM_DATA_TYPE: 数据类型
	 */
	public String getParamDataType() {
		return this.paramDataType;
	}
	
	/**
	 * PARAM_DATA_TYPE: 数据类型
	 */
	public void setParamDataType(String value)
	 {
		this.paramDataType = value;
	}
	
	/**
	 * PARAM_DATA_LENGTH: 数据类型长度
	 */
	public int getParamDataLength() {
		return this.paramDataLength;
	}
	
	/**
	 * PARAM_DATA_LENGTH: 数据类型长度
	 */
	public void setParamDataLength(int value)
	 {
		this.paramDataLength = value;
	}
	
	/**
	 * PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public int getParamDataDecimal() {
		return this.paramDataDecimal;
	}
	
	/**
	 * PARAM_DATA_DECIMAL: 数据类型小数长度
	 */
	public void setParamDataDecimal(int value)
	 {
		this.paramDataDecimal = value;
	}
	
	/**
	 * PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public int getParamDataNotNull() {
		return this.paramDataNotNull;
	}
	
	/**
	 * PARAM_DATA_NOT_NULL: 数据非空 0允许空 1不允许空
	 */
	public void setParamDataNotNull(int value)
	 {
		this.paramDataNotNull = value;
	}
	
	/**
	 * PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	public String getParamDataDefaultValue() {
		return this.paramDataDefaultValue;
	}
	
	/**
	 * PARAM_DATA_DEFAULT_VALUE: 参数默认值
	 */
	public void setParamDataDefaultValue(String value)
	 {
		this.paramDataDefaultValue = value;
	}
	
	/**
	 * PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public int getParamAllowModify() {
		return this.paramAllowModify;
	}
	
	/**
	 * PARAM_ALLOW_MODIFY: 参数允许修改 0 不允许修改 1允许修改
	 */
	public void setParamAllowModify(int value)
	 {
		this.paramAllowModify = value;
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
	 * IMPL_INTERFACE: 实现接口
	 */
	public String getImplInterface() {
		return this.implInterface;
	}
	
	/**
	 * IMPL_INTERFACE: 实现接口
	 */
	public void setImplInterface(String value)
	 {
		this.implInterface = value;
	}
	
	/**
	 * ORDER_FIELD: 排序字段
	 */
	public int getOrderField() {
		return this.orderField;
	}
	
	/**
	 * ORDER_FIELD: 排序字段
	 */
	public void setOrderField(int value)
	 {
		this.orderField = value;
	}
	
	public static String getSelectSql() {
		return "select  [T_FUNC_PARAMS].[PARAM_ID], [T_FUNC_PARAMS].[FUNC_PROCEDURE_ID], [T_FUNC_PARAMS].[PARAM_CODE], [T_FUNC_PARAMS].[PARAM_NAME], [T_FUNC_PARAMS].[PARAM_DIRECTION], [T_FUNC_PARAMS].[PARAM_CATEGORY], [T_FUNC_PARAMS].[PARAM_COMMENT], [T_FUNC_PARAMS].[PARENT_PARAM_ID], [T_FUNC_PARAMS].[PARAM_DATA_TYPE], [T_FUNC_PARAMS].[PARAM_DATA_LENGTH], [T_FUNC_PARAMS].[PARAM_DATA_DECIMAL], [T_FUNC_PARAMS].[PARAM_DATA_NOT_NULL], [T_FUNC_PARAMS].[PARAM_DATA_DEFAULT_VALUE], [T_FUNC_PARAMS].[PARAM_ALLOW_MODIFY], [T_FUNC_PARAMS].[PUB0], [T_FUNC_PARAMS].[PUB1], [T_FUNC_PARAMS].[PUB2], [T_FUNC_PARAMS].[PUB3], [T_FUNC_PARAMS].[PUB4], [T_FUNC_PARAMS].[PUB5], [T_FUNC_PARAMS].[IMPL_INTERFACE], [T_FUNC_PARAMS].[ORDER_FIELD]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [T_FUNC_PARAMS].[PARAM_ID], [T_FUNC_PARAMS].[FUNC_PROCEDURE_ID], [T_FUNC_PARAMS].[PARAM_CODE], [T_FUNC_PARAMS].[PARAM_NAME], [T_FUNC_PARAMS].[PARAM_DIRECTION], [T_FUNC_PARAMS].[PARAM_CATEGORY], [T_FUNC_PARAMS].[PARAM_COMMENT], [T_FUNC_PARAMS].[PARENT_PARAM_ID], [T_FUNC_PARAMS].[PARAM_DATA_TYPE], [T_FUNC_PARAMS].[PARAM_DATA_LENGTH], [T_FUNC_PARAMS].[PARAM_DATA_DECIMAL], [T_FUNC_PARAMS].[PARAM_DATA_NOT_NULL], [T_FUNC_PARAMS].[PARAM_DATA_DEFAULT_VALUE], [T_FUNC_PARAMS].[PARAM_ALLOW_MODIFY], [T_FUNC_PARAMS].[PUB0], [T_FUNC_PARAMS].[PUB1], [T_FUNC_PARAMS].[PUB2], [T_FUNC_PARAMS].[PUB3], [T_FUNC_PARAMS].[PUB4], [T_FUNC_PARAMS].[PUB5], [T_FUNC_PARAMS].[IMPL_INTERFACE], [T_FUNC_PARAMS].[ORDER_FIELD]   from [T_FUNC_PARAMS] ";
	}
	
	
	public static String getColumnSql() {
		return " [T_FUNC_PARAMS].[PARAM_ID], [T_FUNC_PARAMS].[FUNC_PROCEDURE_ID], [T_FUNC_PARAMS].[PARAM_CODE], [T_FUNC_PARAMS].[PARAM_NAME], [T_FUNC_PARAMS].[PARAM_DIRECTION], [T_FUNC_PARAMS].[PARAM_CATEGORY], [T_FUNC_PARAMS].[PARAM_COMMENT], [T_FUNC_PARAMS].[PARENT_PARAM_ID], [T_FUNC_PARAMS].[PARAM_DATA_TYPE], [T_FUNC_PARAMS].[PARAM_DATA_LENGTH], [T_FUNC_PARAMS].[PARAM_DATA_DECIMAL], [T_FUNC_PARAMS].[PARAM_DATA_NOT_NULL], [T_FUNC_PARAMS].[PARAM_DATA_DEFAULT_VALUE], [T_FUNC_PARAMS].[PARAM_ALLOW_MODIFY], [T_FUNC_PARAMS].[PUB0], [T_FUNC_PARAMS].[PUB1], [T_FUNC_PARAMS].[PUB2], [T_FUNC_PARAMS].[PUB3], [T_FUNC_PARAMS].[PUB4], [T_FUNC_PARAMS].[PUB5], [T_FUNC_PARAMS].[IMPL_INTERFACE], [T_FUNC_PARAMS].[ORDER_FIELD] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "T_FUNC_PARAMS";
	}
	
	
	public String getTableName() {
		return "T_FUNC_PARAMS";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "PARAM_ID";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		kvalue = (kvalue + this.paramId);
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (FuncParams.class.isInstance(obj)) {
			FuncParams o = ((FuncParams)(obj));
			this.paramId = o.paramId;
			this.funcProcedureId = o.funcProcedureId;
			this.paramCode = o.paramCode;
			this.paramName = o.paramName;
			this.paramDirection = o.paramDirection;
			this.paramCategory = o.paramCategory;
			this.paramComment = o.paramComment;
			this.parentParamId = o.parentParamId;
			this.paramDataType = o.paramDataType;
			this.paramDataLength = o.paramDataLength;
			this.paramDataDecimal = o.paramDataDecimal;
			this.paramDataNotNull = o.paramDataNotNull;
			this.paramDataDefaultValue = o.paramDataDefaultValue;
			this.paramAllowModify = o.paramAllowModify;
			this.pub0 = o.pub0;
			this.pub1 = o.pub1;
			this.pub2 = o.pub2;
			this.pub3 = o.pub3;
			this.pub4 = o.pub4;
			this.pub5 = o.pub5;
			this.implInterface = o.implInterface;
			this.orderField = o.orderField;
		}
	}
	
	/**
	 * 插入FuncParams对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcParams">需要插入的函数参数</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, FuncParams funcParams) throws SQLException, DbException {
		String sql = "insert into [T_FUNC_PARAMS](";
		if ((funcParams.getParamId() > 0)) {
			sql = (sql + "[PARAM_ID], ");
		}
		sql = (sql + "[FUNC_PROCEDURE_ID]");
		sql = (sql + ", [PARAM_CODE]");
		sql = (sql + ", [PARAM_NAME]");
		sql = (sql + ", [PARAM_DIRECTION]");
		sql = (sql + ", [PARAM_CATEGORY]");
		sql = (sql + ", [PARAM_COMMENT]");
		sql = (sql + ", [PARENT_PARAM_ID]");
		sql = (sql + ", [PARAM_DATA_TYPE]");
		sql = (sql + ", [PARAM_DATA_LENGTH]");
		sql = (sql + ", [PARAM_DATA_DECIMAL]");
		sql = (sql + ", [PARAM_DATA_NOT_NULL]");
		sql = (sql + ", [PARAM_DATA_DEFAULT_VALUE]");
		sql = (sql + ", [PARAM_ALLOW_MODIFY]");
		sql = (sql + ", [PUB0]");
		sql = (sql + ", [PUB1]");
		sql = (sql + ", [PUB2]");
		sql = (sql + ", [PUB3]");
		sql = (sql + ", [PUB4]");
		sql = (sql + ", [PUB5]");
		sql = (sql + ", [IMPL_INTERFACE]");
		sql = (sql + ", [ORDER_FIELD]");
		sql = (sql + ")values(");
		if ((funcParams.getParamId() > 0)) {
			sql = (sql + funcParams.getParamId());
			sql = (sql + ", ");
		}
		sql = (sql + funcParams.getFuncProcedureId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(funcParams.getParamCode().toString()));
		sql = (sql + ", ");
		if ((funcParams.paramName == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getParamName().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + funcParams.getParamDirection());
		sql = (sql + ", ");
		sql = (sql + funcParams.getParamCategory());
		sql = (sql + ", ");
		if ((funcParams.paramComment == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getParamComment().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + funcParams.getParentParamId());
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.safeSql(funcParams.getParamDataType().toString()));
		sql = (sql + ", ");
		sql = (sql + funcParams.getParamDataLength());
		sql = (sql + ", ");
		sql = (sql + funcParams.getParamDataDecimal());
		sql = (sql + ", ");
		sql = (sql + funcParams.getParamDataNotNull());
		sql = (sql + ", ");
		if ((funcParams.paramDataDefaultValue == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getParamDataDefaultValue().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + funcParams.getParamAllowModify());
		sql = (sql + ", ");
		if ((funcParams.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((funcParams.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((funcParams.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((funcParams.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((funcParams.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((funcParams.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub5().toString()));
		}
		sql = (sql + ", ");
		if ((funcParams.implInterface == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(funcParams.getImplInterface().toString()));
		}
		sql = (sql + ", ");
		sql = (sql + funcParams.getOrderField());
		sql = (sql + ")");
		dataVisit.beginTransaction();
		try {
			if ((funcParams.getParamId() > 0)) {
				sql = ("SET IDENTITY_INSERT [T_FUNC_PARAMS] on;" + sql);
				sql = (sql + "; SET IDENTITY_INSERT T_FUNC_PARAMS off");
			}
			dataVisit.execSql(sql);
			if ((funcParams.getParamId() == 0)) {
				funcParams.paramId = ((int)(((double)(dataVisit.getIDentity()))));
			}
			dataVisit.commitTransaction();
		}
		catch (SQLException e) {
			dataVisit.rollBackTransaction();
			throw e;
		}
	}
	
	/**
	 * 插入FuncParams对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		FuncParams.insert(dataVisit, this);
	}
	
	/**
	 * 更新FuncParams对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcParams">需要更新的函数参数</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FuncParams funcParams, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [T_FUNC_PARAMS] set ";
		sql = (sql + "[FUNC_PROCEDURE_ID] = ");
		sql = (sql + funcParams.getFuncProcedureId());
		sql = (sql + ",");
		sql = (sql + "[PARAM_CODE] = ");
		sql = (sql + SqlServerUtils.safeSql(funcParams.getParamCode().toString()));
		sql = (sql + ",");
		if ((funcParams.paramName == null)) {
			sql = (sql + "[PARAM_NAME] = default ,");
		}
		else {
			sql = (sql + "[PARAM_NAME] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getParamName().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[PARAM_DIRECTION] = ");
		sql = (sql + funcParams.getParamDirection());
		sql = (sql + ",");
		sql = (sql + "[PARAM_CATEGORY] = ");
		sql = (sql + funcParams.getParamCategory());
		sql = (sql + ",");
		if ((funcParams.paramComment == null)) {
			sql = (sql + "[PARAM_COMMENT] = default ,");
		}
		else {
			sql = (sql + "[PARAM_COMMENT] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getParamComment().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[PARENT_PARAM_ID] = ");
		sql = (sql + funcParams.getParentParamId());
		sql = (sql + ",");
		sql = (sql + "[PARAM_DATA_TYPE] = ");
		sql = (sql + SqlServerUtils.safeSql(funcParams.getParamDataType().toString()));
		sql = (sql + ",");
		sql = (sql + "[PARAM_DATA_LENGTH] = ");
		sql = (sql + funcParams.getParamDataLength());
		sql = (sql + ",");
		sql = (sql + "[PARAM_DATA_DECIMAL] = ");
		sql = (sql + funcParams.getParamDataDecimal());
		sql = (sql + ",");
		sql = (sql + "[PARAM_DATA_NOT_NULL] = ");
		sql = (sql + funcParams.getParamDataNotNull());
		sql = (sql + ",");
		if ((funcParams.paramDataDefaultValue == null)) {
			sql = (sql + "[PARAM_DATA_DEFAULT_VALUE] = default ,");
		}
		else {
			sql = (sql + "[PARAM_DATA_DEFAULT_VALUE] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getParamDataDefaultValue().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[PARAM_ALLOW_MODIFY] = ");
		sql = (sql + funcParams.getParamAllowModify());
		sql = (sql + ",");
		if ((funcParams.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((funcParams.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((funcParams.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((funcParams.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((funcParams.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((funcParams.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getPub5().toString()));
			sql = (sql + ",");
		}
		if ((funcParams.implInterface == null)) {
			sql = (sql + "[IMPL_INTERFACE] = default ,");
		}
		else {
			sql = (sql + "[IMPL_INTERFACE] = ");
			sql = (sql + SqlServerUtils.safeSql(funcParams.getImplInterface().toString()));
			sql = (sql + ",");
		}
		sql = (sql + "[ORDER_FIELD] = ");
		sql = (sql + funcParams.getOrderField());
		sql = (sql + ",");
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + "PARAM_ID = ");
		sql = (sql + funcParams.getParamId());
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新FuncParams对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="funcParams">需要更新的函数参数</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FuncParams funcParams) throws SQLException, DbException {
		return FuncParams.update(dataVisit, funcParams, "");
	}
	
	/**
	 * 更新FuncParams对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return FuncParams.update(dataVisit, this);
	}
	
	/**
	 * 更新FuncParams对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return FuncParams.update(dataVisit, this, appendConditionSql);
	}
	
	public String toString() {
		return this.paramName.toString();
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<FuncParams> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<FuncParams> list = new ArrayList<FuncParams>();
		try {
			for (; reader.next(); ) {
				FuncParams obj = new FuncParams();
				FuncParams.readValue(reader, obj);
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
	public static List<FuncParams> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<FuncParams> list = new ArrayList<FuncParams>();
		try {
			for (; reader.next(); ) {
				FuncParams obj = new FuncParams();
				FuncParams.readValue(reader, obj);
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
	public static List<FuncParams> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FuncParams.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<FuncParams> list = new ArrayList<FuncParams>();
		try {
			for (; reader.next(); ) {
				FuncParams obj = new FuncParams();
				FuncParams.readValue(reader, obj);
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
	public static List<FuncParams> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FuncParams.getFullSelectSql() + appendConditionSql));
		List<FuncParams> list = new ArrayList<FuncParams>();
		try {
			for (; reader.next(); ) {
				FuncParams obj = new FuncParams();
				FuncParams.readValue(reader, obj);
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
	public static <T extends FuncParams> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FuncParams.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FuncParams.readValue(reader, obj);
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
public static <T extends FuncParams> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FuncParams.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FuncParams.readValue(reader, obj);
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
	String sql = "select * from T_FUNC_PARAMS ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 根据参数标识查询FuncParams
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AParamId">参数标识</param>
 */
public static FuncParams selectByParamId(IDataVisit2 dataVisit, int AParamId) throws SQLException, DbException {
	String sql = " where ";
	sql = (sql + "PARAM_ID = ");
	sql = (sql + AParamId);
	List<FuncParams> list = FuncParams.selectObjects(dataVisit, sql);
	if ((list.size() > 0)) {
		return list.get(0);
	}
	else {
		return null;
	}
}

/**
 * 从数据库中删除一个FuncParams对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AParamId">参数标识</param>
 * <param name="appendConditionSql">附加条件语句</param>
 */
public static void deleteByParamId(IDataVisit2 dataVisit, int AParamId, String appendConditionSql) throws SQLException, DbException {
	String sql = "";
	sql = (sql + " delete from [T_FUNC_PARAMS] where ");
	sql = (sql + "PARAM_ID = ");
	sql = (sql + AParamId);
	sql = (sql + appendConditionSql);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中删除一个FuncParams对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="AParamId">参数标识</param>
 */
public static void deleteByParamId(IDataVisit2 dataVisit, int AParamId) throws SQLException, DbException {
	FuncParams.deleteByParamId(dataVisit, AParamId, "");
}

/**
 * 根据外键函数过程标识删除一批FuncParams对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 */
public static void deleteListByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId) throws SQLException, DbException {
	String sql = "";
	sql = (sql + "delete from [T_FUNC_PARAMS] where ");
	sql = (sql + "FUNC_PROCEDURE_ID = ");
	sql = (sql + AFuncProcedureId);
	dataVisit.execSql(sql);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 * <param name="appendConditionSql">附加查询Sql语句，包括Where</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<FuncParams> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	sql = (sql + appendConditionSql);
	return FuncParams.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 * <param name="pageIndex">要查询的页索引，从0开始</param>
 * <param name="rowsOfPage">每页的记录数</param>
 * <param name="orderField">排序字段</param>
 * <param name="order">排序 asc | desc</param>
 */
public static List<FuncParams> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	return FuncParams.selectObjects(dataVisit, sql, pageIndex, rowsOfPage, orderField, order);
}

/**
 * 从数据库中根据外键值选取一批对象
 * <param name="dataVisit">数据访问接口</param>
 * <param name="FuncProcedureId">函数过程标识</param>
 */
public static List<FuncParams> selectObjectsByFuncProcedureId(IDataVisit2 dataVisit, int AFuncProcedureId) throws SQLException, DbException {
	String sql = " where FUNC_PROCEDURE_ID = ";
	sql = (sql + AFuncProcedureId);
	return FuncParams.selectObjects(dataVisit, sql);
}

/**
 * 从reader读到数据到对象funcParams中
 * <param name="reader">数据源</param>
 * <param name="funcParams">目标对象</param>
 */
public static void readValue(ResultSet reader, FuncParams funcParams) throws SQLException, DbException {
	funcParams.paramId = reader.getInt(1);
	funcParams.funcProcedureId = reader.getInt(2);
	funcParams.paramCode = reader.getString(3);
	funcParams.paramName = reader.getString(4);
	if (reader.wasNull()) {
		funcParams.paramName = null;
	}
	funcParams.paramDirection = reader.getInt(5);
	funcParams.paramCategory = reader.getInt(6);
	funcParams.paramComment = reader.getString(7);
	if (reader.wasNull()) {
		funcParams.paramComment = null;
	}
	funcParams.parentParamId = reader.getInt(8);
	funcParams.paramDataType = reader.getString(9);
	funcParams.paramDataLength = reader.getInt(10);
	funcParams.paramDataDecimal = reader.getInt(11);
	funcParams.paramDataNotNull = reader.getInt(12);
	funcParams.paramDataDefaultValue = reader.getString(13);
	if (reader.wasNull()) {
		funcParams.paramDataDefaultValue = null;
	}
	funcParams.paramAllowModify = reader.getInt(14);
	funcParams.pub0 = reader.getString(15);
	if (reader.wasNull()) {
		funcParams.pub0 = null;
	}
	funcParams.pub1 = reader.getString(16);
	if (reader.wasNull()) {
		funcParams.pub1 = null;
	}
	funcParams.pub2 = reader.getString(17);
	if (reader.wasNull()) {
		funcParams.pub2 = null;
	}
	funcParams.pub3 = reader.getString(18);
	if (reader.wasNull()) {
		funcParams.pub3 = null;
	}
	funcParams.pub4 = reader.getString(19);
	if (reader.wasNull()) {
		funcParams.pub4 = null;
	}
	funcParams.pub5 = reader.getString(20);
	if (reader.wasNull()) {
		funcParams.pub5 = null;
	}
	funcParams.implInterface = reader.getString(21);
	if (reader.wasNull()) {
		funcParams.implInterface = null;
	}
	funcParams.orderField = reader.getInt(22);
}
}
