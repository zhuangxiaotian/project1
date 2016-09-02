package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class CwdDirectory extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.directory_name
     *
     * @mbggenerated
     */
    private String directoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.lower_directory_name
     *
     * @mbggenerated
     */
    private String lowerDirectoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.created_date
     *
     * @mbggenerated
     */
    private Date createdDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.updated_date
     *
     * @mbggenerated
     */
    private Date updatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.active
     *
     * @mbggenerated
     */
    private Integer active;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.impl_class
     *
     * @mbggenerated
     */
    private String implClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.lower_impl_class
     *
     * @mbggenerated
     */
    private String lowerImplClass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.directory_type
     *
     * @mbggenerated
     */
    private String directoryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_directory.directory_position
     *
     * @mbggenerated
     */
    private Long directoryPosition;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public CwdDirectory(Long id, String directoryName, String lowerDirectoryName, Date createdDate, Date updatedDate, Integer active, String description, String implClass, String lowerImplClass, String directoryType, Long directoryPosition) {
        this.id = id;
        this.directoryName = directoryName;
        this.lowerDirectoryName = lowerDirectoryName;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.active = active;
        this.description = description;
        this.implClass = implClass;
        this.lowerImplClass = lowerImplClass;
        this.directoryType = directoryType;
        this.directoryPosition = directoryPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public CwdDirectory() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.ID
     *
     * @return the value of cwd_directory.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.ID
     *
     * @param id the value for cwd_directory.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.directory_name
     *
     * @return the value of cwd_directory.directory_name
     *
     * @mbggenerated
     */
    public String getDirectoryName() {
        return directoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.directory_name
     *
     * @param directoryName the value for cwd_directory.directory_name
     *
     * @mbggenerated
     */
    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName == null ? null : directoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.lower_directory_name
     *
     * @return the value of cwd_directory.lower_directory_name
     *
     * @mbggenerated
     */
    public String getLowerDirectoryName() {
        return lowerDirectoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.lower_directory_name
     *
     * @param lowerDirectoryName the value for cwd_directory.lower_directory_name
     *
     * @mbggenerated
     */
    public void setLowerDirectoryName(String lowerDirectoryName) {
        this.lowerDirectoryName = lowerDirectoryName == null ? null : lowerDirectoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.created_date
     *
     * @return the value of cwd_directory.created_date
     *
     * @mbggenerated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.created_date
     *
     * @param createdDate the value for cwd_directory.created_date
     *
     * @mbggenerated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.updated_date
     *
     * @return the value of cwd_directory.updated_date
     *
     * @mbggenerated
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.updated_date
     *
     * @param updatedDate the value for cwd_directory.updated_date
     *
     * @mbggenerated
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.active
     *
     * @return the value of cwd_directory.active
     *
     * @mbggenerated
     */
    public Integer getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.active
     *
     * @param active the value for cwd_directory.active
     *
     * @mbggenerated
     */
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.description
     *
     * @return the value of cwd_directory.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.description
     *
     * @param description the value for cwd_directory.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.impl_class
     *
     * @return the value of cwd_directory.impl_class
     *
     * @mbggenerated
     */
    public String getImplClass() {
        return implClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.impl_class
     *
     * @param implClass the value for cwd_directory.impl_class
     *
     * @mbggenerated
     */
    public void setImplClass(String implClass) {
        this.implClass = implClass == null ? null : implClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.lower_impl_class
     *
     * @return the value of cwd_directory.lower_impl_class
     *
     * @mbggenerated
     */
    public String getLowerImplClass() {
        return lowerImplClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.lower_impl_class
     *
     * @param lowerImplClass the value for cwd_directory.lower_impl_class
     *
     * @mbggenerated
     */
    public void setLowerImplClass(String lowerImplClass) {
        this.lowerImplClass = lowerImplClass == null ? null : lowerImplClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.directory_type
     *
     * @return the value of cwd_directory.directory_type
     *
     * @mbggenerated
     */
    public String getDirectoryType() {
        return directoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.directory_type
     *
     * @param directoryType the value for cwd_directory.directory_type
     *
     * @mbggenerated
     */
    public void setDirectoryType(String directoryType) {
        this.directoryType = directoryType == null ? null : directoryType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_directory.directory_position
     *
     * @return the value of cwd_directory.directory_position
     *
     * @mbggenerated
     */
    public Long getDirectoryPosition() {
        return directoryPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_directory.directory_position
     *
     * @param directoryPosition the value for cwd_directory.directory_position
     *
     * @mbggenerated
     */
    public void setDirectoryPosition(Long directoryPosition) {
        this.directoryPosition = directoryPosition;
    }
}