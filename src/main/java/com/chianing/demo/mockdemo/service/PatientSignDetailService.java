package com.chianing.demo.mockdemo.service;

import com.chianing.demo.mockdemo.model.dto.PatientSignDetailDto;
import com.chianing.demo.mockdemo.model.query.PatientSignDetailQuery;

import java.util.List;

/**
 * @author chianing
 * @description TODO
 * @date 2024/06/19 14:51
 */
public interface PatientSignDetailService {

    Long insert(PatientSignDetailDto model);

    int deleteByPkId(Long pkId);

    void update(PatientSignDetailDto model);

    PatientSignDetailDto selectByPkId(Long pkId);

    List<PatientSignDetailDto> select(PatientSignDetailQuery query);

}
