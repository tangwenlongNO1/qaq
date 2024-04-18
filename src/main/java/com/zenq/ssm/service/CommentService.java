package com.zenq.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zenq.ssm.entity.Comment;
import com.zenq.ssm.mapper.CommentMapper;

@Service
public class CommentService {

	@Autowired
	private CommentMapper CommentMapper;
	/**
	 * 添加评论
	 * @param Comment
	 * @return
	 */
	public int add(Comment Comment) {
		int result =0;
		CommentMapper.insert(Comment);
		return result;
	}
	/**
	 * 修改问题
	 * @param Comment
	 * @return
	 */
	public int update(Comment Comment) {
		return CommentMapper.updateByPrimaryKey(Comment);
	}
	/**
	 * 根据主键查询单个评论
	 * @param CommentId
	 * @return
	 */
	public Comment getById(int CommentId) {
		return CommentMapper.selectByPrimaryKey(CommentId);
	}
	/**
	 * 修改评论状态
	 * @param Comment
	 * @return
	 */
	public int updateStatus(Comment Comment) {
		return CommentMapper.updateByPrimaryKeySelective(Comment);
	}
	/**
	 * 分页查询评论
	 * @param p
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<Comment> getCommentPage(Comment c, int page, int rows) {
		PageHelper.startPage(page, rows);
		return CommentMapper.select(c);
	}
	
//	public List<Comment> getCommentPage1(Comment b, int page, int rows) {
//		PageHelper.startPage(page, rows);
//		return CommentMapper.select(b);
//	}
}

