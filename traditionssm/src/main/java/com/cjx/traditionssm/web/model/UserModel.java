package com.cjx.traditionssm.web.model;

import java.util.Date;

public class UserModel implements java.io.Serializable{

    private int id;
    private  String userName;
    private  String ownerName;
    private String userAddr;
    private Date createTime;
    private Date updateTime;
    private String mobile;

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", userAddr='" + userAddr + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
