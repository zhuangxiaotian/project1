package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class OsCurrentstep extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.ENTRY_ID
     *
     * @mbggenerated
     */
    private Long entryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.STEP_ID
     *
     * @mbggenerated
     */
    private Integer stepId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.ACTION_ID
     *
     * @mbggenerated
     */
    private Integer actionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.OWNER
     *
     * @mbggenerated
     */
    private String owner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.START_DATE
     *
     * @mbggenerated
     */
    private Date startDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.DUE_DATE
     *
     * @mbggenerated
     */
    private Date dueDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.FINISH_DATE
     *
     * @mbggenerated
     */
    private Date finishDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep.CALLER
     *
     * @mbggenerated
     */
    private String caller;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    public OsCurrentstep(Long id, Long entryId, Integer stepId, Integer actionId, String owner, Date startDate, Date dueDate, Date finishDate, String status, String caller) {
        this.id = id;
        this.entryId = entryId;
        this.stepId = stepId;
        this.actionId = actionId;
        this.owner = owner;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.finishDate = finishDate;
        this.status = status;
        this.caller = caller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    public OsCurrentstep() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.ID
     *
     * @return the value of os_currentstep.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.ID
     *
     * @param id the value for os_currentstep.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.ENTRY_ID
     *
     * @return the value of os_currentstep.ENTRY_ID
     *
     * @mbggenerated
     */
    public Long getEntryId() {
        return entryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.ENTRY_ID
     *
     * @param entryId the value for os_currentstep.ENTRY_ID
     *
     * @mbggenerated
     */
    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.STEP_ID
     *
     * @return the value of os_currentstep.STEP_ID
     *
     * @mbggenerated
     */
    public Integer getStepId() {
        return stepId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.STEP_ID
     *
     * @param stepId the value for os_currentstep.STEP_ID
     *
     * @mbggenerated
     */
    public void setStepId(Integer stepId) {
        this.stepId = stepId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.ACTION_ID
     *
     * @return the value of os_currentstep.ACTION_ID
     *
     * @mbggenerated
     */
    public Integer getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.ACTION_ID
     *
     * @param actionId the value for os_currentstep.ACTION_ID
     *
     * @mbggenerated
     */
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.OWNER
     *
     * @return the value of os_currentstep.OWNER
     *
     * @mbggenerated
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.OWNER
     *
     * @param owner the value for os_currentstep.OWNER
     *
     * @mbggenerated
     */
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.START_DATE
     *
     * @return the value of os_currentstep.START_DATE
     *
     * @mbggenerated
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.START_DATE
     *
     * @param startDate the value for os_currentstep.START_DATE
     *
     * @mbggenerated
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.DUE_DATE
     *
     * @return the value of os_currentstep.DUE_DATE
     *
     * @mbggenerated
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.DUE_DATE
     *
     * @param dueDate the value for os_currentstep.DUE_DATE
     *
     * @mbggenerated
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.FINISH_DATE
     *
     * @return the value of os_currentstep.FINISH_DATE
     *
     * @mbggenerated
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.FINISH_DATE
     *
     * @param finishDate the value for os_currentstep.FINISH_DATE
     *
     * @mbggenerated
     */
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.STATUS
     *
     * @return the value of os_currentstep.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.STATUS
     *
     * @param status the value for os_currentstep.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep.CALLER
     *
     * @return the value of os_currentstep.CALLER
     *
     * @mbggenerated
     */
    public String getCaller() {
        return caller;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep.CALLER
     *
     * @param caller the value for os_currentstep.CALLER
     *
     * @mbggenerated
     */
    public void setCaller(String caller) {
        this.caller = caller == null ? null : caller.trim();
    }
}