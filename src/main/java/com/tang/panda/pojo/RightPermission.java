package com.tang.panda.pojo;

public class RightPermission {
    private Long preid;

    private String prename;

    private String predesc;

    private String preurl;

    private String prepid;

    private Long pretype;

    private Long presort;

    private String preicon;

    private Integer prestate;

    public Long getPreid() {
        return preid;
    }

    public void setPreid(Long preid) {
        this.preid = preid;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename == null ? null : prename.trim();
    }

    public String getPredesc() {
        return predesc;
    }

    public void setPredesc(String predesc) {
        this.predesc = predesc == null ? null : predesc.trim();
    }

    public String getPreurl() {
        return preurl;
    }

    public void setPreurl(String preurl) {
        this.preurl = preurl == null ? null : preurl.trim();
    }

    public String getPrepid() {
        return prepid;
    }

    public void setPrepid(String prepid) {
        this.prepid = prepid == null ? null : prepid.trim();
    }

    public Long getPretype() {
        return pretype;
    }

    public void setPretype(Long pretype) {
        this.pretype = pretype;
    }

    public Long getPresort() {
        return presort;
    }

    public void setPresort(Long presort) {
        this.presort = presort;
    }

    public String getPreicon() {
        return preicon;
    }

    public void setPreicon(String preicon) {
        this.preicon = preicon == null ? null : preicon.trim();
    }

    public Integer getPrestate() {
        return prestate;
    }

    public void setPrestate(Integer prestate) {
        this.prestate = prestate;
    }
}