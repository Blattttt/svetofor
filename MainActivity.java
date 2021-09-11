package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int red = Color.RED;
    int green = Color.GREEN;
    int yellow = Color.YELLOW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickOne(View view) {
        View ground = findViewById(R.id.ground);
        ground.setBackgroundColor(red);

    }

    public void clickTwo(View view){
        View ground = findViewById(R.id.ground);
        ground.setBackgroundColor(yellow);

    }

    public void clickThree(View view){
        View ground = findViewById(R.id.ground);
        ground.setBackgroundColor(green);

    }
}