package com.friend.py.model;

public class Account {
    private String acc;

    private String psd;

    private String acctype;

    public Account(String acc, String psd, String acctype) {
        this.acc = acc;
        this.psd = psd;
        this.acctype = acctype;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc == null ? null : acc.trim();
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd == null ? null : psd.trim();
    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype == null ? null : acctype.trim();
    }
}