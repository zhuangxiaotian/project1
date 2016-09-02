package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.QrtzTriggerListeners;
import cn.topdeep.projgroup.entity.jiradb.QrtzTriggerListenersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzTriggerListenersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int countByExample(QrtzTriggerListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int deleteByExample(QrtzTriggerListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int insert(QrtzTriggerListeners record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int insertSelective(QrtzTriggerListeners record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    List<QrtzTriggerListeners> selectByExample(QrtzTriggerListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    QrtzTriggerListeners selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") QrtzTriggerListeners record, @Param("example") QrtzTriggerListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") QrtzTriggerListeners record, @Param("example") QrtzTriggerListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(QrtzTriggerListeners record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(QrtzTriggerListeners record);
}