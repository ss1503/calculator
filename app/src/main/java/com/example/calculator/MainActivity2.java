package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public TextView answerTv;
    public Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent gi = getIntent();

        double answer = 0;

        answerTv = (TextView) findViewById(R.id.finalAnswerBtn);
        backBtn = (Button) findViewById(R.id.backBtn);

        answer = gi.getDoubleExtra("answer", -1000);
        answerTv.setText("Final Result: " + Double.toString(answer));
    }


    public void calc(View view) {
        finish();
    }
}