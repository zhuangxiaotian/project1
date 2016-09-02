/**
 * 
 */
package cn.topdeep.projgroup.entity.view;

/**
 * @author niexin
 *
 */
public class PrevMonthWorkScore {
	
	/**
	 * REAL_NAME
	 */
	private String realName;
	/**
	 * WORK_USER_ID
	 */
	private Integer workUserId;
	/**
	 * WORK_DAY_COUNT
	 */
	private Integer	workDayCount;
	/**
	 * WORK_DAY_SCORE
	 */
	private Double workDayScore;
	
	public PrevMonthWorkScore(){
		
	}
	
	public PrevMonthWorkScore(String realName, Integer workUserId, Integer workDayCount, Double workDayScore){
		this.realName = realName;
		this.workUserId = workUserId;
		this.workDayCount = workDayCount;
		this.workDayScore = workDayScore;
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
	 * @return the workUserId
	 */
	public Integer getWorkUserId() {
		return workUserId;
	}
	/**
	 * @param workUserId the workUserId to set
	 */
	public void setWorkUserId(Integer workUserId) {
		this.workUserId = workUserId;
	}
	/**
	 * @return the workDayCount
	 */
	public Integer getWorkDayCount() {
		return workDayCount;
	}
	/**
	 * @param workDayCount the workDayCount to set
	 */
	public void setWorkDayCount(Integer workDayCount) {
		this.workDayCount = workDayCount;
	}
	/**
	 * @return the workDayScore
	 */
	public Double getWorkDayScore() {
		return workDayScore;
	}
	/**
	 * @param workDayScore the workDayScore to set
	 */
	public void setWorkDayScore(Double workDayScore) {
		this.workDayScore = workDayScore;
	}
	
}
