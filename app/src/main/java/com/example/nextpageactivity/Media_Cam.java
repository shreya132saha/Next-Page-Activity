package com.example.nextpageactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Media_Cam extends AppCompatActivity {
    private Button media;
    private  Button camera;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_cam);
        media = (Button) findViewById(R.id.media);
        camera = (Button) findViewById(R.id.camera);
        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity1();
            }
        });
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivity2();
            }
        });
    }
        public  void  openActivity1()
        {
            Intent intent = new Intent(this, Media.class);
            startActivity(intent);
        }
    public  void  openActivity2()
    {
        Intent intent = new Intent(this, Camera.class);
        startActivity(intent);
    }
}
