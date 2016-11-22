package com.example.onehouwong.architecture.activity;

import android.graphics.drawable.PaintDrawable;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.*;

import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.model.User;
import com.zhy.android.percent.support.PercentFrameLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{

    User boy1 = new User(1, "boy1");
    User girl1 = new User(0, "girl1");
    User currentUser; // 当前切换所在的用户
    int iconIndex = 1;
    LinearLayout bt1; LinearLayout bt2;LinearLayout bt3;LinearLayout bt4;LinearLayout bt5;LinearLayout bt6;LinearLayout bt7;
    LinearLayout bt8;LinearLayout bt9;LinearLayout bt10;LinearLayout bt11;LinearLayout bt12;LinearLayout bt13;LinearLayout bt14;
    LinearLayout bt15;LinearLayout bt16;LinearLayout bt17;LinearLayout bt18;LinearLayout bt19;LinearLayout bt20;LinearLayout bt21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentUser = boy1; // 当前用户设置
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

        final TranslateAnimation translateAnimationStart1 = new TranslateAnimation(0,-mScreenWidth*0.4983f,0,mScreenHeight*0.04f);
        final TranslateAnimation translateAnimationStatusText1 = new TranslateAnimation(0,-mScreenWidth*0.4983f,0,mScreenHeight*0.04f);
        final TranslateAnimation translateAnimationStatusText2 = new TranslateAnimation(0,-mScreenWidth*0.4983f,0,mScreenHeight*0.04f);
        final TranslateAnimation translateAnimationUserportrait = new TranslateAnimation(0,0,0,-mScreenHeight*0.0716f);
        final TranslateAnimation translateAnimationUsername = new TranslateAnimation(0,-mScreenWidth*0.13f,0,-mScreenHeight*0.0233f);
        final TranslateAnimation translateAnimationStatusText6 = new TranslateAnimation(0,-mScreenWidth*0.2234f,0,0);
        final TranslateAnimation translateAnimationStatusUserIcon = new TranslateAnimation(0,-mScreenWidth*0.804f,0,0);
        final TranslateAnimation translateAnimationStatusText5 = new TranslateAnimation(0,-mScreenWidth*0.804f,0,0);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1500);

        translateAnimationStart1.setDuration(1500);
        translateAnimationStatusText1.setDuration(1500);
        translateAnimationStatusText2.setDuration(1500);
        translateAnimationUserportrait.setDuration(1500);
        translateAnimationUsername.setDuration(1500);
        translateAnimationStatusText6.setDuration(1500);
        translateAnimationStatusUserIcon.setDuration(1500);
        translateAnimationStatusText5.setDuration(1500);

        translateAnimationStart1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                start1.clearAnimation();
                int left = (int)(start1.getLeft()-mScreenWidth*0.4983f);
                int top = (int) (start1.getTop() + mScreenHeight*0.04f);
                int width = start1.getWidth();
                int height = start1.getHeight();
                start1.layout(left, top, left+width, top+height);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        translateAnimationUserportrait.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                userportrait.clearAnimation();
                int left = userportrait.getLeft();
                int top = (int) (userportrait.getTop()-mScreenHeight*0.0716f);
                int width = userportrait.getWidth();
                int height = userportrait.getHeight();
                userportrait.layout(left, top, left+width, top+height);
                closeStatus.setVisibility(View.VISIBLE);
                statusText1.setVisibility(View.VISIBLE);
                statusText2.setVisibility(View.VISIBLE);
                statusText4.setVisibility(View.VISIBLE);
                statusText6.setVisibility(View.VISIBLE);
                statusBar2.setVisibility(View.VISIBLE);
                statusUserIcon.setVisibility(View.VISIBLE);
                statusText5.setVisibility(View.VISIBLE);
                statusUserIcon.startAnimation(translateAnimationStatusUserIcon);
                statusText5.startAnimation(translateAnimationStatusText5);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        translateAnimationUsername.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                username.clearAnimation();
                int left = (int)(username.getLeft()-mScreenWidth*0.13f);
                int top = (int) (username.getTop()-mScreenHeight*0.0233f);
                int width = username.getWidth();
                int height = username.getHeight();
                username.layout(left, top, left+width, top+height);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        translateAnimationStatusText6.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                statusText6.clearAnimation();
                int left = (int)(statusText6.getLeft()-mScreenWidth*0.2234f);
                int top = statusText6.getTop();
                int width = statusText6.getWidth();
                int height = statusText6.getHeight();
                statusText6.layout(left, top, left+width, top+height);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        translateAnimationStatusUserIcon.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                statusUserIcon.clearAnimation();
                int left = (int)(statusUserIcon.getLeft()-mScreenWidth*0.804f);
                int top = statusUserIcon.getTop();
                int width = statusUserIcon.getWidth();
                int height = statusUserIcon.getHeight();
                statusUserIcon.layout(left, top, left+width, top+height);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
        translateAnimationStatusText5.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                statusText5.clearAnimation();
                int left = (int)(statusText5.getLeft()-mScreenWidth*0.804f);
                int top = statusText5.getTop();
                int width = statusText5.getWidth();
                int height = statusText5.getHeight();
                statusText5.layout(left, top, left+width, top+height);
            }
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        userportrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userportrait.setClickable(false);
                homeButton.setVisibility(View.INVISIBLE);
                start1.startAnimation(translateAnimationStart1);
                starText1.startAnimation(translateAnimationStatusText1);
                userportrait.startAnimation(translateAnimationUserportrait);
                username.startAnimation(translateAnimationUsername);
                statusText6.startAnimation(translateAnimationStatusText6);
                statusBar2.startAnimation(alphaAnimation);

            }
        });

        // 设置日历按钮
        LinearLayout bt1 = (LinearLayout) findViewById(R.id.bt1);
        LinearLayout bt2 = (LinearLayout) findViewById(R.id.bt2);
        LinearLayout bt3 = (LinearLayout) findViewById(R.id.bt3);
        LinearLayout bt4 = (LinearLayout) findViewById(R.id.bt4);
        LinearLayout bt5 = (LinearLayout) findViewById(R.id.bt5);
        LinearLayout bt6 = (LinearLayout) findViewById(R.id.bt6);
        LinearLayout bt7 = (LinearLayout) findViewById(R.id.bt7);
        LinearLayout bt8 = (LinearLayout) findViewById(R.id.bt8);
        LinearLayout bt9 = (LinearLayout) findViewById(R.id.bt9);
        LinearLayout bt10 = (LinearLayout) findViewById(R.id.bt10);
        LinearLayout bt11 = (LinearLayout) findViewById(R.id.bt11);
        LinearLayout bt12 = (LinearLayout) findViewById(R.id.bt12);
        LinearLayout bt13 = (LinearLayout) findViewById(R.id.bt13);
        LinearLayout bt14 = (LinearLayout) findViewById(R.id.bt14);
        LinearLayout bt15 = (LinearLayout) findViewById(R.id.bt15);
        LinearLayout bt16 = (LinearLayout) findViewById(R.id.bt16);
        LinearLayout bt17 = (LinearLayout) findViewById(R.id.bt17);
        LinearLayout bt18 = (LinearLayout) findViewById(R.id.bt18);
        LinearLayout bt19 = (LinearLayout) findViewById(R.id.bt19);
        LinearLayout bt20 = (LinearLayout) findViewById(R.id.bt20);
        LinearLayout bt21 = (LinearLayout) findViewById(R.id.bt21);
        statusUserIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View cartoonface = findViewById(R.id.cartoonface);
                View goal = findViewById(R.id.goal);
                PercentFrameLayout bluebar = (PercentFrameLayout) findViewById(R.id.bluebar);
                PercentFrameLayout activity_main = (PercentFrameLayout) findViewById(R.id.activity_main);

            }
        });

        init();
        setStars(1,1);
        ButtonListener buttonListener = new ButtonListener();
        bt1.setOnClickListener(buttonListener);
        bt2.setOnClickListener(buttonListener);
        bt3.setOnClickListener(buttonListener);
        bt4.setOnClickListener(buttonListener);
        bt5.setOnClickListener(buttonListener);
        bt6.setOnClickListener(buttonListener);
        bt7.setOnClickListener(buttonListener);
        bt8.setOnClickListener(buttonListener);
        bt9.setOnClickListener(buttonListener);
        bt10.setOnClickListener(buttonListener);
        bt11.setOnClickListener(buttonListener);
        bt12.setOnClickListener(buttonListener);
        bt13.setOnClickListener(buttonListener);
        bt14.setOnClickListener(buttonListener);
        bt15.setOnClickListener(buttonListener);
        bt16.setOnClickListener(buttonListener);
        bt17.setOnClickListener(buttonListener);
        bt18.setOnClickListener(buttonListener);
        bt19.setOnClickListener(buttonListener);
        bt20.setOnClickListener(buttonListener);
        bt21.setOnClickListener(buttonListener);
    }
    class ButtonListener implements  View.OnClickListener{
        @Override
        public void onClick(View v) {
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

        final TranslateAnimation translateAnimationStart1 = new TranslateAnimation(0,+mScreenWidth*0.4983f,0,-mScreenHeight*0.04f);
        final TranslateAnimation translateAnimationStatusText1 = new TranslateAnimation(0,+mScreenWidth*0.4983f,0,-mScreenHeight*0.04f);
        final TranslateAnimation translateAnimationStatusText2 = new TranslateAnimation(0,+mScreenWidth*0.4983f,0,-mScreenHeight*0.04f);
        final TranslateAnimation translateAnimationUserportrait = new TranslateAnimation(0,0,0,+mScreenHeight*0.0716f);
        final TranslateAnimation translateAnimationUsername = new TranslateAnimation(0,+mScreenWidth*0.13f,0,+mScreenHeight*0.0233f);
        final TranslateAnimation translateAnimationStatusText6 = new TranslateAnimation(0,+mScreenWidth*0.2234f,0,0);
        final TranslateAnimation translateAnimationStatusUserIcon = new TranslateAnimation(0,+mScreenWidth*0.804f,0,0);
        final TranslateAnimation translateAnimationStatusText5 = new TranslateAnimation(0,+mScreenWidth*0.804f,0,0);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1500);

        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(1500);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimationStatusUserIcon);

        final AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setDuration(1500);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(translateAnimationStatusText5);

        translateAnimationStart1.setDuration(1500);
        translateAnimationStatusText1.setDuration(1500);
        translateAnimationStatusText2.setDuration(1500);
        translateAnimationUserportrait.setDuration(1500);
        translateAnimationUsername.setDuration(1500);
        translateAnimationStatusText6.setDuration(1500);
        translateAnimationStatusUserIcon.setDuration(1500);
        translateAnimationStatusText5.setDuration(1500);

        translateAnimationStart1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                start1.clearAnimation();
                int left = (int)(start1.getLeft()+mScreenWidth*0.4983f);
                int top = (int) (start1.getTop() - mScreenHeight*0.04f);
                int width = start1.getWidth();
                int height = start1.getHeight();
                start1.layout(left, top, left+width, top+height);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translateAnimationStatusText1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                starText1.clearAnimation();
                int left = (int)(starText1.getLeft()+mScreenWidth*0.4983f);
                int top = (int) (starText1.getTop() - mScreenHeight*0.04f);
                int width = starText1.getWidth();
                int height = starText1.getHeight();
                starText1.layout(left, top, left+width, top+height);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translateAnimationStatusText2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translateAnimationUserportrait.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                userportrait.clearAnimation();
                int left = userportrait.getLeft();
                int top = (int) (userportrait.getTop()+mScreenHeight*0.0716f);
                int width = userportrait.getWidth();
                int height = userportrait.getHeight();
                userportrait.layout(left, top, left+width, top+height);

                homeButton.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translateAnimationUsername.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                username.clearAnimation();
                int left = (int)(username.getLeft()+mScreenWidth*0.13f);
                int top = (int) (username.getTop()+mScreenHeight*0.0233f);
                int width = username.getWidth();
                int height = username.getHeight();
                username.layout(left, top, left+width, top+height);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translateAnimationStatusText6.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                statusText6.clearAnimation();
                int left = (int)(statusText6.getLeft()+mScreenWidth*0.2234f);
                int top = statusText6.getTop();
                int width = statusText6.getWidth();
                int height = statusText6.getHeight();
                statusText6.layout(left, top, left+width, top+height);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translateAnimationStatusUserIcon.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                statusUserIcon.clearAnimation();
                int left = (int)(statusUserIcon.getLeft()+mScreenWidth*0.804f);
                int top = statusUserIcon.getTop();
                int width = statusUserIcon.getWidth();
                int height = statusUserIcon.getHeight();
                statusUserIcon.layout(left, top, left+width, top+height);

                closeStatus.setVisibility(View.INVISIBLE);
                statusText1.setVisibility(View.INVISIBLE);
                statusText2.setVisibility(View.INVISIBLE);
                statusText4.setVisibility(View.INVISIBLE);
                statusText6.setVisibility(View.INVISIBLE);
                statusText5.setVisibility(View.INVISIBLE);
                statusBar2.setVisibility(View.INVISIBLE);
                statusUserIcon.setVisibility(View.INVISIBLE);

                start1.startAnimation(translateAnimationStart1);
                starText1.startAnimation(translateAnimationStatusText1);
                userportrait.startAnimation(translateAnimationUserportrait);
                username.startAnimation(translateAnimationUsername);
                statusText6.startAnimation(translateAnimationStatusText6);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translateAnimationStatusText5.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                statusText5.clearAnimation();
                int left = (int)(statusText5.getLeft()+mScreenWidth*0.804f);
                int top = statusText5.getTop();
                int width = statusText5.getWidth();
                int height = statusText5.getHeight();
                statusText5.layout(left, top, left+width, top+height);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        closeStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                statusUserIcon.startAnimation(animationSet);
                statusText5.startAnimation(animationSet2);
                userportrait.setClickable(true);
                statusBar2.startAnimation(alphaAnimation);

            }
        });
    }

    private void changeTheme(int sex){  // 用于根据性别改变主题的函数

    }

    private PopupWindow mPopWindow;
    private void showPopupWindow() {
        iconIndex = 1;
        DisplayMetrics dm = new DisplayMetrics();
        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        final int mScreenWidth  = dm.widthPixels;
        final int mScreenHeight = dm.heightPixels;
        //设置contentView
        View contentView = LayoutInflater.from(MainActivity.this).inflate(R.layout.popup_window, null);
        mPopWindow = new PopupWindow(contentView, (int)(mScreenWidth*0.7), (int)(mScreenHeight*0.5), true);
        mPopWindow.setContentView(contentView);
        mPopWindow.setFocusable(true);
        mPopWindow.setBackgroundDrawable(new PaintDrawable(R.drawable.yuanjiao));
        mPopWindow.setOutsideTouchable(true);
        final View icon = contentView.findViewById(R.id.icon);
        //设置各个控件的点击响应
//        TextView tv1 = (TextView)contentView.findViewById(R.id.pop_computer);
//        tv1.setOnClickListener(this);
        final Button leftbt = (Button) contentView.findViewById(R.id.leftBt);
        final Button rightbt = (Button) contentView.findViewById(R.id.rightBt);
        View popBar = contentView.findViewById(R.id.popBar);
        if(currentUser.getSex() == 1){
            popBar.setBackground(getResources().getDrawable(R.drawable.rewardbackground_boy));
            leftbt.setBackground(getResources().getDrawable(R.drawable.calendar_arrowleft_boy));
            rightbt.setBackground(getResources().getDrawable(R.drawable.calendar_arrowright_boy));
            icon.setBackground(getResources().getDrawable(R.drawable.sun));

        }
        else{
            popBar.setBackground(getResources().getDrawable(R.drawable.rewardbackground_girl));
            leftbt.setBackground(getResources().getDrawable(R.drawable.calendar_arrowleft_girl));
            rightbt.setBackground(getResources().getDrawable(R.drawable.calendar_arrowright_girl));
            icon.setBackground(getResources().getDrawable(R.drawable.sun2));

        }
        leftbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iconIndex == 2){
                    if(currentUser.getSex() == 1)
                        icon.setBackground(getResources().getDrawable(R.drawable.sun));
                    else
                        icon.setBackground(getResources().getDrawable(R.drawable.sun2));
                    iconIndex--;
                    leftbt.setEnabled(false);
                    leftbt.setVisibility(View.INVISIBLE);
                }
                else if(iconIndex == 3){
                    if(currentUser.getSex() == 1)
                        icon.setBackground(getResources().getDrawable(R.drawable.nightreward));
                    else
                        icon.setBackground(getResources().getDrawable(R.drawable.nightreward2));
                    iconIndex--;
                    rightbt.setEnabled(true);
                    rightbt.setVisibility(View.VISIBLE);
                }
            }
        });

        rightbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iconIndex == 1){
                    if(currentUser.getSex() == 1)
                        icon.setBackground(getResources().getDrawable(R.drawable.nightreward));
                    else
                        icon.setBackground(getResources().getDrawable(R.drawable.nightreward2));
                    iconIndex++;
                    leftbt.setEnabled(true);
                    leftbt.setVisibility(View.VISIBLE);
                }
                else if(iconIndex == 2){
                    if(currentUser.getSex() == 1)
                        icon.setBackground(getResources().getDrawable(R.drawable.bluetoothreward));
                    else
                        icon.setBackground(getResources().getDrawable(R.drawable.bluetoothreward2));
                    iconIndex++;
                    rightbt.setEnabled(false);
                    rightbt.setVisibility(View.INVISIBLE);
                }
            }
        });

        //显示PopupWindow
        View rootview = LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_main, null);
        mPopWindow.showAtLocation(rootview, Gravity.CENTER, 0, 0);

    }

    private void setStars(int btnNum, int starNum){
        ImageView[] images = {(ImageView)findViewById(R.id.image1), (ImageView)findViewById(R.id.image2),
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
        TextView[] textViews = {(TextView) findViewById(R.id.text1), (TextView) findViewById(R.id.text2),
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
            int number = (int)(Math.random()*10+1);
            sum += number;
            images[i-1].setImageResource(R.drawable.star);
            textViews[i-1].setText(Integer.toString(number));
        }
        TextView text = (TextView)findViewById(R.id.starText1);
        text.setText(Integer.toString(sum));
    }

}

