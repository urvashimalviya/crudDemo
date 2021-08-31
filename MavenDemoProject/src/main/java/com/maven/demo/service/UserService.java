package com.maven.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.demo.dao.UserDAO;
import com.maven.demo.model.User;

@Service
public class UserService {
	@Autowired
	private UserDAO userDao;

	public int createUSer(User user) {
		return this.userDao.saveUser(user);
	}
}
