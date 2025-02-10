package com.campus_recruitment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus_recruitment.dao.UserDao;
import com.campus_recruitment.dto.LoginRequest;
import com.campus_recruitment.entities.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public int createUser(User user) {

		int status = userDao.createUser(user);
		return status;
	}

	@Override
	public User getUserByUsernmae(String username) {
		User user = userDao.getUserByUsername(username);
		return user;
	}

	@Override
	public int deleteUser(String username) {

		int status = userDao.delectUser(username);
		return status;
	}

	@Override
	public User loginUser(LoginRequest loginRequest) {
		User user = userDao.loginUser(loginRequest);
		return user;
	}

}
