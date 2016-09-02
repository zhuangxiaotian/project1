package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * FUND_NAV: 基金净值表
 */
public class FundNav extends common.dbvisit.BaseTable implements BaseEntity, Serializable {
	
	/**
	 * FUND_CODE: 基金代码
	 */
	String fundCode = "";
	
	/**
	 * NAV_DATE: 净值日期
	 */
	java.util.Date navDate;
	
	/**
	 * NAV_VALUE: 净值
	 */
	double navValue;
	
	/**
	 * NAV_TOTAL_VALUE: 累计净值
	 */
	double navTotalValue;
	
	/**
	 * NAV_INCOME: 万份收益
	 */
	Double navIncome;
	
	/**
	 * NAV_INCOME_RATE: 七日年化收益率
	 */
	Double navIncomeRate;
	
	/**
	 * CHANGE_RATE: 涨跌幅
	 */
	Double changeRate;
	
	/**
	 * PUB0: 备用
	 */
	String pub0;
	
	/**
	 * PUB1: 备用
	 */
	String pub1;
	
	/**
	 * PUB2: 备用
	 */
	String pub2;
	
	/**
	 * PUB3: 备用
	 */
	String pub3;
	
	/**
	 * PUB4: 备用
	 */
	String pub4;
	
	/**
	 * PUB5: 备用
	 */
	String pub5;
	
	/**
	 * PUB6: 备用
	 */
	String pub6;
	
	/**
	 * PUB7: 备用
	 */
	String pub7;
	
	/**
	 * PUB8: 备用
	 */
	String pub8;
	
	/**
	 * PUB9: 备用
	 */
	String pub9;
	
	/**
	 * FUND_CODE: 基金代码
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * FUND_CODE: 基金代码
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * NAV_DATE: 净值日期
	 */
	public java.util.Date getNavDate() {
		return this.navDate;
	}
	
	/**
	 * NAV_DATE: 净值日期
	 */
	public void setNavDate(java.util.Date value)
	 {
		this.navDate = value;
	}
	
	/**
	 * NAV_VALUE: 净值
	 */
	public double getNavValue() {
		return this.navValue;
	}
	
	/**
	 * NAV_VALUE: 净值
	 */
	public void setNavValue(double value)
	 {
		this.navValue = value;
	}
	
	/**
	 * NAV_TOTAL_VALUE: 累计净值
	 */
	public double getNavTotalValue() {
		return this.navTotalValue;
	}
	
	/**
	 * NAV_TOTAL_VALUE: 累计净值
	 */
	public void setNavTotalValue(double value)
	 {
		this.navTotalValue = value;
	}
	
	/**
	 * NAV_INCOME: 万份收益
	 */
	public Double getNavIncome() {
		return this.navIncome;
	}
	
	/**
	 * NAV_INCOME: 万份收益
	 */
	public void setNavIncome(Double value)
	 {
		this.navIncome = value;
	}
	
	/**
	 * NAV_INCOME_RATE: 七日年化收益率
	 */
	public Double getNavIncomeRate() {
		return this.navIncomeRate;
	}
	
	/**
	 * NAV_INCOME_RATE: 七日年化收益率
	 */
	public void setNavIncomeRate(Double value)
	 {
		this.navIncomeRate = value;
	}
	
	/**
	 * CHANGE_RATE: 涨跌幅
	 */
	public Double getChangeRate() {
		return this.changeRate;
	}
	
	/**
	 * CHANGE_RATE: 涨跌幅
	 */
	public void setChangeRate(Double value)
	 {
		this.changeRate = value;
	}
	
	/**
	 * PUB0: 备用
	 */
	public String getPub0() {
		return this.pub0;
	}
	
	/**
	 * PUB0: 备用
	 */
	public void setPub0(String value)
	 {
		this.pub0 = value;
	}
	
	/**
	 * PUB1: 备用
	 */
	public String getPub1() {
		return this.pub1;
	}
	
	/**
	 * PUB1: 备用
	 */
	public void setPub1(String value)
	 {
		this.pub1 = value;
	}
	
	/**
	 * PUB2: 备用
	 */
	public String getPub2() {
		return this.pub2;
	}
	
	/**
	 * PUB2: 备用
	 */
	public void setPub2(String value)
	 {
		this.pub2 = value;
	}
	
