package com.campus_recruitment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus_recruitment.dao.StudentDaoImpl;
import com.campus_recruitment.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDaoImpl studentDao;

	@Override
	public int createStudent(Student student) {
		int status = studentDao.createStudent(student);
		return status;

	}

	@Override
	public int createMultipleStudent(List<Student> liststudent) {

		int status = studentDao.createMultipleStudent(liststudent);
		return status;
	}

	@Override
	public List<Student> fetchAllStudents() {
		return studentDao.fetchAllStudents();
	}

	@Override
	public int deleteStudent(Long id) {
		int status = studentDao.deleteStudent(id);
		return status;
	}

}
