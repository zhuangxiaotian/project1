package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.QrtzJobDetails;
import cn.topdeep.projgroup.entity.jiradb.QrtzJobDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QrtzJobDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int countByExample(QrtzJobDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int deleteByExample(QrtzJobDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int insert(QrtzJobDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int insertSelective(QrtzJobDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    List<QrtzJobDetails> selectByExample(QrtzJobDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    QrtzJobDetails selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") QrtzJobDetails record, @Param("example") QrtzJobDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(QrtzJobDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_job_details
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(QrtzJobDetails record);
}