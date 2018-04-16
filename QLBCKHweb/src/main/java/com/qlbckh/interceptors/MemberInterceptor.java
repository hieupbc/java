package com.qlbckh.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@SessionAttributes("user")

public class MemberInterceptor implements HandlerInterceptor {
	private static int count = 0;

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		if (modelAndView.getViewName().contains("member/") && request.getSession().getAttribute("user") == null) {
			System.out.println("invalid access");
			modelAndView.setViewName("redirect:/accessdenied");
		}

	}

}
