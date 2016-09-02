package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class User extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_ID
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.LAST_LOGIN_ADDRESS
     *
     * @mbggenerated
     */
    private String lastLoginAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.LAST_LOGIN_TIME
     *
     * @mbggenerated
     */
    private Date lastLoginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.LOGIN_COUNT
     *
     * @mbggenerated
     */
    private Integer loginCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.LOGIN_NAME
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.LOGIN_PASS
     *
     * @mbggenerated
     */
    private String loginPass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.REAL_NAME
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_EMAIL
     *
     * @mbggenerated
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_MEMO
     *
     * @mbggenerated
     */
    private String userMemo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_MOBILE
     *
     * @mbggenerated
     */
    private String userMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_MSN
     *
     * @mbggenerated
     */
    private String userMsn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_PRIVILEGES
     *
     * @mbggenerated
     */
    private String userPrivileges;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_QQ
     *
     * @mbggenerated
     */
    private String userQq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_ROLES
     *
     * @mbggenerated
     */
    private String userRoles;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_STATE
     *
     * @mbggenerated
     */
    private Integer userState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.USER_TELEPHONE
     *
     * @mbggenerated
     */
    private String userTelephone;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated
     */
    public User(Integer userId, String lastLoginAddress, Date lastLoginTime, Integer loginCount, String loginName, String loginPass, String realName, String userEmail, String userMemo, String userMobile, String userMsn, String userPrivileges, String userQq, String userRoles, Integer userState, String userTelephone) {
        this.userId = userId;
        this.lastLoginAddress = lastLoginAddress;
        this.lastLoginTime = lastLoginTime;
        this.loginCount = loginCount;
        this.loginName = loginName;
        this.loginPass = loginPass;
        this.realName = realName;
        this.userEmail = userEmail;
        this.userMemo = userMemo;
        this.userMobile = userMobile;
        this.userMsn = userMsn;
        this.userPrivileges = userPrivileges;
        this.userQq = userQq;
        this.userRoles = userRoles;
        this.userState = userState;
        this.userTelephone = userTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_ID
     *
     * @return the value of t_user.USER_ID
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_ID
     *
     * @param userId the value for t_user.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.LAST_LOGIN_ADDRESS
     *
     * @return the value of t_user.LAST_LOGIN_ADDRESS
     *
     * @mbggenerated
     */
    public String getLastLoginAddress() {
        return lastLoginAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.LAST_LOGIN_ADDRESS
     *
     * @param lastLoginAddress the value for t_user.LAST_LOGIN_ADDRESS
     *
     * @mbggenerated
     */
    public void setLastLoginAddress(String lastLoginAddress) {
        this.lastLoginAddress = lastLoginAddress == null ? null : lastLoginAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.LAST_LOGIN_TIME
     *
     * @return the value of t_user.LAST_LOGIN_TIME
     *
     * @mbggenerated
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.LAST_LOGIN_TIME
     *
     * @param lastLoginTime the value for t_user.LAST_LOGIN_TIME
     *
     * @mbggenerated
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.LOGIN_COUNT
     *
     * @return the value of t_user.LOGIN_COUNT
     *
     * @mbggenerated
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.LOGIN_COUNT
     *
     * @param loginCount the value for t_user.LOGIN_COUNT
     *
     * @mbggenerated
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.LOGIN_NAME
     *
     * @return the value of t_user.LOGIN_NAME
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.LOGIN_NAME
     *
     * @param loginName the value for t_user.LOGIN_NAME
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.LOGIN_PASS
     *
     * @return the value of t_user.LOGIN_PASS
     *
     * @mbggenerated
     */
    public String getLoginPass() {
        return loginPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.LOGIN_PASS
     *
     * @param loginPass the value for t_user.LOGIN_PASS
     *
     * @mbggenerated
     */
    public void setLoginPass(String loginPass) {
        this.loginPass = loginPass == null ? null : loginPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.REAL_NAME
     *
     * @return the value of t_user.REAL_NAME
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.REAL_NAME
     *
     * @param realName the value for t_user.REAL_NAME
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_EMAIL
     *
     * @return the value of t_user.USER_EMAIL
     *
     * @mbggenerated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_EMAIL
     *
     * @param userEmail the value for t_user.USER_EMAIL
     *
     * @mbggenerated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_MEMO
     *
     * @return the value of t_user.USER_MEMO
     *
     * @mbggenerated
     */
    public String getUserMemo() {
        return userMemo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_MEMO
     *
     * @param userMemo the value for t_user.USER_MEMO
     *
     * @mbggenerated
     */
    public void setUserMemo(String userMemo) {
        this.userMemo = userMemo == null ? null : userMemo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_MOBILE
     *
     * @return the value of t_user.USER_MOBILE
     *
     * @mbggenerated
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_MOBILE
     *
     * @param userMobile the value for t_user.USER_MOBILE
     *
     * @mbggenerated
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_MSN
     *
     * @return the value of t_user.USER_MSN
     *
     * @mbggenerated
     */
    public String getUserMsn() {
        return userMsn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_MSN
     *
     * @param userMsn the value for t_user.USER_MSN
     *
     * @mbggenerated
     */
    public void setUserMsn(String userMsn) {
        this.userMsn = userMsn == null ? null : userMsn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_PRIVILEGES
     *
     * @return the value of t_user.USER_PRIVILEGES
     *
     * @mbggenerated
     */
    public String getUserPrivileges() {
        return userPrivileges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_PRIVILEGES
     *
     * @param userPrivileges the value for t_user.USER_PRIVILEGES
     *
     * @mbggenerated
     */
    public void setUserPrivileges(String userPrivileges) {
        this.userPrivileges = userPrivileges == null ? null : userPrivileges.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_QQ
     *
     * @return the value of t_user.USER_QQ
     *
     * @mbggenerated
     */
    public String getUserQq() {
        return userQq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_QQ
     *
     * @param userQq the value for t_user.USER_QQ
     *
     * @mbggenerated
     */
    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_ROLES
     *
     * @return the value of t_user.USER_ROLES
     *
     * @mbggenerated
     */
    public String getUserRoles() {
        return userRoles;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_ROLES
     *
     * @param userRoles the value for t_user.USER_ROLES
     *
     * @mbggenerated
     */
    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles == null ? null : userRoles.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_STATE
     *
     * @return the value of t_user.USER_STATE
     *
     * @mbggenerated
     */
    public Integer getUserState() {
        return userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_STATE
     *
     * @param userState the value for t_user.USER_STATE
     *
     * @mbggenerated
     */
    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.USER_TELEPHONE
     *
     * @return the value of t_user.USER_TELEPHONE
     *
     * @mbggenerated
     */
    public String getUserTelephone() {
        return userTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.USER_TELEPHONE
     *
     * @param userTelephone the value for t_user.USER_TELEPHONE
     *
     * @mbggenerated
     */
    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone == null ? null : userTelephone.trim();
    }
}