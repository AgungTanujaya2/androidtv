package com.example.androidtv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TeamDevelopmetUPB2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_developmet_upb2);

        TextView textView = findViewById(R.id.btnBack);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackground(getDrawable(R.drawable.custum_button));
                Intent intent = new Intent(TeamDevelopmetUPB2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}