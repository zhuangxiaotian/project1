package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class CwdMembership extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.parent_id
     *
     * @mbggenerated
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.child_id
     *
     * @mbggenerated
     */
    private Long childId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.membership_type
     *
     * @mbggenerated
     */
    private String membershipType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.group_type
     *
     * @mbggenerated
     */
    private String groupType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.parent_name
     *
     * @mbggenerated
     */
    private String parentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.lower_parent_name
     *
     * @mbggenerated
     */
    private String lowerParentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.child_name
     *
     * @mbggenerated
     */
    private String childName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.lower_child_name
     *
     * @mbggenerated
     */
    private String lowerChildName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cwd_membership.directory_id
     *
     * @mbggenerated
     */
    private Long directoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    public CwdMembership(Long id, Long parentId, Long childId, String membershipType, String groupType, String parentName, String lowerParentName, String childName, String lowerChildName, Long directoryId) {
        this.id = id;
        this.parentId = parentId;
        this.childId = childId;
        this.membershipType = membershipType;
        this.groupType = groupType;
        this.parentName = parentName;
        this.lowerParentName = lowerParentName;
        this.childName = childName;
        this.lowerChildName = lowerChildName;
        this.directoryId = directoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    public CwdMembership() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.ID
     *
     * @return the value of cwd_membership.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.ID
     *
     * @param id the value for cwd_membership.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.parent_id
     *
     * @return the value of cwd_membership.parent_id
     *
     * @mbggenerated
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.parent_id
     *
     * @param parentId the value for cwd_membership.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.child_id
     *
     * @return the value of cwd_membership.child_id
     *
     * @mbggenerated
     */
    public Long getChildId() {
        return childId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.child_id
     *
     * @param childId the value for cwd_membership.child_id
     *
     * @mbggenerated
     */
    public void setChildId(Long childId) {
        this.childId = childId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.membership_type
     *
     * @return the value of cwd_membership.membership_type
     *
     * @mbggenerated
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.membership_type
     *
     * @param membershipType the value for cwd_membership.membership_type
     *
     * @mbggenerated
     */
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType == null ? null : membershipType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.group_type
     *
     * @return the value of cwd_membership.group_type
     *
     * @mbggenerated
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.group_type
     *
     * @param groupType the value for cwd_membership.group_type
     *
     * @mbggenerated
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType == null ? null : groupType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.parent_name
     *
     * @return the value of cwd_membership.parent_name
     *
     * @mbggenerated
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.parent_name
     *
     * @param parentName the value for cwd_membership.parent_name
     *
     * @mbggenerated
     */
    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.lower_parent_name
     *
     * @return the value of cwd_membership.lower_parent_name
     *
     * @mbggenerated
     */
    public String getLowerParentName() {
        return lowerParentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.lower_parent_name
     *
     * @param lowerParentName the value for cwd_membership.lower_parent_name
     *
     * @mbggenerated
     */
    public void setLowerParentName(String lowerParentName) {
        this.lowerParentName = lowerParentName == null ? null : lowerParentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.child_name
     *
     * @return the value of cwd_membership.child_name
     *
     * @mbggenerated
     */
    public String getChildName() {
        return childName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.child_name
     *
     * @param childName the value for cwd_membership.child_name
     *
     * @mbggenerated
     */
    public void setChildName(String childName) {
        this.childName = childName == null ? null : childName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.lower_child_name
     *
     * @return the value of cwd_membership.lower_child_name
     *
     * @mbggenerated
     */
    public String getLowerChildName() {
        return lowerChildName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.lower_child_name
     *
     * @param lowerChildName the value for cwd_membership.lower_child_name
     *
     * @mbggenerated
     */
    public void setLowerChildName(String lowerChildName) {
        this.lowerChildName = lowerChildName == null ? null : lowerChildName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cwd_membership.directory_id
     *
     * @return the value of cwd_membership.directory_id
     *
     * @mbggenerated
     */
    public Long getDirectoryId() {
        return directoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cwd_membership.directory_id
     *
     * @param directoryId the value for cwd_membership.directory_id
     *
     * @mbggenerated
     */
    public void setDirectoryId(Long directoryId) {
        this.directoryId = directoryId;
    }
}