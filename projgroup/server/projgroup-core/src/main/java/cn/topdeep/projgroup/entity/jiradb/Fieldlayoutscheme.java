package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Fieldlayoutscheme extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldlayoutscheme.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldlayoutscheme.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fieldlayoutscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    public Fieldlayoutscheme(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    public Fieldlayoutscheme() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldlayoutscheme.ID
     *
     * @return the value of fieldlayoutscheme.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldlayoutscheme.ID
     *
     * @param id the value for fieldlayoutscheme.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldlayoutscheme.NAME
     *
     * @return the value of fieldlayoutscheme.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldlayoutscheme.NAME
     *
     * @param name the value for fieldlayoutscheme.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fieldlayoutscheme.DESCRIPTION
     *
     * @return the value of fieldlayoutscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fieldlayoutscheme.DESCRIPTION
     *
     * @param description the value for fieldlayoutscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}