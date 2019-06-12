package com.chinasofti.postbar.dto;

public class PostPraise {
    private String poPrUUID;

    private String postUUID;

    private String userUUID;

    public String getPoPrUUID() {
        return poPrUUID;
    }

    public void setPoPrUUID(String poPrUUID) {
        this.poPrUUID = poPrUUID == null ? null : poPrUUID.trim();
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
}