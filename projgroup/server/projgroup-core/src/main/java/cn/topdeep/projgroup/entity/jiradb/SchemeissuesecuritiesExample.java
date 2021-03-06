package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class SchemeissuesecuritiesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public SchemeissuesecuritiesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
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
     * This method corresponds to the database table schemeissuesecurities
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
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
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
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schemeissuesecurities
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table schemeissuesecurities
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

        public Criteria andSchemeIsNull() {
            addCriterion("SCHEME is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIsNotNull() {
            addCriterion("SCHEME is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeEqualTo(Long value) {
            addCriterion("SCHEME =", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeNotEqualTo(Long value) {
            addCriterion("SCHEME <>", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeGreaterThan(Long value) {
            addCriterion("SCHEME >", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeGreaterThanOrEqualTo(Long value) {
            addCriterion("SCHEME >=", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeLessThan(Long value) {
            addCriterion("SCHEME <", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeLessThanOrEqualTo(Long value) {
            addCriterion("SCHEME <=", value, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeIn(List<Long> values) {
            addCriterion("SCHEME in", values, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeNotIn(List<Long> values) {
            addCriterion("SCHEME not in", values, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeBetween(Long value1, Long value2) {
            addCriterion("SCHEME between", value1, value2, "scheme");
            return (Criteria) this;
        }

        public Criteria andSchemeNotBetween(Long value1, Long value2) {
            addCriterion("SCHEME not between", value1, value2, "scheme");
            return (Criteria) this;
        }

        public Criteria andSecurityIsNull() {
            addCriterion("SECURITY is null");
            return (Criteria) this;
        }

        public Criteria andSecurityIsNotNull() {
            addCriterion("SECURITY is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityEqualTo(Long value) {
            addCriterion("SECURITY =", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityNotEqualTo(Long value) {
            addCriterion("SECURITY <>", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityGreaterThan(Long value) {
            addCriterion("SECURITY >", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityGreaterThanOrEqualTo(Long value) {
            addCriterion("SECURITY >=", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityLessThan(Long value) {
            addCriterion("SECURITY <", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityLessThanOrEqualTo(Long value) {
            addCriterion("SECURITY <=", value, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityIn(List<Long> values) {
            addCriterion("SECURITY in", values, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityNotIn(List<Long> values) {
            addCriterion("SECURITY not in", values, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityBetween(Long value1, Long value2) {
            addCriterion("SECURITY between", value1, value2, "security");
            return (Criteria) this;
        }

        public Criteria andSecurityNotBetween(Long value1, Long value2) {
            addCriterion("SECURITY not between", value1, value2, "security");
            return (Criteria) this;
        }

        public Criteria andSecTypeIsNull() {
            addCriterion("sec_type is null");
            return (Criteria) this;
        }

        public Criteria andSecTypeIsNotNull() {
            addCriterion("sec_type is not null");
            return (Criteria) this;
        }

        public Criteria andSecTypeEqualTo(String value) {
            addCriterion("sec_type =", value, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeNotEqualTo(String value) {
            addCriterion("sec_type <>", value, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeGreaterThan(String value) {
            addCriterion("sec_type >", value, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sec_type >=", value, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeLessThan(String value) {
            addCriterion("sec_type <", value, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeLessThanOrEqualTo(String value) {
            addCriterion("sec_type <=", value, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeLike(String value) {
            addCriterion("sec_type like", value, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeNotLike(String value) {
            addCriterion("sec_type not like", value, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeIn(List<String> values) {
            addCriterion("sec_type in", values, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeNotIn(List<String> values) {
            addCriterion("sec_type not in", values, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeBetween(String value1, String value2) {
            addCriterion("sec_type between", value1, value2, "secType");
            return (Criteria) this;
        }

        public Criteria andSecTypeNotBetween(String value1, String value2) {
            addCriterion("sec_type not between", value1, value2, "secType");
            return (Criteria) this;
        }

        public Criteria andSecParameterIsNull() {
            addCriterion("sec_parameter is null");
            return (Criteria) this;
        }

        public Criteria andSecParameterIsNotNull() {
            addCriterion("sec_parameter is not null");
            return (Criteria) this;
        }

        public Criteria andSecParameterEqualTo(String value) {
            addCriterion("sec_parameter =", value, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterNotEqualTo(String value) {
            addCriterion("sec_parameter <>", value, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterGreaterThan(String value) {
            addCriterion("sec_parameter >", value, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterGreaterThanOrEqualTo(String value) {
            addCriterion("sec_parameter >=", value, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterLessThan(String value) {
            addCriterion("sec_parameter <", value, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterLessThanOrEqualTo(String value) {
            addCriterion("sec_parameter <=", value, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterLike(String value) {
            addCriterion("sec_parameter like", value, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterNotLike(String value) {
            addCriterion("sec_parameter not like", value, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterIn(List<String> values) {
            addCriterion("sec_parameter in", values, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterNotIn(List<String> values) {
            addCriterion("sec_parameter not in", values, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterBetween(String value1, String value2) {
            addCriterion("sec_parameter between", value1, value2, "secParameter");
            return (Criteria) this;
        }

        public Criteria andSecParameterNotBetween(String value1, String value2) {
            addCriterion("sec_parameter not between", value1, value2, "secParameter");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table schemeissuesecurities
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
     * This class corresponds to the database table schemeissuesecurities
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