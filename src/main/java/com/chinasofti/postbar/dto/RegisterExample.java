package com.chinasofti.postbar.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegisterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andRegUUIDIsNull() {
            addCriterion("regUUID is null");
            return (Criteria) this;
        }

        public Criteria andRegUUIDIsNotNull() {
            addCriterion("regUUID is not null");
            return (Criteria) this;
        }

        public Criteria andRegUUIDEqualTo(String value) {
            addCriterion("regUUID =", value, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDNotEqualTo(String value) {
            addCriterion("regUUID <>", value, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDGreaterThan(String value) {
            addCriterion("regUUID >", value, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDGreaterThanOrEqualTo(String value) {
            addCriterion("regUUID >=", value, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDLessThan(String value) {
            addCriterion("regUUID <", value, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDLessThanOrEqualTo(String value) {
            addCriterion("regUUID <=", value, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDLike(String value) {
            addCriterion("regUUID like", value, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDNotLike(String value) {
            addCriterion("regUUID not like", value, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDIn(List<String> values) {
            addCriterion("regUUID in", values, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDNotIn(List<String> values) {
            addCriterion("regUUID not in", values, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDBetween(String value1, String value2) {
            addCriterion("regUUID between", value1, value2, "regUUID");
            return (Criteria) this;
        }

        public Criteria andRegUUIDNotBetween(String value1, String value2) {
            addCriterion("regUUID not between", value1, value2, "regUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDIsNull() {
            addCriterion("userUUID is null");
            return (Criteria) this;
        }

        public Criteria andUserUUIDIsNotNull() {
            addCriterion("userUUID is not null");
            return (Criteria) this;
        }

        public Criteria andUserUUIDEqualTo(String value) {
            addCriterion("userUUID =", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDNotEqualTo(String value) {
            addCriterion("userUUID <>", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDGreaterThan(String value) {
            addCriterion("userUUID >", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDGreaterThanOrEqualTo(String value) {
            addCriterion("userUUID >=", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDLessThan(String value) {
            addCriterion("userUUID <", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDLessThanOrEqualTo(String value) {
            addCriterion("userUUID <=", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDLike(String value) {
            addCriterion("userUUID like", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDNotLike(String value) {
            addCriterion("userUUID not like", value, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDIn(List<String> values) {
            addCriterion("userUUID in", values, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDNotIn(List<String> values) {
            addCriterion("userUUID not in", values, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDBetween(String value1, String value2) {
            addCriterion("userUUID between", value1, value2, "userUUID");
            return (Criteria) this;
        }

        public Criteria andUserUUIDNotBetween(String value1, String value2) {
            addCriterion("userUUID not between", value1, value2, "userUUID");
            return (Criteria) this;
        }

        public Criteria andRegSexIsNull() {
            addCriterion("regSex is null");
            return (Criteria) this;
        }

        public Criteria andRegSexIsNotNull() {
            addCriterion("regSex is not null");
            return (Criteria) this;
        }

        public Criteria andRegSexEqualTo(String value) {
            addCriterion("regSex =", value, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexNotEqualTo(String value) {
            addCriterion("regSex <>", value, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexGreaterThan(String value) {
            addCriterion("regSex >", value, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexGreaterThanOrEqualTo(String value) {
            addCriterion("regSex >=", value, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexLessThan(String value) {
            addCriterion("regSex <", value, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexLessThanOrEqualTo(String value) {
            addCriterion("regSex <=", value, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexLike(String value) {
            addCriterion("regSex like", value, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexNotLike(String value) {
            addCriterion("regSex not like", value, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexIn(List<String> values) {
            addCriterion("regSex in", values, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexNotIn(List<String> values) {
            addCriterion("regSex not in", values, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexBetween(String value1, String value2) {
            addCriterion("regSex between", value1, value2, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegSexNotBetween(String value1, String value2) {
            addCriterion("regSex not between", value1, value2, "regSex");
            return (Criteria) this;
        }

        public Criteria andRegAgeIsNull() {
            addCriterion("regAge is null");
            return (Criteria) this;
        }

        public Criteria andRegAgeIsNotNull() {
            addCriterion("regAge is not null");
            return (Criteria) this;
        }

        public Criteria andRegAgeEqualTo(Integer value) {
            addCriterion("regAge =", value, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeNotEqualTo(Integer value) {
            addCriterion("regAge <>", value, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeGreaterThan(Integer value) {
            addCriterion("regAge >", value, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("regAge >=", value, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeLessThan(Integer value) {
            addCriterion("regAge <", value, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeLessThanOrEqualTo(Integer value) {
            addCriterion("regAge <=", value, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeIn(List<Integer> values) {
            addCriterion("regAge in", values, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeNotIn(List<Integer> values) {
            addCriterion("regAge not in", values, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeBetween(Integer value1, Integer value2) {
            addCriterion("regAge between", value1, value2, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("regAge not between", value1, value2, "regAge");
            return (Criteria) this;
        }

        public Criteria andRegEmialIsNull() {
            addCriterion("regEmial is null");
            return (Criteria) this;
        }

        public Criteria andRegEmialIsNotNull() {
            addCriterion("regEmial is not null");
            return (Criteria) this;
        }

        public Criteria andRegEmialEqualTo(String value) {
            addCriterion("regEmial =", value, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialNotEqualTo(String value) {
            addCriterion("regEmial <>", value, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialGreaterThan(String value) {
            addCriterion("regEmial >", value, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialGreaterThanOrEqualTo(String value) {
            addCriterion("regEmial >=", value, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialLessThan(String value) {
            addCriterion("regEmial <", value, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialLessThanOrEqualTo(String value) {
            addCriterion("regEmial <=", value, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialLike(String value) {
            addCriterion("regEmial like", value, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialNotLike(String value) {
            addCriterion("regEmial not like", value, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialIn(List<String> values) {
            addCriterion("regEmial in", values, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialNotIn(List<String> values) {
            addCriterion("regEmial not in", values, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialBetween(String value1, String value2) {
            addCriterion("regEmial between", value1, value2, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegEmialNotBetween(String value1, String value2) {
            addCriterion("regEmial not between", value1, value2, "regEmial");
            return (Criteria) this;
        }

        public Criteria andRegPhotoIsNull() {
            addCriterion("regPhoto is null");
            return (Criteria) this;
        }

        public Criteria andRegPhotoIsNotNull() {
            addCriterion("regPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andRegPhotoEqualTo(String value) {
            addCriterion("regPhoto =", value, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoNotEqualTo(String value) {
            addCriterion("regPhoto <>", value, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoGreaterThan(String value) {
            addCriterion("regPhoto >", value, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("regPhoto >=", value, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoLessThan(String value) {
            addCriterion("regPhoto <", value, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoLessThanOrEqualTo(String value) {
            addCriterion("regPhoto <=", value, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoLike(String value) {
            addCriterion("regPhoto like", value, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoNotLike(String value) {
            addCriterion("regPhoto not like", value, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoIn(List<String> values) {
            addCriterion("regPhoto in", values, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoNotIn(List<String> values) {
            addCriterion("regPhoto not in", values, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoBetween(String value1, String value2) {
            addCriterion("regPhoto between", value1, value2, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegPhotoNotBetween(String value1, String value2) {
            addCriterion("regPhoto not between", value1, value2, "regPhoto");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("regTime is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("regTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("regTime =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("regTime <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("regTime >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regTime >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("regTime <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("regTime <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("regTime in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("regTime not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("regTime between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("regTime not between", value1, value2, "regTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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