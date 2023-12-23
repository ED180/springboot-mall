package com.ED.springbootmall.service;

import com.ED.springbootmall.dto.UserRegisterRequest;
import com.ED.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
