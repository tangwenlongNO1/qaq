package com.zenq.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zenq.ssm.entity.Blog;
import com.zenq.ssm.mapper.BlogMapper;

@Service
public class BlogService {

	@Autowired
	private BlogMapper BlogMapper;
	/**
	 * 添加帖子
	 * @param Blog
	 * @return
	 */
	public int add(Blog Blog) {
		int result =0;
		BlogMapper.insert(Blog);
		return result;
	}
	/**
	 * 修改问题
	 * @param Blog
	 * @return
	 */
	public int update(Blog Blog) {
		return BlogMapper.updateByPrimaryKey(Blog);
	}
	/**
	 * 根据主键查询单个帖子
	 * @param BlogId
	 * @return
	 */
	public Blog getById(int BlogId) {
		return BlogMapper.selectByPrimaryKey(BlogId);
	}
	/**
	 * 修改帖子状态
	 * @param Blog
	 * @return
	 */
	public int updateStatus(Blog Blog) {
		return BlogMapper.updateByPrimaryKeySelective(Blog);
	}
	/**
	 * 分页查询帖子
	 * @param p
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<Blog> getBlogPage(Blog b, int page, int rows) {
		PageHelper.startPage(page, rows);
		return BlogMapper.selectByCondition(b);
	}
	
	public List<Blog> getBlogPage1(Blog b, int page, int rows) {
		PageHelper.startPage(page, rows);
		return BlogMapper.select(b);
	}
}
