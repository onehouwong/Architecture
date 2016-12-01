package com.example.onehouwong.architecture.model;

import android.util.Base64;

public class UserList {
    private User[] users;
    private Calendar[] calendars;
    private static volatile UserList userlist = null;
    private int userIndex, calendarIndex;
    private User currentUser;
    private Calendar currentCalendar;

    private UserList() {
        User boy1 = new User(1, "boy1");
        Calendar boy1Calendar = new Calendar(boy1);
        User girl1 = new User(0, "girl1");
        Calendar girl1Calendar = new Calendar(girl1);
        currentUser = users[0];
        currentCalendar = calendars[0];
        users = new User[2];
        calendars = new Calendar[2];
        users[0] = boy1;    users[1] = girl1;
        calendars[0] = boy1Calendar;    calendars[1] = girl1Calendar;
        userIndex = 1;
        calendarIndex = 1;
    }

    public static UserList init() {
        if (userlist == null) {
            synchronized (UserList.class) {
                if (userlist == null) {
                    userlist = new UserList();
                }
            }
        }
        return userlist;
    }

    public static void addUser(User user, Calendar calendar){
        userlist.userIndex += 1;
        userlist.calendarIndex += 1;
        userlist.users[userlist.userIndex] = user;
        userlist.calendars[userlist.calendarIndex] = calendar;
    }

    public static UserList getUserList() {
        return userlist;
    }
    public static User[] getUsers(){    return userlist.users; }
    public static Calendar[] getCalendars(){    return userlist.calendars;}
    public static void setCurrentUser(User user){    userlist.currentUser = user;   }
    public static void setCurrentCalendar(Calendar calendar){   userlist.currentCalendar = calendar; }
    public static User getCurrentUser(){    return userlist.currentUser; }
    public static Calendar getCurrentCalendar(){    return userlist.currentCalendar;    }
}
