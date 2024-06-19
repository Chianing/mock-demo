package com.chianing.demo.mockdemo.mapper.datasource2;

import com.chianing.demo.mockdemo.mapper.datasource2.example.NhsaReportHmPlanRecordExample;
import com.chianing.demo.mockdemo.model.entity.NhsaReportHmPlanRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NhsaReportHmPlanRecordMapper {
    long countByExample(NhsaReportHmPlanRecordExample example);

    int deleteByExample(NhsaReportHmPlanRecordExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(NhsaReportHmPlanRecord row);

    int insertSelective(NhsaReportHmPlanRecord row);

    List<NhsaReportHmPlanRecord> selectByExampleWithBLOBs(NhsaReportHmPlanRecordExample example);

    List<NhsaReportHmPlanRecord> selectByExample(NhsaReportHmPlanRecordExample example);

    NhsaReportHmPlanRecord selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("row") NhsaReportHmPlanRecord row, @Param("example") NhsaReportHmPlanRecordExample example);

    int updateByExampleWithBLOBs(@Param("row") NhsaReportHmPlanRecord row, @Param("example") NhsaReportHmPlanRecordExample example);

    int updateByExample(@Param("row") NhsaReportHmPlanRecord row, @Param("example") NhsaReportHmPlanRecordExample example);

    int updateByPrimaryKeySelective(NhsaReportHmPlanRecord row);

    int updateByPrimaryKeyWithBLOBs(NhsaReportHmPlanRecord row);

    int updateByPrimaryKey(NhsaReportHmPlanRecord row);
}