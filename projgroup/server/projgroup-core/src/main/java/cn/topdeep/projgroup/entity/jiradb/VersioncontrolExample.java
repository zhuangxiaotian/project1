package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class VersioncontrolExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public VersioncontrolExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
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
     * This method corresponds to the database table versioncontrol
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
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
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
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table versioncontrol
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table versioncontrol
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

        public Criteria andVcsnameIsNull() {
            addCriterion("vcsname is null");
            return (Criteria) this;
        }

        public Criteria andVcsnameIsNotNull() {
            addCriterion("vcsname is not null");
            return (Criteria) this;
        }

        public Criteria andVcsnameEqualTo(String value) {
            addCriterion("vcsname =", value, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameNotEqualTo(String value) {
            addCriterion("vcsname <>", value, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameGreaterThan(String value) {
            addCriterion("vcsname >", value, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameGreaterThanOrEqualTo(String value) {
            addCriterion("vcsname >=", value, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameLessThan(String value) {
            addCriterion("vcsname <", value, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameLessThanOrEqualTo(String value) {
            addCriterion("vcsname <=", value, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameLike(String value) {
            addCriterion("vcsname like", value, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameNotLike(String value) {
            addCriterion("vcsname not like", value, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameIn(List<String> values) {
            addCriterion("vcsname in", values, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameNotIn(List<String> values) {
            addCriterion("vcsname not in", values, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameBetween(String value1, String value2) {
            addCriterion("vcsname between", value1, value2, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsnameNotBetween(String value1, String value2) {
            addCriterion("vcsname not between", value1, value2, "vcsname");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionIsNull() {
            addCriterion("vcsdescription is null");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionIsNotNull() {
            addCriterion("vcsdescription is not null");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionEqualTo(String value) {
            addCriterion("vcsdescription =", value, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionNotEqualTo(String value) {
            addCriterion("vcsdescription <>", value, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionGreaterThan(String value) {
            addCriterion("vcsdescription >", value, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("vcsdescription >=", value, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionLessThan(String value) {
            addCriterion("vcsdescription <", value, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionLessThanOrEqualTo(String value) {
            addCriterion("vcsdescription <=", value, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionLike(String value) {
            addCriterion("vcsdescription like", value, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionNotLike(String value) {
            addCriterion("vcsdescription not like", value, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionIn(List<String> values) {
            addCriterion("vcsdescription in", values, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionNotIn(List<String> values) {
            addCriterion("vcsdescription not in", values, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionBetween(String value1, String value2) {
            addCriterion("vcsdescription between", value1, value2, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcsdescriptionNotBetween(String value1, String value2) {
            addCriterion("vcsdescription not between", value1, value2, "vcsdescription");
            return (Criteria) this;
        }

        public Criteria andVcstypeIsNull() {
            addCriterion("vcstype is null");
            return (Criteria) this;
        }

        public Criteria andVcstypeIsNotNull() {
            addCriterion("vcstype is not null");
            return (Criteria) this;
        }

        public Criteria andVcstypeEqualTo(String value) {
            addCriterion("vcstype =", value, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeNotEqualTo(String value) {
            addCriterion("vcstype <>", value, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeGreaterThan(String value) {
            addCriterion("vcstype >", value, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeGreaterThanOrEqualTo(String value) {
            addCriterion("vcstype >=", value, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeLessThan(String value) {
            addCriterion("vcstype <", value, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeLessThanOrEqualTo(String value) {
            addCriterion("vcstype <=", value, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeLike(String value) {
            addCriterion("vcstype like", value, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeNotLike(String value) {
            addCriterion("vcstype not like", value, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeIn(List<String> values) {
            addCriterion("vcstype in", values, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeNotIn(List<String> values) {
            addCriterion("vcstype not in", values, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeBetween(String value1, String value2) {
            addCriterion("vcstype between", value1, value2, "vcstype");
            return (Criteria) this;
        }

        public Criteria andVcstypeNotBetween(String value1, String value2) {
            addCriterion("vcstype not between", value1, value2, "vcstype");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table versioncontrol
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
     * This class corresponds to the database table versioncontrol
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