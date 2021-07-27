package com.atguigu.spring5;

/**
 * @author hanani
 * @created 2021-07-26-1:28
 */
public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public void add(){
        System.out.println("add...");
    }
}
