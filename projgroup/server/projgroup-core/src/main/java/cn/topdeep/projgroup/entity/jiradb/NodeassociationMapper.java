package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Nodeassociation;
import cn.topdeep.projgroup.entity.jiradb.NodeassociationExample;
import cn.topdeep.projgroup.entity.jiradb.NodeassociationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeassociationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int countByExample(NodeassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int deleteByExample(NodeassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(NodeassociationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int insert(Nodeassociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int insertSelective(Nodeassociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    List<Nodeassociation> selectByExample(NodeassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    Nodeassociation selectByPrimaryKey(NodeassociationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Nodeassociation record, @Param("example") NodeassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Nodeassociation record, @Param("example") NodeassociationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Nodeassociation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nodeassociation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Nodeassociation record);
}