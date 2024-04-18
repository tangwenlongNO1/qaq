package com.zenq.ssm.mapper;

import com.zenq.ssm.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int updateByCondition(User record);
    
    User selectByUsername(String username);
}