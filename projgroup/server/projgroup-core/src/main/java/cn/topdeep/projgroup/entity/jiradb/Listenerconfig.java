package cn.topdeep.projgroup.entity.jiradb;

import cn.topdeep.projgroup.entity.base.BaseEntity;

public class Listenerconfig extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listenerconfig.ID
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listenerconfig.CLAZZ
     *
     * @mbggenerated
     */
    private String clazz;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column listenerconfig.listenername
     *
     * @mbggenerated
     */
    private String listenername;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    public Listenerconfig(Long id, String clazz, String listenername) {
        this.id = id;
        this.clazz = clazz;
        this.listenername = listenername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table listenerconfig
     *
     * @mbggenerated
     */
    public Listenerconfig() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listenerconfig.ID
     *
     * @return the value of listenerconfig.ID
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listenerconfig.ID
     *
     * @param id the value for listenerconfig.ID
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listenerconfig.CLAZZ
     *
     * @return the value of listenerconfig.CLAZZ
     *
     * @mbggenerated
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listenerconfig.CLAZZ
     *
     * @param clazz the value for listenerconfig.CLAZZ
     *
     * @mbggenerated
     */
    public void setClazz(String clazz) {
        this.clazz = clazz == null ? null : clazz.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column listenerconfig.listenername
     *
     * @return the value of listenerconfig.listenername
     *
     * @mbggenerated
     */
    public String getListenername() {
        return listenername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column listenerconfig.listenername
     *
     * @param listenername the value for listenerconfig.listenername
     *
     * @mbggenerated
     */
    public void setListenername(String listenername) {
        this.listenername = listenername == null ? null : listenername.trim();
    }
}