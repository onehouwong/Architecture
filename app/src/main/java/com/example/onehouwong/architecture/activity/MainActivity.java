package com.example.onehouwong.architecture.activity;

import android.graphics.drawable.PaintDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.*;

import com.example.onehouwong.architecture.R;
import com.zhy.android.percent.support.PercentFrameLayout;

public class MainActivity extends AppCompatActivity{

    int sex = 1;
    int iconIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics dm = new DisplayMetrics();
        MainActivity.this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        final int mScreenWidth  = dm.widthPixels;
        final int mScreenHeight = dm.heightPixels;

        final Button start1 = (Button) findViewById(R.id.star1);
        final Button start2 = (Button) findViewById(R.id.star2);
        final Button userportrait = (Button) findViewById(R.id.userportrait);
        final Button homeButton = (Button) findViewById(R.id.homeButton);
        final Button closeStatus = (Button) findViewById(R.id.closeStatus);
        final Button statusUserIcon = (Button) findViewById(R.id.statusUserIcon);
        final TextView starText1 = (TextView) findViewById(R.id.starText1);
        final TextView starText2 = (TextView) findViewById(R.id.starText2);
        final TextView username = (TextView) findViewById(R.id.username);
        final TextView statusText1 = (TextView) findViewById(R.id.statusText1);
        final TextView statusText2 = (TextView) findViewById(R.id.statusText2);
        final TextView statusText3 = (TextView) findViewById(R.id.statusText3);
        final TextView statusText4 = (TextView) findViewById(R.id.statusText4);
        final TextView statusText5 = (TextView) findViewById(R.id.statusText5);
        final TextView statusText6 = (TextView) findViewById(R.id.statusText6);
        final View statusBar2 = findViewById(R.id.statusBar2);

        final TranslateAnimation translateAnimationStart1 = new TranslateAnimation(0,-mScreenWidth*0.4983f,0,mScreenHeight*0.04f);
        final TranslateAnimation translateAnimationStart2 = new TranslateAnimation(0,-mScreenWidth*0.4983f,0,mScreenHeight*0.04f);
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
        translateAnimationStart2.setDuration(1500);
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
                int left = (int)(start1.getLeft()-mScreenWidth*0.4983f);
                int top = (int) (start1.getTop() + mScreenHeight*0.04f);
                int width = start1.getWidth();
                int height = start1.getHeight();
                start1.layout(left, top, left+width, top+height);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        translateAnimationStart2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                start2.clearAnimation();
                int left = (int)(start2.getLeft()-mScreenWidth*0.4983f);
                int top = (int) (start2.getTop() + mScreenHeight*0.04f);
                int width = start2.getWidth();
                int height = start2.getHeight();
                start2.layout(left, top, left+width, top+height);
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
                int left = (int)(starText1.getLeft()-mScreenWidth*0.4983f);
                int top = (int) (starText1.getTop() + mScreenHeight*0.04f);
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
                starText2.clearAnimation();
                int left = (int)(starText2.getLeft()-mScreenWidth*0.4983f);
                int top = (int) (starText2.getTop() + mScreenHeight*0.04f);
                int width = starText2.getWidth();
                int height = starText2.getHeight();
                starText2.layout(left, top, left+width, top+height);
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
                int top = (int) (userportrait.getTop()-mScreenHeight*0.0716f);
                int width = userportrait.getWidth();
                int height = userportrait.getHeight();
                userportrait.layout(left, top, left+width, top+height);

                closeStatus.setVisibility(View.VISIBLE);
                statusText1.setVisibility(View.VISIBLE);
                statusText2.setVisibility(View.VISIBLE);
                statusText3.setVisibility(View.VISIBLE);
                statusText4.setVisibility(View.VISIBLE);
                statusText6.setVisibility(View.VISIBLE);
                statusBar2.setVisibility(View.VISIBLE);
                statusUserIcon.setVisibility(View.VISIBLE);
                statusText5.setVisibility(View.VISIBLE);

