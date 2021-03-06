package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class AoD5e466Period extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_period.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_period.CALENDAR_ID
     *
     * @mbggenerated
     */
    private Integer calendarId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_period.ELEMENT_ID
     *
     * @mbggenerated
     */
    private Integer elementId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_period.STARTDATE
     *
     * @mbggenerated
     */
    private Date startdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    public AoD5e466Period(Integer id, Integer calendarId, Integer elementId, Date startdate) {
        this.id = id;
        this.calendarId = calendarId;
        this.elementId = elementId;
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    public AoD5e466Period() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_period.ID
     *
     * @return the value of ao_d5e466_period.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_period.ID
     *
     * @param id the value for ao_d5e466_period.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_period.CALENDAR_ID
     *
     * @return the value of ao_d5e466_period.CALENDAR_ID
     *
     * @mbggenerated
     */
    public Integer getCalendarId() {
        return calendarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_period.CALENDAR_ID
     *
     * @param calendarId the value for ao_d5e466_period.CALENDAR_ID
     *
     * @mbggenerated
     */
    public void setCalendarId(Integer calendarId) {
        this.calendarId = calendarId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_period.ELEMENT_ID
     *
     * @return the value of ao_d5e466_period.ELEMENT_ID
     *
     * @mbggenerated
     */
    public Integer getElementId() {
        return elementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_period.ELEMENT_ID
     *
     * @param elementId the value for ao_d5e466_period.ELEMENT_ID
     *
     * @mbggenerated
     */
    public void setElementId(Integer elementId) {
        this.elementId = elementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_period.STARTDATE
     *
     * @return the value of ao_d5e466_period.STARTDATE
     *
     * @mbggenerated
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_period.STARTDATE
     *
     * @param startdate the value for ao_d5e466_period.STARTDATE
     *
     * @mbggenerated
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }
}