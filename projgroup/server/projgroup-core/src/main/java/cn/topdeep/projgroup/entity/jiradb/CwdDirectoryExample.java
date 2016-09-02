package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CwdDirectoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public CwdDirectoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameIsNull() {
            addCriterion("directory_name is null");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameIsNotNull() {
            addCriterion("directory_name is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameEqualTo(String value) {
            addCriterion("directory_name =", value, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameNotEqualTo(String value) {
            addCriterion("directory_name <>", value, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameGreaterThan(String value) {
            addCriterion("directory_name >", value, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("directory_name >=", value, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameLessThan(String value) {
            addCriterion("directory_name <", value, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameLessThanOrEqualTo(String value) {
            addCriterion("directory_name <=", value, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameLike(String value) {
            addCriterion("directory_name like", value, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameNotLike(String value) {
            addCriterion("directory_name not like", value, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameIn(List<String> values) {
            addCriterion("directory_name in", values, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameNotIn(List<String> values) {
            addCriterion("directory_name not in", values, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameBetween(String value1, String value2) {
            addCriterion("directory_name between", value1, value2, "directoryName");
            return (Criteria) this;
        }

        public Criteria andDirectoryNameNotBetween(String value1, String value2) {
            addCriterion("directory_name not between", value1, value2, "directoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameIsNull() {
            addCriterion("lower_directory_name is null");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameIsNotNull() {
            addCriterion("lower_directory_name is not null");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameEqualTo(String value) {
            addCriterion("lower_directory_name =", value, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameNotEqualTo(String value) {
            addCriterion("lower_directory_name <>", value, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameGreaterThan(String value) {
            addCriterion("lower_directory_name >", value, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("lower_directory_name >=", value, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameLessThan(String value) {
            addCriterion("lower_directory_name <", value, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameLessThanOrEqualTo(String value) {
            addCriterion("lower_directory_name <=", value, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameLike(String value) {
            addCriterion("lower_directory_name like", value, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameNotLike(String value) {
            addCriterion("lower_directory_name not like", value, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameIn(List<String> values) {
            addCriterion("lower_directory_name in", values, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameNotIn(List<String> values) {
            addCriterion("lower_directory_name not in", values, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameBetween(String value1, String value2) {
            addCriterion("lower_directory_name between", value1, value2, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andLowerDirectoryNameNotBetween(String value1, String value2) {
            addCriterion("lower_directory_name not between", value1, value2, "lowerDirectoryName");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("updated_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(Date value) {
            addCriterion("updated_date =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(Date value) {
            addCriterion("updated_date <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(Date value) {
            addCriterion("updated_date >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_date >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(Date value) {
            addCriterion("updated_date <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("updated_date <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<Date> values) {
            addCriterion("updated_date in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<Date> values) {
            addCriterion("updated_date not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("updated_date between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("updated_date not between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andImplClassIsNull() {
            addCriterion("impl_class is null");
            return (Criteria) this;
        }

        public Criteria andImplClassIsNotNull() {
            addCriterion("impl_class is not null");
            return (Criteria) this;
        }

        public Criteria andImplClassEqualTo(String value) {
            addCriterion("impl_class =", value, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassNotEqualTo(String value) {
            addCriterion("impl_class <>", value, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassGreaterThan(String value) {
            addCriterion("impl_class >", value, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassGreaterThanOrEqualTo(String value) {
            addCriterion("impl_class >=", value, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassLessThan(String value) {
            addCriterion("impl_class <", value, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassLessThanOrEqualTo(String value) {
            addCriterion("impl_class <=", value, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassLike(String value) {
            addCriterion("impl_class like", value, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassNotLike(String value) {
            addCriterion("impl_class not like", value, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassIn(List<String> values) {
            addCriterion("impl_class in", values, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassNotIn(List<String> values) {
            addCriterion("impl_class not in", values, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassBetween(String value1, String value2) {
            addCriterion("impl_class between", value1, value2, "implClass");
            return (Criteria) this;
        }

        public Criteria andImplClassNotBetween(String value1, String value2) {
            addCriterion("impl_class not between", value1, value2, "implClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassIsNull() {
            addCriterion("lower_impl_class is null");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassIsNotNull() {
            addCriterion("lower_impl_class is not null");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassEqualTo(String value) {
            addCriterion("lower_impl_class =", value, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassNotEqualTo(String value) {
            addCriterion("lower_impl_class <>", value, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassGreaterThan(String value) {
            addCriterion("lower_impl_class >", value, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassGreaterThanOrEqualTo(String value) {
            addCriterion("lower_impl_class >=", value, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassLessThan(String value) {
            addCriterion("lower_impl_class <", value, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassLessThanOrEqualTo(String value) {
            addCriterion("lower_impl_class <=", value, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassLike(String value) {
            addCriterion("lower_impl_class like", value, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassNotLike(String value) {
            addCriterion("lower_impl_class not like", value, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassIn(List<String> values) {
            addCriterion("lower_impl_class in", values, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassNotIn(List<String> values) {
            addCriterion("lower_impl_class not in", values, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassBetween(String value1, String value2) {
            addCriterion("lower_impl_class between", value1, value2, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andLowerImplClassNotBetween(String value1, String value2) {
            addCriterion("lower_impl_class not between", value1, value2, "lowerImplClass");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeIsNull() {
            addCriterion("directory_type is null");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeIsNotNull() {
            addCriterion("directory_type is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeEqualTo(String value) {
            addCriterion("directory_type =", value, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeNotEqualTo(String value) {
            addCriterion("directory_type <>", value, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeGreaterThan(String value) {
            addCriterion("directory_type >", value, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("directory_type >=", value, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeLessThan(String value) {
            addCriterion("directory_type <", value, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeLessThanOrEqualTo(String value) {
            addCriterion("directory_type <=", value, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeLike(String value) {
            addCriterion("directory_type like", value, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeNotLike(String value) {
            addCriterion("directory_type not like", value, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeIn(List<String> values) {
            addCriterion("directory_type in", values, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeNotIn(List<String> values) {
            addCriterion("directory_type not in", values, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeBetween(String value1, String value2) {
            addCriterion("directory_type between", value1, value2, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryTypeNotBetween(String value1, String value2) {
            addCriterion("directory_type not between", value1, value2, "directoryType");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionIsNull() {
            addCriterion("directory_position is null");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionIsNotNull() {
            addCriterion("directory_position is not null");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionEqualTo(Long value) {
            addCriterion("directory_position =", value, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionNotEqualTo(Long value) {
            addCriterion("directory_position <>", value, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionGreaterThan(Long value) {
            addCriterion("directory_position >", value, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionGreaterThanOrEqualTo(Long value) {
            addCriterion("directory_position >=", value, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionLessThan(Long value) {
            addCriterion("directory_position <", value, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionLessThanOrEqualTo(Long value) {
            addCriterion("directory_position <=", value, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionIn(List<Long> values) {
            addCriterion("directory_position in", values, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionNotIn(List<Long> values) {
            addCriterion("directory_position not in", values, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionBetween(Long value1, Long value2) {
            addCriterion("directory_position between", value1, value2, "directoryPosition");
            return (Criteria) this;
        }

        public Criteria andDirectoryPositionNotBetween(Long value1, Long value2) {
            addCriterion("directory_position not between", value1, value2, "directoryPosition");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwd_directory
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cwd_directory
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}