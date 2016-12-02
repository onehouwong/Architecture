package com.example.onehouwong.architecture.controller;

import android.view.View;
import android.widget.Button;

import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.view.WindowView;

/**
 * Created by OneHouWong on 2016/12/1.
 */

public class RightButtonController implements View.OnClickListener {
    private WindowView windowView;

    public RightButtonController(WindowView windowView){
        this.windowView = windowView;
    }

    @Override
    public void onClick(View v){
        if(windowView.getIndex() == 1){
            windowView.getIcon().setBackground(windowView.getResources().getDrawable(R.drawable.chocolate));
            windowView.setIndex(2);
            Button leftBtn = windowView.getLeftButton();
            leftBtn.setEnabled(true);
            leftBtn.setVisibility(View.VISIBLE);
        }
        else if(windowView.getIndex() == 2){
            windowView.getIcon().setBackground(windowView.getResources().getDrawable(R.drawable.cupcake));
            windowView.setIndex(3);
            Button rightBtn = windowView.getRightButton();
            rightBtn.setEnabled(false);
            rightBtn.setVisibility(View.INVISIBLE);
        }
    }
}
