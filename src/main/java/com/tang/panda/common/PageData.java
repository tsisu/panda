package com.tang.panda.common;

import java.util.List;

/**
 * 分页数据模型
 */
public class PageData<T> {
    private Integer code = 0;
    private String msg="";
    private Integer count;
    private List<T> data;

    public PageData() {
    }

    public PageData(Integer count, List<T> data) {
        this.count = count;
        this.data = data;
    }
    public PageData(Integer code, String msg, Integer count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}

