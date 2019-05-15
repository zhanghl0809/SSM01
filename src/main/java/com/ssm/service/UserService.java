package com.ssm.service;

import com.ssm.Entity.User;

public interface UserService {

    User findUserById(int id);
    User findUserByName(String useranme);
}
