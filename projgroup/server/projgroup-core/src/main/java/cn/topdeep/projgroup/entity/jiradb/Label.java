package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Label extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label.FIELDID
     *
     * @mbggenerated
     */
    private Long fieldid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label.ISSUE
     *
     * @mbggenerated
     */
    private Long issue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column label.LABEL
     *
     * @mbggenerated
     */
    private String label;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label
     *
     * @mbggenerated
     */
    public Label(Long id, Long fieldid, Long issue, String label) {
        this.id = id;
        this.fieldid = fieldid;
        this.issue = issue;
        this.label = label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table label
     *
     * @mbggenerated
     */
    public Label() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label.ID
     *
     * @return the value of label.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label.ID
     *
     * @param id the value for label.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label.FIELDID
     *
     * @return the value of label.FIELDID
     *
     * @mbggenerated
     */
    public Long getFieldid() {
        return fieldid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label.FIELDID
     *
     * @param fieldid the value for label.FIELDID
     *
     * @mbggenerated
     */
    public void setFieldid(Long fieldid) {
        this.fieldid = fieldid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label.ISSUE
     *
     * @return the value of label.ISSUE
     *
     * @mbggenerated
     */
    public Long getIssue() {
        return issue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label.ISSUE
     *
     * @param issue the value for label.ISSUE
     *
     * @mbggenerated
     */
    public void setIssue(Long issue) {
        this.issue = issue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column label.LABEL
     *
     * @return the value of label.LABEL
     *
     * @mbggenerated
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column label.LABEL
     *
     * @param label the value for label.LABEL
     *
     * @mbggenerated
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }
}