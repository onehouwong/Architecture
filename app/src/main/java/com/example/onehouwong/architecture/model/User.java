package com.example.onehouwong.architecture.model;

/**
 * Created by OneHouWong on 2016/11/22.
 */

public class User {
    private int sex;  // 1表示男 0表示女
    private String userName;
    public User(int s, String name){
        sex = s;
        userName = name;
    }

    public int getSex(){    return sex; }
    public String getUserName(){   return userName;    }

}
