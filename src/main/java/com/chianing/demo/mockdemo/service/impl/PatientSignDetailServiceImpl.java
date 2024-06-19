package com.chianing.demo.mockdemo.service.impl;

import com.chianing.demo.mockdemo.mapper.datasource1.PatientSignDetailMapper;
import com.chianing.demo.mockdemo.mapper.datasource1.example.PatientSignDetailExample;
import com.chianing.demo.mockdemo.model.dto.PatientSignDetailDto;
import com.chianing.demo.mockdemo.model.entity.PatientSignDetail;
import com.chianing.demo.mockdemo.model.query.PatientSignDetailQuery;
import com.chianing.demo.mockdemo.service.BaseService;
import com.chianing.demo.mockdemo.service.PatientSignDetailService;
import com.chianing.demo.mockdemo.util.CheckEmptyUtil;
import com.google.common.base.Preconditions;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chianing
 * @description TODO
 * @date 2024/06/19 14:51
 */
@Service
public class PatientSignDetailServiceImpl extends BaseService implements PatientSignDetailService {

    @Resource
    private PatientSignDetailMapper patientSignDetailMapper;

    @Override
    public Long insert(PatientSignDetailDto model) {
        PatientSignDetail dbModel = copyProperties(model, PatientSignDetail.class);
        patientSignDetailMapper.insertSelective(dbModel);
        return dbModel.getPkId();
    }

    @Override
    public int deleteByPkId(Long pkId) {
        if (CheckEmptyUtil.isEmpty(pkId)) {
            return 0;
        }
        return patientSignDetailMapper.deleteByPrimaryKey(pkId);
    }

    @Override
    public void update(PatientSignDetailDto model) {
        Preconditions.checkArgument(CheckEmptyUtil.isNotEmpty(model) &&
                                    CheckEmptyUtil.isNotEmpty(model.getPkId()), "data or pkId can not be empty");
        patientSignDetailMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public PatientSignDetailDto selectByPkId(Long pkId) {
        return copyProperties(patientSignDetailMapper.selectByPrimaryKey(pkId), PatientSignDetailDto.class);
    }

    @Override
    public List<PatientSignDetailDto> select(PatientSignDetailQuery query) {
        PatientSignDetailExample example = new PatientSignDetailExample();
        PatientSignDetailExample.Criteria criteria = example.createCriteria();
        if (CheckEmptyUtil.isNotEmpty(query.getPkId())) {
            criteria.andPkIdEqualTo(query.getPkId());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getId())) {
            criteria.andIdEqualTo(query.getId());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getPatientIdentifyCardNo())) {
            criteria.andPatientIdentifyCardNoEqualTo(query.getPatientIdentifyCardNo());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getPatientName())) {
            criteria.andPatientNameEqualTo(query.getPatientName());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getPatientSex())) {
            criteria.andPatientSexEqualTo(query.getPatientSex());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getPatientCode())) {
            criteria.andPatientCodeEqualTo(query.getPatientCode());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getInsuranceType())) {
            criteria.andInsuranceTypeEqualTo(query.getInsuranceType());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getDoctNo())) {
            criteria.andDoctNoEqualTo(query.getDoctNo());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getDoctNo())) {
            criteria.andDoctNoEqualTo(query.getDoctNo());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getIsDeleted())) {
            criteria.andIsDeletedEqualTo(query.getIsDeleted());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getHospNo())) {
            criteria.andHospNoEqualTo(query.getHospNo());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getHospName())) {
            criteria.andHospNameEqualTo(query.getHospName());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getDoctName())) {
            criteria.andDoctNameEqualTo(query.getDoctName());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getSignState())) {
            criteria.andSignStateEqualTo(query.getSignState());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getSignCode())) {
            criteria.andSignCodeEqualTo(query.getSignCode());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getSignedType())) {
            criteria.andSignedTypeEqualTo(query.getSignedType());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getHmdNo())) {
            criteria.andHmdNoEqualTo(query.getHmdNo());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getHmdName())) {
            criteria.andHmdNameEqualTo(query.getHmdName());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getSignSource())) {
            criteria.andSignSourceEqualTo(query.getSignSource());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getHospLevel())) {
            criteria.andHospLevelEqualTo(query.getHospLevel());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getHospType())) {
            criteria.andHospTypeEqualTo(query.getHospType());
        }

        return copyProperties(patientSignDetailMapper.selectByExample(example), PatientSignDetailDto.class);
    }
}
