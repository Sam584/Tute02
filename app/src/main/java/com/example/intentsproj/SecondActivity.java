package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final TextView Answer;
        EditText num1, num2;
        Button addtion, subtraction, multiplication, division;

        @SuppressLint("SetText")
        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);


            double a = 0;
            double b = 0;

            Intent i = getIntent();
            if (i != null) {
                String value1 = i.getStringExtra("first");
                String value2 = i.getStringExtra("second");

                if (!"".equals(value1) && !"".equals(value2)) {
                    a = Double.parseDouble(value1);
                    b = Double.parseDouble(value2);
                }
            }
            num1 = (EditText) findViewById(R.id.editText);
            num2 = (EditText) findViewById(R.id.editText2);
            addtion = (Button) findViewById(R.id.button2);
            subtraction = (Button) findViewById(R.id.button3);
            multiplication = (Button) findViewById(R.id.button4);
            division = (Button) findViewById(R.id.button5);
            Answer = (TextView) findViewById(R.id.textView6);

            num1.setText(Double.toString(a));
            num2.setText(Double.toString(b));

            Addtion(a, b);
            Subtraction(a, b);
            Multiplication(a, b);
            Division(a, b);

        }

        public void Addtion ( final double a, final double b ){
            addtion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String answer = Double.toString(a + b);
                    Answer.setText(answer);
                }
            });
        }

        public void Subtraction ( final double a, final double b){
            subtraction.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String answer = Double.toString(a - b);
                    Answer.setText(answer);
                }
            });
        }

        public void Multipcation ( final double a, final double b){
            multiplication.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String answer = Double.toString(a * b);
                    Answer.setText(answer);
                }
            });
        }

        public void Division ( final double a, final double b){
            division.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String answer = Double.toString(a / b);
                    Answer.setText(answer);

                }

            });
        }
    }
}