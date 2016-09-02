package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OauthspconsumerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public OauthspconsumerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
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
     * This method corresponds to the database table oauthspconsumer
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
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
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
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauthspconsumer
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oauthspconsumer
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

        public Criteria andConsumerKeyIsNull() {
            addCriterion("CONSUMER_KEY is null");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyIsNotNull() {
            addCriterion("CONSUMER_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyEqualTo(String value) {
            addCriterion("CONSUMER_KEY =", value, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyNotEqualTo(String value) {
            addCriterion("CONSUMER_KEY <>", value, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyGreaterThan(String value) {
            addCriterion("CONSUMER_KEY >", value, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyGreaterThanOrEqualTo(String value) {
            addCriterion("CONSUMER_KEY >=", value, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyLessThan(String value) {
            addCriterion("CONSUMER_KEY <", value, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyLessThanOrEqualTo(String value) {
            addCriterion("CONSUMER_KEY <=", value, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyLike(String value) {
            addCriterion("CONSUMER_KEY like", value, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyNotLike(String value) {
            addCriterion("CONSUMER_KEY not like", value, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyIn(List<String> values) {
            addCriterion("CONSUMER_KEY in", values, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyNotIn(List<String> values) {
            addCriterion("CONSUMER_KEY not in", values, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyBetween(String value1, String value2) {
            addCriterion("CONSUMER_KEY between", value1, value2, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumerKeyNotBetween(String value1, String value2) {
            addCriterion("CONSUMER_KEY not between", value1, value2, "consumerKey");
            return (Criteria) this;
        }

        public Criteria andConsumernameIsNull() {
            addCriterion("consumername is null");
            return (Criteria) this;
        }

        public Criteria andConsumernameIsNotNull() {
            addCriterion("consumername is not null");
            return (Criteria) this;
        }

        public Criteria andConsumernameEqualTo(String value) {
            addCriterion("consumername =", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameNotEqualTo(String value) {
            addCriterion("consumername <>", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameGreaterThan(String value) {
            addCriterion("consumername >", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameGreaterThanOrEqualTo(String value) {
            addCriterion("consumername >=", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameLessThan(String value) {
            addCriterion("consumername <", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameLessThanOrEqualTo(String value) {
            addCriterion("consumername <=", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameLike(String value) {
            addCriterion("consumername like", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameNotLike(String value) {
            addCriterion("consumername not like", value, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameIn(List<String> values) {
            addCriterion("consumername in", values, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameNotIn(List<String> values) {
            addCriterion("consumername not in", values, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameBetween(String value1, String value2) {
            addCriterion("consumername between", value1, value2, "consumername");
            return (Criteria) this;
        }

        public Criteria andConsumernameNotBetween(String value1, String value2) {
            addCriterion("consumername not between", value1, value2, "consumername");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oauthspconsumer
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
     * This class corresponds to the database table oauthspconsumer
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