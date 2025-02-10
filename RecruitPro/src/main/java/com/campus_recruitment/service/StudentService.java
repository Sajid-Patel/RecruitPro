package com.campus_recruitment.service;

import java.util.List;

import com.campus_recruitment.entities.Student;

public interface StudentService {

	public int createStudent(Student student);

	public int createMultipleStudent(List<Student> liststudent);

	public List<Student> fetchAllStudents();

	public int deleteStudent(Long id);
}
