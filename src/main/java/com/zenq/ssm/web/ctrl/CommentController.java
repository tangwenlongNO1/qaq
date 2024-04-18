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
import com.zenq.ssm.entity.Comment;
import com.zenq.ssm.service.CommentService;

@Controller
@RequestMapping("/c")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/add")
	public ModelAndView publish(@ModelAttribute Comment Comment, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "10") int rows) {
		ModelAndView mav = new ModelAndView();
		int result = commentService.add(Comment);
		List<Comment> list = commentService.getCommentPage(Comment, page, rows);
		mav.addObject("pageInfo", new PageInfo<Comment>(list));
		mav.addObject("queryParam", Comment);
		mav.addObject("page", page);
		mav.addObject("rows", rows);
		mav.setViewName("blog/details");
		// 可以自行补充逻辑.......
		if (result == 0) {
			// 表示添加成功
			mav.setViewName("blog/details");
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
	public ModelAndView list(@ModelAttribute Comment comment, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "10") int rows) {
		ModelAndView mav = new ModelAndView();
		List<Comment> list = commentService.getCommentPage(comment, page, rows);
		mav.addObject("pageInfo", new PageInfo<Comment>(list));
		mav.addObject("queryParam", comment);
		mav.addObject("page", page);
		mav.addObject("rows", rows);
		mav.setViewName("blog/details");
		return mav;
	}

	@RequestMapping("/detail/{pid}")
	public ModelAndView detail(@PathVariable int pid) {
		ModelAndView mav = new ModelAndView();
		Comment b = commentService.getById(pid);
		mav.addObject("Comment", b);// 保存到模型视图对象中，传递到页面展示
		mav.setViewName("Comment/details");
		return mav;
	}
}
