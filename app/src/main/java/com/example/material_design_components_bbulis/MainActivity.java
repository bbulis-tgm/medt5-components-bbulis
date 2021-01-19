package com.example.material_design_components_bbulis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

/**
 * @author Benjamin Bulis
 */
public class MainActivity extends AppCompatActivity {

    static BottomAppBar bottomAppBar;
    static FloatingActionButton floatingActionButton;
    static Context context;
    TextView counterTextView;
    SwitchMaterial sizeSwitcher;

    public static int count;
    public static  boolean useToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        count = 0;
        useToast = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        bottomAppBar = findViewById(R.id.bottom_app_bar);
        floatingActionButton = findViewById(R.id.floating_action_button);
        this.counterTextView = findViewById(R.id.clicked_counter);
        this.sizeSwitcher = findViewById(R.id.color_switcher);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView counterView = (TextView) findViewById(R.id.clicked_counter);
                count += 1;
                counterTextView.setText(Integer.toString(count));
                counterView.invalidate();
                sendToast("Counter +1", context);
            }
        });

        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                TextView counterView = (TextView) findViewById(R.id.clicked_counter);

                if (item.getItemId() == R.id.menu_reset_option) {
                    count = 0;
                    counterTextView.setText(Integer.toString(count));
                    counterView.invalidate();
                    sendToast("Counter zurückgesetzt", context);
                } else if (item.getItemId() == R.id.menu_toast_option) {
                    useToast = !useToast;
                    if (useToast) {
                        item.setTitle(R.string.menu_toast_disable);
                    } else {
                        item.setTitle(R.string.menu_toast_enable);
                    }
                }
                return false;
            }
        });


        // Listener for size switcher
        this.sizeSwitcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                TextView counterView = (TextView) findViewById(R.id.clicked_counter);
                TextView counterLabel = (TextView) findViewById(R.id.clicked_counter_label);
                if (b) {
                    // change size to 30sp
                    counterView.setTextSize(30);
                    counterLabel.setTextSize(30);
                    sendToast("Schriftgröße: 30", context);
                } else {
                    // change size to 18sp
                    counterView.setTextSize(18);
                    counterLabel.setTextSize(18);
                    sendToast("Schriftgröße: 18", context);
                }
            }
        });

    }

    /**
     * methode uses for displaying toasts
     *
     * @param text
     * @param context
     */
    public static void sendToast(String text, Context context) {
        int duration = Toast.LENGTH_SHORT;
        if (useToast) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}