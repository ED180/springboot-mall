package com.ED.springbootmall.service.impl;

import com.ED.springbootmall.dao.UserDao;
import com.ED.springbootmall.dto.UserRegisterRequest;
import com.ED.springbootmall.model.User;
import com.ED.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }


}
