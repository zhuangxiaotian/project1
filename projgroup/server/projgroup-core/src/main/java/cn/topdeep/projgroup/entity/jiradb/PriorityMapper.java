package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Priority;
import cn.topdeep.projgroup.entity.jiradb.PriorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int countByExample(PriorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int deleteByExample(PriorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int insert(Priority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int insertSelective(Priority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    List<Priority> selectByExampleWithBLOBs(PriorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    List<Priority> selectByExample(PriorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    Priority selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Priority record, @Param("example") PriorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Priority record, @Param("example") PriorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Priority record, @Param("example") PriorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Priority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Priority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table priority
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Priority record);
}