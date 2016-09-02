package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class QrtzJobDetails extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_details.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_details.JOB_NAME
     *
     * @mbggenerated
     */
    private String jobName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_details.JOB_GROUP
     *
     * @mbggenerated
     */
    private String jobGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_details.CLASS_NAME
     *
     * @mbggenerated
     */
    private String className;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_details.IS_DURABLE
     *
     * @mbggenerated
     */
    private String isDurable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_details.IS_STATEFUL
     *
     * @mbggenerated
     */
    private String isStateful;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_details.REQUESTS_RECOVERY
     *
     * @mbggenerated
     */
    private String requestsRecovery;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_job_details.JOB_DATA
     *
     * @mbggenerated
     */
    private String jobData;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    public QrtzJobDetails(Long id, String jobName, String jobGroup, String className, String isDurable, String isStateful, String requestsRecovery, String jobData) {
        this.id = id;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.className = className;
        this.isDurable = isDurable;
        this.isStateful = isStateful;
        this.requestsRecovery = requestsRecovery;
        this.jobData = jobData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    public QrtzJobDetails() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_details.ID
     *
     * @return the value of qrtz_job_details.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_details.ID
     *
     * @param id the value for qrtz_job_details.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_details.JOB_NAME
     *
     * @return the value of qrtz_job_details.JOB_NAME
     *
     * @mbggenerated
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_details.JOB_NAME
     *
     * @param jobName the value for qrtz_job_details.JOB_NAME
     *
     * @mbggenerated
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_details.JOB_GROUP
     *
     * @return the value of qrtz_job_details.JOB_GROUP
     *
     * @mbggenerated
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_details.JOB_GROUP
     *
     * @param jobGroup the value for qrtz_job_details.JOB_GROUP
     *
     * @mbggenerated
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup == null ? null : jobGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_details.CLASS_NAME
     *
     * @return the value of qrtz_job_details.CLASS_NAME
     *
     * @mbggenerated
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_details.CLASS_NAME
     *
     * @param className the value for qrtz_job_details.CLASS_NAME
     *
     * @mbggenerated
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_details.IS_DURABLE
     *
     * @return the value of qrtz_job_details.IS_DURABLE
     *
     * @mbggenerated
     */
    public String getIsDurable() {
        return isDurable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_details.IS_DURABLE
     *
     * @param isDurable the value for qrtz_job_details.IS_DURABLE
     *
     * @mbggenerated
     */
    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable == null ? null : isDurable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_details.IS_STATEFUL
     *
     * @return the value of qrtz_job_details.IS_STATEFUL
     *
     * @mbggenerated
     */
    public String getIsStateful() {
        return isStateful;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_details.IS_STATEFUL
     *
     * @param isStateful the value for qrtz_job_details.IS_STATEFUL
     *
     * @mbggenerated
     */
    public void setIsStateful(String isStateful) {
        this.isStateful = isStateful == null ? null : isStateful.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_details.REQUESTS_RECOVERY
     *
     * @return the value of qrtz_job_details.REQUESTS_RECOVERY
     *
     * @mbggenerated
     */
    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_details.REQUESTS_RECOVERY
     *
     * @param requestsRecovery the value for qrtz_job_details.REQUESTS_RECOVERY
     *
     * @mbggenerated
     */
    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery == null ? null : requestsRecovery.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_job_details.JOB_DATA
     *
     * @return the value of qrtz_job_details.JOB_DATA
     *
     * @mbggenerated
     */
    public String getJobData() {
        return jobData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_job_details.JOB_DATA
     *
     * @param jobData the value for qrtz_job_details.JOB_DATA
     *
     * @mbggenerated
     */
    public void setJobData(String jobData) {
        this.jobData = jobData == null ? null : jobData.trim();
    }
}