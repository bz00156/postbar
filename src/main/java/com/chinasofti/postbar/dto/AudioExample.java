package com.chinasofti.postbar.dto;

import java.util.ArrayList;
import java.util.List;

public class AudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AudioExample() {
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

        public Criteria andAuSetUUIDIsNull() {
            addCriterion("auSetUUID is null");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDIsNotNull() {
            addCriterion("auSetUUID is not null");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDEqualTo(String value) {
            addCriterion("auSetUUID =", value, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDNotEqualTo(String value) {
            addCriterion("auSetUUID <>", value, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDGreaterThan(String value) {
            addCriterion("auSetUUID >", value, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDGreaterThanOrEqualTo(String value) {
            addCriterion("auSetUUID >=", value, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDLessThan(String value) {
            addCriterion("auSetUUID <", value, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDLessThanOrEqualTo(String value) {
            addCriterion("auSetUUID <=", value, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDLike(String value) {
            addCriterion("auSetUUID like", value, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDNotLike(String value) {
            addCriterion("auSetUUID not like", value, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDIn(List<String> values) {
            addCriterion("auSetUUID in", values, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDNotIn(List<String> values) {
            addCriterion("auSetUUID not in", values, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDBetween(String value1, String value2) {
            addCriterion("auSetUUID between", value1, value2, "auSetUUID");
            return (Criteria) this;
        }

        public Criteria andAuSetUUIDNotBetween(String value1, String value2) {
            addCriterion("auSetUUID not between", value1, value2, "auSetUUID");
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

        public Criteria andAuSetSpdIsNull() {
            addCriterion("auSetSpd is null");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdIsNotNull() {
            addCriterion("auSetSpd is not null");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdEqualTo(Integer value) {
            addCriterion("auSetSpd =", value, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdNotEqualTo(Integer value) {
            addCriterion("auSetSpd <>", value, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdGreaterThan(Integer value) {
            addCriterion("auSetSpd >", value, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auSetSpd >=", value, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdLessThan(Integer value) {
            addCriterion("auSetSpd <", value, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdLessThanOrEqualTo(Integer value) {
            addCriterion("auSetSpd <=", value, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdIn(List<Integer> values) {
            addCriterion("auSetSpd in", values, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdNotIn(List<Integer> values) {
            addCriterion("auSetSpd not in", values, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdBetween(Integer value1, Integer value2) {
            addCriterion("auSetSpd between", value1, value2, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetSpdNotBetween(Integer value1, Integer value2) {
            addCriterion("auSetSpd not between", value1, value2, "auSetSpd");
            return (Criteria) this;
        }

        public Criteria andAuSetPitIsNull() {
            addCriterion("auSetPit is null");
            return (Criteria) this;
        }

        public Criteria andAuSetPitIsNotNull() {
            addCriterion("auSetPit is not null");
            return (Criteria) this;
        }

        public Criteria andAuSetPitEqualTo(Integer value) {
            addCriterion("auSetPit =", value, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitNotEqualTo(Integer value) {
            addCriterion("auSetPit <>", value, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitGreaterThan(Integer value) {
            addCriterion("auSetPit >", value, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitGreaterThanOrEqualTo(Integer value) {
            addCriterion("auSetPit >=", value, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitLessThan(Integer value) {
            addCriterion("auSetPit <", value, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitLessThanOrEqualTo(Integer value) {
            addCriterion("auSetPit <=", value, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitIn(List<Integer> values) {
            addCriterion("auSetPit in", values, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitNotIn(List<Integer> values) {
            addCriterion("auSetPit not in", values, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitBetween(Integer value1, Integer value2) {
            addCriterion("auSetPit between", value1, value2, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetPitNotBetween(Integer value1, Integer value2) {
            addCriterion("auSetPit not between", value1, value2, "auSetPit");
            return (Criteria) this;
        }

        public Criteria andAuSetVolIsNull() {
            addCriterion("auSetVol is null");
            return (Criteria) this;
        }

        public Criteria andAuSetVolIsNotNull() {
            addCriterion("auSetVol is not null");
            return (Criteria) this;
        }

        public Criteria andAuSetVolEqualTo(Integer value) {
            addCriterion("auSetVol =", value, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolNotEqualTo(Integer value) {
            addCriterion("auSetVol <>", value, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolGreaterThan(Integer value) {
            addCriterion("auSetVol >", value, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolGreaterThanOrEqualTo(Integer value) {
            addCriterion("auSetVol >=", value, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolLessThan(Integer value) {
            addCriterion("auSetVol <", value, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolLessThanOrEqualTo(Integer value) {
            addCriterion("auSetVol <=", value, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolIn(List<Integer> values) {
            addCriterion("auSetVol in", values, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolNotIn(List<Integer> values) {
            addCriterion("auSetVol not in", values, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolBetween(Integer value1, Integer value2) {
            addCriterion("auSetVol between", value1, value2, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVolNotBetween(Integer value1, Integer value2) {
            addCriterion("auSetVol not between", value1, value2, "auSetVol");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerIsNull() {
            addCriterion("auSetVoiPer is null");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerIsNotNull() {
            addCriterion("auSetVoiPer is not null");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerEqualTo(Integer value) {
            addCriterion("auSetVoiPer =", value, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerNotEqualTo(Integer value) {
            addCriterion("auSetVoiPer <>", value, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerGreaterThan(Integer value) {
            addCriterion("auSetVoiPer >", value, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerGreaterThanOrEqualTo(Integer value) {
            addCriterion("auSetVoiPer >=", value, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerLessThan(Integer value) {
            addCriterion("auSetVoiPer <", value, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerLessThanOrEqualTo(Integer value) {
            addCriterion("auSetVoiPer <=", value, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerIn(List<Integer> values) {
            addCriterion("auSetVoiPer in", values, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerNotIn(List<Integer> values) {
            addCriterion("auSetVoiPer not in", values, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerBetween(Integer value1, Integer value2) {
            addCriterion("auSetVoiPer between", value1, value2, "auSetVoiPer");
            return (Criteria) this;
        }

        public Criteria andAuSetVoiPerNotBetween(Integer value1, Integer value2) {
            addCriterion("auSetVoiPer not between", value1, value2, "auSetVoiPer");
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