package com.example.onehouwong.architecture.controller;

import android.view.View;
import android.widget.Button;

import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.view.WindowView;

/**
 * Created by OneHouWong on 2016/12/1.
 */

public class LeftButtonController  implements View.OnClickListener {
    private WindowView windowView;

    public LeftButtonController(WindowView windowView){
        this.windowView = windowView;
    }

    @Override
    public void onClick(View v){
        if(windowView.getIndex() == 2){
            windowView.getIcon().setBackground(getResources().getDrawable(R.drawable.hamburger));
            windowView.setIndex(1);
            Button leftButton = windowView.getLeftButton();
            leftButton.setEnabled(false);
            leftButton.setVisibility(View.INVISIBLE);
        }
        else if(windowView.getIndex() == 3){
            windowView.getIcon().setBackground(getResources().getDrawable(R.drawable.chocolate));
            windowView.setIndex(2);
            Button rightButton = windowView.getRightButton();
            rightButton.setEnabled(true);
            rightButton.setVisibility(View.VISIBLE);
        }
    }
}