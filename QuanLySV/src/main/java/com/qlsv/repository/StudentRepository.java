package com.qlsv.repository;

import org.springframework.data.repository.CrudRepository;

import com.qlsv.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
