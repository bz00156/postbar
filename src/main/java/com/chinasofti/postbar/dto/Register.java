package com.chinasofti.postbar.dto;

import java.util.Date;

public class Register {
    private String regUUID;

    private String userUUID;

    private String regSex;

    private Integer regAge;

    private String regEmial;

    private String regPhoto;

    private Date regTime;

    public String getRegUUID() {
        return regUUID;
    }

    public void setRegUUID(String regUUID) {
        this.regUUID = regUUID == null ? null : regUUID.trim();
    }

    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID == null ? null : userUUID.trim();
    }

    public String getRegSex() {
        return regSex;
    }

    public void setRegSex(String regSex) {
        this.regSex = regSex == null ? null : regSex.trim();
    }

    public Integer getRegAge() {
        return regAge;
    }

    public void setRegAge(Integer regAge) {
        this.regAge = regAge;
    }

    public String getRegEmial() {
        return regEmial;
    }

    public void setRegEmial(String regEmial) {
        this.regEmial = regEmial == null ? null : regEmial.trim();
    }

    public String getRegPhoto() {
        return regPhoto;
    }

    public void setRegPhoto(String regPhoto) {
        this.regPhoto = regPhoto == null ? null : regPhoto.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}