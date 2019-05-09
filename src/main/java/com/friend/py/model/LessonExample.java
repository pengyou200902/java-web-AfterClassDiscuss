package com.friend.py.model;

import java.util.ArrayList;
import java.util.List;

public class LessonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LessonExample() {
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

        public Criteria andLsnnoIsNull() {
            addCriterion("lsnNo is null");
            return (Criteria) this;
        }

        public Criteria andLsnnoIsNotNull() {
            addCriterion("lsnNo is not null");
            return (Criteria) this;
        }

        public Criteria andLsnnoEqualTo(String value) {
            addCriterion("lsnNo =", value, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoNotEqualTo(String value) {
            addCriterion("lsnNo <>", value, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoGreaterThan(String value) {
            addCriterion("lsnNo >", value, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoGreaterThanOrEqualTo(String value) {
            addCriterion("lsnNo >=", value, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoLessThan(String value) {
            addCriterion("lsnNo <", value, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoLessThanOrEqualTo(String value) {
            addCriterion("lsnNo <=", value, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoLike(String value) {
            addCriterion("lsnNo like", value, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoNotLike(String value) {
            addCriterion("lsnNo not like", value, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoIn(List<String> values) {
            addCriterion("lsnNo in", values, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoNotIn(List<String> values) {
            addCriterion("lsnNo not in", values, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoBetween(String value1, String value2) {
            addCriterion("lsnNo between", value1, value2, "lsnno");
            return (Criteria) this;
        }

        public Criteria andLsnnoNotBetween(String value1, String value2) {
            addCriterion("lsnNo not between", value1, value2, "lsnno");
            return (Criteria) this;
        }

        public Criteria andTeanoIsNull() {
            addCriterion("teaNo is null");
            return (Criteria) this;
        }

        public Criteria andTeanoIsNotNull() {
            addCriterion("teaNo is not null");
            return (Criteria) this;
        }

        public Criteria andTeanoEqualTo(String value) {
            addCriterion("teaNo =", value, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoNotEqualTo(String value) {
            addCriterion("teaNo <>", value, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoGreaterThan(String value) {
            addCriterion("teaNo >", value, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoGreaterThanOrEqualTo(String value) {
            addCriterion("teaNo >=", value, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoLessThan(String value) {
            addCriterion("teaNo <", value, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoLessThanOrEqualTo(String value) {
            addCriterion("teaNo <=", value, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoLike(String value) {
            addCriterion("teaNo like", value, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoNotLike(String value) {
            addCriterion("teaNo not like", value, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoIn(List<String> values) {
            addCriterion("teaNo in", values, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoNotIn(List<String> values) {
            addCriterion("teaNo not in", values, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoBetween(String value1, String value2) {
            addCriterion("teaNo between", value1, value2, "teano");
            return (Criteria) this;
        }

        public Criteria andTeanoNotBetween(String value1, String value2) {
            addCriterion("teaNo not between", value1, value2, "teano");
            return (Criteria) this;
        }

        public Criteria andLsnnameIsNull() {
            addCriterion("lsnName is null");
            return (Criteria) this;
        }

        public Criteria andLsnnameIsNotNull() {
            addCriterion("lsnName is not null");
            return (Criteria) this;
        }

        public Criteria andLsnnameEqualTo(String value) {
            addCriterion("lsnName =", value, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameNotEqualTo(String value) {
            addCriterion("lsnName <>", value, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameGreaterThan(String value) {
            addCriterion("lsnName >", value, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameGreaterThanOrEqualTo(String value) {
            addCriterion("lsnName >=", value, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameLessThan(String value) {
            addCriterion("lsnName <", value, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameLessThanOrEqualTo(String value) {
            addCriterion("lsnName <=", value, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameLike(String value) {
            addCriterion("lsnName like", value, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameNotLike(String value) {
            addCriterion("lsnName not like", value, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameIn(List<String> values) {
            addCriterion("lsnName in", values, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameNotIn(List<String> values) {
            addCriterion("lsnName not in", values, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameBetween(String value1, String value2) {
            addCriterion("lsnName between", value1, value2, "lsnname");
            return (Criteria) this;
        }

        public Criteria andLsnnameNotBetween(String value1, String value2) {
            addCriterion("lsnName not between", value1, value2, "lsnname");
            return (Criteria) this;
        }

        public Criteria andDscptIsNull() {
            addCriterion("dscpt is null");
            return (Criteria) this;
        }

        public Criteria andDscptIsNotNull() {
            addCriterion("dscpt is not null");
            return (Criteria) this;
        }

        public Criteria andDscptEqualTo(String value) {
            addCriterion("dscpt =", value, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptNotEqualTo(String value) {
            addCriterion("dscpt <>", value, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptGreaterThan(String value) {
            addCriterion("dscpt >", value, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptGreaterThanOrEqualTo(String value) {
            addCriterion("dscpt >=", value, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptLessThan(String value) {
            addCriterion("dscpt <", value, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptLessThanOrEqualTo(String value) {
            addCriterion("dscpt <=", value, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptLike(String value) {
            addCriterion("dscpt like", value, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptNotLike(String value) {
            addCriterion("dscpt not like", value, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptIn(List<String> values) {
            addCriterion("dscpt in", values, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptNotIn(List<String> values) {
            addCriterion("dscpt not in", values, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptBetween(String value1, String value2) {
            addCriterion("dscpt between", value1, value2, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDscptNotBetween(String value1, String value2) {
            addCriterion("dscpt not between", value1, value2, "dscpt");
            return (Criteria) this;
        }

        public Criteria andDeptnoIsNull() {
            addCriterion("deptNo is null");
            return (Criteria) this;
        }

        public Criteria andDeptnoIsNotNull() {
            addCriterion("deptNo is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnoEqualTo(String value) {
            addCriterion("deptNo =", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotEqualTo(String value) {
            addCriterion("deptNo <>", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoGreaterThan(String value) {
            addCriterion("deptNo >", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoGreaterThanOrEqualTo(String value) {
            addCriterion("deptNo >=", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoLessThan(String value) {
            addCriterion("deptNo <", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoLessThanOrEqualTo(String value) {
            addCriterion("deptNo <=", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoLike(String value) {
            addCriterion("deptNo like", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotLike(String value) {
            addCriterion("deptNo not like", value, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoIn(List<String> values) {
            addCriterion("deptNo in", values, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotIn(List<String> values) {
            addCriterion("deptNo not in", values, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoBetween(String value1, String value2) {
            addCriterion("deptNo between", value1, value2, "deptno");
            return (Criteria) this;
        }

        public Criteria andDeptnoNotBetween(String value1, String value2) {
            addCriterion("deptNo not between", value1, value2, "deptno");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNull() {
            addCriterion("credits is null");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNotNull() {
            addCriterion("credits is not null");
            return (Criteria) this;
        }

        public Criteria andCreditsEqualTo(Byte value) {
            addCriterion("credits =", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotEqualTo(Byte value) {
            addCriterion("credits <>", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThan(Byte value) {
            addCriterion("credits >", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThanOrEqualTo(Byte value) {
            addCriterion("credits >=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThan(Byte value) {
            addCriterion("credits <", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThanOrEqualTo(Byte value) {
            addCriterion("credits <=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsIn(List<Byte> values) {
            addCriterion("credits in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotIn(List<Byte> values) {
            addCriterion("credits not in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsBetween(Byte value1, Byte value2) {
            addCriterion("credits between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotBetween(Byte value1, Byte value2) {
            addCriterion("credits not between", value1, value2, "credits");
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