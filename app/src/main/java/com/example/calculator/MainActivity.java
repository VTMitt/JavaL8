package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstTextInput;
    private EditText secondTextInput;
    private TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTextInput = findViewById(R.id.firstNumber);
        secondTextInput = findViewById(R.id.secondNumber);
        answer = findViewById(R.id.ansField);

    }

    public void addition(View view){
    double addition = Double.parseDouble((firstTextInput.getText()).toString()) + Double.parseDouble((secondTextInput.getText()).toString());
    answer.setText(Double.toString(addition));
    }

    public void difference(View view){
        double difference = Double.parseDouble((firstTextInput.getText()).toString()) - Double.parseDouble((secondTextInput.getText()).toString());
        answer.setText(Double.toString(difference));
    }

    public void multiplication(View view){
        double multiplication = Double.parseDouble((firstTextInput.getText()).toString()) * Double.parseDouble((secondTextInput.getText()).toString());
        answer.setText(Double.toString(multiplication));
    }

    public void division(View view){
        double division = Double.parseDouble((firstTextInput.getText()).toString()) / Double.parseDouble((secondTextInput.getText()).toString());
        answer.setText(Double.toString(division));
    }



}