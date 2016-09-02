package cn.topdeep.projgroup.entity;
import common.dbvisit.*;
import common.db.*;
import java.util.*;
import common.util.*;
import java.sql.*;
import common.cache2.*;
import java.io.*;
/**
 * FUND_NAV查询条件定义
 */
public class FundNavQueryCondition extends Object implements ConditionQuery {
	
	/**
	 * 查询条件,FUND_CODE: 基金代码
	 */
	String fundCode;
	
	/**
	 * 查询条件字符串相等,FUND_CODE: 基金代码
	 */
	String fundCodeEqual;
	
	/**
	 * 查询条件,NAV_DATE: 净值日期
	 */
	java.util.Date navDate;
	
	/**
	 * 查询条件开始值,NAV_DATE: 净值日期
	 */
	java.util.Date navDateBegin;
	
	/**
	 * 查询条件结束值,NAV_DATE: 净值日期
	 */
	java.util.Date navDateEnd;
	
	/**
	 * 查询条件结束值,NAV_DATE: 净值日期
	 */
	java.util.Date navDateEndEqual;
	
	/**
	 * 查询条件,NAV_VALUE: 净值
	 */
	Double navValue;
	
	/**
	 * 查询条件开始值,NAV_VALUE: 净值
	 */
	Double navValueBegin;
	
	/**
	 * 查询条件结束值,NAV_VALUE: 净值
	 */
	Double navValueEnd;
	
	/**
	 * 查询条件结束值,NAV_VALUE: 净值
	 */
	Double navValueEndEqual;
	
	/**
	 * 查询条件,NAV_TOTAL_VALUE: 累计净值
	 */
	Double navTotalValue;
	
	/**
	 * 查询条件开始值,NAV_TOTAL_VALUE: 累计净值
	 */
	Double navTotalValueBegin;
	
	/**
	 * 查询条件结束值,NAV_TOTAL_VALUE: 累计净值
	 */
	Double navTotalValueEnd;
	
	/**
	 * 查询条件结束值,NAV_TOTAL_VALUE: 累计净值
	 */
	Double navTotalValueEndEqual;
	
	/**
	 * 查询条件,NAV_INCOME: 万份收益
	 */
	Double navIncome;
	
	/**
	 * 查询条件开始值,NAV_INCOME: 万份收益
	 */
	Double navIncomeBegin;
	
	/**
	 * 查询条件结束值,NAV_INCOME: 万份收益
	 */
	Double navIncomeEnd;
	
	/**
	 * 查询条件结束值,NAV_INCOME: 万份收益
	 */
	Double navIncomeEndEqual;
	
	/**
	 * 查询条件,NAV_INCOME_RATE: 七日年化收益率
	 */
	Double navIncomeRate;
	
	/**
	 * 查询条件开始值,NAV_INCOME_RATE: 七日年化收益率
	 */
	Double navIncomeRateBegin;
	
	/**
	 * 查询条件结束值,NAV_INCOME_RATE: 七日年化收益率
	 */
	Double navIncomeRateEnd;
	
	/**
	 * 查询条件结束值,NAV_INCOME_RATE: 七日年化收益率
	 */
	Double navIncomeRateEndEqual;
	
	/**
	 * 查询条件,CHANGE_RATE: 涨跌幅
	 */
	Double changeRate;
	
	/**
	 * 查询条件开始值,CHANGE_RATE: 涨跌幅
	 */
	Double changeRateBegin;
	
	/**
	 * 查询条件结束值,CHANGE_RATE: 涨跌幅
	 */
	Double changeRateEnd;
	
	/**
	 * 查询条件结束值,CHANGE_RATE: 涨跌幅
	 */
	Double changeRateEndEqual;
	
	/**
	 * 查询条件,PUB0: 备用
	 */
	String pub0;
	
	/**
	 * 查询条件字符串相等,PUB0: 备用
	 */
	String pub0Equal;
	
	/**
	 * 查询条件,PUB1: 备用
	 */
	String pub1;
	
