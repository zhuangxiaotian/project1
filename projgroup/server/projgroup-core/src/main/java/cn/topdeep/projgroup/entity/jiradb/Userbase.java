package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Userbase extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userbase.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userbase.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userbase.PASSWORD_HASH
     *
     * @mbggenerated
     */
    private String passwordHash;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbase
     *
     * @mbggenerated
     */
    public Userbase(Long id, String username, String passwordHash) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userbase
     *
     * @mbggenerated
     */
    public Userbase() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userbase.ID
     *
     * @return the value of userbase.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userbase.ID
     *
     * @param id the value for userbase.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userbase.username
     *
     * @return the value of userbase.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userbase.username
     *
     * @param username the value for userbase.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userbase.PASSWORD_HASH
     *
     * @return the value of userbase.PASSWORD_HASH
     *
     * @mbggenerated
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userbase.PASSWORD_HASH
     *
     * @param passwordHash the value for userbase.PASSWORD_HASH
     *
     * @mbggenerated
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash == null ? null : passwordHash.trim();
    }
}