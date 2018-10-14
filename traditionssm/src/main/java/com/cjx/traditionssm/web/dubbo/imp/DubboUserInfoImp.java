package com.cjx.traditionssm.web.dubbo.imp;

import com.cjx.traditionssm.web.dao.UserMapper;
import com.cjx.traditionssm.web.dubbo.DubboUserInfo;
import com.cjx.traditionssm.web.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DubboUserInfoImp implements DubboUserInfo {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserModel> getAllUserInfo() {
        return userMapper.getAllUserInfo();
    }
}
