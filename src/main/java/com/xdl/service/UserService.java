package com.xdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.bean.User;
import com.xdl.mapper.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;
	
	public List<User> login() {
		return userdao.login();
	}
}
