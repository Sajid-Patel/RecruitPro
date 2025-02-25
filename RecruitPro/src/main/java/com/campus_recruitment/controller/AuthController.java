package com.campus_recruitment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus_recruitment.dto.LoginRequest;
import com.campus_recruitment.entities.User;
import com.campus_recruitment.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserService userService;

	@PostMapping("/login-user")
	public Object loginUser(@RequestBody LoginRequest loginRequest) {
		User user = userService.loginUser(loginRequest);
		if (user != null) {
			return user;
		} else {
			return "Invalid Credintials";
		}

	}

}
