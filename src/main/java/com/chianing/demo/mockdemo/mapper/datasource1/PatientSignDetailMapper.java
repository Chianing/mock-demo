package com.chianing.demo.mockdemo.mapper.datasource1;

import com.chianing.demo.mockdemo.mapper.datasource1.example.PatientSignDetailExample;
import com.chianing.demo.mockdemo.model.entity.PatientSignDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientSignDetailMapper {
    long countByExample(PatientSignDetailExample example);

    int deleteByExample(PatientSignDetailExample example);

    int deleteByPrimaryKey(Long pkId);

    int insert(PatientSignDetail row);

    int insertSelective(PatientSignDetail row);

    List<PatientSignDetail> selectByExample(PatientSignDetailExample example);

    PatientSignDetail selectByPrimaryKey(Long pkId);

    int updateByExampleSelective(@Param("row") PatientSignDetail row, @Param("example") PatientSignDetailExample example);

    int updateByExample(@Param("row") PatientSignDetail row, @Param("example") PatientSignDetailExample example);

    int updateByPrimaryKeySelective(PatientSignDetail row);

    int updateByPrimaryKey(PatientSignDetail row);
}