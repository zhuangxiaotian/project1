package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Genericconfiguration extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column genericconfiguration.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column genericconfiguration.DATATYPE
     *
     * @mbggenerated
     */
    private String datatype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column genericconfiguration.DATAKEY
     *
     * @mbggenerated
     */
    private String datakey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column genericconfiguration.XMLVALUE
     *
     * @mbggenerated
     */
    private String xmlvalue;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genericconfiguration
     *
     * @mbggenerated
     */
    public Genericconfiguration(Long id, String datatype, String datakey, String xmlvalue) {
        this.id = id;
        this.datatype = datatype;
        this.datakey = datakey;
        this.xmlvalue = xmlvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table genericconfiguration
     *
     * @mbggenerated
     */
    public Genericconfiguration() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column genericconfiguration.ID
     *
     * @return the value of genericconfiguration.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column genericconfiguration.ID
     *
     * @param id the value for genericconfiguration.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column genericconfiguration.DATATYPE
     *
     * @return the value of genericconfiguration.DATATYPE
     *
     * @mbggenerated
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column genericconfiguration.DATATYPE
     *
     * @param datatype the value for genericconfiguration.DATATYPE
     *
     * @mbggenerated
     */
    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column genericconfiguration.DATAKEY
     *
     * @return the value of genericconfiguration.DATAKEY
     *
     * @mbggenerated
     */
    public String getDatakey() {
        return datakey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column genericconfiguration.DATAKEY
     *
     * @param datakey the value for genericconfiguration.DATAKEY
     *
     * @mbggenerated
     */
    public void setDatakey(String datakey) {
        this.datakey = datakey == null ? null : datakey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column genericconfiguration.XMLVALUE
     *
     * @return the value of genericconfiguration.XMLVALUE
     *
     * @mbggenerated
     */
    public String getXmlvalue() {
        return xmlvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column genericconfiguration.XMLVALUE
     *
     * @param xmlvalue the value for genericconfiguration.XMLVALUE
     *
     * @mbggenerated
     */
    public void setXmlvalue(String xmlvalue) {
        this.xmlvalue = xmlvalue == null ? null : xmlvalue.trim();
    }
}