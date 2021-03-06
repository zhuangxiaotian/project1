package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.CwdUser;
import cn.topdeep.projgroup.entity.jiradb.CwdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwdUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int countByExample(CwdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int deleteByExample(CwdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int insert(CwdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int insertSelective(CwdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    List<CwdUser> selectByExample(CwdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    CwdUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CwdUser record, @Param("example") CwdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CwdUser record, @Param("example") CwdUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CwdUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CwdUser record);
}