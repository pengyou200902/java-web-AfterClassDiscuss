package com.friend.py.model;

public class Lesson extends LessonKey {
    private String lsnname;

    private String dscpt;

    private String deptno;

    private Byte credits;

    public Lesson(String lsnno, String teanno, String lsnname, String dscpt, String deptno, Byte credits) {
        super(lsnno, teanno);
        this.lsnname = lsnname;
        this.dscpt = dscpt;
        this.deptno = deptno;
        this.credits = credits;
    }
    public Lesson(String lsnno, String teanno, String lsnname, String dscpt, String deptno, Integer credits) {
        super(lsnno, teanno);
        this.lsnname = lsnname;
        this.dscpt = dscpt;
        this.deptno = deptno;
        this.credits = credits.byteValue();
    }

    public Lesson(String whatsthat, String lsnno, String teanno, String lsnname, String dscpt, String deptno, Integer credits) {
        super(lsnno, teanno);
        System.out.println("Lesson whatsthat="+whatsthat);
        this.lsnname = lsnname;
        this.dscpt = dscpt;
        this.deptno = deptno;
        this.credits = credits.byteValue();
    }

    public String getLsnname() {
        return lsnname;
    }

    public void setLsnname(String lsnname) {
        this.lsnname = lsnname == null ? null : lsnname.trim();
    }

    public String getDscpt() {
        return dscpt;
    }

    public void setDscpt(String dscpt) {
        this.dscpt = dscpt == null ? null : dscpt.trim();
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno == null ? null : deptno.trim();
    }

    public Byte getCredits() {
        return credits;
    }

    public void setCredits(Byte credits) {
        this.credits = credits;
    }
}