package com.tang.panda.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class SysHotelType {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long htid;

    private String htname;

    private Integer htstate;

    private Integer htsort;

    public Long getHtid() {
        return htid;
    }

    public void setHtid(Long htid) {
        this.htid = htid;
    }

    public String getHtname() {
        return htname;
    }

    public void setHtname(String htname) {
        this.htname = htname == null ? null : htname.trim();
    }

    public Integer getHtstate() {
        return htstate;
    }

    public void setHtstate(Integer htstate) {
        this.htstate = htstate;
    }

    public Integer getHtsort() {
        return htsort;
    }

    public void setHtsort(Integer htsort) {
        this.htsort = htsort;
    }
}