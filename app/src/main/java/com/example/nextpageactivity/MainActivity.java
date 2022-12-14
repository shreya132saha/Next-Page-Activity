package com.example.nextpageactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MyReceiver myReceiver = new MyReceiver();
    private Button button;
    private Button broadcast;
    private Button gridlayout;
    private Button pager;
    private Button sharedpref;
    private Button mediacam;
    private Button dencrypt;
    private Button notify;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        broadcast= (Button) findViewById(R.id.broadcast);
        gridlayout= (Button) findViewById(R.id.gridlayout);
        pager= (Button) findViewById(R.id.pager);
        sharedpref = (Button) findViewById(R.id.sharedpref);
        mediacam= (Button) findViewById(R.id.mediacam);
        dencrypt=(Button) findViewById(R.id.dencrypt);
        notify=(Button) findViewById(R.id.notify);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity2();
            }
        });
        broadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity3();
            }
        });
        gridlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity4();
            }
        });
        pager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity5();
            }
        });
        sharedpref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity6();
            }
        });

        mediacam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity7();
            }
        });
        dencrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity8();
            }
        });
        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity9();
            }
        });
    }
    public  void  openActivity2()
    {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public  void  openActivity3()
    {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public  void  openActivity4()
    {
        Intent intent = new Intent(this, GridLayout.class);
        startActivity(intent);
    }
    public  void  openActivity5()
    {
        Intent intent = new Intent(this, ViewPagerActivity.class);
        startActivity(intent);
    }
    public  void  openActivity6()
    {
        Intent intent = new Intent(this, Shared_Preference.class);
        startActivity(intent);
    }
    public  void  openActivity7()
    {
        Intent intent = new Intent(this, Media_Cam.class);
        startActivity(intent);
    }
    public  void  openActivity8()
    {
        Intent intent = new Intent(this, Encryption.class);
        startActivity(intent);
    }
    public  void  openActivity9()
    {
        Intent intent = new Intent(this, Notification.class);
        startActivity(intent);
    }

}