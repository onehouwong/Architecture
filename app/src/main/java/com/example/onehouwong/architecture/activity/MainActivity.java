package com.example.onehouwong.architecture.activity;

import android.graphics.drawable.PaintDrawable;
import android.os.CancellationSignal;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.model.Calendar;
import com.example.onehouwong.architecture.model.User;
import com.zhy.android.percent.support.PercentFrameLayout;

public class MainActivity extends AppCompatActivity{

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
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentUser = users[0]; // 当前用户设置
        currentCalendar = calendars[0];

        DisplayMetrics dm = new DisplayMetrics();
        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        final int mScreenWidth  = dm.widthPixels;
        final int mScreenHeight = dm.heightPixels;
        final Button start1 = (Button) findViewById(R.id.star1);
        final Button userportrait = (Button) findViewById(R.id.userportrait);
        final Button homeButton = (Button) findViewById(R.id.homeButton);
        final Button closeStatus = (Button) findViewById(R.id.closeStatus);
        final Button statusUserIcon = (Button) findViewById(R.id.statusUserIcon);
        final TextView starText1 = (TextView) findViewById(R.id.starText1);
        final TextView username = (TextView) findViewById(R.id.username);
        final TextView statusText1 = (TextView) findViewById(R.id.statusText1);
        final TextView statusText2 = (TextView) findViewById(R.id.statusText2);
        final TextView statusText4 = (TextView) findViewById(R.id.statusText4);
        final TextView statusText5 = (TextView) findViewById(R.id.statusText5);
        final TextView statusText6 = (TextView) findViewById(R.id.statusText6);
        final View statusBar2 = findViewById(R.id.statusBar2);

        // 设置日历按钮
        buttons = new LinearLayout[]{(LinearLayout) findViewById(R.id.bt1), (LinearLayout) findViewById(R.id.bt2),
                (LinearLayout) findViewById(R.id.bt3), (LinearLayout) findViewById(R.id.bt4),
                (LinearLayout) findViewById(R.id.bt5), (LinearLayout) findViewById(R.id.bt6),
                (LinearLayout) findViewById(R.id.bt7), (LinearLayout) findViewById(R.id.bt8),
                (LinearLayout) findViewById(R.id.bt9), (LinearLayout) findViewById(R.id.bt10),
                (LinearLayout) findViewById(R.id.bt11), (LinearLayout) findViewById(R.id.bt12),
                (LinearLayout) findViewById(R.id.bt13), (LinearLayout) findViewById(R.id.bt14),
                (LinearLayout) findViewById(R.id.bt15), (LinearLayout) findViewById(R.id.bt16),
                (LinearLayout) findViewById(R.id.bt17), (LinearLayout) findViewById(R.id.bt18),
                (LinearLayout) findViewById(R.id.bt19), (LinearLayout) findViewById(R.id.bt20),
                (LinearLayout) findViewById(R.id.bt21)};



        init();
        changeTheme(currentUser.getSex());
        setStars();

