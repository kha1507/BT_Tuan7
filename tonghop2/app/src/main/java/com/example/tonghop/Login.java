package com.example.tonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button login;
    Button ql;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        login = (Button) findViewById(R.id.bt_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListMusic();
            }
        });
        //cop hết đoạn ni,thay id butoon
        ql = (Button) findViewById(R.id.bt_ql_sup);
        ql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();//gọi open
            }
        });




    }

    public void openListMusic() {
        Intent it=new Intent(Login.this,ListMusic.class);
        startActivity(it);
    }

    //ở đây thay "Login" thành trang đang đứng,""Singup" thành trang muốn tới
    //muốn tớ trang mô thì đặt openTrangMuôntới
    public void openSignup() {
        Intent it=new Intent(Login.this,SignUp.class);
        startActivity(it);
    }


}
