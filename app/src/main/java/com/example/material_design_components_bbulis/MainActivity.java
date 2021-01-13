package com.example.material_design_components_bbulis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bottomAppBar = findViewById(R.id.bottom_app_bar);
        this.floatingActionButton = findViewById(R.id.floating_action_button);

    }
}