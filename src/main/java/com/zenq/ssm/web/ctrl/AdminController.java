package com.zenq.ssm.web.ctrl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.zenq.ssm.entity.Admin;
import com.zenq.ssm.service.AdminService;
import com.zenq.ssm.utils.WebAppUtil;

@Controller
@RequestMapping("/a")
public class AdminController {

	@Autowired
	private AdminService adminService;

	// 管理员登录
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute Admin admin) {
		ModelAndView mav = new ModelAndView();
		Admin loginAdmin = adminService.login(admin);
		System.out.println(loginAdmin);
		if (loginAdmin == null)
			mav.setViewName("redirect:/tologin");
		else {
			// 将当前登录用户信息存入Session作用域
			HttpSession session = WebAppUtil.getSession();
			session.setAttribute("loginAdmin", loginAdmin);
			mav.setViewName("redirect:/");
		}
		return mav;
	}
}
