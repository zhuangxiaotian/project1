package cn.topdeep.projgroup.entity.jiradb;

import java.util.Date;

public class OauthconsumerWithBLOBs extends Oauthconsumer {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column oauthconsumer.PUBLIC_KEY
	 *
	 * @mbggenerated
	 */
	private String publicKey;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column oauthconsumer.PRIVATE_KEY
	 *
	 * @mbggenerated
	 */
	private String privateKey;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column oauthconsumer.DESCRIPTION
	 *
	 * @mbggenerated
	 */
	private String description;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column oauthconsumer.CALLBACK
	 *
	 * @mbggenerated
	 */
	private String callback;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column oauthconsumer.SHARED_SECRET
	 *
	 * @mbggenerated
	 */
	private String sharedSecret;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table oauthconsumer
	 *
	 * @mbggenerated
	 */
	public OauthconsumerWithBLOBs(Long id, Date created, String consumername, String consumerKey, String consumerservice, String signatureMethod,
			String publicKey, String privateKey, String description, String callback, String sharedSecret) {
		super(id, created, consumername, consumerKey, consumerservice, signatureMethod);
		this.publicKey = publicKey;
		this.privateKey = privateKey;
		this.description = description;
		this.callback = callback;
		this.sharedSecret = sharedSecret;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table oauthconsumer
	 *
	 * @mbggenerated
	 */
	public OauthconsumerWithBLOBs() {
		super();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column oauthconsumer.PUBLIC_KEY
	 *
	 * @return the value of oauthconsumer.PUBLIC_KEY
	 *
	 * @mbggenerated
	 */
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column oauthconsumer.PUBLIC_KEY
	 *
	 * @param publicKey the value for oauthconsumer.PUBLIC_KEY
	 *
	 * @mbggenerated
	 */
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey == null ? null : publicKey.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column oauthconsumer.PRIVATE_KEY
	 *
	 * @return the value of oauthconsumer.PRIVATE_KEY
	 *
	 * @mbggenerated
	 */
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column oauthconsumer.PRIVATE_KEY
	 *
	 * @param privateKey the value for oauthconsumer.PRIVATE_KEY
	 *
	 * @mbggenerated
	 */
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey == null ? null : privateKey.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column oauthconsumer.DESCRIPTION
	 *
	 * @return the value of oauthconsumer.DESCRIPTION
	 *
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column oauthconsumer.DESCRIPTION
	 *
	 * @param description the value for oauthconsumer.DESCRIPTION
	 *
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column oauthconsumer.CALLBACK
	 *
	 * @return the value of oauthconsumer.CALLBACK
	 *
	 * @mbggenerated
	 */
	public String getCallback() {
		return callback;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column oauthconsumer.CALLBACK
	 *
	 * @param callback the value for oauthconsumer.CALLBACK
	 *
	 * @mbggenerated
	 */
	public void setCallback(String callback) {
		this.callback = callback == null ? null : callback.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column oauthconsumer.SHARED_SECRET
	 *
	 * @return the value of oauthconsumer.SHARED_SECRET
	 *
	 * @mbggenerated
	 */
	public String getSharedSecret() {
		return sharedSecret;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column oauthconsumer.SHARED_SECRET
	 *
	 * @param sharedSecret the value for oauthconsumer.SHARED_SECRET
	 *
	 * @mbggenerated
	 */
	public void setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret == null ? null : sharedSecret.trim();
	}
}