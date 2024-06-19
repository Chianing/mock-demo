package com.chianing.demo.mockdemo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author chianing
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PatientSignDetail implements Serializable {
    private Long pkId;

    private String id;

    private String patientIdentifyCardNo;

    private String patientName;

    private Byte patientSex;

    private Byte patientAge;

    private String patientPhone;

    private String address;

    private String community;

    private String patientCode;

    private Byte insuranceType;

    private String patientFeeCode;

    private String doctNo;

    private String medicalHistory;

    private String pastHistory;

    private String inspeResult;

    private String diagnose;

    private String treatment;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private LocalDateTime gmtCreated;

    private LocalDateTime gmtModified;

    private LocalDateTime gmtDeleted;

    private Byte isDeleted;

    private String hospNo;

    private String hospName;

    private String doctName;

    private Byte signState;

    private String signCode;

    private String cancelReason;

    private String agreementDrugstore;

    private String medicalTreatmentCombinationNo;

    private Byte signedType;

    private Byte stopReason;

    private String hmdNo;

    private String hmdName;

    private Byte signSource;

    private LocalDateTime terminateDate;

    private LocalDateTime signDate;

    private String hospLevel;

    private String hospType;

    private String cancelReasonRemark;

    @Serial
    private static final long serialVersionUID = 1L;

}