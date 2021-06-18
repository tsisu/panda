package com.tang.panda.pojo;

import java.util.Date;

public class CustomerOrder {
    private Long orderid;

    private Long cusid;

    private Date ordertime;

    private Integer orderstate;

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Long getCusid() {
        return cusid;
    }

    public void setCusid(Long cusid) {
        this.cusid = cusid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }
}