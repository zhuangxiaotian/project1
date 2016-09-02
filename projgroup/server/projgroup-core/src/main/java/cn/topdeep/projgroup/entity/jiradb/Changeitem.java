package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Changeitem extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column changeitem.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column changeitem.groupid
     *
     * @mbggenerated
     */
    private Long groupid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column changeitem.FIELDTYPE
     *
     * @mbggenerated
     */
    private String fieldtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column changeitem.FIELD
     *
     * @mbggenerated
     */
    private String field;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    public Changeitem(Long id, Long groupid, String fieldtype, String field) {
        this.id = id;
        this.groupid = groupid;
        this.fieldtype = fieldtype;
        this.field = field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    public Changeitem() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column changeitem.ID
     *
     * @return the value of changeitem.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column changeitem.ID
     *
     * @param id the value for changeitem.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column changeitem.groupid
     *
     * @return the value of changeitem.groupid
     *
     * @mbggenerated
     */
    public Long getGroupid() {
        return groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column changeitem.groupid
     *
     * @param groupid the value for changeitem.groupid
     *
     * @mbggenerated
     */
    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column changeitem.FIELDTYPE
     *
     * @return the value of changeitem.FIELDTYPE
     *
     * @mbggenerated
     */
    public String getFieldtype() {
        return fieldtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column changeitem.FIELDTYPE
     *
     * @param fieldtype the value for changeitem.FIELDTYPE
     *
     * @mbggenerated
     */
    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype == null ? null : fieldtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column changeitem.FIELD
     *
     * @return the value of changeitem.FIELD
     *
     * @mbggenerated
     */
    public String getField() {
        return field;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column changeitem.FIELD
     *
     * @param field the value for changeitem.FIELD
     *
     * @mbggenerated
     */
    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }
}