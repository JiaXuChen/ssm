package com.cjx.traditionssm.web.model;

import java.util.Date;

public class StoreInfoModel {

    private UserModel userModel;

    private int storeId;

    private String storeName;

    private String ownerName;

    private String ownerId;

    private int protocolId;

    private Date createTime;

    @Override
    public String toString() {
        return "StoreInfoModel{" +
                "userModel=" + userModel +
                ", storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", protocolId=" + protocolId +
                ", createTime=" + createTime +
                '}';
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public int getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(int protocolId) {
        this.protocolId = protocolId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
