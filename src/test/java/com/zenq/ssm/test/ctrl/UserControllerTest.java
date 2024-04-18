package com.zenq.ssm.test.ctrl;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.zenq.ssm.test.MvcTest;

public class UserControllerTest extends MvcTest{

	
	@Test
	public void testUserRegist() throws Exception {
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("username", "zenq");
		params.add("password", "zenq123");
		params.add("phone", "13852147852");
		params.add("email", "zenq@zenq.com");
		
		mockMvc.perform(post("/user/reg").params(params))
		.andExpect(status().isOk())
		.andExpect(view().name("reg_suc"))
//		.andExpect(forwardedUrl("/WEB-INF/jsp/succ.jsp"))
//		.andExpect(model().attribute("name", "创建"))
		.andDo(print());// 打印请求和响应的详细信息
	}
}
