package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class SequenceValueItem extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence_value_item.SEQ_NAME
     *
     * @mbggenerated
     */
    private String seqName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence_value_item.SEQ_ID
     *
     * @mbggenerated
     */
    private Long seqId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_value_item
     *
     * @mbggenerated
     */
    public SequenceValueItem(String seqName, Long seqId) {
        this.seqName = seqName;
        this.seqId = seqId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_value_item
     *
     * @mbggenerated
     */
    public SequenceValueItem() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sequence_value_item.SEQ_NAME
     *
     * @return the value of sequence_value_item.SEQ_NAME
     *
     * @mbggenerated
     */
    public String getSeqName() {
        return seqName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sequence_value_item.SEQ_NAME
     *
     * @param seqName the value for sequence_value_item.SEQ_NAME
     *
     * @mbggenerated
     */
    public void setSeqName(String seqName) {
        this.seqName = seqName == null ? null : seqName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sequence_value_item.SEQ_ID
     *
     * @return the value of sequence_value_item.SEQ_ID
     *
     * @mbggenerated
     */
    public Long getSeqId() {
        return seqId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sequence_value_item.SEQ_ID
     *
     * @param seqId the value for sequence_value_item.SEQ_ID
     *
     * @mbggenerated
     */
    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }
}