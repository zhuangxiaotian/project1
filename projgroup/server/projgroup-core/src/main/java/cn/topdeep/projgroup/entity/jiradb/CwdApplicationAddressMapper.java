package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.CwdApplicationAddress;
import cn.topdeep.projgroup.entity.jiradb.CwdApplicationAddressExample;
import cn.topdeep.projgroup.entity.jiradb.CwdApplicationAddressKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwdApplicationAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int countByExample(CwdApplicationAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int deleteByExample(CwdApplicationAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(CwdApplicationAddressKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int insert(CwdApplicationAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int insertSelective(CwdApplicationAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    List<CwdApplicationAddress> selectByExample(CwdApplicationAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    CwdApplicationAddress selectByPrimaryKey(CwdApplicationAddressKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CwdApplicationAddress record, @Param("example") CwdApplicationAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CwdApplicationAddress record, @Param("example") CwdApplicationAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CwdApplicationAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application_address
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CwdApplicationAddress record);
}