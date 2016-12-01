package com.example.onehouwong.architecture.controller;

import android.graphics.drawable.PaintDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.activity.CalendarButtonControllerListener;
import com.example.onehouwong.architecture.activity.implementation.MainActivity;
import com.example.onehouwong.architecture.constant.ViewConstant;
import com.example.onehouwong.architecture.model.UserList;
import com.example.onehouwong.architecture.view.MainView;
import com.example.onehouwong.architecture.view.WindowView;

/**
 * Created by OneHouWong on 2016/12/1.
 */

public class CalendarButtonController implements View.OnClickListener{
    private MainView mainView;
    private CalendarButtonControllerListener listener;
    private View contentView;
    private int starNum;

    public CalendarButtonController(MainView mainView, View contentView, CalendarButtonControllerListener listener, int starNum){
        this.mainView = mainView;
        this.listener = listener;
        this.contentView = contentView;
        this.starNum = starNum;
    }

    @Override
    public void onClick(View v){
        PopupWindow popWindow;
        popWindow = new PopupWindow(contentView, (int)(ViewConstant.M_SCREEN_WIDTH*0.7), (int)(ViewConstant.M_SCREEN_HEIGHT*0.5), true);
        popWindow.setContentView(contentView);
        popWindow.setFocusable(true);
        popWindow.setBackgroundDrawable(new PaintDrawable(R.drawable.yuanjiao));
        popWindow.setOutsideTouchable(true);
        final View icon = contentView.findViewById(R.id.icon);
        final TextView starText = (TextView)contentView.findViewById(R.id.starNum);
        final Button leftButton = (Button)contentView.findViewById(R.id.leftBt);
        final Button rightButton = (Button)contentView.findViewById(R.id.rightBt);
        ((WindowView)contentView).setLeftButtonListeners(new LeftButtonController((WindowView)contentView));
        ((WindowView)contentView).setRightButtonListeners(new RightButtonController((WindowView)contentView));
        starText.setText(Integer.toString(starNum));
        View popBar = contentView.findViewById(R.id.popBar);

        if(UserList.getCurrentUser().getSex() == 1){
            popBar.setBackground(getResources().getDrawable(R.drawable.rewardbackground_boy));
            leftButton.setBackground(getResources().getDrawable(R.drawable.calendar_arrowleft_boy));
            rightButton.setBackground(getResources().getDrawable(R.drawable.calendar_arrowright_boy));
            icon.setBackground(getResources().getDrawable(R.drawable.hamburger));
        }
        else{
            popBar.setBackground(getResources().getDrawable(R.drawable.rewardbackground_girl));
            leftButton.setBackground(getResources().getDrawable(R.drawable.calendar_arrowleft_girl));
            rightButton.setBackground(getResources().getDrawable(R.drawable.calendar_arrowright_girl));
            icon.setBackground(getResources().getDrawable(R.drawable.hamburger));
        }

        listener.showWindow(popWindow);
    }
}
