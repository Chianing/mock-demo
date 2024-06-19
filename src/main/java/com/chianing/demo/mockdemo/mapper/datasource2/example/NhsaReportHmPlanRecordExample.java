package com.chianing.demo.mockdemo.mapper.datasource2.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NhsaReportHmPlanRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NhsaReportHmPlanRecordExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andPkIdIsNull() {
            addCriterion("pk_id is null");
            return (Criteria) this;
        }

        public Criteria andPkIdIsNotNull() {
            addCriterion("pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkIdEqualTo(Long value) {
            addCriterion("pk_id =", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotEqualTo(Long value) {
            addCriterion("pk_id <>", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThan(Long value) {
            addCriterion("pk_id >", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_id >=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThan(Long value) {
            addCriterion("pk_id <", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdLessThanOrEqualTo(Long value) {
            addCriterion("pk_id <=", value, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdIn(List<Long> values) {
            addCriterion("pk_id in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotIn(List<Long> values) {
            addCriterion("pk_id not in", values, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdBetween(Long value1, Long value2) {
            addCriterion("pk_id between", value1, value2, "pkId");
            return (Criteria) this;
        }

        public Criteria andPkIdNotBetween(Long value1, Long value2) {
            addCriterion("pk_id not between", value1, value2, "pkId");
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

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeIsNull() {
            addCriterion("sign_record_code is null");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeIsNotNull() {
            addCriterion("sign_record_code is not null");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeEqualTo(String value) {
            addCriterion("sign_record_code =", value, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeNotEqualTo(String value) {
            addCriterion("sign_record_code <>", value, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeGreaterThan(String value) {
            addCriterion("sign_record_code >", value, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sign_record_code >=", value, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeLessThan(String value) {
            addCriterion("sign_record_code <", value, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeLessThanOrEqualTo(String value) {
            addCriterion("sign_record_code <=", value, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeLike(String value) {
            addCriterion("sign_record_code like", value, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeNotLike(String value) {
            addCriterion("sign_record_code not like", value, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeIn(List<String> values) {
            addCriterion("sign_record_code in", values, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeNotIn(List<String> values) {
            addCriterion("sign_record_code not in", values, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeBetween(String value1, String value2) {
            addCriterion("sign_record_code between", value1, value2, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andSignRecordCodeNotBetween(String value1, String value2) {
            addCriterion("sign_record_code not between", value1, value2, "signRecordCode");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIsNull() {
            addCriterion("plan_type is null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIsNotNull() {
            addCriterion("plan_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeEqualTo(Byte value) {
            addCriterion("plan_type =", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotEqualTo(Byte value) {
            addCriterion("plan_type <>", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThan(Byte value) {
            addCriterion("plan_type >", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("plan_type >=", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThan(Byte value) {
            addCriterion("plan_type <", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThanOrEqualTo(Byte value) {
            addCriterion("plan_type <=", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIn(List<Byte> values) {
            addCriterion("plan_type in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotIn(List<Byte> values) {
            addCriterion("plan_type not in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeBetween(Byte value1, Byte value2) {
            addCriterion("plan_type between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("plan_type not between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeIsNull() {
            addCriterion("group_management_code is null");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeIsNotNull() {
            addCriterion("group_management_code is not null");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeEqualTo(String value) {
            addCriterion("group_management_code =", value, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeNotEqualTo(String value) {
            addCriterion("group_management_code <>", value, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeGreaterThan(String value) {
            addCriterion("group_management_code >", value, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeGreaterThanOrEqualTo(String value) {
            addCriterion("group_management_code >=", value, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeLessThan(String value) {
            addCriterion("group_management_code <", value, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeLessThanOrEqualTo(String value) {
            addCriterion("group_management_code <=", value, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeLike(String value) {
            addCriterion("group_management_code like", value, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeNotLike(String value) {
            addCriterion("group_management_code not like", value, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeIn(List<String> values) {
            addCriterion("group_management_code in", values, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeNotIn(List<String> values) {
            addCriterion("group_management_code not in", values, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeBetween(String value1, String value2) {
            addCriterion("group_management_code between", value1, value2, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andGroupManagementCodeNotBetween(String value1, String value2) {
            addCriterion("group_management_code not between", value1, value2, "groupManagementCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNull() {
            addCriterion("status_code is null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIsNotNull() {
            addCriterion("status_code is not null");
            return (Criteria) this;
        }

        public Criteria andStatusCodeEqualTo(Byte value) {
            addCriterion("status_code =", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotEqualTo(Byte value) {
            addCriterion("status_code <>", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThan(Byte value) {
            addCriterion("status_code >", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("status_code >=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThan(Byte value) {
            addCriterion("status_code <", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeLessThanOrEqualTo(Byte value) {
            addCriterion("status_code <=", value, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeIn(List<Byte> values) {
            addCriterion("status_code in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotIn(List<Byte> values) {
            addCriterion("status_code not in", values, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeBetween(Byte value1, Byte value2) {
            addCriterion("status_code between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("status_code not between", value1, value2, "statusCode");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNull() {
            addCriterion("status_desc is null");
            return (Criteria) this;
        }

        public Criteria andStatusDescIsNotNull() {
            addCriterion("status_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDescEqualTo(String value) {
            addCriterion("status_desc =", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotEqualTo(String value) {
            addCriterion("status_desc <>", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThan(String value) {
            addCriterion("status_desc >", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescGreaterThanOrEqualTo(String value) {
            addCriterion("status_desc >=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThan(String value) {
            addCriterion("status_desc <", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLessThanOrEqualTo(String value) {
            addCriterion("status_desc <=", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescLike(String value) {
            addCriterion("status_desc like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotLike(String value) {
            addCriterion("status_desc not like", value, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescIn(List<String> values) {
            addCriterion("status_desc in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotIn(List<String> values) {
            addCriterion("status_desc not in", values, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescBetween(String value1, String value2) {
            addCriterion("status_desc between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andStatusDescNotBetween(String value1, String value2) {
            addCriterion("status_desc not between", value1, value2, "statusDesc");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdIsNull() {
            addCriterion("api_record_id is null");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdIsNotNull() {
            addCriterion("api_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdEqualTo(String value) {
            addCriterion("api_record_id =", value, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdNotEqualTo(String value) {
            addCriterion("api_record_id <>", value, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdGreaterThan(String value) {
            addCriterion("api_record_id >", value, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("api_record_id >=", value, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdLessThan(String value) {
            addCriterion("api_record_id <", value, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdLessThanOrEqualTo(String value) {
            addCriterion("api_record_id <=", value, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdLike(String value) {
            addCriterion("api_record_id like", value, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdNotLike(String value) {
            addCriterion("api_record_id not like", value, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdIn(List<String> values) {
            addCriterion("api_record_id in", values, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdNotIn(List<String> values) {
            addCriterion("api_record_id not in", values, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdBetween(String value1, String value2) {
            addCriterion("api_record_id between", value1, value2, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andApiRecordIdNotBetween(String value1, String value2) {
            addCriterion("api_record_id not between", value1, value2, "apiRecordId");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNull() {
            addCriterion("gmt_created is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIsNotNull() {
            addCriterion("gmt_created is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedEqualTo(LocalDateTime value) {
            addCriterion("gmt_created =", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_created <>", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThan(LocalDateTime value) {
            addCriterion("gmt_created >", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_created >=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThan(LocalDateTime value) {
            addCriterion("gmt_created <", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_created <=", value, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedIn(List<LocalDateTime> values) {
            addCriterion("gmt_created in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_created not in", values, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_created between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtCreatedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_created not between", value1, value2, "gmtCreated");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(LocalDateTime value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(LocalDateTime value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<LocalDateTime> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedIsNull() {
            addCriterion("gmt_deleted is null");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedIsNotNull() {
            addCriterion("gmt_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedEqualTo(LocalDateTime value) {
            addCriterion("gmt_deleted =", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_deleted <>", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedGreaterThan(LocalDateTime value) {
            addCriterion("gmt_deleted >", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_deleted >=", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedLessThan(LocalDateTime value) {
            addCriterion("gmt_deleted <", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_deleted <=", value, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedIn(List<LocalDateTime> values) {
            addCriterion("gmt_deleted in", values, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_deleted not in", values, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_deleted between", value1, value2, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andGmtDeletedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_deleted not between", value1, value2, "gmtDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdIsNull() {
            addCriterion("sign_record_snapshot_id is null");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdIsNotNull() {
            addCriterion("sign_record_snapshot_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdEqualTo(String value) {
            addCriterion("sign_record_snapshot_id =", value, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdNotEqualTo(String value) {
            addCriterion("sign_record_snapshot_id <>", value, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdGreaterThan(String value) {
            addCriterion("sign_record_snapshot_id >", value, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdGreaterThanOrEqualTo(String value) {
            addCriterion("sign_record_snapshot_id >=", value, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdLessThan(String value) {
            addCriterion("sign_record_snapshot_id <", value, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdLessThanOrEqualTo(String value) {
            addCriterion("sign_record_snapshot_id <=", value, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdLike(String value) {
            addCriterion("sign_record_snapshot_id like", value, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdNotLike(String value) {
            addCriterion("sign_record_snapshot_id not like", value, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdIn(List<String> values) {
            addCriterion("sign_record_snapshot_id in", values, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdNotIn(List<String> values) {
            addCriterion("sign_record_snapshot_id not in", values, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdBetween(String value1, String value2) {
            addCriterion("sign_record_snapshot_id between", value1, value2, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andSignRecordSnapshotIdNotBetween(String value1, String value2) {
            addCriterion("sign_record_snapshot_id not between", value1, value2, "signRecordSnapshotId");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeIsNull() {
            addCriterion("other_biz_code is null");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeIsNotNull() {
            addCriterion("other_biz_code is not null");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeEqualTo(String value) {
            addCriterion("other_biz_code =", value, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeNotEqualTo(String value) {
            addCriterion("other_biz_code <>", value, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeGreaterThan(String value) {
            addCriterion("other_biz_code >", value, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeGreaterThanOrEqualTo(String value) {
            addCriterion("other_biz_code >=", value, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeLessThan(String value) {
            addCriterion("other_biz_code <", value, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeLessThanOrEqualTo(String value) {
            addCriterion("other_biz_code <=", value, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeLike(String value) {
            addCriterion("other_biz_code like", value, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeNotLike(String value) {
            addCriterion("other_biz_code not like", value, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeIn(List<String> values) {
            addCriterion("other_biz_code in", values, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeNotIn(List<String> values) {
            addCriterion("other_biz_code not in", values, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeBetween(String value1, String value2) {
            addCriterion("other_biz_code between", value1, value2, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andOtherBizCodeNotBetween(String value1, String value2) {
            addCriterion("other_biz_code not between", value1, value2, "otherBizCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeIsNull() {
            addCriterion("hospital_code is null");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeIsNotNull() {
            addCriterion("hospital_code is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeEqualTo(String value) {
            addCriterion("hospital_code =", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeNotEqualTo(String value) {
            addCriterion("hospital_code <>", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeGreaterThan(String value) {
            addCriterion("hospital_code >", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_code >=", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeLessThan(String value) {
            addCriterion("hospital_code <", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeLessThanOrEqualTo(String value) {
            addCriterion("hospital_code <=", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeLike(String value) {
            addCriterion("hospital_code like", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeNotLike(String value) {
            addCriterion("hospital_code not like", value, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeIn(List<String> values) {
            addCriterion("hospital_code in", values, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeNotIn(List<String> values) {
            addCriterion("hospital_code not in", values, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeBetween(String value1, String value2) {
            addCriterion("hospital_code between", value1, value2, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andHospitalCodeNotBetween(String value1, String value2) {
            addCriterion("hospital_code not between", value1, value2, "hospitalCode");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorIsNull() {
            addCriterion("data_check_doctor is null");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorIsNotNull() {
            addCriterion("data_check_doctor is not null");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorEqualTo(String value) {
            addCriterion("data_check_doctor =", value, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorNotEqualTo(String value) {
            addCriterion("data_check_doctor <>", value, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorGreaterThan(String value) {
            addCriterion("data_check_doctor >", value, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("data_check_doctor >=", value, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorLessThan(String value) {
            addCriterion("data_check_doctor <", value, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorLessThanOrEqualTo(String value) {
            addCriterion("data_check_doctor <=", value, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorLike(String value) {
            addCriterion("data_check_doctor like", value, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorNotLike(String value) {
            addCriterion("data_check_doctor not like", value, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorIn(List<String> values) {
            addCriterion("data_check_doctor in", values, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorNotIn(List<String> values) {
            addCriterion("data_check_doctor not in", values, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorBetween(String value1, String value2) {
            addCriterion("data_check_doctor between", value1, value2, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andDataCheckDoctorNotBetween(String value1, String value2) {
            addCriterion("data_check_doctor not between", value1, value2, "dataCheckDoctor");
            return (Criteria) this;
        }

        public Criteria andFollowupDateIsNull() {
            addCriterion("followup_date is null");
            return (Criteria) this;
        }

        public Criteria andFollowupDateIsNotNull() {
            addCriterion("followup_date is not null");
            return (Criteria) this;
        }

        public Criteria andFollowupDateEqualTo(LocalDate value) {
            addCriterion("followup_date =", value, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateNotEqualTo(LocalDate value) {
            addCriterion("followup_date <>", value, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateGreaterThan(LocalDate value) {
            addCriterion("followup_date >", value, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("followup_date >=", value, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateLessThan(LocalDate value) {
            addCriterion("followup_date <", value, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("followup_date <=", value, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateIn(List<LocalDate> values) {
            addCriterion("followup_date in", values, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateNotIn(List<LocalDate> values) {
            addCriterion("followup_date not in", values, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("followup_date between", value1, value2, "followupDate");
            return (Criteria) this;
        }

        public Criteria andFollowupDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("followup_date not between", value1, value2, "followupDate");
            return (Criteria) this;
        }

        public Criteria andCycleNoIsNull() {
            addCriterion("cycle_no is null");
            return (Criteria) this;
        }

        public Criteria andCycleNoIsNotNull() {
            addCriterion("cycle_no is not null");
            return (Criteria) this;
        }

        public Criteria andCycleNoEqualTo(Integer value) {
            addCriterion("cycle_no =", value, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoNotEqualTo(Integer value) {
            addCriterion("cycle_no <>", value, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoGreaterThan(Integer value) {
            addCriterion("cycle_no >", value, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cycle_no >=", value, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoLessThan(Integer value) {
            addCriterion("cycle_no <", value, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoLessThanOrEqualTo(Integer value) {
            addCriterion("cycle_no <=", value, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoIn(List<Integer> values) {
            addCriterion("cycle_no in", values, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoNotIn(List<Integer> values) {
            addCriterion("cycle_no not in", values, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoBetween(Integer value1, Integer value2) {
            addCriterion("cycle_no between", value1, value2, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andCycleNoNotBetween(Integer value1, Integer value2) {
            addCriterion("cycle_no not between", value1, value2, "cycleNo");
            return (Criteria) this;
        }

        public Criteria andBizDateIsNull() {
            addCriterion("biz_date is null");
            return (Criteria) this;
        }

        public Criteria andBizDateIsNotNull() {
            addCriterion("biz_date is not null");
            return (Criteria) this;
        }

        public Criteria andBizDateEqualTo(LocalDateTime value) {
            addCriterion("biz_date =", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateNotEqualTo(LocalDateTime value) {
            addCriterion("biz_date <>", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateGreaterThan(LocalDateTime value) {
            addCriterion("biz_date >", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("biz_date >=", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateLessThan(LocalDateTime value) {
            addCriterion("biz_date <", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("biz_date <=", value, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateIn(List<LocalDateTime> values) {
            addCriterion("biz_date in", values, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateNotIn(List<LocalDateTime> values) {
            addCriterion("biz_date not in", values, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("biz_date between", value1, value2, "bizDate");
            return (Criteria) this;
        }

        public Criteria andBizDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("biz_date not between", value1, value2, "bizDate");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedIsNull() {
            addCriterion("task_gmt_created is null");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedIsNotNull() {
            addCriterion("task_gmt_created is not null");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedEqualTo(LocalDateTime value) {
            addCriterion("task_gmt_created =", value, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedNotEqualTo(LocalDateTime value) {
            addCriterion("task_gmt_created <>", value, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedGreaterThan(LocalDateTime value) {
            addCriterion("task_gmt_created >", value, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("task_gmt_created >=", value, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedLessThan(LocalDateTime value) {
            addCriterion("task_gmt_created <", value, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("task_gmt_created <=", value, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedIn(List<LocalDateTime> values) {
            addCriterion("task_gmt_created in", values, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedNotIn(List<LocalDateTime> values) {
            addCriterion("task_gmt_created not in", values, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("task_gmt_created between", value1, value2, "taskGmtCreated");
            return (Criteria) this;
        }

        public Criteria andTaskGmtCreatedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("task_gmt_created not between", value1, value2, "taskGmtCreated");
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