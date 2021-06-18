package com.tang.panda.pojo;

public class SpotsHotel {
    private Long shid;

    private Long spotsid;

    private Long hotelid;

    private String shdistance;

    public Long getShid() {
        return shid;
    }

    public void setShid(Long shid) {
        this.shid = shid;
    }

    public Long getSpotsid() {
        return spotsid;
    }

    public void setSpotsid(Long spotsid) {
        this.spotsid = spotsid;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getShdistance() {
        return shdistance;
    }

    public void setShdistance(String shdistance) {
        this.shdistance = shdistance == null ? null : shdistance.trim();
    }
}