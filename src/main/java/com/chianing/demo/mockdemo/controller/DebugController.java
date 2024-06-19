package com.chianing.demo.mockdemo.controller;

import com.alibaba.fastjson2.JSONObject;
import com.chianing.demo.mockdemo.mapper.datasource1.PatientSignDetailMapper;
import com.chianing.demo.mockdemo.mapper.datasource2.NhsaReportHmPlanRecordMapper;
import com.chianing.demo.mockdemo.model.vo.ResultVo;
import com.chianing.demo.mockdemo.service.DebugService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chianing
 * @description TODO
 * @date 2024/06/19 13:42
 */
@Slf4j
@RestController
@RequestMapping("/debug")
public class DebugController {

    @Resource
    private DebugService debugService;
    @Resource
    private PatientSignDetailMapper patientSignDetailMapper;
    @Resource
    private NhsaReportHmPlanRecordMapper nhsaReportHmPlanRecordMapper;

    @GetMapping("/testQueryDatasource1")
    public ResultVo<String> testQueryDatasource1() {
        try {
            return ResultVo.success(JSONObject.toJSONString(patientSignDetailMapper.selectByPrimaryKey(1L)));
        } catch (Exception e) {
            log.error("test query datasource1 error", e);
            return ResultVo.failed(e.getMessage());
        }
    }

    @GetMapping("/testQueryDatasource2")
    public ResultVo<String> testQueryDatasource2() {
        try {
            return ResultVo.success(JSONObject.toJSONString(nhsaReportHmPlanRecordMapper.selectByPrimaryKey(1L)));
        } catch (Exception e) {
            log.error("test query datasource2 error", e);
            return ResultVo.failed(e.getMessage());
        }
    }

    @GetMapping("/doMock")
    public ResultVo<String> doMock(@RequestParam Long pkId) {
        try {
            return ResultVo.success(debugService.doMock(pkId));
        } catch (Exception e) {
            log.error("do mock error, pkId: {}", pkId, e);
            return ResultVo.failed(e.getMessage());
        }
    }

}
