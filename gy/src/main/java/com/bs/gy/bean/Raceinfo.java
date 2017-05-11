package com.bs.gy.bean;

import java.util.Date;

public class Raceinfo {
    private Integer ids;

    private String racename;

    private Integer userid;

    private Integer typeid;

    private String achive;

    private Date time;

    private String raceimg;

    private String extra1;

    private String extra2;

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getRacename() {
        return racename;
    }

    public void setRacename(String racename) {
        this.racename = racename == null ? null : racename.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getAchive() {
        return achive;
    }

    public void setAchive(String achive) {
        this.achive = achive == null ? null : achive.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRaceimg() {
        return raceimg;
    }

    public void setRaceimg(String raceimg) {
        this.raceimg = raceimg == null ? null : raceimg.trim();
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1 == null ? null : extra1.trim();
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2 == null ? null : extra2.trim();
    }
}