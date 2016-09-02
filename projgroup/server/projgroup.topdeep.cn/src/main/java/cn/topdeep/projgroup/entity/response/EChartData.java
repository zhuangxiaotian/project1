/**
 * 
 */
package cn.topdeep.projgroup.entity.response;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author niexin
 *
 */
public class EChartData implements Serializable {
	private List<EChartSeriesData> seriesList;

	private List<String> dateList;

	private List<String> userList;

	private Map<String, Boolean> selectedUser;

	private long lastRefreshTime;

	/**
	 * @return the seriesList
	 */
	public List<EChartSeriesData> getSeriesList() {
		return seriesList;
	}

	/**
	 * @param seriesList the seriesList to set
	 */
	public void setSeriesList(List<EChartSeriesData> seriesList) {
		this.seriesList = seriesList;
	}

	/**
	 * @return the dateList
	 */
	public List<String> getDateList() {
		return dateList;
	}

	/**
	 * @param dateList the dateList to set
	 */
	public void setDateList(List<String> dateList) {
		this.dateList = dateList;
	}

	/**
	 * @return the userList
	 */
	public List<String> getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

	/**
	 * @return the selectedUser
	 */
	public Map<String, Boolean> getSelectedUser() {
		return selectedUser;
	}

	/**
	 * @param selectedUser the selectedUser to set
	 */
	public void setSelectedUser(Map<String, Boolean> selectedUser) {
		this.selectedUser = selectedUser;
	}

	/**
	 * @return the lastRefreshTime
	 */
	public long getLastRefreshTime() {
		return lastRefreshTime;
	}

	/**
	 * @param lastRefreshTime the lastRefreshTime to set
	 */
	public void setLastRefreshTime(long lastRefreshTime) {
		this.lastRefreshTime = lastRefreshTime;
	}

}
