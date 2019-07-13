package com.chinasofti.postbar.utils;

import java.util.HashMap;
import java.util.Map;

public class Result {
    private String msg;
    private int code;
    private String token;
    private final Map<String, Object> data = new HashMap<>();

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public Result put(String key, Object value) {
        data.put(key, value);
        return this;
    }

    private Result() {
    }

    private Result(int code) {
        this.code = code;
    }

    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Result(int code, String msg, String token) {
        this.code = code;
        this.msg = msg;
        this.token = token;
    }

    public static Result ok() {
        return new Result(200, "Ok");
    }

    public static Result ok(String token) {
        return new Result(200, "Ok", token);
    }

    public static Result err() {
        return new Result(100);
    }

    public static Result err(String msg) {
        return new Result(100, msg);
    }
}