package com.friend.py.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopicExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andNeedansIsNull() {
            addCriterion("needAns is null");
            return (Criteria) this;
        }

        public Criteria andNeedansIsNotNull() {
            addCriterion("needAns is not null");
            return (Criteria) this;
        }

        public Criteria andNeedansEqualTo(Integer value) {
            addCriterion("needAns =", value, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansNotEqualTo(Integer value) {
            addCriterion("needAns <>", value, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansGreaterThan(Integer value) {
            addCriterion("needAns >", value, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansGreaterThanOrEqualTo(Integer value) {
            addCriterion("needAns >=", value, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansLessThan(Integer value) {
            addCriterion("needAns <", value, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansLessThanOrEqualTo(Integer value) {
            addCriterion("needAns <=", value, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansIn(List<Integer> values) {
            addCriterion("needAns in", values, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansNotIn(List<Integer> values) {
            addCriterion("needAns not in", values, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansBetween(Integer value1, Integer value2) {
            addCriterion("needAns between", value1, value2, "needans");
            return (Criteria) this;
        }

        public Criteria andNeedansNotBetween(Integer value1, Integer value2) {
            addCriterion("needAns not between", value1, value2, "needans");
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