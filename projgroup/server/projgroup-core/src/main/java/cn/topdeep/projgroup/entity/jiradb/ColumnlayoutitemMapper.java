package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Columnlayoutitem;
import cn.topdeep.projgroup.entity.jiradb.ColumnlayoutitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnlayoutitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int countByExample(ColumnlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int deleteByExample(ColumnlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int insert(Columnlayoutitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int insertSelective(Columnlayoutitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    List<Columnlayoutitem> selectByExample(ColumnlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    Columnlayoutitem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Columnlayoutitem record, @Param("example") ColumnlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Columnlayoutitem record, @Param("example") ColumnlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Columnlayoutitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table columnlayoutitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Columnlayoutitem record);
}