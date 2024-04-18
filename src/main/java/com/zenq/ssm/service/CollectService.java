package com.zenq.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zenq.ssm.entity.Collect;
import com.zenq.ssm.mapper.CollectMapper;

@Service
public class CollectService {

	@Autowired
	private CollectMapper CollectMapper;
	/**
	 * 添加收藏
	 * @param Collect
	 * @return
	 */
	public int add(Collect Collect) {
		int result =0;
		CollectMapper.insert(Collect);
		return result;
	}
	/**
	 * 修改收藏
	 * @param Collect
	 * @return
	 */
	public int update(Collect Collect) {
		return CollectMapper.updateByPrimaryKey(Collect);
	}
	/**
	 * 根据主键查询单个收藏
	 * @param CollectId
	 * @return
	 */
	public Collect getById(int CollectId) {
		return CollectMapper.selectByPrimaryKey(CollectId);
	}
	/**
	 * 修改收藏状态
	 * @param Collect
	 * @return
	 */
	public int updateStatus(Collect Collect) {
		return CollectMapper.updateByPrimaryKeySelective(Collect);
	}
	/**
	 * 分页查询
	 * @param p
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<Collect> getCollectPage(Collect b, int page, int rows) {
		PageHelper.startPage(page, rows);
		return CollectMapper.selectByCondition(b);
	}
	
	public List<Collect> getCollectPage1(Collect b, int page, int rows) {
		PageHelper.startPage(page, rows);
		return CollectMapper.select(b);
	}
}
