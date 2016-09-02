package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.OsCurrentstepPrevExample;
import cn.topdeep.projgroup.entity.jiradb.OsCurrentstepPrevKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsCurrentstepPrevMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    int countByExample(OsCurrentstepPrevExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    int deleteByExample(OsCurrentstepPrevExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(OsCurrentstepPrevKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    int insert(OsCurrentstepPrevKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    int insertSelective(OsCurrentstepPrevKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    List<OsCurrentstepPrevKey> selectByExample(OsCurrentstepPrevExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OsCurrentstepPrevKey record, @Param("example") OsCurrentstepPrevExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_currentstep_prev
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OsCurrentstepPrevKey record, @Param("example") OsCurrentstepPrevExample example);
}