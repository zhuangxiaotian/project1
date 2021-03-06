package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Projectroleactor;
import cn.topdeep.projgroup.entity.jiradb.ProjectroleactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectroleactorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int countByExample(ProjectroleactorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int deleteByExample(ProjectroleactorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int insert(Projectroleactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int insertSelective(Projectroleactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    List<Projectroleactor> selectByExample(ProjectroleactorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    Projectroleactor selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Projectroleactor record, @Param("example") ProjectroleactorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Projectroleactor record, @Param("example") ProjectroleactorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Projectroleactor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Projectroleactor record);
}