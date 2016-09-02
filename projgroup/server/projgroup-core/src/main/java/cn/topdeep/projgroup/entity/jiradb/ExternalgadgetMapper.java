package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Externalgadget;
import cn.topdeep.projgroup.entity.jiradb.ExternalgadgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExternalgadgetMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int countByExample(ExternalgadgetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int deleteByExample(ExternalgadgetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int insert(Externalgadget record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int insertSelective(Externalgadget record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    List<Externalgadget> selectByExampleWithBLOBs(ExternalgadgetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    List<Externalgadget> selectByExample(ExternalgadgetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    Externalgadget selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Externalgadget record, @Param("example") ExternalgadgetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Externalgadget record, @Param("example") ExternalgadgetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Externalgadget record, @Param("example") ExternalgadgetExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Externalgadget record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table externalgadget
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Externalgadget record);
}