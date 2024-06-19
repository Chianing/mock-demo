package com.chianing.demo.mockdemo.service;

import com.alibaba.fastjson2.JSONObject;
import com.chianing.demo.mockdemo.model.dto.PatientSignDetailDto;
import com.chianing.demo.mockdemo.util.CheckEmptyUtil;
import com.google.common.base.Preconditions;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author chianing
 * @description TODO
 * @date 2024/06/19 15:59
 */
@Slf4j
@Service
public class DebugService extends BaseService {

    private static final OkHttpClient OK_HTTP_CLIENT;

    static {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS);
        clientBuilder.setConnectionPool$okhttp(new ConnectionPool(16, 3, TimeUnit.MINUTES));
        OK_HTTP_CLIENT = clientBuilder.build();
    }

    @Value("${outer-api.hcare-supervise.host}")
    private String hcareSuperviseHost;
    @Value("${outer-api.hcare-supervise.nhsaginstatus}")
    private String hcareSupervisenHsaginstatusUrl;

    @Resource
    private PatientSignDetailService patientSignDetailService;
    @Resource
    private NhsaReportHmPlanRecordService nhsaReportHmPlanRecordService;

    public String doMock(Long patientPkId) {
        // 1. update patient_sign_detail
        PatientSignDetailDto patientSignDetailDto = patientSignDetailService.selectByPkId(patientPkId);
        Preconditions.checkArgument(CheckEmptyUtil.isNotEmpty(patientSignDetailDto), "record not exist");
        LocalDateTime signDate = LocalDateTime.of(LocalDate.now().plusDays(-30), LocalTime.MIN);
        patientSignDetailDto.setSignDate(signDate)
                .setGmtModified(LocalDateTime.now());
        patientSignDetailService.update(patientSignDetailDto);

        // 2. delete record
        // TODO: 2024/6/19 mock
        nhsaReportHmPlanRecordService.deleteByPkId(0L);

        // 3. invoke interface
        // TODO: 2024/6/19 update application.properties, select request method
        String url = hcareSuperviseHost + hcareSupervisenHsaginstatusUrl;
        String taskStatus = "";

        // http get
        // taskStatus = executeHttpGet(url);

        // or http post, assemble params
        Map<String, Object> paramMap = new HashMap<>() {{
            put("id", 1);
        }};
        taskStatus = executeHttpPost(JSONObject.toJSONString(paramMap), url);

        // 4. query task status

        return taskStatus;
    }

    private static String executeHttpPost(String queryParamStr, String url) {
        return executeHttpRequest(new Request.Builder()
                .header("Accept", MediaType.APPLICATION_JSON_VALUE)
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .put(RequestBody.create(okhttp3.MediaType.parse(MediaType.APPLICATION_JSON_VALUE), queryParamStr))
                .url(url)
                .build());
    }

    private static String executeHttpGet(String url) {
        return executeHttpRequest(new Request.Builder()
                .header("Accept", MediaType.APPLICATION_JSON_VALUE)
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .get()
                .url(url)
                .build());

    }

    private static String executeHttpRequest(Request request) {
        try (Response response = OK_HTTP_CLIENT.newCall(request).execute()) {
            Preconditions.checkArgument(CheckEmptyUtil.isNotEmpty(response.body()), "response body not exist");
            return response.body().string();
        } catch (Exception e) {
            log.error("execute http get error", e);
            throw new RuntimeException("outer api invoked failed");
        }
    }

}
