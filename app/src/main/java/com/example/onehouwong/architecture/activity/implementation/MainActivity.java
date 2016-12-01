package com.example.onehouwong.architecture.activity.implementation;

import android.content.DialogInterface;
import android.graphics.drawable.PaintDrawable;
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
import com.example.onehouwong.architecture.model.Calendar;
import com.example.onehouwong.architecture.model.User;
import com.example.onehouwong.architecture.model.UserList;
import com.example.onehouwong.architecture.view.MainView;
import com.example.onehouwong.architecture.view.WindowView;
import com.zhy.android.percent.support.PercentFrameLayout;

public class MainActivity extends AppCompatActivity implements CalendarButtonControllerListener, UserPortraitControllerListener {

    User boy1 = new User(1, "boy1");
    Calendar boy1Calendar = new Calendar(boy1);
    User girl1 = new User(0, "girl1");
    Calendar girl1Calendar = new Calendar(girl1);
    User[] users = new User[]{boy1, girl1};
    Calendar[] calendars = new Calendar[]{boy1Calendar, girl1Calendar};

    User currentUser; // 当前切换所在的用户
    Calendar currentCalendar;

    ImageView[] images;
    TextView[] textViews;
    LinearLayout[] buttons;

    public void showWindow(PopupWindow popWindow){
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
        currentUser = users[0]; // 当前用户设置
        currentCalendar = calendars[0];

        DisplayMetrics dm = new DisplayMetrics();
        MainView mainView = (MainView)this.findViewById(R.id.main_layout);
        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        //设置contentView
        View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.popup_window, null);
        LinearLayout[] buttons = mainView.getCalendarButton();
        for(int i=0;i<buttons.length;++i){
            CalendarButtonController calendarButtonController = new CalendarButtonController(mainView, contentView, this, UserList.getCurrentCalendar().getStar(i));
            mainView.setButtonListeners(buttons[i], calendarButtonController);
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        Button userPort = mainView.getUserPortrait();
        userPort.setOnClickListener(new UserPortraitController(mainView, this, builder));

        init();
        setStars();
    }
    class ButtonListener implements  View.OnClickListener{
        @Override
        public void onClick(View v) {
            LinearLayout button = (LinearLayout)findViewById(v.getId());
            int index = 0;
            for(int i=0;i<buttons.length;++i)
                if(buttons[i] == button)
                    index = i;
            int sum = Integer.parseInt(textViews[index].getText().toString());
            if(sum != 0) // 0颗星的话就没有奖励了╮(╯_╰)╭
                showPopupWindow(sum);
        }
    }

    private void init(){
        DisplayMetrics dm = new DisplayMetrics();
        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        final TextView username = (TextView) findViewById(R.id.username);
        username.setText(currentUser.getUserName());
        Button userPort = (Button)findViewById(R.id.userportrait);
        final String[] userNames = new String[users.length];
        for(int i=0;i<users.length;++i)
            userNames[i] = users[i].getUserName();
        userPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }



    private void setStars(){
        images = new ImageView[]{(ImageView)findViewById(R.id.image1), (ImageView)findViewById(R.id.image2),
                              (ImageView)findViewById(R.id.image3), (ImageView)findViewById(R.id.image4),
                              (ImageView)findViewById(R.id.image5), (ImageView)findViewById(R.id.image6),
                              (ImageView)findViewById(R.id.image7), (ImageView)findViewById(R.id.image8),
                              (ImageView)findViewById(R.id.image9), (ImageView)findViewById(R.id.image10),
                              (ImageView)findViewById(R.id.image11), (ImageView)findViewById(R.id.image12),
                              (ImageView)findViewById(R.id.image13), (ImageView)findViewById(R.id.image14),
                              (ImageView)findViewById(R.id.image15), (ImageView)findViewById(R.id.image16),
                              (ImageView)findViewById(R.id.image17), (ImageView)findViewById(R.id.image18),
                              (ImageView)findViewById(R.id.image19), (ImageView)findViewById(R.id.image20),
                              (ImageView)findViewById(R.id.image21)};
        textViews = new TextView[]{(TextView) findViewById(R.id.text1), (TextView) findViewById(R.id.text2),
                                (TextView) findViewById(R.id.text3), (TextView) findViewById(R.id.text4),
                                (TextView) findViewById(R.id.text5), (TextView) findViewById(R.id.text6),
                                (TextView) findViewById(R.id.text7), (TextView) findViewById(R.id.text8),
                                (TextView) findViewById(R.id.text9), (TextView) findViewById(R.id.text10),
                                (TextView) findViewById(R.id.text11), (TextView) findViewById(R.id.text12),
                                (TextView) findViewById(R.id.text13), (TextView) findViewById(R.id.text14),
                                (TextView) findViewById(R.id.text15), (TextView) findViewById(R.id.text16),
                                (TextView) findViewById(R.id.text17), (TextView) findViewById(R.id.text18),
                                (TextView) findViewById(R.id.text19), (TextView) findViewById(R.id.text20),
                                (TextView) findViewById(R.id.text21)};
        int sum = 0;
        for(int i=1; i<=images.length;++i)
        {
            int number = (int)(Math.random()*10);
            sum += number;
            images[i-1].setImageResource(R.drawable.star);
            textViews[i-1].setText(Integer.toString(number));
            currentCalendar.setStar(i-1, number);
        }
        TextView starText = (TextView)findViewById(R.id.starText1);
        starText.setText(Integer.toString(sum));
        currentUser.setStars(sum);
    }

}

