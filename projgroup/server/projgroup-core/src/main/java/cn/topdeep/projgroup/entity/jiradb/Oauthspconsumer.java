package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class Oauthspconsumer extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauthspconsumer.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauthspconsumer.CREATED
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauthspconsumer.CONSUMER_KEY
     *
     * @mbggenerated
     */
    private String consumerKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oauthspconsumer.consumername
     *
     * @mbggenerated
     */
    private String consumername;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public Oauthspconsumer(Long id, Date created, String consumerKey, String consumername) {
        this.id = id;
        this.created = created;
        this.consumerKey = consumerKey;
        this.consumername = consumername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public Oauthspconsumer() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauthspconsumer.ID
     *
     * @return the value of oauthspconsumer.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauthspconsumer.ID
     *
     * @param id the value for oauthspconsumer.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauthspconsumer.CREATED
     *
     * @return the value of oauthspconsumer.CREATED
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauthspconsumer.CREATED
     *
     * @param created the value for oauthspconsumer.CREATED
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauthspconsumer.CONSUMER_KEY
     *
     * @return the value of oauthspconsumer.CONSUMER_KEY
     *
     * @mbggenerated
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauthspconsumer.CONSUMER_KEY
     *
     * @param consumerKey the value for oauthspconsumer.CONSUMER_KEY
     *
     * @mbggenerated
     */
    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey == null ? null : consumerKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oauthspconsumer.consumername
     *
     * @return the value of oauthspconsumer.consumername
     *
     * @mbggenerated
     */
    public String getConsumername() {
        return consumername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oauthspconsumer.consumername
     *
     * @param consumername the value for oauthspconsumer.consumername
     *
     * @mbggenerated
     */
    public void setConsumername(String consumername) {
        this.consumername = consumername == null ? null : consumername.trim();
    }
}