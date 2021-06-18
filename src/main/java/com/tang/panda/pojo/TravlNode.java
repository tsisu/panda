package com.tang.panda.pojo;

import java.util.Date;

public class TravlNode {
    private Long tnid;

    private Long cusid;

    private Long ntypeid;

    private String tntitle;

    private Integer tnstate;

    private Date tntime;

    private String tntypename;

    private String tncontent;

    public Long getTnid() {
        return tnid;
    }

    public void setTnid(Long tnid) {
        this.tnid = tnid;
    }

    public Long getCusid() {
        return cusid;
    }

    public void setCusid(Long cusid) {
        this.cusid = cusid;
    }

    public Long getNtypeid() {
        return ntypeid;
    }

    public void setNtypeid(Long ntypeid) {
        this.ntypeid = ntypeid;
    }

    public String getTntitle() {
        return tntitle;
    }

    public void setTntitle(String tntitle) {
        this.tntitle = tntitle == null ? null : tntitle.trim();
    }

    public Integer getTnstate() {
        return tnstate;
    }

    public void setTnstate(Integer tnstate) {
        this.tnstate = tnstate;
    }

    public Date getTntime() {
        return tntime;
    }

    public void setTntime(Date tntime) {
        this.tntime = tntime;
    }

    public String getTntypename() {
        return tntypename;
    }

    public void setTntypename(String tntypename) {
        this.tntypename = tntypename == null ? null : tntypename.trim();
    }

    public String getTncontent() {
        return tncontent;
    }

    public void setTncontent(String tncontent) {
        this.tncontent = tncontent == null ? null : tncontent.trim();
    }
}