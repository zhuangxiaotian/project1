package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class FieldscreenschemeitemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public FieldscreenschemeitemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
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
     * This method corresponds to the database table fieldscreenschemeitem
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
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
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
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fieldscreenschemeitem
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fieldscreenschemeitem
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

        public Criteria andOperationIsNull() {
            addCriterion("OPERATION is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("OPERATION is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(Long value) {
            addCriterion("OPERATION =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(Long value) {
            addCriterion("OPERATION <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(Long value) {
            addCriterion("OPERATION >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATION >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(Long value) {
            addCriterion("OPERATION <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(Long value) {
            addCriterion("OPERATION <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<Long> values) {
            addCriterion("OPERATION in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<Long> values) {
            addCriterion("OPERATION not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(Long value1, Long value2) {
            addCriterion("OPERATION between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(Long value1, Long value2) {
            addCriterion("OPERATION not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andFieldscreenIsNull() {
            addCriterion("FIELDSCREEN is null");
            return (Criteria) this;
        }

        public Criteria andFieldscreenIsNotNull() {
            addCriterion("FIELDSCREEN is not null");
            return (Criteria) this;
        }

        public Criteria andFieldscreenEqualTo(Long value) {
            addCriterion("FIELDSCREEN =", value, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenNotEqualTo(Long value) {
            addCriterion("FIELDSCREEN <>", value, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenGreaterThan(Long value) {
            addCriterion("FIELDSCREEN >", value, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenGreaterThanOrEqualTo(Long value) {
            addCriterion("FIELDSCREEN >=", value, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenLessThan(Long value) {
            addCriterion("FIELDSCREEN <", value, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenLessThanOrEqualTo(Long value) {
            addCriterion("FIELDSCREEN <=", value, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenIn(List<Long> values) {
            addCriterion("FIELDSCREEN in", values, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenNotIn(List<Long> values) {
            addCriterion("FIELDSCREEN not in", values, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenBetween(Long value1, Long value2) {
            addCriterion("FIELDSCREEN between", value1, value2, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenNotBetween(Long value1, Long value2) {
            addCriterion("FIELDSCREEN not between", value1, value2, "fieldscreen");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeIsNull() {
            addCriterion("FIELDSCREENSCHEME is null");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeIsNotNull() {
            addCriterion("FIELDSCREENSCHEME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeEqualTo(Long value) {
            addCriterion("FIELDSCREENSCHEME =", value, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeNotEqualTo(Long value) {
            addCriterion("FIELDSCREENSCHEME <>", value, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeGreaterThan(Long value) {
            addCriterion("FIELDSCREENSCHEME >", value, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeGreaterThanOrEqualTo(Long value) {
            addCriterion("FIELDSCREENSCHEME >=", value, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeLessThan(Long value) {
            addCriterion("FIELDSCREENSCHEME <", value, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeLessThanOrEqualTo(Long value) {
            addCriterion("FIELDSCREENSCHEME <=", value, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeIn(List<Long> values) {
            addCriterion("FIELDSCREENSCHEME in", values, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeNotIn(List<Long> values) {
            addCriterion("FIELDSCREENSCHEME not in", values, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeBetween(Long value1, Long value2) {
            addCriterion("FIELDSCREENSCHEME between", value1, value2, "fieldscreenscheme");
            return (Criteria) this;
        }

        public Criteria andFieldscreenschemeNotBetween(Long value1, Long value2) {
            addCriterion("FIELDSCREENSCHEME not between", value1, value2, "fieldscreenscheme");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fieldscreenschemeitem
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
     * This class corresponds to the database table fieldscreenschemeitem
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