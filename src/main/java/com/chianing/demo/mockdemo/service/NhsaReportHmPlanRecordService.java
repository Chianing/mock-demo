package com.chianing.demo.mockdemo.service;

import com.chianing.demo.mockdemo.model.dto.NhsaReportHmPlanRecordDto;
import com.chianing.demo.mockdemo.model.query.NhsaReportHmPlanRecordQuery;

import java.util.List;

/**
 * @author chianing
 * @description TODO
 * @date 2024/06/19 14:51
 */
public interface NhsaReportHmPlanRecordService {

    Long insert(NhsaReportHmPlanRecordDto model);

    int deleteByPkId(Long pkId);

    void update(NhsaReportHmPlanRecordDto model);

    List<NhsaReportHmPlanRecordDto> select(NhsaReportHmPlanRecordQuery query);

}
