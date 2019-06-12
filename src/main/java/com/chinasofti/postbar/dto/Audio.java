package com.chinasofti.postbar.dto;

public class Audio {
    private String auSetUUID;

    private String userUUID;

    private Integer auSetSpd;

    private Integer auSetPit;

    private Integer auSetVol;

    private Integer auSetVoiPer;

    public String getAuSetUUID() {
        return auSetUUID;
    }

    public void setAuSetUUID(String auSetUUID) {
        this.auSetUUID = auSetUUID == null ? null : auSetUUID.trim();
    }

    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID == null ? null : userUUID.trim();
    }

    public Integer getAuSetSpd() {
        return auSetSpd;
    }

    public void setAuSetSpd(Integer auSetSpd) {
        this.auSetSpd = auSetSpd;
    }

    public Integer getAuSetPit() {
        return auSetPit;
    }

    public void setAuSetPit(Integer auSetPit) {
        this.auSetPit = auSetPit;
    }

    public Integer getAuSetVol() {
        return auSetVol;
    }

    public void setAuSetVol(Integer auSetVol) {
        this.auSetVol = auSetVol;
    }

    public Integer getAuSetVoiPer() {
        return auSetVoiPer;
    }

    public void setAuSetVoiPer(Integer auSetVoiPer) {
        this.auSetVoiPer = auSetVoiPer;
    }
}