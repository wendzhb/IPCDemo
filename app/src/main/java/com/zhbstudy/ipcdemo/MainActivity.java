package com.zhbstudy.ipcdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
/*
* 服务端
* */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //启动一个服务，等待a应用过来连接
        startService(new Intent(this, MessageService.class));
    }


}
