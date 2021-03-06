package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.db.ClientActivation;
import cn.topdeep.projgroup.entity.db.ClientActivationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientActivationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int countByExample(ClientActivationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int deleteByExample(ClientActivationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int insert(ClientActivation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int insertSelective(ClientActivation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    List<ClientActivation> selectByExample(ClientActivationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    ClientActivation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ClientActivation record, @Param("example") ClientActivationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ClientActivation record, @Param("example") ClientActivationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ClientActivation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_client_activation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ClientActivation record);
}