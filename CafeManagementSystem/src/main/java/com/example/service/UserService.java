package com.example.service;

import com.example.entity.User;

public interface UserService {
	public User findUserById(Long userId)throws Exception;
	public User findUserByJwt(String jwt)throws Exception;
}
