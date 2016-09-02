package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Fieldconfigscheme;
import cn.topdeep.projgroup.entity.jiradb.FieldconfigschemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldconfigschemeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int countByExample(FieldconfigschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int deleteByExample(FieldconfigschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int insert(Fieldconfigscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int insertSelective(Fieldconfigscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    List<Fieldconfigscheme> selectByExampleWithBLOBs(FieldconfigschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    List<Fieldconfigscheme> selectByExample(FieldconfigschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    Fieldconfigscheme selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Fieldconfigscheme record, @Param("example") FieldconfigschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Fieldconfigscheme record, @Param("example") FieldconfigschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Fieldconfigscheme record, @Param("example") FieldconfigschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Fieldconfigscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Fieldconfigscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigscheme
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Fieldconfigscheme record);
}