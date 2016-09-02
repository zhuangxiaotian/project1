package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Issuesecurityscheme extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuesecurityscheme.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuesecurityscheme.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuesecurityscheme.DEFAULTLEVEL
     *
     * @mbggenerated
     */
    private Long defaultlevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuesecurityscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuesecurityscheme
     *
     * @mbggenerated
     */
    public Issuesecurityscheme(Long id, String name, Long defaultlevel, String description) {
        this.id = id;
        this.name = name;
        this.defaultlevel = defaultlevel;
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuesecurityscheme
     *
     * @mbggenerated
     */
    public Issuesecurityscheme() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuesecurityscheme.ID
     *
     * @return the value of issuesecurityscheme.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuesecurityscheme.ID
     *
     * @param id the value for issuesecurityscheme.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuesecurityscheme.NAME
     *
     * @return the value of issuesecurityscheme.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuesecurityscheme.NAME
     *
     * @param name the value for issuesecurityscheme.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuesecurityscheme.DEFAULTLEVEL
     *
     * @return the value of issuesecurityscheme.DEFAULTLEVEL
     *
     * @mbggenerated
     */
    public Long getDefaultlevel() {
        return defaultlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuesecurityscheme.DEFAULTLEVEL
     *
     * @param defaultlevel the value for issuesecurityscheme.DEFAULTLEVEL
     *
     * @mbggenerated
     */
    public void setDefaultlevel(Long defaultlevel) {
        this.defaultlevel = defaultlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuesecurityscheme.DESCRIPTION
     *
     * @return the value of issuesecurityscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuesecurityscheme.DESCRIPTION
     *
     * @param description the value for issuesecurityscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}