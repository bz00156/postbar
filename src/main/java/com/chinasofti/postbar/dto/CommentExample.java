package com.chinasofti.postbar.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCmUUIDIsNull() {
            addCriterion("cmUUID is null");
            return (Criteria) this;
        }

        public Criteria andCmUUIDIsNotNull() {
            addCriterion("cmUUID is not null");
            return (Criteria) this;
        }

        public Criteria andCmUUIDEqualTo(String value) {
            addCriterion("cmUUID =", value, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDNotEqualTo(String value) {
            addCriterion("cmUUID <>", value, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDGreaterThan(String value) {
            addCriterion("cmUUID >", value, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDGreaterThanOrEqualTo(String value) {
            addCriterion("cmUUID >=", value, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDLessThan(String value) {
            addCriterion("cmUUID <", value, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDLessThanOrEqualTo(String value) {
            addCriterion("cmUUID <=", value, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDLike(String value) {
            addCriterion("cmUUID like", value, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDNotLike(String value) {
            addCriterion("cmUUID not like", value, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDIn(List<String> values) {
            addCriterion("cmUUID in", values, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDNotIn(List<String> values) {
            addCriterion("cmUUID not in", values, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDBetween(String value1, String value2) {
            addCriterion("cmUUID between", value1, value2, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andCmUUIDNotBetween(String value1, String value2) {
            addCriterion("cmUUID not between", value1, value2, "cmUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDIsNull() {
            addCriterion("postUUID is null");
            return (Criteria) this;
        }

        public Criteria andPostUUIDIsNotNull() {
            addCriterion("postUUID is not null");
            return (Criteria) this;
        }

        public Criteria andPostUUIDEqualTo(String value) {
            addCriterion("postUUID =", value, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDNotEqualTo(String value) {
            addCriterion("postUUID <>", value, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDGreaterThan(String value) {
            addCriterion("postUUID >", value, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDGreaterThanOrEqualTo(String value) {
            addCriterion("postUUID >=", value, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDLessThan(String value) {
            addCriterion("postUUID <", value, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDLessThanOrEqualTo(String value) {
            addCriterion("postUUID <=", value, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDLike(String value) {
            addCriterion("postUUID like", value, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDNotLike(String value) {
            addCriterion("postUUID not like", value, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDIn(List<String> values) {
            addCriterion("postUUID in", values, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDNotIn(List<String> values) {
            addCriterion("postUUID not in", values, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDBetween(String value1, String value2) {
            addCriterion("postUUID between", value1, value2, "postUUID");
            return (Criteria) this;
        }

        public Criteria andPostUUIDNotBetween(String value1, String value2) {
            addCriterion("postUUID not between", value1, value2, "postUUID");
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

        public Criteria andCmAudioIsNull() {
            addCriterion("cmAudio is null");
            return (Criteria) this;
        }

        public Criteria andCmAudioIsNotNull() {
            addCriterion("cmAudio is not null");
            return (Criteria) this;
        }

        public Criteria andCmAudioEqualTo(String value) {
            addCriterion("cmAudio =", value, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioNotEqualTo(String value) {
            addCriterion("cmAudio <>", value, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioGreaterThan(String value) {
            addCriterion("cmAudio >", value, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioGreaterThanOrEqualTo(String value) {
            addCriterion("cmAudio >=", value, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioLessThan(String value) {
            addCriterion("cmAudio <", value, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioLessThanOrEqualTo(String value) {
            addCriterion("cmAudio <=", value, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioLike(String value) {
            addCriterion("cmAudio like", value, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioNotLike(String value) {
            addCriterion("cmAudio not like", value, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioIn(List<String> values) {
            addCriterion("cmAudio in", values, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioNotIn(List<String> values) {
            addCriterion("cmAudio not in", values, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioBetween(String value1, String value2) {
            addCriterion("cmAudio between", value1, value2, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmAudioNotBetween(String value1, String value2) {
            addCriterion("cmAudio not between", value1, value2, "cmAudio");
            return (Criteria) this;
        }

        public Criteria andCmTimeIsNull() {
            addCriterion("cmTime is null");
            return (Criteria) this;
        }

        public Criteria andCmTimeIsNotNull() {
            addCriterion("cmTime is not null");
            return (Criteria) this;
        }

        public Criteria andCmTimeEqualTo(Date value) {
            addCriterion("cmTime =", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotEqualTo(Date value) {
            addCriterion("cmTime <>", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeGreaterThan(Date value) {
            addCriterion("cmTime >", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cmTime >=", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeLessThan(Date value) {
            addCriterion("cmTime <", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeLessThanOrEqualTo(Date value) {
            addCriterion("cmTime <=", value, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeIn(List<Date> values) {
            addCriterion("cmTime in", values, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotIn(List<Date> values) {
            addCriterion("cmTime not in", values, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeBetween(Date value1, Date value2) {
            addCriterion("cmTime between", value1, value2, "cmTime");
            return (Criteria) this;
        }

        public Criteria andCmTimeNotBetween(Date value1, Date value2) {
            addCriterion("cmTime not between", value1, value2, "cmTime");
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