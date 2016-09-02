package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Workflowschemeentity;
import cn.topdeep.projgroup.entity.jiradb.WorkflowschemeentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowschemeentityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int countByExample(WorkflowschemeentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int deleteByExample(WorkflowschemeentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int insert(Workflowschemeentity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int insertSelective(Workflowschemeentity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    List<Workflowschemeentity> selectByExample(WorkflowschemeentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    Workflowschemeentity selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Workflowschemeentity record, @Param("example") WorkflowschemeentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Workflowschemeentity record, @Param("example") WorkflowschemeentityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Workflowschemeentity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflowschemeentity
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Workflowschemeentity record);
}