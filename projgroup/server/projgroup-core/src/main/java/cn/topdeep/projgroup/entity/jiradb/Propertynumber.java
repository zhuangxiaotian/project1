package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Propertynumber extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertynumber.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertynumber.propertyvalue
     *
     * @mbggenerated
     */
    private Long propertyvalue;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertynumber
     *
     * @mbggenerated
     */
    public Propertynumber(Long id, Long propertyvalue) {
        this.id = id;
        this.propertyvalue = propertyvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertynumber
     *
     * @mbggenerated
     */
    public Propertynumber() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertynumber.ID
     *
     * @return the value of propertynumber.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertynumber.ID
     *
     * @param id the value for propertynumber.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertynumber.propertyvalue
     *
     * @return the value of propertynumber.propertyvalue
     *
     * @mbggenerated
     */
    public Long getPropertyvalue() {
        return propertyvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertynumber.propertyvalue
     *
     * @param propertyvalue the value for propertynumber.propertyvalue
     *
     * @mbggenerated
     */
    public void setPropertyvalue(Long propertyvalue) {
        this.propertyvalue = propertyvalue;
    }
}