package com.tang.panda.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class TravelProductsType {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long tptypeid;

    private String tptypename;

    private String tptypedesc;

    private Integer tptypestate;

    private Integer tptypesort;

    public Long getTptypeid() {
        return tptypeid;
    }

    public void setTptypeid(Long tptypeid) {
        this.tptypeid = tptypeid;
    }

    public String getTptypename() {
        return tptypename;
    }

    public void setTptypename(String tptypename) {
        this.tptypename = tptypename == null ? null : tptypename.trim();
    }

    public String getTptypedesc() {
        return tptypedesc;
    }

    public void setTptypedesc(String tptypedesc) {
        this.tptypedesc = tptypedesc == null ? null : tptypedesc.trim();
    }

    public Integer getTptypestate() {
        return tptypestate;
    }

    public void setTptypestate(Integer tptypestate) {
        this.tptypestate = tptypestate;
    }

    public Integer getTptypesort() {
        return tptypesort;
    }

    public void setTptypesort(Integer tptypesort) {
        this.tptypesort = tptypesort;
    }
}