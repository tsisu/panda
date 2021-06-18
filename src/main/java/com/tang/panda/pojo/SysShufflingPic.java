package com.tang.panda.pojo;

public class SysShufflingPic {
    private Long imgid;

    private String imgurl;

    private Integer imgstate;

    private Integer imgsort;

    public Long getImgid() {
        return imgid;
    }

    public void setImgid(Long imgid) {
        this.imgid = imgid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getImgstate() {
        return imgstate;
    }

    public void setImgstate(Integer imgstate) {
        this.imgstate = imgstate;
    }

    public Integer getImgsort() {
        return imgsort;
    }

    public void setImgsort(Integer imgsort) {
        this.imgsort = imgsort;
    }
}