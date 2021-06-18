package com.tang.panda.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class TravelProducts {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long tpid;

    private Long tptypeid;

    private String tpname;

    private String tpimg;

    private Float tpprice;

    private Integer tpstate;

    private Integer tphot;

    private Integer tpfirst;

    private String tpdesc;

    public Long getTpid() {
        return tpid;
    }

    public void setTpid(Long tpid) {
        this.tpid = tpid;
    }

    public Long getTptypeid() {
        return tptypeid;
    }

    public void setTptypeid(Long tptypeid) {
        this.tptypeid = tptypeid;
    }

    public String getTpname() {
        return tpname;
    }

    public void setTpname(String tpname) {
        this.tpname = tpname == null ? null : tpname.trim();
    }

    public String getTpimg() {
        return tpimg;
    }

    public void setTpimg(String tpimg) {
        this.tpimg = tpimg == null ? null : tpimg.trim();
    }

    public Float getTpprice() {
        return tpprice;
    }

    public void setTpprice(Float tpprice) {
        this.tpprice = tpprice;
    }

    public Integer getTpstate() {
        return tpstate;
    }

    public void setTpstate(Integer tpstate) {
        this.tpstate = tpstate;
    }

    public Integer getTphot() {
        return tphot;
    }

    public void setTphot(Integer tphot) {
        this.tphot = tphot;
    }

    public Integer getTpfirst() {
        return tpfirst;
    }

    public void setTpfirst(Integer tpfirst) {
        this.tpfirst = tpfirst;
    }

    public String getTpdesc() {
        return tpdesc;
    }

    public void setTpdesc(String tpdesc) {
        this.tpdesc = tpdesc == null ? null : tpdesc.trim();
    }
}