package com.tang.panda.pojo;

public class SpotsImgs {
    private Long simgid;

    private Long spotsid;

    private String simgurl;

    private String simgdesc;

    private Integer simgstate;

    private Integer simgsort;

    public Long getSimgid() {
        return simgid;
    }

    public void setSimgid(Long simgid) {
        this.simgid = simgid;
    }

    public Long getSpotsid() {
        return spotsid;
    }

    public void setSpotsid(Long spotsid) {
        this.spotsid = spotsid;
    }

    public String getSimgurl() {
        return simgurl;
    }

    public void setSimgurl(String simgurl) {
        this.simgurl = simgurl == null ? null : simgurl.trim();
    }

    public String getSimgdesc() {
        return simgdesc;
    }

    public void setSimgdesc(String simgdesc) {
        this.simgdesc = simgdesc == null ? null : simgdesc.trim();
    }

    public Integer getSimgstate() {
        return simgstate;
    }

    public void setSimgstate(Integer simgstate) {
        this.simgstate = simgstate;
    }

    public Integer getSimgsort() {
        return simgsort;
    }

    public void setSimgsort(Integer simgsort) {
        this.simgsort = simgsort;
    }
}