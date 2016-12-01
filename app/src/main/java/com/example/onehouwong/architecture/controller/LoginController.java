package com.example.onehouwong.architecture.controller;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.activity.LoginControllerListener;
import com.example.onehouwong.architecture.activity.implementation.LoginActivity;
import com.example.onehouwong.architecture.activity.implementation.MainActivity;
import com.example.onehouwong.architecture.constant.ErrorConstant;
import com.example.onehouwong.architecture.view.LoginView;

/**
 * Created by OneHouWong on 2016/12/1.
 */

public class LoginController implements View.OnClickListener {

    private LoginView loginView;
    private LoginControllerListener listener;

    public LoginController(LoginView loginView, LoginControllerListener listener){
        this.loginView = loginView;
        this.listener = listener;
    }

    @Override
    public void onClick(View v){
        String userName = loginView.getUserName();
        String password = loginView.getPassword();
        login(userName, password);
    }

    private void login(String userName, String password) {
        if(userName.equals("admin") && password.equals("123456")){
            listener.onLoginSuccess();
        }
        else{
            if(loginView.getUserName().isEmpty())
                loginView.setUserNameError(ErrorConstant.ERROR_EMPTY_USERNAME);
            if(loginView.getPassword().isEmpty())
                loginView.setPasswordError(ErrorConstant.ERROR_EMPTY_PASSWORD);
        }


    }
}