	/**
	 * 查询条件字符串相等,PUB1: 备用
	 */
	String pub1Equal;
	
	/**
	 * 查询条件,PUB2: 备用
	 */
	String pub2;
	
	/**
	 * 查询条件字符串相等,PUB2: 备用
	 */
	String pub2Equal;
	
	/**
	 * 查询条件,PUB3: 备用
	 */
	String pub3;
	
	/**
	 * 查询条件字符串相等,PUB3: 备用
	 */
	String pub3Equal;
	
	/**
	 * 查询条件,PUB4: 备用
	 */
	String pub4;
	
	/**
	 * 查询条件字符串相等,PUB4: 备用
	 */
	String pub4Equal;
	
	/**
	 * 查询条件,PUB5: 备用
	 */
	String pub5;
	
	/**
	 * 查询条件字符串相等,PUB5: 备用
	 */
	String pub5Equal;
	
	/**
	 * 查询条件,PUB6: 备用
	 */
	String pub6;
	
	/**
	 * 查询条件字符串相等,PUB6: 备用
	 */
	String pub6Equal;
	
	/**
	 * 查询条件,PUB7: 备用
	 */
	String pub7;
	
	/**
	 * 查询条件字符串相等,PUB7: 备用
	 */
	String pub7Equal;
	
	/**
	 * 查询条件,PUB8: 备用
	 */
	String pub8;
	
	/**
	 * 查询条件字符串相等,PUB8: 备用
	 */
	String pub8Equal;
	
	/**
	 * 查询条件,PUB9: 备用
	 */
	String pub9;
	
	/**
	 * 查询条件字符串相等,PUB9: 备用
	 */
	String pub9Equal;
	
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
	 * 查询条件字符串相等,FUND_CODE: 基金代码
	 */
	public String getFundCodeEqual() {
		return this.fundCodeEqual;
	}
	
