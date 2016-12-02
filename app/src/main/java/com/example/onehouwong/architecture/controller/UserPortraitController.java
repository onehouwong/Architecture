package com.example.onehouwong.architecture.controller;

import android.content.DialogInterface;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.activity.UserPortraitControllerListener;
import com.example.onehouwong.architecture.activity.implementation.MainActivity;
import com.example.onehouwong.architecture.model.Calendar;
import com.example.onehouwong.architecture.model.User;
import com.example.onehouwong.architecture.model.UserList;
import com.example.onehouwong.architecture.view.MainView;
import com.example.onehouwong.architecture.view.WindowView;
import com.zhy.android.percent.support.PercentFrameLayout;

/**
 * Created by OneHouWong on 2016/12/1.
 */

public class UserPortraitController  implements View.OnClickListener {
    private MainView mainView;
    private UserPortraitControllerListener listener;
    AlertDialog.Builder builder;
    int result;

    public UserPortraitController(MainView mainView, UserPortraitControllerListener listener, AlertDialog.Builder builder){
        this.mainView = mainView;
        this.listener = listener;
        this.builder = builder;
    }

    @Override
    public void onClick(View v){
        User currentUser = UserList.getCurrentUser();
        if(currentUser.getSex() == 0) {
            builder.setIcon(R.drawable.face2);
        }
        else
            builder.setIcon(R.drawable.face1);
        builder.setTitle("切换宝宝");

        int item = 0;
        String[] userNames = new String[UserList.getUsers().length];
        for(int i=0;i<UserList.getUsers().length;++i){
            userNames[i] = UserList.getUsers()[i].getUserName();
            if(userNames[i] == mainView.getUserName().getText())
                item = i;
        }
        builder.setSingleChoiceItems(userNames, item, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                result = i;
            }
        });
        builder.setPositiveButton("切换", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                switchUser(result);
            }
        });
        listener.change(builder);
    }

    private void switchUser(int index){
        UserList.setCurrentUser(UserList.getUsers()[index]);
        UserList.setCurrentCalendar(UserList.getCalendars()[index]);
        User currentUser = UserList.getCurrentUser();
        changeTheme(currentUser.getSex());
        setStars();
        final TextView username = mainView.getUserName();
        username.setText(currentUser.getUserName());
    }

    private void changeTheme(int sex){  // 用于根据性别改变主题的函数
        final Button userportrait = mainView.getUserPortrait();
        View cartoonface = mainView.getCartoonFace();
        View goal = mainView.getGoal();
        PercentFrameLayout bluebar = mainView.getBlueBar();
        MainView activity_main = mainView.getLayout();
        if(sex == 0){
            userportrait.setBackground(mainView.getResources().getDrawable(R.drawable.head2));
            cartoonface.setBackground(mainView.getResources().getDrawable(R.drawable.face2));
            goal.setBackground(mainView.getResources().getDrawable(R.drawable.goal2));
            bluebar.setBackground(mainView.getResources().getDrawable(R.color.colorAccent));
            activity_main.setBackground(mainView.getResources().getDrawable(R.drawable.homebackgournd2));
        }
        else{
            userportrait.setBackground(mainView.getResources().getDrawable(R.drawable.head1));
            cartoonface.setBackground(mainView.getResources().getDrawable(R.drawable.face1));
            goal.setBackground(mainView.getResources().getDrawable(R.drawable.goal));
            bluebar.setBackground(mainView.getResources().getDrawable(R.color.lakeBlue));
            activity_main.setBackground(mainView.getResources().getDrawable(R.drawable.homebackgournd));
        }
    }

    private void setStars(){
        TextView[] textViews = mainView.getTextViews();
        for(int i=0; i<textViews.length;++i)
            textViews[i].setText(Integer.toString(UserList.getCurrentCalendar().getStar(i)));
        TextView starText = mainView.getStarText();
        starText.setText(Integer.toString(UserList.getCurrentCalendar().getSum()));
    }
}