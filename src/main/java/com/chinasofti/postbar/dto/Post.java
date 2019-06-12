package com.chinasofti.postbar.dto;

import java.util.Date;

public class Post {
    private String postUUID;

    private String userUUID;

    private String postTitle;

    private Integer postPageviews;

    private String postAudio;

    private Date postTime;

    private String postText;

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

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle == null ? null : postTitle.trim();
    }

    public Integer getPostPageviews() {
        return postPageviews;
    }

    public void setPostPageviews(Integer postPageviews) {
        this.postPageviews = postPageviews;
    }

    public String getPostAudio() {
        return postAudio;
    }

    public void setPostAudio(String postAudio) {
        this.postAudio = postAudio == null ? null : postAudio.trim();
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText == null ? null : postText.trim();
    }
}