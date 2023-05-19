package com.example.androidtv;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends FragmentActivity implements NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;
    private TextView tvTeam;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .add(R.id.container_main, new KalenderFragment())
                .commit();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_kalender:
                getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new KalenderFragment()).commit();
                break;
            }
        switch (item.getItemId()) {
            case R.id.nav_team:
                Intent intent = new Intent(MainActivity.this, TeamDevelopmetUPB2.class);
                startActivity(intent);
                break;
        }
        switch (item.getItemId()) {
            case R.id.nav_upb:
                Intent intent = new Intent(MainActivity.this, VideoUpb.class);
                startActivity(intent);
                break;
        }
        switch (item.getItemId()) {
            case R.id.nav_home:
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                break;
        }

        
        return true;
    }
}