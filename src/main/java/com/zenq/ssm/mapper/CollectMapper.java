package com.zenq.ssm.mapper;

import java.util.List;


import com.zenq.ssm.entity.Collect;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer collectId);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer collectId);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
    
    List<Collect> selectByCondition(Collect record);
    
    List<Collect> select(Collect record);
}