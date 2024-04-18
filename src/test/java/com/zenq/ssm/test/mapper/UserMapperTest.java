package com.zenq.ssm.test.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zenq.ssm.entity.User;
import com.zenq.ssm.mapper.UserMapper;
import com.zenq.ssm.test.BaseTest;

public class UserMapperTest extends BaseTest {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void testInsert() {
		// 可以完成注册功能
		User user = new User();
		user.setUserId("jack");
		user.setUserPwd("123");
		userMapper.insert(user);
	}
}
