package com.qlbckh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = { "/", "/home" })
public class HomeController {

	@GetMapping
	public String homeAccess() {
		return "home";
	}
}
