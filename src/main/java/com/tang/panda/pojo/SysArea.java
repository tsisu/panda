package com.tang.panda.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

//@TableName("sysarea")
public class SysArea {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long areaid;
    //@TableId

    private String areaname;

    private Integer areastate;

    private Integer areasort;

    //@JsonSerialize(using= ToStringSerializer.class)
    public Long getAreaid() {
        return areaid;
    }

    public void setAreaid(Long areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }

    public Integer getAreastate() {
        return areastate;
    }

    public void setAreastate(Integer areastate) {
        this.areastate = areastate;
    }

    public Integer getAreasort() {
        return areasort;
    }

    public void setAreasort(Integer areasort) {
        this.areasort = areasort;
    }
}