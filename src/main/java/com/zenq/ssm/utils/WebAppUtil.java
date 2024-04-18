package com.zenq.ssm.utils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
/**
 * 用于获取Servlet-api对象
 * @author Administrator
 *
 */
public class WebAppUtil {

	public static HttpSession getSession() {
		return getRequest().getSession();
	}
	
	public static HttpServletRequest getRequest() {
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
}