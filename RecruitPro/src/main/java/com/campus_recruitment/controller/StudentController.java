package com.campus_recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus_recruitment.entities.Student;
import com.campus_recruitment.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping("/create-student")
	public String createStudent(@RequestBody Student student) {

		int status = studentService.createStudent(student);

		switch (status) {
		case 1: {
			return "Student Added Successfully";

		}
		case 2: {
			return "Student Already Exist";
		}
		case 3: {
			return "Something went wrong";
		}
		default:
			return "";
		}

	}

	@PostMapping("/create-multiple-student")
	public String createMultipleStudent(@RequestBody List<Student> liststudent) {

		int status = studentService.createMultipleStudent(liststudent);

		switch (status) {
		case 1: {
			return "Student Added Successfully";

		}
		case 2: {
			return "Student Already Exist";
		}
		case 3: {
			return "Something went wrong";
		}
		default:
			return "";
		}

	}

	@GetMapping("/all-student")
	public List<Student> fetchAllStudents() {
		return studentService.fetchAllStudents();

	}

	@DeleteMapping("/delete-student/{id}")
	public String deleteStudent(@PathVariable Long id) {
		int status = studentService.deleteStudent(id);

		switch (status) {
		case 1: {
			return "Student Deleted Successfully";

		}
		case 2: {
			return "Student Already Exist";
		}
		case 3: {
			return "Something went wrong";
		}
		default:
			return "";
		}
	}

}
