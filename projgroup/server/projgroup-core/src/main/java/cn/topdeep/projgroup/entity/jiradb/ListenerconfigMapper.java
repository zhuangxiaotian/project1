package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Listenerconfig;
import cn.topdeep.projgroup.entity.jiradb.ListenerconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListenerconfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int countByExample(ListenerconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int deleteByExample(ListenerconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int insert(Listenerconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int insertSelective(Listenerconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    List<Listenerconfig> selectByExample(ListenerconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    Listenerconfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Listenerconfig record, @Param("example") ListenerconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Listenerconfig record, @Param("example") ListenerconfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Listenerconfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Listenerconfig record);
}