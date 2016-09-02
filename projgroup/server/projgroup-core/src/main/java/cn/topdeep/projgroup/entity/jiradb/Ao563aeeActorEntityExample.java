package cn.topdeep.projgroup.entity.jiradb;

import common.entity.Page;
import java.util.ArrayList;
import java.util.List;

public class Ao563aeeActorEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public Ao563aeeActorEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
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
     * This method corresponds to the database table ao_563aee_actor_entity
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
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
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
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ao_563aee_actor_entity
     *
     * @mbggenerated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ao_563aee_actor_entity
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("FULL_NAME =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("FULL_NAME <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("FULL_NAME >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_NAME >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("FULL_NAME <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("FULL_NAME <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("FULL_NAME like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("FULL_NAME not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("FULL_NAME in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("FULL_NAME not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("FULL_NAME between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("FULL_NAME not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriIsNull() {
            addCriterion("PROFILE_PAGE_URI is null");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriIsNotNull() {
            addCriterion("PROFILE_PAGE_URI is not null");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriEqualTo(String value) {
            addCriterion("PROFILE_PAGE_URI =", value, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriNotEqualTo(String value) {
            addCriterion("PROFILE_PAGE_URI <>", value, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriGreaterThan(String value) {
            addCriterion("PROFILE_PAGE_URI >", value, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriGreaterThanOrEqualTo(String value) {
            addCriterion("PROFILE_PAGE_URI >=", value, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriLessThan(String value) {
            addCriterion("PROFILE_PAGE_URI <", value, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriLessThanOrEqualTo(String value) {
            addCriterion("PROFILE_PAGE_URI <=", value, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriLike(String value) {
            addCriterion("PROFILE_PAGE_URI like", value, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriNotLike(String value) {
            addCriterion("PROFILE_PAGE_URI not like", value, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriIn(List<String> values) {
            addCriterion("PROFILE_PAGE_URI in", values, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriNotIn(List<String> values) {
            addCriterion("PROFILE_PAGE_URI not in", values, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriBetween(String value1, String value2) {
            addCriterion("PROFILE_PAGE_URI between", value1, value2, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePageUriNotBetween(String value1, String value2) {
            addCriterion("PROFILE_PAGE_URI not between", value1, value2, "profilePageUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriIsNull() {
            addCriterion("PROFILE_PICTURE_URI is null");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriIsNotNull() {
            addCriterion("PROFILE_PICTURE_URI is not null");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriEqualTo(String value) {
            addCriterion("PROFILE_PICTURE_URI =", value, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriNotEqualTo(String value) {
            addCriterion("PROFILE_PICTURE_URI <>", value, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriGreaterThan(String value) {
            addCriterion("PROFILE_PICTURE_URI >", value, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriGreaterThanOrEqualTo(String value) {
            addCriterion("PROFILE_PICTURE_URI >=", value, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriLessThan(String value) {
            addCriterion("PROFILE_PICTURE_URI <", value, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriLessThanOrEqualTo(String value) {
            addCriterion("PROFILE_PICTURE_URI <=", value, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriLike(String value) {
            addCriterion("PROFILE_PICTURE_URI like", value, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriNotLike(String value) {
            addCriterion("PROFILE_PICTURE_URI not like", value, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriIn(List<String> values) {
            addCriterion("PROFILE_PICTURE_URI in", values, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriNotIn(List<String> values) {
            addCriterion("PROFILE_PICTURE_URI not in", values, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriBetween(String value1, String value2) {
            addCriterion("PROFILE_PICTURE_URI between", value1, value2, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andProfilePictureUriNotBetween(String value1, String value2) {
            addCriterion("PROFILE_PICTURE_URI not between", value1, value2, "profilePictureUri");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ao_563aee_actor_entity
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
     * This class corresponds to the database table ao_563aee_actor_entity
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