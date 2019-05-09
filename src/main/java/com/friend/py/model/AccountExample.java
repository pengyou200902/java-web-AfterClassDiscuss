package com.friend.py.model;

import java.util.ArrayList;
import java.util.List;

public class AccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountExample() {
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

        public Criteria andAccIsNull() {
            addCriterion("acc is null");
            return (Criteria) this;
        }

        public Criteria andAccIsNotNull() {
            addCriterion("acc is not null");
            return (Criteria) this;
        }

        public Criteria andAccEqualTo(String value) {
            addCriterion("acc =", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotEqualTo(String value) {
            addCriterion("acc <>", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccGreaterThan(String value) {
            addCriterion("acc >", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccGreaterThanOrEqualTo(String value) {
            addCriterion("acc >=", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccLessThan(String value) {
            addCriterion("acc <", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccLessThanOrEqualTo(String value) {
            addCriterion("acc <=", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccLike(String value) {
            addCriterion("acc like", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotLike(String value) {
            addCriterion("acc not like", value, "acc");
            return (Criteria) this;
        }

        public Criteria andAccIn(List<String> values) {
            addCriterion("acc in", values, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotIn(List<String> values) {
            addCriterion("acc not in", values, "acc");
            return (Criteria) this;
        }

        public Criteria andAccBetween(String value1, String value2) {
            addCriterion("acc between", value1, value2, "acc");
            return (Criteria) this;
        }

        public Criteria andAccNotBetween(String value1, String value2) {
            addCriterion("acc not between", value1, value2, "acc");
            return (Criteria) this;
        }

        public Criteria andPsdIsNull() {
            addCriterion("psd is null");
            return (Criteria) this;
        }

        public Criteria andPsdIsNotNull() {
            addCriterion("psd is not null");
            return (Criteria) this;
        }

        public Criteria andPsdEqualTo(String value) {
            addCriterion("psd =", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdNotEqualTo(String value) {
            addCriterion("psd <>", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdGreaterThan(String value) {
            addCriterion("psd >", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdGreaterThanOrEqualTo(String value) {
            addCriterion("psd >=", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdLessThan(String value) {
            addCriterion("psd <", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdLessThanOrEqualTo(String value) {
            addCriterion("psd <=", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdLike(String value) {
            addCriterion("psd like", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdNotLike(String value) {
            addCriterion("psd not like", value, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdIn(List<String> values) {
            addCriterion("psd in", values, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdNotIn(List<String> values) {
            addCriterion("psd not in", values, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdBetween(String value1, String value2) {
            addCriterion("psd between", value1, value2, "psd");
            return (Criteria) this;
        }

        public Criteria andPsdNotBetween(String value1, String value2) {
            addCriterion("psd not between", value1, value2, "psd");
            return (Criteria) this;
        }

        public Criteria andAcctypeIsNull() {
            addCriterion("accType is null");
            return (Criteria) this;
        }

        public Criteria andAcctypeIsNotNull() {
            addCriterion("accType is not null");
            return (Criteria) this;
        }

        public Criteria andAcctypeEqualTo(String value) {
            addCriterion("accType =", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotEqualTo(String value) {
            addCriterion("accType <>", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeGreaterThan(String value) {
            addCriterion("accType >", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeGreaterThanOrEqualTo(String value) {
            addCriterion("accType >=", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLessThan(String value) {
            addCriterion("accType <", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLessThanOrEqualTo(String value) {
            addCriterion("accType <=", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLike(String value) {
            addCriterion("accType like", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotLike(String value) {
            addCriterion("accType not like", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeIn(List<String> values) {
            addCriterion("accType in", values, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotIn(List<String> values) {
            addCriterion("accType not in", values, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeBetween(String value1, String value2) {
            addCriterion("accType between", value1, value2, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotBetween(String value1, String value2) {
            addCriterion("accType not between", value1, value2, "acctype");
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