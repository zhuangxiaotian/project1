package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Propertydate;
import cn.topdeep.projgroup.entity.jiradb.PropertydateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropertydateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int countByExample(PropertydateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int deleteByExample(PropertydateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int insert(Propertydate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int insertSelective(Propertydate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    List<Propertydate> selectByExample(PropertydateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    Propertydate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Propertydate record, @Param("example") PropertydateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Propertydate record, @Param("example") PropertydateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Propertydate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table propertydate
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Propertydate record);
}