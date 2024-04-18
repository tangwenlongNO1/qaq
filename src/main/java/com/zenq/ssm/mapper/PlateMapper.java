package com.zenq.ssm.mapper;

import com.zenq.ssm.entity.Plate;

public interface PlateMapper {
    int deleteByPrimaryKey(Integer plateId);

    int insert(Plate record);

    int insertSelective(Plate record);

    Plate selectByPrimaryKey(Integer plateId);

    int updateByPrimaryKeySelective(Plate record);

    int updateByPrimaryKey(Plate record);
}