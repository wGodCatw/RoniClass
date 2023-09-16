package com.example.roniclass;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ex2 extends AppCompatActivity {
    String sign = "plus";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2);


        EditText firstNum = findViewById(R.id.FirstNum);
        EditText secondNum = findViewById(R.id.SecondNum);

        Button solve = findViewById(R.id.solve);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button multiply = findViewById(R.id.multiply);
        Button divide = findViewById(R.id.divide);

        TextView result = findViewById(R.id.resultShow);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "plus";
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "minus";
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "multiply";
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "divide";
            }
        });


        solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (sign) {
                    case "plus":
                        result.setText(String.valueOf(Double.parseDouble(firstNum.getText().toString()) + Double.parseDouble(secondNum.getText().toString())));
                        break;
                    case "minus":
                        result.setText(String.valueOf(Double.parseDouble(firstNum.getText().toString()) - Double.parseDouble(secondNum.getText().toString())));
                        break;
                    case "multiply":
                        result.setText(String.valueOf(Double.parseDouble(firstNum.getText().toString()) * Double.parseDouble(secondNum.getText().toString())));
                        break;
                    case "divide":
                        result.setText(String.valueOf(Double.parseDouble(firstNum.getText().toString()) / Double.parseDouble(secondNum.getText().toString())));
                        break;
                }
            }

        });

    }
}