package com.zenq.ssm.web.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/world")
	public String hello() {
		return "success";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String userId, @RequestParam String userPwd) {
		System.out.println("username="+userId);
		System.out.println("pwd="+userPwd);
		return "success";
	}
	
	
}
