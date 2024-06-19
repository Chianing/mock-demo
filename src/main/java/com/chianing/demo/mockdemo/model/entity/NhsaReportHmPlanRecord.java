package com.chianing.demo.mockdemo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author chianing
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class NhsaReportHmPlanRecord implements Serializable {
    private Long pkId;

    private String id;

    private String cardNo;

    private String signRecordCode;

    private Byte planType;

    private String groupManagementCode;

    private Byte statusCode;

    private String statusDesc;

    private String apiRecordId;

    private String creator;

    private String operator;

    private LocalDateTime gmtCreated;

    private LocalDateTime gmtModified;

    private LocalDateTime gmtDeleted;

    private Byte isDeleted;

    private String signRecordSnapshotId;

    private String otherBizCode;

    private String hospitalCode;

    private String dataCheckDoctor;

    private LocalDate followupDate;

    private Integer cycleNo;

    private LocalDateTime bizDate;

    private LocalDateTime taskGmtCreated;

    private String content;

    @Serial
    private static final long serialVersionUID = 1L;

}