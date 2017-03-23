package com.pjxt.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pjxt.dao.UserDao;
import com.pjxt.pojo.User;
import com.pjxt.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService {
	@Resource
	private UserDao userDao;
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
}
