package com.example.onehouwong.architecture.model;

/**
 * Created by OneHouWong on 2016/11/22.
 */

public class Calendar {
    private User user;
    private final int DAYS = 21;
    private int[] star;
    private int sum;

    public Calendar(User u){
        user = u;
        sum = 0;
        star = new int[DAYS];
        for(int i=0;i<DAYS;++i) //初始化日历的星数
        {
            int number = (int)(Math.random()*10);
            sum += number;
            star[i] = number;
        }
    }

    public int getSum(){  return sum;    }
    public int getStar(int i){    return star[i];   }
    public void setStar(int i, int num){    star[i] = num;  }
}
