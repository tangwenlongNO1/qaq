package com.zenq.ssm.web.ctrl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zenq.ssm.entity.User;
import com.zenq.ssm.service.UserService;
import com.zenq.ssm.utils.WebAppUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// 用户注册
	@RequestMapping("/reg")
	public ModelAndView regist(@ModelAttribute User user) {
		ModelAndView mav = new ModelAndView();
		int result = userService.regist(user);
		// 可以自行补充逻辑.......
		if (result == 0) {
			// 表示注册成功
			mav.setViewName("redirect:/tologin");
		} else {
			// 注册失败
			mav.setViewName("redirect:/reg");// 需要返回到注册页面........
		}
		// 给与客户端响应消息
		// 如果想要将数据传递到View，
		// Request.setAttribute()
		// SpringMVC --> ModelAndView
		mav.addObject("reg_result", result);
		return mav;
	}

	// 用户登录
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute User user) {
		ModelAndView mav = new ModelAndView();
		User loginUser = userService.login(user);
		System.out.println(loginUser);
		if (loginUser == null)
			mav.setViewName("redirect:/tologin");
		else {
			// 将当前登录用户信息存入Session作用域
			HttpSession session = WebAppUtil.getSession();
			session.setAttribute("loginUser", loginUser);
			mav.setViewName("redirect:/b/list");
		}
		return mav;
	}

//	用户修改密码
	@RequestMapping("/update")
	public ModelAndView updete(@ModelAttribute User user) {
		ModelAndView mav = new ModelAndView();
		int result = userService.update(user);
		if (result == 0) {
			// 表示修改成功
			mav.setViewName("/login");
		} else {
			// 修改失败
			mav.setViewName("/change");// 需要返回到修改页面........
		}
		mav.addObject("upd_result", result);

		return mav;
	}

}
