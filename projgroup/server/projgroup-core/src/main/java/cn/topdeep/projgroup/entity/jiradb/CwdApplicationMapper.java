package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.CwdApplication;
import cn.topdeep.projgroup.entity.jiradb.CwdApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwdApplicationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int countByExample(CwdApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int deleteByExample(CwdApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int insert(CwdApplication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int insertSelective(CwdApplication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    List<CwdApplication> selectByExample(CwdApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    CwdApplication selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CwdApplication record, @Param("example") CwdApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CwdApplication record, @Param("example") CwdApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CwdApplication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_application
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CwdApplication record);
}