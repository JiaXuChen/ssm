package com.cjx.traditionssm.web.controller;

import com.cjx.traditionssm.web.model.StoreInfoModel;
import com.cjx.traditionssm.web.service.StoreInfoService;
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
}
