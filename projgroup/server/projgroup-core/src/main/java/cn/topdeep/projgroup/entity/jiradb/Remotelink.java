package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Remotelink extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remotelink.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remotelink.ISSUEID
     *
     * @mbggenerated
     */
    private Long issueid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remotelink.GLOBALID
     *
     * @mbggenerated
     */
    private String globalid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remotelink.TITLE
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remotelink.RELATIONSHIP
     *
     * @mbggenerated
     */
    private String relationship;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remotelink.RESOLVED
     *
     * @mbggenerated
     */
    private String resolved;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remotelink.APPLICATIONTYPE
     *
     * @mbggenerated
     */
    private String applicationtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column remotelink.APPLICATIONNAME
     *
     * @mbggenerated
     */
    private String applicationname;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remotelink
     *
     * @mbggenerated
     */
    public Remotelink(Long id, Long issueid, String globalid, String title, String relationship, String resolved, String applicationtype, String applicationname) {
        this.id = id;
        this.issueid = issueid;
        this.globalid = globalid;
        this.title = title;
        this.relationship = relationship;
        this.resolved = resolved;
        this.applicationtype = applicationtype;
        this.applicationname = applicationname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remotelink
     *
     * @mbggenerated
     */
    public Remotelink() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remotelink.ID
     *
     * @return the value of remotelink.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remotelink.ID
     *
     * @param id the value for remotelink.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remotelink.ISSUEID
     *
     * @return the value of remotelink.ISSUEID
     *
     * @mbggenerated
     */
    public Long getIssueid() {
        return issueid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remotelink.ISSUEID
     *
     * @param issueid the value for remotelink.ISSUEID
     *
     * @mbggenerated
     */
    public void setIssueid(Long issueid) {
        this.issueid = issueid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remotelink.GLOBALID
     *
     * @return the value of remotelink.GLOBALID
     *
     * @mbggenerated
     */
    public String getGlobalid() {
        return globalid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remotelink.GLOBALID
     *
     * @param globalid the value for remotelink.GLOBALID
     *
     * @mbggenerated
     */
    public void setGlobalid(String globalid) {
        this.globalid = globalid == null ? null : globalid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remotelink.TITLE
     *
     * @return the value of remotelink.TITLE
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remotelink.TITLE
     *
     * @param title the value for remotelink.TITLE
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remotelink.RELATIONSHIP
     *
     * @return the value of remotelink.RELATIONSHIP
     *
     * @mbggenerated
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remotelink.RELATIONSHIP
     *
     * @param relationship the value for remotelink.RELATIONSHIP
     *
     * @mbggenerated
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remotelink.RESOLVED
     *
     * @return the value of remotelink.RESOLVED
     *
     * @mbggenerated
     */
    public String getResolved() {
        return resolved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remotelink.RESOLVED
     *
     * @param resolved the value for remotelink.RESOLVED
     *
     * @mbggenerated
     */
    public void setResolved(String resolved) {
        this.resolved = resolved == null ? null : resolved.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remotelink.APPLICATIONTYPE
     *
     * @return the value of remotelink.APPLICATIONTYPE
     *
     * @mbggenerated
     */
    public String getApplicationtype() {
        return applicationtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remotelink.APPLICATIONTYPE
     *
     * @param applicationtype the value for remotelink.APPLICATIONTYPE
     *
     * @mbggenerated
     */
    public void setApplicationtype(String applicationtype) {
        this.applicationtype = applicationtype == null ? null : applicationtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column remotelink.APPLICATIONNAME
     *
     * @return the value of remotelink.APPLICATIONNAME
     *
     * @mbggenerated
     */
    public String getApplicationname() {
        return applicationname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column remotelink.APPLICATIONNAME
     *
     * @param applicationname the value for remotelink.APPLICATIONNAME
     *
     * @mbggenerated
     */
    public void setApplicationname(String applicationname) {
        this.applicationname = applicationname == null ? null : applicationname.trim();
    }
}