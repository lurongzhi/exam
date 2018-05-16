package com.major.entity;


import com.major.common.constants.ResultCodes;

/**
 * @author lurongzhi
 * 通信数据的类型
 */
public class ResultObj<T>{
    private int code;
    private String msg;
    private T data;

    public ResultObj(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultObj(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResultObj(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultObj(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return this.code == ResultCodes.SUCCESS;
    }
}