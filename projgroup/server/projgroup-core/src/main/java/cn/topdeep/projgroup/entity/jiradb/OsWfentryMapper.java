package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.OsWfentry;
import cn.topdeep.projgroup.entity.jiradb.OsWfentryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OsWfentryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int countByExample(OsWfentryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int deleteByExample(OsWfentryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int insert(OsWfentry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int insertSelective(OsWfentry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    List<OsWfentry> selectByExample(OsWfentryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    OsWfentry selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OsWfentry record, @Param("example") OsWfentryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OsWfentry record, @Param("example") OsWfentryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OsWfentry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_wfentry
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OsWfentry record);
}