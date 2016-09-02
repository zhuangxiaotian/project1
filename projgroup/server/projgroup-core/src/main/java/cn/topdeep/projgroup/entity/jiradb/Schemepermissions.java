package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Schemepermissions extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schemepermissions.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schemepermissions.SCHEME
     *
     * @mbggenerated
     */
    private Long scheme;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schemepermissions.PERMISSION
     *
     * @mbggenerated
     */
    private Long permission;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schemepermissions.perm_type
     *
     * @mbggenerated
     */
    private String permType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schemepermissions.perm_parameter
     *
     * @mbggenerated
     */
    private String permParameter;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemepermissions
     *
     * @mbggenerated
     */
    public Schemepermissions(Long id, Long scheme, Long permission, String permType, String permParameter) {
        this.id = id;
        this.scheme = scheme;
        this.permission = permission;
        this.permType = permType;
        this.permParameter = permParameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemepermissions
     *
     * @mbggenerated
     */
    public Schemepermissions() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schemepermissions.ID
     *
     * @return the value of schemepermissions.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schemepermissions.ID
     *
     * @param id the value for schemepermissions.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schemepermissions.SCHEME
     *
     * @return the value of schemepermissions.SCHEME
     *
     * @mbggenerated
     */
    public Long getScheme() {
        return scheme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schemepermissions.SCHEME
     *
     * @param scheme the value for schemepermissions.SCHEME
     *
     * @mbggenerated
     */
    public void setScheme(Long scheme) {
        this.scheme = scheme;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schemepermissions.PERMISSION
     *
     * @return the value of schemepermissions.PERMISSION
     *
     * @mbggenerated
     */
    public Long getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schemepermissions.PERMISSION
     *
     * @param permission the value for schemepermissions.PERMISSION
     *
     * @mbggenerated
     */
    public void setPermission(Long permission) {
        this.permission = permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schemepermissions.perm_type
     *
     * @return the value of schemepermissions.perm_type
     *
     * @mbggenerated
     */
    public String getPermType() {
        return permType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schemepermissions.perm_type
     *
     * @param permType the value for schemepermissions.perm_type
     *
     * @mbggenerated
     */
    public void setPermType(String permType) {
        this.permType = permType == null ? null : permType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schemepermissions.perm_parameter
     *
     * @return the value of schemepermissions.perm_parameter
     *
     * @mbggenerated
     */
    public String getPermParameter() {
        return permParameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schemepermissions.perm_parameter
     *
     * @param permParameter the value for schemepermissions.perm_parameter
     *
     * @mbggenerated
     */
    public void setPermParameter(String permParameter) {
        this.permParameter = permParameter == null ? null : permParameter.trim();
    }
}