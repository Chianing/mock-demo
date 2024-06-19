package com.chianing.demo.mockdemo.model.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author chianing
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PatientSignDetailQuery implements Serializable {
    private Long pkId;

    private String id;

    private String patientIdentifyCardNo;

    private String patientName;

    private Byte patientSex;

    private String patientCode;

    private Byte insuranceType;

    private String patientFeeCode;

    private String doctNo;

    private Byte isDeleted;

    private String hospNo;

    private String hospName;

    private String doctName;

    private Byte signState;

    private String signCode;

    private Byte signedType;

    private String hmdNo;

    private String hmdName;

    private Byte signSource;

    private String hospLevel;

    private String hospType;

    @Serial
    private static final long serialVersionUID = 1L;

}