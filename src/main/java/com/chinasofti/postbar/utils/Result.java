package com.chinasofti.postbar.utils;


public class Result {
    private String message;
    private Object data;

    public Result() {
    }

    public Result(String message) {
        this.message = message;
    }

    public Result(Object data) {
        this.data = data;
    }

    public Result(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result ok() {
        return new Result("");
    }

    public static Result ok(Object data) {
        return new Result("", data);
    }

    public static Result ok(String message) {
        return new Result(message);
    }

    public static Result ok(String message, Object data) {
        return new Result(message, data);
    }
}
