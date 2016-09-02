package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Propertyentry extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertyentry.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertyentry.ENTITY_NAME
     *
     * @mbggenerated
     */
    private String entityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertyentry.ENTITY_ID
     *
     * @mbggenerated
     */
    private Long entityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertyentry.PROPERTY_KEY
     *
     * @mbggenerated
     */
    private String propertyKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column propertyentry.propertytype
     *
     * @mbggenerated
     */
    private Integer propertytype;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertyentry
     *
     * @mbggenerated
     */
    public Propertyentry(Long id, String entityName, Long entityId, String propertyKey, Integer propertytype) {
        this.id = id;
        this.entityName = entityName;
        this.entityId = entityId;
        this.propertyKey = propertyKey;
        this.propertytype = propertytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertyentry
     *
     * @mbggenerated
     */
    public Propertyentry() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertyentry.ID
     *
     * @return the value of propertyentry.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertyentry.ID
     *
     * @param id the value for propertyentry.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertyentry.ENTITY_NAME
     *
     * @return the value of propertyentry.ENTITY_NAME
     *
     * @mbggenerated
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertyentry.ENTITY_NAME
     *
     * @param entityName the value for propertyentry.ENTITY_NAME
     *
     * @mbggenerated
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName == null ? null : entityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertyentry.ENTITY_ID
     *
     * @return the value of propertyentry.ENTITY_ID
     *
     * @mbggenerated
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertyentry.ENTITY_ID
     *
     * @param entityId the value for propertyentry.ENTITY_ID
     *
     * @mbggenerated
     */
    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertyentry.PROPERTY_KEY
     *
     * @return the value of propertyentry.PROPERTY_KEY
     *
     * @mbggenerated
     */
    public String getPropertyKey() {
        return propertyKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertyentry.PROPERTY_KEY
     *
     * @param propertyKey the value for propertyentry.PROPERTY_KEY
     *
     * @mbggenerated
     */
    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey == null ? null : propertyKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column propertyentry.propertytype
     *
     * @return the value of propertyentry.propertytype
     *
     * @mbggenerated
     */
    public Integer getPropertytype() {
        return propertytype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column propertyentry.propertytype
     *
     * @param propertytype the value for propertyentry.propertytype
     *
     * @mbggenerated
     */
    public void setPropertytype(Integer propertytype) {
        this.propertytype = propertytype;
    }
}