	/**
	 * 查询条件字符串相等,FUND_CODE: 基金代码
	 */
	public void setFundCodeEqual(String value)
	 {
		this.fundCodeEqual = value;
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
	 * 查询条件开始值,NAV_DATE: 净值日期
	 */
	public java.util.Date getNavDateBegin() {
		return this.navDateBegin;
	}
	
	/**
	 * 查询条件开始值,NAV_DATE: 净值日期
	 */
	public void setNavDateBegin(java.util.Date value)
	 {
		this.navDateBegin = value;
	}
	
	/**
	 * 查询条件结束值,NAV_DATE: 净值日期
	 */
	public java.util.Date getNavDateEnd() {
		return this.navDateEnd;
	}
	
	/**
	 * 查询条件结束值,NAV_DATE: 净值日期
	 */
	public void setNavDateEnd(java.util.Date value)
	 {
		this.navDateEnd = value;
	}
	
	/**
	 * 查询条件结束值,NAV_DATE: 净值日期
	 */
	public java.util.Date getNavDateEndEqual() {
		return this.navDateEndEqual;
	}
	
	/**
	 * 查询条件结束值,NAV_DATE: 净值日期
	 */
	public void setNavDateEndEqual(java.util.Date value)
	 {
		this.navDateEndEqual = value;
	}
	
	/**
	 * NAV_VALUE: 净值
	 */
	public Double getNavValue() {
		return this.navValue;
	}
	
	/**
	 * NAV_VALUE: 净值
	 */
	public void setNavValue(Double value)
	 {
		this.navValue = value;
	}
	
	/**
	 * 查询条件开始值,NAV_VALUE: 净值
	 */
	public Double getNavValueBegin() {
		return this.navValueBegin;
	}
	
	/**
	 * 查询条件开始值,NAV_VALUE: 净值
	 */
	public void setNavValueBegin(Double value)
	 {
		this.navValueBegin = value;
	}
	
	/**
	 * 查询条件结束值,NAV_VALUE: 净值
	 */
	public Double getNavValueEnd() {
		return this.navValueEnd;
	}
	
	/**
	 * 查询条件结束值,NAV_VALUE: 净值
	 */
	public void setNavValueEnd(Double value)
	 {
		this.navValueEnd = value;
	}
	
	/**
	 * 查询条件结束值,NAV_VALUE: 净值
	 */
	public Double getNavValueEndEqual() {
		return this.navValueEndEqual;
	}
	
	/**
	 * 查询条件结束值,NAV_VALUE: 净值
	 */
	public void setNavValueEndEqual(Double value)
	 {
		this.navValueEndEqual = value;
	}
	
	/**
	 * NAV_TOTAL_VALUE: 累计净值
	 */
	public Double getNavTotalValue() {
		return this.navTotalValue;
	}
	
	/**
	 * NAV_TOTAL_VALUE: 累计净值
	 */
	public void setNavTotalValue(Double value)
	 {
		this.navTotalValue = value;
	}
	
	/**
	 * 查询条件开始值,NAV_TOTAL_VALUE: 累计净值
	 */
	public Double getNavTotalValueBegin() {
		return this.navTotalValueBegin;
	}
	
	/**
	 * 查询条件开始值,NAV_TOTAL_VALUE: 累计净值
	 */
	public void setNavTotalValueBegin(Double value)
	 {
		this.navTotalValueBegin = value;
	}
	
	/**
	 * 查询条件结束值,NAV_TOTAL_VALUE: 累计净值
	 */
	public Double getNavTotalValueEnd() {
		return this.navTotalValueEnd;
	}
	
	/**
	 * 查询条件结束值,NAV_TOTAL_VALUE: 累计净值
	 */
	public void setNavTotalValueEnd(Double value)
	 {
		this.navTotalValueEnd = value;
	}
	
	/**
	 * 查询条件结束值,NAV_TOTAL_VALUE: 累计净值
	 */
	public Double getNavTotalValueEndEqual() {
		return this.navTotalValueEndEqual;
	}
	
	/**
	 * 查询条件结束值,NAV_TOTAL_VALUE: 累计净值
	 */
	public void setNavTotalValueEndEqual(Double value)
	 {
		this.navTotalValueEndEqual = value;
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
	 * 查询条件开始值,NAV_INCOME: 万份收益
	 */
	public Double getNavIncomeBegin() {
		return this.navIncomeBegin;
	}
	
	/**
	 * 查询条件开始值,NAV_INCOME: 万份收益
	 */
	public void setNavIncomeBegin(Double value)
	 {
		this.navIncomeBegin = value;
	}
	
	/**
	 * 查询条件结束值,NAV_INCOME: 万份收益
	 */
	public Double getNavIncomeEnd() {
		return this.navIncomeEnd;
	}
	
	/**
	 * 查询条件结束值,NAV_INCOME: 万份收益
	 */
	public void setNavIncomeEnd(Double value)
	 {
		this.navIncomeEnd = value;
	}
	
	/**
	 * 查询条件结束值,NAV_INCOME: 万份收益
	 */
	public Double getNavIncomeEndEqual() {
		return this.navIncomeEndEqual;
	}
	
	/**
	 * 查询条件结束值,NAV_INCOME: 万份收益
	 */
	public void setNavIncomeEndEqual(Double value)
	 {
		this.navIncomeEndEqual = value;
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
	 * 查询条件开始值,NAV_INCOME_RATE: 七日年化收益率
	 */
	public Double getNavIncomeRateBegin() {
		return this.navIncomeRateBegin;
	}
	
	/**
	 * 查询条件开始值,NAV_INCOME_RATE: 七日年化收益率
	 */
	public void setNavIncomeRateBegin(Double value)
	 {
		this.navIncomeRateBegin = value;
	}
	
	/**
	 * 查询条件结束值,NAV_INCOME_RATE: 七日年化收益率
	 */
	public Double getNavIncomeRateEnd() {
		return this.navIncomeRateEnd;
	}
	
	/**
	 * 查询条件结束值,NAV_INCOME_RATE: 七日年化收益率
	 */
	public void setNavIncomeRateEnd(Double value)
	 {
		this.navIncomeRateEnd = value;
	}
	
	/**
	 * 查询条件结束值,NAV_INCOME_RATE: 七日年化收益率
	 */
	public Double getNavIncomeRateEndEqual() {
		return this.navIncomeRateEndEqual;
	}
	
	/**
	 * 查询条件结束值,NAV_INCOME_RATE: 七日年化收益率
	 */
	public void setNavIncomeRateEndEqual(Double value)
	 {
		this.navIncomeRateEndEqual = value;
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
	 * 查询条件开始值,CHANGE_RATE: 涨跌幅
	 */
	public Double getChangeRateBegin() {
		return this.changeRateBegin;
	}
	
	/**
	 * 查询条件开始值,CHANGE_RATE: 涨跌幅
	 */
	public void setChangeRateBegin(Double value)
	 {
		this.changeRateBegin = value;
	}
	
	/**
	 * 查询条件结束值,CHANGE_RATE: 涨跌幅
	 */
	public Double getChangeRateEnd() {
		return this.changeRateEnd;
	}
	
	/**
	 * 查询条件结束值,CHANGE_RATE: 涨跌幅
	 */
	public void setChangeRateEnd(Double value)
	 {
		this.changeRateEnd = value;
	}
	
	/**
	 * 查询条件结束值,CHANGE_RATE: 涨跌幅
	 */
	public Double getChangeRateEndEqual() {
		return this.changeRateEndEqual;
	}
	
	/**
	 * 查询条件结束值,CHANGE_RATE: 涨跌幅
	 */
	public void setChangeRateEndEqual(Double value)
	 {
		this.changeRateEndEqual = value;
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
	 * 查询条件字符串相等,PUB0: 备用
	 */
	public String getPub0Equal() {
		return this.pub0Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB0: 备用
	 */
	public void setPub0Equal(String value)
	 {
		this.pub0Equal = value;
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
	 * 查询条件字符串相等,PUB1: 备用
	 */
	public String getPub1Equal() {
		return this.pub1Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB1: 备用
	 */
	public void setPub1Equal(String value)
	 {
		this.pub1Equal = value;
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
	 * 查询条件字符串相等,PUB2: 备用
	 */
	public String getPub2Equal() {
		return this.pub2Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB2: 备用
	 */
	public void setPub2Equal(String value)
	 {
		this.pub2Equal = value;
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
	 * 查询条件字符串相等,PUB3: 备用
	 */
	public String getPub3Equal() {
		return this.pub3Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB3: 备用
	 */
	public void setPub3Equal(String value)
	 {
		this.pub3Equal = value;
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
	 * 查询条件字符串相等,PUB4: 备用
	 */
	public String getPub4Equal() {
		return this.pub4Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB4: 备用
	 */
	public void setPub4Equal(String value)
	 {
		this.pub4Equal = value;
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
	 * 查询条件字符串相等,PUB5: 备用
	 */
	public String getPub5Equal() {
		return this.pub5Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB5: 备用
	 */
	public void setPub5Equal(String value)
	 {
		this.pub5Equal = value;
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
	 * 查询条件字符串相等,PUB6: 备用
	 */
	public String getPub6Equal() {
		return this.pub6Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB6: 备用
	 */
	public void setPub6Equal(String value)
	 {
		this.pub6Equal = value;
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
	 * 查询条件字符串相等,PUB7: 备用
	 */
	public String getPub7Equal() {
		return this.pub7Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB7: 备用
	 */
	public void setPub7Equal(String value)
	 {
		this.pub7Equal = value;
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
	 * 查询条件字符串相等,PUB8: 备用
	 */
	public String getPub8Equal() {
		return this.pub8Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB8: 备用
	 */
	public void setPub8Equal(String value)
	 {
		this.pub8Equal = value;
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
	
	/**
	 * 查询条件字符串相等,PUB9: 备用
	 */
	public String getPub9Equal() {
		return this.pub9Equal;
	}
	
	/**
	 * 查询条件字符串相等,PUB9: 备用
	 */
	public void setPub9Equal(String value)
	 {
		this.pub9Equal = value;
	}
	
	/**
	 * 设置查询条件FUND_CODE: 基金代码
	 */
	public FundNavQueryCondition setFundCodeCondition(String value) {
		this.fundCode = value;
		return this;
	}
	
	/**
	 * 设置查询条件FUND_CODE: 基金代码
	 */
	public FundNavQueryCondition setFundCodeConditionEqual(String value) {
		this.fundCodeEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_DATE: 净值日期
	 */
	public FundNavQueryCondition setNavDateCondition(java.util.Date value) {
		this.navDate = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_DATE: 净值日期
	 */
	public FundNavQueryCondition setNavDateConditionBegin(java.util.Date value) {
		this.navDateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_DATE: 净值日期
	 */
	public FundNavQueryCondition setNavDateConditionEnd(java.util.Date value) {
		this.navDateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_DATE: 净值日期
	 */
	public FundNavQueryCondition setNavDateConditionEndEqual(java.util.Date value) {
		this.navDateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_VALUE: 净值
	 */
	public FundNavQueryCondition setNavValueCondition(Double value) {
		this.navValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_VALUE: 净值
	 */
	public FundNavQueryCondition setNavValueConditionBegin(Double value) {
		this.navValueBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_VALUE: 净值
	 */
	public FundNavQueryCondition setNavValueConditionEnd(Double value) {
		this.navValueEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_VALUE: 净值
	 */
	public FundNavQueryCondition setNavValueConditionEndEqual(Double value) {
		this.navValueEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_TOTAL_VALUE: 累计净值
	 */
	public FundNavQueryCondition setNavTotalValueCondition(Double value) {
		this.navTotalValue = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_TOTAL_VALUE: 累计净值
	 */
	public FundNavQueryCondition setNavTotalValueConditionBegin(Double value) {
		this.navTotalValueBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_TOTAL_VALUE: 累计净值
	 */
	public FundNavQueryCondition setNavTotalValueConditionEnd(Double value) {
		this.navTotalValueEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_TOTAL_VALUE: 累计净值
	 */
	public FundNavQueryCondition setNavTotalValueConditionEndEqual(Double value) {
		this.navTotalValueEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_INCOME: 万份收益
	 */
	public FundNavQueryCondition setNavIncomeCondition(Double value) {
		this.navIncome = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_INCOME: 万份收益
	 */
	public FundNavQueryCondition setNavIncomeConditionBegin(Double value) {
		this.navIncomeBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_INCOME: 万份收益
	 */
	public FundNavQueryCondition setNavIncomeConditionEnd(Double value) {
		this.navIncomeEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_INCOME: 万份收益
	 */
	public FundNavQueryCondition setNavIncomeConditionEndEqual(Double value) {
		this.navIncomeEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_INCOME_RATE: 七日年化收益率
	 */
	public FundNavQueryCondition setNavIncomeRateCondition(Double value) {
		this.navIncomeRate = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_INCOME_RATE: 七日年化收益率
	 */
	public FundNavQueryCondition setNavIncomeRateConditionBegin(Double value) {
		this.navIncomeRateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_INCOME_RATE: 七日年化收益率
	 */
	public FundNavQueryCondition setNavIncomeRateConditionEnd(Double value) {
		this.navIncomeRateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件NAV_INCOME_RATE: 七日年化收益率
	 */
	public FundNavQueryCondition setNavIncomeRateConditionEndEqual(Double value) {
		this.navIncomeRateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件CHANGE_RATE: 涨跌幅
	 */
	public FundNavQueryCondition setChangeRateCondition(Double value) {
		this.changeRate = value;
		return this;
	}
	
	/**
	 * 设置查询条件CHANGE_RATE: 涨跌幅
	 */
	public FundNavQueryCondition setChangeRateConditionBegin(Double value) {
		this.changeRateBegin = value;
		return this;
	}
	
	/**
	 * 设置查询条件CHANGE_RATE: 涨跌幅
	 */
	public FundNavQueryCondition setChangeRateConditionEnd(Double value) {
		this.changeRateEnd = value;
		return this;
	}
	
	/**
	 * 设置查询条件CHANGE_RATE: 涨跌幅
	 */
	public FundNavQueryCondition setChangeRateConditionEndEqual(Double value) {
		this.changeRateEndEqual = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用
	 */
	public FundNavQueryCondition setPub0Condition(String value) {
		this.pub0 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB0: 备用
	 */
	public FundNavQueryCondition setPub0ConditionEqual(String value) {
		this.pub0Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用
	 */
	public FundNavQueryCondition setPub1Condition(String value) {
		this.pub1 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB1: 备用
	 */
	public FundNavQueryCondition setPub1ConditionEqual(String value) {
		this.pub1Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用
	 */
	public FundNavQueryCondition setPub2Condition(String value) {
		this.pub2 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB2: 备用
	 */
	public FundNavQueryCondition setPub2ConditionEqual(String value) {
		this.pub2Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用
	 */
	public FundNavQueryCondition setPub3Condition(String value) {
		this.pub3 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB3: 备用
	 */
	public FundNavQueryCondition setPub3ConditionEqual(String value) {
		this.pub3Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用
	 */
	public FundNavQueryCondition setPub4Condition(String value) {
		this.pub4 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB4: 备用
	 */
	public FundNavQueryCondition setPub4ConditionEqual(String value) {
		this.pub4Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用
	 */
	public FundNavQueryCondition setPub5Condition(String value) {
		this.pub5 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB5: 备用
	 */
	public FundNavQueryCondition setPub5ConditionEqual(String value) {
		this.pub5Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB6: 备用
	 */
	public FundNavQueryCondition setPub6Condition(String value) {
		this.pub6 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB6: 备用
	 */
	public FundNavQueryCondition setPub6ConditionEqual(String value) {
		this.pub6Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB7: 备用
	 */
	public FundNavQueryCondition setPub7Condition(String value) {
		this.pub7 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB7: 备用
	 */
	public FundNavQueryCondition setPub7ConditionEqual(String value) {
		this.pub7Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB8: 备用
	 */
	public FundNavQueryCondition setPub8Condition(String value) {
		this.pub8 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB8: 备用
	 */
	public FundNavQueryCondition setPub8ConditionEqual(String value) {
		this.pub8Equal = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB9: 备用
	 */
	public FundNavQueryCondition setPub9Condition(String value) {
		this.pub9 = value;
		return this;
	}
	
	/**
	 * 设置查询条件PUB9: 备用
	 */
	public FundNavQueryCondition setPub9ConditionEqual(String value) {
		this.pub9Equal = value;
		return this;
	}
	
	/**
	 * 获得查询条件的附加Sql
	 */
	public String getConditionSql() {
		String sql = "";
		if (StringUtils.isNullOrEmpty(this.fundCode)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[FUND_CODE]", this.fundCode)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.fundCodeEqual)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[FUND_CODE] = " + SqlServerUtils.safeSql(this.fundCodeEqual))) 
						+ ") "));
		}
		if ((this.navDate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([FUND_NAV].[NAV_DATE] = " + SqlServerUtils.getDateSql(this.navDate)) 
						+ ") "));
		}
		if ((this.navDateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_DATE] >= " 
						+ (SqlServerUtils.getDateSql(this.navDateBegin) + ")")));
		}
		if ((this.navDateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_DATE] < " 
						+ (SqlServerUtils.getDateSql(this.navDateEnd) + ") ")));
		}
		if ((this.navDateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_DATE] < " 
						+ (SqlServerUtils.getNextDateSql(this.navDateEndEqual) + ") ")));
		}
		if ((this.navValue == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([FUND_NAV].[NAV_VALUE] = " + this.navValue) 
						+ ") "));
		}
		if ((this.navValueBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_VALUE] >= " 
						+ (this.navValueBegin + ")")));
		}
		if ((this.navValueEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_VALUE] < " 
						+ (this.navValueEnd + ") ")));
		}
		if ((this.navValueEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_VALUE] <= " 
						+ (this.navValueEndEqual + ") ")));
		}
		if ((this.navTotalValue == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([FUND_NAV].[NAV_TOTAL_VALUE] = " + this.navTotalValue) 
						+ ") "));
		}
		if ((this.navTotalValueBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_TOTAL_VALUE] >= " 
						+ (this.navTotalValueBegin + ")")));
		}
		if ((this.navTotalValueEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_TOTAL_VALUE] < " 
						+ (this.navTotalValueEnd + ") ")));
		}
		if ((this.navTotalValueEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_TOTAL_VALUE] <= " 
						+ (this.navTotalValueEndEqual + ") ")));
		}
		if ((this.navIncome == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([FUND_NAV].[NAV_INCOME] = " + this.navIncome) 
						+ ") "));
		}
		if ((this.navIncomeBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_INCOME] >= " 
						+ (this.navIncomeBegin + ")")));
		}
		if ((this.navIncomeEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_INCOME] < " 
						+ (this.navIncomeEnd + ") ")));
		}
		if ((this.navIncomeEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_INCOME] <= " 
						+ (this.navIncomeEndEqual + ") ")));
		}
		if ((this.navIncomeRate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([FUND_NAV].[NAV_INCOME_RATE] = " + this.navIncomeRate) 
						+ ") "));
		}
		if ((this.navIncomeRateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_INCOME_RATE] >= " 
						+ (this.navIncomeRateBegin + ")")));
		}
		if ((this.navIncomeRateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_INCOME_RATE] < " 
						+ (this.navIncomeRateEnd + ") ")));
		}
		if ((this.navIncomeRateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[NAV_INCOME_RATE] <= " 
						+ (this.navIncomeRateEndEqual + ") ")));
		}
		if ((this.changeRate == null)) {
		}
		else {
			sql = (sql 
						+ ((" and ([FUND_NAV].[CHANGE_RATE] = " + this.changeRate) 
						+ ") "));
		}
		if ((this.changeRateBegin == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[CHANGE_RATE] >= " 
						+ (this.changeRateBegin + ")")));
		}
		if ((this.changeRateEnd == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[CHANGE_RATE] < " 
						+ (this.changeRateEnd + ") ")));
		}
		if ((this.changeRateEndEqual == null)) {
		}
		else {
			sql = (sql 
						+ (" and ([FUND_NAV].[CHANGE_RATE] <= " 
						+ (this.changeRateEndEqual + ") ")));
		}
		if (StringUtils.isNullOrEmpty(this.pub0)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB0]", this.pub0)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub0Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB0] = " + SqlServerUtils.safeSql(this.pub0Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB1]", this.pub1)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub1Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB1] = " + SqlServerUtils.safeSql(this.pub1Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB2]", this.pub2)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub2Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB2] = " + SqlServerUtils.safeSql(this.pub2Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB3]", this.pub3)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub3Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB3] = " + SqlServerUtils.safeSql(this.pub3Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB4]", this.pub4)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub4Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB4] = " + SqlServerUtils.safeSql(this.pub4Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB5]", this.pub5)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub5Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB5] = " + SqlServerUtils.safeSql(this.pub5Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub6)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB6]", this.pub6)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub6Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB6] = " + SqlServerUtils.safeSql(this.pub6Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub7)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB7]", this.pub7)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub7Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB7] = " + SqlServerUtils.safeSql(this.pub7Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub8)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB8]", this.pub8)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub8Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB8] = " + SqlServerUtils.safeSql(this.pub8Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub9)) {
		}
		else {
			sql = (sql 
						+ ((" and (" + SqlServerUtils.getLikeSql("[FUND_NAV].[PUB9]", this.pub9)) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(this.pub9Equal)) {
		}
		else {
			sql = (sql 
						+ ((" and (" 
						+ ("[FUND_NAV].[PUB9] = " + SqlServerUtils.safeSql(this.pub9Equal))) 
						+ ") "));
		}
		if (StringUtils.isNullOrEmpty(sql)) {
			return sql;
		}
		sql = sql.substring(4);
		return sql;
	}
}
