package com.tang.panda.pojo;

public class Customer {
    private Long cusid;

    private String cususername;

    private String cuspwd;

    private String cusname;

    private String cusnickname;

    private String cussex;

    private Integer cusstate;

    public Long getCusid() {
        return cusid;
    }

    public void setCusid(Long cusid) {
        this.cusid = cusid;
    }

    public String getCususername() {
        return cususername;
    }

    public void setCususername(String cususername) {
        this.cususername = cususername == null ? null : cususername.trim();
    }

    public String getCuspwd() {
        return cuspwd;
    }

    public void setCuspwd(String cuspwd) {
        this.cuspwd = cuspwd == null ? null : cuspwd.trim();
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname == null ? null : cusname.trim();
    }

    public String getCusnickname() {
        return cusnickname;
    }

    public void setCusnickname(String cusnickname) {
        this.cusnickname = cusnickname == null ? null : cusnickname.trim();
    }

    public String getCussex() {
        return cussex;
    }

    public void setCussex(String cussex) {
        this.cussex = cussex == null ? null : cussex.trim();
    }

    public Integer getCusstate() {
        return cusstate;
    }

    public void setCusstate(Integer cusstate) {
        this.cusstate = cusstate;
    }
}