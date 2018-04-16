package com.qlbckh.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qlbckh.dto.NguoiSuDungDTO;
import com.qlbckh.entities.NguoiSuDung;
import com.qlbckh.entities.QuyenHan;
import com.qlbckh.services.NguoiSuDungService;
import com.qlbckh.services.QuyenHanService;

@Controller
@RequestMapping("/usermanager")
public class UsermanagerController {

	@Autowired
	NguoiSuDungService nguoiSuDungService;
	@Autowired
	private QuyenHanService quyehHanService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView usermanagerAccess() {
		ModelAndView modelAndView = new ModelAndView();
		List<NguoiSuDungDTO> allDTO = nguoiSuDungService.getAllDTO();
		modelAndView.setViewName("admin/usermanager");
		modelAndView.addObject("userList", allDTO);
		modelAndView.addObject("tabletitle", "Danh sách tài khoản");
		return modelAndView;
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView searchUser(@RequestParam String username) {
		ModelAndView modelAndView = new ModelAndView();
		List<NguoiSuDungDTO> allDTO = new ArrayList<>();
		NguoiSuDungDTO nguoiSudungDTO = nguoiSuDungService.getNguoiSudungDTO(username);
		modelAndView.setViewName("admin/usermanager");
		if (nguoiSudungDTO != null) {
			allDTO.add(nguoiSudungDTO);
			modelAndView.addObject("userList", allDTO);
			modelAndView.addObject("tabletitle", "Kết quả tìm kiếm");
		} else {
			modelAndView.addObject("tabletitle", "Không Tìm Thấy");
		}
		return modelAndView;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public ModelAndView editInfo(@ModelAttribute("model") NguoiSuDungDTO nguoiSuDungDTO) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/edituserinfo");
		modelAndView.addObject("toEditUser", nguoiSuDungDTO);
		List<QuyenHan> all = quyehHanService.getAll();
		modelAndView.addObject("roleList", all);
		return modelAndView;

	}

	@RequestMapping(value = "/updateinfo", method = RequestMethod.POST)
	public ModelAndView updateInfo(@ModelAttribute("model") NguoiSuDungDTO nguoiSuDungDTO) {
		NguoiSuDung nguoiSuDung = nguoiSuDungService.convertFromDTO(nguoiSuDungDTO);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("status");
		try {
			nguoiSuDungService.updateUserInfo(nguoiSuDung);
			modelAndView.addObject("updateStatus", "update successful");
			return modelAndView;

		} catch (Exception e) {
			modelAndView.addObject("updateStatus", "update failed");
			return modelAndView;

		}
	}
}
