/**
 * 
 */
package cn.topdeep.projgroup.entity.view;

/**
 * @author niexin
 *
 */
public class VWorkLogViewStat {
	private String realName;

	private Integer workCount;

	public VWorkLogViewStat(String realName, Integer workCount) {
		this.realName = realName;
		this.workCount = workCount;
	}

	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * @return the workCount
	 */
	public Integer getWorkCount() {
		return workCount;
	}

	/**
	 * @param workCount the workCount to set
	 */
	public void setWorkCount(Integer workCount) {
		this.workCount = workCount;
	}
}
