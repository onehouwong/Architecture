package com.example.onehouwong.architecture.view;

import android.content.Context;
import android.media.Image;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.onehouwong.architecture.R;
import com.zhy.android.percent.support.PercentFrameLayout;

/**
 * Created by OneHouWong on 2016/12/1.
 */

public class WindowView extends PercentFrameLayout {
    private int index = 1;
    public WindowView(Context context, AttributeSet attrs){  super(context, attrs);}

    public void setLeftButtonListeners(View.OnClickListener onClickListener){
        findViewById(R.id.leftBt).setOnClickListener(onClickListener);
    }

    public void setRightButtonListeners(View.OnClickListener onClickListener){
        findViewById(R.id.rightBt).setOnClickListener(onClickListener);
    }

    public TextView getStarNum() {return ((TextView) this.findViewById(R.id.starNum));}
    public Button getLeftButton() {return ((Button) this.findViewById(R.id.leftBt));}
    public Button getRightButton() {return ((Button) this.findViewById(R.id.rightBt));}
    public View getIcon() {return (this.findViewById(R.id.icon));}
    public int getIndex(){  return index;   }
    public void setIndex(int num){  index = num;    }
}
