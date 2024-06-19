package com.chianing.demo.mockdemo.model.query;

import lombok.Data;

/**
 * @author chianing
 * @description TODO
 * @date 2024/06/19 15:38
 */
@Data
public class NhsaReportHmPlanRecordQuery {
    private Long pkId;

    private String id;

    private String cardNo;

    private String signRecordCode;

    private Byte planType;

    private String groupManagementCode;

    private Byte statusCode;

    private String creator;

    private String operator;

    private Byte isDeleted;

}
