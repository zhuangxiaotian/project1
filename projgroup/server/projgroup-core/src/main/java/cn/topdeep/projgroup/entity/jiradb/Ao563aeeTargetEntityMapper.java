package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Ao563aeeTargetEntity;
import cn.topdeep.projgroup.entity.jiradb.Ao563aeeTargetEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ao563aeeTargetEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int countByExample(Ao563aeeTargetEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int deleteByExample(Ao563aeeTargetEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int insert(Ao563aeeTargetEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int insertSelective(Ao563aeeTargetEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    List<Ao563aeeTargetEntity> selectByExample(Ao563aeeTargetEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    Ao563aeeTargetEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Ao563aeeTargetEntity record, @Param("example") Ao563aeeTargetEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Ao563aeeTargetEntity record, @Param("example") Ao563aeeTargetEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Ao563aeeTargetEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_target_entity
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Ao563aeeTargetEntity record);
}