package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class QrtzSimpleTriggers extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_simple_triggers.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_simple_triggers.trigger_id
     *
     * @mbggenerated
     */
    private Long triggerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_simple_triggers.REPEAT_COUNT
     *
     * @mbggenerated
     */
    private Integer repeatCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_simple_triggers.REPEAT_INTERVAL
     *
     * @mbggenerated
     */
    private Long repeatInterval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column qrtz_simple_triggers.TIMES_TRIGGERED
     *
     * @mbggenerated
     */
    private Integer timesTriggered;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_simple_triggers
     *
     * @mbggenerated
     */
    public QrtzSimpleTriggers(Long id, Long triggerId, Integer repeatCount, Long repeatInterval, Integer timesTriggered) {
        this.id = id;
        this.triggerId = triggerId;
        this.repeatCount = repeatCount;
        this.repeatInterval = repeatInterval;
        this.timesTriggered = timesTriggered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_simple_triggers
     *
     * @mbggenerated
     */
    public QrtzSimpleTriggers() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_simple_triggers.ID
     *
     * @return the value of qrtz_simple_triggers.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_simple_triggers.ID
     *
     * @param id the value for qrtz_simple_triggers.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_simple_triggers.trigger_id
     *
     * @return the value of qrtz_simple_triggers.trigger_id
     *
     * @mbggenerated
     */
    public Long getTriggerId() {
        return triggerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_simple_triggers.trigger_id
     *
     * @param triggerId the value for qrtz_simple_triggers.trigger_id
     *
     * @mbggenerated
     */
    public void setTriggerId(Long triggerId) {
        this.triggerId = triggerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_simple_triggers.REPEAT_COUNT
     *
     * @return the value of qrtz_simple_triggers.REPEAT_COUNT
     *
     * @mbggenerated
     */
    public Integer getRepeatCount() {
        return repeatCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_simple_triggers.REPEAT_COUNT
     *
     * @param repeatCount the value for qrtz_simple_triggers.REPEAT_COUNT
     *
     * @mbggenerated
     */
    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_simple_triggers.REPEAT_INTERVAL
     *
     * @return the value of qrtz_simple_triggers.REPEAT_INTERVAL
     *
     * @mbggenerated
     */
    public Long getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_simple_triggers.REPEAT_INTERVAL
     *
     * @param repeatInterval the value for qrtz_simple_triggers.REPEAT_INTERVAL
     *
     * @mbggenerated
     */
    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column qrtz_simple_triggers.TIMES_TRIGGERED
     *
     * @return the value of qrtz_simple_triggers.TIMES_TRIGGERED
     *
     * @mbggenerated
     */
    public Integer getTimesTriggered() {
        return timesTriggered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column qrtz_simple_triggers.TIMES_TRIGGERED
     *
     * @param timesTriggered the value for qrtz_simple_triggers.TIMES_TRIGGERED
     *
     * @mbggenerated
     */
    public void setTimesTriggered(Integer timesTriggered) {
        this.timesTriggered = timesTriggered;
    }
}