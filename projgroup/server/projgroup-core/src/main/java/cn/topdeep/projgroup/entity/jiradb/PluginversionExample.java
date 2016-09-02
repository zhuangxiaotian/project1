package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PluginversionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public PluginversionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
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
     * This method corresponds to the database table pluginversion
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
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
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
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pluginversion
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pluginversion
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

        public Criteria andPluginnameIsNull() {
            addCriterion("pluginname is null");
            return (Criteria) this;
        }

        public Criteria andPluginnameIsNotNull() {
            addCriterion("pluginname is not null");
            return (Criteria) this;
        }

        public Criteria andPluginnameEqualTo(String value) {
            addCriterion("pluginname =", value, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameNotEqualTo(String value) {
            addCriterion("pluginname <>", value, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameGreaterThan(String value) {
            addCriterion("pluginname >", value, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameGreaterThanOrEqualTo(String value) {
            addCriterion("pluginname >=", value, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameLessThan(String value) {
            addCriterion("pluginname <", value, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameLessThanOrEqualTo(String value) {
            addCriterion("pluginname <=", value, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameLike(String value) {
            addCriterion("pluginname like", value, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameNotLike(String value) {
            addCriterion("pluginname not like", value, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameIn(List<String> values) {
            addCriterion("pluginname in", values, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameNotIn(List<String> values) {
            addCriterion("pluginname not in", values, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameBetween(String value1, String value2) {
            addCriterion("pluginname between", value1, value2, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginnameNotBetween(String value1, String value2) {
            addCriterion("pluginname not between", value1, value2, "pluginname");
            return (Criteria) this;
        }

        public Criteria andPluginkeyIsNull() {
            addCriterion("pluginkey is null");
            return (Criteria) this;
        }

        public Criteria andPluginkeyIsNotNull() {
            addCriterion("pluginkey is not null");
            return (Criteria) this;
        }

        public Criteria andPluginkeyEqualTo(String value) {
            addCriterion("pluginkey =", value, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyNotEqualTo(String value) {
            addCriterion("pluginkey <>", value, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyGreaterThan(String value) {
            addCriterion("pluginkey >", value, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyGreaterThanOrEqualTo(String value) {
            addCriterion("pluginkey >=", value, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyLessThan(String value) {
            addCriterion("pluginkey <", value, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyLessThanOrEqualTo(String value) {
            addCriterion("pluginkey <=", value, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyLike(String value) {
            addCriterion("pluginkey like", value, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyNotLike(String value) {
            addCriterion("pluginkey not like", value, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyIn(List<String> values) {
            addCriterion("pluginkey in", values, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyNotIn(List<String> values) {
            addCriterion("pluginkey not in", values, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyBetween(String value1, String value2) {
            addCriterion("pluginkey between", value1, value2, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginkeyNotBetween(String value1, String value2) {
            addCriterion("pluginkey not between", value1, value2, "pluginkey");
            return (Criteria) this;
        }

        public Criteria andPluginversionIsNull() {
            addCriterion("pluginversion is null");
            return (Criteria) this;
        }

        public Criteria andPluginversionIsNotNull() {
            addCriterion("pluginversion is not null");
            return (Criteria) this;
        }

        public Criteria andPluginversionEqualTo(String value) {
            addCriterion("pluginversion =", value, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionNotEqualTo(String value) {
            addCriterion("pluginversion <>", value, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionGreaterThan(String value) {
            addCriterion("pluginversion >", value, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionGreaterThanOrEqualTo(String value) {
            addCriterion("pluginversion >=", value, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionLessThan(String value) {
            addCriterion("pluginversion <", value, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionLessThanOrEqualTo(String value) {
            addCriterion("pluginversion <=", value, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionLike(String value) {
            addCriterion("pluginversion like", value, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionNotLike(String value) {
            addCriterion("pluginversion not like", value, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionIn(List<String> values) {
            addCriterion("pluginversion in", values, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionNotIn(List<String> values) {
            addCriterion("pluginversion not in", values, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionBetween(String value1, String value2) {
            addCriterion("pluginversion between", value1, value2, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andPluginversionNotBetween(String value1, String value2) {
            addCriterion("pluginversion not between", value1, value2, "pluginversion");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("CREATED is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("CREATED =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("CREATED <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("CREATED >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("CREATED <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("CREATED <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("CREATED in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("CREATED not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("CREATED between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("CREATED not between", value1, value2, "created");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pluginversion
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
     * This class corresponds to the database table pluginversion
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