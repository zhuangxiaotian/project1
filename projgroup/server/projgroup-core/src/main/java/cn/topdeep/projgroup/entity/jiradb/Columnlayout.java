package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Columnlayout extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column columnlayout.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column columnlayout.USERNAME
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column columnlayout.SEARCHREQUEST
     *
     * @mbggenerated
     */
    private Long searchrequest;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayout
     *
     * @mbggenerated
     */
    public Columnlayout(Long id, String username, Long searchrequest) {
        this.id = id;
        this.username = username;
        this.searchrequest = searchrequest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayout
     *
     * @mbggenerated
     */
    public Columnlayout() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column columnlayout.ID
     *
     * @return the value of columnlayout.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column columnlayout.ID
     *
     * @param id the value for columnlayout.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column columnlayout.USERNAME
     *
     * @return the value of columnlayout.USERNAME
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column columnlayout.USERNAME
     *
     * @param username the value for columnlayout.USERNAME
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column columnlayout.SEARCHREQUEST
     *
     * @return the value of columnlayout.SEARCHREQUEST
     *
     * @mbggenerated
     */
    public Long getSearchrequest() {
        return searchrequest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column columnlayout.SEARCHREQUEST
     *
     * @param searchrequest the value for columnlayout.SEARCHREQUEST
     *
     * @mbggenerated
     */
    public void setSearchrequest(Long searchrequest) {
        this.searchrequest = searchrequest;
    }
}