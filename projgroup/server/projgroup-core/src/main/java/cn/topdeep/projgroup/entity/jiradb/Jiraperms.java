package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Jiraperms extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jiraperms.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jiraperms.permtype
     *
     * @mbggenerated
     */
    private Long permtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jiraperms.projectid
     *
     * @mbggenerated
     */
    private Long projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jiraperms.groupname
     *
     * @mbggenerated
     */
    private String groupname;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraperms
     *
     * @mbggenerated
     */
    public Jiraperms(Long id, Long permtype, Long projectid, String groupname) {
        this.id = id;
        this.permtype = permtype;
        this.projectid = projectid;
        this.groupname = groupname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraperms
     *
     * @mbggenerated
     */
    public Jiraperms() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jiraperms.ID
     *
     * @return the value of jiraperms.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jiraperms.ID
     *
     * @param id the value for jiraperms.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jiraperms.permtype
     *
     * @return the value of jiraperms.permtype
     *
     * @mbggenerated
     */
    public Long getPermtype() {
        return permtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jiraperms.permtype
     *
     * @param permtype the value for jiraperms.permtype
     *
     * @mbggenerated
     */
    public void setPermtype(Long permtype) {
        this.permtype = permtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jiraperms.projectid
     *
     * @return the value of jiraperms.projectid
     *
     * @mbggenerated
     */
    public Long getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jiraperms.projectid
     *
     * @param projectid the value for jiraperms.projectid
     *
     * @mbggenerated
     */
    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jiraperms.groupname
     *
     * @return the value of jiraperms.groupname
     *
     * @mbggenerated
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jiraperms.groupname
     *
     * @param groupname the value for jiraperms.groupname
     *
     * @mbggenerated
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }
}