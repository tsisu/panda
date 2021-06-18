package com.tang.panda.pojo;

public class SysColumn {
    private Long colid;

    private String colname;

    private Integer colstate;

    private Integer colsort;

    private String colurl;

    public Long getColid() {
        return colid;
    }

    public void setColid(Long colid) {
        this.colid = colid;
    }

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname == null ? null : colname.trim();
    }

    public Integer getColstate() {
        return colstate;
    }

    public void setColstate(Integer colstate) {
        this.colstate = colstate;
    }

    public Integer getColsort() {
        return colsort;
    }

    public void setColsort(Integer colsort) {
        this.colsort = colsort;
    }

    public String getColurl() {
        return colurl;
    }

    public void setColurl(String colurl) {
        this.colurl = colurl == null ? null : colurl.trim();
    }
}