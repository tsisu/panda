package com.tang.panda.pojo;

public class HotelImgs {
    private Long himgid;

    private Long hotelid;

    private String himgurl;

    private String himgdesc;

    private Integer himgsort;

    public Long getHimgid() {
        return himgid;
    }

    public void setHimgid(Long himgid) {
        this.himgid = himgid;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getHimgurl() {
        return himgurl;
    }

    public void setHimgurl(String himgurl) {
        this.himgurl = himgurl == null ? null : himgurl.trim();
    }

    public String getHimgdesc() {
        return himgdesc;
    }

    public void setHimgdesc(String himgdesc) {
        this.himgdesc = himgdesc == null ? null : himgdesc.trim();
    }

    public Integer getHimgsort() {
        return himgsort;
    }

    public void setHimgsort(Integer himgsort) {
        this.himgsort = himgsort;
    }
}