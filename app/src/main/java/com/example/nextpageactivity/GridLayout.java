package com.example.nextpageactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GridLayout extends AppCompatActivity {

    private Button sqlite;
    private Button getretro;
    private Button postretro;
    private Button recycler;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        sqlite = (Button) findViewById(R.id.sqlite);
        getretro = (Button) findViewById(R.id.getretro);
        postretro = (Button) findViewById(R.id.postretro);
        recycler = (Button) findViewById(R.id.recycler);

        sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity1();
            }
        });
        getretro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity2();
            }
        });
        postretro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity3();
            }
        });
        recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity4();
            }
        });


    }
    public  void  openActivity1()
    {
        Intent intent = new Intent(this, SQLite_Demo.class);
        startActivity(intent);
    }
    public  void  openActivity2()
    {
        Intent intent = new Intent(this, Get_Retrofit.class);
        startActivity(intent);
    }
    public  void  openActivity3()
    {
        Intent intent = new Intent(this, RetroPost_main.class);
        startActivity(intent);
    }
    public  void  openActivity4()
    {
        Intent intent = new Intent(this, Recycler_Main.class);
        startActivity(intent);
    }


}
