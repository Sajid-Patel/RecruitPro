package com.campus_recruitment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.campus_recruitment.entities.User;
import com.campus_recruitment.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/create-user")
	public String createUser(@RequestBody @Valid User user) {

		int status = userService.createUser(user);

		switch (status) {
		case 1: {
			return "User Added Successfully";

		}
		case 2: {
			return "User Already Exist";
		}
		case 3: {
			return "Something went wrong";
		}
		default:
			return "";
		}

	}

	@GetMapping("by-username/{username}")
	public User getUserByUsername(@PathVariable String username) {
		User user = userService.getUserByUsernmae(username);

		return user;

	}

	@DeleteMapping("/delete-user")
	public String deleteUser(@RequestParam @Valid String username) {
		int status = userService.deleteUser(username);

		switch (status) {
		case 1: {
			return "User Deleted Successfully";

		}
		case 2: {
			return "User Already Exist";
		}
		case 3: {
			return "Something went wrong";
		}
		default:
			return "";
		}

	}
}
