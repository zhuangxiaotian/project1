package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Gadgetuserpreference extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gadgetuserpreference.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gadgetuserpreference.PORTLETCONFIGURATION
     *
     * @mbggenerated
     */
    private Long portletconfiguration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gadgetuserpreference.USERPREFKEY
     *
     * @mbggenerated
     */
    private String userprefkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gadgetuserpreference.USERPREFVALUE
     *
     * @mbggenerated
     */
    private String userprefvalue;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    public Gadgetuserpreference(Long id, Long portletconfiguration, String userprefkey, String userprefvalue) {
        this.id = id;
        this.portletconfiguration = portletconfiguration;
        this.userprefkey = userprefkey;
        this.userprefvalue = userprefvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    public Gadgetuserpreference() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gadgetuserpreference.ID
     *
     * @return the value of gadgetuserpreference.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gadgetuserpreference.ID
     *
     * @param id the value for gadgetuserpreference.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gadgetuserpreference.PORTLETCONFIGURATION
     *
     * @return the value of gadgetuserpreference.PORTLETCONFIGURATION
     *
     * @mbggenerated
     */
    public Long getPortletconfiguration() {
        return portletconfiguration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gadgetuserpreference.PORTLETCONFIGURATION
     *
     * @param portletconfiguration the value for gadgetuserpreference.PORTLETCONFIGURATION
     *
     * @mbggenerated
     */
    public void setPortletconfiguration(Long portletconfiguration) {
        this.portletconfiguration = portletconfiguration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gadgetuserpreference.USERPREFKEY
     *
     * @return the value of gadgetuserpreference.USERPREFKEY
     *
     * @mbggenerated
     */
    public String getUserprefkey() {
        return userprefkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gadgetuserpreference.USERPREFKEY
     *
     * @param userprefkey the value for gadgetuserpreference.USERPREFKEY
     *
     * @mbggenerated
     */
    public void setUserprefkey(String userprefkey) {
        this.userprefkey = userprefkey == null ? null : userprefkey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gadgetuserpreference.USERPREFVALUE
     *
     * @return the value of gadgetuserpreference.USERPREFVALUE
     *
     * @mbggenerated
     */
    public String getUserprefvalue() {
        return userprefvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gadgetuserpreference.USERPREFVALUE
     *
     * @param userprefvalue the value for gadgetuserpreference.USERPREFVALUE
     *
     * @mbggenerated
     */
    public void setUserprefvalue(String userprefvalue) {
        this.userprefvalue = userprefvalue == null ? null : userprefvalue.trim();
    }
}