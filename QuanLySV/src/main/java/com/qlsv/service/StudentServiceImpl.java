package com.qlsv.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qlsv.DTO.StudentDTO;
import com.qlsv.entities.Student;
import com.qlsv.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	@Transactional
	public List<StudentDTO> findByClass(int id) {
		List<StudentDTO> studentByClass = new ArrayList<>();
		Iterator<Student> iterator = studentRepository.findAll().iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getClazz().getClassId() == id) {
				StudentDTO studentDTO = convertToDTO(student);
				studentByClass.add(studentDTO);
			}
		}
		return studentByClass;
	}

	@Override
	public StudentDTO convertToDTO(Student student) {
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setStudentId(student.getStudentId());
		studentDTO.setStudentName(student.getStudentName());
		studentDTO.setClazzName(student.getClazz().getClassName());
		studentDTO.setAge(student.getAge());
		return studentDTO;
	}

	@Override
	@Transactional
	public List<StudentDTO> getAllStudent() {
		List<StudentDTO> studentDTOs = null;
		studentRepository.findAll().iterator().forEachRemaining(student -> studentDTOs.add(convertToDTO(student)));
		return studentDTOs;
	}

	@Override
	public boolean updateStudent(Student student) {

		Student save = studentRepository.save(student);
		return save != null;

	}

}
