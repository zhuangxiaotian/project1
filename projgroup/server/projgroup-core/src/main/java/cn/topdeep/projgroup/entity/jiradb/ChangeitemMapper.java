package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Changeitem;
import cn.topdeep.projgroup.entity.jiradb.ChangeitemExample;
import cn.topdeep.projgroup.entity.jiradb.ChangeitemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangeitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int countByExample(ChangeitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int deleteByExample(ChangeitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int insert(ChangeitemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int insertSelective(ChangeitemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    List<ChangeitemWithBLOBs> selectByExampleWithBLOBs(ChangeitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    List<Changeitem> selectByExample(ChangeitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    ChangeitemWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ChangeitemWithBLOBs record, @Param("example") ChangeitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") ChangeitemWithBLOBs record, @Param("example") ChangeitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Changeitem record, @Param("example") ChangeitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChangeitemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(ChangeitemWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changeitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Changeitem record);
}