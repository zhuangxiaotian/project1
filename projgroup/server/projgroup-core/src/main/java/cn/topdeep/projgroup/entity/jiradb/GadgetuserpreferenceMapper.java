package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Gadgetuserpreference;
import cn.topdeep.projgroup.entity.jiradb.GadgetuserpreferenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GadgetuserpreferenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int countByExample(GadgetuserpreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int deleteByExample(GadgetuserpreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int insert(Gadgetuserpreference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int insertSelective(Gadgetuserpreference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    List<Gadgetuserpreference> selectByExampleWithBLOBs(GadgetuserpreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    List<Gadgetuserpreference> selectByExample(GadgetuserpreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    Gadgetuserpreference selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Gadgetuserpreference record, @Param("example") GadgetuserpreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Gadgetuserpreference record, @Param("example") GadgetuserpreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Gadgetuserpreference record, @Param("example") GadgetuserpreferenceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Gadgetuserpreference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Gadgetuserpreference record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gadgetuserpreference
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Gadgetuserpreference record);
}