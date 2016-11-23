package com.example.onehouwong.architecture.model;

/**
 * Created by OneHouWong on 2016/11/22.
 */

public class Calendar {
    private User user;
    private final int DAYS = 21;
    private int[] star;

    public Calendar(User u){
        user = u;
        star = new int[DAYS];
        for(int i=0;i<DAYS;++i)
        {
            star[i] = 0;
        }
    }

    public User getUser(){  return user;    }
    public int getStar(int i){    return star[i];   }
    public void setStar(int i, int num){    star[i] = num;  }
}
