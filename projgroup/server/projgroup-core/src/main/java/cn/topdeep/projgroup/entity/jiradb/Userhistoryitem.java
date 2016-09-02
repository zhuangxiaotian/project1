package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Userhistoryitem extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userhistoryitem.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userhistoryitem.entitytype
     *
     * @mbggenerated
     */
    private String entitytype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userhistoryitem.entityid
     *
     * @mbggenerated
     */
    private String entityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userhistoryitem.USERNAME
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userhistoryitem.lastviewed
     *
     * @mbggenerated
     */
    private Long lastviewed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userhistoryitem.data
     *
     * @mbggenerated
     */
    private String data;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userhistoryitem
     *
     * @mbggenerated
     */
    public Userhistoryitem(Long id, String entitytype, String entityid, String username, Long lastviewed, String data) {
        this.id = id;
        this.entitytype = entitytype;
        this.entityid = entityid;
        this.username = username;
        this.lastviewed = lastviewed;
        this.data = data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userhistoryitem
     *
     * @mbggenerated
     */
    public Userhistoryitem() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userhistoryitem.ID
     *
     * @return the value of userhistoryitem.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userhistoryitem.ID
     *
     * @param id the value for userhistoryitem.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userhistoryitem.entitytype
     *
     * @return the value of userhistoryitem.entitytype
     *
     * @mbggenerated
     */
    public String getEntitytype() {
        return entitytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userhistoryitem.entitytype
     *
     * @param entitytype the value for userhistoryitem.entitytype
     *
     * @mbggenerated
     */
    public void setEntitytype(String entitytype) {
        this.entitytype = entitytype == null ? null : entitytype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userhistoryitem.entityid
     *
     * @return the value of userhistoryitem.entityid
     *
     * @mbggenerated
     */
    public String getEntityid() {
        return entityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userhistoryitem.entityid
     *
     * @param entityid the value for userhistoryitem.entityid
     *
     * @mbggenerated
     */
    public void setEntityid(String entityid) {
        this.entityid = entityid == null ? null : entityid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userhistoryitem.USERNAME
     *
     * @return the value of userhistoryitem.USERNAME
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userhistoryitem.USERNAME
     *
     * @param username the value for userhistoryitem.USERNAME
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userhistoryitem.lastviewed
     *
     * @return the value of userhistoryitem.lastviewed
     *
     * @mbggenerated
     */
    public Long getLastviewed() {
        return lastviewed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userhistoryitem.lastviewed
     *
     * @param lastviewed the value for userhistoryitem.lastviewed
     *
     * @mbggenerated
     */
    public void setLastviewed(Long lastviewed) {
        this.lastviewed = lastviewed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userhistoryitem.data
     *
     * @return the value of userhistoryitem.data
     *
     * @mbggenerated
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userhistoryitem.data
     *
     * @param data the value for userhistoryitem.data
     *
     * @mbggenerated
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}