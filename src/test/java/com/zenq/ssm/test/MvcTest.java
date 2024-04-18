package com.zenq.ssm.test;

// 静态导入
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

//使用junit4进行测试
@RunWith(SpringJUnit4ClassRunner.class)
//加载spring相关的配置文件
@ContextConfiguration(locations = { "classpath:spring/spring-mvc.xml","classpath:spring/spring-mybatis.xml" })
//设置web项目的环境，如果是Web项目，必须配置该属性，否则无法获取 web 容器相关的信息（request、context 等信息）
//此注解指定web资源的位置，默认为src/main/webapp
@WebAppConfiguration("src/main/webapp")
public class MvcTest {

	protected MockMvc mockMvc; // 模拟MVC对象
	//Spring核心 IoC-->要求类属性private修饰，提供public的setXxx方法进行注入。
	//Spring提供 Autowired注解： 省略setXxx方法，自动注入对应属性
	//自动从BeanFactory查找类型和当前属性类型匹配的Bean，然后注入进来
	
	@Autowired
	protected WebApplicationContext wac; // 注入WebApplicationContext
	@Autowired
	protected MockHttpSession session; // 注入模拟的http session
	@Autowired
	protected MockHttpServletRequest request; // 模拟request

	
	@Before // 测试开始前的初始化工作
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void testGet() throws Exception {
		mockMvc.perform(get("/hello/world")) // 8 模拟GET /hello/world
		.andExpect(status().isOk())// 9 预期返回状态为200
		.andExpect(view().name("success"))// 10 预期view的名称
		.andExpect(forwardedUrl("/WEB-INF/views/success.jsp"));// 11 预期页面转向的真正路径
//		.andExpect(model().attribute("msg", "exp_str"));// 12 预期model里的值
	}
	
	@Test
	public void testPost() throws Exception {
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("uname", "张三");
		params.add("pwd", "123");
		
		mockMvc.perform(post("/hello/login").params(params))
		.andExpect(status().isOk())
		.andExpect(view().name("success"))
//		.andExpect(forwardedUrl("/WEB-INF/jsp/succ.jsp"))
//		.andExpect(model().attribute("name", "创建"))
		.andDo(print());// 打印请求和响应的详细信息
	}
	
}
