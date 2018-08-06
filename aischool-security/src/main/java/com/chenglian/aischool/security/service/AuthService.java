package com.chenglian.aischool.security.service;

import com.chenglian.aischool.security.entity.User;

public interface AuthService {
	/**
	 * 用户注册
	 */
    User register(User userToAdd);
    
    /**
     * 用户登录并授权
     */
    String login(String username, String password);
    
    /**
     * 获取及刷新token
     */
    String refresh(String oldToken);
}
