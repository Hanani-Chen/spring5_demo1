package com.atguigu.spring5.bean;

public class Emp {
    private String eName;
    private String gender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add(){
        System.out.println(eName + " " + gender + " " + dept.toString());
    }
}
