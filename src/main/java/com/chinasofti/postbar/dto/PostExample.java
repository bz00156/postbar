package com.chinasofti.postbar.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostExample() {
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

        public Criteria andPostTitleIsNull() {
            addCriterion("postTitle is null");
            return (Criteria) this;
        }

        public Criteria andPostTitleIsNotNull() {
            addCriterion("postTitle is not null");
            return (Criteria) this;
        }

        public Criteria andPostTitleEqualTo(String value) {
            addCriterion("postTitle =", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotEqualTo(String value) {
            addCriterion("postTitle <>", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThan(String value) {
            addCriterion("postTitle >", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("postTitle >=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThan(String value) {
            addCriterion("postTitle <", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLessThanOrEqualTo(String value) {
            addCriterion("postTitle <=", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleLike(String value) {
            addCriterion("postTitle like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotLike(String value) {
            addCriterion("postTitle not like", value, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleIn(List<String> values) {
            addCriterion("postTitle in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotIn(List<String> values) {
            addCriterion("postTitle not in", values, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleBetween(String value1, String value2) {
            addCriterion("postTitle between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostTitleNotBetween(String value1, String value2) {
            addCriterion("postTitle not between", value1, value2, "postTitle");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsIsNull() {
            addCriterion("postPageviews is null");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsIsNotNull() {
            addCriterion("postPageviews is not null");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsEqualTo(Integer value) {
            addCriterion("postPageviews =", value, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsNotEqualTo(Integer value) {
            addCriterion("postPageviews <>", value, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsGreaterThan(Integer value) {
            addCriterion("postPageviews >", value, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("postPageviews >=", value, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsLessThan(Integer value) {
            addCriterion("postPageviews <", value, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsLessThanOrEqualTo(Integer value) {
            addCriterion("postPageviews <=", value, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsIn(List<Integer> values) {
            addCriterion("postPageviews in", values, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsNotIn(List<Integer> values) {
            addCriterion("postPageviews not in", values, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsBetween(Integer value1, Integer value2) {
            addCriterion("postPageviews between", value1, value2, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostPageviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("postPageviews not between", value1, value2, "postPageviews");
            return (Criteria) this;
        }

        public Criteria andPostAudioIsNull() {
            addCriterion("postAudio is null");
            return (Criteria) this;
        }

        public Criteria andPostAudioIsNotNull() {
            addCriterion("postAudio is not null");
            return (Criteria) this;
        }

        public Criteria andPostAudioEqualTo(String value) {
            addCriterion("postAudio =", value, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioNotEqualTo(String value) {
            addCriterion("postAudio <>", value, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioGreaterThan(String value) {
            addCriterion("postAudio >", value, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioGreaterThanOrEqualTo(String value) {
            addCriterion("postAudio >=", value, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioLessThan(String value) {
            addCriterion("postAudio <", value, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioLessThanOrEqualTo(String value) {
            addCriterion("postAudio <=", value, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioLike(String value) {
            addCriterion("postAudio like", value, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioNotLike(String value) {
            addCriterion("postAudio not like", value, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioIn(List<String> values) {
            addCriterion("postAudio in", values, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioNotIn(List<String> values) {
            addCriterion("postAudio not in", values, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioBetween(String value1, String value2) {
            addCriterion("postAudio between", value1, value2, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostAudioNotBetween(String value1, String value2) {
            addCriterion("postAudio not between", value1, value2, "postAudio");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNull() {
            addCriterion("postTime is null");
            return (Criteria) this;
        }

        public Criteria andPostTimeIsNotNull() {
            addCriterion("postTime is not null");
            return (Criteria) this;
        }

        public Criteria andPostTimeEqualTo(Date value) {
            addCriterion("postTime =", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotEqualTo(Date value) {
            addCriterion("postTime <>", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThan(Date value) {
            addCriterion("postTime >", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("postTime >=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThan(Date value) {
            addCriterion("postTime <", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeLessThanOrEqualTo(Date value) {
            addCriterion("postTime <=", value, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeIn(List<Date> values) {
            addCriterion("postTime in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotIn(List<Date> values) {
            addCriterion("postTime not in", values, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeBetween(Date value1, Date value2) {
            addCriterion("postTime between", value1, value2, "postTime");
            return (Criteria) this;
        }

        public Criteria andPostTimeNotBetween(Date value1, Date value2) {
            addCriterion("postTime not between", value1, value2, "postTime");
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