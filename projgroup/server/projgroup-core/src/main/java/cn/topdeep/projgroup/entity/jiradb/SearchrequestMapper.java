package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Searchrequest;
import cn.topdeep.projgroup.entity.jiradb.SearchrequestExample;
import cn.topdeep.projgroup.entity.jiradb.SearchrequestWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchrequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int countByExample(SearchrequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int deleteByExample(SearchrequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int insert(SearchrequestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int insertSelective(SearchrequestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    List<SearchrequestWithBLOBs> selectByExampleWithBLOBs(SearchrequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    List<Searchrequest> selectByExample(SearchrequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    SearchrequestWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SearchrequestWithBLOBs record, @Param("example") SearchrequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") SearchrequestWithBLOBs record, @Param("example") SearchrequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Searchrequest record, @Param("example") SearchrequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SearchrequestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(SearchrequestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table searchrequest
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Searchrequest record);
}