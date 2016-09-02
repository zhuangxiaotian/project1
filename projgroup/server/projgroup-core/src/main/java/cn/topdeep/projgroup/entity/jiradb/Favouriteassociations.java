package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Favouriteassociations extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favouriteassociations.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favouriteassociations.USERNAME
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favouriteassociations.entitytype
     *
     * @mbggenerated
     */
    private String entitytype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favouriteassociations.entityid
     *
     * @mbggenerated
     */
    private Long entityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column favouriteassociations.SEQUENCE
     *
     * @mbggenerated
     */
    private Long sequence;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    public Favouriteassociations(Long id, String username, String entitytype, Long entityid, Long sequence) {
        this.id = id;
        this.username = username;
        this.entitytype = entitytype;
        this.entityid = entityid;
        this.sequence = sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    public Favouriteassociations() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favouriteassociations.ID
     *
     * @return the value of favouriteassociations.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favouriteassociations.ID
     *
     * @param id the value for favouriteassociations.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favouriteassociations.USERNAME
     *
     * @return the value of favouriteassociations.USERNAME
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favouriteassociations.USERNAME
     *
     * @param username the value for favouriteassociations.USERNAME
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favouriteassociations.entitytype
     *
     * @return the value of favouriteassociations.entitytype
     *
     * @mbggenerated
     */
    public String getEntitytype() {
        return entitytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favouriteassociations.entitytype
     *
     * @param entitytype the value for favouriteassociations.entitytype
     *
     * @mbggenerated
     */
    public void setEntitytype(String entitytype) {
        this.entitytype = entitytype == null ? null : entitytype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favouriteassociations.entityid
     *
     * @return the value of favouriteassociations.entityid
     *
     * @mbggenerated
     */
    public Long getEntityid() {
        return entityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favouriteassociations.entityid
     *
     * @param entityid the value for favouriteassociations.entityid
     *
     * @mbggenerated
     */
    public void setEntityid(Long entityid) {
        this.entityid = entityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column favouriteassociations.SEQUENCE
     *
     * @return the value of favouriteassociations.SEQUENCE
     *
     * @mbggenerated
     */
    public Long getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column favouriteassociations.SEQUENCE
     *
     * @param sequence the value for favouriteassociations.SEQUENCE
     *
     * @mbggenerated
     */
    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
}