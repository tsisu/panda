package com.tang.panda.pojo;

public class NoteType {
    private Long ntypeid;

    private String rtypename;

    private Integer rtypestate;

    public Long getNtypeid() {
        return ntypeid;
    }

    public void setNtypeid(Long ntypeid) {
        this.ntypeid = ntypeid;
    }

    public String getRtypename() {
        return rtypename;
    }

    public void setRtypename(String rtypename) {
        this.rtypename = rtypename == null ? null : rtypename.trim();
    }

    public Integer getRtypestate() {
        return rtypestate;
    }

    public void setRtypestate(Integer rtypestate) {
        this.rtypestate = rtypestate;
    }
}