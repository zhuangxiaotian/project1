package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Jiraissue;
import cn.topdeep.projgroup.entity.jiradb.JiraissueExample;
import cn.topdeep.projgroup.entity.jiradb.JiraissueWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiraissueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int countByExample(JiraissueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int deleteByExample(JiraissueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int insert(JiraissueWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int insertSelective(JiraissueWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    List<JiraissueWithBLOBs> selectByExampleWithBLOBs(JiraissueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    List<Jiraissue> selectByExample(JiraissueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    JiraissueWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") JiraissueWithBLOBs record, @Param("example") JiraissueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") JiraissueWithBLOBs record, @Param("example") JiraissueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Jiraissue record, @Param("example") JiraissueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JiraissueWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(JiraissueWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jiraissue
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Jiraissue record);
}