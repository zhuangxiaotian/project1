package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class QrtzTriggerListenersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public QrtzTriggerListenersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
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
     * This method corresponds to the database table qrtz_trigger_listeners
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
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
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
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qrtz_trigger_listeners
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table qrtz_trigger_listeners
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

        public Criteria andTriggerIdIsNull() {
            addCriterion("trigger_id is null");
            return (Criteria) this;
        }

        public Criteria andTriggerIdIsNotNull() {
            addCriterion("trigger_id is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerIdEqualTo(Long value) {
            addCriterion("trigger_id =", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdNotEqualTo(Long value) {
            addCriterion("trigger_id <>", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdGreaterThan(Long value) {
            addCriterion("trigger_id >", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trigger_id >=", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdLessThan(Long value) {
            addCriterion("trigger_id <", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdLessThanOrEqualTo(Long value) {
            addCriterion("trigger_id <=", value, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdIn(List<Long> values) {
            addCriterion("trigger_id in", values, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdNotIn(List<Long> values) {
            addCriterion("trigger_id not in", values, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdBetween(Long value1, Long value2) {
            addCriterion("trigger_id between", value1, value2, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerIdNotBetween(Long value1, Long value2) {
            addCriterion("trigger_id not between", value1, value2, "triggerId");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerIsNull() {
            addCriterion("TRIGGER_LISTENER is null");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerIsNotNull() {
            addCriterion("TRIGGER_LISTENER is not null");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerEqualTo(String value) {
            addCriterion("TRIGGER_LISTENER =", value, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerNotEqualTo(String value) {
            addCriterion("TRIGGER_LISTENER <>", value, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerGreaterThan(String value) {
            addCriterion("TRIGGER_LISTENER >", value, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerGreaterThanOrEqualTo(String value) {
            addCriterion("TRIGGER_LISTENER >=", value, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerLessThan(String value) {
            addCriterion("TRIGGER_LISTENER <", value, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerLessThanOrEqualTo(String value) {
            addCriterion("TRIGGER_LISTENER <=", value, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerLike(String value) {
            addCriterion("TRIGGER_LISTENER like", value, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerNotLike(String value) {
            addCriterion("TRIGGER_LISTENER not like", value, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerIn(List<String> values) {
            addCriterion("TRIGGER_LISTENER in", values, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerNotIn(List<String> values) {
            addCriterion("TRIGGER_LISTENER not in", values, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerBetween(String value1, String value2) {
            addCriterion("TRIGGER_LISTENER between", value1, value2, "triggerListener");
            return (Criteria) this;
        }

        public Criteria andTriggerListenerNotBetween(String value1, String value2) {
            addCriterion("TRIGGER_LISTENER not between", value1, value2, "triggerListener");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table qrtz_trigger_listeners
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
     * This class corresponds to the database table qrtz_trigger_listeners
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