                statusUserIcon.startAnimation(translateAnimationStatusUserIcon);
                statusText5.startAnimation(translateAnimationStatusText5);
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
                int left = (int)(username.getLeft()-mScreenWidth*0.13f);
                int top = (int) (username.getTop()-mScreenHeight*0.0233f);
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
                int left = (int)(statusText6.getLeft()-mScreenWidth*0.2234f);
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
                int left = (int)(statusUserIcon.getLeft()-mScreenWidth*0.804f);
                int top = statusUserIcon.getTop();
                int width = statusUserIcon.getWidth();
                int height = statusUserIcon.getHeight();
                statusUserIcon.layout(left, top, left+width, top+height);
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
                int left = (int)(statusText5.getLeft()-mScreenWidth*0.804f);
                int top = statusText5.getTop();
                int width = statusText5.getWidth();
                int height = statusText5.getHeight();
                statusText5.layout(left, top, left+width, top+height);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        userportrait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userportrait.setClickable(false);
                homeButton.setVisibility(View.INVISIBLE);

                start1.startAnimation(translateAnimationStart1);
                start2.startAnimation(translateAnimationStart2);
                starText1.startAnimation(translateAnimationStatusText1);
                starText2.startAnimation(translateAnimationStatusText2);
                userportrait.startAnimation(translateAnimationUserportrait);
                username.startAnimation(translateAnimationUsername);
                statusText6.startAnimation(translateAnimationStatusText6);
                statusBar2.startAnimation(alphaAnimation);

            }
        });
        final Button bt1 = (Button) findViewById(R.id.bt1);
        final Button bt2 = (Button) findViewById(R.id.bt2);
        final Button bt3 = (Button) findViewById(R.id.bt3);
        final Button bt4 = (Button) findViewById(R.id.bt4);
        final Button bt5 = (Button) findViewById(R.id.bt5);
        final Button bt6 = (Button) findViewById(R.id.bt6);
        final Button bt7 = (Button) findViewById(R.id.bt7);
        final Button bt8 = (Button) findViewById(R.id.bt8);
        final Button bt9 = (Button) findViewById(R.id.bt9);
        final Button bt10 = (Button) findViewById(R.id.bt10);
        final Button bt11 = (Button) findViewById(R.id.bt11);
        final Button bt12 = (Button) findViewById(R.id.bt12);
        final Button bt13 = (Button) findViewById(R.id.bt13);
        final Button bt14 = (Button) findViewById(R.id.bt14);
        final Button bt15 = (Button) findViewById(R.id.bt15);
        final Button bt16 = (Button) findViewById(R.id.bt16);
        final Button bt17 = (Button) findViewById(R.id.bt17);
        final Button bt18 = (Button) findViewById(R.id.bt18);
        final Button bt19 = (Button) findViewById(R.id.bt19);
        final Button bt20 = (Button) findViewById(R.id.bt20);
        final Button bt21 = (Button) findViewById(R.id.bt21);
        statusUserIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View cartoonface = findViewById(R.id.cartoonface);
                View goal = findViewById(R.id.goal);
                PercentFrameLayout bluebar = (PercentFrameLayout) findViewById(R.id.bluebar);
                PercentFrameLayout activity_main = (PercentFrameLayout) findViewById(R.id.activity_main);


                if(sex == 1){
                    sex++;
                    userportrait.setBackground(getResources().getDrawable(R.drawable.head2));
                    cartoonface.setBackground(getResources().getDrawable(R.drawable.face2));
                    homeButton.setBackground(getResources().getDrawable(R.drawable.homebutton2));
                    goal.setBackground(getResources().getDrawable(R.drawable.goal2));
                    bluebar.setBackground(getResources().getDrawable(R.color.colorAccent));
                    statusBar2.setBackground(getResources().getDrawable(R.color.colorAccent));
                    activity_main.setBackground(getResources().getDrawable(R.drawable.homebackgournd2));
                    bt1.setBackground(getResources().getDrawable(R.drawable.button_girl_1));
                    bt2.setBackground(getResources().getDrawable(R.drawable.button_girl_1));
                    bt3.setBackground(getResources().getDrawable(R.drawable.button_girl_1));
                    bt4.setBackground(getResources().getDrawable(R.drawable.button_girl_1));
                    bt5.setBackground(getResources().getDrawable(R.drawable.button_girl_1));
                    bt6.setBackground(getResources().getDrawable(R.drawable.button_girl_1));
                    bt7.setBackground(getResources().getDrawable(R.drawable.button_girl_1));
                    bt8.setBackground(getResources().getDrawable(R.drawable.button_girl_2));
                    bt9.setBackground(getResources().getDrawable(R.drawable.button_girl_2));
                    bt10.setBackground(getResources().getDrawable(R.drawable.button_girl_2));
                    bt11.setBackground(getResources().getDrawable(R.drawable.button_girl_2));
                    bt12.setBackground(getResources().getDrawable(R.drawable.button_girl_2));
                    bt13.setBackground(getResources().getDrawable(R.drawable.button_girl_2));
                    bt14.setBackground(getResources().getDrawable(R.drawable.button_girl_2));
                    bt15.setBackground(getResources().getDrawable(R.drawable.button_girl_3));
                    bt16.setBackground(getResources().getDrawable(R.drawable.button_girl_3));
                    bt17.setBackground(getResources().getDrawable(R.drawable.button_girl_3));
                    bt18.setBackground(getResources().getDrawable(R.drawable.button_girl_3));
                    bt19.setBackground(getResources().getDrawable(R.drawable.button_girl_3));
                    bt20.setBackground(getResources().getDrawable(R.drawable.button_girl_3));
                    bt21.setBackground(getResources().getDrawable(R.drawable.button_girl_3));


                }
                else{
                    sex--;
                    userportrait.setBackground(getResources().getDrawable(R.drawable.head1));
                    cartoonface.setBackground(getResources().getDrawable(R.drawable.face1));
                    homeButton.setBackground(getResources().getDrawable(R.drawable.homebutton));
                    goal.setBackground(getResources().getDrawable(R.drawable.goal));
                    bluebar.setBackground(getResources().getDrawable(R.color.lakeBlue));
                    statusBar2.setBackground(getResources().getDrawable(R.color.lakeBlue));
                    activity_main.setBackground(getResources().getDrawable(R.drawable.homebackgournd));
                    bt1.setBackground(getResources().getDrawable(R.drawable.rectround2));
                    bt2.setBackground(getResources().getDrawable(R.drawable.rectround2));
                    bt3.setBackground(getResources().getDrawable(R.drawable.rectround2));
                    bt4.setBackground(getResources().getDrawable(R.drawable.rectround2));
                    bt5.setBackground(getResources().getDrawable(R.drawable.rectround2));
                    bt6.setBackground(getResources().getDrawable(R.drawable.rectround2));
                    bt7.setBackground(getResources().getDrawable(R.drawable.rectround2));
                    bt8.setBackground(getResources().getDrawable(R.drawable.roundrect3));
                    bt9.setBackground(getResources().getDrawable(R.drawable.roundrect3));
                    bt10.setBackground(getResources().getDrawable(R.drawable.roundrect3));
                    bt11.setBackground(getResources().getDrawable(R.drawable.roundrect3));
                    bt12.setBackground(getResources().getDrawable(R.drawable.roundrect3));
                    bt13.setBackground(getResources().getDrawable(R.drawable.roundrect3));
                    bt14.setBackground(getResources().getDrawable(R.drawable.roundrect3));
                    bt15.setBackground(getResources().getDrawable(R.drawable.roundrect));
                    bt16.setBackground(getResources().getDrawable(R.drawable.roundrect));
                    bt17.setBackground(getResources().getDrawable(R.drawable.roundrect));
                    bt18.setBackground(getResources().getDrawable(R.drawable.roundrect));
                    bt19.setBackground(getResources().getDrawable(R.drawable.roundrect));
                    bt20.setBackground(getResources().getDrawable(R.drawable.roundrect));
                    bt21.setBackground(getResources().getDrawable(R.drawable.roundrect));
                }
            }
        });

        init();

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
        final Button start2 = (Button) findViewById(R.id.star2);
        final Button userportrait = (Button) findViewById(R.id.userportrait);
        final Button homeButton = (Button) findViewById(R.id.homeButton);
        final Button closeStatus = (Button) findViewById(R.id.closeStatus);
        final Button statusUserIcon = (Button) findViewById(R.id.statusUserIcon);
        final TextView starText1 = (TextView) findViewById(R.id.starText1);
        final TextView starText2 = (TextView) findViewById(R.id.starText2);
        final TextView username = (TextView) findViewById(R.id.username);
        final TextView statusText1 = (TextView) findViewById(R.id.statusText1);
        final TextView statusText2 = (TextView) findViewById(R.id.statusText2);
        final TextView statusText3 = (TextView) findViewById(R.id.statusText3);
        final TextView statusText4 = (TextView) findViewById(R.id.statusText4);
        final TextView statusText5 = (TextView) findViewById(R.id.statusText5);
        final TextView statusText6 = (TextView) findViewById(R.id.statusText6);
        final View statusBar2 = findViewById(R.id.statusBar2);

        final TranslateAnimation translateAnimationStart1 = new TranslateAnimation(0,+mScreenWidth*0.4983f,0,-mScreenHeight*0.04f);
        final TranslateAnimation translateAnimationStart2 = new TranslateAnimation(0,+mScreenWidth*0.4983f,0,-mScreenHeight*0.04f);
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
        translateAnimationStart2.setDuration(1500);
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
        translateAnimationStart2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                start2.clearAnimation();
                int left = (int)(start2.getLeft()+mScreenWidth*0.4983f);
                int top = (int) (start2.getTop() - mScreenHeight*0.04f);
                int width = start2.getWidth();
                int height = start2.getHeight();
                start2.layout(left, top, left+width, top+height);
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
                starText2.clearAnimation();
                int left = (int)(starText2.getLeft()+mScreenWidth*0.4983f);
                int top = (int) (starText2.getTop() - mScreenHeight*0.04f);
                int width = starText2.getWidth();
                int height = starText2.getHeight();
                starText2.layout(left, top, left+width, top+height);
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
                statusText3.setVisibility(View.INVISIBLE);
                statusText4.setVisibility(View.INVISIBLE);
                statusText6.setVisibility(View.INVISIBLE);
                statusText5.setVisibility(View.INVISIBLE);
                statusBar2.setVisibility(View.INVISIBLE);
                statusUserIcon.setVisibility(View.INVISIBLE);

                start1.startAnimation(translateAnimationStart1);
                start2.startAnimation(translateAnimationStart2);
                starText1.startAnimation(translateAnimationStatusText1);
                starText2.startAnimation(translateAnimationStatusText2);
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
        if(sex == 1){
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
                    if(sex == 1)
                        icon.setBackground(getResources().getDrawable(R.drawable.sun));
                    else
                        icon.setBackground(getResources().getDrawable(R.drawable.sun2));
                    iconIndex--;
                    leftbt.setEnabled(false);
                    leftbt.setVisibility(View.INVISIBLE);
                }
                else if(iconIndex == 3){
                    if(sex == 1)
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
                    if(sex == 1)
                        icon.setBackground(getResources().getDrawable(R.drawable.nightreward));
                    else
                        icon.setBackground(getResources().getDrawable(R.drawable.nightreward2));
                    iconIndex++;
                    leftbt.setEnabled(true);
                    leftbt.setVisibility(View.VISIBLE);
                }
                else if(iconIndex == 2){
                    if(sex == 1)
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


}

