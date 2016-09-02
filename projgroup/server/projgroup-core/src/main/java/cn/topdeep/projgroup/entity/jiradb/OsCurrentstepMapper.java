package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.OsCurrentstep;
import cn.topdeep.projgroup.entity.jiradb.OsCurrentstepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsCurrentstepMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int countByExample(OsCurrentstepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int deleteByExample(OsCurrentstepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int insert(OsCurrentstep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int insertSelective(OsCurrentstep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    List<OsCurrentstep> selectByExample(OsCurrentstepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    OsCurrentstep selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OsCurrentstep record, @Param("example") OsCurrentstepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OsCurrentstep record, @Param("example") OsCurrentstepExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OsCurrentstep record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OsCurrentstep record);
}