package com.qlbckh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qlbckh.services.NguoiSuDungService;

@Controller
@RequestMapping("/api")
public class ApiController {

	@Autowired
	NguoiSuDungService nguoiSuDungService;

	@PostMapping("/loginControll")
	@ResponseBody
	public String loginControll(@RequestParam String username, @RequestParam String password) {
		System.out.println(username);
		boolean checkLogin = nguoiSuDungService.checkLogin(username, password);
		System.out.println(checkLogin);
		return "" + checkLogin;
	}

}
