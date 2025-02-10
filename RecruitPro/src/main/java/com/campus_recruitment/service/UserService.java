package com.campus_recruitment.service;

import com.campus_recruitment.dto.LoginRequest;
import com.campus_recruitment.entities.User;

public interface UserService {
	public int createUser(User user);

	public User getUserByUsernmae(String username);

	public int deleteUser(String username);

	public User loginUser(LoginRequest loginRequest);
}
