package com.example.onehouwong.architecture.view;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.onehouwong.architecture.R;

/**
 * Created by OneHouWong on 2016/12/1.
 */

public class LoginView extends LinearLayout {
    public LoginView(Context context, AttributeSet attrs){  super(context, attrs);}

    public void setLoginListeners(OnClickListener onClickListener){
        findViewById(R.id.login_button).setOnClickListener(onClickListener);
    }

    public String getUserName() {return ((EditText) this.findViewById(R.id.input_id)).getText().toString();}
    public String getPassword() {return ((EditText) this.findViewById(R.id.input_password)).getText().toString();}

    public void setPasswordError(String error) {((EditText) this.findViewById(R.id.input_password)).setError(error);}
    public void setUserNameError(String error) {((EditText) this.findViewById(R.id.input_id)).setError(error);}
}
