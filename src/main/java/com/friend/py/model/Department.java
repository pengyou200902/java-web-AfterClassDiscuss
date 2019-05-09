package com.friend.py.model;

public class Department {
    private String deptno;

    private String deptname;

    public Department(String deptno, String deptname) {
        this.deptno = deptno;
        this.deptname = deptname;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno == null ? null : deptno.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}