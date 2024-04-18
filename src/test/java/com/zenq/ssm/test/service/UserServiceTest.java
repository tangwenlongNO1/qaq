package com.zenq.ssm.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zenq.ssm.entity.User;
import com.zenq.ssm.service.UserService;
import com.zenq.ssm.test.BaseTest;


public class UserServiceTest extends BaseTest{

	@Autowired
	private UserService userService;
	
	@Test
	public void testRegist() {
		// 可以完成注册功能
		User user = new User();
		user.setUserId("zenq");
		user.setUserPwd("zenq123");
		user.setRealname("ii");
		// 测试逻辑是否通畅
		int result = userService.regist(user);
		System.out.println(result);
		//也可以使用Junit中断言
	}
}
