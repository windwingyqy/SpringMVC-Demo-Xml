package com.bonc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonc.mapper.UserMapper;
import com.bonc.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	@Override
	public User selectUserById(long id) {
		return userMapper.selectUserById(id);
		//return null;
	}

}
