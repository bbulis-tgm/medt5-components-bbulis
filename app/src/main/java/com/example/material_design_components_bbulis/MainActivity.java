package com.example.material_design_components_bbulis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    static BottomAppBar bottomAppBar;
    static FloatingActionButton floatingActionButton;
    TextView counterTextView;
    SwitchMaterial colorSwitch;

    public static int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        count = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomAppBar = findViewById(R.id.bottom_app_bar);
        floatingActionButton = findViewById(R.id.floating_action_button);
        this.counterTextView = findViewById(R.id.clicked_counter);
        this.colorSwitch = findViewById(R.id.color_switcher);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += 1;
            }
        });

        this.colorSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                System.out.println(b);
                if (b) {
                    
                } else {

                }
            }
        });

    }
}