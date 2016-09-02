package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class Changegroup extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column changegroup.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column changegroup.issueid
     *
     * @mbggenerated
     */
    private Long issueid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column changegroup.AUTHOR
     *
     * @mbggenerated
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column changegroup.CREATED
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changegroup
     *
     * @mbggenerated
     */
    public Changegroup(Long id, Long issueid, String author, Date created) {
        this.id = id;
        this.issueid = issueid;
        this.author = author;
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changegroup
     *
     * @mbggenerated
     */
    public Changegroup() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column changegroup.ID
     *
     * @return the value of changegroup.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column changegroup.ID
     *
     * @param id the value for changegroup.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column changegroup.issueid
     *
     * @return the value of changegroup.issueid
     *
     * @mbggenerated
     */
    public Long getIssueid() {
        return issueid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column changegroup.issueid
     *
     * @param issueid the value for changegroup.issueid
     *
     * @mbggenerated
     */
    public void setIssueid(Long issueid) {
        this.issueid = issueid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column changegroup.AUTHOR
     *
     * @return the value of changegroup.AUTHOR
     *
     * @mbggenerated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column changegroup.AUTHOR
     *
     * @param author the value for changegroup.AUTHOR
     *
     * @mbggenerated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column changegroup.CREATED
     *
     * @return the value of changegroup.CREATED
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column changegroup.CREATED
     *
     * @param created the value for changegroup.CREATED
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}