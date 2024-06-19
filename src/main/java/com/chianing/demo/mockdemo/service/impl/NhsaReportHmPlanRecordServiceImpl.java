package com.chianing.demo.mockdemo.service.impl;

import com.chianing.demo.mockdemo.mapper.datasource2.NhsaReportHmPlanRecordMapper;
import com.chianing.demo.mockdemo.mapper.datasource2.example.NhsaReportHmPlanRecordExample;
import com.chianing.demo.mockdemo.model.dto.NhsaReportHmPlanRecordDto;
import com.chianing.demo.mockdemo.model.entity.NhsaReportHmPlanRecord;
import com.chianing.demo.mockdemo.model.query.NhsaReportHmPlanRecordQuery;
import com.chianing.demo.mockdemo.service.BaseService;
import com.chianing.demo.mockdemo.service.NhsaReportHmPlanRecordService;
import com.chianing.demo.mockdemo.util.CheckEmptyUtil;
import com.google.common.base.Preconditions;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chianing
 * @description TODO
 * @date 2024/06/19 14:53
 */
@Service
public class NhsaReportHmPlanRecordServiceImpl extends BaseService implements NhsaReportHmPlanRecordService {

    @Resource
    private NhsaReportHmPlanRecordMapper nhsaReportHmPlanRecordMapper;

    @Override
    public Long insert(NhsaReportHmPlanRecordDto model) {
        NhsaReportHmPlanRecord dbModel = copyProperties(model, NhsaReportHmPlanRecord.class);
        nhsaReportHmPlanRecordMapper.insertSelective(dbModel);
        return dbModel.getPkId();
    }

    @Override
    public int deleteByPkId(Long pkId) {
        if (CheckEmptyUtil.isEmpty(pkId)) {
            return 0;
        }
        return nhsaReportHmPlanRecordMapper.deleteByPrimaryKey(pkId);
    }

    @Override
    public void update(NhsaReportHmPlanRecordDto model) {
        Preconditions.checkArgument(CheckEmptyUtil.isNotEmpty(model) &&
                                    CheckEmptyUtil.isNotEmpty(model.getPkId()), "data or pkId can not be empty");
        nhsaReportHmPlanRecordMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public List<NhsaReportHmPlanRecordDto> select(NhsaReportHmPlanRecordQuery query) {
        NhsaReportHmPlanRecordExample example = new NhsaReportHmPlanRecordExample();
        NhsaReportHmPlanRecordExample.Criteria criteria = example.createCriteria();
        if (CheckEmptyUtil.isNotEmpty(query.getPkId())) {
            criteria.andPkIdEqualTo(query.getPkId());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getId())) {
            criteria.andIdEqualTo(query.getId());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getCardNo())) {
            criteria.andCardNoEqualTo(query.getCardNo());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getSignRecordCode())) {
            criteria.andSignRecordCodeEqualTo(query.getSignRecordCode());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getPlanType())) {
            criteria.andPlanTypeEqualTo(query.getPlanType());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getGroupManagementCode())) {
            criteria.andGroupManagementCodeEqualTo(query.getGroupManagementCode());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getStatusCode())) {
            criteria.andStatusCodeEqualTo(query.getStatusCode());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getCreator())) {
            criteria.andCreatorEqualTo(query.getCreator());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getOperator())) {
            criteria.andOperatorEqualTo(query.getOperator());
        }
        if (CheckEmptyUtil.isNotEmpty(query.getIsDeleted())) {
            criteria.andIsDeletedEqualTo(query.getIsDeleted());
        }

        return copyProperties(nhsaReportHmPlanRecordMapper.selectByExample(example), NhsaReportHmPlanRecordDto.class);
    }
}
