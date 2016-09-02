package cn.topdeep.projgroup.entity.jiradb;

import java.util.Date;

public class ViewTopdeepWorkWithBLOBs extends ViewTopdeepWork {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column view_topdeep_work.DESCRIPTION
	 *
	 * @mbggenerated
	 */
	private String description;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column view_topdeep_work.ENVIRONMENT
	 *
	 * @mbggenerated
	 */
	private String environment;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table view_topdeep_work
	 *
	 * @mbggenerated
	 */
	public ViewTopdeepWorkWithBLOBs(Long id, String pkey, Long project, String reporter, String assignee, String issuetype, String summary, String priority,
			String resolution, String issuestatus, Date created, Date updated, Date duedate, Date resolutiondate, Long votes, Long watches,
			Long timeoriginalestimate, Long timeestimate, Long timespent, Long workflowId, Long security, Long fixfor, Long component, Date closeDate,
			Double difficulty, Double topdeepbean, String userName, String description, String environment) {
		super(id, pkey, project, reporter, assignee, issuetype, summary, priority, resolution, issuestatus, created, updated, duedate, resolutiondate, votes,
				watches, timeoriginalestimate, timeestimate, timespent, workflowId, security, fixfor, component, closeDate, difficulty, topdeepbean, userName);
		this.description = description;
		this.environment = environment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table view_topdeep_work
	 *
	 * @mbggenerated
	 */
	public ViewTopdeepWorkWithBLOBs() {
		super();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column view_topdeep_work.DESCRIPTION
	 *
	 * @return the value of view_topdeep_work.DESCRIPTION
	 *
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column view_topdeep_work.DESCRIPTION
	 *
	 * @param description the value for view_topdeep_work.DESCRIPTION
	 *
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column view_topdeep_work.ENVIRONMENT
	 *
	 * @return the value of view_topdeep_work.ENVIRONMENT
	 *
	 * @mbggenerated
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column view_topdeep_work.ENVIRONMENT
	 *
	 * @param environment the value for view_topdeep_work.ENVIRONMENT
	 *
	 * @mbggenerated
	 */
	public void setEnvironment(String environment) {
		this.environment = environment == null ? null : environment.trim();
	}
}