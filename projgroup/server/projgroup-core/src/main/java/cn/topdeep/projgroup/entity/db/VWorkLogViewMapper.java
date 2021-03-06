package cn.topdeep.projgroup.entity.db;

import cn.topdeep.projgroup.entity.db.VWorkLogView;
import cn.topdeep.projgroup.entity.db.VWorkLogViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VWorkLogViewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_work_log_view
     *
     * @mbggenerated
     */
    int countByExample(VWorkLogViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_work_log_view
     *
     * @mbggenerated
     */
    int deleteByExample(VWorkLogViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_work_log_view
     *
     * @mbggenerated
     */
    int insert(VWorkLogView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_work_log_view
     *
     * @mbggenerated
     */
    int insertSelective(VWorkLogView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_work_log_view
     *
     * @mbggenerated
     */
    List<VWorkLogView> selectByExample(VWorkLogViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_work_log_view
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") VWorkLogView record, @Param("example") VWorkLogViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table v_work_log_view
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") VWorkLogView record, @Param("example") VWorkLogViewExample example);
}