package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Upgradeversionhistory;
import cn.topdeep.projgroup.entity.jiradb.UpgradeversionhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpgradeversionhistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int countByExample(UpgradeversionhistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int deleteByExample(UpgradeversionhistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String targetbuild);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int insert(Upgradeversionhistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int insertSelective(Upgradeversionhistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    List<Upgradeversionhistory> selectByExample(UpgradeversionhistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    Upgradeversionhistory selectByPrimaryKey(String targetbuild);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Upgradeversionhistory record, @Param("example") UpgradeversionhistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Upgradeversionhistory record, @Param("example") UpgradeversionhistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Upgradeversionhistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upgradeversionhistory
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Upgradeversionhistory record);
}