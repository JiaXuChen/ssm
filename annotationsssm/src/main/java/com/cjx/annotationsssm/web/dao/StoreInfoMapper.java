package com.cjx.annotationsssm.web.dao;

import com.cjx.annotationsssm.web.model.StoreInfoModel;

import java.util.List;

public interface StoreInfoMapper {

    List<StoreInfoModel> getAllStore();

    long addStore(StoreInfoModel storeInfoModel);
}
