package com.example.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    private int points;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        points = 0;
        //used as a constructor
        //generally used to set up initial values

        //wiring widgets links the xml to the java
        buttonClickerButton = findViewById(R.id.button_main_clicker);
        textViewScore = findViewById(R.id.textview_main_score);
        constraintLayout = findViewById(R.id.constraint_layout_main);

    }

    public void onClickerClicked(View view) {
        Toast.makeText(this, "*click*", Toast.LENGTH_LONG).show();
        points++;
        //show the value
        textViewScore.setText("Clicked: " + points);

        changeBackgroundColor();

    }

    private void changeBackgroundColor() {
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        int color = Color.rgb(r, g, b);
        int inverseColor = Color.rgb(255-r,255-g,255-b);
        constraintLayout.setBackgroundColor(color);
        textViewScore.setTextColor(inverseColor);

    }
}
