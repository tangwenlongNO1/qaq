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
import com.zenq.ssm.entity.Collect;
import com.zenq.ssm.service.CollectService;

@Controller
@RequestMapping("/col")
public class CollectController {

	@Autowired
	private CollectService collectService;
	
	@RequestMapping("/add")
	public ModelAndView publish(@ModelAttribute Collect collect, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "10") int rows) {
		ModelAndView mav = new ModelAndView();
		int result = collectService.add(collect);
		List<Collect> list = collectService.getCollectPage1(collect, page, rows);
		mav.addObject("pageInfo", new PageInfo<Collect>(list));
		mav.addObject("queryParam", collect);
		mav.addObject("page", page);
		mav.addObject("rows", rows);
		mav.setViewName("collect/list");
		// 可以自行补充逻辑.......
		if (result == 0) {
			// 表示添加成功
			mav.setViewName("collect/list");
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
	public ModelAndView list(@ModelAttribute Collect collect, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "10") int rows) {
		ModelAndView mav = new ModelAndView();
		List<Collect> list = collectService.getCollectPage(collect, page, rows);
		mav.addObject("pageInfo", new PageInfo<Collect>(list));
		mav.addObject("queryParam", collect);
		mav.addObject("page", page);
		mav.addObject("rows", rows);
		mav.setViewName("collect/list");
		return mav;
	}

	@RequestMapping("/detail/{pid}")
	public ModelAndView detail(@PathVariable int pid) {
		ModelAndView mav = new ModelAndView();
		Collect b = collectService.getById(pid);
		mav.addObject("collect", b);// 保存到模型视图对象中，传递到页面展示
		mav.setViewName("collect/details");
		return mav;
	}
}
