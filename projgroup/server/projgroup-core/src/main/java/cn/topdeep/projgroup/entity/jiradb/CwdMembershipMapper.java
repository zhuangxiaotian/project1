package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.CwdMembership;
import cn.topdeep.projgroup.entity.jiradb.CwdMembershipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwdMembershipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int countByExample(CwdMembershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int deleteByExample(CwdMembershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int insert(CwdMembership record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int insertSelective(CwdMembership record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    List<CwdMembership> selectByExample(CwdMembershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    CwdMembership selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CwdMembership record, @Param("example") CwdMembershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CwdMembership record, @Param("example") CwdMembershipExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CwdMembership record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_membership
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CwdMembership record);
}