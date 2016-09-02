/**
 * 
 */
package cn.topdeep.projgroup.entity.response;

import java.io.Serializable;
import java.util.List;

/**
 * @author niexin
 *
 */
public class EChartSeriesData implements Serializable {
	private String name;
	private String type;
	private int yAxisIndex = 0;
	private List<Integer> data;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the data
	 */
	public List<Integer> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<Integer> data) {
		this.data = data;
	}

	/**
	 * @return the yAxisIndex
	 */
	public int getyAxisIndex() {
		return yAxisIndex;
	}

	/**
	 * @param yAxisIndex the yAxisIndex to set
	 */
	public void setyAxisIndex(int yAxisIndex) {
		this.yAxisIndex = yAxisIndex;
	}
}
