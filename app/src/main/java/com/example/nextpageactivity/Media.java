package com.example.nextpageactivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


    public class Media extends AppCompatActivity {
        MediaPlayer mediaPlayer;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media);
        }
        public void play(View v)
        {

            if (mediaPlayer==null)
            {
                mediaPlayer=MediaPlayer.create(this, R.raw.music);
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        StopPlayer();
                    }
                });
            }
            mediaPlayer.start();
        }

        public void pause(View v)
        {
            if(mediaPlayer!=null)
            {
                mediaPlayer.pause();
            }

        }
        public void stop(View v)
        {
            StopPlayer();
        }
        private  void StopPlayer()
        {
            if(mediaPlayer!=null)
            {
                mediaPlayer.release();;
                mediaPlayer = null;
                Toast.makeText(this, "MediaPlayer released", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        protected void onStop() {
            super.onStop();
            StopPlayer();
        }
    }
