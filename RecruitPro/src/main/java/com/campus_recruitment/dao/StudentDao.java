package com.campus_recruitment.dao;

import java.util.List;

import com.campus_recruitment.entities.Student;

public interface StudentDao {
	public int createStudent(Student student);

	public int createMultipleStudent(List<Student> liststudent);

	public List<Student> fetchAllStudents();
}
