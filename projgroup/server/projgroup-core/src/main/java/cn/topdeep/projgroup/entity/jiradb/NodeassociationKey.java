package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class NodeassociationKey extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodeassociation.SOURCE_NODE_ID
     *
     * @mbggenerated
     */
    private Long sourceNodeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodeassociation.SOURCE_NODE_ENTITY
     *
     * @mbggenerated
     */
    private String sourceNodeEntity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodeassociation.SINK_NODE_ID
     *
     * @mbggenerated
     */
    private Long sinkNodeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodeassociation.SINK_NODE_ENTITY
     *
     * @mbggenerated
     */
    private String sinkNodeEntity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column nodeassociation.ASSOCIATION_TYPE
     *
     * @mbggenerated
     */
    private String associationType;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    public NodeassociationKey(Long sourceNodeId, String sourceNodeEntity, Long sinkNodeId, String sinkNodeEntity, String associationType) {
        this.sourceNodeId = sourceNodeId;
        this.sourceNodeEntity = sourceNodeEntity;
        this.sinkNodeId = sinkNodeId;
        this.sinkNodeEntity = sinkNodeEntity;
        this.associationType = associationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    public NodeassociationKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodeassociation.SOURCE_NODE_ID
     *
     * @return the value of nodeassociation.SOURCE_NODE_ID
     *
     * @mbggenerated
     */
    public Long getSourceNodeId() {
        return sourceNodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodeassociation.SOURCE_NODE_ID
     *
     * @param sourceNodeId the value for nodeassociation.SOURCE_NODE_ID
     *
     * @mbggenerated
     */
    public void setSourceNodeId(Long sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodeassociation.SOURCE_NODE_ENTITY
     *
     * @return the value of nodeassociation.SOURCE_NODE_ENTITY
     *
     * @mbggenerated
     */
    public String getSourceNodeEntity() {
        return sourceNodeEntity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodeassociation.SOURCE_NODE_ENTITY
     *
     * @param sourceNodeEntity the value for nodeassociation.SOURCE_NODE_ENTITY
     *
     * @mbggenerated
     */
    public void setSourceNodeEntity(String sourceNodeEntity) {
        this.sourceNodeEntity = sourceNodeEntity == null ? null : sourceNodeEntity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodeassociation.SINK_NODE_ID
     *
     * @return the value of nodeassociation.SINK_NODE_ID
     *
     * @mbggenerated
     */
    public Long getSinkNodeId() {
        return sinkNodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodeassociation.SINK_NODE_ID
     *
     * @param sinkNodeId the value for nodeassociation.SINK_NODE_ID
     *
     * @mbggenerated
     */
    public void setSinkNodeId(Long sinkNodeId) {
        this.sinkNodeId = sinkNodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodeassociation.SINK_NODE_ENTITY
     *
     * @return the value of nodeassociation.SINK_NODE_ENTITY
     *
     * @mbggenerated
     */
    public String getSinkNodeEntity() {
        return sinkNodeEntity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodeassociation.SINK_NODE_ENTITY
     *
     * @param sinkNodeEntity the value for nodeassociation.SINK_NODE_ENTITY
     *
     * @mbggenerated
     */
    public void setSinkNodeEntity(String sinkNodeEntity) {
        this.sinkNodeEntity = sinkNodeEntity == null ? null : sinkNodeEntity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nodeassociation.ASSOCIATION_TYPE
     *
     * @return the value of nodeassociation.ASSOCIATION_TYPE
     *
     * @mbggenerated
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nodeassociation.ASSOCIATION_TYPE
     *
     * @param associationType the value for nodeassociation.ASSOCIATION_TYPE
     *
     * @mbggenerated
     */
    public void setAssociationType(String associationType) {
        this.associationType = associationType == null ? null : associationType.trim();
    }
}