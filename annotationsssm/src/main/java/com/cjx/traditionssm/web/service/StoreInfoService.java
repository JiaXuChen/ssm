package com.cjx.traditionssm.web.service;

import com.cjx.traditionssm.web.dao.StoreInfoMapper;
import com.cjx.traditionssm.web.model.StoreInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreInfoService {
    @Autowired
    StoreInfoMapper storeInfoMapper;

    public List<StoreInfoModel> getAllStore() {
        return storeInfoMapper.getAllStore();
    }

}
