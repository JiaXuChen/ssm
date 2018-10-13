package com.cjx.traditionssm.web.controller;

import com.cjx.traditionssm.web.model.UserModel;
import com.cjx.traditionssm.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("allUserInfo")
    public List<UserModel> getAllUserInfo(){
        List<UserModel> userModels = userService.getAllUserInfo();
        return userModels;
    }
    @RequestMapping("userInfo")
    public UserModel getUserInfoById(String userId){
        return userService.getUserInfoById(userId);
    }

}
