/**
 * 
 */
package cn.topdeep.projgroup.entity.response;

import java.util.List;

import cn.topdeep.projgroup.entity.view.NameValue;

/**
 * @author niexin
 *
 */
public class IndexResponse extends BaseResponse {
	private List<NameValue> columnList;

	private List<ViewTopdeepBeanChangeView> topdeepBeanChangeList;

	private EChartData eChartData;

	/**
	 * @return the columnList
	 */
	public List<NameValue> getColumnList() {
		return columnList;
	}

	/**
	 * @param columnList the columnList to set
	 */
	public void setColumnList(List<NameValue> columnList) {
		this.columnList = columnList;
	}

	/**
	 * @return the topdeepBeanChangeList
	 */
	public List<ViewTopdeepBeanChangeView> getTopdeepBeanChangeList() {
		return topdeepBeanChangeList;
	}

	/**
	 * @param topdeepBeanChangeList the topdeepBeanChangeList to set
	 */
	public void setTopdeepBeanChangeList(List<ViewTopdeepBeanChangeView> topdeepBeanChangeList) {
		this.topdeepBeanChangeList = topdeepBeanChangeList;
	}

	/**
	 * @return the eChartData
	 */
	public EChartData geteChartData() {
		return eChartData;
	}

	/**
	 * @param eChartData the eChartData to set
	 */
	public void seteChartData(EChartData eChartData) {
		this.eChartData = eChartData;
	}
}
