package com.chinasofti.postbar.dto;

public class CommentPraise {
    private String cmPrUUID;

    private String postUUID;

    private String userUUID;

    private String cmUUID;

    public String getCmPrUUID() {
        return cmPrUUID;
    }

    public void setCmPrUUID(String cmPrUUID) {
        this.cmPrUUID = cmPrUUID == null ? null : cmPrUUID.trim();
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

    public String getCmUUID() {
        return cmUUID;
    }

    public void setCmUUID(String cmUUID) {
        this.cmUUID = cmUUID == null ? null : cmUUID.trim();
    }
}