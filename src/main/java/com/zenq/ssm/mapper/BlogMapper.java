package com.zenq.ssm.mapper;

import java.util.List;

import com.zenq.ssm.entity.Blog;


public interface BlogMapper {
    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);
    
    List<Blog> selectByCondition(Blog record);
    
    List<Blog> select(Blog record);
}