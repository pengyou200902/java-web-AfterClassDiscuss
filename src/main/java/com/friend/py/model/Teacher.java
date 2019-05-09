package com.friend.py.model;

public class Teacher {
    private String teano;

    private String teaname;

    private String gender;

    private String deptno;

    private String tealevel;

    private String teadscpt;

    private Double salary;

    private String id;

    private String phone;

    public Teacher(String teano, String teaname, String gender,
                   String deptno, String tealevel, String teadscpt,
                   Double salary, String id, String phone) {
        this.teano = teano;
        this.teaname = teaname;
        this.gender = gender;
        this.deptno = deptno;
        this.tealevel = tealevel;
        this.teadscpt = teadscpt;
        this.salary = salary;
        this.id = id;
        this.phone = phone;
    }

    public String getTeano() {
        return teano;
    }

    public void setTeano(String teano) {
        this.teano = teano == null ? null : teano.trim();
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname == null ? null : teaname.trim();
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

    public String getTealevel() {
        return tealevel;
    }

    public void setTealevel(String tealevel) {
        this.tealevel = tealevel == null ? null : tealevel.trim();
    }

    public String getTeadscpt() {
        return teadscpt;
    }

    public void setTeadscpt(String teadscpt) {
        this.teadscpt = teadscpt == null ? null : teadscpt.trim();
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
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