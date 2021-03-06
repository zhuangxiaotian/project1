package cn.topdeep.projgroup.entity.db;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class TestProcedureExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public TestProcedureExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
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
     * This method corresponds to the database table t_test_procedure
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
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
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
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_test_procedure
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_test_procedure
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

        public Criteria andTestProcedureIdIsNull() {
            addCriterion("TEST_PROCEDURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdIsNotNull() {
            addCriterion("TEST_PROCEDURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdEqualTo(Integer value) {
            addCriterion("TEST_PROCEDURE_ID =", value, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdNotEqualTo(Integer value) {
            addCriterion("TEST_PROCEDURE_ID <>", value, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdGreaterThan(Integer value) {
            addCriterion("TEST_PROCEDURE_ID >", value, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEST_PROCEDURE_ID >=", value, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdLessThan(Integer value) {
            addCriterion("TEST_PROCEDURE_ID <", value, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEST_PROCEDURE_ID <=", value, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdIn(List<Integer> values) {
            addCriterion("TEST_PROCEDURE_ID in", values, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdNotIn(List<Integer> values) {
            addCriterion("TEST_PROCEDURE_ID not in", values, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdBetween(Integer value1, Integer value2) {
            addCriterion("TEST_PROCEDURE_ID between", value1, value2, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestProcedureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEST_PROCEDURE_ID not between", value1, value2, "testProcedureId");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNull() {
            addCriterion("BUILD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNotNull() {
            addCriterion("BUILD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuildIdEqualTo(Integer value) {
            addCriterion("BUILD_ID =", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotEqualTo(Integer value) {
            addCriterion("BUILD_ID <>", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThan(Integer value) {
            addCriterion("BUILD_ID >", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUILD_ID >=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThan(Integer value) {
            addCriterion("BUILD_ID <", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUILD_ID <=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdIn(List<Integer> values) {
            addCriterion("BUILD_ID in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotIn(List<Integer> values) {
            addCriterion("BUILD_ID not in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdBetween(Integer value1, Integer value2) {
            addCriterion("BUILD_ID between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUILD_ID not between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdIsNull() {
            addCriterion("FUNC_PROCEDURE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdIsNotNull() {
            addCriterion("FUNC_PROCEDURE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdEqualTo(Integer value) {
            addCriterion("FUNC_PROCEDURE_ID =", value, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdNotEqualTo(Integer value) {
            addCriterion("FUNC_PROCEDURE_ID <>", value, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdGreaterThan(Integer value) {
            addCriterion("FUNC_PROCEDURE_ID >", value, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUNC_PROCEDURE_ID >=", value, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdLessThan(Integer value) {
            addCriterion("FUNC_PROCEDURE_ID <", value, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdLessThanOrEqualTo(Integer value) {
            addCriterion("FUNC_PROCEDURE_ID <=", value, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdIn(List<Integer> values) {
            addCriterion("FUNC_PROCEDURE_ID in", values, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdNotIn(List<Integer> values) {
            addCriterion("FUNC_PROCEDURE_ID not in", values, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_PROCEDURE_ID between", value1, value2, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andFuncProcedureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FUNC_PROCEDURE_ID not between", value1, value2, "funcProcedureId");
            return (Criteria) this;
        }

        public Criteria andTestOrderIsNull() {
            addCriterion("TEST_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andTestOrderIsNotNull() {
            addCriterion("TEST_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andTestOrderEqualTo(Integer value) {
            addCriterion("TEST_ORDER =", value, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderNotEqualTo(Integer value) {
            addCriterion("TEST_ORDER <>", value, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderGreaterThan(Integer value) {
            addCriterion("TEST_ORDER >", value, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEST_ORDER >=", value, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderLessThan(Integer value) {
            addCriterion("TEST_ORDER <", value, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderLessThanOrEqualTo(Integer value) {
            addCriterion("TEST_ORDER <=", value, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderIn(List<Integer> values) {
            addCriterion("TEST_ORDER in", values, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderNotIn(List<Integer> values) {
            addCriterion("TEST_ORDER not in", values, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderBetween(Integer value1, Integer value2) {
            addCriterion("TEST_ORDER between", value1, value2, "testOrder");
            return (Criteria) this;
        }

        public Criteria andTestOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("TEST_ORDER not between", value1, value2, "testOrder");
            return (Criteria) this;
        }

        public Criteria andPub0IsNull() {
            addCriterion("PUB0 is null");
            return (Criteria) this;
        }

        public Criteria andPub0IsNotNull() {
            addCriterion("PUB0 is not null");
            return (Criteria) this;
        }

        public Criteria andPub0EqualTo(String value) {
            addCriterion("PUB0 =", value, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0NotEqualTo(String value) {
            addCriterion("PUB0 <>", value, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0GreaterThan(String value) {
            addCriterion("PUB0 >", value, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0GreaterThanOrEqualTo(String value) {
            addCriterion("PUB0 >=", value, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0LessThan(String value) {
            addCriterion("PUB0 <", value, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0LessThanOrEqualTo(String value) {
            addCriterion("PUB0 <=", value, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0Like(String value) {
            addCriterion("PUB0 like", value, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0NotLike(String value) {
            addCriterion("PUB0 not like", value, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0In(List<String> values) {
            addCriterion("PUB0 in", values, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0NotIn(List<String> values) {
            addCriterion("PUB0 not in", values, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0Between(String value1, String value2) {
            addCriterion("PUB0 between", value1, value2, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub0NotBetween(String value1, String value2) {
            addCriterion("PUB0 not between", value1, value2, "pub0");
            return (Criteria) this;
        }

        public Criteria andPub1IsNull() {
            addCriterion("PUB1 is null");
            return (Criteria) this;
        }

        public Criteria andPub1IsNotNull() {
            addCriterion("PUB1 is not null");
            return (Criteria) this;
        }

        public Criteria andPub1EqualTo(String value) {
            addCriterion("PUB1 =", value, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1NotEqualTo(String value) {
            addCriterion("PUB1 <>", value, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1GreaterThan(String value) {
            addCriterion("PUB1 >", value, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1GreaterThanOrEqualTo(String value) {
            addCriterion("PUB1 >=", value, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1LessThan(String value) {
            addCriterion("PUB1 <", value, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1LessThanOrEqualTo(String value) {
            addCriterion("PUB1 <=", value, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1Like(String value) {
            addCriterion("PUB1 like", value, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1NotLike(String value) {
            addCriterion("PUB1 not like", value, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1In(List<String> values) {
            addCriterion("PUB1 in", values, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1NotIn(List<String> values) {
            addCriterion("PUB1 not in", values, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1Between(String value1, String value2) {
            addCriterion("PUB1 between", value1, value2, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub1NotBetween(String value1, String value2) {
            addCriterion("PUB1 not between", value1, value2, "pub1");
            return (Criteria) this;
        }

        public Criteria andPub2IsNull() {
            addCriterion("PUB2 is null");
            return (Criteria) this;
        }

        public Criteria andPub2IsNotNull() {
            addCriterion("PUB2 is not null");
            return (Criteria) this;
        }

        public Criteria andPub2EqualTo(String value) {
            addCriterion("PUB2 =", value, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2NotEqualTo(String value) {
            addCriterion("PUB2 <>", value, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2GreaterThan(String value) {
            addCriterion("PUB2 >", value, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2GreaterThanOrEqualTo(String value) {
            addCriterion("PUB2 >=", value, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2LessThan(String value) {
            addCriterion("PUB2 <", value, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2LessThanOrEqualTo(String value) {
            addCriterion("PUB2 <=", value, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2Like(String value) {
            addCriterion("PUB2 like", value, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2NotLike(String value) {
            addCriterion("PUB2 not like", value, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2In(List<String> values) {
            addCriterion("PUB2 in", values, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2NotIn(List<String> values) {
            addCriterion("PUB2 not in", values, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2Between(String value1, String value2) {
            addCriterion("PUB2 between", value1, value2, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub2NotBetween(String value1, String value2) {
            addCriterion("PUB2 not between", value1, value2, "pub2");
            return (Criteria) this;
        }

        public Criteria andPub3IsNull() {
            addCriterion("PUB3 is null");
            return (Criteria) this;
        }

        public Criteria andPub3IsNotNull() {
            addCriterion("PUB3 is not null");
            return (Criteria) this;
        }

        public Criteria andPub3EqualTo(String value) {
            addCriterion("PUB3 =", value, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3NotEqualTo(String value) {
            addCriterion("PUB3 <>", value, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3GreaterThan(String value) {
            addCriterion("PUB3 >", value, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3GreaterThanOrEqualTo(String value) {
            addCriterion("PUB3 >=", value, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3LessThan(String value) {
            addCriterion("PUB3 <", value, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3LessThanOrEqualTo(String value) {
            addCriterion("PUB3 <=", value, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3Like(String value) {
            addCriterion("PUB3 like", value, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3NotLike(String value) {
            addCriterion("PUB3 not like", value, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3In(List<String> values) {
            addCriterion("PUB3 in", values, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3NotIn(List<String> values) {
            addCriterion("PUB3 not in", values, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3Between(String value1, String value2) {
            addCriterion("PUB3 between", value1, value2, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub3NotBetween(String value1, String value2) {
            addCriterion("PUB3 not between", value1, value2, "pub3");
            return (Criteria) this;
        }

        public Criteria andPub4IsNull() {
            addCriterion("PUB4 is null");
            return (Criteria) this;
        }

        public Criteria andPub4IsNotNull() {
            addCriterion("PUB4 is not null");
            return (Criteria) this;
        }

        public Criteria andPub4EqualTo(String value) {
            addCriterion("PUB4 =", value, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4NotEqualTo(String value) {
            addCriterion("PUB4 <>", value, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4GreaterThan(String value) {
            addCriterion("PUB4 >", value, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4GreaterThanOrEqualTo(String value) {
            addCriterion("PUB4 >=", value, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4LessThan(String value) {
            addCriterion("PUB4 <", value, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4LessThanOrEqualTo(String value) {
            addCriterion("PUB4 <=", value, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4Like(String value) {
            addCriterion("PUB4 like", value, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4NotLike(String value) {
            addCriterion("PUB4 not like", value, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4In(List<String> values) {
            addCriterion("PUB4 in", values, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4NotIn(List<String> values) {
            addCriterion("PUB4 not in", values, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4Between(String value1, String value2) {
            addCriterion("PUB4 between", value1, value2, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub4NotBetween(String value1, String value2) {
            addCriterion("PUB4 not between", value1, value2, "pub4");
            return (Criteria) this;
        }

        public Criteria andPub5IsNull() {
            addCriterion("PUB5 is null");
            return (Criteria) this;
        }

        public Criteria andPub5IsNotNull() {
            addCriterion("PUB5 is not null");
            return (Criteria) this;
        }

        public Criteria andPub5EqualTo(String value) {
            addCriterion("PUB5 =", value, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5NotEqualTo(String value) {
            addCriterion("PUB5 <>", value, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5GreaterThan(String value) {
            addCriterion("PUB5 >", value, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5GreaterThanOrEqualTo(String value) {
            addCriterion("PUB5 >=", value, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5LessThan(String value) {
            addCriterion("PUB5 <", value, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5LessThanOrEqualTo(String value) {
            addCriterion("PUB5 <=", value, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5Like(String value) {
            addCriterion("PUB5 like", value, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5NotLike(String value) {
            addCriterion("PUB5 not like", value, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5In(List<String> values) {
            addCriterion("PUB5 in", values, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5NotIn(List<String> values) {
            addCriterion("PUB5 not in", values, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5Between(String value1, String value2) {
            addCriterion("PUB5 between", value1, value2, "pub5");
            return (Criteria) this;
        }

        public Criteria andPub5NotBetween(String value1, String value2) {
            addCriterion("PUB5 not between", value1, value2, "pub5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_test_procedure
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
     * This class corresponds to the database table t_test_procedure
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