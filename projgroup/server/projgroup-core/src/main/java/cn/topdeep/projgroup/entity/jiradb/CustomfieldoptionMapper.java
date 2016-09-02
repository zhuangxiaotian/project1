package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Customfieldoption;
import cn.topdeep.projgroup.entity.jiradb.CustomfieldoptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomfieldoptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int countByExample(CustomfieldoptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int deleteByExample(CustomfieldoptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int insert(Customfieldoption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int insertSelective(Customfieldoption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    List<Customfieldoption> selectByExample(CustomfieldoptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    Customfieldoption selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Customfieldoption record, @Param("example") CustomfieldoptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Customfieldoption record, @Param("example") CustomfieldoptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Customfieldoption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customfieldoption
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Customfieldoption record);
}