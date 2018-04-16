package com.qlbckh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.qlbckh.dto.NguoiSuDungDTO;
import com.qlbckh.services.NguoiSuDungService;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	NguoiSuDungService nguoiSuDungService;

	@RequestMapping("/login")
	public String loginAccess() {
		return "login";
	}

	@PostMapping("/logincontroll")
	public ModelAndView loginControll(ModelAndView modelAndView, @RequestParam String username,
			@RequestParam String password) {
		boolean checkLogin = nguoiSuDungService.checkLogin(username, password);
		if (checkLogin) {
			modelAndView.setViewName("redirect:/home");
			NguoiSuDungDTO nguoiSudungDTO2 = nguoiSuDungService.getNguoiSudungDTO(username);
			modelAndView.addObject("user", nguoiSudungDTO2);
			System.out.println(nguoiSudungDTO2.getUserID());
			return modelAndView;
		} else {
			modelAndView.addObject("ketqua", "Đăng nhập thất bại");
			modelAndView.setViewName("login");
			return modelAndView;
		}

	}

}
