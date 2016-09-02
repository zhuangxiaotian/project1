package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;
import java.util.Date;

public class CwdGroup extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.group_name
     *
     * @mbggenerated
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.lower_group_name
     *
     * @mbggenerated
     */
    private String lowerGroupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.active
     *
     * @mbggenerated
     */
    private Integer active;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.local
     *
     * @mbggenerated
     */
    private Integer local;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.created_date
     *
     * @mbggenerated
     */
    private Date createdDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.updated_date
     *
     * @mbggenerated
     */
    private Date updatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.lower_description
     *
     * @mbggenerated
     */
    private String lowerDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.group_type
     *
     * @mbggenerated
     */
    private String groupType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_group.directory_id
     *
     * @mbggenerated
     */
    private Long directoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_group
     *
     * @mbggenerated
     */
    public CwdGroup(Long id, String groupName, String lowerGroupName, Integer active, Integer local, Date createdDate, Date updatedDate, String description, String lowerDescription, String groupType, Long directoryId) {
        this.id = id;
        this.groupName = groupName;
        this.lowerGroupName = lowerGroupName;
        this.active = active;
        this.local = local;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.description = description;
        this.lowerDescription = lowerDescription;
        this.groupType = groupType;
        this.directoryId = directoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_group
     *
     * @mbggenerated
     */
    public CwdGroup() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.ID
     *
     * @return the value of cwd_group.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.ID
     *
     * @param id the value for cwd_group.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.group_name
     *
     * @return the value of cwd_group.group_name
     *
     * @mbggenerated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.group_name
     *
     * @param groupName the value for cwd_group.group_name
     *
     * @mbggenerated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.lower_group_name
     *
     * @return the value of cwd_group.lower_group_name
     *
     * @mbggenerated
     */
    public String getLowerGroupName() {
        return lowerGroupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.lower_group_name
     *
     * @param lowerGroupName the value for cwd_group.lower_group_name
     *
     * @mbggenerated
     */
    public void setLowerGroupName(String lowerGroupName) {
        this.lowerGroupName = lowerGroupName == null ? null : lowerGroupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.active
     *
     * @return the value of cwd_group.active
     *
     * @mbggenerated
     */
    public Integer getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.active
     *
     * @param active the value for cwd_group.active
     *
     * @mbggenerated
     */
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.local
     *
     * @return the value of cwd_group.local
     *
     * @mbggenerated
     */
    public Integer getLocal() {
        return local;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.local
     *
     * @param local the value for cwd_group.local
     *
     * @mbggenerated
     */
    public void setLocal(Integer local) {
        this.local = local;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.created_date
     *
     * @return the value of cwd_group.created_date
     *
     * @mbggenerated
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.created_date
     *
     * @param createdDate the value for cwd_group.created_date
     *
     * @mbggenerated
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.updated_date
     *
     * @return the value of cwd_group.updated_date
     *
     * @mbggenerated
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.updated_date
     *
     * @param updatedDate the value for cwd_group.updated_date
     *
     * @mbggenerated
     */
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.description
     *
     * @return the value of cwd_group.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.description
     *
     * @param description the value for cwd_group.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.lower_description
     *
     * @return the value of cwd_group.lower_description
     *
     * @mbggenerated
     */
    public String getLowerDescription() {
        return lowerDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.lower_description
     *
     * @param lowerDescription the value for cwd_group.lower_description
     *
     * @mbggenerated
     */
    public void setLowerDescription(String lowerDescription) {
        this.lowerDescription = lowerDescription == null ? null : lowerDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.group_type
     *
     * @return the value of cwd_group.group_type
     *
     * @mbggenerated
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.group_type
     *
     * @param groupType the value for cwd_group.group_type
     *
     * @mbggenerated
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType == null ? null : groupType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_group.directory_id
     *
     * @return the value of cwd_group.directory_id
     *
     * @mbggenerated
     */
    public Long getDirectoryId() {
        return directoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_group.directory_id
     *
     * @param directoryId the value for cwd_group.directory_id
     *
     * @mbggenerated
     */
    public void setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
    }
}