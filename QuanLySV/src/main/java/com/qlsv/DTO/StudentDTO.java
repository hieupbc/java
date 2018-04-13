package com.qlsv.DTO;

public class StudentDTO {
	private int studentId;
	private int age;
	private String studentName;
	private String clazzName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentID) {
		this.studentId = studentID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClazzName() {
		return clazzName;
	}

	public void setClazzName(String clazz) {
		this.clazzName = clazz;
	}

}
