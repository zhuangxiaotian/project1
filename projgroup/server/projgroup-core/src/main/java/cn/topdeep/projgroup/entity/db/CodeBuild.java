package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class CodeBuild extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.BUILD_ID
     *
     * @mbggenerated
     */
    private Integer buildId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.BUILD_NAME
     *
     * @mbggenerated
     */
    private String buildName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.BUILD_DESC
     *
     * @mbggenerated
     */
    private String buildDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.PARENT_BUILD_ID
     *
     * @mbggenerated
     */
    private Integer parentBuildId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.FUNC_PROJECTS
     *
     * @mbggenerated
     */
    private String funcProjects;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.PUB0
     *
     * @mbggenerated
     */
    private String pub0;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.PUB1
     *
     * @mbggenerated
     */
    private String pub1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.PUB2
     *
     * @mbggenerated
     */
    private String pub2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.PUB3
     *
     * @mbggenerated
     */
    private String pub3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.PUB4
     *
     * @mbggenerated
     */
    private String pub4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_code_build.PUB5
     *
     * @mbggenerated
     */
    private String pub5;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build
     *
     * @mbggenerated
     */
    public CodeBuild(Integer buildId, String buildName, String buildDesc, Integer parentBuildId, String funcProjects, String pub0, String pub1, String pub2, String pub3, String pub4, String pub5) {
        this.buildId = buildId;
        this.buildName = buildName;
        this.buildDesc = buildDesc;
        this.parentBuildId = parentBuildId;
        this.funcProjects = funcProjects;
        this.pub0 = pub0;
        this.pub1 = pub1;
        this.pub2 = pub2;
        this.pub3 = pub3;
        this.pub4 = pub4;
        this.pub5 = pub5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build
     *
     * @mbggenerated
     */
    public CodeBuild() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.BUILD_ID
     *
     * @return the value of t_code_build.BUILD_ID
     *
     * @mbggenerated
     */
    public Integer getBuildId() {
        return buildId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.BUILD_ID
     *
     * @param buildId the value for t_code_build.BUILD_ID
     *
     * @mbggenerated
     */
    public void setBuildId(Integer buildId) {
        this.buildId = buildId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.BUILD_NAME
     *
     * @return the value of t_code_build.BUILD_NAME
     *
     * @mbggenerated
     */
    public String getBuildName() {
        return buildName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.BUILD_NAME
     *
     * @param buildName the value for t_code_build.BUILD_NAME
     *
     * @mbggenerated
     */
    public void setBuildName(String buildName) {
        this.buildName = buildName == null ? null : buildName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.BUILD_DESC
     *
     * @return the value of t_code_build.BUILD_DESC
     *
     * @mbggenerated
     */
    public String getBuildDesc() {
        return buildDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.BUILD_DESC
     *
     * @param buildDesc the value for t_code_build.BUILD_DESC
     *
     * @mbggenerated
     */
    public void setBuildDesc(String buildDesc) {
        this.buildDesc = buildDesc == null ? null : buildDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.PARENT_BUILD_ID
     *
     * @return the value of t_code_build.PARENT_BUILD_ID
     *
     * @mbggenerated
     */
    public Integer getParentBuildId() {
        return parentBuildId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.PARENT_BUILD_ID
     *
     * @param parentBuildId the value for t_code_build.PARENT_BUILD_ID
     *
     * @mbggenerated
     */
    public void setParentBuildId(Integer parentBuildId) {
        this.parentBuildId = parentBuildId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.FUNC_PROJECTS
     *
     * @return the value of t_code_build.FUNC_PROJECTS
     *
     * @mbggenerated
     */
    public String getFuncProjects() {
        return funcProjects;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.FUNC_PROJECTS
     *
     * @param funcProjects the value for t_code_build.FUNC_PROJECTS
     *
     * @mbggenerated
     */
    public void setFuncProjects(String funcProjects) {
        this.funcProjects = funcProjects == null ? null : funcProjects.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.PUB0
     *
     * @return the value of t_code_build.PUB0
     *
     * @mbggenerated
     */
    public String getPub0() {
        return pub0;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.PUB0
     *
     * @param pub0 the value for t_code_build.PUB0
     *
     * @mbggenerated
     */
    public void setPub0(String pub0) {
        this.pub0 = pub0 == null ? null : pub0.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.PUB1
     *
     * @return the value of t_code_build.PUB1
     *
     * @mbggenerated
     */
    public String getPub1() {
        return pub1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.PUB1
     *
     * @param pub1 the value for t_code_build.PUB1
     *
     * @mbggenerated
     */
    public void setPub1(String pub1) {
        this.pub1 = pub1 == null ? null : pub1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.PUB2
     *
     * @return the value of t_code_build.PUB2
     *
     * @mbggenerated
     */
    public String getPub2() {
        return pub2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.PUB2
     *
     * @param pub2 the value for t_code_build.PUB2
     *
     * @mbggenerated
     */
    public void setPub2(String pub2) {
        this.pub2 = pub2 == null ? null : pub2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.PUB3
     *
     * @return the value of t_code_build.PUB3
     *
     * @mbggenerated
     */
    public String getPub3() {
        return pub3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.PUB3
     *
     * @param pub3 the value for t_code_build.PUB3
     *
     * @mbggenerated
     */
    public void setPub3(String pub3) {
        this.pub3 = pub3 == null ? null : pub3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.PUB4
     *
     * @return the value of t_code_build.PUB4
     *
     * @mbggenerated
     */
    public String getPub4() {
        return pub4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.PUB4
     *
     * @param pub4 the value for t_code_build.PUB4
     *
     * @mbggenerated
     */
    public void setPub4(String pub4) {
        this.pub4 = pub4 == null ? null : pub4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_code_build.PUB5
     *
     * @return the value of t_code_build.PUB5
     *
     * @mbggenerated
     */
    public String getPub5() {
        return pub5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_code_build.PUB5
     *
     * @param pub5 the value for t_code_build.PUB5
     *
     * @mbggenerated
     */
    public void setPub5(String pub5) {
        this.pub5 = pub5 == null ? null : pub5.trim();
    }
}