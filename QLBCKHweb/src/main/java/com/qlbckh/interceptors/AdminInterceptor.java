package com.qlbckh.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.qlbckh.dto.NguoiSuDungDTO;

@SessionAttributes("user")

public class AdminInterceptor implements HandlerInterceptor {
	private static int count = 0;

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("request :" + modelAndView.getViewName());
		if (request.getSession().isNew()) {
			count++;
			System.out.println("Có " + count + " người đang truy cập");

		}
		NguoiSuDungDTO nguoiSuDungDTO = (NguoiSuDungDTO) request.getSession().getAttribute("user");
		if (modelAndView.getViewName().contains("admin/")
				&& (nguoiSuDungDTO == null || !nguoiSuDungDTO.getQuyenHan().equals("admin"))) {
			System.out.println("invalid access");
			modelAndView.setViewName("redirect:/accessdenied");
		}

	}

}
