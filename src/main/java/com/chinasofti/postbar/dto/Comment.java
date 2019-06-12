package com.chinasofti.postbar.dto;

import java.util.Date;

public class Comment {
    private String cmUUID;

    private String postUUID;

    private String userUUID;

    private String cmAudio;

    private Date cmTime;

    private String cmText;

    public String getCmUUID() {
        return cmUUID;
    }

    public void setCmUUID(String cmUUID) {
        this.cmUUID = cmUUID == null ? null : cmUUID.trim();
    }

    public String getPostUUID() {
        return postUUID;
    }

    public void setPostUUID(String postUUID) {
        this.postUUID = postUUID == null ? null : postUUID.trim();
    }

    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID == null ? null : userUUID.trim();
    }

    public String getCmAudio() {
        return cmAudio;
    }

    public void setCmAudio(String cmAudio) {
        this.cmAudio = cmAudio == null ? null : cmAudio.trim();
    }

    public Date getCmTime() {
        return cmTime;
    }

    public void setCmTime(Date cmTime) {
        this.cmTime = cmTime;
    }

    public String getCmText() {
        return cmText;
    }

    public void setCmText(String cmText) {
        this.cmText = cmText == null ? null : cmText.trim();
    }
}