	/**
	 * PUB3: 备用
	 */
	public String getPub3() {
		return this.pub3;
	}
	
	/**
	 * PUB3: 备用
	 */
	public void setPub3(String value)
	 {
		this.pub3 = value;
	}
	
	/**
	 * PUB4: 备用
	 */
	public String getPub4() {
		return this.pub4;
	}
	
	/**
	 * PUB4: 备用
	 */
	public void setPub4(String value)
	 {
		this.pub4 = value;
	}
	
	/**
	 * PUB5: 备用
	 */
	public String getPub5() {
		return this.pub5;
	}
	
	/**
	 * PUB5: 备用
	 */
	public void setPub5(String value)
	 {
		this.pub5 = value;
	}
	
	/**
	 * PUB6: 备用
	 */
	public String getPub6() {
		return this.pub6;
	}
	
	/**
	 * PUB6: 备用
	 */
	public void setPub6(String value)
	 {
		this.pub6 = value;
	}
	
	/**
	 * PUB7: 备用
	 */
	public String getPub7() {
		return this.pub7;
	}
	
	/**
	 * PUB7: 备用
	 */
	public void setPub7(String value)
	 {
		this.pub7 = value;
	}
	
	/**
	 * PUB8: 备用
	 */
	public String getPub8() {
		return this.pub8;
	}
	
	/**
	 * PUB8: 备用
	 */
	public void setPub8(String value)
	 {
		this.pub8 = value;
	}
	
	/**
	 * PUB9: 备用
	 */
	public String getPub9() {
		return this.pub9;
	}
	
	/**
	 * PUB9: 备用
	 */
	public void setPub9(String value)
	 {
		this.pub9 = value;
	}
	
