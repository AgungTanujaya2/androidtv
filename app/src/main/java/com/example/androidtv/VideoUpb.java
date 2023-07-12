package com.example.androidtv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoUpb extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_upb);

        VideoView videoView = findViewById(R.id.video);

        String videoUrl ="https://firebasestorage.googleapis.com/v0/b/android-tv-d131f.appspot.com/o/videoupb.mp4?alt=media&token=79bbed32-da48-4a63-945d-31d37a5247d9";

        Uri videoUri = Uri.parse(videoUrl);
        videoView.setVideoURI(videoUri);

        MediaController controller = new MediaController(this);
        controller.setAnchorView(videoView);
        videoView.setMediaController(controller);

        videoView.start();

        String videoPath = "android.resource://"+getPackageName()+"/"+R.raw.videoupb;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController1 = new MediaController(this);

        TextView textView = findViewById(R.id.btnBack);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackground(getDrawable(R.drawable.custum_button));
                Intent intent = new Intent(VideoUpb.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}