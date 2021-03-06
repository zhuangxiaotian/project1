package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Issuestatus extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuestatus.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuestatus.SEQUENCE
     *
     * @mbggenerated
     */
    private Long sequence;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuestatus.pname
     *
     * @mbggenerated
     */
    private String pname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuestatus.ICONURL
     *
     * @mbggenerated
     */
    private String iconurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuestatus.DESCRIPTION
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestatus
     *
     * @mbggenerated
     */
    public Issuestatus(String id, Long sequence, String pname, String iconurl, String description) {
        this.id = id;
        this.sequence = sequence;
        this.pname = pname;
        this.iconurl = iconurl;
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuestatus
     *
     * @mbggenerated
     */
    public Issuestatus() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuestatus.ID
     *
     * @return the value of issuestatus.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuestatus.ID
     *
     * @param id the value for issuestatus.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuestatus.SEQUENCE
     *
     * @return the value of issuestatus.SEQUENCE
     *
     * @mbggenerated
     */
    public Long getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuestatus.SEQUENCE
     *
     * @param sequence the value for issuestatus.SEQUENCE
     *
     * @mbggenerated
     */
    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuestatus.pname
     *
     * @return the value of issuestatus.pname
     *
     * @mbggenerated
     */
    public String getPname() {
        return pname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuestatus.pname
     *
     * @param pname the value for issuestatus.pname
     *
     * @mbggenerated
     */
    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuestatus.ICONURL
     *
     * @return the value of issuestatus.ICONURL
     *
     * @mbggenerated
     */
    public String getIconurl() {
        return iconurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuestatus.ICONURL
     *
     * @param iconurl the value for issuestatus.ICONURL
     *
     * @mbggenerated
     */
    public void setIconurl(String iconurl) {
        this.iconurl = iconurl == null ? null : iconurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuestatus.DESCRIPTION
     *
     * @return the value of issuestatus.DESCRIPTION
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuestatus.DESCRIPTION
     *
     * @param description the value for issuestatus.DESCRIPTION
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}