package com.example.onehouwong.architecture.view;

import android.content.Context;
import android.content.DialogInterface;
import android.media.Image;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.onehouwong.architecture.R;
import com.zhy.android.percent.support.PercentFrameLayout;

import org.w3c.dom.Text;

/**
 * Created by OneHouWong on 2016/12/1.
 */

public class MainView extends PercentFrameLayout {
    public MainView(Context context, AttributeSet attrs){  super(context, attrs);}

    public void setButtonListeners(LinearLayout button, OnClickListener onClickListener){  //设置日历按钮的
            button.setOnClickListener(onClickListener);
    }

    public void setUserPortraitListener(OnClickListener onClickListener){
        findViewById(R.id.userportrait).setOnClickListener(onClickListener);
    }

    public LinearLayout[] getCalendarButton() {
        LinearLayout[] buttons;
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
        return buttons;
    }

    public TextView[] getTextViews(){
        TextView[] textViews = new TextView[21];
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
        return textViews;
    }

    public TextView getStarText(){  return (TextView)findViewById(R.id.starText1);}

    public Button getUserPortrait(){    return (Button)findViewById(R.id.userportrait);}

    public View getCartoonFace(){  return findViewById(R.id.cartoonface);}

    public View getGoal(){  return findViewById(R.id.goal);}

    public PercentFrameLayout getBlueBar(){   return (PercentFrameLayout) findViewById(R.id.bluebar);}

    public MainView getLayout(){    return this;    }

    public TextView getUserName(){  return (TextView)findViewById(R.id.username);}
}
