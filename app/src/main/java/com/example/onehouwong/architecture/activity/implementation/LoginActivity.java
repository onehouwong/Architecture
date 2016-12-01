package com.example.onehouwong.architecture.activity.implementation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.onehouwong.architecture.R;
import com.example.onehouwong.architecture.activity.LoginControllerListener;
import com.example.onehouwong.architecture.controller.LoginController;
import com.example.onehouwong.architecture.view.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginControllerListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginView loginView = (LoginView)this.findViewById(R.id.LoginLayout);
        LoginController loginController = new LoginController(loginView, this);
        loginView.setLoginListeners(loginController);
    }

    @Override
    public void onLoginSuccess(){
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
        finish();
    }

}
