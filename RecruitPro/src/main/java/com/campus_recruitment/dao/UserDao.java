package com.campus_recruitment.dao;

import com.campus_recruitment.dto.LoginRequest;
import com.campus_recruitment.entities.User;

public interface UserDao {

	public int createUser(User user);

	public User getUserByUsername(String username);

	public int delectUser(String username);

	public User loginUser(LoginRequest loginRequest);

}
 