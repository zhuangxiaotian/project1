package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class SharepermissionsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public SharepermissionsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
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
     * This method corresponds to the database table sharepermissions
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
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
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
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sharepermissions
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sharepermissions
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

        public Criteria andEntityidIsNull() {
            addCriterion("entityid is null");
            return (Criteria) this;
        }

        public Criteria andEntityidIsNotNull() {
            addCriterion("entityid is not null");
            return (Criteria) this;
        }

        public Criteria andEntityidEqualTo(Long value) {
            addCriterion("entityid =", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotEqualTo(Long value) {
            addCriterion("entityid <>", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidGreaterThan(Long value) {
            addCriterion("entityid >", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidGreaterThanOrEqualTo(Long value) {
            addCriterion("entityid >=", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidLessThan(Long value) {
            addCriterion("entityid <", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidLessThanOrEqualTo(Long value) {
            addCriterion("entityid <=", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidIn(List<Long> values) {
            addCriterion("entityid in", values, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotIn(List<Long> values) {
            addCriterion("entityid not in", values, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidBetween(Long value1, Long value2) {
            addCriterion("entityid between", value1, value2, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotBetween(Long value1, Long value2) {
            addCriterion("entityid not between", value1, value2, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntitytypeIsNull() {
            addCriterion("entitytype is null");
            return (Criteria) this;
        }

        public Criteria andEntitytypeIsNotNull() {
            addCriterion("entitytype is not null");
            return (Criteria) this;
        }

        public Criteria andEntitytypeEqualTo(String value) {
            addCriterion("entitytype =", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeNotEqualTo(String value) {
            addCriterion("entitytype <>", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeGreaterThan(String value) {
            addCriterion("entitytype >", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeGreaterThanOrEqualTo(String value) {
            addCriterion("entitytype >=", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeLessThan(String value) {
            addCriterion("entitytype <", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeLessThanOrEqualTo(String value) {
            addCriterion("entitytype <=", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeLike(String value) {
            addCriterion("entitytype like", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeNotLike(String value) {
            addCriterion("entitytype not like", value, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeIn(List<String> values) {
            addCriterion("entitytype in", values, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeNotIn(List<String> values) {
            addCriterion("entitytype not in", values, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeBetween(String value1, String value2) {
            addCriterion("entitytype between", value1, value2, "entitytype");
            return (Criteria) this;
        }

        public Criteria andEntitytypeNotBetween(String value1, String value2) {
            addCriterion("entitytype not between", value1, value2, "entitytype");
            return (Criteria) this;
        }

        public Criteria andSharetypeIsNull() {
            addCriterion("sharetype is null");
            return (Criteria) this;
        }

        public Criteria andSharetypeIsNotNull() {
            addCriterion("sharetype is not null");
            return (Criteria) this;
        }

        public Criteria andSharetypeEqualTo(String value) {
            addCriterion("sharetype =", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeNotEqualTo(String value) {
            addCriterion("sharetype <>", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeGreaterThan(String value) {
            addCriterion("sharetype >", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeGreaterThanOrEqualTo(String value) {
            addCriterion("sharetype >=", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeLessThan(String value) {
            addCriterion("sharetype <", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeLessThanOrEqualTo(String value) {
            addCriterion("sharetype <=", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeLike(String value) {
            addCriterion("sharetype like", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeNotLike(String value) {
            addCriterion("sharetype not like", value, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeIn(List<String> values) {
            addCriterion("sharetype in", values, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeNotIn(List<String> values) {
            addCriterion("sharetype not in", values, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeBetween(String value1, String value2) {
            addCriterion("sharetype between", value1, value2, "sharetype");
            return (Criteria) this;
        }

        public Criteria andSharetypeNotBetween(String value1, String value2) {
            addCriterion("sharetype not between", value1, value2, "sharetype");
            return (Criteria) this;
        }

        public Criteria andParam1IsNull() {
            addCriterion("PARAM1 is null");
            return (Criteria) this;
        }

        public Criteria andParam1IsNotNull() {
            addCriterion("PARAM1 is not null");
            return (Criteria) this;
        }

        public Criteria andParam1EqualTo(String value) {
            addCriterion("PARAM1 =", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotEqualTo(String value) {
            addCriterion("PARAM1 <>", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThan(String value) {
            addCriterion("PARAM1 >", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM1 >=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThan(String value) {
            addCriterion("PARAM1 <", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1LessThanOrEqualTo(String value) {
            addCriterion("PARAM1 <=", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Like(String value) {
            addCriterion("PARAM1 like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotLike(String value) {
            addCriterion("PARAM1 not like", value, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1In(List<String> values) {
            addCriterion("PARAM1 in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotIn(List<String> values) {
            addCriterion("PARAM1 not in", values, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1Between(String value1, String value2) {
            addCriterion("PARAM1 between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam1NotBetween(String value1, String value2) {
            addCriterion("PARAM1 not between", value1, value2, "param1");
            return (Criteria) this;
        }

        public Criteria andParam2IsNull() {
            addCriterion("PARAM2 is null");
            return (Criteria) this;
        }

        public Criteria andParam2IsNotNull() {
            addCriterion("PARAM2 is not null");
            return (Criteria) this;
        }

        public Criteria andParam2EqualTo(String value) {
            addCriterion("PARAM2 =", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotEqualTo(String value) {
            addCriterion("PARAM2 <>", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThan(String value) {
            addCriterion("PARAM2 >", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2GreaterThanOrEqualTo(String value) {
            addCriterion("PARAM2 >=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThan(String value) {
            addCriterion("PARAM2 <", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2LessThanOrEqualTo(String value) {
            addCriterion("PARAM2 <=", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Like(String value) {
            addCriterion("PARAM2 like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotLike(String value) {
            addCriterion("PARAM2 not like", value, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2In(List<String> values) {
            addCriterion("PARAM2 in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotIn(List<String> values) {
            addCriterion("PARAM2 not in", values, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2Between(String value1, String value2) {
            addCriterion("PARAM2 between", value1, value2, "param2");
            return (Criteria) this;
        }

        public Criteria andParam2NotBetween(String value1, String value2) {
            addCriterion("PARAM2 not between", value1, value2, "param2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sharepermissions
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
     * This class corresponds to the database table sharepermissions
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