package com.example.material_design_components_bbulis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;
    FloatingActionButton floatingActionButton;
    TextView counterTextView;

    public static int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        count = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bottomAppBar = findViewById(R.id.bottom_app_bar);
        this.floatingActionButton = findViewById(R.id.floating_action_button);
        this.counterTextView = findViewById(R.id.clicked_counter);

        this.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += 1;
            }
        });

    }
}