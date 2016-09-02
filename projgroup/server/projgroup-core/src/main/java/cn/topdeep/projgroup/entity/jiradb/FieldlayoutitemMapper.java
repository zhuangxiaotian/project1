package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Fieldlayoutitem;
import cn.topdeep.projgroup.entity.jiradb.FieldlayoutitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldlayoutitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int countByExample(FieldlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int deleteByExample(FieldlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int insert(Fieldlayoutitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int insertSelective(Fieldlayoutitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    List<Fieldlayoutitem> selectByExampleWithBLOBs(FieldlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    List<Fieldlayoutitem> selectByExample(FieldlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    Fieldlayoutitem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Fieldlayoutitem record, @Param("example") FieldlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Fieldlayoutitem record, @Param("example") FieldlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Fieldlayoutitem record, @Param("example") FieldlayoutitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Fieldlayoutitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Fieldlayoutitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldlayoutitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Fieldlayoutitem record);
}