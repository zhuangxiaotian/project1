package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.QrtzFiredTriggers;
import cn.topdeep.projgroup.entity.jiradb.QrtzFiredTriggersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzFiredTriggersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int countByExample(QrtzFiredTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int deleteByExample(QrtzFiredTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String entryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int insert(QrtzFiredTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int insertSelective(QrtzFiredTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    List<QrtzFiredTriggers> selectByExample(QrtzFiredTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    QrtzFiredTriggers selectByPrimaryKey(String entryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") QrtzFiredTriggers record, @Param("example") QrtzFiredTriggersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(QrtzFiredTriggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_fired_triggers
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(QrtzFiredTriggers record);
}