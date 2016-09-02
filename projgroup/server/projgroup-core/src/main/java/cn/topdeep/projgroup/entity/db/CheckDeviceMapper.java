package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.db.CheckDevice;
import cn.topdeep.projgroup.entity.db.CheckDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckDeviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int countByExample(CheckDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int deleteByExample(CheckDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int insert(CheckDevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int insertSelective(CheckDevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    List<CheckDevice> selectByExample(CheckDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    CheckDevice selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CheckDevice record, @Param("example") CheckDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CheckDevice record, @Param("example") CheckDeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CheckDevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_check_device
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CheckDevice record);
}