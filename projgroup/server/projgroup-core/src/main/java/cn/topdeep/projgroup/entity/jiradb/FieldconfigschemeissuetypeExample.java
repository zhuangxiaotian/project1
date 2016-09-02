package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class FieldconfigschemeissuetypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public FieldconfigschemeissuetypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
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
     * This method corresponds to the database table fieldconfigschemeissuetype
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
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
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
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldconfigschemeissuetype
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fieldconfigschemeissuetype
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

        public Criteria andIssuetypeIsNull() {
            addCriterion("ISSUETYPE is null");
            return (Criteria) this;
        }

        public Criteria andIssuetypeIsNotNull() {
            addCriterion("ISSUETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIssuetypeEqualTo(String value) {
            addCriterion("ISSUETYPE =", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeNotEqualTo(String value) {
            addCriterion("ISSUETYPE <>", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeGreaterThan(String value) {
            addCriterion("ISSUETYPE >", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUETYPE >=", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeLessThan(String value) {
            addCriterion("ISSUETYPE <", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeLessThanOrEqualTo(String value) {
            addCriterion("ISSUETYPE <=", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeLike(String value) {
            addCriterion("ISSUETYPE like", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeNotLike(String value) {
            addCriterion("ISSUETYPE not like", value, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeIn(List<String> values) {
            addCriterion("ISSUETYPE in", values, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeNotIn(List<String> values) {
            addCriterion("ISSUETYPE not in", values, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeBetween(String value1, String value2) {
            addCriterion("ISSUETYPE between", value1, value2, "issuetype");
            return (Criteria) this;
        }

        public Criteria andIssuetypeNotBetween(String value1, String value2) {
            addCriterion("ISSUETYPE not between", value1, value2, "issuetype");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeIsNull() {
            addCriterion("FIELDCONFIGSCHEME is null");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeIsNotNull() {
            addCriterion("FIELDCONFIGSCHEME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeEqualTo(Long value) {
            addCriterion("FIELDCONFIGSCHEME =", value, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeNotEqualTo(Long value) {
            addCriterion("FIELDCONFIGSCHEME <>", value, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeGreaterThan(Long value) {
            addCriterion("FIELDCONFIGSCHEME >", value, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeGreaterThanOrEqualTo(Long value) {
            addCriterion("FIELDCONFIGSCHEME >=", value, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeLessThan(Long value) {
            addCriterion("FIELDCONFIGSCHEME <", value, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeLessThanOrEqualTo(Long value) {
            addCriterion("FIELDCONFIGSCHEME <=", value, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeIn(List<Long> values) {
            addCriterion("FIELDCONFIGSCHEME in", values, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeNotIn(List<Long> values) {
            addCriterion("FIELDCONFIGSCHEME not in", values, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeBetween(Long value1, Long value2) {
            addCriterion("FIELDCONFIGSCHEME between", value1, value2, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigschemeNotBetween(Long value1, Long value2) {
            addCriterion("FIELDCONFIGSCHEME not between", value1, value2, "fieldconfigscheme");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationIsNull() {
            addCriterion("FIELDCONFIGURATION is null");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationIsNotNull() {
            addCriterion("FIELDCONFIGURATION is not null");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationEqualTo(Long value) {
            addCriterion("FIELDCONFIGURATION =", value, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationNotEqualTo(Long value) {
            addCriterion("FIELDCONFIGURATION <>", value, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationGreaterThan(Long value) {
            addCriterion("FIELDCONFIGURATION >", value, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationGreaterThanOrEqualTo(Long value) {
            addCriterion("FIELDCONFIGURATION >=", value, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationLessThan(Long value) {
            addCriterion("FIELDCONFIGURATION <", value, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationLessThanOrEqualTo(Long value) {
            addCriterion("FIELDCONFIGURATION <=", value, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationIn(List<Long> values) {
            addCriterion("FIELDCONFIGURATION in", values, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationNotIn(List<Long> values) {
            addCriterion("FIELDCONFIGURATION not in", values, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationBetween(Long value1, Long value2) {
            addCriterion("FIELDCONFIGURATION between", value1, value2, "fieldconfiguration");
            return (Criteria) this;
        }

        public Criteria andFieldconfigurationNotBetween(Long value1, Long value2) {
            addCriterion("FIELDCONFIGURATION not between", value1, value2, "fieldconfiguration");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fieldconfigschemeissuetype
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
     * This class corresponds to the database table fieldconfigschemeissuetype
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