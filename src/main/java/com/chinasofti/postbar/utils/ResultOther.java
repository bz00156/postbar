package com.chinasofti.postbar.utils;
import java.io.Serializable;

public class ResultOther implements Serializable {
    private String code;
    private String msg;
    private Object data;
    private String token;
    public ResultOther(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ResultOther(String code, String token) {
        this.code = code;
        this.token = token;
    }
    public ResultOther(ResultEnums resultEnums) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
    }

    public ResultOther(ResultEnums resultEnums, Object data) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
        this.data = data;
    }

    public ResultOther() {
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public static ResultOther ok(Object data) {
        return new ResultOther(ResultEnums.SUCCESS, data);
    }

    public static ResultOther ok() {
        return new ResultOther(ResultEnums.SUCCESS);
    }

    public static ResultOther ok(String token) {
        return new ResultOther(ResultEnums.SUCCESS.getCode(), token);
    }

    public static ResultOther ok(String code, String msg) {
        return new ResultOther(code, msg);
    }

    public static ResultOther ok(String code, String msg, Object data) {
        return new ResultOther(code, msg, data);
    }

    public static ResultOther ok(ResultEnums resultEnums) {
        return new ResultOther(resultEnums);
    }

    public static ResultOther err(Object data) {
        return new ResultOther(ResultEnums.ERROR, data);
    }

    public static ResultOther err() {
        return new ResultOther(ResultEnums.ERROR);
    }

    public static ResultOther err(String msg) {
        return new ResultOther(ResultEnums.ERROR.getCode(), msg);
    }

    public static ResultOther err(String code, String msg) {
        return new ResultOther(code, msg);
    }

    public static ResultOther err(String code, String msg, Object data) {
        return new ResultOther(code, msg, data);
    }

    public static ResultOther err(ResultEnums resultEnums) {
        return new ResultOther(resultEnums);
    }

}