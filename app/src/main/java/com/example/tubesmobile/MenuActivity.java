package com.example.tubesmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {

    BottomNavigationView btmNavView;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btmNavView = findViewById(R.id.bottomNav);
        frameLayout = findViewById(R.id.frame_layout);

        btmNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HomeFragment()).commit();
                        return true;

                    case R.id.menu_makanan:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new MakananFragment()).commit();
                        return true;

                    case R.id.menu_minuman:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new MinumanFragment()).commit();
                        return true;

                    default:
                        return false;
                }
            }
        });

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HomeFragment()).commit();
            btmNavView.setSelectedItemId(R.id.menu_home);
        }
    }
}