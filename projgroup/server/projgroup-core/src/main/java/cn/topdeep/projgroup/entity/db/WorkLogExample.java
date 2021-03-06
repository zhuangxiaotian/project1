package cn.topdeep.projgroup.entity.db;

import common.entity.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public WorkLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
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
     * This method corresponds to the database table t_work_log
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
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
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
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_work_log
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_work_log
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

        public Criteria andWorkLogIdIsNull() {
            addCriterion("WORK_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdIsNotNull() {
            addCriterion("WORK_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdEqualTo(Integer value) {
            addCriterion("WORK_LOG_ID =", value, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdNotEqualTo(Integer value) {
            addCriterion("WORK_LOG_ID <>", value, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdGreaterThan(Integer value) {
            addCriterion("WORK_LOG_ID >", value, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_LOG_ID >=", value, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdLessThan(Integer value) {
            addCriterion("WORK_LOG_ID <", value, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_LOG_ID <=", value, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdIn(List<Integer> values) {
            addCriterion("WORK_LOG_ID in", values, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdNotIn(List<Integer> values) {
            addCriterion("WORK_LOG_ID not in", values, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdBetween(Integer value1, Integer value2) {
            addCriterion("WORK_LOG_ID between", value1, value2, "workLogId");
            return (Criteria) this;
        }

        public Criteria andWorkLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_LOG_ID not between", value1, value2, "workLogId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andWorkDayIsNull() {
            addCriterion("WORK_DAY is null");
            return (Criteria) this;
        }

        public Criteria andWorkDayIsNotNull() {
            addCriterion("WORK_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDayEqualTo(Date value) {
            addCriterion("WORK_DAY =", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotEqualTo(Date value) {
            addCriterion("WORK_DAY <>", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayGreaterThan(Date value) {
            addCriterion("WORK_DAY >", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayGreaterThanOrEqualTo(Date value) {
            addCriterion("WORK_DAY >=", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayLessThan(Date value) {
            addCriterion("WORK_DAY <", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayLessThanOrEqualTo(Date value) {
            addCriterion("WORK_DAY <=", value, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayIn(List<Date> values) {
            addCriterion("WORK_DAY in", values, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotIn(List<Date> values) {
            addCriterion("WORK_DAY not in", values, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayBetween(Date value1, Date value2) {
            addCriterion("WORK_DAY between", value1, value2, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkDayNotBetween(Date value1, Date value2) {
            addCriterion("WORK_DAY not between", value1, value2, "workDay");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdIsNull() {
            addCriterion("WORK_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdIsNotNull() {
            addCriterion("WORK_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdEqualTo(Integer value) {
            addCriterion("WORK_USER_ID =", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdNotEqualTo(Integer value) {
            addCriterion("WORK_USER_ID <>", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdGreaterThan(Integer value) {
            addCriterion("WORK_USER_ID >", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_USER_ID >=", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdLessThan(Integer value) {
            addCriterion("WORK_USER_ID <", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_USER_ID <=", value, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdIn(List<Integer> values) {
            addCriterion("WORK_USER_ID in", values, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdNotIn(List<Integer> values) {
            addCriterion("WORK_USER_ID not in", values, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdBetween(Integer value1, Integer value2) {
            addCriterion("WORK_USER_ID between", value1, value2, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_USER_ID not between", value1, value2, "workUserId");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreIsNull() {
            addCriterion("WORK_EVALUATION_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreIsNotNull() {
            addCriterion("WORK_EVALUATION_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreEqualTo(Integer value) {
            addCriterion("WORK_EVALUATION_SCORE =", value, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreNotEqualTo(Integer value) {
            addCriterion("WORK_EVALUATION_SCORE <>", value, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreGreaterThan(Integer value) {
            addCriterion("WORK_EVALUATION_SCORE >", value, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORK_EVALUATION_SCORE >=", value, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreLessThan(Integer value) {
            addCriterion("WORK_EVALUATION_SCORE <", value, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreLessThanOrEqualTo(Integer value) {
            addCriterion("WORK_EVALUATION_SCORE <=", value, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreIn(List<Integer> values) {
            addCriterion("WORK_EVALUATION_SCORE in", values, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreNotIn(List<Integer> values) {
            addCriterion("WORK_EVALUATION_SCORE not in", values, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreBetween(Integer value1, Integer value2) {
            addCriterion("WORK_EVALUATION_SCORE between", value1, value2, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("WORK_EVALUATION_SCORE not between", value1, value2, "workEvaluationScore");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentIsNull() {
            addCriterion("WORK_EVALUATION_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentIsNotNull() {
            addCriterion("WORK_EVALUATION_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentEqualTo(String value) {
            addCriterion("WORK_EVALUATION_CONTENT =", value, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentNotEqualTo(String value) {
            addCriterion("WORK_EVALUATION_CONTENT <>", value, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentGreaterThan(String value) {
            addCriterion("WORK_EVALUATION_CONTENT >", value, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_EVALUATION_CONTENT >=", value, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentLessThan(String value) {
            addCriterion("WORK_EVALUATION_CONTENT <", value, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentLessThanOrEqualTo(String value) {
            addCriterion("WORK_EVALUATION_CONTENT <=", value, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentLike(String value) {
            addCriterion("WORK_EVALUATION_CONTENT like", value, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentNotLike(String value) {
            addCriterion("WORK_EVALUATION_CONTENT not like", value, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentIn(List<String> values) {
            addCriterion("WORK_EVALUATION_CONTENT in", values, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentNotIn(List<String> values) {
            addCriterion("WORK_EVALUATION_CONTENT not in", values, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentBetween(String value1, String value2) {
            addCriterion("WORK_EVALUATION_CONTENT between", value1, value2, "workEvaluationContent");
            return (Criteria) this;
        }

        public Criteria andWorkEvaluationContentNotBetween(String value1, String value2) {
            addCriterion("WORK_EVALUATION_CONTENT not between", value1, value2, "workEvaluationContent");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_work_log
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
     * This class corresponds to the database table t_work_log
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