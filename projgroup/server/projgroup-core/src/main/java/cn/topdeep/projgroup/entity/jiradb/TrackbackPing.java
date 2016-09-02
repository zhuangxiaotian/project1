package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class TrackbackPing extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trackback_ping.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trackback_ping.ISSUE
     *
     * @mbggenerated
     */
    private Long issue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trackback_ping.URL
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trackback_ping.TITLE
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trackback_ping.BLOGNAME
     *
     * @mbggenerated
     */
    private String blogname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trackback_ping.EXCERPT
     *
     * @mbggenerated
     */
    private String excerpt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trackback_ping.CREATED
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackback_ping
     *
     * @mbggenerated
     */
    public TrackbackPing(Long id, Long issue, String url, String title, String blogname, String excerpt, Date created) {
        this.id = id;
        this.issue = issue;
        this.url = url;
        this.title = title;
        this.blogname = blogname;
        this.excerpt = excerpt;
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trackback_ping
     *
     * @mbggenerated
     */
    public TrackbackPing() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trackback_ping.ID
     *
     * @return the value of trackback_ping.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trackback_ping.ID
     *
     * @param id the value for trackback_ping.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trackback_ping.ISSUE
     *
     * @return the value of trackback_ping.ISSUE
     *
     * @mbggenerated
     */
    public Long getIssue() {
        return issue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trackback_ping.ISSUE
     *
     * @param issue the value for trackback_ping.ISSUE
     *
     * @mbggenerated
     */
    public void setIssue(Long issue) {
        this.issue = issue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trackback_ping.URL
     *
     * @return the value of trackback_ping.URL
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trackback_ping.URL
     *
     * @param url the value for trackback_ping.URL
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trackback_ping.TITLE
     *
     * @return the value of trackback_ping.TITLE
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trackback_ping.TITLE
     *
     * @param title the value for trackback_ping.TITLE
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trackback_ping.BLOGNAME
     *
     * @return the value of trackback_ping.BLOGNAME
     *
     * @mbggenerated
     */
    public String getBlogname() {
        return blogname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trackback_ping.BLOGNAME
     *
     * @param blogname the value for trackback_ping.BLOGNAME
     *
     * @mbggenerated
     */
    public void setBlogname(String blogname) {
        this.blogname = blogname == null ? null : blogname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trackback_ping.EXCERPT
     *
     * @return the value of trackback_ping.EXCERPT
     *
     * @mbggenerated
     */
    public String getExcerpt() {
        return excerpt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trackback_ping.EXCERPT
     *
     * @param excerpt the value for trackback_ping.EXCERPT
     *
     * @mbggenerated
     */
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt == null ? null : excerpt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trackback_ping.CREATED
     *
     * @return the value of trackback_ping.CREATED
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trackback_ping.CREATED
     *
     * @param created the value for trackback_ping.CREATED
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}