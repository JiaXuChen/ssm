package com.cjx.annotationsssm.web.service;

import com.cjx.annotationsssm.web.dao.StoreInfoMapper;
import com.cjx.annotationsssm.web.model.StoreInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StoreInfoService {
    @Autowired
    StoreInfoMapper storeInfoMapper;

    public List<StoreInfoModel> getAllStore() {
        return storeInfoMapper.getAllStore();
    }
    @Transactional
    public long addStore(StoreInfoModel storeInfoModel, int number) {
        long count = storeInfoMapper.addStore(storeInfoModel);
        count = count/number;

        return count;
    }
}
