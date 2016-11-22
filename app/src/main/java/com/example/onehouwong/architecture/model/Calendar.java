package com.example.onehouwong.architecture.model;

/**
 * Created by OneHouWong on 2016/11/22.
 */

public class Calendar {
    private User user;
    private final int DAYS = 20;
    private int[] star;
    private int[] rewards;

    public Calendar(User u){
        user = u;
        star = new int[DAYS];
        rewards = new int[DAYS];
        for(int i=0;i<20;++i)
        {
            star[i] = 0;
            rewards[i] = 0;
        }
    }

    public User getUser(){  return user;    }
    public int getStar(int i){    return star[i];   }
    public int getRewards(int i){  return rewards[i]; }
    public void setStar(int i, int num){    star[i] = num;  }
    public void setRewards(int i, int num){ rewards[i] = num;   }

}
