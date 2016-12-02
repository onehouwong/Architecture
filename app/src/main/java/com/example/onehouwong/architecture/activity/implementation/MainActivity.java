package com.example.onehouwong.architecture.activity.implementation;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.activity.CalendarButtonControllerListener;
import com.example.onehouwong.architecture.activity.UserPortraitControllerListener;
import com.example.onehouwong.architecture.controller.CalendarButtonController;
import com.example.onehouwong.architecture.controller.UserPortraitController;

import com.example.onehouwong.architecture.model.UserList;
import com.example.onehouwong.architecture.view.MainView;


public class MainActivity extends AppCompatActivity implements CalendarButtonControllerListener, UserPortraitControllerListener {

    private PopupWindow popWindow;
    public void showWindow(PopupWindow popWindow){
        this.popWindow = popWindow;
        View rootview = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_main, null);
        popWindow.showAtLocation(rootview, Gravity.CENTER, 0, 0);
    }

    public void change(android.app.AlertDialog.Builder builder){
        builder.create().show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics dm = new DisplayMetrics();

        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        final int mScreenWidth  = dm.widthPixels;
        final int mScreenHeight = dm.heightPixels;

        MainView mainView = (MainView)this.findViewById(R.id.main_layout);
        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        //设置contentView
        View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.popup_window, null);
        popWindow = new PopupWindow(contentView, (int)(mScreenWidth*0.7), (int)(mScreenHeight*0.5), true);

        LinearLayout[] buttons = mainView.getCalendarButton();
        for(int i=0;i<buttons.length;++i){
            CalendarButtonController calendarButtonController = new CalendarButtonController(mainView, contentView, this, i, popWindow);
            mainView.setButtonListeners(buttons[i], calendarButtonController);
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        mainView.setUserPortraitListener(new UserPortraitController(mainView, this, builder));
        init(mainView);
    }

    private void init(MainView mainView) {
        TextView[] textViews = mainView.getTextViews();
        for (int i = 0; i < textViews.length; ++i)
            textViews[i].setText(Integer.toString(UserList.getCurrentCalendar().getStar(i)));
        TextView starText = (TextView) findViewById(R.id.starText1);
        starText.setText(Integer.toString(UserList.getCurrentCalendar().getSum()));
        final TextView username = mainView.getUserName();
        username.setText(UserList.getCurrentUser().getUserName());
    }
}

