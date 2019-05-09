package com.friend.py.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TopicAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicAnswerExample() {
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

        public Criteria andAnsnoIsNull() {
            addCriterion("ansNo is null");
            return (Criteria) this;
        }

        public Criteria andAnsnoIsNotNull() {
            addCriterion("ansNo is not null");
            return (Criteria) this;
        }

        public Criteria andAnsnoEqualTo(String value) {
            addCriterion("ansNo =", value, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoNotEqualTo(String value) {
            addCriterion("ansNo <>", value, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoGreaterThan(String value) {
            addCriterion("ansNo >", value, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoGreaterThanOrEqualTo(String value) {
            addCriterion("ansNo >=", value, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoLessThan(String value) {
            addCriterion("ansNo <", value, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoLessThanOrEqualTo(String value) {
            addCriterion("ansNo <=", value, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoLike(String value) {
            addCriterion("ansNo like", value, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoNotLike(String value) {
            addCriterion("ansNo not like", value, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoIn(List<String> values) {
            addCriterion("ansNo in", values, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoNotIn(List<String> values) {
            addCriterion("ansNo not in", values, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoBetween(String value1, String value2) {
            addCriterion("ansNo between", value1, value2, "ansno");
            return (Criteria) this;
        }

        public Criteria andAnsnoNotBetween(String value1, String value2) {
            addCriterion("ansNo not between", value1, value2, "ansno");
            return (Criteria) this;
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

        public Criteria andTopicnoIsNull() {
            addCriterion("topicNo is null");
            return (Criteria) this;
        }

        public Criteria andTopicnoIsNotNull() {
            addCriterion("topicNo is not null");
            return (Criteria) this;
        }

        public Criteria andTopicnoEqualTo(String value) {
            addCriterion("topicNo =", value, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoNotEqualTo(String value) {
            addCriterion("topicNo <>", value, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoGreaterThan(String value) {
            addCriterion("topicNo >", value, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoGreaterThanOrEqualTo(String value) {
            addCriterion("topicNo >=", value, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoLessThan(String value) {
            addCriterion("topicNo <", value, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoLessThanOrEqualTo(String value) {
            addCriterion("topicNo <=", value, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoLike(String value) {
            addCriterion("topicNo like", value, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoNotLike(String value) {
            addCriterion("topicNo not like", value, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoIn(List<String> values) {
            addCriterion("topicNo in", values, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoNotIn(List<String> values) {
            addCriterion("topicNo not in", values, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoBetween(String value1, String value2) {
            addCriterion("topicNo between", value1, value2, "topicno");
            return (Criteria) this;
        }

        public Criteria andTopicnoNotBetween(String value1, String value2) {
            addCriterion("topicNo not between", value1, value2, "topicno");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
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

        public Criteria andMomentIsNull() {
            addCriterion("moment is null");
            return (Criteria) this;
        }

        public Criteria andMomentIsNotNull() {
            addCriterion("moment is not null");
            return (Criteria) this;
        }

        public Criteria andMomentEqualTo(Date value) {
            addCriterion("moment =", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentNotEqualTo(Date value) {
            addCriterion("moment <>", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentGreaterThan(Date value) {
            addCriterion("moment >", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentGreaterThanOrEqualTo(Date value) {
            addCriterion("moment >=", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentLessThan(Date value) {
            addCriterion("moment <", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentLessThanOrEqualTo(Date value) {
            addCriterion("moment <=", value, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentIn(List<Date> values) {
            addCriterion("moment in", values, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentNotIn(List<Date> values) {
            addCriterion("moment not in", values, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentBetween(Date value1, Date value2) {
            addCriterion("moment between", value1, value2, "moment");
            return (Criteria) this;
        }

        public Criteria andMomentNotBetween(Date value1, Date value2) {
            addCriterion("moment not between", value1, value2, "moment");
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