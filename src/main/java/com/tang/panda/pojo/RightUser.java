package com.tang.panda.pojo;

import java.util.Date;

public class RightUser {
    private Long userid;

    private Long roleid;

    private String username;

    private String userpwd;

    private String usersalt;

    private String usertruename;

    private String usersex;

    private String userphone;

    private String useremail;

    private Date usercreatetime;

    private Date userupdatetime;

    private Date userlogintime;

    private Integer userstate;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getUsersalt() {
        return usersalt;
    }

    public void setUsersalt(String usersalt) {
        this.usersalt = usersalt == null ? null : usersalt.trim();
    }

    public String getUsertruename() {
        return usertruename;
    }

    public void setUsertruename(String usertruename) {
        this.usertruename = usertruename == null ? null : usertruename.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public Date getUsercreatetime() {
        return usercreatetime;
    }

    public void setUsercreatetime(Date usercreatetime) {
        this.usercreatetime = usercreatetime;
    }

    public Date getUserupdatetime() {
        return userupdatetime;
    }

    public void setUserupdatetime(Date userupdatetime) {
        this.userupdatetime = userupdatetime;
    }

    public Date getUserlogintime() {
        return userlogintime;
    }

    public void setUserlogintime(Date userlogintime) {
        this.userlogintime = userlogintime;
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }
}