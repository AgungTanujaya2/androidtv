package com.example.androidtv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class AgustusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agustus);
        VideoView videoView = findViewById(R.id.videoKalender);
        String videoPath = "android.resource://"+getPackageName()+"/"+R.raw.videoupb;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        TextView textView = findViewById(R.id.btnBack);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackground(getDrawable(R.drawable.custum_button));
                Intent intent = new Intent(AgustusActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}