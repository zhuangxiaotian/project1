package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Issuelink extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelink.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelink.LINKTYPE
     *
     * @mbggenerated
     */
    private Long linktype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelink.SOURCE
     *
     * @mbggenerated
     */
    private Long source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelink.DESTINATION
     *
     * @mbggenerated
     */
    private Long destination;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column issuelink.SEQUENCE
     *
     * @mbggenerated
     */
    private Long sequence;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuelink
     *
     * @mbggenerated
     */
    public Issuelink(Long id, Long linktype, Long source, Long destination, Long sequence) {
        this.id = id;
        this.linktype = linktype;
        this.source = source;
        this.destination = destination;
        this.sequence = sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issuelink
     *
     * @mbggenerated
     */
    public Issuelink() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelink.ID
     *
     * @return the value of issuelink.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelink.ID
     *
     * @param id the value for issuelink.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelink.LINKTYPE
     *
     * @return the value of issuelink.LINKTYPE
     *
     * @mbggenerated
     */
    public Long getLinktype() {
        return linktype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelink.LINKTYPE
     *
     * @param linktype the value for issuelink.LINKTYPE
     *
     * @mbggenerated
     */
    public void setLinktype(Long linktype) {
        this.linktype = linktype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelink.SOURCE
     *
     * @return the value of issuelink.SOURCE
     *
     * @mbggenerated
     */
    public Long getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelink.SOURCE
     *
     * @param source the value for issuelink.SOURCE
     *
     * @mbggenerated
     */
    public void setSource(Long source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelink.DESTINATION
     *
     * @return the value of issuelink.DESTINATION
     *
     * @mbggenerated
     */
    public Long getDestination() {
        return destination;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelink.DESTINATION
     *
     * @param destination the value for issuelink.DESTINATION
     *
     * @mbggenerated
     */
    public void setDestination(Long destination) {
        this.destination = destination;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column issuelink.SEQUENCE
     *
     * @return the value of issuelink.SEQUENCE
     *
     * @mbggenerated
     */
    public Long getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column issuelink.SEQUENCE
     *
     * @param sequence the value for issuelink.SEQUENCE
     *
     * @mbggenerated
     */
    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
}