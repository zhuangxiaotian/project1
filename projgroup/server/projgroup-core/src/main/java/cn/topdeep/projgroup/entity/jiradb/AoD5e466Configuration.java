package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class AoD5e466Configuration extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_configuration.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_configuration.KEYNAME
     *
     * @mbggenerated
     */
    private String keyname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_configuration.VALUE
     *
     * @mbggenerated
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_configuration
     *
     * @mbggenerated
     */
    public AoD5e466Configuration(Integer id, String keyname, String value) {
        this.id = id;
        this.keyname = keyname;
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_configuration
     *
     * @mbggenerated
     */
    public AoD5e466Configuration() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_configuration.ID
     *
     * @return the value of ao_d5e466_configuration.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_configuration.ID
     *
     * @param id the value for ao_d5e466_configuration.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_configuration.KEYNAME
     *
     * @return the value of ao_d5e466_configuration.KEYNAME
     *
     * @mbggenerated
     */
    public String getKeyname() {
        return keyname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_configuration.KEYNAME
     *
     * @param keyname the value for ao_d5e466_configuration.KEYNAME
     *
     * @mbggenerated
     */
    public void setKeyname(String keyname) {
        this.keyname = keyname == null ? null : keyname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_configuration.VALUE
     *
     * @return the value of ao_d5e466_configuration.VALUE
     *
     * @mbggenerated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_configuration.VALUE
     *
     * @param value the value for ao_d5e466_configuration.VALUE
     *
     * @mbggenerated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}