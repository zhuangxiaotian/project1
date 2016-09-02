package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class ClientActivation extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.USER_ID
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CHANNEL
     *
     * @mbggenerated
     */
    private String channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_TYPE
     *
     * @mbggenerated
     */
    private String clientType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_VERSION
     *
     * @mbggenerated
     */
    private String clientVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.DEVICE_ID
     *
     * @mbggenerated
     */
    private String deviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.PUSH_ID
     *
     * @mbggenerated
     */
    private String pushId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.ACTIVATION_TIME
     *
     * @mbggenerated
     */
    private Date activationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_MODEL
     *
     * @mbggenerated
     */
    private String clientModel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_OS
     *
     * @mbggenerated
     */
    private String clientOs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_OS_VERSION
     *
     * @mbggenerated
     */
    private String clientOsVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_NETWORK_TYPE
     *
     * @mbggenerated
     */
    private String clientNetworkType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_NETWORK_EXTRA_INFO
     *
     * @mbggenerated
     */
    private String clientNetworkExtraInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_SCREEN_WIDTH
     *
     * @mbggenerated
     */
    private String clientScreenWidth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_SCREEN_HEIGHT
     *
     * @mbggenerated
     */
    private String clientScreenHeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.CLIENT_SCREEN_DENSITY
     *
     * @mbggenerated
     */
    private String clientScreenDensity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.STATE
     *
     * @mbggenerated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.PUB1
     *
     * @mbggenerated
     */
    private String pub1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.PUB2
     *
     * @mbggenerated
     */
    private String pub2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.PUB3
     *
     * @mbggenerated
     */
    private String pub3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.PUB4
     *
     * @mbggenerated
     */
    private String pub4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.PUB5
     *
     * @mbggenerated
     */
    private String pub5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_client_activation.ROW_VERSION
     *
     * @mbggenerated
     */
    private Integer rowVersion;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    public ClientActivation(String id, Integer userId, String channel, String clientType, String clientVersion, String deviceId, String pushId, Date activationTime, String clientModel, String clientOs, String clientOsVersion, String clientNetworkType, String clientNetworkExtraInfo, String clientScreenWidth, String clientScreenHeight, String clientScreenDensity, String state, String pub1, String pub2, String pub3, String pub4, String pub5, Integer rowVersion) {
        this.id = id;
        this.userId = userId;
        this.channel = channel;
        this.clientType = clientType;
        this.clientVersion = clientVersion;
        this.deviceId = deviceId;
        this.pushId = pushId;
        this.activationTime = activationTime;
        this.clientModel = clientModel;
        this.clientOs = clientOs;
        this.clientOsVersion = clientOsVersion;
        this.clientNetworkType = clientNetworkType;
        this.clientNetworkExtraInfo = clientNetworkExtraInfo;
        this.clientScreenWidth = clientScreenWidth;
        this.clientScreenHeight = clientScreenHeight;
        this.clientScreenDensity = clientScreenDensity;
        this.state = state;
        this.pub1 = pub1;
        this.pub2 = pub2;
        this.pub3 = pub3;
        this.pub4 = pub4;
        this.pub5 = pub5;
        this.rowVersion = rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    public ClientActivation() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.ID
     *
     * @return the value of t_client_activation.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.ID
     *
     * @param id the value for t_client_activation.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.USER_ID
     *
     * @return the value of t_client_activation.USER_ID
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.USER_ID
     *
     * @param userId the value for t_client_activation.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CHANNEL
     *
     * @return the value of t_client_activation.CHANNEL
     *
     * @mbggenerated
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CHANNEL
     *
     * @param channel the value for t_client_activation.CHANNEL
     *
     * @mbggenerated
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_TYPE
     *
     * @return the value of t_client_activation.CLIENT_TYPE
     *
     * @mbggenerated
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_TYPE
     *
     * @param clientType the value for t_client_activation.CLIENT_TYPE
     *
     * @mbggenerated
     */
    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_VERSION
     *
     * @return the value of t_client_activation.CLIENT_VERSION
     *
     * @mbggenerated
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_VERSION
     *
     * @param clientVersion the value for t_client_activation.CLIENT_VERSION
     *
     * @mbggenerated
     */
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion == null ? null : clientVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.DEVICE_ID
     *
     * @return the value of t_client_activation.DEVICE_ID
     *
     * @mbggenerated
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.DEVICE_ID
     *
     * @param deviceId the value for t_client_activation.DEVICE_ID
     *
     * @mbggenerated
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.PUSH_ID
     *
     * @return the value of t_client_activation.PUSH_ID
     *
     * @mbggenerated
     */
    public String getPushId() {
        return pushId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.PUSH_ID
     *
     * @param pushId the value for t_client_activation.PUSH_ID
     *
     * @mbggenerated
     */
    public void setPushId(String pushId) {
        this.pushId = pushId == null ? null : pushId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.ACTIVATION_TIME
     *
     * @return the value of t_client_activation.ACTIVATION_TIME
     *
     * @mbggenerated
     */
    public Date getActivationTime() {
        return activationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.ACTIVATION_TIME
     *
     * @param activationTime the value for t_client_activation.ACTIVATION_TIME
     *
     * @mbggenerated
     */
    public void setActivationTime(Date activationTime) {
        this.activationTime = activationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_MODEL
     *
     * @return the value of t_client_activation.CLIENT_MODEL
     *
     * @mbggenerated
     */
    public String getClientModel() {
        return clientModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_MODEL
     *
     * @param clientModel the value for t_client_activation.CLIENT_MODEL
     *
     * @mbggenerated
     */
    public void setClientModel(String clientModel) {
        this.clientModel = clientModel == null ? null : clientModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_OS
     *
     * @return the value of t_client_activation.CLIENT_OS
     *
     * @mbggenerated
     */
    public String getClientOs() {
        return clientOs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_OS
     *
     * @param clientOs the value for t_client_activation.CLIENT_OS
     *
     * @mbggenerated
     */
    public void setClientOs(String clientOs) {
        this.clientOs = clientOs == null ? null : clientOs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_OS_VERSION
     *
     * @return the value of t_client_activation.CLIENT_OS_VERSION
     *
     * @mbggenerated
     */
    public String getClientOsVersion() {
        return clientOsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_OS_VERSION
     *
     * @param clientOsVersion the value for t_client_activation.CLIENT_OS_VERSION
     *
     * @mbggenerated
     */
    public void setClientOsVersion(String clientOsVersion) {
        this.clientOsVersion = clientOsVersion == null ? null : clientOsVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_NETWORK_TYPE
     *
     * @return the value of t_client_activation.CLIENT_NETWORK_TYPE
     *
     * @mbggenerated
     */
    public String getClientNetworkType() {
        return clientNetworkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_NETWORK_TYPE
     *
     * @param clientNetworkType the value for t_client_activation.CLIENT_NETWORK_TYPE
     *
     * @mbggenerated
     */
    public void setClientNetworkType(String clientNetworkType) {
        this.clientNetworkType = clientNetworkType == null ? null : clientNetworkType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_NETWORK_EXTRA_INFO
     *
     * @return the value of t_client_activation.CLIENT_NETWORK_EXTRA_INFO
     *
     * @mbggenerated
     */
    public String getClientNetworkExtraInfo() {
        return clientNetworkExtraInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_NETWORK_EXTRA_INFO
     *
     * @param clientNetworkExtraInfo the value for t_client_activation.CLIENT_NETWORK_EXTRA_INFO
     *
     * @mbggenerated
     */
    public void setClientNetworkExtraInfo(String clientNetworkExtraInfo) {
        this.clientNetworkExtraInfo = clientNetworkExtraInfo == null ? null : clientNetworkExtraInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_SCREEN_WIDTH
     *
     * @return the value of t_client_activation.CLIENT_SCREEN_WIDTH
     *
     * @mbggenerated
     */
    public String getClientScreenWidth() {
        return clientScreenWidth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_SCREEN_WIDTH
     *
     * @param clientScreenWidth the value for t_client_activation.CLIENT_SCREEN_WIDTH
     *
     * @mbggenerated
     */
    public void setClientScreenWidth(String clientScreenWidth) {
        this.clientScreenWidth = clientScreenWidth == null ? null : clientScreenWidth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_SCREEN_HEIGHT
     *
     * @return the value of t_client_activation.CLIENT_SCREEN_HEIGHT
     *
     * @mbggenerated
     */
    public String getClientScreenHeight() {
        return clientScreenHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_SCREEN_HEIGHT
     *
     * @param clientScreenHeight the value for t_client_activation.CLIENT_SCREEN_HEIGHT
     *
     * @mbggenerated
     */
    public void setClientScreenHeight(String clientScreenHeight) {
        this.clientScreenHeight = clientScreenHeight == null ? null : clientScreenHeight.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.CLIENT_SCREEN_DENSITY
     *
     * @return the value of t_client_activation.CLIENT_SCREEN_DENSITY
     *
     * @mbggenerated
     */
    public String getClientScreenDensity() {
        return clientScreenDensity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.CLIENT_SCREEN_DENSITY
     *
     * @param clientScreenDensity the value for t_client_activation.CLIENT_SCREEN_DENSITY
     *
     * @mbggenerated
     */
    public void setClientScreenDensity(String clientScreenDensity) {
        this.clientScreenDensity = clientScreenDensity == null ? null : clientScreenDensity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.STATE
     *
     * @return the value of t_client_activation.STATE
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.STATE
     *
     * @param state the value for t_client_activation.STATE
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.PUB1
     *
     * @return the value of t_client_activation.PUB1
     *
     * @mbggenerated
     */
    public String getPub1() {
        return pub1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.PUB1
     *
     * @param pub1 the value for t_client_activation.PUB1
     *
     * @mbggenerated
     */
    public void setPub1(String pub1) {
        this.pub1 = pub1 == null ? null : pub1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.PUB2
     *
     * @return the value of t_client_activation.PUB2
     *
     * @mbggenerated
     */
    public String getPub2() {
        return pub2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.PUB2
     *
     * @param pub2 the value for t_client_activation.PUB2
     *
     * @mbggenerated
     */
    public void setPub2(String pub2) {
        this.pub2 = pub2 == null ? null : pub2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.PUB3
     *
     * @return the value of t_client_activation.PUB3
     *
     * @mbggenerated
     */
    public String getPub3() {
        return pub3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.PUB3
     *
     * @param pub3 the value for t_client_activation.PUB3
     *
     * @mbggenerated
     */
    public void setPub3(String pub3) {
        this.pub3 = pub3 == null ? null : pub3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.PUB4
     *
     * @return the value of t_client_activation.PUB4
     *
     * @mbggenerated
     */
    public String getPub4() {
        return pub4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.PUB4
     *
     * @param pub4 the value for t_client_activation.PUB4
     *
     * @mbggenerated
     */
    public void setPub4(String pub4) {
        this.pub4 = pub4 == null ? null : pub4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.PUB5
     *
     * @return the value of t_client_activation.PUB5
     *
     * @mbggenerated
     */
    public String getPub5() {
        return pub5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.PUB5
     *
     * @param pub5 the value for t_client_activation.PUB5
     *
     * @mbggenerated
     */
    public void setPub5(String pub5) {
        this.pub5 = pub5 == null ? null : pub5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_client_activation.ROW_VERSION
     *
     * @return the value of t_client_activation.ROW_VERSION
     *
     * @mbggenerated
     */
    public Integer getRowVersion() {
        return rowVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_client_activation.ROW_VERSION
     *
     * @param rowVersion the value for t_client_activation.ROW_VERSION
     *
     * @mbggenerated
     */
    public void setRowVersion(Integer rowVersion) {
        this.rowVersion = rowVersion;
    }
}