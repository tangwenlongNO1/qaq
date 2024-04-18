package com.zenq.ssm.test.mapper;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {
	//获得spring容器
    static ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
    
    @Test
    public void testMapper1() {
    	System.out.println("测试Mapper");
    }
}
