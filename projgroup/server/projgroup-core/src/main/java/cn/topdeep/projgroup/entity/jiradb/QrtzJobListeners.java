package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class QrtzJobListeners extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_listeners.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_listeners.JOB
     *
     * @mbggenerated
     */
    private Long job;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_listeners.JOB_LISTENER
     *
     * @mbggenerated
     */
    private String jobListener;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    public QrtzJobListeners(Long id, Long job, String jobListener) {
        this.id = id;
        this.job = job;
        this.jobListener = jobListener;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    public QrtzJobListeners() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_listeners.ID
     *
     * @return the value of qrtz_job_listeners.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_listeners.ID
     *
     * @param id the value for qrtz_job_listeners.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_listeners.JOB
     *
     * @return the value of qrtz_job_listeners.JOB
     *
     * @mbggenerated
     */
    public Long getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_listeners.JOB
     *
     * @param job the value for qrtz_job_listeners.JOB
     *
     * @mbggenerated
     */
    public void setJob(Long job) {
        this.job = job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_listeners.JOB_LISTENER
     *
     * @return the value of qrtz_job_listeners.JOB_LISTENER
     *
     * @mbggenerated
     */
    public String getJobListener() {
        return jobListener;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_listeners.JOB_LISTENER
     *
     * @param jobListener the value for qrtz_job_listeners.JOB_LISTENER
     *
     * @mbggenerated
     */
    public void setJobListener(String jobListener) {
        this.jobListener = jobListener == null ? null : jobListener.trim();
    }
}