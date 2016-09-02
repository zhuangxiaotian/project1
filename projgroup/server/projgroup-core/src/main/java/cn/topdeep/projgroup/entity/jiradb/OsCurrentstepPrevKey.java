package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class OsCurrentstepPrevKey extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep_prev.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column os_currentstep_prev.PREVIOUS_ID
     *
     * @mbggenerated
     */
    private Long previousId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    public OsCurrentstepPrevKey(Long id, Long previousId) {
        this.id = id;
        this.previousId = previousId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    public OsCurrentstepPrevKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep_prev.ID
     *
     * @return the value of os_currentstep_prev.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep_prev.ID
     *
     * @param id the value for os_currentstep_prev.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column os_currentstep_prev.PREVIOUS_ID
     *
     * @return the value of os_currentstep_prev.PREVIOUS_ID
     *
     * @mbggenerated
     */
    public Long getPreviousId() {
        return previousId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column os_currentstep_prev.PREVIOUS_ID
     *
     * @param previousId the value for os_currentstep_prev.PREVIOUS_ID
     *
     * @mbggenerated
     */
    public void setPreviousId(Long previousId) {
        this.previousId = previousId;
    }
}