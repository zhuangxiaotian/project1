package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Ao854ed6Configuration;
import cn.topdeep.projgroup.entity.jiradb.Ao854ed6ConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ao854ed6ConfigurationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int countByExample(Ao854ed6ConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int deleteByExample(Ao854ed6ConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int insert(Ao854ed6Configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int insertSelective(Ao854ed6Configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    List<Ao854ed6Configuration> selectByExample(Ao854ed6ConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    Ao854ed6Configuration selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Ao854ed6Configuration record, @Param("example") Ao854ed6ConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Ao854ed6Configuration record, @Param("example") Ao854ed6ConfigurationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Ao854ed6Configuration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_854ed6_configuration
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Ao854ed6Configuration record);
}