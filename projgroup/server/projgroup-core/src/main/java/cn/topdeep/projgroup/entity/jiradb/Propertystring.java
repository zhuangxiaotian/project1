package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Propertystring extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertystring.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertystring.propertyvalue
     *
     * @mbggenerated
     */
    private String propertyvalue;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertystring
     *
     * @mbggenerated
     */
    public Propertystring(Long id, String propertyvalue) {
        this.id = id;
        this.propertyvalue = propertyvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertystring
     *
     * @mbggenerated
     */
    public Propertystring() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertystring.ID
     *
     * @return the value of propertystring.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertystring.ID
     *
     * @param id the value for propertystring.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertystring.propertyvalue
     *
     * @return the value of propertystring.propertyvalue
     *
     * @mbggenerated
     */
    public String getPropertyvalue() {
        return propertyvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertystring.propertyvalue
     *
     * @param propertyvalue the value for propertystring.propertyvalue
     *
     * @mbggenerated
     */
    public void setPropertyvalue(String propertyvalue) {
        this.propertyvalue = propertyvalue == null ? null : propertyvalue.trim();
    }
}