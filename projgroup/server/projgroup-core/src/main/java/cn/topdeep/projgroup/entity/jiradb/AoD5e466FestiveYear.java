package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class AoD5e466FestiveYear extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_festive_year.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_festive_year.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ao_d5e466_festive_year.YEAR
     *
     * @mbggenerated
     */
    private Integer year;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_year
     *
     * @mbggenerated
     */
    public AoD5e466FestiveYear(Integer id, String name, Integer year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_d5e466_festive_year
     *
     * @mbggenerated
     */
    public AoD5e466FestiveYear() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_festive_year.ID
     *
     * @return the value of ao_d5e466_festive_year.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_festive_year.ID
     *
     * @param id the value for ao_d5e466_festive_year.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_festive_year.NAME
     *
     * @return the value of ao_d5e466_festive_year.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_festive_year.NAME
     *
     * @param name the value for ao_d5e466_festive_year.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ao_d5e466_festive_year.YEAR
     *
     * @return the value of ao_d5e466_festive_year.YEAR
     *
     * @mbggenerated
     */
    public Integer getYear() {
        return year;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ao_d5e466_festive_year.YEAR
     *
     * @param year the value for ao_d5e466_festive_year.YEAR
     *
     * @mbggenerated
     */
    public void setYear(Integer year) {
        this.year = year;
    }
}