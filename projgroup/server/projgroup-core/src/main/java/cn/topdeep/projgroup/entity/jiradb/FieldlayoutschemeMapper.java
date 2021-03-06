package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Fieldlayoutscheme;
import cn.topdeep.projgroup.entity.jiradb.FieldlayoutschemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldlayoutschemeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int countByExample(FieldlayoutschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int deleteByExample(FieldlayoutschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int insert(Fieldlayoutscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int insertSelective(Fieldlayoutscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    List<Fieldlayoutscheme> selectByExampleWithBLOBs(FieldlayoutschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    List<Fieldlayoutscheme> selectByExample(FieldlayoutschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    Fieldlayoutscheme selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Fieldlayoutscheme record, @Param("example") FieldlayoutschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Fieldlayoutscheme record, @Param("example") FieldlayoutschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Fieldlayoutscheme record, @Param("example") FieldlayoutschemeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Fieldlayoutscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Fieldlayoutscheme record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutscheme
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Fieldlayoutscheme record);
}