	public static String getSelectSql() {
		return "select  [FUND_NAV].[FUND_CODE], [FUND_NAV].[NAV_DATE], [FUND_NAV].[NAV_VALUE], [FUND_NAV].[NAV_TOTAL_VALUE], [FUND_NAV].[NAV_INCOME], [FUND_NAV].[NAV_INCOME_RATE], [FUND_NAV].[CHANGE_RATE], [FUND_NAV].[PUB0], [FUND_NAV].[PUB1], [FUND_NAV].[PUB2], [FUND_NAV].[PUB3], [FUND_NAV].[PUB4], [FUND_NAV].[PUB5], [FUND_NAV].[PUB6], [FUND_NAV].[PUB7], [FUND_NAV].[PUB8], [FUND_NAV].[PUB9]  ";
	}
	
	
	public static String getFullSelectSql() {
		return "select  [FUND_NAV].[FUND_CODE], [FUND_NAV].[NAV_DATE], [FUND_NAV].[NAV_VALUE], [FUND_NAV].[NAV_TOTAL_VALUE], [FUND_NAV].[NAV_INCOME], [FUND_NAV].[NAV_INCOME_RATE], [FUND_NAV].[CHANGE_RATE], [FUND_NAV].[PUB0], [FUND_NAV].[PUB1], [FUND_NAV].[PUB2], [FUND_NAV].[PUB3], [FUND_NAV].[PUB4], [FUND_NAV].[PUB5], [FUND_NAV].[PUB6], [FUND_NAV].[PUB7], [FUND_NAV].[PUB8], [FUND_NAV].[PUB9]   from [FUND_NAV] ";
	}
	
	
	public static String getColumnSql() {
		return " [FUND_NAV].[FUND_CODE], [FUND_NAV].[NAV_DATE], [FUND_NAV].[NAV_VALUE], [FUND_NAV].[NAV_TOTAL_VALUE], [FUND_NAV].[NAV_INCOME], [FUND_NAV].[NAV_INCOME_RATE], [FUND_NAV].[CHANGE_RATE], [FUND_NAV].[PUB0], [FUND_NAV].[PUB1], [FUND_NAV].[PUB2], [FUND_NAV].[PUB3], [FUND_NAV].[PUB4], [FUND_NAV].[PUB5], [FUND_NAV].[PUB6], [FUND_NAV].[PUB7], [FUND_NAV].[PUB8], [FUND_NAV].[PUB9] ";
	}
	
	
	public static String getDataBaseTableName() {
		return "FUND_NAV";
	}
	
	
	public String getTableName() {
		return "FUND_NAV";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段名称，用逗号分隔
	 */
	public String getKeyFieldNames() {
		return "";
	}
	
	
	/**
	 * 返回对象在数据库中的关键字段的字段值，用逗号分隔
	 */
	public String getKeyFieldValues() {
		String kvalue = "";
		return kvalue;
	}
	
	
	/**
	 * 从给定的对象复制值,要求给定的对象是子类
	 * <param name="obj">源对象</param>
	 */
	public void assignFrom(BaseTable obj) {
		super.assignFrom(obj);
		if (FundNav.class.isInstance(obj)) {
			FundNav o = ((FundNav)(obj));
			this.fundCode = o.fundCode;
			this.navDate = o.navDate;
			this.navValue = o.navValue;
			this.navTotalValue = o.navTotalValue;
			this.navIncome = o.navIncome;
			this.navIncomeRate = o.navIncomeRate;
			this.changeRate = o.changeRate;
			this.pub0 = o.pub0;
			this.pub1 = o.pub1;
			this.pub2 = o.pub2;
			this.pub3 = o.pub3;
			this.pub4 = o.pub4;
			this.pub5 = o.pub5;
			this.pub6 = o.pub6;
			this.pub7 = o.pub7;
			this.pub8 = o.pub8;
			this.pub9 = o.pub9;
		}
	}
	
	/**
	 * 插入FundNav对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="fundNav">需要插入的基金净值表</param>
	 */
	protected static void insert(IDataVisit2 dataVisit, FundNav fundNav) throws SQLException, DbException {
		String sql = "insert into [FUND_NAV](";
		sql = (sql + "[FUND_CODE]");
		sql = (sql + ", [NAV_DATE]");
		sql = (sql + ", [NAV_VALUE]");
		sql = (sql + ", [NAV_TOTAL_VALUE]");
		sql = (sql + ", [NAV_INCOME]");
		sql = (sql + ", [NAV_INCOME_RATE]");
		sql = (sql + ", [CHANGE_RATE]");
		sql = (sql + ", [PUB0]");
		sql = (sql + ", [PUB1]");
		sql = (sql + ", [PUB2]");
		sql = (sql + ", [PUB3]");
		sql = (sql + ", [PUB4]");
		sql = (sql + ", [PUB5]");
		sql = (sql + ", [PUB6]");
		sql = (sql + ", [PUB7]");
		sql = (sql + ", [PUB8]");
		sql = (sql + ", [PUB9]");
		sql = (sql + ")values(");
		sql = (sql + SqlServerUtils.safeSql(fundNav.getFundCode().toString()));
		sql = (sql + ", ");
		sql = (sql + SqlServerUtils.getDateSql(fundNav.getNavDate()));
		sql = (sql + ", ");
		sql = (sql + fundNav.getNavValue());
		sql = (sql + ", ");
		sql = (sql + fundNav.getNavTotalValue());
		sql = (sql + ", ");
		if ((fundNav.navIncome == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + fundNav.getNavIncome());
		}
		sql = (sql + ", ");
		if ((fundNav.navIncomeRate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + fundNav.getNavIncomeRate());
		}
		sql = (sql + ", ");
		if ((fundNav.changeRate == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + fundNav.getChangeRate());
		}
		sql = (sql + ", ");
		if ((fundNav.pub0 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub0().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub1 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub1().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub2 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub2().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub3 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub3().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub4 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub4().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub5 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub5().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub6 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub6().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub7 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub7().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub8 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub8().toString()));
		}
		sql = (sql + ", ");
		if ((fundNav.pub9 == null)) {
			sql = (sql + "default");
		}
		else {
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub9().toString()));
		}
		sql = (sql + ")");
		dataVisit.execSql(sql);
	}
	
	/**
	 * 插入FundNav对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public void insert(IDataVisit2 dataVisit) throws SQLException, DbException {
		FundNav.insert(dataVisit, this);
	}
	
	/**
	 * 更新FundNav对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="fundNav">需要更新的基金净值表</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FundNav fundNav, String appendConditionSql) throws SQLException, DbException {
		String sql = "update [FUND_NAV] set ";
		sql = (sql + "[FUND_CODE] = ");
		sql = (sql + SqlServerUtils.safeSql(fundNav.getFundCode().toString()));
		sql = (sql + ",");
		sql = (sql + "[NAV_DATE] = ");
		sql = (sql + SqlServerUtils.getDateSql(fundNav.getNavDate()));
		sql = (sql + ",");
		sql = (sql + "[NAV_VALUE] = ");
		sql = (sql + fundNav.getNavValue());
		sql = (sql + ",");
		sql = (sql + "[NAV_TOTAL_VALUE] = ");
		sql = (sql + fundNav.getNavTotalValue());
		sql = (sql + ",");
		if ((fundNav.navIncome == null)) {
			sql = (sql + "[NAV_INCOME] = default ,");
		}
		else {
			sql = (sql + "[NAV_INCOME] = ");
			sql = (sql + fundNav.getNavIncome());
			sql = (sql + ",");
		}
		if ((fundNav.navIncomeRate == null)) {
			sql = (sql + "[NAV_INCOME_RATE] = default ,");
		}
		else {
			sql = (sql + "[NAV_INCOME_RATE] = ");
			sql = (sql + fundNav.getNavIncomeRate());
			sql = (sql + ",");
		}
		if ((fundNav.changeRate == null)) {
			sql = (sql + "[CHANGE_RATE] = default ,");
		}
		else {
			sql = (sql + "[CHANGE_RATE] = ");
			sql = (sql + fundNav.getChangeRate());
			sql = (sql + ",");
		}
		if ((fundNav.pub0 == null)) {
			sql = (sql + "[PUB0] = default ,");
		}
		else {
			sql = (sql + "[PUB0] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub0().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub1 == null)) {
			sql = (sql + "[PUB1] = default ,");
		}
		else {
			sql = (sql + "[PUB1] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub1().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub2 == null)) {
			sql = (sql + "[PUB2] = default ,");
		}
		else {
			sql = (sql + "[PUB2] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub2().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub3 == null)) {
			sql = (sql + "[PUB3] = default ,");
		}
		else {
			sql = (sql + "[PUB3] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub3().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub4 == null)) {
			sql = (sql + "[PUB4] = default ,");
		}
		else {
			sql = (sql + "[PUB4] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub4().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub5 == null)) {
			sql = (sql + "[PUB5] = default ,");
		}
		else {
			sql = (sql + "[PUB5] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub5().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub6 == null)) {
			sql = (sql + "[PUB6] = default ,");
		}
		else {
			sql = (sql + "[PUB6] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub6().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub7 == null)) {
			sql = (sql + "[PUB7] = default ,");
		}
		else {
			sql = (sql + "[PUB7] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub7().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub8 == null)) {
			sql = (sql + "[PUB8] = default ,");
		}
		else {
			sql = (sql + "[PUB8] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub8().toString()));
			sql = (sql + ",");
		}
		if ((fundNav.pub9 == null)) {
			sql = (sql + "[PUB9] = default ,");
		}
		else {
			sql = (sql + "[PUB9] = ");
			sql = (sql + SqlServerUtils.safeSql(fundNav.getPub9().toString()));
			sql = (sql + ",");
		}
		sql = sql.substring(0, (sql.length() - 1));
		sql = (sql + " where ");
		sql = (sql + appendConditionSql);
		return dataVisit.execSql(sql);
	}
	
	/**
	 * 有条件更新FundNav对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="fundNav">需要更新的基金净值表</param>
	 */
	protected static int update(IDataVisit2 dataVisit, FundNav fundNav) throws SQLException, DbException {
		return FundNav.update(dataVisit, fundNav, "");
	}
	
	/**
	 * 更新FundNav对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 */
	public int update(IDataVisit2 dataVisit) throws SQLException, DbException {
		return FundNav.update(dataVisit, this);
	}
	
	/**
	 * 更新FundNav对象到数据库中
	 * <param name="dataVisit">数据访问接口</param>
	 * <param name="appendConditionSql">更新条件,附加的Sql语句，需要包括And</param>
	 */
	public int update(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		return FundNav.update(dataVisit, this, appendConditionSql);
	}
	
	/**
	 * <param name="dataVisit">数据查询接口</param>
	 * <param name="sql">查询Sql语句</param>
	 * @return 查询结果
	 */
	public static List<FundNav> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql);
		List<FundNav> list = new ArrayList<FundNav>();
		try {
			for (; reader.next(); ) {
				FundNav obj = new FundNav();
				FundNav.readValue(reader, obj);
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
	public static List<FundNav> selectObjectsWithCustomSql(IDataVisit2 dataVisit, String sql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader(sql, pageIndex, rowsOfPage, orderField, order);
		List<FundNav> list = new ArrayList<FundNav>();
		try {
			for (; reader.next(); ) {
				FundNav obj = new FundNav();
				FundNav.readValue(reader, obj);
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
	public static List<FundNav> selectObjects(IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FundNav.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
		List<FundNav> list = new ArrayList<FundNav>();
		try {
			for (; reader.next(); ) {
				FundNav obj = new FundNav();
				FundNav.readValue(reader, obj);
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
	public static List<FundNav> selectObjects(IDataVisit2 dataVisit, String appendConditionSql) throws SQLException, DbException {
		ResultSet reader = dataVisit.queryDataReader((FundNav.getFullSelectSql() + appendConditionSql));
		List<FundNav> list = new ArrayList<FundNav>();
		try {
			for (; reader.next(); ) {
				FundNav obj = new FundNav();
				FundNav.readValue(reader, obj);
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
	public static <T extends FundNav> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql, int pageIndex, int rowsOfPage, String orderField, String order) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FundNav.getFullSelectSql() + appendConditionSql), pageIndex, rowsOfPage, orderField, order);
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FundNav.readValue(reader, obj);
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
public static <T extends FundNav> List<T> selectObjects(Class<T> type, IDataVisit2 dataVisit, String appendConditionSql) throws InstantiationException, IllegalAccessException, SQLException, DbException {
	ResultSet reader = dataVisit.queryDataReader((FundNav.getFullSelectSql() + appendConditionSql));
	List<T> list = new ArrayList<T>();
	try {
		for (; reader.next(); ) {
			T obj = ((T)(type.newInstance()));
			FundNav.readValue(reader, obj);
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
	String sql = "select * from FUND_NAV ";
	sql = (sql + appendConditionSql);
	int ret = dataVisit.getCount(sql);
	return ret;
}

/**
 * 从reader读到数据到对象fundNav中
 * <param name="reader">数据源</param>
 * <param name="fundNav">目标对象</param>
 */
public static void readValue(ResultSet reader, FundNav fundNav) throws SQLException, DbException {
	fundNav.fundCode = reader.getString(1);
	fundNav.navDate = SqlUtils.getDate(reader, 2);
	fundNav.navValue = reader.getDouble(3);
	fundNav.navTotalValue = reader.getDouble(4);
	fundNav.navIncome = reader.getDouble(5);
	if (reader.wasNull()) {
		fundNav.navIncome = null;
	}
	fundNav.navIncomeRate = reader.getDouble(6);
	if (reader.wasNull()) {
		fundNav.navIncomeRate = null;
	}
	fundNav.changeRate = reader.getDouble(7);
	if (reader.wasNull()) {
		fundNav.changeRate = null;
	}
	fundNav.pub0 = reader.getString(8);
	if (reader.wasNull()) {
		fundNav.pub0 = null;
	}
	fundNav.pub1 = reader.getString(9);
	if (reader.wasNull()) {
		fundNav.pub1 = null;
	}
	fundNav.pub2 = reader.getString(10);
	if (reader.wasNull()) {
		fundNav.pub2 = null;
	}
	fundNav.pub3 = reader.getString(11);
	if (reader.wasNull()) {
		fundNav.pub3 = null;
	}
	fundNav.pub4 = reader.getString(12);
	if (reader.wasNull()) {
		fundNav.pub4 = null;
	}
	fundNav.pub5 = reader.getString(13);
	if (reader.wasNull()) {
		fundNav.pub5 = null;
	}
	fundNav.pub6 = reader.getString(14);
	if (reader.wasNull()) {
		fundNav.pub6 = null;
	}
	fundNav.pub7 = reader.getString(15);
	if (reader.wasNull()) {
		fundNav.pub7 = null;
	}
	fundNav.pub8 = reader.getString(16);
	if (reader.wasNull()) {
		fundNav.pub8 = null;
	}
	fundNav.pub9 = reader.getString(17);
	if (reader.wasNull()) {
		fundNav.pub9 = null;
	}
}
}
