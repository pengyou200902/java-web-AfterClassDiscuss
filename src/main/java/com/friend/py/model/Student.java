package com.friend.py.model;

public class Student {
    private String stuno;

    private String stuname;

    private String gender;

    private String deptno;

    private Byte totcredit;

    private String id;

    private String phone;

    public Student(String stuno, String stuname, String gender, String deptno, Byte totcredit, String id, String phone) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.gender = gender;
        this.deptno = deptno;
        this.totcredit = totcredit;
        this.id = id;
        this.phone = phone;
    }
    public Student(String stuno, String stuname, String gender, String deptno, Integer totcredit, String id, String phone) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.gender = gender;
        this.deptno = deptno;
        this.totcredit = totcredit.byteValue();
        this.id = id;
        this.phone = phone;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno == null ? null : stuno.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno == null ? null : deptno.trim();
    }

    public Byte getTotcredit() {
        return totcredit;
    }

    public void setTotcredit(Byte totcredit) {
        this.totcredit = totcredit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}