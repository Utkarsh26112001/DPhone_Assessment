package com.markets.service;

public class Referral {
    public int rid;
    public String rname;
    public int rpoints;

    @Override
    public String toString() {
        return "Referral{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", rpoints=" + rpoints +
                '}';
    }

    public Referral(int rid, String rname, int rpoints) {
        this.rid = rid;
        this.rname = rname;
        this.rpoints = rpoints;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public int getRpoints() {
        return rpoints;
    }

    public void setRpoints(int rpoints) {
        this.rpoints = rpoints;
    }
}
