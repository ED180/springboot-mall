package com.ED.springbootmall.dao;

import com.ED.springbootmall.dto.UserRegisterRequest;
import com.ED.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User getUserByEmail(String email);
}