        ButtonListener buttonListener = new ButtonListener();
        for(int i=0;i<buttons.length;++i){
            buttons[i].setOnClickListener(buttonListener);
        }
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
                showPopupWindow();
        }
    }

    private void init(){
        DisplayMetrics dm = new DisplayMetrics();
        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        final int mScreenWidth  = dm.widthPixels;
        final int mScreenHeight = dm.heightPixels;

        final Button start1 = (Button) findViewById(R.id.star1);
        final Button userportrait = (Button) findViewById(R.id.userportrait);
        final Button homeButton = (Button) findViewById(R.id.homeButton);
        final Button closeStatus = (Button) findViewById(R.id.closeStatus);
        final Button statusUserIcon = (Button) findViewById(R.id.statusUserIcon);
        final TextView starText1 = (TextView) findViewById(R.id.starText1);
        final TextView username = (TextView) findViewById(R.id.username);
        final TextView statusText1 = (TextView) findViewById(R.id.statusText1);
        final TextView statusText2 = (TextView) findViewById(R.id.statusText2);
        final TextView statusText4 = (TextView) findViewById(R.id.statusText4);
        final TextView statusText5 = (TextView) findViewById(R.id.statusText5);
        final TextView statusText6 = (TextView) findViewById(R.id.statusText6);
        final View statusBar2 = findViewById(R.id.statusBar2);

    }

    private void changeTheme(int sex){  // 用于根据性别改变主题的函数
        final Button userportrait = (Button) findViewById(R.id.userportrait);
        final Button homeButton = (Button) findViewById(R.id.homeButton);
        final View statusBar2 = findViewById(R.id.statusBar2);
        View cartoonface = findViewById(R.id.cartoonface);
        View goal = findViewById(R.id.goal);
        PercentFrameLayout bluebar = (PercentFrameLayout) findViewById(R.id.bluebar);
        PercentFrameLayout activity_main = (PercentFrameLayout) findViewById(R.id.activity_main);
        if(currentUser.getSex() == 0){
            userportrait.setBackground(getResources().getDrawable(R.drawable.head2));
            cartoonface.setBackground(getResources().getDrawable(R.drawable.face2));
            homeButton.setBackground(getResources().getDrawable(R.drawable.homebutton2));
            goal.setBackground(getResources().getDrawable(R.drawable.goal2));
            bluebar.setBackground(getResources().getDrawable(R.color.colorAccent));
            statusBar2.setBackground(getResources().getDrawable(R.color.colorAccent));
            activity_main.setBackground(getResources().getDrawable(R.drawable.homebackgournd2));
        }
        else{
            userportrait.setBackground(getResources().getDrawable(R.drawable.head1));
            cartoonface.setBackground(getResources().getDrawable(R.drawable.face1));
            homeButton.setBackground(getResources().getDrawable(R.drawable.homebutton));
            goal.setBackground(getResources().getDrawable(R.drawable.goal));
            bluebar.setBackground(getResources().getDrawable(R.color.lakeBlue));
            statusBar2.setBackground(getResources().getDrawable(R.color.lakeBlue));
            activity_main.setBackground(getResources().getDrawable(R.drawable.homebackgournd));
        }
    }

    private PopupWindow popWindow;
    private void showPopupWindow() {
        index = 1;
        DisplayMetrics dm = new DisplayMetrics();
        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        final int mScreenWidth  = dm.widthPixels;
        final int mScreenHeight = dm.heightPixels;
        //设置contentView
        View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.popup_window, null);
        popWindow = new PopupWindow(contentView, (int)(mScreenWidth*0.7), (int)(mScreenHeight*0.5), true);
        popWindow.setContentView(contentView);
        popWindow.setFocusable(true);
        popWindow.setBackgroundDrawable(new PaintDrawable(R.drawable.yuanjiao));
        popWindow.setOutsideTouchable(true);
        final View icon = contentView.findViewById(R.id.icon);
        final Button leftButton = (Button) contentView.findViewById(R.id.leftBt);
        final Button rightButton = (Button) contentView.findViewById(R.id.rightBt);
        View popBar = contentView.findViewById(R.id.popBar);

        if(currentUser.getSex() == 1){
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
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index == 2){
                    icon.setBackground(getResources().getDrawable(R.drawable.hamburger));
                    index--;
                    leftButton.setEnabled(false);
                    leftButton.setVisibility(View.INVISIBLE);
                }
                else if(index == 3){
                    icon.setBackground(getResources().getDrawable(R.drawable.chocolate));
                    index--;
                    rightButton.setEnabled(true);
                    rightButton.setVisibility(View.VISIBLE);
                }
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index == 1){
                    icon.setBackground(getResources().getDrawable(R.drawable.chocolate));
                    index++;
                    leftButton.setEnabled(true);
                    leftButton.setVisibility(View.VISIBLE);
                }
                else if(index == 2){
                    icon.setBackground(getResources().getDrawable(R.drawable.cupcake));
                    index++;
                    rightButton.setEnabled(false);
                    rightButton.setVisibility(View.INVISIBLE);
                }
            }
        });

        //显示窗口
        View rootview = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_main, null);
        popWindow.showAtLocation(rootview, Gravity.CENTER, 0, 0);

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
        TextView text = (TextView)findViewById(R.id.starText1);
        text.setText(Integer.toString(sum));
        currentUser.setStars(sum);
    }

    // 切换用户
    private void switchUser(int index){ currentUser = users[index]; currentCalendar = calendars[index]; }
}

