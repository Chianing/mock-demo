package com.chianing.demo.mockdemo.mapper.datasource1.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PatientSignDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PatientSignDetailExample() {
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

        public Criteria andPatientIdentifyCardNoIsNull() {
            addCriterion("patient_identify_card_no is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoIsNotNull() {
            addCriterion("patient_identify_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoEqualTo(String value) {
            addCriterion("patient_identify_card_no =", value, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoNotEqualTo(String value) {
            addCriterion("patient_identify_card_no <>", value, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoGreaterThan(String value) {
            addCriterion("patient_identify_card_no >", value, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("patient_identify_card_no >=", value, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoLessThan(String value) {
            addCriterion("patient_identify_card_no <", value, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoLessThanOrEqualTo(String value) {
            addCriterion("patient_identify_card_no <=", value, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoLike(String value) {
            addCriterion("patient_identify_card_no like", value, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoNotLike(String value) {
            addCriterion("patient_identify_card_no not like", value, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoIn(List<String> values) {
            addCriterion("patient_identify_card_no in", values, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoNotIn(List<String> values) {
            addCriterion("patient_identify_card_no not in", values, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoBetween(String value1, String value2) {
            addCriterion("patient_identify_card_no between", value1, value2, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentifyCardNoNotBetween(String value1, String value2) {
            addCriterion("patient_identify_card_no not between", value1, value2, "patientIdentifyCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNull() {
            addCriterion("patient_sex is null");
            return (Criteria) this;
        }

        public Criteria andPatientSexIsNotNull() {
            addCriterion("patient_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSexEqualTo(Byte value) {
            addCriterion("patient_sex =", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotEqualTo(Byte value) {
            addCriterion("patient_sex <>", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThan(Byte value) {
            addCriterion("patient_sex >", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("patient_sex >=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThan(Byte value) {
            addCriterion("patient_sex <", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexLessThanOrEqualTo(Byte value) {
            addCriterion("patient_sex <=", value, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexIn(List<Byte> values) {
            addCriterion("patient_sex in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotIn(List<Byte> values) {
            addCriterion("patient_sex not in", values, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexBetween(Byte value1, Byte value2) {
            addCriterion("patient_sex between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientSexNotBetween(Byte value1, Byte value2) {
            addCriterion("patient_sex not between", value1, value2, "patientSex");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNull() {
            addCriterion("patient_age is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNotNull() {
            addCriterion("patient_age is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeEqualTo(Byte value) {
            addCriterion("patient_age =", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotEqualTo(Byte value) {
            addCriterion("patient_age <>", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThan(Byte value) {
            addCriterion("patient_age >", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("patient_age >=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThan(Byte value) {
            addCriterion("patient_age <", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThanOrEqualTo(Byte value) {
            addCriterion("patient_age <=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIn(List<Byte> values) {
            addCriterion("patient_age in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotIn(List<Byte> values) {
            addCriterion("patient_age not in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBetween(Byte value1, Byte value2) {
            addCriterion("patient_age between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("patient_age not between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIsNull() {
            addCriterion("patient_phone is null");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIsNotNull() {
            addCriterion("patient_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneEqualTo(String value) {
            addCriterion("patient_phone =", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotEqualTo(String value) {
            addCriterion("patient_phone <>", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneGreaterThan(String value) {
            addCriterion("patient_phone >", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("patient_phone >=", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneLessThan(String value) {
            addCriterion("patient_phone <", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneLessThanOrEqualTo(String value) {
            addCriterion("patient_phone <=", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneLike(String value) {
            addCriterion("patient_phone like", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotLike(String value) {
            addCriterion("patient_phone not like", value, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneIn(List<String> values) {
            addCriterion("patient_phone in", values, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotIn(List<String> values) {
            addCriterion("patient_phone not in", values, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneBetween(String value1, String value2) {
            addCriterion("patient_phone between", value1, value2, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andPatientPhoneNotBetween(String value1, String value2) {
            addCriterion("patient_phone not between", value1, value2, "patientPhone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("community like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("community not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andPatientCodeIsNull() {
            addCriterion("patient_code is null");
            return (Criteria) this;
        }

        public Criteria andPatientCodeIsNotNull() {
            addCriterion("patient_code is not null");
            return (Criteria) this;
        }

        public Criteria andPatientCodeEqualTo(String value) {
            addCriterion("patient_code =", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeNotEqualTo(String value) {
            addCriterion("patient_code <>", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeGreaterThan(String value) {
            addCriterion("patient_code >", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_code >=", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeLessThan(String value) {
            addCriterion("patient_code <", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeLessThanOrEqualTo(String value) {
            addCriterion("patient_code <=", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeLike(String value) {
            addCriterion("patient_code like", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeNotLike(String value) {
            addCriterion("patient_code not like", value, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeIn(List<String> values) {
            addCriterion("patient_code in", values, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeNotIn(List<String> values) {
            addCriterion("patient_code not in", values, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeBetween(String value1, String value2) {
            addCriterion("patient_code between", value1, value2, "patientCode");
            return (Criteria) this;
        }

        public Criteria andPatientCodeNotBetween(String value1, String value2) {
            addCriterion("patient_code not between", value1, value2, "patientCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIsNull() {
            addCriterion("insurance_type is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIsNotNull() {
            addCriterion("insurance_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeEqualTo(Byte value) {
            addCriterion("insurance_type =", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotEqualTo(Byte value) {
            addCriterion("insurance_type <>", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThan(Byte value) {
            addCriterion("insurance_type >", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("insurance_type >=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThan(Byte value) {
            addCriterion("insurance_type <", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("insurance_type <=", value, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeIn(List<Byte> values) {
            addCriterion("insurance_type in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotIn(List<Byte> values) {
            addCriterion("insurance_type not in", values, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeBetween(Byte value1, Byte value2) {
            addCriterion("insurance_type between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("insurance_type not between", value1, value2, "insuranceType");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeIsNull() {
            addCriterion("patient_fee_code is null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeIsNotNull() {
            addCriterion("patient_fee_code is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeEqualTo(String value) {
            addCriterion("patient_fee_code =", value, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeNotEqualTo(String value) {
            addCriterion("patient_fee_code <>", value, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeGreaterThan(String value) {
            addCriterion("patient_fee_code >", value, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("patient_fee_code >=", value, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeLessThan(String value) {
            addCriterion("patient_fee_code <", value, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeLessThanOrEqualTo(String value) {
            addCriterion("patient_fee_code <=", value, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeLike(String value) {
            addCriterion("patient_fee_code like", value, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeNotLike(String value) {
            addCriterion("patient_fee_code not like", value, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeIn(List<String> values) {
            addCriterion("patient_fee_code in", values, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeNotIn(List<String> values) {
            addCriterion("patient_fee_code not in", values, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeBetween(String value1, String value2) {
            addCriterion("patient_fee_code between", value1, value2, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andPatientFeeCodeNotBetween(String value1, String value2) {
            addCriterion("patient_fee_code not between", value1, value2, "patientFeeCode");
            return (Criteria) this;
        }

        public Criteria andDoctNoIsNull() {
            addCriterion("doct_no is null");
            return (Criteria) this;
        }

        public Criteria andDoctNoIsNotNull() {
            addCriterion("doct_no is not null");
            return (Criteria) this;
        }

        public Criteria andDoctNoEqualTo(String value) {
            addCriterion("doct_no =", value, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoNotEqualTo(String value) {
            addCriterion("doct_no <>", value, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoGreaterThan(String value) {
            addCriterion("doct_no >", value, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoGreaterThanOrEqualTo(String value) {
            addCriterion("doct_no >=", value, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoLessThan(String value) {
            addCriterion("doct_no <", value, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoLessThanOrEqualTo(String value) {
            addCriterion("doct_no <=", value, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoLike(String value) {
            addCriterion("doct_no like", value, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoNotLike(String value) {
            addCriterion("doct_no not like", value, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoIn(List<String> values) {
            addCriterion("doct_no in", values, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoNotIn(List<String> values) {
            addCriterion("doct_no not in", values, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoBetween(String value1, String value2) {
            addCriterion("doct_no between", value1, value2, "doctNo");
            return (Criteria) this;
        }

        public Criteria andDoctNoNotBetween(String value1, String value2) {
            addCriterion("doct_no not between", value1, value2, "doctNo");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIsNull() {
            addCriterion("medical_history is null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIsNotNull() {
            addCriterion("medical_history is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryEqualTo(String value) {
            addCriterion("medical_history =", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotEqualTo(String value) {
            addCriterion("medical_history <>", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryGreaterThan(String value) {
            addCriterion("medical_history >", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("medical_history >=", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLessThan(String value) {
            addCriterion("medical_history <", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLessThanOrEqualTo(String value) {
            addCriterion("medical_history <=", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryLike(String value) {
            addCriterion("medical_history like", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotLike(String value) {
            addCriterion("medical_history not like", value, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryIn(List<String> values) {
            addCriterion("medical_history in", values, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotIn(List<String> values) {
            addCriterion("medical_history not in", values, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryBetween(String value1, String value2) {
            addCriterion("medical_history between", value1, value2, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andMedicalHistoryNotBetween(String value1, String value2) {
            addCriterion("medical_history not between", value1, value2, "medicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIsNull() {
            addCriterion("past_history is null");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIsNotNull() {
            addCriterion("past_history is not null");
            return (Criteria) this;
        }

        public Criteria andPastHistoryEqualTo(String value) {
            addCriterion("past_history =", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotEqualTo(String value) {
            addCriterion("past_history <>", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryGreaterThan(String value) {
            addCriterion("past_history >", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("past_history >=", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLessThan(String value) {
            addCriterion("past_history <", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLessThanOrEqualTo(String value) {
            addCriterion("past_history <=", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryLike(String value) {
            addCriterion("past_history like", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotLike(String value) {
            addCriterion("past_history not like", value, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryIn(List<String> values) {
            addCriterion("past_history in", values, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotIn(List<String> values) {
            addCriterion("past_history not in", values, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryBetween(String value1, String value2) {
            addCriterion("past_history between", value1, value2, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andPastHistoryNotBetween(String value1, String value2) {
            addCriterion("past_history not between", value1, value2, "pastHistory");
            return (Criteria) this;
        }

        public Criteria andInspeResultIsNull() {
            addCriterion("inspe_result is null");
            return (Criteria) this;
        }

        public Criteria andInspeResultIsNotNull() {
            addCriterion("inspe_result is not null");
            return (Criteria) this;
        }

        public Criteria andInspeResultEqualTo(String value) {
            addCriterion("inspe_result =", value, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultNotEqualTo(String value) {
            addCriterion("inspe_result <>", value, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultGreaterThan(String value) {
            addCriterion("inspe_result >", value, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultGreaterThanOrEqualTo(String value) {
            addCriterion("inspe_result >=", value, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultLessThan(String value) {
            addCriterion("inspe_result <", value, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultLessThanOrEqualTo(String value) {
            addCriterion("inspe_result <=", value, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultLike(String value) {
            addCriterion("inspe_result like", value, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultNotLike(String value) {
            addCriterion("inspe_result not like", value, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultIn(List<String> values) {
            addCriterion("inspe_result in", values, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultNotIn(List<String> values) {
            addCriterion("inspe_result not in", values, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultBetween(String value1, String value2) {
            addCriterion("inspe_result between", value1, value2, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andInspeResultNotBetween(String value1, String value2) {
            addCriterion("inspe_result not between", value1, value2, "inspeResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsNull() {
            addCriterion("diagnose is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIsNotNull() {
            addCriterion("diagnose is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseEqualTo(String value) {
            addCriterion("diagnose =", value, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseNotEqualTo(String value) {
            addCriterion("diagnose <>", value, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseGreaterThan(String value) {
            addCriterion("diagnose >", value, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose >=", value, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLessThan(String value) {
            addCriterion("diagnose <", value, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLessThanOrEqualTo(String value) {
            addCriterion("diagnose <=", value, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseLike(String value) {
            addCriterion("diagnose like", value, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseNotLike(String value) {
            addCriterion("diagnose not like", value, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseIn(List<String> values) {
            addCriterion("diagnose in", values, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseNotIn(List<String> values) {
            addCriterion("diagnose not in", values, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseBetween(String value1, String value2) {
            addCriterion("diagnose between", value1, value2, "diagnose");
            return (Criteria) this;
        }

        public Criteria andDiagnoseNotBetween(String value1, String value2) {
            addCriterion("diagnose not between", value1, value2, "diagnose");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNull() {
            addCriterion("treatment is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNotNull() {
            addCriterion("treatment is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentEqualTo(String value) {
            addCriterion("treatment =", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotEqualTo(String value) {
            addCriterion("treatment <>", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThan(String value) {
            addCriterion("treatment >", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("treatment >=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThan(String value) {
            addCriterion("treatment <", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThanOrEqualTo(String value) {
            addCriterion("treatment <=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLike(String value) {
            addCriterion("treatment like", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotLike(String value) {
            addCriterion("treatment not like", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentIn(List<String> values) {
            addCriterion("treatment in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotIn(List<String> values) {
            addCriterion("treatment not in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentBetween(String value1, String value2) {
            addCriterion("treatment between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotBetween(String value1, String value2) {
            addCriterion("treatment not between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(LocalDateTime value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(LocalDateTime value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(LocalDateTime value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(LocalDateTime value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<LocalDateTime> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<LocalDateTime> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(LocalDateTime value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(LocalDateTime value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(LocalDateTime value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(LocalDateTime value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<LocalDateTime> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<LocalDateTime> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
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

        public Criteria andHospNoIsNull() {
            addCriterion("hosp_no is null");
            return (Criteria) this;
        }

        public Criteria andHospNoIsNotNull() {
            addCriterion("hosp_no is not null");
            return (Criteria) this;
        }

        public Criteria andHospNoEqualTo(String value) {
            addCriterion("hosp_no =", value, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoNotEqualTo(String value) {
            addCriterion("hosp_no <>", value, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoGreaterThan(String value) {
            addCriterion("hosp_no >", value, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoGreaterThanOrEqualTo(String value) {
            addCriterion("hosp_no >=", value, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoLessThan(String value) {
            addCriterion("hosp_no <", value, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoLessThanOrEqualTo(String value) {
            addCriterion("hosp_no <=", value, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoLike(String value) {
            addCriterion("hosp_no like", value, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoNotLike(String value) {
            addCriterion("hosp_no not like", value, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoIn(List<String> values) {
            addCriterion("hosp_no in", values, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoNotIn(List<String> values) {
            addCriterion("hosp_no not in", values, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoBetween(String value1, String value2) {
            addCriterion("hosp_no between", value1, value2, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNoNotBetween(String value1, String value2) {
            addCriterion("hosp_no not between", value1, value2, "hospNo");
            return (Criteria) this;
        }

        public Criteria andHospNameIsNull() {
            addCriterion("hosp_name is null");
            return (Criteria) this;
        }

        public Criteria andHospNameIsNotNull() {
            addCriterion("hosp_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospNameEqualTo(String value) {
            addCriterion("hosp_name =", value, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameNotEqualTo(String value) {
            addCriterion("hosp_name <>", value, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameGreaterThan(String value) {
            addCriterion("hosp_name >", value, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameGreaterThanOrEqualTo(String value) {
            addCriterion("hosp_name >=", value, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameLessThan(String value) {
            addCriterion("hosp_name <", value, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameLessThanOrEqualTo(String value) {
            addCriterion("hosp_name <=", value, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameLike(String value) {
            addCriterion("hosp_name like", value, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameNotLike(String value) {
            addCriterion("hosp_name not like", value, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameIn(List<String> values) {
            addCriterion("hosp_name in", values, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameNotIn(List<String> values) {
            addCriterion("hosp_name not in", values, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameBetween(String value1, String value2) {
            addCriterion("hosp_name between", value1, value2, "hospName");
            return (Criteria) this;
        }

        public Criteria andHospNameNotBetween(String value1, String value2) {
            addCriterion("hosp_name not between", value1, value2, "hospName");
            return (Criteria) this;
        }

        public Criteria andDoctNameIsNull() {
            addCriterion("doct_name is null");
            return (Criteria) this;
        }

        public Criteria andDoctNameIsNotNull() {
            addCriterion("doct_name is not null");
            return (Criteria) this;
        }

        public Criteria andDoctNameEqualTo(String value) {
            addCriterion("doct_name =", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameNotEqualTo(String value) {
            addCriterion("doct_name <>", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameGreaterThan(String value) {
            addCriterion("doct_name >", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameGreaterThanOrEqualTo(String value) {
            addCriterion("doct_name >=", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameLessThan(String value) {
            addCriterion("doct_name <", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameLessThanOrEqualTo(String value) {
            addCriterion("doct_name <=", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameLike(String value) {
            addCriterion("doct_name like", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameNotLike(String value) {
            addCriterion("doct_name not like", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameIn(List<String> values) {
            addCriterion("doct_name in", values, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameNotIn(List<String> values) {
            addCriterion("doct_name not in", values, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameBetween(String value1, String value2) {
            addCriterion("doct_name between", value1, value2, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameNotBetween(String value1, String value2) {
            addCriterion("doct_name not between", value1, value2, "doctName");
            return (Criteria) this;
        }

        public Criteria andSignStateIsNull() {
            addCriterion("sign_state is null");
            return (Criteria) this;
        }

        public Criteria andSignStateIsNotNull() {
            addCriterion("sign_state is not null");
            return (Criteria) this;
        }

        public Criteria andSignStateEqualTo(Byte value) {
            addCriterion("sign_state =", value, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateNotEqualTo(Byte value) {
            addCriterion("sign_state <>", value, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateGreaterThan(Byte value) {
            addCriterion("sign_state >", value, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_state >=", value, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateLessThan(Byte value) {
            addCriterion("sign_state <", value, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateLessThanOrEqualTo(Byte value) {
            addCriterion("sign_state <=", value, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateIn(List<Byte> values) {
            addCriterion("sign_state in", values, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateNotIn(List<Byte> values) {
            addCriterion("sign_state not in", values, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateBetween(Byte value1, Byte value2) {
            addCriterion("sign_state between", value1, value2, "signState");
            return (Criteria) this;
        }

        public Criteria andSignStateNotBetween(Byte value1, Byte value2) {
            addCriterion("sign_state not between", value1, value2, "signState");
            return (Criteria) this;
        }

        public Criteria andSignCodeIsNull() {
            addCriterion("sign_code is null");
            return (Criteria) this;
        }

        public Criteria andSignCodeIsNotNull() {
            addCriterion("sign_code is not null");
            return (Criteria) this;
        }

        public Criteria andSignCodeEqualTo(String value) {
            addCriterion("sign_code =", value, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeNotEqualTo(String value) {
            addCriterion("sign_code <>", value, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeGreaterThan(String value) {
            addCriterion("sign_code >", value, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sign_code >=", value, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeLessThan(String value) {
            addCriterion("sign_code <", value, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeLessThanOrEqualTo(String value) {
            addCriterion("sign_code <=", value, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeLike(String value) {
            addCriterion("sign_code like", value, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeNotLike(String value) {
            addCriterion("sign_code not like", value, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeIn(List<String> values) {
            addCriterion("sign_code in", values, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeNotIn(List<String> values) {
            addCriterion("sign_code not in", values, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeBetween(String value1, String value2) {
            addCriterion("sign_code between", value1, value2, "signCode");
            return (Criteria) this;
        }

        public Criteria andSignCodeNotBetween(String value1, String value2) {
            addCriterion("sign_code not between", value1, value2, "signCode");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreIsNull() {
            addCriterion("agreement_drugstore is null");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreIsNotNull() {
            addCriterion("agreement_drugstore is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreEqualTo(String value) {
            addCriterion("agreement_drugstore =", value, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreNotEqualTo(String value) {
            addCriterion("agreement_drugstore <>", value, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreGreaterThan(String value) {
            addCriterion("agreement_drugstore >", value, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreGreaterThanOrEqualTo(String value) {
            addCriterion("agreement_drugstore >=", value, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreLessThan(String value) {
            addCriterion("agreement_drugstore <", value, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreLessThanOrEqualTo(String value) {
            addCriterion("agreement_drugstore <=", value, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreLike(String value) {
            addCriterion("agreement_drugstore like", value, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreNotLike(String value) {
            addCriterion("agreement_drugstore not like", value, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreIn(List<String> values) {
            addCriterion("agreement_drugstore in", values, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreNotIn(List<String> values) {
            addCriterion("agreement_drugstore not in", values, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreBetween(String value1, String value2) {
            addCriterion("agreement_drugstore between", value1, value2, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andAgreementDrugstoreNotBetween(String value1, String value2) {
            addCriterion("agreement_drugstore not between", value1, value2, "agreementDrugstore");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoIsNull() {
            addCriterion("medical_treatment_combination_no is null");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoIsNotNull() {
            addCriterion("medical_treatment_combination_no is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoEqualTo(String value) {
            addCriterion("medical_treatment_combination_no =", value, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoNotEqualTo(String value) {
            addCriterion("medical_treatment_combination_no <>", value, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoGreaterThan(String value) {
            addCriterion("medical_treatment_combination_no >", value, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoGreaterThanOrEqualTo(String value) {
            addCriterion("medical_treatment_combination_no >=", value, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoLessThan(String value) {
            addCriterion("medical_treatment_combination_no <", value, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoLessThanOrEqualTo(String value) {
            addCriterion("medical_treatment_combination_no <=", value, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoLike(String value) {
            addCriterion("medical_treatment_combination_no like", value, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoNotLike(String value) {
            addCriterion("medical_treatment_combination_no not like", value, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoIn(List<String> values) {
            addCriterion("medical_treatment_combination_no in", values, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoNotIn(List<String> values) {
            addCriterion("medical_treatment_combination_no not in", values, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoBetween(String value1, String value2) {
            addCriterion("medical_treatment_combination_no between", value1, value2, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andMedicalTreatmentCombinationNoNotBetween(String value1, String value2) {
            addCriterion("medical_treatment_combination_no not between", value1, value2, "medicalTreatmentCombinationNo");
            return (Criteria) this;
        }

        public Criteria andSignedTypeIsNull() {
            addCriterion("signed_type is null");
            return (Criteria) this;
        }

        public Criteria andSignedTypeIsNotNull() {
            addCriterion("signed_type is not null");
            return (Criteria) this;
        }

        public Criteria andSignedTypeEqualTo(Byte value) {
            addCriterion("signed_type =", value, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeNotEqualTo(Byte value) {
            addCriterion("signed_type <>", value, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeGreaterThan(Byte value) {
            addCriterion("signed_type >", value, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("signed_type >=", value, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeLessThan(Byte value) {
            addCriterion("signed_type <", value, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeLessThanOrEqualTo(Byte value) {
            addCriterion("signed_type <=", value, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeIn(List<Byte> values) {
            addCriterion("signed_type in", values, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeNotIn(List<Byte> values) {
            addCriterion("signed_type not in", values, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeBetween(Byte value1, Byte value2) {
            addCriterion("signed_type between", value1, value2, "signedType");
            return (Criteria) this;
        }

        public Criteria andSignedTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("signed_type not between", value1, value2, "signedType");
            return (Criteria) this;
        }

        public Criteria andStopReasonIsNull() {
            addCriterion("stop_reason is null");
            return (Criteria) this;
        }

        public Criteria andStopReasonIsNotNull() {
            addCriterion("stop_reason is not null");
            return (Criteria) this;
        }

        public Criteria andStopReasonEqualTo(Byte value) {
            addCriterion("stop_reason =", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonNotEqualTo(Byte value) {
            addCriterion("stop_reason <>", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonGreaterThan(Byte value) {
            addCriterion("stop_reason >", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonGreaterThanOrEqualTo(Byte value) {
            addCriterion("stop_reason >=", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonLessThan(Byte value) {
            addCriterion("stop_reason <", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonLessThanOrEqualTo(Byte value) {
            addCriterion("stop_reason <=", value, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonIn(List<Byte> values) {
            addCriterion("stop_reason in", values, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonNotIn(List<Byte> values) {
            addCriterion("stop_reason not in", values, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonBetween(Byte value1, Byte value2) {
            addCriterion("stop_reason between", value1, value2, "stopReason");
            return (Criteria) this;
        }

        public Criteria andStopReasonNotBetween(Byte value1, Byte value2) {
            addCriterion("stop_reason not between", value1, value2, "stopReason");
            return (Criteria) this;
        }

        public Criteria andHmdNoIsNull() {
            addCriterion("hmd_no is null");
            return (Criteria) this;
        }

        public Criteria andHmdNoIsNotNull() {
            addCriterion("hmd_no is not null");
            return (Criteria) this;
        }

        public Criteria andHmdNoEqualTo(String value) {
            addCriterion("hmd_no =", value, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoNotEqualTo(String value) {
            addCriterion("hmd_no <>", value, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoGreaterThan(String value) {
            addCriterion("hmd_no >", value, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoGreaterThanOrEqualTo(String value) {
            addCriterion("hmd_no >=", value, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoLessThan(String value) {
            addCriterion("hmd_no <", value, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoLessThanOrEqualTo(String value) {
            addCriterion("hmd_no <=", value, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoLike(String value) {
            addCriterion("hmd_no like", value, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoNotLike(String value) {
            addCriterion("hmd_no not like", value, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoIn(List<String> values) {
            addCriterion("hmd_no in", values, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoNotIn(List<String> values) {
            addCriterion("hmd_no not in", values, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoBetween(String value1, String value2) {
            addCriterion("hmd_no between", value1, value2, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNoNotBetween(String value1, String value2) {
            addCriterion("hmd_no not between", value1, value2, "hmdNo");
            return (Criteria) this;
        }

        public Criteria andHmdNameIsNull() {
            addCriterion("hmd_name is null");
            return (Criteria) this;
        }

        public Criteria andHmdNameIsNotNull() {
            addCriterion("hmd_name is not null");
            return (Criteria) this;
        }

        public Criteria andHmdNameEqualTo(String value) {
            addCriterion("hmd_name =", value, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameNotEqualTo(String value) {
            addCriterion("hmd_name <>", value, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameGreaterThan(String value) {
            addCriterion("hmd_name >", value, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameGreaterThanOrEqualTo(String value) {
            addCriterion("hmd_name >=", value, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameLessThan(String value) {
            addCriterion("hmd_name <", value, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameLessThanOrEqualTo(String value) {
            addCriterion("hmd_name <=", value, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameLike(String value) {
            addCriterion("hmd_name like", value, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameNotLike(String value) {
            addCriterion("hmd_name not like", value, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameIn(List<String> values) {
            addCriterion("hmd_name in", values, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameNotIn(List<String> values) {
            addCriterion("hmd_name not in", values, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameBetween(String value1, String value2) {
            addCriterion("hmd_name between", value1, value2, "hmdName");
            return (Criteria) this;
        }

        public Criteria andHmdNameNotBetween(String value1, String value2) {
            addCriterion("hmd_name not between", value1, value2, "hmdName");
            return (Criteria) this;
        }

        public Criteria andSignSourceIsNull() {
            addCriterion("sign_source is null");
            return (Criteria) this;
        }

        public Criteria andSignSourceIsNotNull() {
            addCriterion("sign_source is not null");
            return (Criteria) this;
        }

        public Criteria andSignSourceEqualTo(Byte value) {
            addCriterion("sign_source =", value, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceNotEqualTo(Byte value) {
            addCriterion("sign_source <>", value, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceGreaterThan(Byte value) {
            addCriterion("sign_source >", value, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("sign_source >=", value, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceLessThan(Byte value) {
            addCriterion("sign_source <", value, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceLessThanOrEqualTo(Byte value) {
            addCriterion("sign_source <=", value, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceIn(List<Byte> values) {
            addCriterion("sign_source in", values, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceNotIn(List<Byte> values) {
            addCriterion("sign_source not in", values, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceBetween(Byte value1, Byte value2) {
            addCriterion("sign_source between", value1, value2, "signSource");
            return (Criteria) this;
        }

        public Criteria andSignSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("sign_source not between", value1, value2, "signSource");
            return (Criteria) this;
        }

        public Criteria andTerminateDateIsNull() {
            addCriterion("terminate_date is null");
            return (Criteria) this;
        }

        public Criteria andTerminateDateIsNotNull() {
            addCriterion("terminate_date is not null");
            return (Criteria) this;
        }

        public Criteria andTerminateDateEqualTo(LocalDateTime value) {
            addCriterion("terminate_date =", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateNotEqualTo(LocalDateTime value) {
            addCriterion("terminate_date <>", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateGreaterThan(LocalDateTime value) {
            addCriterion("terminate_date >", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("terminate_date >=", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateLessThan(LocalDateTime value) {
            addCriterion("terminate_date <", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("terminate_date <=", value, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateIn(List<LocalDateTime> values) {
            addCriterion("terminate_date in", values, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateNotIn(List<LocalDateTime> values) {
            addCriterion("terminate_date not in", values, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("terminate_date between", value1, value2, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andTerminateDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("terminate_date not between", value1, value2, "terminateDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(LocalDateTime value) {
            addCriterion("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(LocalDateTime value) {
            addCriterion("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(LocalDateTime value) {
            addCriterion("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(LocalDateTime value) {
            addCriterion("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<LocalDateTime> values) {
            addCriterion("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<LocalDateTime> values) {
            addCriterion("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andHospLevelIsNull() {
            addCriterion("hosp_level is null");
            return (Criteria) this;
        }

        public Criteria andHospLevelIsNotNull() {
            addCriterion("hosp_level is not null");
            return (Criteria) this;
        }

        public Criteria andHospLevelEqualTo(String value) {
            addCriterion("hosp_level =", value, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelNotEqualTo(String value) {
            addCriterion("hosp_level <>", value, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelGreaterThan(String value) {
            addCriterion("hosp_level >", value, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelGreaterThanOrEqualTo(String value) {
            addCriterion("hosp_level >=", value, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelLessThan(String value) {
            addCriterion("hosp_level <", value, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelLessThanOrEqualTo(String value) {
            addCriterion("hosp_level <=", value, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelLike(String value) {
            addCriterion("hosp_level like", value, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelNotLike(String value) {
            addCriterion("hosp_level not like", value, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelIn(List<String> values) {
            addCriterion("hosp_level in", values, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelNotIn(List<String> values) {
            addCriterion("hosp_level not in", values, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelBetween(String value1, String value2) {
            addCriterion("hosp_level between", value1, value2, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospLevelNotBetween(String value1, String value2) {
            addCriterion("hosp_level not between", value1, value2, "hospLevel");
            return (Criteria) this;
        }

        public Criteria andHospTypeIsNull() {
            addCriterion("hosp_type is null");
            return (Criteria) this;
        }

        public Criteria andHospTypeIsNotNull() {
            addCriterion("hosp_type is not null");
            return (Criteria) this;
        }

        public Criteria andHospTypeEqualTo(String value) {
            addCriterion("hosp_type =", value, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeNotEqualTo(String value) {
            addCriterion("hosp_type <>", value, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeGreaterThan(String value) {
            addCriterion("hosp_type >", value, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hosp_type >=", value, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeLessThan(String value) {
            addCriterion("hosp_type <", value, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeLessThanOrEqualTo(String value) {
            addCriterion("hosp_type <=", value, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeLike(String value) {
            addCriterion("hosp_type like", value, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeNotLike(String value) {
            addCriterion("hosp_type not like", value, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeIn(List<String> values) {
            addCriterion("hosp_type in", values, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeNotIn(List<String> values) {
            addCriterion("hosp_type not in", values, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeBetween(String value1, String value2) {
            addCriterion("hosp_type between", value1, value2, "hospType");
            return (Criteria) this;
        }

        public Criteria andHospTypeNotBetween(String value1, String value2) {
            addCriterion("hosp_type not between", value1, value2, "hospType");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkIsNull() {
            addCriterion("cancel_reason_remark is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkIsNotNull() {
            addCriterion("cancel_reason_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkEqualTo(String value) {
            addCriterion("cancel_reason_remark =", value, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkNotEqualTo(String value) {
            addCriterion("cancel_reason_remark <>", value, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkGreaterThan(String value) {
            addCriterion("cancel_reason_remark >", value, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason_remark >=", value, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkLessThan(String value) {
            addCriterion("cancel_reason_remark <", value, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason_remark <=", value, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkLike(String value) {
            addCriterion("cancel_reason_remark like", value, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkNotLike(String value) {
            addCriterion("cancel_reason_remark not like", value, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkIn(List<String> values) {
            addCriterion("cancel_reason_remark in", values, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkNotIn(List<String> values) {
            addCriterion("cancel_reason_remark not in", values, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkBetween(String value1, String value2) {
            addCriterion("cancel_reason_remark between", value1, value2, "cancelReasonRemark");
            return (Criteria) this;
        }

        public Criteria andCancelReasonRemarkNotBetween(String value1, String value2) {
            addCriterion("cancel_reason_remark not between", value1, value2, "cancelReasonRemark");
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