package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Propertytext;
import cn.topdeep.projgroup.entity.jiradb.PropertytextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertytextMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int countByExample(PropertytextExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int deleteByExample(PropertytextExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int insert(Propertytext record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int insertSelective(Propertytext record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    List<Propertytext> selectByExampleWithBLOBs(PropertytextExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    List<Propertytext> selectByExample(PropertytextExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    Propertytext selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Propertytext record, @Param("example") PropertytextExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Propertytext record, @Param("example") PropertytextExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Propertytext record, @Param("example") PropertytextExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Propertytext record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertytext
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Propertytext record);
}