package com.qlsv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;

	@Column(name = "name")
	private String StudentName;

	@Column(name = "age")
	private int age;

	@ManyToOne
	@JoinColumn(name = "Class")
	private Clazz clazz;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer student_ID) {
		studentId = student_ID;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

}
