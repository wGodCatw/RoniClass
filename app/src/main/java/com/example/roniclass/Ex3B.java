package com.example.roniclass;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex3B extends AppCompatActivity {
    int total = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3_b);

        Bundle bundle = getIntent().getExtras();
        ImageView imageView = findViewById(R.id.imageView);

        assert bundle != null;
        total = bundle.getInt("Score");

        TextView score = findViewById(R.id.score);

        if (total == 3) {
            score.setText("Your score: 100!");
            imageView.setColorFilter(Color.argb(255, 0, 255, 0));
        } else if (total == 2) {
            score.setText("Your score: 66");
            imageView.setColorFilter(Color.argb(255, 0, 0, 255));
        } else if (total == 1) {
            score.setText("Your score: meh 33");
            imageView.setColorFilter(Color.argb(255, 255, 0, 0));
        } else {
            score.setText("Bruhh 0 loser");
            imageView.setColorFilter(Color.argb(255, 0, 0, 0));
        }

    }
}