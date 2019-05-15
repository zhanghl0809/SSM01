package com.ssm.service.impl;

import com.ssm.Entity.User;
import com.ssm.dao.UserMapper;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserById(int id) {
        return  userMapper.findUserById(id);
    }

    public User findUserByName(String useranme) {
        return userMapper.findUserByName(useranme);
    }


}
