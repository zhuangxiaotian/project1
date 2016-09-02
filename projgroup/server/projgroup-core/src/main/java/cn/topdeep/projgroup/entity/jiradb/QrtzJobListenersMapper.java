package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.QrtzJobListeners;
import cn.topdeep.projgroup.entity.jiradb.QrtzJobListenersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzJobListenersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int countByExample(QrtzJobListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int deleteByExample(QrtzJobListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int insert(QrtzJobListeners record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int insertSelective(QrtzJobListeners record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    List<QrtzJobListeners> selectByExample(QrtzJobListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    QrtzJobListeners selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") QrtzJobListeners record, @Param("example") QrtzJobListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") QrtzJobListeners record, @Param("example") QrtzJobListenersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(QrtzJobListeners record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_listeners
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(QrtzJobListeners record);
}