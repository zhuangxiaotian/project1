package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.db.CodeBuildLog;
import cn.topdeep.projgroup.entity.db.CodeBuildLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeBuildLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int countByExample(CodeBuildLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int deleteByExample(CodeBuildLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer buildLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int insert(CodeBuildLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int insertSelective(CodeBuildLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    List<CodeBuildLog> selectByExample(CodeBuildLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    CodeBuildLog selectByPrimaryKey(Integer buildLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CodeBuildLog record, @Param("example") CodeBuildLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CodeBuildLog record, @Param("example") CodeBuildLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CodeBuildLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_code_build_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CodeBuildLog record);
}