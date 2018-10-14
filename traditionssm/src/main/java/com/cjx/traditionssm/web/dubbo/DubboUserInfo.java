package com.cjx.traditionssm.web.dubbo;

import com.cjx.traditionssm.web.model.UserModel;

import java.util.List;


public interface DubboUserInfo {


    List<UserModel> getAllUserInfo();
}
