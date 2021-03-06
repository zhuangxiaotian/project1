package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Fieldconfiguration extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldconfiguration.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldconfiguration.configname
     *
     * @mbggenerated
     */
    private String configname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldconfiguration.FIELDID
     *
     * @mbggenerated
     */
    private String fieldid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldconfiguration.CUSTOMFIELD
     *
     * @mbggenerated
     */
    private Long customfield;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldconfiguration.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfiguration
     *
     * @mbggenerated
     */
    public Fieldconfiguration(Long id, String configname, String fieldid, Long customfield, String description) {
        this.id = id;
        this.configname = configname;
        this.fieldid = fieldid;
        this.customfield = customfield;
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfiguration
     *
     * @mbggenerated
     */
    public Fieldconfiguration() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldconfiguration.ID
     *
     * @return the value of fieldconfiguration.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldconfiguration.ID
     *
     * @param id the value for fieldconfiguration.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldconfiguration.configname
     *
     * @return the value of fieldconfiguration.configname
     *
     * @mbggenerated
     */
    public String getConfigname() {
        return configname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldconfiguration.configname
     *
     * @param configname the value for fieldconfiguration.configname
     *
     * @mbggenerated
     */
    public void setConfigname(String configname) {
        this.configname = configname == null ? null : configname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldconfiguration.FIELDID
     *
     * @return the value of fieldconfiguration.FIELDID
     *
     * @mbggenerated
     */
    public String getFieldid() {
        return fieldid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldconfiguration.FIELDID
     *
     * @param fieldid the value for fieldconfiguration.FIELDID
     *
     * @mbggenerated
     */
    public void setFieldid(String fieldid) {
        this.fieldid = fieldid == null ? null : fieldid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldconfiguration.CUSTOMFIELD
     *
     * @return the value of fieldconfiguration.CUSTOMFIELD
     *
     * @mbggenerated
     */
    public Long getCustomfield() {
        return customfield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldconfiguration.CUSTOMFIELD
     *
     * @param customfield the value for fieldconfiguration.CUSTOMFIELD
     *
     * @mbggenerated
     */
    public void setCustomfield(Long customfield) {
        this.customfield = customfield;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldconfiguration.DESCRIPTION
     *
     * @return the value of fieldconfiguration.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldconfiguration.DESCRIPTION
     *
     * @param description the value for fieldconfiguration.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}