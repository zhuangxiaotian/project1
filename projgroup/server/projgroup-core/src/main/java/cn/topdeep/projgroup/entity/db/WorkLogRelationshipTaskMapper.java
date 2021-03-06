package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.db.WorkLogRelationshipTaskExample;
import cn.topdeep.projgroup.entity.db.WorkLogRelationshipTaskKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkLogRelationshipTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    int countByExample(WorkLogRelationshipTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    int deleteByExample(WorkLogRelationshipTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(WorkLogRelationshipTaskKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    int insert(WorkLogRelationshipTaskKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    int insertSelective(WorkLogRelationshipTaskKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    List<WorkLogRelationshipTaskKey> selectByExample(WorkLogRelationshipTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WorkLogRelationshipTaskKey record, @Param("example") WorkLogRelationshipTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log_relationship_task
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WorkLogRelationshipTaskKey record, @Param("example") WorkLogRelationshipTaskExample example);
}