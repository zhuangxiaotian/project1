package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class ProjectroleactorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public ProjectroleactorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
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
     * This method corresponds to the database table projectroleactor
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
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
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
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectroleactor
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table projectroleactor
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

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidIsNull() {
            addCriterion("PROJECTROLEID is null");
            return (Criteria) this;
        }

        public Criteria andProjectroleidIsNotNull() {
            addCriterion("PROJECTROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectroleidEqualTo(Long value) {
            addCriterion("PROJECTROLEID =", value, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidNotEqualTo(Long value) {
            addCriterion("PROJECTROLEID <>", value, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidGreaterThan(Long value) {
            addCriterion("PROJECTROLEID >", value, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidGreaterThanOrEqualTo(Long value) {
            addCriterion("PROJECTROLEID >=", value, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidLessThan(Long value) {
            addCriterion("PROJECTROLEID <", value, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidLessThanOrEqualTo(Long value) {
            addCriterion("PROJECTROLEID <=", value, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidIn(List<Long> values) {
            addCriterion("PROJECTROLEID in", values, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidNotIn(List<Long> values) {
            addCriterion("PROJECTROLEID not in", values, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidBetween(Long value1, Long value2) {
            addCriterion("PROJECTROLEID between", value1, value2, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andProjectroleidNotBetween(Long value1, Long value2) {
            addCriterion("PROJECTROLEID not between", value1, value2, "projectroleid");
            return (Criteria) this;
        }

        public Criteria andRoletypeIsNull() {
            addCriterion("ROLETYPE is null");
            return (Criteria) this;
        }

        public Criteria andRoletypeIsNotNull() {
            addCriterion("ROLETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRoletypeEqualTo(String value) {
            addCriterion("ROLETYPE =", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotEqualTo(String value) {
            addCriterion("ROLETYPE <>", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeGreaterThan(String value) {
            addCriterion("ROLETYPE >", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLETYPE >=", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLessThan(String value) {
            addCriterion("ROLETYPE <", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLessThanOrEqualTo(String value) {
            addCriterion("ROLETYPE <=", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeLike(String value) {
            addCriterion("ROLETYPE like", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotLike(String value) {
            addCriterion("ROLETYPE not like", value, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeIn(List<String> values) {
            addCriterion("ROLETYPE in", values, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotIn(List<String> values) {
            addCriterion("ROLETYPE not in", values, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeBetween(String value1, String value2) {
            addCriterion("ROLETYPE between", value1, value2, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeNotBetween(String value1, String value2) {
            addCriterion("ROLETYPE not between", value1, value2, "roletype");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterIsNull() {
            addCriterion("ROLETYPEPARAMETER is null");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterIsNotNull() {
            addCriterion("ROLETYPEPARAMETER is not null");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterEqualTo(String value) {
            addCriterion("ROLETYPEPARAMETER =", value, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterNotEqualTo(String value) {
            addCriterion("ROLETYPEPARAMETER <>", value, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterGreaterThan(String value) {
            addCriterion("ROLETYPEPARAMETER >", value, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterGreaterThanOrEqualTo(String value) {
            addCriterion("ROLETYPEPARAMETER >=", value, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterLessThan(String value) {
            addCriterion("ROLETYPEPARAMETER <", value, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterLessThanOrEqualTo(String value) {
            addCriterion("ROLETYPEPARAMETER <=", value, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterLike(String value) {
            addCriterion("ROLETYPEPARAMETER like", value, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterNotLike(String value) {
            addCriterion("ROLETYPEPARAMETER not like", value, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterIn(List<String> values) {
            addCriterion("ROLETYPEPARAMETER in", values, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterNotIn(List<String> values) {
            addCriterion("ROLETYPEPARAMETER not in", values, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterBetween(String value1, String value2) {
            addCriterion("ROLETYPEPARAMETER between", value1, value2, "roletypeparameter");
            return (Criteria) this;
        }

        public Criteria andRoletypeparameterNotBetween(String value1, String value2) {
            addCriterion("ROLETYPEPARAMETER not between", value1, value2, "roletypeparameter");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table projectroleactor
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
     * This class corresponds to the database table projectroleactor
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