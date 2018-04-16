package com.qlbckh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accessdenied")
public class AccessdeniedController {

	@GetMapping
	public String accessDenied() {
		return "accessdenied";
	}
}
