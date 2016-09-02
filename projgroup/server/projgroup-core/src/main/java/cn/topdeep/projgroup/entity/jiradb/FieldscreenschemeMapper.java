package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Fieldscreenscheme;
import cn.topdeep.projgroup.entity.jiradb.FieldscreenschemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldscreenschemeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int countByExample(FieldscreenschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int deleteByExample(FieldscreenschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int insert(Fieldscreenscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int insertSelective(Fieldscreenscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    List<Fieldscreenscheme> selectByExample(FieldscreenschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    Fieldscreenscheme selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Fieldscreenscheme record, @Param("example") FieldscreenschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Fieldscreenscheme record, @Param("example") FieldscreenschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Fieldscreenscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenscheme
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Fieldscreenscheme record);
}