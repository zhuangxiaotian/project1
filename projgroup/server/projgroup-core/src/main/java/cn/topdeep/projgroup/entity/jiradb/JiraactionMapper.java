package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Jiraaction;
import cn.topdeep.projgroup.entity.jiradb.JiraactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiraactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int countByExample(JiraactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int deleteByExample(JiraactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int insert(Jiraaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int insertSelective(Jiraaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    List<Jiraaction> selectByExampleWithBLOBs(JiraactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    List<Jiraaction> selectByExample(JiraactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    Jiraaction selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Jiraaction record, @Param("example") JiraactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Jiraaction record, @Param("example") JiraactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Jiraaction record, @Param("example") JiraactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Jiraaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Jiraaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraaction
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Jiraaction record);
}