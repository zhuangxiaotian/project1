package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.jiradb.Favouriteassociations;
import cn.topdeep.projgroup.entity.jiradb.FavouriteassociationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FavouriteassociationsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int countByExample(FavouriteassociationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int deleteByExample(FavouriteassociationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int insert(Favouriteassociations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int insertSelective(Favouriteassociations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    List<Favouriteassociations> selectByExample(FavouriteassociationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    Favouriteassociations selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Favouriteassociations record, @Param("example") FavouriteassociationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Favouriteassociations record, @Param("example") FavouriteassociationsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Favouriteassociations record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favouriteassociations
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Favouriteassociations record);
}