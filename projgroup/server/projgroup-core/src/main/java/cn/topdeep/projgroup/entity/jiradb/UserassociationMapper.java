package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Userassociation;
import cn.topdeep.projgroup.entity.jiradb.UserassociationExample;
import cn.topdeep.projgroup.entity.jiradb.UserassociationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserassociationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int countByExample(UserassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int deleteByExample(UserassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(UserassociationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int insert(Userassociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int insertSelective(Userassociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    List<Userassociation> selectByExample(UserassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    Userassociation selectByPrimaryKey(UserassociationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Userassociation record, @Param("example") UserassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Userassociation record, @Param("example") UserassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Userassociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userassociation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Userassociation record);
}