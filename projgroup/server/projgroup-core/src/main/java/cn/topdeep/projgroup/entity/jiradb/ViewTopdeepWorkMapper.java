package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepWork;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepWorkExample;
import cn.topdeep.projgroup.entity.jiradb.ViewTopdeepWorkWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewTopdeepWorkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    int countByExample(ViewTopdeepWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    int deleteByExample(ViewTopdeepWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    int insert(ViewTopdeepWorkWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    int insertSelective(ViewTopdeepWorkWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    List<ViewTopdeepWorkWithBLOBs> selectByExampleWithBLOBs(ViewTopdeepWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    List<ViewTopdeepWork> selectByExample(ViewTopdeepWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ViewTopdeepWorkWithBLOBs record, @Param("example") ViewTopdeepWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ViewTopdeepWorkWithBLOBs record, @Param("example") ViewTopdeepWorkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_topdeep_work
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ViewTopdeepWork record, @Param("example") ViewTopdeepWorkExample example);
}