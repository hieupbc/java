package com.qlsv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qlsv.DTO.StudentDTO;
import com.qlsv.entities.Clazz;
import com.qlsv.entities.Student;
import com.qlsv.service.ClazzService;
import com.qlsv.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private ClazzService clazzService;

	@RequestMapping(value = "/findByClass1", method = RequestMethod.POST)
	public String findStudentByClass1(HttpServletRequest request) {
		request.setAttribute("studentList", studentService.findByClass(1));
		request.setAttribute("show", "enable");
		return "admin";
	}

	@RequestMapping(value = "/findByClass2", method = RequestMethod.POST)
	public String findStudentByClass2(HttpServletRequest request) {
		request.setAttribute("studentList", studentService.findByClass(2));
		request.setAttribute("show", "enable");

		return "admin";
	}

	@RequestMapping(value = "/findByClass3", method = RequestMethod.POST)
	public String findStudentByClass3(HttpServletRequest request) {
		request.setAttribute("studentList", studentService.findByClass(3));
		request.setAttribute("show", "enable");

		return "admin";
	}

	@RequestMapping(value = "/editForm", method = RequestMethod.POST)
	public ModelAndView editForm(@RequestParam String studentId, @RequestParam String studentName,
			@RequestParam String age, @RequestParam String clazz) {
		ModelAndView modelAndView = new ModelAndView("editform");
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setStudentId(Integer.parseInt(studentId));
		studentDTO.setAge(Integer.parseInt(age));
		studentDTO.setClazzName(clazz);
		studentDTO.setStudentName(studentName);
		List<Clazz> allClazz = clazzService.getAllClazz();

		modelAndView.addObject("toEditStudent", studentDTO);
		modelAndView.addObject("clazzList", allClazz);
		return modelAndView;
	}

	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public ModelAndView updateStudent(@RequestParam String studentId, @RequestParam String studentName,
			@RequestParam String age, @RequestParam String clazzId) {
		ModelAndView modelAndView = new ModelAndView("status");
		Student student = new Student();
		student.setStudentId(Integer.parseInt(studentId));
		student.setStudentName(studentName);
		student.setAge(Integer.parseInt(age));
		student.setClazz(clazzService.getClazzById(Integer.parseInt(clazzId)));
		if (studentService.updateStudent(student)) {
			modelAndView.addObject("mes", "update successful");
			return modelAndView;
		} else {
			modelAndView.addObject("mes", "update failed");
			return modelAndView;
		}

	}
}
