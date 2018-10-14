package com.cjx.annotationsssm.web.controller;

import com.cjx.annotationsssm.web.model.StoreInfoModel;
import com.cjx.annotationsssm.web.service.StoreInfoService;
import com.cjx.traditionssm.web.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("store")
public class StoreInfoController {

    @Autowired
    StoreInfoService storeInfoService;

    @RequestMapping("allStore")
    public List<StoreInfoModel> getAllStore(){
        List<StoreInfoModel> storeInfoModels = storeInfoService.getAllStore();
        return storeInfoModels;
    }

    @RequestMapping("addStore")
    public long addStore(StoreInfoModel storeInfoModel, int number){
        long count = storeInfoService.addStore(storeInfoModel, number);
        return count;
    }

    @RequestMapping("allUserInfo")
    public  List<UserModel>  allUserInfo(){

        return storeInfoService.allUserInfo();
    }


}
