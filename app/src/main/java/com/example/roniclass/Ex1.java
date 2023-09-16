package com.example.roniclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ex1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        EditText firstNumber = findViewById(R.id.firstNumber);
        EditText secondNumber = findViewById(R.id.secondNumber);
        Button solveButton = findViewById(R.id.solveButton);
        TextView result = findViewById(R.id.result);

        solveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double firstNum = Double.parseDouble(firstNumber.getText().toString());
                Double secondNum = Double.parseDouble(secondNumber.getText().toString());
                result.setText(String.valueOf(firstNum + secondNum));
            }
        });
    }
}