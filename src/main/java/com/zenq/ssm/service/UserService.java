package com.zenq.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zenq.ssm.entity.User;
import com.zenq.ssm.mapper.UserMapper;

// Spring会把使用Service注解标注的类，当做一个Service组件来进行处理。
@Service
public class UserService {
	// 根据类型进行匹配
	@Autowired
	private UserMapper userMapper;
	
	// 用户注册
	public int regist(User user) {
		// 可能有其他业务逻辑....如验证，用户名已经存在验证.....
		int result = 0;
//		if (用户名存在) {
//			result = 1;
//		}
		userMapper.insert(user);
		return result;
	}
	//用户登录
	public User login(User loginUser) {
		User user = userMapper.selectByUsername(loginUser.getUserId());
		if (user != null) {
			if (user.getUserPwd().equals(loginUser.getUserPwd())) {
				return user;
			}
		}
		return null;
	}
	
	// 用户修改密码
		public int update(User user) {
			// 可能有其他业务逻辑....如验证，用户名已经存在验证.....
			int result = 0;
//			if (用户名存在) {
//				result = 1;
//			}
			userMapper.updateByCondition(user);
			return result;
		}
	
}
