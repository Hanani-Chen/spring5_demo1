package com.atguigu.spring5;

public class Book {

    private String bname;
    private String bauthor;
    private String address="test";
    private int test;

    public void setTest(int test) {
        this.test = test;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bname + "-" + bauthor);
    }
}
