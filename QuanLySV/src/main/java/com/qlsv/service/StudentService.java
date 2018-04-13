package com.qlsv.service;

import java.util.List;

import com.qlsv.DTO.StudentDTO;
import com.qlsv.entities.Student;

public interface StudentService {
	public List<StudentDTO> getAllStudent();

	List<StudentDTO> findByClass(int id);

	StudentDTO convertToDTO(Student student);

	boolean updateStudent(Student student);
}
