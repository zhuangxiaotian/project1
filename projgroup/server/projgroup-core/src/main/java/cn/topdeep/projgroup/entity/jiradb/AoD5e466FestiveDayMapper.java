package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.AoD5e466FestiveDay;
import cn.topdeep.projgroup.entity.jiradb.AoD5e466FestiveDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AoD5e466FestiveDayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int countByExample(AoD5e466FestiveDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int deleteByExample(AoD5e466FestiveDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int insert(AoD5e466FestiveDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int insertSelective(AoD5e466FestiveDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    List<AoD5e466FestiveDay> selectByExample(AoD5e466FestiveDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    AoD5e466FestiveDay selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AoD5e466FestiveDay record, @Param("example") AoD5e466FestiveDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AoD5e466FestiveDay record, @Param("example") AoD5e466FestiveDayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AoD5e466FestiveDay record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_day
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AoD5e466FestiveDay record);
}