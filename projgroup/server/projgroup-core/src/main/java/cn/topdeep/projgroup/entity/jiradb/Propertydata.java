package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Propertydata extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertydata.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertydata.propertyvalue
     *
     * @mbggenerated
     */
    private byte[] propertyvalue;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydata
     *
     * @mbggenerated
     */
    public Propertydata(Long id, byte[] propertyvalue) {
        this.id = id;
        this.propertyvalue = propertyvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydata
     *
     * @mbggenerated
     */
    public Propertydata() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertydata.ID
     *
     * @return the value of propertydata.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertydata.ID
     *
     * @param id the value for propertydata.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertydata.propertyvalue
     *
     * @return the value of propertydata.propertyvalue
     *
     * @mbggenerated
     */
    public byte[] getPropertyvalue() {
        return propertyvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertydata.propertyvalue
     *
     * @param propertyvalue the value for propertydata.propertyvalue
     *
     * @mbggenerated
     */
    public void setPropertyvalue(byte[] propertyvalue) {
        this.propertyvalue = propertyvalue;
    }
}