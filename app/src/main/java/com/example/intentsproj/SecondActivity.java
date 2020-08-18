package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText etnumber1;
    EditText etnumber2;

    String number1;
    String number2;

    TextView lblsum;

    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etnumber1 = findViewById(R.id.etnumber1);
        etnumber2 = findViewById(R.id.etnumber2);
        lblsum = findViewById(R.id.lblsum);

        Intent intent = getIntent();

        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        etnumber1.setText(number1);
        etnumber2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);
    }
        public void add(View view){
            lblsum.setText(number1 + " + " + number2 + " = " + (n1+n2));

    }

    public void subtract(View view){
        lblsum.setText(number1 + " - " + number2 + " = " + (n1-n2));

    }

    public void multiply(View view){
        lblsum.setText(number1 + " x " + number2 + " = " + (n1*n2));

    }

    public void divide(View view){
        lblsum.setText(number1 + " / " + number2 + " = " + (n1/n2));

    }
}