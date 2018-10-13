package com.cjx.traditionssm.web.service;

import com.cjx.traditionssm.web.dao.UserMapper;
import com.cjx.traditionssm.web.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<UserModel> getAllUserInfo() {
        return userMapper.getAllUserInfo();
    }

    public UserModel getUserInfoById(String userId) {
       return userMapper.getUserInfoById(userId);
    }
}
