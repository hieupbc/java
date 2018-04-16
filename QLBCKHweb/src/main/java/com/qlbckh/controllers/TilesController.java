package com.qlbckh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TilesController {
	@RequestMapping(value = "/firstPageContent")
	public ModelAndView navigateToFirstPage() {
		ModelAndView mav = new ModelAndView("firstPageContent");
		return mav;
	}

	@RequestMapping(value = "/navigateToSecondPage")
	public ModelAndView navigateToSecondPage() {
		ModelAndView mav = new ModelAndView("second_page");
		return mav;
	}
}
