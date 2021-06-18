package com.tang.panda.pojo;

public class TravelProductsImgs {
    private Long tpimgid;

    private Long tpid;

    private String tpimgurl;

    private String tpimgdesc;

    private Integer tpimgsort;

    public Long getTpimgid() {
        return tpimgid;
    }

    public void setTpimgid(Long tpimgid) {
        this.tpimgid = tpimgid;
    }

    public Long getTpid() {
        return tpid;
    }

    public void setTpid(Long tpid) {
        this.tpid = tpid;
    }

    public String getTpimgurl() {
        return tpimgurl;
    }

    public void setTpimgurl(String tpimgurl) {
        this.tpimgurl = tpimgurl == null ? null : tpimgurl.trim();
    }

    public String getTpimgdesc() {
        return tpimgdesc;
    }

    public void setTpimgdesc(String tpimgdesc) {
        this.tpimgdesc = tpimgdesc == null ? null : tpimgdesc.trim();
    }

    public Integer getTpimgsort() {
        return tpimgsort;
    }

    public void setTpimgsort(Integer tpimgsort) {
        this.tpimgsort = tpimgsort;
    }
}