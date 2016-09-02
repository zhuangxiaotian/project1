package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.db.WorkLog;
import cn.topdeep.projgroup.entity.db.WorkLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int countByExample(WorkLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int deleteByExample(WorkLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer workLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int insert(WorkLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int insertSelective(WorkLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    List<WorkLog> selectByExampleWithBLOBs(WorkLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    List<WorkLog> selectByExample(WorkLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    WorkLog selectByPrimaryKey(Integer workLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") WorkLog record, @Param("example") WorkLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") WorkLog record, @Param("example") WorkLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") WorkLog record, @Param("example") WorkLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(WorkLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(WorkLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(WorkLog record);
}