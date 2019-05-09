package com.friend.py.model;

public class LessonKey {
    private String lsnno;

    private String teano;

    public LessonKey(String lsnno, String teano) {
        this.lsnno = lsnno;
        this.teano = teano;
    }

    public String getLsnno() {
        return lsnno;
    }

    public void setLsnno(String lsnno) {
        this.lsnno = lsnno == null ? null : lsnno.trim();
    }

    public String getTeano() {
        return teano;
    }

    public void setTeano(String teano) {
        this.teano = teano == null ? null : teano.trim();
    }
}