package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Fieldlayout extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldlayout.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldlayout.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldlayout.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldlayout.layout_type
     *
     * @mbggenerated
     */
    private String layoutType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldlayout.LAYOUTSCHEME
     *
     * @mbggenerated
     */
    private Long layoutscheme;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayout
     *
     * @mbggenerated
     */
    public Fieldlayout(Long id, String name, String description, String layoutType, Long layoutscheme) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.layoutType = layoutType;
        this.layoutscheme = layoutscheme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayout
     *
     * @mbggenerated
     */
    public Fieldlayout() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldlayout.ID
     *
     * @return the value of fieldlayout.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldlayout.ID
     *
     * @param id the value for fieldlayout.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldlayout.NAME
     *
     * @return the value of fieldlayout.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldlayout.NAME
     *
     * @param name the value for fieldlayout.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldlayout.DESCRIPTION
     *
     * @return the value of fieldlayout.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldlayout.DESCRIPTION
     *
     * @param description the value for fieldlayout.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldlayout.layout_type
     *
     * @return the value of fieldlayout.layout_type
     *
     * @mbggenerated
     */
    public String getLayoutType() {
        return layoutType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldlayout.layout_type
     *
     * @param layoutType the value for fieldlayout.layout_type
     *
     * @mbggenerated
     */
    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType == null ? null : layoutType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldlayout.LAYOUTSCHEME
     *
     * @return the value of fieldlayout.LAYOUTSCHEME
     *
     * @mbggenerated
     */
    public Long getLayoutscheme() {
        return layoutscheme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldlayout.LAYOUTSCHEME
     *
     * @param layoutscheme the value for fieldlayout.LAYOUTSCHEME
     *
     * @mbggenerated
     */
    public void setLayoutscheme(Long layoutscheme) {
        this.layoutscheme = layoutscheme;
    }
}