package com.tang.panda.pojo;

public class HotelTraffic {
    private Long htrid;

    private Long hotelid;

    private String htrdestination;

    private String htrdesc;

    private String htrtime;

    private Integer htrstate;

    private Integer htrsort;

    public Long getHtrid() {
        return htrid;
    }

    public void setHtrid(Long htrid) {
        this.htrid = htrid;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getHtrdestination() {
        return htrdestination;
    }

    public void setHtrdestination(String htrdestination) {
        this.htrdestination = htrdestination == null ? null : htrdestination.trim();
    }

    public String getHtrdesc() {
        return htrdesc;
    }

    public void setHtrdesc(String htrdesc) {
        this.htrdesc = htrdesc == null ? null : htrdesc.trim();
    }

    public String getHtrtime() {
        return htrtime;
    }

    public void setHtrtime(String htrtime) {
        this.htrtime = htrtime == null ? null : htrtime.trim();
    }

    public Integer getHtrstate() {
        return htrstate;
    }

    public void setHtrstate(Integer htrstate) {
        this.htrstate = htrstate;
    }

    public Integer getHtrsort() {
        return htrsort;
    }

    public void setHtrsort(Integer htrsort) {
        this.htrsort = htrsort;
    }
}