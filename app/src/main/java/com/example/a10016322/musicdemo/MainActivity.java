package com.example.a10016322.musicdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;
    TextView textView;
    Button playButton, pauseButton, stopButton, restartButton, timeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player = MediaPlayer.create(this, R.raw.ring);
        playButton = (Button)(findViewById(R.id.play_id));
        pauseButton = (Button)(findViewById(R.id.pause_id));
        stopButton = (Button)(findViewById(R.id.stop_id));
        restartButton = (Button)(findViewById(R.id.restart_id));
        timeButton = (Button)(findViewById(R.id.time_id));
        textView = (TextView)(findViewById(R.id.textView));


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.start();
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.stop();
                try
                {
                    player.prepare();
                }
                catch (Exception e){}
            }
        });

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.stop();
                try
                {
                    player.prepare();
                }
                catch (Exception e){}
                player.start();
            }
        });

        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.getCurrentPosition();
            }
        });

    }
}
