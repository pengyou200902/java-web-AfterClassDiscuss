package com.friend.py.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeanameIsNull() {
            addCriterion("teaName is null");
            return (Criteria) this;
        }

        public Criteria andTeanameIsNotNull() {
            addCriterion("teaName is not null");
            return (Criteria) this;
        }

        public Criteria andTeanameEqualTo(String value) {
            addCriterion("teaName =", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotEqualTo(String value) {
            addCriterion("teaName <>", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThan(String value) {
            addCriterion("teaName >", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameGreaterThanOrEqualTo(String value) {
            addCriterion("teaName >=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThan(String value) {
            addCriterion("teaName <", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLessThanOrEqualTo(String value) {
            addCriterion("teaName <=", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameLike(String value) {
            addCriterion("teaName like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotLike(String value) {
            addCriterion("teaName not like", value, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameIn(List<String> values) {
            addCriterion("teaName in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotIn(List<String> values) {
            addCriterion("teaName not in", values, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameBetween(String value1, String value2) {
            addCriterion("teaName between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andTeanameNotBetween(String value1, String value2) {
            addCriterion("teaName not between", value1, value2, "teaname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
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

        public Criteria andTealevelIsNull() {
            addCriterion("teaLevel is null");
            return (Criteria) this;
        }

        public Criteria andTealevelIsNotNull() {
            addCriterion("teaLevel is not null");
            return (Criteria) this;
        }

        public Criteria andTealevelEqualTo(String value) {
            addCriterion("teaLevel =", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelNotEqualTo(String value) {
            addCriterion("teaLevel <>", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelGreaterThan(String value) {
            addCriterion("teaLevel >", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelGreaterThanOrEqualTo(String value) {
            addCriterion("teaLevel >=", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelLessThan(String value) {
            addCriterion("teaLevel <", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelLessThanOrEqualTo(String value) {
            addCriterion("teaLevel <=", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelLike(String value) {
            addCriterion("teaLevel like", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelNotLike(String value) {
            addCriterion("teaLevel not like", value, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelIn(List<String> values) {
            addCriterion("teaLevel in", values, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelNotIn(List<String> values) {
            addCriterion("teaLevel not in", values, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelBetween(String value1, String value2) {
            addCriterion("teaLevel between", value1, value2, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTealevelNotBetween(String value1, String value2) {
            addCriterion("teaLevel not between", value1, value2, "tealevel");
            return (Criteria) this;
        }

        public Criteria andTeadscptIsNull() {
            addCriterion("teaDscpt is null");
            return (Criteria) this;
        }

        public Criteria andTeadscptIsNotNull() {
            addCriterion("teaDscpt is not null");
            return (Criteria) this;
        }

        public Criteria andTeadscptEqualTo(String value) {
            addCriterion("teaDscpt =", value, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptNotEqualTo(String value) {
            addCriterion("teaDscpt <>", value, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptGreaterThan(String value) {
            addCriterion("teaDscpt >", value, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptGreaterThanOrEqualTo(String value) {
            addCriterion("teaDscpt >=", value, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptLessThan(String value) {
            addCriterion("teaDscpt <", value, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptLessThanOrEqualTo(String value) {
            addCriterion("teaDscpt <=", value, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptLike(String value) {
            addCriterion("teaDscpt like", value, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptNotLike(String value) {
            addCriterion("teaDscpt not like", value, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptIn(List<String> values) {
            addCriterion("teaDscpt in", values, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptNotIn(List<String> values) {
            addCriterion("teaDscpt not in", values, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptBetween(String value1, String value2) {
            addCriterion("teaDscpt between", value1, value2, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andTeadscptNotBetween(String value1, String value2) {
            addCriterion("teaDscpt not between", value1, value2, "teadscpt");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Double value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Double value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Double value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Double value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Double value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Double> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Double> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Double value1, Double value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Double value1, Double value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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