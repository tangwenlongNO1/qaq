package com.zenq.ssm.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//使用junit4进行测试
@RunWith(SpringJUnit4ClassRunner.class)
//加载spring相关的配置文件
@ContextConfiguration(locations = { "classpath:spring/spring-mybatis.xml" })
public class BaseTest {

}
