package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Jiraworkflows;
import cn.topdeep.projgroup.entity.jiradb.JiraworkflowsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiraworkflowsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int countByExample(JiraworkflowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int deleteByExample(JiraworkflowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int insert(Jiraworkflows record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int insertSelective(Jiraworkflows record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    List<Jiraworkflows> selectByExampleWithBLOBs(JiraworkflowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    List<Jiraworkflows> selectByExample(JiraworkflowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    Jiraworkflows selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Jiraworkflows record, @Param("example") JiraworkflowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Jiraworkflows record, @Param("example") JiraworkflowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Jiraworkflows record, @Param("example") JiraworkflowsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Jiraworkflows record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Jiraworkflows record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraworkflows
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Jiraworkflows record);
}