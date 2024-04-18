package com.zenq.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenq.ssm.entity.Admin;
import com.zenq.ssm.mapper.AdminMapper;

@Service
public class AdminService {

	@Autowired
	private AdminMapper AdminMapper;

	/**
	 * 添加管理员
	 * 
	 * @param Admin
	 * @return
	 */
	public int add(Admin Admin) {
		int result = 0;
		AdminMapper.insert(Admin);
		return result;
	}

	// 管理员登录
	public Admin login(Admin loginadmin) {
		Admin admin = AdminMapper.selectByadminid(loginadmin.getAdminId());
		if (admin != null) {
			if (admin.getAdminPwd().equals(loginadmin.getAdminPwd())) {
				return admin;
			}
		}
		return null;
	}
}
