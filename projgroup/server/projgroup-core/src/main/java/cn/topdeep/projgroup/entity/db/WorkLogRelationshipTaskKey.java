package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class WorkLogRelationshipTaskKey extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_work_log_relationship_task.WORK_LOG_ID
     *
     * @mbggenerated
     */
    private Integer workLogId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_work_log_relationship_task.TASK_ID
     *
     * @mbggenerated
     */
    private Integer taskId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    public WorkLogRelationshipTaskKey(Integer workLogId, Integer taskId) {
        this.workLogId = workLogId;
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    public WorkLogRelationshipTaskKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_work_log_relationship_task.WORK_LOG_ID
     *
     * @return the value of t_work_log_relationship_task.WORK_LOG_ID
     *
     * @mbggenerated
     */
    public Integer getWorkLogId() {
        return workLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_work_log_relationship_task.WORK_LOG_ID
     *
     * @param workLogId the value for t_work_log_relationship_task.WORK_LOG_ID
     *
     * @mbggenerated
     */
    public void setWorkLogId(Integer workLogId) {
        this.workLogId = workLogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_work_log_relationship_task.TASK_ID
     *
     * @return the value of t_work_log_relationship_task.TASK_ID
     *
     * @mbggenerated
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_work_log_relationship_task.TASK_ID
     *
     * @param taskId the value for t_work_log_relationship_task.TASK_ID
     *
     * @mbggenerated
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}