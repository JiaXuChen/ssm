package com.cjx.traditionssm.web.dao;

import com.cjx.traditionssm.web.model.UserModel;

import java.util.List;

public interface UserMapper {

    List<UserModel> getAllUserInfo();

    UserModel getUserInfoById(String userId);
}
