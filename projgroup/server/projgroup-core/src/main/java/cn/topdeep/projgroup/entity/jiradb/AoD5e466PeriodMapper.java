package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.AoD5e466Period;
import cn.topdeep.projgroup.entity.jiradb.AoD5e466PeriodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoD5e466PeriodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int countByExample(AoD5e466PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int deleteByExample(AoD5e466PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int insert(AoD5e466Period record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int insertSelective(AoD5e466Period record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    List<AoD5e466Period> selectByExample(AoD5e466PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    AoD5e466Period selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AoD5e466Period record, @Param("example") AoD5e466PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AoD5e466Period record, @Param("example") AoD5e466PeriodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AoD5e466Period record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_period
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AoD5e466Period record);
}