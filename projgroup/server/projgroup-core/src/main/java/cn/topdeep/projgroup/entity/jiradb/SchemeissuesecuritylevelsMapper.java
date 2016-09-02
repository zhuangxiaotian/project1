package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Schemeissuesecuritylevels;
import cn.topdeep.projgroup.entity.jiradb.SchemeissuesecuritylevelsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemeissuesecuritylevelsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int countByExample(SchemeissuesecuritylevelsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int deleteByExample(SchemeissuesecuritylevelsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int insert(Schemeissuesecuritylevels record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int insertSelective(Schemeissuesecuritylevels record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    List<Schemeissuesecuritylevels> selectByExampleWithBLOBs(SchemeissuesecuritylevelsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    List<Schemeissuesecuritylevels> selectByExample(SchemeissuesecuritylevelsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    Schemeissuesecuritylevels selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Schemeissuesecuritylevels record, @Param("example") SchemeissuesecuritylevelsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Schemeissuesecuritylevels record, @Param("example") SchemeissuesecuritylevelsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Schemeissuesecuritylevels record, @Param("example") SchemeissuesecuritylevelsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Schemeissuesecuritylevels record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Schemeissuesecuritylevels record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecuritylevels
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Schemeissuesecuritylevels record);
}