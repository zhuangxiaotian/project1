package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Ao563aeeActorEntity extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_563aee_actor_entity.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_563aee_actor_entity.FULL_NAME
     *
     * @mbggenerated
     */
    private String fullName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_563aee_actor_entity.PROFILE_PAGE_URI
     *
     * @mbggenerated
     */
    private String profilePageUri;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_563aee_actor_entity.PROFILE_PICTURE_URI
     *
     * @mbggenerated
     */
    private String profilePictureUri;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_563aee_actor_entity.USERNAME
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public Ao563aeeActorEntity(Integer id, String fullName, String profilePageUri, String profilePictureUri, String username) {
        this.id = id;
        this.fullName = fullName;
        this.profilePageUri = profilePageUri;
        this.profilePictureUri = profilePictureUri;
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public Ao563aeeActorEntity() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_563aee_actor_entity.ID
     *
     * @return the value of ao_563aee_actor_entity.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_563aee_actor_entity.ID
     *
     * @param id the value for ao_563aee_actor_entity.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_563aee_actor_entity.FULL_NAME
     *
     * @return the value of ao_563aee_actor_entity.FULL_NAME
     *
     * @mbggenerated
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_563aee_actor_entity.FULL_NAME
     *
     * @param fullName the value for ao_563aee_actor_entity.FULL_NAME
     *
     * @mbggenerated
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_563aee_actor_entity.PROFILE_PAGE_URI
     *
     * @return the value of ao_563aee_actor_entity.PROFILE_PAGE_URI
     *
     * @mbggenerated
     */
    public String getProfilePageUri() {
        return profilePageUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_563aee_actor_entity.PROFILE_PAGE_URI
     *
     * @param profilePageUri the value for ao_563aee_actor_entity.PROFILE_PAGE_URI
     *
     * @mbggenerated
     */
    public void setProfilePageUri(String profilePageUri) {
        this.profilePageUri = profilePageUri == null ? null : profilePageUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_563aee_actor_entity.PROFILE_PICTURE_URI
     *
     * @return the value of ao_563aee_actor_entity.PROFILE_PICTURE_URI
     *
     * @mbggenerated
     */
    public String getProfilePictureUri() {
        return profilePictureUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_563aee_actor_entity.PROFILE_PICTURE_URI
     *
     * @param profilePictureUri the value for ao_563aee_actor_entity.PROFILE_PICTURE_URI
     *
     * @mbggenerated
     */
    public void setProfilePictureUri(String profilePictureUri) {
        this.profilePictureUri = profilePictureUri == null ? null : profilePictureUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_563aee_actor_entity.USERNAME
     *
     * @return the value of ao_563aee_actor_entity.USERNAME
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_563aee_actor_entity.USERNAME
     *
     * @param username the value for ao_563aee_actor_entity.USERNAME
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}