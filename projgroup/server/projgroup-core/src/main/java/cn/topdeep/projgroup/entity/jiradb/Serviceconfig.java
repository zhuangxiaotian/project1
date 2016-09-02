package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Serviceconfig extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceconfig.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceconfig.delaytime
     *
     * @mbggenerated
     */
    private Long delaytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceconfig.CLAZZ
     *
     * @mbggenerated
     */
    private String clazz;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column serviceconfig.servicename
     *
     * @mbggenerated
     */
    private String servicename;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceconfig
     *
     * @mbggenerated
     */
    public Serviceconfig(Long id, Long delaytime, String clazz, String servicename) {
        this.id = id;
        this.delaytime = delaytime;
        this.clazz = clazz;
        this.servicename = servicename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table serviceconfig
     *
     * @mbggenerated
     */
    public Serviceconfig() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceconfig.ID
     *
     * @return the value of serviceconfig.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceconfig.ID
     *
     * @param id the value for serviceconfig.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceconfig.delaytime
     *
     * @return the value of serviceconfig.delaytime
     *
     * @mbggenerated
     */
    public Long getDelaytime() {
        return delaytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceconfig.delaytime
     *
     * @param delaytime the value for serviceconfig.delaytime
     *
     * @mbggenerated
     */
    public void setDelaytime(Long delaytime) {
        this.delaytime = delaytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceconfig.CLAZZ
     *
     * @return the value of serviceconfig.CLAZZ
     *
     * @mbggenerated
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceconfig.CLAZZ
     *
     * @param clazz the value for serviceconfig.CLAZZ
     *
     * @mbggenerated
     */
    public void setClazz(String clazz) {
        this.clazz = clazz == null ? null : clazz.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column serviceconfig.servicename
     *
     * @return the value of serviceconfig.servicename
     *
     * @mbggenerated
     */
    public String getServicename() {
        return servicename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column serviceconfig.servicename
     *
     * @param servicename the value for serviceconfig.servicename
     *
     * @mbggenerated
     */
    public void setServicename(String servicename) {
        this.servicename = servicename == null ? null : servicename.trim();
    }
}