package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Issuelinktype extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelinktype.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelinktype.LINKNAME
     *
     * @mbggenerated
     */
    private String linkname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelinktype.INWARD
     *
     * @mbggenerated
     */
    private String inward;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelinktype.OUTWARD
     *
     * @mbggenerated
     */
    private String outward;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelinktype.pstyle
     *
     * @mbggenerated
     */
    private String pstyle;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuelinktype
     *
     * @mbggenerated
     */
    public Issuelinktype(Long id, String linkname, String inward, String outward, String pstyle) {
        this.id = id;
        this.linkname = linkname;
        this.inward = inward;
        this.outward = outward;
        this.pstyle = pstyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuelinktype
     *
     * @mbggenerated
     */
    public Issuelinktype() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelinktype.ID
     *
     * @return the value of issuelinktype.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelinktype.ID
     *
     * @param id the value for issuelinktype.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelinktype.LINKNAME
     *
     * @return the value of issuelinktype.LINKNAME
     *
     * @mbggenerated
     */
    public String getLinkname() {
        return linkname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelinktype.LINKNAME
     *
     * @param linkname the value for issuelinktype.LINKNAME
     *
     * @mbggenerated
     */
    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelinktype.INWARD
     *
     * @return the value of issuelinktype.INWARD
     *
     * @mbggenerated
     */
    public String getInward() {
        return inward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelinktype.INWARD
     *
     * @param inward the value for issuelinktype.INWARD
     *
     * @mbggenerated
     */
    public void setInward(String inward) {
        this.inward = inward == null ? null : inward.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelinktype.OUTWARD
     *
     * @return the value of issuelinktype.OUTWARD
     *
     * @mbggenerated
     */
    public String getOutward() {
        return outward;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelinktype.OUTWARD
     *
     * @param outward the value for issuelinktype.OUTWARD
     *
     * @mbggenerated
     */
    public void setOutward(String outward) {
        this.outward = outward == null ? null : outward.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelinktype.pstyle
     *
     * @return the value of issuelinktype.pstyle
     *
     * @mbggenerated
     */
    public String getPstyle() {
        return pstyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelinktype.pstyle
     *
     * @param pstyle the value for issuelinktype.pstyle
     *
     * @mbggenerated
     */
    public void setPstyle(String pstyle) {
        this.pstyle = pstyle == null ? null : pstyle.trim();
    }
}