package com.zenq.ssm.web.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.zenq.ssm.entity.Blog;
import com.zenq.ssm.service.BlogService;

@Controller
@RequestMapping("/b")
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@RequestMapping("/add")
	public ModelAndView publish(@ModelAttribute Blog blog, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "100") int rows) {
		ModelAndView mav = new ModelAndView();
		int result = blogService.add(blog);
		List<Blog> list = blogService.getBlogPage(blog, page, rows);
		mav.addObject("pageInfo", new PageInfo<Blog>(list));
		mav.addObject("queryParam", blog);
		mav.addObject("page", page);
		mav.addObject("rows", rows);
		mav.setViewName("blog/list");
		// 可以自行补充逻辑.......
		if (result == 0) {
			// 表示添加成功
			mav.setViewName("blog/list");
		} else {
			//添加失败
			mav.setViewName("/topublish");//需要返回到发布页面........
		}
		// 给与客户端响应消息
		// 如果想要将数据传递到View，
		// Request.setAttribute()
		// SpringMVC --> ModelAndView
		return mav;
	}

	@RequestMapping("/list")
	public ModelAndView list(@ModelAttribute Blog blog, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "100") int rows) {
		ModelAndView mav = new ModelAndView();
		List<Blog> list = blogService.getBlogPage(blog, page, rows);
		mav.addObject("pageInfo", new PageInfo<Blog>(list));
		mav.addObject("queryParam", blog);
		mav.addObject("page", page);
		mav.addObject("rows", rows);
		mav.setViewName("blog/list");
		return mav;
	}

	@RequestMapping("/detail/{pid}")
	public ModelAndView detail(@PathVariable int pid) {
		ModelAndView mav = new ModelAndView();
		Blog b = blogService.getById(pid);
		mav.addObject("blog", b);// 保存到模型视图对象中，传递到页面展示
		mav.setViewName("blog/details");
		return mav;
	}
}
