package com.example.onehouwong.architecture.model;

/**
 * Created by OneHouWong on 2016/11/22.
 */

public class User {
    private int sex;
    private String userName;
    private int stars;

    public User(int s, String name, int star){
        sex = s;
        userName = name;
        stars = star;
    }

    public int getSex(){    return sex; }
    public String getUserName(){   return userName;    }
    public int getStars(){  return stars;   }
}
