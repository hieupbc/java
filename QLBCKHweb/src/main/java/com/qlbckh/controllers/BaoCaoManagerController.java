package com.qlbckh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qlbckh.dto.BaocaoDTO;
import com.qlbckh.services.BaoCaoService;

@Controller
@RequestMapping("/baocaomanager")
public class BaoCaoManagerController {

	@Autowired
	private BaoCaoService baoCaoService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView baocaoManagerAccess() {
		ModelAndView modelAndView = new ModelAndView();
		List<BaocaoDTO> allDTO = baoCaoService.getAllBaoCao();
		modelAndView.setViewName("member/baocao");
		modelAndView.addObject("baocaoList", allDTO);
		modelAndView.addObject("tabletitle", "Danh sách báo cáo");
		return modelAndView;
	}

}
