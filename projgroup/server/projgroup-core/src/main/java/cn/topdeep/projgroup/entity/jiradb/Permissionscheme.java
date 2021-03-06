package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Permissionscheme extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissionscheme.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissionscheme.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permissionscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionscheme
     *
     * @mbggenerated
     */
    public Permissionscheme(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table permissionscheme
     *
     * @mbggenerated
     */
    public Permissionscheme() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissionscheme.ID
     *
     * @return the value of permissionscheme.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permissionscheme.ID
     *
     * @param id the value for permissionscheme.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissionscheme.NAME
     *
     * @return the value of permissionscheme.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permissionscheme.NAME
     *
     * @param name the value for permissionscheme.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permissionscheme.DESCRIPTION
     *
     * @return the value of permissionscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permissionscheme.DESCRIPTION
     *
     * @param description the value for permissionscheme.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}