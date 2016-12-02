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
    private PopupWindow popWindow;

    public CalendarButtonController(MainView mainView, View contentView, CalendarButtonControllerListener listener, int index, PopupWindow window){
        this.mainView = mainView;
        this.listener = listener;
        this.contentView = contentView;
        this.starNum = UserList.getCurrentCalendar().getStar(index);
        this.popWindow = window;
    }

    @Override
    public void onClick(View v){
        popWindow.setContentView(contentView);
        popWindow.setFocusable(true);
        popWindow.setBackgroundDrawable(new PaintDrawable(R.drawable.yuanjiao));
        popWindow.setOutsideTouchable(true);
        final View icon = contentView.findViewById(R.id.icon);
        final TextView starText = ((WindowView)contentView).getStarNum();
        final Button leftButton = ((WindowView)contentView).getLeftButton();
        final Button rightButton = ((WindowView)contentView).getRightButton();
        ((WindowView)contentView).setLeftButtonListeners(new LeftButtonController((WindowView)contentView));
        ((WindowView)contentView).setRightButtonListeners(new RightButtonController((WindowView)contentView));
        starText.setText(Integer.toString(starNum));
        View popBar = contentView.findViewById(R.id.popBar);

        if(UserList.getCurrentUser().getSex() == 1){
            popBar.setBackground(contentView.getResources().getDrawable(R.drawable.rewardbackground_boy));
            leftButton.setBackground(contentView.getResources().getDrawable(R.drawable.calendar_arrowleft_boy));
            rightButton.setBackground(contentView.getResources().getDrawable(R.drawable.calendar_arrowright_boy));
            icon.setBackground(contentView.getResources().getDrawable(R.drawable.hamburger));
        }
        else{
            popBar.setBackground(contentView.getResources().getDrawable(R.drawable.rewardbackground_girl));
            leftButton.setBackground(contentView.getResources().getDrawable(R.drawable.calendar_arrowleft_girl));
            rightButton.setBackground(contentView.getResources().getDrawable(R.drawable.calendar_arrowright_girl));
            icon.setBackground(contentView.getResources().getDrawable(R.drawable.hamburger));
        }
        if(starNum != 0)
            listener.showWindow(popWindow);
    }
}
