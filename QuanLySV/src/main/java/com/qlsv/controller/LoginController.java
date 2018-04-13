package com.qlsv.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qlsv.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String redirectAdmin() {
		return "admin";
	}

	@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
	public ModelAndView loginControll(@RequestParam String username, @RequestParam String password,
			HttpServletRequest request) {
		if (userService.checkLogin(username, password)) {
			return new ModelAndView("admin");
		} else {
			ModelAndView modelAndView = new ModelAndView("index");
			modelAndView.addObject("mes", "Đăng nhập thất bại");
			return modelAndView;
		}
	}
}
